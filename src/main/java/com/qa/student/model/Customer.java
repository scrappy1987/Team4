package com.qa.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private Long customerId;
	
	@NotNull
	private String fName;
	@NotNull
	private String lName;
	@NotNull
	private String email;
	@NotNull
	private String password;
	@NotNull
	private short age;
	
	//Constructor
	public Customer() {
	}
	
	
	//Getters and Setters
	public long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public short getAge() {
		return age;
	}


	public void setAge(short age) {
		this.age = age;
	}

	
}