package com.github.luccassantos4.services;

import com.github.luccassantos4.dto.EmailDTO;

public interface EmailService {
	
	void sendEmail(EmailDTO dto);
}
