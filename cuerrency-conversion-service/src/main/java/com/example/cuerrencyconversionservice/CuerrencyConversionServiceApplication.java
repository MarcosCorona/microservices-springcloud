package com.example.cuerrencyconversionservice;

import com.example.cuerrencyconversionservice.feign.CurrencyExchangeServiceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.cuerrencyconversionservice")
@EnableDiscoveryClient
public class CuerrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuerrencyConversionServiceApplication.class, args);
	}

}
