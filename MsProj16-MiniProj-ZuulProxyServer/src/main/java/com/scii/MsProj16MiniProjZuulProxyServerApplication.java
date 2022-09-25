package com.scii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MsProj16MiniProjZuulProxyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj16MiniProjZuulProxyServerApplication.class, args);
	}

}
