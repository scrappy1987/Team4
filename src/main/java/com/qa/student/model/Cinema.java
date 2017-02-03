package com.qa.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Cinema {

	@Id
	@GeneratedValue
	private long cinemaID;
	
	@NotNull
	private String cinemaAddress;
	
	@NotNull 
	private String cinemaContactNumber;
	
	@NotNull
	private int cinemaScreenAmount;
	
	@NotNull
	private String cinemaManager;
	
	public Cinema(){
		
	}
	
	public Cinema(long cinemaID, String cinemaAddress, String cinemaContactNumber, int cinemaScreenAmount, String cinemaManager){
		this.cinemaID = cinemaID;
		this.cinemaAddress = cinemaAddress;
		this.cinemaContactNumber = cinemaContactNumber;
		this.cinemaScreenAmount = cinemaScreenAmount;
		this.cinemaManager = cinemaManager;		
	}

	public long getCinemaID() {
		return cinemaID;
	}

	public void setCinemaID(long cinemaID) {
		this.cinemaID = cinemaID;
	}

	public String getCinemaAddress() {
		return cinemaAddress;
	}

	public void setCinemaAddress(String cinemaAddress) {
		this.cinemaAddress = cinemaAddress;
	}

	public String getCinemaContactNumber() {
		return cinemaContactNumber;
	}

	public void setCinemaContactNumber(String cinemaContactNumber) {
		this.cinemaContactNumber = cinemaContactNumber;
	}

	public int getCinemaScreenAmount() {
		return cinemaScreenAmount;
	}

	public void setCinemaScreenAmount(int cinemaScreenAmount) {
		this.cinemaScreenAmount = cinemaScreenAmount;
	}

	public String getCinemaManager() {
		return cinemaManager;
	}

	public void setCinemaManager(String cinemaManager) {
		this.cinemaManager = cinemaManager;
	}
}
