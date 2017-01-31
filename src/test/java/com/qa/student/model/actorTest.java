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
import com.qa.student.rest.FilmService;
@RunWith(MockitoJUnitRunner.class)

public class actorTest {

	@InjectMocks
	ActorService actorService = new ActorService();
	
	@Mock
	EntityManager em;
	
	@Mock
	Query query;
	
	@Test
	public void testActorFirstName(){
		List<Actor> actorList = new ArrayList<Actor>();
		Actor anActor = new Actor();
		anActor.setFirstName("Bob");
		actorList.add(anActor);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(actorList);
		
		List<Actor> assertionList = actorService.getAllActors();
		assertEquals(assertionList.get(0).getFirstName(), "Bob");
		Mockito.verify(em).createQuery(Mockito.anyString());
	}


	@Test
	public void testActorSecondName(){
		List<Actor> actorList = new ArrayList<Actor>();
		Actor anActor = new Actor();
		anActor.setSurname("Bob");
		actorList.add(anActor);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(actorList);
		
		List<Actor> assertionList = actorService.getAllActors();
		assertEquals(assertionList.get(0).getSurname(), "Bob");
		Mockito.verify(em).createQuery(Mockito.anyString());
	}
}
