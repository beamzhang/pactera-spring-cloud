package com.pactera.cloud.study.user.feign.impl;

import org.springframework.stereotype.Component;

import com.pactera.cloud.study.user.entity.User;
import com.pactera.cloud.study.user.feign.UserFeignClient;

/**
 * @desc feignClient的回退类，需要实现feignclient接口
 * @author zhangqiang
 *
 */
@Component
public class UserFeignClientFallBack implements UserFeignClient {

	@Override
	public User findById(Long id) {
		User user = new User();
		user.setId(-1L);
		user.setUsername("系统默认用户");
		user.setAge(23);
		return user;
	}

}
