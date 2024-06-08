package com.example.conditionalbeandemo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ModelExistsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String modelEnv = context.getEnvironment().getProperty("MODEL");
        return modelEnv != null;
    }
}