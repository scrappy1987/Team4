package com.qa.student.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.student.model.Ticket;
//import com.qa.student.rest.TicketService;






import static org.junit.Assert.*;

import org.junit.Test;

@RunWith(MockitoJUnitRunner.class)
public class TicketTest {
	@InjectMocks
	Ticket ticket = Mockito.mock(Ticket.class);
	@Mock
	EntityManager em;
	@Mock
	Query query;

	@Test
	public void getIdTest() {
		Mockito.when(ticket.getId()).thenReturn((long)1);
		assertEquals(ticket.getId(),1);
	}
	@Test
	public void setGetPrice() {
		ticket.setPrice((double)8.99);
		Mockito.when(ticket.getPrice()).thenReturn((double)8.99);
		assertEquals(ticket.getPrice(),8.99,0.01);
	}
	@Test
	public void setGetFilmId() {
		ticket.setFilmId((long)1);
		Mockito.when(ticket.getFilmId()).thenReturn((long)1);
		assertEquals(ticket.getFilmId(),1);
	}
	@Test
	public void setGetCustomerId() {
		ticket.setCustomerId((long)1);
		Mockito.when(ticket.getCustomerId()).thenReturn((long)1);
		assertEquals(ticket.getCustomerId(),1);
	}
	@Test
	public void setGetCinemaId() {
		ticket.setCinemaId((long)1);
		Mockito.when(ticket.getCinemaId()).thenReturn((long)1);
		assertEquals(ticket.getCinemaId(),1);
	}
	@Test
	public void setGetSeatId() {
		ticket.setSeatId("L12");
		Mockito.when(ticket.getSeatId()).thenReturn("L12");
		assertEquals(ticket.getSeatId(),"L12");
	}
	@Test
	public void setGetScreenId() {
		ticket.setScreenId((long)1);
		Mockito.when(ticket.getScreenId()).thenReturn((long)1);
		assertEquals(ticket.getScreenId(),1);
	}
}

