package com.pactera.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.pactera.cloud.entity.User;
import com.pactera.config.Configuration1;

import feign.Param;
import feign.RequestLine;

@FeignClient(name = "pactera-provider-user", configuration = Configuration1.class, fallback = HystrixClientFallback.class)
public interface UserFeignClient {
	@RequestLine("GET /{id}")
	public User findById(@Param("id") Long id);
}
