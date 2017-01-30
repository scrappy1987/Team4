package com.qa.student.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Seat {

	@Id
	@GeneratedValue
	private long seatId;
	
	@Column(name ="standardseats")
	private int standardSeats;
	
	private int prioritySeats;
	
	private long ticketId;

	public long getSeatId() {
		return seatId;
	}

	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}

	public int getStandardSeats() {
		return standardSeats;
	}

	public void setStandardSeats(int standardSeats) {
		this.standardSeats = standardSeats;
	}

	public int getPrioritySeats() {
		return prioritySeats;
	}

	public void setPrioritySeats(int prioritySeats) {
		this.prioritySeats = prioritySeats;
	}

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", standardSeats=" + standardSeats
				+ ", prioritySeats=" + prioritySeats + ", ticketId=" + ticketId
				+ "]";
	}
}
