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

import com.qa.student.model.Screen;

@RunWith(MockitoJUnitRunner.class)
public class ScreenTest {

	@InjectMocks
	Screen screen = Mockito.mock(Screen.class);

	@Mock
	EntityManager em;

	@Mock
	Query query;

	@Test
	public void getSetScreenID() {
		screen.setScreenID(1);
		Mockito.when(screen.getScreenID()).thenReturn((long) 1);
		assertEquals(screen.getScreenID(), (long) 1);
	}

	@Test
	public void getSetCinemaID() {
		screen.setCinemaID(101L);
		Mockito.when(screen.getCinemaID()).thenReturn((long) 1);
		assertEquals(screen.getCinemaID(), (long) 1);
	}

	@Test
	public void getSetFilmID() {
		screen.setFilmID(1);
		Mockito.when(screen.getFilmID()).thenReturn((long) 1);
		assertEquals(screen.getFilmID(), (long) 1);
	}

	@Test
	public void getSetEventID() {
		screen.setEventID(1);
		Mockito.when(screen.getEventID()).thenReturn((long) 1);
		assertEquals(screen.getEventID(), (long) 1);
	}

}
