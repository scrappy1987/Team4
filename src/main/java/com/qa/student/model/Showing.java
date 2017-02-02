package com.qa.student.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Showing{
	
	@Id
	@GeneratedValue
	private long showingId;

	@NotNull
	@OneToOne
	@JoinColumn(name="screenId")
	private long screenId;
	
	@ManyToOne
	@JoinColumn(name="eventId")
	private long eventId;
	
	@ManyToOne
	@JoinColumn(name="filmId")
	private long filmId;
	

	@NotNull
	private int seatId;
	
	@NotNull
	private Date dateTime;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Ticket> films = new HashSet<Ticket>();
		
	//Constructor
	public Showing() {
	}
	
		
	public Showing(long showingId, long screenId, long eventId, long filmId, int seatId, Date dateTime) {
		this.showingId = showingId;
		this.screenId = screenId;
		this.eventId = eventId;
		this.filmId = filmId;
		this.seatId = seatId;
		this.dateTime = dateTime;
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

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public long getFilmId() {
		return filmId;
	}

	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}

	public Set<Ticket> getFilms() {
		return films;
	}

	public void setFilms(Set<Ticket> films) {
		this.films = films;
	}


	@Override
	public String toString() {
		return "Showing [showingId=" + showingId + ", screenId=" + screenId + ", eventId=" + eventId + ", filmId="
				+ filmId + ", seatId=" + seatId + ", dateTime=" + dateTime + ", films=" + films + "]";
	}

	
}