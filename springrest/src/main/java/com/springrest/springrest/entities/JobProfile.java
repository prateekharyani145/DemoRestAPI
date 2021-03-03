package com.springrest.springrest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "JobProfile")
public class JobProfile {
    @NotNull(message = "Id cannot be null")
    @Column(name = "id",nullable = false)
    @Id 
	private long id;
	
    @Pattern(regexp="(^[a-zA-Z ]*$)",message = "Designation is invalid")
    @NotBlank(message = "Designation not be empty")
    @Size(min = 2 , message = "Designation Must have atleast 2 Character")
    @Column(name="Designation")
	private String Designation;

    @Pattern(regexp="(^[a-zA-Z ]*$)",message = "Department is invalid")
    @NotBlank(message = "Department can not be empty")
    @Size(min = 2 , message = "Department Must have atleast 2 Character")
    @Column(name="Department")
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
