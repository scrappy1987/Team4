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
import com.qa.student.model.Cinema;
import com.qa.student.rest.CinemaService;

@RunWith(MockitoJUnitRunner.class)
public class CinemaTest {
	@InjectMocks
	CinemaService cinemaService = new CinemaService();
	
	@Mock
	EntityManager em;
	
	 @Mock
	 Query query;
	
	@Test
	public void TestCinema() {
		List<Cinema> cinemaList = new ArrayList<Cinema>();
		
		Cinema testCinema = new Cinema();
		testCinema.setCinemaID(101L);
		testCinema.setCinemaAddress("64 Zoo Lane");
		testCinema.setCinemaContactNumber("0800001066");
		testCinema.setCinemaScreenAmount(7);
		testCinema.setCinemaManager("Mr. Manager");
		
		cinemaList.add(testCinema);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);		
		Mockito.when(query.getResultList()).thenReturn(cinemaList);
		
		//test add functionality
		List<Cinema>assertionList = cinemaService.getAllCinemas();
		Assert.assertEquals(assertionList.get(0).getCinemaID(), 101);
		Assert.assertEquals(assertionList.get(0).getCinemaAddress(), "64 Zoo Lane");	
		Assert.assertEquals(assertionList.get(0).getCinemaContactNumber(), "0800001066");
		Assert.assertEquals(assertionList.get(0).getCinemaScreenAmount(), 7);
		Assert.assertEquals(assertionList.get(0).getCinemaManager(), "Mr. Manager");
		
		//verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());		
	}
}
