package com.qa.student.rest;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.student.model.Cinema;

@Path("/cinema")
public class CinemaRest {

	@Inject
	CinemaService cinemaService;
	/*private EntityManager em;*/

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getCinemas()
	{
		return cinemaService.convertCinemaMapToJSON();
	}
	
	/*public List<Cinema> getAllCinemas() {
		final List<Cinema> results = em.createQuery(
				"select c from Cinema c order by c.cinemaID").getResultList();
		return results;
	}*/

	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addCinema(String aCinema) {
		return cinemaService.addCinemaToMap(aCinema);
	}
}
