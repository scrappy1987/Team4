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
public class SeatServiceTest {

	@InjectMocks
	SeatService seatService = new SeatService();
	@Mock
	EntityManager em;
	@Mock
	Query query;

	@Test
	public void getAllSeatsTest() {
		List<Seat> seatList = new ArrayList<Seat>();
		Seat aSeat = new Seat();
		aSeat.setSeatNo("L13");
		seatList.add(aSeat);
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(seatList);
		// test the add functionality
		List<Seat> assertionList = seatService.getAllSeats();
		assertEquals(assertionList.get(0).getSeatNo(), "L13");
		// verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());
	}

}
