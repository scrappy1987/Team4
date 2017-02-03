package com.qa.student.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.Showing;

@Path("/showings")
@RequestScoped
public class ShowingService{

	@Inject
	private EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Showing> getAllShowings() {
		final List<Showing> results = em.createQuery("select v from Venue v order by v.name").getResultList();
		return results;
	}
}
