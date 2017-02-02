package com.qa.student.model;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.student.rest.SeatService;
@RunWith(MockitoJUnitRunner.class)

public class seatTest {

	@InjectMocks
	SeatService SeatService = new SeatService();
	
	@Mock
	EntityManager em;
	
	@Mock
	Query query;
	
		
	@Test
	public void testPrioritySeats(){
		List<Seat> seatList = new ArrayList<Seat>();
		Seat aSeat = new Seat();
		aSeat.setPrioritySeats(true);
		seatList.add(aSeat);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(seatList);
		
		List<Seat> assertionList = SeatService.getAllSeats();
		assertEquals(assertionList.get(0).getPrioritySeats(), true);
		Mockito.verify(em).createQuery(Mockito.anyString());
	}
	
	@Test
	public void testTicketId(){
		List<Seat> seatList = new ArrayList<Seat>();
		Seat aSeat = new Seat();
		aSeat.setTicketId(1);
		seatList.add(aSeat);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(seatList);
		
		List<Seat> assertionList = SeatService.getAllSeats();
		assertEquals(assertionList.get(0).getTicketId(), 1);
		Mockito.verify(em).createQuery(Mockito.anyString());
	}
	
	@Test
	public void testSeatNo(){
		List<Seat> seatList = new ArrayList<Seat>();
		Seat aSeat = new Seat();
		aSeat.setSeatNo("F10");
		seatList.add(aSeat);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(seatList);
		
		List<Seat> assertionList = SeatService.getAllSeats();
		assertEquals(assertionList.get(0).getSeatNo(), "F10");
		Mockito.verify(em).createQuery(Mockito.anyString());
	}
}