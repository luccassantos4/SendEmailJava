package com.github.luccassantos4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.github.luccassantos4.services.EmailService;
import com.github.luccassantos4.services.SendGridEmailService;

@Configuration
@Profile("dev")
public class DevConfig {
	@Bean
	public EmailService emailService() {
		return new SendGridEmailService();
	}
}
