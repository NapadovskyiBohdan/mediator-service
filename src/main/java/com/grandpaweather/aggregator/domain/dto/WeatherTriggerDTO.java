package com.grandpaweather.aggregator.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class WeatherTriggerDTO {

    private String id;
    private LocalDateTime date;
    private long cityId;
    private String name;
    private Double temp;
    private Double feels_like;
    private Double temp_min;
    private Double temp_max;
    private int pressure;
    private int humidity;
    private int clouds;
    private String weather_main;
    private String weather_description;
    private int visibility;
    private TriggerDTO trigger;


}
