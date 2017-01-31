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
import com.qa.student.model.Screen;
import com.qa.student.rest.ScreenService;

@RunWith(MockitoJUnitRunner.class)
public class ScreenTest {

	@InjectMocks
	ScreenService screenService = new ScreenService();
	
	@Mock
	EntityManager em;
	
	 @Mock
	 Query query;
	
	@Test
	public void TestScreen() {
		List<Screen> screenList = new ArrayList<Screen>();
		
		Screen testScreen = new Screen();
		testScreen.setScreenID(101L);
		testScreen.setCinemaID(101L);
		testScreen.setFilmID(101L);
		testScreen.setEventID(101L);
	
		screenList.add(testScreen);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);		
		Mockito.when(query.getResultList()).thenReturn(screenList);
		
		//test add functionality
		List<Screen>assertionList = screenService.getAllScreens();
		Assert.assertEquals(assertionList.get(0).getScreenID(), 101);
		Assert.assertEquals(assertionList.get(0).getCinemaID(), 101);
		Assert.assertEquals(assertionList.get(0).getFilmID(), 101);
		Assert.assertEquals(assertionList.get(0).getEventID(), 101);
	
		//verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());		
	}
}
