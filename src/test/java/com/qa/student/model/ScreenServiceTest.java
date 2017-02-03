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

import com.qa.student.rest.ScreenService;

@RunWith(MockitoJUnitRunner.class)
public class ScreenServiceTest {

	@InjectMocks
	ScreenService screenService = new ScreenService();
	@Mock
	EntityManager em;
	@Mock
	Query query;

	@Test
	public void getAllScreensTest() {
		List<Screen> screenList = new ArrayList<Screen>();
		Screen aScreen = new Screen();
		aScreen.setCinemaID(1);
		screenList.add(aScreen);
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(screenList);
		// test the add functionality
		List<Screen> assertionList = screenService.getAllScreens();
		assertEquals(assertionList.get(0).getCinemaID(), 1);
		// verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());
	}

}
