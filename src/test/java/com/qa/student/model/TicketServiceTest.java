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

import com.qa.student.rest.TicketService;

@RunWith(MockitoJUnitRunner.class)
public class TicketServiceTest {

	@InjectMocks
	TicketService ticketService = new TicketService();
	@Mock
	EntityManager em;
	@Mock
	Query query;

	@Test
	public void getAllTicketsTest() {
		List<Ticket> ticketList = new ArrayList<Ticket>();
		Ticket aTicket = new Ticket();
		aTicket.setFilmId((long)1);
		ticketList.add(aTicket);
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(ticketList);
		// test the add functionality
		List<Ticket> assertionList = ticketService.getAllTickets();
		assertEquals(assertionList.get(0).getFilmId(), 1);
		// verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());
	}

}
