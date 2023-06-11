package com.example.deprembilgisistemi.business.abstracts;


import com.example.deprembilgisistemi.business.dto.responses.get.GetAllEarthquakesResponse;

import java.util.List;

public interface EarthquakeService {

    List<GetAllEarthquakesResponse> getAll();
    List<GetAllEarthquakesResponse> getAllByLocation(String city);
}
