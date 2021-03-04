package com.springrest.springrest.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobProfile")
public class JobProfile {
	@Id
	private long id;
	private String Designation;
	private String Department;
	
	
	// Constructor using Fields
	public JobProfile(long id, String designation, String department) {
		super();
		this.id = id;
		Designation = designation;
		Department = department;
	}

	//Constructor from Superclass
	public JobProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Getter And Setter 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}

	//Override toString method
	@Override
	public String toString() {
		return "JobProfile [id=" + id + ", Designation=" + Designation + ", Department=" + Department + "]";
	}
	
	

}
