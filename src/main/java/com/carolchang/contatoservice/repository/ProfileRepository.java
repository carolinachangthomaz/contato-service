package com.carolchang.contatoservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carolchang.contatoservice.domain.Profile;

@Repository
public interface ProfileRepository extends MongoRepository<Profile, String>{

}
