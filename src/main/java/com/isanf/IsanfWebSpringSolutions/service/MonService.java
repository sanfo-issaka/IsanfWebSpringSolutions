package com.isanf.IsanfWebSpringSolutions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.isanf.IsanfWebSpringSolutions.service.util.MonInterface;

//R 8
@Component
public class MonService {

    @Autowired
    private List<MonInterface> mesBeans;

    @Autowired //For injection
    public void utiliserMesBeans() {
        for (MonInterface bean : mesBeans) {
            bean.faireQuelqueChose(); // Les beans seront appelés dans l'ordre 1, 2, 3
        }
    }
}
