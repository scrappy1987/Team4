package com.qa.student.rest;

import java.util.HashMap;
import java.util.Map;

import com.qa.student.model.Cinema;
import com.qa.student.model.Film;
import com.google.gson.Gson;
public class FilmService 
{
	private Map<Integer, Film> filmMap;
	
	public FilmService() {
		filmMap = new HashMap<Integer, Film>();
		populateMethod();
	}
	
	public String populateMethod() {
		Film shrek = new Film(1, "Shrek", "02/03/04", "This is a film", 1234l, null, null, 0, null, null, null, false)
		cinemaMap.put(1, darlington);

		return "Map correctly populated";
	}
	

		@Inject
		private EntityManager em;

		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Film> getAllFilms() {
			final List<Film> results = em.createQuery("select f from Film f order by f.title").getResultList();
			return results;
		}
	}
