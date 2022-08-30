package com.example.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExangeServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExangeServicesApplication.class, args);
	}

}
