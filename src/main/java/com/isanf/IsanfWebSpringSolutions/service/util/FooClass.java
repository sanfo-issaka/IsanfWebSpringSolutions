package com.isanf.IsanfWebSpringSolutions.service.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooClass {
	//R 17
	@Autowired
	private BarBean barBean;
}
