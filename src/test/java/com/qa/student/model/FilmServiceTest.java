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
public class FilmServiceTest {

	@InjectMocks
	FilmService filmService = new FilmService();
	@Mock
	EntityManager em;
	@Mock
	Query query;

	@Test
	public void getAllFilmsTest() {
		List<Film> filmList = new ArrayList<Film>();
		Film aFilm = new Film();
		aFilm.setTitle("cool runnings");
		filmList.add(aFilm);
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(filmList);
		// test the add functionality
		List<Film> assertionList = filmService.getAllFilms();
		assertEquals(assertionList.get(0).getTitle(), "cool runnings");
		// verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());
	}

}
