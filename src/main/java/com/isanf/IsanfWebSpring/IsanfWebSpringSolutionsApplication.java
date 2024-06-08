package com.isanf.IsanfWebSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableFeignClients
public class IsanfWebSpringSolutionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsanfWebSpringSolutionsApplication.class, args);
	}
	
	//R 22
	@FeignClient("hello")
	static interface WaveService {
		@RequestMapping("/hello")
		public String getWave();
	}

}
