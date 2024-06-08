package com.example.conditionalbeandemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConditionalBeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConditionalBeanApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            if (ctx.containsBean("modelProcessor")) {
                ModelProcessor modelProcessor = (ModelProcessor) ctx.getBean("modelProcessor");
                modelProcessor.process();
            } else {
                System.out.println("ModelProcessor bean is not created as MODEL environment variable is not set.");
            }
        };
    }
}