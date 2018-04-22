package com.ms.springaop.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ms.springaop.repository.SimpleRepository;
import com.ms.springaop.service.SimpleService;

@Configuration
public class SystemConfigurationMethods {

	@Bean
	public SimpleService getSimpleServiceBean() {
		return new SimpleService();
	}

	@Bean
	public SimpleRepository getSimpleSimpleRepositoryBean() {
		return new SimpleRepository();
	}

}
