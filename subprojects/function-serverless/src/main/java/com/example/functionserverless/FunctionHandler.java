package com.example.functionserverless;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class FunctionHandler extends SpringBootRequestHandler<String, String> {
}
