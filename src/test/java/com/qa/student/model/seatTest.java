package com.qa.student.model;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.student.model.Seat;

@RunWith(MockitoJUnitRunner.class)
public class seatTest {

	@InjectMocks
	Seat seat = Mockito.mock(Seat.class);

	@Mock
	EntityManager em;

	@Mock
	Query query;

	@Test
	public void getSetSeatID() {
		seat.setSeatId(1);
		Mockito.when(seat.getSeatId()).thenReturn((long) 1);
		assertEquals(seat.getSeatId(), (long) 1);
	}

	@Test
	public void getSetSeatNo() {
		seat.setSeatNo("L13");
		Mockito.when(seat.getSeatNo()).thenReturn("L13");
		assertEquals(seat.getSeatNo(), "L13");
	}

	@Test
	public void getSetPrority() {
		seat.setPrioritySeats(false);
		Mockito.when(seat.getPrioritySeats()).thenReturn(false);
		assertEquals(seat.getPrioritySeats(), false);
	}

	@Test
	public void getSetTicketID() {
		seat.setTicketId(1);
		Mockito.when(seat.getTicketId()).thenReturn((long) 1);
		assertEquals(seat.getTicketId(), (long) 1);
	}
}