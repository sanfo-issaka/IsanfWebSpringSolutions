package com.example.functionserverless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class FunctionServerless {
    public static void main(String[] args) {
        SpringApplication.run(FunctionServerless.class, args);
    }

    @Bean
    public Function<String, String> lowercase() {
        return value -> value.toLowerCase();
    }
}
