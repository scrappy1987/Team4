package com.qa.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Screen {
	
	@Id
	@GeneratedValue
	private long screenID;
	
	@Id
	@GeneratedValue
	private long cinemaID;
	
	@Id
	@GeneratedValue
	private long filmID;
	
	@Id
	@GeneratedValue
	private long eventID;
		
	public Screen(){
		
	}
	
	public long getScreenID() {
		return screenID;
	}

	public void setScreenID(long screenID) {
		this.screenID = screenID;
	}

	public long getCinemaID() {
		return cinemaID;
	}

	public void setCinemaID(long cinemaID) {
		this.cinemaID = cinemaID;
	}

	public long getFilmID() {
		return filmID;
	}

	public void setFilmID(long filmID) {
		this.filmID = filmID;
	}

	public long getEventID() {
		return eventID;
	}

	public void setEventID(long eventID) {
		this.eventID = eventID;
	}
}
