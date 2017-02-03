package com.qa.student.model.managers.offline;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.qa.student.model.Film;
import com.qa.student.model.managers.FilmManager;

public class FilmManagerOffline implements FilmManager {

	private Map<Long, Film> hfilm;

	public FilmManagerOffline() {
		hfilm = new HashMap<Long, Film>();
	}

	public String addFilm(Film film) {
		Gson gson = new Gson();
		Film newFilm = gson.fromJson(film.getTitle(), Film.class);
		hfilm.put(film.getFilmId(), newFilm);
		System.out.println("Added to map");
		return "Movie added to map";
	}

	public String getFilmDetails(long id) {
		Gson gson = new Gson();
		String filmDetailsString = gson.toJson(hfilm.get(id));
		System.out.println("This is the value of aString" + filmDetailsString);
		return filmDetailsString;

	}

	public String convertMovieMapToJSon() {
		Gson gson = new Gson();
		String filmString = gson.toJson(hfilm);
		System.out.println("This is the value of aString " + filmString);
		return filmString;
	}

}
