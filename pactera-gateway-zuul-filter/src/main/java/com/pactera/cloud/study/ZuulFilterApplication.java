package com.pactera.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.pactera.cloud.study.filters.pre.PreRequestLogFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulFilterApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulFilterApplication.class, args);
	}

	@Bean
	public PreRequestLogFilter preRequestLogFilter() {
		return new PreRequestLogFilter();
	}
}
