package com.qa.student.model;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ShowingTest {

	@InjectMocks
	Showing showing = new Showing();

	@Mock
	EntityManager em;

	@Mock
	Query query;

	@Test
	public void getsetShowingID() {
		showing.setShowingId(1);
		Mockito.when(showing.getShowingId()).thenReturn((long) 1);
		assertEquals(showing.getShowingId(), (long) 1);
	}

	@Test
	public void getSetScreenID() {
		showing.setScreenId(1);
		Mockito.when(showing.getScreenId()).thenReturn((long) 1);
		assertEquals(showing.getScreenId(), (long) 1);
	}

	@Test
	public void getSetSeatID() {
		showing.setSeatId(1);
		Mockito.when(showing.getSeatId()).thenReturn(1);
		assertEquals(showing.getSeatId(), 1);
	}

	@Test
	public void getSetDateTime() {
		Date date = new Date(10);
		showing.setDateTime(date);
		Mockito.when(showing.getDateTime()).thenReturn(date);
		assertEquals(showing.getDateTime(), date);
	}

	@Test
	public void getSetFilmID() {
		showing.setFilmId(1);
		Mockito.when(showing.getFilmId()).thenReturn((long) 1);
		assertEquals(showing.getFilmId(), 1);
	}

	@Test
	public void getSetEventID() {
		showing.setEventId(1);
		Mockito.when(showing.getEventId()).thenReturn((long) 1);
		assertEquals(showing.getEventId(), 1);
	}

	@Test
	public void getSetAllFilmsEventTickets() {
		Set<Ticket> ticketList = new HashSet<Ticket>();
		Ticket aTicket = new Ticket();
		aTicket.setCinemaId(new Long(1));
		ticketList.add(aTicket);
		showing.setFilms(ticketList);
		Mockito.when(showing.getFilms()).thenReturn(ticketList);
		Set<Ticket> assertionSet = showing.getFilms();
		java.util.Iterator<Ticket> i = assertionSet.iterator();
		Ticket t = i.next();
		assertEquals(t.getCinemaId(), 1);
	}

}
