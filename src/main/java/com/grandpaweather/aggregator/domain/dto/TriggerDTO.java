package com.grandpaweather.aggregator.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class TriggerDTO {

    private String id;

    private String name;

    private String description;

}
