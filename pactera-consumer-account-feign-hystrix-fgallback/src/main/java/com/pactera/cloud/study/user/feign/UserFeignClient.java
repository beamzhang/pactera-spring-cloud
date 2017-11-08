package com.pactera.cloud.study.user.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pactera.cloud.study.user.entity.User;
import com.pactera.cloud.study.user.feign.impl.UserFeignClientFallBack;

@FeignClient(name = "pactera-provider-user", fallback = UserFeignClientFallBack.class)
public interface UserFeignClient {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable("id") Long id);
}