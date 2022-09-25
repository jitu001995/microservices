package com.scii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsProj16MiniProjConfigServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(MsProj16MiniProjConfigServer2Application.class, args);
	}

}
