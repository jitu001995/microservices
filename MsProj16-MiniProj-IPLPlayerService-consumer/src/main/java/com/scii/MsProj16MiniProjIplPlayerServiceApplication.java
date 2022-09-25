package com.scii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsProj16MiniProjIplPlayerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj16MiniProjIplPlayerServiceApplication.class, args);
	}

}
