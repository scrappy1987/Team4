package com.qa.student.model;

import java.util.ArrayList;
import java.util.Date;
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

import com.qa.student.model.Showing;
import com.qa.student.rest.ShowingService;

@RunWith(MockitoJUnitRunner.class)
public class ShowingTest {

@InjectMocks
 ShowingService showingService = new ShowingService();

@Mock
 EntityManager em;

@Mock
 Query query;

@Test
 public void testIdGettersandSetters() {
  List<Showing> showingList = new ArrayList<Showing>();
  Showing showing1 = new Showing();
  showing1.setShowingId((long)1);
  showingList.add(showing1);
  Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
  Mockito.when(query.getResultList()).thenReturn(showingList);
  // test the add functionality
  List<Showing> assertionList = showingService.getAllShowings();
  Assert.assertEquals(assertionList.get(0).getShowingId(), 1);
 // verify the behavior
  Mockito.verify(em).createQuery(Mockito.anyString());
 }

@Test
public void testScreenIdGettersandSetters() {
 List<Showing> showingList = new ArrayList<Showing>();
 Showing showing1 = new Showing();
 showing1.setScreenId((long)1);
 showingList.add(showing1);
 Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
 Mockito.when(query.getResultList()).thenReturn(showingList);
 // test the add functionality
 List<Showing> assertionList = showingService.getAllShowings();
 Assert.assertEquals(assertionList.get(0).getScreenId(), 1);
// verify the behavior
 Mockito.verify(em).createQuery(Mockito.anyString());
}

@Test
public void testSeatIdGettersandSetters() {
 List<Showing> showingList = new ArrayList<Showing>();
 Showing showing1 = new Showing();
 showing1.setSeatId(1);
 showingList.add(showing1);
 Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
 Mockito.when(query.getResultList()).thenReturn(showingList);
 // test the add functionality
 List<Showing> assertionList = showingService.getAllShowings();
 Assert.assertEquals(assertionList.get(0).getSeatId(), 1);
// verify the behavior
 Mockito.verify(em).createQuery(Mockito.anyString());
}

@Test
public void testDateTimeGettersandSetters() {
 List<Showing> showingList = new ArrayList<Showing>();
 Showing showing1 = new Showing();
 Date dateobj = new Date();
 showing1.setDateTime(dateobj);
 showingList.add(showing1);
 Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
 Mockito.when(query.getResultList()).thenReturn(showingList);
 // test the add functionality
 List<Showing> assertionList = showingService.getAllShowings();
 Assert.assertEquals(assertionList.get(0).getDateTime(), dateobj);
// verify the behavior
 Mockito.verify(em).createQuery(Mockito.anyString());
}

}
