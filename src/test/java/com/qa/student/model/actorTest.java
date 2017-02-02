package com.qa.student.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
	Actor anActor = Mockito.mock(Actor.class);
	
	@Mock
	EntityManager em;
	
	@Mock
	Query query;
	
	@Test
	public void testActorFirstName(){
		anActor.setFirstName("Bob");
		Mockito.when(anActor.getFirstName()).thenReturn("Bob");
		assertEquals(anActor.getFirstName(), "Bob");
	}


	@Test
	public void testActorSecondName(){
		anActor.setSurname("Smith");
		Mockito.when(anActor.getSurname()).thenReturn("Smith");
		assertEquals(anActor.getSurname(), "Smith");
	}
	
	@Test
	public void setGetTickets() {
		Set<Film> filmList = new HashSet<Film>();
		Film aFilm = new Film();
		aFilm.setTitle("Jaws");
		filmList.add(aFilm);
		anActor.setFilms(filmList);
		Mockito.when(anActor.getFilms()).thenReturn(filmList);
		Set<Film> assertionSet = anActor.getFilms();
		Iterator<Film> i = assertionSet.iterator();
		Film f = i.next();
		assertEquals(f.getTitle(), "Jaws");

	}

}
