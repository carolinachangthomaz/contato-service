package com.carolchang.contatoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;

import com.carolchang.contatoservice.repository.ProfileRepository;
import com.carolchang.contatoservice.services.EmailService;
import com.carolchang.contatoservice.services.ProfileService;

@SpringBootApplication
public class ContatoServiceApplication extends SpringBootServletInitializer implements CommandLineRunner{
	
	@Autowired
	private ProfileService profileService;
	
	@Autowired
	private ProfileRepository profileRepository;
	
	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(ContatoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        //profileRepository.deleteAll();
		
		//Profile profile = new Profile(null, "Teste", "carol.com.jp@gmail.com", "11967348851", "mensagem de texto", Projeto.PROFILE);
		//profileService.create(profile);
		//System.out.println(profile);
		//emailService.sendOrderConfirmationEmail(profile);
	}
	
	@Bean
	public HttpFirewall defaultHttpFirewall() {
	    return new DefaultHttpFirewall();
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return super.configure(builder);
	}
}
