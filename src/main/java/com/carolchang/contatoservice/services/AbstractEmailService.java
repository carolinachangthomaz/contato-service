package com.carolchang.contatoservice.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;	

import com.carolchang.contatoservice.domain.Profile;
import com.carolchang.contatoservice.domain.enums.Projeto;

public abstract class AbstractEmailService implements EmailService {

	@Value("{default.sender}")
	private String sender;
	
	@Override
	public void sendOrderConfirmationEmail(Profile profile) {
		SimpleMailMessage sm = prepareSimpleMailMessageFromProfile(profile);
		sendEmail(sm);
	}
	
	protected SimpleMailMessage prepareSimpleMailMessageFromProfile(Profile profile) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo("carol.com.jp@gmail.com");
		sm.setCc("poliana@corretorassociadolopes.com.br");
		sm.setFrom(sender);
		sm.setSubject(Projeto.getNomeProjeto(profile.getProjeto())+ " - Novo Contato : "+profile.getNome());
		sm.setSentDate(new Date(System.currentTimeMillis()));
		sm.setText(profile.toString());
		return sm;
	};
}
