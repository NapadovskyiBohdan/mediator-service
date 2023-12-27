package com.grandpaweather.aggregator.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherRequest {
    private double lat;
    private double lon;
    private String units;
    private String countryCode;
    private String city;
    private String zipCode;
    private String lang;
}
