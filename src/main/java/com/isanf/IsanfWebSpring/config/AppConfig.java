package com.isanf.IsanfWebSpring.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.isanf.IsanfWebSpring.service.MonService;
import com.isanf.IsanfWebSpring.service.util.BarBean;

//R 4
@Configuration
public class AppConfig {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
