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

import com.qa.student.rest.FilmService;
@RunWith(MockitoJUnitRunner.class)

public class filmTest {

	@InjectMocks
	FilmService filmService = new FilmService();
	
	@Mock
	EntityManager em;
	
	@Mock
	Query query;
	
	@Test
	public void testFilmTitle(){
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setTitle("cool runnings");
		filmList.add(aFilm);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).getTitle(), "cool runnings");
		Mockito.verify(em).createQuery(Mockito.anyString());
	}

	@Test
	public void testFilmReleaseDate(){
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setReleaseDate("2016-12-03");
		filmList.add(aFilm);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).getReleaseDate(), "2016-12-03");
		Mockito.verify(em).createQuery(Mockito.anyString());
	}
	
	@Test
	public void testFilmDescription(){
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setDescription("A true classic");
		filmList.add(aFilm);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).getDescription(), "A true classic");
		Mockito.verify(em).createQuery(Mockito.anyString());
	}
	
	@Test
	public void testFilmActorId(){
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setActorId(123456789);
		filmList.add(aFilm);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).getActorId(), 123456789);
		Mockito.verify(em).createQuery(Mockito.anyString());
	}
	
	@Test
	public void testFilmClassification(){
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setClassification("PG");
		filmList.add(aFilm);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).getClassification(), "PG");
		Mockito.verify(em).createQuery(Mockito.anyString());
	}	
	
	@Test
	public void testFilmDuration(){
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setDuration("1hour 30minutes");
		filmList.add(aFilm);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).getDuration(), "1hour 30minutes");
		Mockito.verify(em).createQuery(Mockito.anyString());
	}	
	
	@Test
	public void testFilmStarRating(){
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setStarRating(5);
		filmList.add(aFilm);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).getStarRating(), 5);
		Mockito.verify(em).createQuery(Mockito.anyString());
	}	
	
	@Test
	public void testFilmGenre(){
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setGenre("Sports");
		filmList.add(aFilm);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).getGenre(), "Sports");
		Mockito.verify(em).createQuery(Mockito.anyString());
	}	
	
	@Test
	public void testFilmLanguage(){
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setLanguage("English");
		filmList.add(aFilm);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).getLanguage(), "English");
		Mockito.verify(em).createQuery(Mockito.anyString());
	}	
	
	@Test
	public void testFilmSubtitle(){
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setSubtitle("Scottish");
		filmList.add(aFilm);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).getSubtitle(), "Scottish");
		Mockito.verify(em).createQuery(Mockito.anyString());
	}	
	
	@Test
	public void testFilmAudioDescription(){
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setAudioDescription(true);
		filmList.add(aFilm);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).isAudioDescription(), true);
		Mockito.verify(em).createQuery(Mockito.anyString());
	}	
	
	
	
	
	
	
	
	
}
