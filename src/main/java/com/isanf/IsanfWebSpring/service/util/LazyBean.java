package com.isanf.IsanfWebSpring.service.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//R 10
@Component
@Lazy
public class LazyBean {
    public LazyBean() {
        System.out.println("LazyBean initialized!");
    }
}
