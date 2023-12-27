package com.grandpaweather.aggregator.service;

import com.grandpaweather.aggregator.domain.dto.WeatherTriggerDTO;
import com.grandpaweather.aggregator.domain.request.WeatherRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "weather-service")
public interface WeatherFeignClientService {

    @PostMapping("/weather")
    List<WeatherTriggerDTO> getWeatherByRequest(@RequestBody WeatherRequest request);


}
