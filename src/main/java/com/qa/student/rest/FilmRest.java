package com.qa.student.rest;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.Film;

@Path("/film")
public class FilmRest 
{
	@Inject
	FilmService filmService;
	//private EntityManager em;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getFilms()
	{
		return filmService.convertFilmMapToJSON();
	}
	
	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addFilm(String aFilm) {
		return filmService.addFilmToMap(aFilm);
	
	
//	@GET
//	@Path("/json")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Film> getAllFilms() {
//		final List<Film> results = em.createQuery("select f from Film f order by f.title").getResultList();
//		return results;
//	}

}
