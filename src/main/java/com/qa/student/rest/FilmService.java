package com.qa.student.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.Film;

@Path("/films")
@RequestScoped
public class FilmService {

	@Inject
	private EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Film> getAllFilms() {
		final List<Film> results = em.createQuery(
				"select f from Film f order by f.title").getResultList();
		return results;
	}
}
