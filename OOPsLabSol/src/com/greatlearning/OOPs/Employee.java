package com.greatlearning.OOPs;

public class Employee {
	private String firstname;
	private String lastname;
	

	public String getFirstName() {
		return firstname;
	}
	
	public void setFirstName(String firstName) {
		this.firstname = firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void setLastName(String lastName) {
		this.lastname = lastname;
	}
	
	public Employee(String fName, String lName){
		this.firstname = fName;
		this.lastname = lName;
	}	
	
}
