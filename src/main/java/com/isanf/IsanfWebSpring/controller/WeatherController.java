package com.isanf.IsanfWebSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.isanf.IsanfWebSpring.repository.dao.WeatherData;
import com.isanf.IsanfWebSpring.service.ApiService;

//R 4
@RestController
public class WeatherController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/weather/{city}")
    public WeatherData getWeather(@PathVariable String city) {
        return apiService.getWeatherData(city);
    }
}

