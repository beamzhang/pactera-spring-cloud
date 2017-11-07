package com.pactera.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerAccountApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerAccountApplication.class, args);
	}
}
