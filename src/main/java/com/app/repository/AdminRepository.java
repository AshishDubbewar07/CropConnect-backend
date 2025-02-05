package com.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.model.AppUser;

@Repository
public interface AdminRepository extends MongoRepository<AppUser, String> {
	
	

}
