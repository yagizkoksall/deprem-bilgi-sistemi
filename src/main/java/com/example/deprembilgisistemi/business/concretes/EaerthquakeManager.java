package com.example.deprembilgisistemi.business.concretes;

import com.example.deprembilgisistemi.business.abstracts.EarthquakeService;
import com.example.deprembilgisistemi.business.dto.responses.get.GetAllEarthquakesResponse;
import com.example.deprembilgisistemi.entities.eq;
import com.example.deprembilgisistemi.repository.EarthquakeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EaerthquakeManager implements EarthquakeService {
    private final EarthquakeRepository repository;
    private final ModelMapper mapper;

    @Override
    @Cacheable(value = "earthquake_list")
    public List<GetAllEarthquakesResponse> getAll() {
        List<eq> eqs = repository.findAll();
        List<GetAllEarthquakesResponse> response = eqs
                .stream()
                .map(eq -> mapper.map(eq, GetAllEarthquakesResponse.class)).toList();
        return response;
    }

    @Override
    @Cacheable(value = "earthquake_list1")
    public List<GetAllEarthquakesResponse> getAllByLocation(String city) {
        List<eq> eqs = repository.findAllByCityIsLike(city);
        List<GetAllEarthquakesResponse> response = eqs
                .stream()
                .map(eq -> mapper.map(eq, GetAllEarthquakesResponse.class)).toList();
        return response;
    }

}
