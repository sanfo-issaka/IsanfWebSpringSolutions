package com.isanf.IsanfWebSpringSolutions.service.util;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//R 8
@Component
@Order(1) // Ce bean sera le premier dans la liste
public class BeanUn implements MonInterface {

	@Override
	public void faireQuelqueChose() {
		// TODO Auto-generated method stub
		System.out.println("Bean 1");
	}
    // ... (implémentation)
}
