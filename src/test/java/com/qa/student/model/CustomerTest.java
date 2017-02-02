 package com.qa.student.model;
 import static org.junit.Assert.assertEquals;

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

 import com.qa.student.model.Customer;
 import com.qa.student.rest.CustomerService;

@RunWith(MockitoJUnitRunner.class)
 public class CustomerTest {

 @InjectMocks
  Customer customer = Mockito.mock(Customer.class);

 @Mock
  EntityManager em;

 @Mock
  Query query;
 
 @Test
 public void testIdGettersandSetters() {
	Mockito.when(customer.getCustomerId()).thenReturn((long)1);
	assertEquals(customer.getCustomerId(),1);
 }

 @Test
  public void testFNameGettersandSetters() {
	 Mockito.when(customer.getfName()).thenReturn("Bob");
	 assertEquals(customer.getfName(),"Bob");
  }

 @Test
 public void testLNameGettersandSetters() {
	 Mockito.when(customer.getlName()).thenReturn("Smith");
	 assertEquals(customer.getlName(),"Smith");
 }

 @Test
 public void testEmailGettersandSetters() {
	 Mockito.when(customer.getEmail()).thenReturn("bob.smith@email.com");
	 assertEquals(customer.getEmail(),"bob.smith@email.com");
 }

 @Test
 public void testPasswordGettersandSetters() {
	 Mockito.when(customer.getPassword()).thenReturn("pass");
	 assertEquals(customer.getPassword(),"pass");
 }

 @Test
 public void testAgeGettersandSetters() {
	 Mockito.when(customer.getAge()).thenReturn((short) 2);
	 assertEquals(customer.getAge(),2);
 }

}

