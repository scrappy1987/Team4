package com.qa.student.rest;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.qa.student.model.Film;

public class FilmRest {
	
	private Map<Long,Film> hfilm;

	public FilmRest() {
		hfilm = new HashMap<Long,Film>();
	}
	
	public String addFilm(Film film) {
		Gson gson = new Gson();
		Film newFilm = gson.fromJson(film.getTitle(), Film.class);
		hfilm.put(film.getFilmId(),newFilm);
		System.out.println("Added to map");
		return "Movie added to map";
	}
	
	public Film getFilmDetails(long id) {
		return(hfilm.get(id));
	}
	
	public String convertMovieMapToJSon() {
		Gson gson = new Gson();
		String filmString = gson.toJson(hfilm);
		System.out.println("This is the value of aString " + filmString);
		return filmString;
	}	
}