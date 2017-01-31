package com.qa.student.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Showing{
	
	@Id
	@GeneratedValue
	private Long showingId;

	@NotNull
	private Long screenId;
	@NotNull
	private int seatId;
	@NotNull
	private Date dateTime;


	
	//Constructor
	public Showing() {
	}
	
	
	//Getters and Setters
	public long getShowingId() {
		return showingId;
	}



	public void setShowingId(long showingId) {
		this.showingId = showingId;
	}



	public long getScreenId() {
		return screenId;
	}



	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}



	public int getSeatId() {
		return seatId;
	}



	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}



	public Date getDateTime() {
		return dateTime;
	}



	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}



}