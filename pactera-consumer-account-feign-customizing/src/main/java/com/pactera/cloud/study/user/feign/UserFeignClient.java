package com.pactera.cloud.study.user.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.pactera.cloud.config.FeignConfiguration;
import com.pactera.cloud.study.user.entity.User;

import feign.Param;
import feign.RequestLine;

@FeignClient(name = "pactera-provider-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {
	
	/**
	 * 使用feign自带的注解@RequestLine
	 * @param id
	 * @return
	 */
	@RequestLine("GET /{id}")
	public User findById(@Param("id") Long id);
}
