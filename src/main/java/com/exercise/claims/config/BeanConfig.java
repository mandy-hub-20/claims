package com.exercise.claims.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.exercise.claims.api.impl.ClaimsApiDelegateImpl;

@Configuration
public class BeanConfig {

	@Bean
	public ClaimsApiDelegateImpl claimsApi() {
		return new ClaimsApiDelegateImpl();
	}

}
