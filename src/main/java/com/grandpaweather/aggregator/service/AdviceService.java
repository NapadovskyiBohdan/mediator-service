package com.grandpaweather.aggregator.service;

import com.grandpaweather.aggregator.domain.dto.WeatherMediatorDTO;
import com.grandpaweather.aggregator.domain.request.WeatherRequest;

import java.util.List;

public interface AdviceService {
    List<WeatherMediatorDTO> getAdviceByCoordinates(WeatherRequest request);

}
