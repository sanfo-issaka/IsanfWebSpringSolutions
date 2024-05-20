package com.isanf.IsanfWebCRUDSolutions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.isanf.IsanfWebCRUDSolutions.repository.dao.WeatherData;

//R 4
@Service
public class ApiService {

    private final RestTemplate restTemplate;

    @Autowired // Injection de dépendance (facultatif avec les dernières versions de Spring)
    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherData getWeatherData(String city) {
        String apiKey = "e6b71ca458055565996db429e6137b50";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

        return restTemplate.getForObject(url, WeatherData.class);
    }
}
