package com.qa.student.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Seat {

	@Id
	@GeneratedValue
	private long seatId;
	
	@Column(name ="seatsNo")
	private String seatNo;
	

	@Column(name ="standardseats")
	private boolean prioritySeats;
	
	@OneToOne
	@JoinColumn(name="ticketId")
	private long ticketId;

	public Seat(){
		
	}
	public Seat(long seatId, String seatNo, boolean prioritySeats, long ticketId) {
		this.seatId = seatId;
		this.seatNo = seatNo;
		this.prioritySeats = prioritySeats;
		this.ticketId = ticketId;
	}

	
	public long getSeatId() {
		return seatId;
	}

	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}
	
	public String getSeatNo() {
		return seatNo;
	}	
	
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
		
	
	public boolean getPrioritySeats() {
		return prioritySeats;
	}

	public void setPrioritySeats(boolean prioritySeats) {
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
		return "Seat [seatId=" + seatId + ", prioritySeats=" + prioritySeats + ", ticketId=" + ticketId
				+ "]";
	}
}
