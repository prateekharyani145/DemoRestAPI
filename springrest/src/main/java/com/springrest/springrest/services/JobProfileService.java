package com.springrest.springrest.services;

import java.util.List;


import com.springrest.springrest.entities.JobProfile;

public interface JobProfileService {

	public List<JobProfile> getJobProfiles();

	public JobProfile getJobProfile(long jobProfileId);
	
	public JobProfile addJobProfile (JobProfile jobProfile);

	public JobProfile updateJobProfile(JobProfile jobProfile);

	public void deleteJobProfile(long jobProfileId);

}
