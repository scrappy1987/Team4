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
import com.qa.student.rest.EventService;

@RunWith(MockitoJUnitRunner.class)
public class EventServiceTest {
    @InjectMocks
    EventService eventService = new EventService();
    @Mock
    EntityManager em;
    @Mock
    Query query;

    @Test
    public void getAllTicketsTest() {
        List<Event> eventList = new ArrayList<Event>();
        Event aEvent = new Event();
        aEvent.setEventID((long) 1);
        eventList.add(aEvent);
        Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
        Mockito.when(query.getResultList()).thenReturn(eventList);
        // test the add functionality
        List<Event> assertionList = eventService.getAllEvents();
        assertEquals(assertionList.get(0).getEventID(), 1);
        // verify the behavior
        Mockito.verify(em).createQuery(Mockito.anyString());
    }
}