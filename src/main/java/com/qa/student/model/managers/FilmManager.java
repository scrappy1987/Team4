package com.qa.student.model.managers;

import com.qa.student.model.Film;

public interface FilmManager {
	
	public String addFilm(Film film);
	
	public String getFilmDetails(long id);
	
}
