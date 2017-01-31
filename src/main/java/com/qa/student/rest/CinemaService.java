package com.qa.student.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.Cinema;

@Path("/cinemas")
@RequestScoped
public class CinemaService {

	@Inject
	private EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cinema> getAllCinemas() {
		final List<Cinema> results = em.createQuery("select c from Cinema c order by c.cinemaID").getResultList();
		return results;
	}
}
