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
	
	@NotNull
	@OneToOne
	@JoinColumn(name="customerId")
	private long customerId;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Ticket> tickets = new HashSet<Ticket>();
	
	public Booking() {
		
	}

	public Booking(long id, long screenId, long customerId) {
		this.id = id;
		this.screenId = screenId;
		this.customerId = customerId;
	}

	public long getId() {
		return id;
	}

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

	@Override
	public String toString() {
		return "Booking [id=" + id + ", screenId=" + screenId + ", customerId=" + customerId + ", tickets=" + tickets
				+ "]";
	}

	
}
