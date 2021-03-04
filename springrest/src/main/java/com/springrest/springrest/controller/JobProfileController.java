package com.springrest.springrest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.JobProfile;
import com.springrest.springrest.services.JobProfileService;


@RestController
public class JobProfileController {

	@Autowired
	private JobProfileService jobProfileService ;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome To Hexaview";
	}
	
	//Get All Job Profile
	@GetMapping(path = "/JobProfile")
	public  List<JobProfile> getJobProfiles()
	{
		return this.jobProfileService.getJobProfiles();
	}
	
	// Get Job Profile By ID
	@GetMapping(path = "/JobProfile/{jobProfileId}")
	public JobProfile getJobProfile(@PathVariable String jobProfileId ) {
		return this.jobProfileService.getJobProfile( Long.parseLong(jobProfileId) );
	}
	
	// Create new Job Profile
	@PostMapping(path = "/JobProfile" , consumes = "application/json")
	public JobProfile addJobProfile(@RequestBody JobProfile jobProfile ) {
		return this.jobProfileService.addJobProfile(jobProfile);
	}
	
	// Update Job Profile By ID . If ID not found Create new Job Profile
	@PutMapping(path = "/JobProfile/{jobProfileId}")
	public JobProfile updateJobProfile( @RequestBody JobProfile jobProfile) {
		return this.jobProfileService.updateJobProfile(jobProfile);
	}
	
	// Delete Job Profile by ID
	@DeleteMapping(path = "/JobProfile/{jobProfileId}")
	public ResponseEntity<HttpStatus> deleteJobProfile (@PathVariable String jobProfileId){
		try {
		    this.jobProfileService.deleteJobProfile( Long.parseLong(jobProfileId) );
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
