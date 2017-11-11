package com.pactera.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pactera.cloud.entity.User;
import com.pactera.cloud.feign.FeignClient2;
import com.pactera.cloud.feign.UserFeignClient;

@RestController
public class AccountController {

	@Autowired
	private UserFeignClient userFeignClient;

	@Autowired
	private FeignClient2 feignClient2;

	@GetMapping("/user/{id}")
	public User findById(@PathVariable Long id) {
		return this.userFeignClient.findById(id);
	}

	@GetMapping("/{serviceName}")
	public String findServiceInfoFromEurekaByServiceName(@PathVariable String serviceName) {
		return this.feignClient2.findServiceInfoFromEurekaByServiceName(serviceName);
	}
}
