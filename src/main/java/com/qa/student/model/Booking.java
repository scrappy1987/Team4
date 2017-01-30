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
public class Booking {
	
	@Id
	@GeneratedValue
	private long id;
	
	//not needed as creating list of ticketIds not one per booking 
	//@NotNull
	//private Long ticketId;
	
	@NotNull
	private long screenId;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Ticket> tickets = new HashSet<Ticket>();
	
	public Booking() {
		
	}

	public Booking(long id, long screenId) {
		super();
		this.id = id;
		//this.ticketId = ticketId;
		this.screenId = screenId;
	}

	public long getId() {
		return id;
	}

	/*public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}*/

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}
	
	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

}
