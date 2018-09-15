package com.carolchang.contatoservice.services;

import org.springframework.mail.SimpleMailMessage;

import com.carolchang.contatoservice.domain.Profile;

public interface EmailService {
	
    void sendOrderConfirmationEmail(Profile profile);
	
	void sendEmail(SimpleMailMessage msg);
}
