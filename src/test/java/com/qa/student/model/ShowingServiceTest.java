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

import com.qa.student.rest.ShowingService;

@RunWith(MockitoJUnitRunner.class)
public class ShowingServiceTest {

	@InjectMocks
	ShowingService showingService = new ShowingService();
	@Mock
	EntityManager em;
	@Mock
	Query query;

	@Test
	public void getAllShowingsTest() {
		List<Showing> showingList = new ArrayList<Showing>();
		Showing aShowing = new Showing();
		aShowing.setScreenId(1);
		showingList.add(aShowing);
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(showingList);
		// test the add functionality
		List<Showing> assertionList = showingService.getAllShowings();
		assertEquals(assertionList.get(0).getScreenId(), 1);
		// verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());
	}

}
