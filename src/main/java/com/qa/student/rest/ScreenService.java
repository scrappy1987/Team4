package com.qa.student.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.Screen;

@Path("/screens")
@RequestScoped
public class ScreenService {

	@Inject
	private EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Screen> getAllScreens() {
		final List<Screen> results = em.createQuery("select s from Screen s order by c.screenID").getResultList();
		return results;
	}
}