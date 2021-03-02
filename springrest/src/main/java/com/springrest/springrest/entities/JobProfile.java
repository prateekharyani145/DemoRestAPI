package com.springrest.springrest.entities;

public class JobProfile {
	private long id;
	private String Designation;
	private String Department;
	public JobProfile(long id, String designation, String department) {
		super();
		this.id = id;
		Designation = designation;
		Department = department;
	}
	public JobProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	@Override
	public String toString() {
		return "JobProfile [id=" + id + ", Designation=" + Designation + ", Department=" + Department + "]";
	}
	
	

}
