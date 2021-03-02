package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.JobProfile;

@Service
public class JobProfileServiceimpl implements JobProfileService {

	List<JobProfile> list;
	
	public JobProfileServiceimpl() {
		list = new ArrayList<>();
		list.add(new JobProfile(101,"Associate Application Engineer","Software Department"));
		list.add(new JobProfile(102,"Member Of Technical Staff","Software Department"));
	}
	
	@Override
	public List<JobProfile> getJobProfiles() {
		return list;
	}

	@Override
	public JobProfile getJobProfile(long jobProfileId) {
		
		JobProfile j = null;
		for(JobProfile jobProfile : list) {
			if( jobProfile.getId() ==	jobProfileId) {
				j = jobProfile;
				break;
			}
		}
		return j;
	}
	

}
