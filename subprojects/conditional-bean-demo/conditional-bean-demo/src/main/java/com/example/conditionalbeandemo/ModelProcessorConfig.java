package com.example.conditionalbeandemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelProcessorConfig {

    @Bean
    @Conditional(ModelExistsCondition.class)
    public ModelProcessor modelProcessor() {
        return new ModelProcessor();
    }
}