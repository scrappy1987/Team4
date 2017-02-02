package com.qa.student.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Booking> bookings = new HashSet<Booking>();
	
	//Constructor
	public Customer() {
	}
	
	
	
	public Customer(Long customerId, String fName, String lName, String email, String password, short age) {
		this.customerId = customerId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.age = age;
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

	public Set<Booking> getBookings(){
		return bookings;
	}
	
	public void setBookings(Set<Booking> bookings){
		this.bookings = bookings;
	}



	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", password=" + password + ", age=" + age + ", bookings=" + bookings + "]";
	}

	
}