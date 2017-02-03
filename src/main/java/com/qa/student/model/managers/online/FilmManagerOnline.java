package com.qa.student.model.managers.online;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.qa.student.model.Film;
import com.qa.student.model.managers.FilmManager;

public class FilmManagerOnline implements FilmManager {

	@Inject
	private EntityManager entityManager;

	@Override
	public String addFilm(Film film) {
		//create database entry from film object
		entityManager.persist(film);
		return "Successfully added";
	}

	@Override
	public String getFilmDetails(long id) {
		List<Film> returnedFilm = entityManager.createQuery(""
				+ "select f from Film f where f.filmId = :filmDetailsID").setParameter("filmDetailsID", id) .getResultList();
		//check not null?
		String details = returnedFilm.get(0).toString();
		return details;
	}


}
