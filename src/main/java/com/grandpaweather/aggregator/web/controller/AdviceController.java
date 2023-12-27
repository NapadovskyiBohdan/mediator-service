package com.grandpaweather.aggregator.web.controller;

import com.grandpaweather.aggregator.domain.dto.WeatherMediatorDTO;
import com.grandpaweather.aggregator.domain.request.WeatherRequest;
import com.grandpaweather.aggregator.service.AdviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
public class AdviceController {

    private final AdviceService adviceService;

    @GetMapping("/advice")
    public ResponseEntity<List<WeatherMediatorDTO>> getWeatherByCoordinates(WeatherRequest request) {
        return ResponseEntity.ok().body(adviceService.getAdviceByCoordinates(request));
    }


}
