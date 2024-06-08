package com.isanf.IsanfWebSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

//R 20
@RestController
public class FluxController {

    @GetMapping("/flux")
    public Flux<String> getFlux() {
        return Flux.just("Response 1 ", "Response 2 ", "Response 3 ");
    }
}