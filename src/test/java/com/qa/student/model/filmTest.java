package com.qa.student.model;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
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
public class filmTest {

	@InjectMocks
	Film film = Mockito.mock(Film.class);
	
	@Mock
	EntityManager em;
	
	@Mock
	Query query;
	
	@Test
	public void testFilmTitle(){
		film.setTitle("cool runnings");
		Mockito.when(film.getTitle()).thenReturn("cool runnings");
		assertEquals(film.getTitle(), "cool runnings");
	}

	@Test
	public void testFilmReleaseDate(){
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016,02,03);
		film.setReleaseDate(calendar);
		Mockito.when(film.getReleaseDate()).thenReturn(calendar);
		assertEquals(film.getReleaseDate(), calendar);
	}
	
	@Test
	public void testFilmDescription(){
		film.setDescription("A true classic");
		Mockito.when(film.getDescription()).thenReturn("A true classic");
		assertEquals(film.getDescription(), "A true classic");
	}
	
	@Test
	public void testFilmActorId(){
		Set<Actor> actors = new HashSet<Actor>();
		Actor anActor = new Actor();
		anActor.setFirstName("Bob");
		film.setActors(actors);
		Mockito.when(film.getActors()).thenReturn(actors);
		Set<Actor> assertionSet = film.getActors();
		Iterator<Actor> it = assertionSet.iterator();
		Actor a = it.next();
		assertEquals(a.getFirstName(), "Bob");
	}
	
	@Test
	public void testFilmClassification(){
		film.setClassification("PG");
		Mockito.when(film.getClassification()).thenReturn("PG");
		assertEquals(film.getClassification(), "PG");
	}	
	
	@Test
	public void testFilmDuration(){
		film.setDuration("150");
		Mockito.when(film.getDuration()).thenReturn("150");
		assertEquals(film.getDuration(), "150");
	}	
	
	@Test
	public void testFilmStarRating(){
		film.setStarRating(5);
		Mockito.when(film.getStarRating()).thenReturn(5);
		assertEquals(film.getStarRating(), 5);
	}	
	
	@Test
	public void testFilmGenre(){
		film.setGenre("comedy");
		Mockito.when(film.getGenre()).thenReturn("comedy");
		assertEquals(film.getGenre(), "comedy");
	}	
	
	@Test
	public void testFilmLanguage(){
		film.setLanguage("english");
		Mockito.when(film.getLanguage()).thenReturn("english");
		assertEquals(film.getLanguage(), "english");
	}	
	
	@Test
	public void testFilmSubtitle(){
		film.setSubtitle(false);
		Mockito.when(film.getSubtitle()).thenReturn(false);
		assertEquals(film.getSubtitle(), false);
	}	
	
	@Test
	public void testFilmAudioDescription(){
		film.setAudioDescription(false);
		Mockito.when(film.isAudioDescription()).thenReturn(false);
		assertEquals(film.isAudioDescription(), false);
	}	

}
