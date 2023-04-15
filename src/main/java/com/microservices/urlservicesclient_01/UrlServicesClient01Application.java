package com.microservices.urlservicesclient_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UrlServicesClient01Application {

	public static void main(String[] args) {
		SpringApplication.run(UrlServicesClient01Application.class, args);
	}

}
