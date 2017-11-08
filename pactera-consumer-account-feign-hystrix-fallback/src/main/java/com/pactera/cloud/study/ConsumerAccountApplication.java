package com.pactera.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ConsumerAccountApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerAccountApplication.class, args);
	}
}
