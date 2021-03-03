package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.JobProfileDao;
import com.springrest.springrest.entities.JobProfile;

//Implementation Of the Job Services

@Transactional
@Service
public class JobProfileServiceimpl implements JobProfileService {

	@Autowired
	private JobProfileDao jobProfileDao;

	// Find All Job Profiles
	@Override
	public List<JobProfile> getJobProfiles() {

		return jobProfileDao.findAll();
	}
	
	// Find Particular Job Profile by ID
	@Override
	public JobProfile getJobProfile(long jobProfileId) {

		JobProfile profile = null;
		Optional<JobProfile> jobProfile = jobProfileDao.findById(jobProfileId); 
		if(jobProfile.isPresent())
			profile = jobProfile.get();
		return profile;
	}
	
	// Add New Job Profile
	@Override
	public JobProfile addJobProfile(JobProfile jobProfile) {

		jobProfileDao.save(jobProfile);
		return jobProfile;
	}
	
	// Update Particuar Job Profile By ID . If ID not found then create new Job Profile
	@Override
	public JobProfile updateJobProfile(JobProfile jobProfile) {

		jobProfileDao.save(jobProfile);
		return jobProfile;
	}

	// Delete Particular Job Profile By ID
	@Override
	public void deleteJobProfile(long jobProfileId) {

		JobProfile entity = jobProfileDao.getOne(jobProfileId);
		jobProfileDao.delete(entity);
	}
		
}


	

