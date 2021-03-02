package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.JobProfile;

public interface JobProfileDao extends JpaRepository<JobProfile, Long> {
	
	
}
