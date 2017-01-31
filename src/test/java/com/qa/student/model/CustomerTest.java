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

 import com.qa.student.model.Customer;
 import com.qa.student.rest.CustomerService;

@RunWith(MockitoJUnitRunner.class)
 public class CustomerTest {

 @InjectMocks
  CustomerService customerService = new CustomerService();

 @Mock
  EntityManager em;

 @Mock
  Query query;
 
 @Test
 public void testIdGettersandSetters() {
  List<Customer> customerList = new ArrayList<Customer>();
  Customer customer1 = new Customer();
  customer1.setCustomerId((long)1);
  customerList.add(customer1);
  Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
  Mockito.when(query.getResultList()).thenReturn(customerList);
  // test the add functionality
  List<Customer> assertionList = customerService.getAllCustomers();
  Assert.assertEquals(assertionList.get(0).getCustomerId(), 1);
  // verify the behavior
  Mockito.verify(em).createQuery(Mockito.anyString());
 }

 @Test
  public void testFNameGettersandSetters() {
   List<Customer> customerList = new ArrayList<Customer>();
   Customer customer1 = new Customer();
   customer1.setfName("firstname");
   customerList.add(customer1);
   Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
   Mockito.when(query.getResultList()).thenReturn(customerList);
   // test the add functionality
   List<Customer> assertionList = customerService.getAllCustomers();
   Assert.assertEquals(assertionList.get(0).getfName(), "firstname");
   // verify the behavior
   Mockito.verify(em).createQuery(Mockito.anyString());
  }

 @Test
 public void testLNameGettersandSetters() {
  List<Customer> customerList = new ArrayList<Customer>();
  Customer customer1 = new Customer();
  customer1.setlName("lastname");
  customerList.add(customer1);
  Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
  Mockito.when(query.getResultList()).thenReturn(customerList);
  // test the add functionality
  List<Customer> assertionList = customerService.getAllCustomers();
  Assert.assertEquals(assertionList.get(0).getlName(), "lastname");
  // verify the behavior
  Mockito.verify(em).createQuery(Mockito.anyString());
 }

 @Test
 public void testEmailGettersandSetters() {
  List<Customer> customerList = new ArrayList<Customer>();
  Customer customer1 = new Customer();
  customer1.setEmail("email");
  customerList.add(customer1);
  Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
  Mockito.when(query.getResultList()).thenReturn(customerList);
  // test the add functionality
  List<Customer> assertionList = customerService.getAllCustomers();
  Assert.assertEquals(assertionList.get(0).getEmail(), "email");
  // verify the behavior
  Mockito.verify(em).createQuery(Mockito.anyString());
 }

 @Test
 public void testPasswordGettersandSetters() {
  List<Customer> customerList = new ArrayList<Customer>();
  Customer customer1 = new Customer();
  customer1.setPassword("password");
  customerList.add(customer1);
  Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
  Mockito.when(query.getResultList()).thenReturn(customerList);
  // test the add functionality
  List<Customer> assertionList = customerService.getAllCustomers();
  Assert.assertEquals(assertionList.get(0).getPassword(), "password");
  // verify the behavior
  Mockito.verify(em).createQuery(Mockito.anyString());
 }

 @Test
 public void testAgeGettersandSetters() {
  List<Customer> customerList = new ArrayList<Customer>();
  Customer customer1 = new Customer();
  customer1.setAge((short)1);
  customerList.add(customer1);
  Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
  Mockito.when(query.getResultList()).thenReturn(customerList);
  // test the add functionality
  List<Customer> assertionList = customerService.getAllCustomers();
  Assert.assertEquals(assertionList.get(0).getAge(), 1);
  // verify the behavior
  Mockito.verify(em).createQuery(Mockito.anyString());
 }

}

