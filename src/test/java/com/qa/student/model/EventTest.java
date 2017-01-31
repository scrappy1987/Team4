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
import com.qa.student.model.Event;
import com.qa.student.rest.EventService;

@RunWith(MockitoJUnitRunner.class)
public class EventTest {

	@InjectMocks
	EventService eventService = new EventService();
	
	@Mock
	EntityManager em;
	
	 @Mock
	 Query query; 
	
	@Test 
	public void EventScreen() { 
		List<Event> eventList = new ArrayList<Event>();
		
		Event testEvent = new Event();
		testEvent.setEventID(101L);
		testEvent.setEventTitle("Tea in the Park");
		testEvent.setEventDate("10/04/18");
		testEvent.setEventDescription("Food & Drink");
		testEvent.setEventDuration(3);
		testEvent.setEventFiveStarRating(5);

		
		eventList.add(testEvent);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);		
		Mockito.when(query.getResultList()).thenReturn(eventList);
		
		//test add functionality
		List<Event>assertionList = eventService.getAllEvents();
		Assert.assertEquals(assertionList.get(0).getEventID(), 101);
		Assert.assertEquals(assertionList.get(0).getEventTitle(), "Tea in the Park");
		Assert.assertEquals(assertionList.get(0).getEventDate(), "10/04/18");
		Assert.assertEquals(assertionList.get(0).getEventDescription(), "Food & Drink");
		Assert.assertEquals(assertionList.get(0).getEventDuration(), 3);
		Assert.assertEquals(assertionList.get(0).getEventFiveStarRating(), 5);
		
		
		//verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());		
	}
}
