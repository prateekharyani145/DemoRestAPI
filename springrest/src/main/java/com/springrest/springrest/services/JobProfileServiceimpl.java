package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.JobProfileDao;
import com.springrest.springrest.entities.JobProfile;

@Service
public class JobProfileServiceimpl implements JobProfileService {

	@Autowired
	private JobProfileDao jobProfileDao;
	
//	List<JobProfile> list;
//	
//	public JobProfileServiceimpl() {
//		list = new ArrayList<>();
//		list.add(new JobProfile(101,"Associate Application Engineer","Software Department"));
//		list.add(new JobProfile(102,"Member Of Technical Staff","Software Department"));
//	}
	
	@Override
	public List<JobProfile> getJobProfiles() {
	
		return jobProfileDao.findAll();
//		return list;
	
	}

	@Override
	public JobProfile getJobProfile(long jobProfileId) {
		
		return jobProfileDao.getOne(jobProfileId);
//		JobProfile j = null;
//		for(JobProfile jobProfile : list) {
//			if( jobProfile.getId() ==	jobProfileId) {
//				j = jobProfile;
//				break;
//			}
//		}
//		return j;
	
	}
	
	@Override
	public JobProfile addJobProfile(JobProfile jobProfile) {

		jobProfileDao.save(jobProfile);
		return jobProfile;
//		list.add(jobProfile);
//		return jobProfile;
	
	}

	@Override
	public JobProfile updateJobProfile(JobProfile jobProfile) {

		jobProfileDao.save(jobProfile);
		return jobProfile;
//		list.forEach(e	-> {
//			if(e.getId() == jobProfile.getId())
//			{
//				e.setDepartment(jobProfile.getDepartment());
//				e.setDesignation(jobProfile.getDesignation());
//			}
//			
//		});
//		return jobProfile;

	}

	@Override
	public void deleteJobProfile(long jobProfileId) {

		JobProfile entity = jobProfileDao.getOne(jobProfileId);
		jobProfileDao.delete(entity);
		//		list = this.list.stream().filter(e->e.getId() != jobProfileId).collect(Collectors.toList());
	
	}
		
	}


	

