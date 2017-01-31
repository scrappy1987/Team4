package com.qa.student.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Event {

	
	@Id
	@GeneratedValue
	private long eventID;
	
	@NotNull
	private String eventTitle;
	
	@NotNull
	private String eventDate;
	
	@NotNull
	private String eventDescription;
	
	@NotNull
	private int eventDuration;
	
	@NotNull
	private int eventFiveStarRating;
	
	public enum eventType{
		CONCERT, PLAY, DANCE, MAGIC, SPORT
	}
	
		
	public Event(){
		
	}


	public long getEventID() {
		return eventID;
	}


	public void setEventID(long eventID) {
		this.eventID = eventID;
	}


	public String getEventTitle() {
		return eventTitle;
	}


	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}


	public String getEventDate() {
		return eventDate;
	}


	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}


	public String getEventDescription() {
		return eventDescription;
	}


	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}


	public int getEventDuration() {
		return eventDuration;
	}


	public void setEventDuration(int eventDuration) {
		this.eventDuration = eventDuration;
	}


	public int getEventFiveStarRating() {
		return eventFiveStarRating;
	}


	public void setEventFiveStarRating(int eventFiveStarRating) {
		this.eventFiveStarRating = eventFiveStarRating;
	}
	
	
	
	
}
