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
import com.qa.student.model.Event;
import com.qa.student.rest.EventService;

@RunWith(MockitoJUnitRunner.class)
public class EventTest {

    @InjectMocks
    EventService eventService = new EventService();
    Event event = Mockito.mock(Event.class);
    
    @Mock
    EntityManager em;
    
    @Mock
    Query query; 
    
    @Test
    public void eventIdTest(){
        Mockito.when(event.getEventID()).thenReturn((long)1);
        assertEquals(event.getEventID(),1);
    }
    
    @Test
    public void eventTitleTest(){
        event.setEventTitle("Tea in the Park");
        Mockito.when(event.getEventTitle()).thenReturn("Tea in the Park");
        assertEquals(event.getEventTitle(),"Tea in the Park");
    }
    
    @Test
    public void eventDateTest(){
        event.setEventDate("10/04/18");
        Mockito.when(event.getEventDate()).thenReturn("10/04/18");
        assertEquals(event.getEventDate(),"10/04/18");
    }
    
    @Test
    public void eventDescriptionTest(){
        event.setEventDescription("Food & Drink");
        Mockito.when(event.getEventDescription()).thenReturn("Food & Drink");
        assertEquals(event.getEventDescription(),"Food & Drink");
    }
    
    @Test
    public void eventDurationTest(){
        event.setEventDuration(3);
        Mockito.when(event.getEventDuration()).thenReturn(3);
        assertEquals(event.getEventDuration(),3);
    }
    
    @Test
    public void eventFiveStarRatingTest(){
        event.setEventFiveStarRating(5);
        Mockito.when(event.getEventFiveStarRating()).thenReturn(5);
        assertEquals(event.getEventFiveStarRating(),5);
    }

}
