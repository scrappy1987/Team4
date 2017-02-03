package com.qa.student.model;

import static org.junit.Assert.assertEquals;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import com.qa.student.model.Cinema;

@RunWith(MockitoJUnitRunner.class)
public class CinemaTest {
	@InjectMocks
	Cinema cinema = Mockito.mock(Cinema.class);

	@Mock
	EntityManager em;

	@Mock
	Query query;

	@Test
	public void cinemaIdTest() {
		Mockito.when(cinema.getCinemaID()).thenReturn((long) 1);
		assertEquals(cinema.getCinemaID(), 1);
	}

	@Test
	public void cinemaAddressTest() {
		cinema.setCinemaAddress("64 Zoo Lane");
		Mockito.when(cinema.getCinemaAddress()).thenReturn("64 Zoo Lane");
		assertEquals(cinema.getCinemaAddress(), "64 Zoo Lane");
	}

	@Test
	public void cinemaContactNumberTest() {
		cinema.setCinemaContactNumber("0800001066");
		Mockito.when(cinema.getCinemaContactNumber()).thenReturn("0800001066");
		assertEquals(cinema.getCinemaContactNumber(), "0800001066");
	}

	@Test
	public void cinemaScreenAmountTest() {
		cinema.setCinemaScreenAmount(7);
		Mockito.when(cinema.getCinemaScreenAmount()).thenReturn(7);
		assertEquals(cinema.getCinemaScreenAmount(), 7);
	}

	@Test
	public void cinemaManager() {
		cinema.setCinemaManager("Mr. Manager");
		Mockito.when(cinema.getCinemaManager()).thenReturn("Mr. Manager");
		assertEquals(cinema.getCinemaManager(), "Mr. Manager");
	}

}