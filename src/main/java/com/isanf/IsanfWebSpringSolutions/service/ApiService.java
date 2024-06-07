package com.isanf.IsanfWebSpringSolutions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.isanf.IsanfWebSpringSolutions.repository.dao.WeatherData;

//R 4
@Service
public class ApiService {

    private final RestTemplate restTemplate;

    @Autowired // Injection de dépendance (facultatif avec les dernières versions de Spring)
    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherData getWeatherData(String city) {
        String apiKey = "ca2fce80678dc46a0d75ccc1ef840e49";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

        return restTemplate.getForObject(url, WeatherData.class);
    }
}
