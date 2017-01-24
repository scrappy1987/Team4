package com.qa.student.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.Venue;

@Path("/venues")
@RequestScoped
public class VenueService {

	@Inject
	private EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Venue> getAllEvents() {
		final List<Venue> results = em.createQuery("select v from Venue v order by v.name").getResultList();
		return results;
	}
}
