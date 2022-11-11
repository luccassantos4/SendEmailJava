package com.github.luccassantos4.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.luccassantos4.dto.EmailDTO;

public class MockEmailService implements EmailService {

	private static Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

	public void sendEmail(EmailDTO dto) {

		LOG.info("Sending email to: " + dto.getTo());
		LOG.info("Email sent!");
	}
}
