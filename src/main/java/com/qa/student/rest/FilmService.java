package com.qa.student.rest;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.qa.student.model.Film;

@Path("/films")
@RequestScoped
public class FilmService {

	@Inject
	private EntityManager em;
	
	@Inject
	FilmRest filmRest;
	
	Calendar calendar = Calendar.getInstance();
	//calendar.set(2016,02,03);
	
	Film hp = new Film(1, "Harry Potter", calendar,
			"Description", "PG", "150",
			4, "Fantasy", "English", false,
			false);

	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addMovieJSON() {
		
		filmRest.addFilm(hp);
		return "added movie " + hp.getTitle() + " " + hp.getDuration();
	}

	/*@GET
	@Path("/json")
	@Produces({ "application/json" })
	public Object getAllMoviesJSON() {
		Map<Long,Film> all = filmRest.getAllFilms();
		Gson gson = new Gson();
		
		Iterator it = all.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry pairs = (Map.Entry)it.next();
		    //jsonObject.put(pairs.getKey(), pairs.getValue() );
		}
		
		return gson;
	}*/
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Film> getAllFilms() {
		final List<Film> results = em.createQuery(
				"select f from Film f order by f.title").getResultList();
		return results;
	}
	
	
}
