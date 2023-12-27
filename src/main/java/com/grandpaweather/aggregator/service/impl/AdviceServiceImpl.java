package com.grandpaweather.aggregator.service.impl;

import com.grandpaweather.aggregator.domain.dto.WeatherMediatorDTO;
import com.grandpaweather.aggregator.domain.dto.WeatherTriggerDTO;
import com.grandpaweather.aggregator.domain.request.WeatherRequest;
import com.grandpaweather.aggregator.repository.MediatorRepository;
import com.grandpaweather.aggregator.service.AdviceService;
import com.grandpaweather.aggregator.service.WeatherFeignClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdviceServiceImpl implements AdviceService {

    private final WeatherFeignClientService weatherFeignClientService;
    private final MediatorRepository mediatorRepository;

    @Override
    public List<WeatherMediatorDTO> getAdviceByCoordinates(WeatherRequest request) {
        List<WeatherTriggerDTO> weatherTriggers = weatherFeignClientService.getWeatherByRequest(request);


        return null;

    }

}
