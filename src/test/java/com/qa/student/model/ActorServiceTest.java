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

import com.qa.student.rest.ActorService;
@RunWith(MockitoJUnitRunner.class)
public class ActorServiceTest {

	@InjectMocks
	ActorService actorService = new ActorService();
	@Mock
	EntityManager em;
	@Mock
	Query query;

	@Test
	public void test() {
		List<Actor> actorList = new ArrayList<Actor>();
		Actor anActor = new Actor();
		anActor.setFirstName("bob");
		actorList.add(anActor);
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(actorList);
		// test the add functionality
		List<Actor> assertionList = actorService.getAllActors();
		assertEquals(assertionList.get(0).getFirstName(), "bob");
		// verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());
	}

}
