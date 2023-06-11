package com.example.deprembilgisistemi.business.dto.responses.get;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetAllEarthquakesResponse {
    private String date;
    private String city;
    private String lat;
    private String lng;
    private String mag;
    private String derinlik;

}
