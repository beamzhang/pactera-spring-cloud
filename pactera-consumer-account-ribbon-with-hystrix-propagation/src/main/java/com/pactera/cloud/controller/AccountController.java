package com.pactera.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.pactera.cloud.entity.User;

@RestController
public class AccountController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/user/{id}")
	@HystrixCommand(fallbackMethod = "findByIdFallback", commandProperties = @HystrixProperty(name = "execution.isolation.strategy", value = "SEMAPHORE"))
	public User findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://pactera-provider-user/" + id, User.class);
	}

	public User findByIdFallback(Long id) {
		User user = new User();
		user.setId(0L);
		return user;
	}
}
