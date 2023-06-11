package com.example.deprembilgisistemi.api.controller;

import com.example.deprembilgisistemi.business.abstracts.EarthquakeService;
import com.example.deprembilgisistemi.business.dto.responses.get.GetAllEarthquakesResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/earthquake")
public class EarthquakesController {
    private final EarthquakeService service;

    @GetMapping
    public List<GetAllEarthquakesResponse> getAll(){

        return service.getAll();
    }

    @GetMapping("/location")
    public List<GetAllEarthquakesResponse> getAllByLocation(@RequestParam String city){


        return service.getAllByLocation(city);
    }

}
