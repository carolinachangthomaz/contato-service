package com.carolchang.contatoservice.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.carolchang.contatoservice.domain.Profile;
import com.carolchang.contatoservice.services.EmailService;
import com.carolchang.contatoservice.services.ProfileService;

@RestController
@RequestMapping(value="/profile")
public class ProfileResource {
	
	@Autowired
	private ProfileService profileService; 
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Profile profile){
		profile = profileService.create(profile);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(profile.getId()).toUri();
		emailService.sendOrderConfirmationEmail(profile);
		return ResponseEntity.created(uri).build();
	}

}
