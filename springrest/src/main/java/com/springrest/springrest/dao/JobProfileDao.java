package com.springrest.springrest.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.JobProfile;

@Repository
public interface JobProfileDao extends MongoRepository<JobProfile, Long> {
	
	
}
