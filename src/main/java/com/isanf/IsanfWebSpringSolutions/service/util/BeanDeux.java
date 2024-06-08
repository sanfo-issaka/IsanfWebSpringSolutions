package com.isanf.IsanfWebCRUDSolutions.service.util;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//R 8
@Component
@Order(2) // Ce bean sera le deuxième
public class BeanDeux implements MonInterface {

	@Override
	public void faireQuelqueChose() {
		// TODO Auto-generated method stub
		System.out.println("Bean 2");
	}
    // ...
}
