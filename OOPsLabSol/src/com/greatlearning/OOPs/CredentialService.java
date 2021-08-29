package com.greatlearning.OOPs;

import java.util.Random;

public class CredentialService {
	private String fName;
	private String lName;
	private String department;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	String generatePassword() {
		String pwd = "";
		int r = 0;
		
		Random rnd = new Random();
		r = rnd.nextInt(999);
		
		pwd = fName + r + "!G#" + lName;
		
		return pwd;
	}
	
	String generateEmailAddress() {
		return fName + lName + "@" + department + ".oop.com";
	}
	
	void showCredentials() {
		System.out.println("Dear " + fName + " your generated credentials are as follows : ");
		System.out.println("Email --> " + this.generateEmailAddress());
		System.out.println("Password --> " + this.generatePassword() + "\n\n");
		
	}
}
