package com.pactera.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

/**
 * @desc feign的配置类，不能在主应用程序的上下文中 @ComponentScan不能再此扫描的包里
 * @author zhangqiang
 *
 */
@Configuration
public class FeignConfiguration {
	
	@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();//将契约改为feign原生的默认契约，就可以使用feign自带的注解
	}
}
