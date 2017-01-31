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
import com.qa.student.rest.BookingService;

import static org.junit.Assert.*;

import org.junit.Test;

@RunWith(MockitoJUnitRunner.class)
public class BookingServiceTest {
	@InjectMocks
	BookingService bookingService = new BookingService();
	@Mock
	EntityManager em;
	@Mock
	Query query;

	@Test
	public void test() {
		List<Ticket> ticketList = new ArrayList<Ticket>();
		Ticket aTicket = new Ticket();
		aTicket.setCinemaId(new Long(1));
		ticketList.add(aTicket);
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(ticketList);
		// test the add functionality
		List<Ticket> assertionList = bookingService.getAllTickets();
		Assert.assertEquals(assertionList.get(0).getCinemaId(), 1);
		// verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());
	}
}

