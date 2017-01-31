package com.qa.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private double price;
	
	@NotNull
	private long filmId;
	
	@NotNull
	private long customerId;
	
	@NotNull
	private long cinemaId;
	
	@NotNull
	private String seatId;
	
	@NotNull
	private long screenId;

	public Ticket() {
		
	}
	
	public Ticket(long id, double price, long filmId, long customerId,
			long cinemaId, String seatId, long screenId) {
		super();
		this.id = id;
		this.price = price;
		this.filmId = filmId;
		this.customerId = customerId;
		this.cinemaId = cinemaId;
		this.seatId = seatId;
		this.screenId = screenId;
	}

	public long getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getFilmId() {
		return filmId;
	}

	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(long cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getSeatId() {
		return seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}
	

}
