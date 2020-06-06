package com.carolchang.contatoservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carolchang.contatoservice.domain.Profile;
import com.carolchang.contatoservice.domain.enums.Projeto;
import com.carolchang.contatoservice.repository.ProfileRepository;

@Service
public class ProfileService {
	
	@Autowired
	private ProfileRepository profileRepository;
	
	public Profile create(Profile profile){
		profile.setId(null);
		profile.setProjeto(profile.getProjeto());
		return profileRepository.save(profile);
	}

}
