package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RailGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RailGatewayApplication.class, args);
	}

}
