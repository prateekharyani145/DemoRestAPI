package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.JobProfile;
import com.springrest.springrest.services.JobProfileService;

@RestController
public class MyController {

	@Autowired
	private JobProfileService jobProfileService ;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome To Hexaview";
	}
	
	//Get the Course
	
	@GetMapping("/JobProfile")
	public  List<JobProfile> getJobProfiles()
	{
		return this.jobProfileService.getJobProfiles();
	}
	
	@GetMapping("/JobProfile/{jobProfileId}")
	public JobProfile getJobProfile(@PathVariable String jobProfileId ) {
		return this.jobProfileService.getJobProfile( Long.parseLong(jobProfileId) );
	}
}
