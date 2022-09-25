package com.scii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsProj16MiniProjEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj16MiniProjEurekaServerApplication.class, args);
	}

}
