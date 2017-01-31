package com.qa.student.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.Ticket;

@Path("/bookings")
@RequestScoped
public class BookingService {

	@Inject
	private EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Ticket> getAllTickets() {
		final List<Ticket> results = em.createQuery("select t from Ticket t order by t.Id").getResultList();
		return results;
	}
}
