package com.carolchang.contatoservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.carolchang.contatoservice.services.EmailService;
import com.carolchang.contatoservice.services.SmtpEmailService;

@Configuration
public class Configuracao {

	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}
