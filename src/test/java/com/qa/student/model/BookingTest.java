package com.qa.student.model;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.student.model.Booking;
import com.qa.student.rest.BookingService;

@RunWith(MockitoJUnitRunner.class)
public class BookingTest {
	@InjectMocks
	//Booking booking = new Booking();
	Booking booking = Mockito.mock(Booking.class);
	@Mock
	EntityManager em;
	@Mock
	Query query;

	@Test
	public void getIdTest() {
		Mockito.when(booking.getId()).thenReturn((long)1);
		assertEquals(booking.getId(),1);
	}
	
@Test
	public void setGetScreenId() {
		booking.setScreenId((long)1);
		Mockito.when(booking.getScreenId()).thenReturn((long)1);
		assertEquals(booking.getScreenId(),1);
	}
	
	@Test
	public void setGetTickets() {
		Set<Ticket> ticketList = new HashSet<Ticket>();
		Ticket aTicket = new Ticket();
		aTicket.setScreenId((long)1);
		ticketList.add(aTicket);
		booking.setTickets(ticketList);
		Mockito.when(booking.getTickets()).thenReturn(ticketList);
		Set<Ticket> assertionSet = booking.getTickets();
		java.util.Iterator<Ticket> i = assertionSet.iterator();
		Ticket t = i.next();
		assertEquals(t.getScreenId(),1);

	}

	  
	  
}