package com.pactera.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

@Configuration
public class FeignLogConfiguration {
	
	@Bean
	Logger.Level feignLogConfiguration() {
		return Logger.Level.FULL;
	}
}
