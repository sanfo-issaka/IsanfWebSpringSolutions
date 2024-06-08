package com.example.conditionalbeandemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

//R 11
@Configuration
public class ModelProcessorConfig {

	//R 3
    @Bean
    @Conditional(ModelExistsCondition.class)
    public ModelProcessor modelProcessor() {
        return new ModelProcessor();
    }
}