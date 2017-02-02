package com.qa.student.model;

import static org.junit.Assert.*;

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

import com.qa.student.rest.CinemaService;

@RunWith(MockitoJUnitRunner.class)
public class CinemaServiceTest {

	@InjectMocks
	CinemaService cinemaService = new CinemaService();
	@Mock
	EntityManager em;
	@Mock
	Query query;

	@Test
	public void test() {
		List<Cinema> cinemaList = new ArrayList<Cinema>();
		Cinema aCinema = new Cinema();
		aCinema.setCinemaManager("Bob");
		cinemaList.add(aCinema);
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(cinemaList);
		// test the add functionality
		List<Cinema> assertionList = cinemaService.getAllCinemas();
		Assert.assertEquals(assertionList.get(0).getCinemaManager(), "Bob");
		// verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());
	}

}
