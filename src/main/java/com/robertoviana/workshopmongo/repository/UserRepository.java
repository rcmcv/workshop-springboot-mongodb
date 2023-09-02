package com.robertoviana.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.robertoviana.workshopmongo.domain.User;


public interface UserRepository extends MongoRepository<User, String> {
	
}
