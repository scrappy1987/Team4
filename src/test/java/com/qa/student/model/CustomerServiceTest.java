package com.qa.student.model;

import static org.junit.Assert.*;

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

import com.qa.student.rest.CustomerService;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {
	@InjectMocks
	CustomerService customerService = new CustomerService();
	@Mock
	EntityManager em;
	@Mock
	Query query;

	@Test
	public void test() {
		List<Customer> customerList = new ArrayList<Customer>();
		Customer aCustomer = new Customer();
		aCustomer.setfName("Bob");
		customerList.add(aCustomer);
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(customerList);
		// test the add functionality
		List<Customer> assertionList = customerService.getAllCustomers();
		Assert.assertEquals(assertionList.get(0).getfName(), "Bob");
		// verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());
	}
}
