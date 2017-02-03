package com.qa.student.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Screen {
	
	@Id
	@GeneratedValue
	private long screenID;
	
	@OneToOne
	@JoinColumn(name="cinemaID")
	private long cinemaID;
	
	@OneToOne
	@JoinColumn(name="filmID")
	private long filmID;
	
	@OneToOne
	@JoinColumn(name="eventID")
	private long eventID;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Showing> showings = new HashSet<Showing>();
		
	public Screen(){
		
	}
	
	public Screen(long screenID, long cinemaID, long filmID, long eventID) {
		this.screenID = screenID;
		this.cinemaID = cinemaID;
		this.filmID = filmID;
		this.eventID = eventID;
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
	
	public Set<Showing> getShowings() {
		return showings;
	}

	public void setShowings(Set<Showing> showings) {
		this.showings = showings;
	}

	@Override
	public String toString() {
		return "Screen [screenID=" + screenID + ", cinemaID=" + cinemaID + ", filmID=" + filmID + ", eventID=" + eventID
				+ ", showings=" + showings + "]";
	}
	
	
}
