package com.qa.student.rest;

import java.util.HashMap;
import java.util.Map;

import com.qa.student.model.Cinema;

import com.google.gson.Gson;

public class CinemaService {

	private Map<Integer, Cinema> cinemaMap;

	public CinemaService() {
		cinemaMap = new HashMap<Integer, Cinema>();
		populateMethod();
	}

	public String populateMethod() {
		Cinema darlington = new Cinema(1, "DARLO", "01325 784596", 5, "Mrs Manager");
		cinemaMap.put(1, darlington);

		return "Map correctly populated";
	}

	public String addCinemaToMap(String aCinema) {
		Gson gson = new Gson();
		Cinema newCinema = gson.fromJson(aCinema, Cinema.class);
		cinemaMap.put(3, newCinema);
		System.out.println("added to map");
		return "Cinema added to map";
	}

	public String convertCinemaMapToJSON() {
		Gson gson = new Gson();
		String aString = gson.toJson(cinemaMap);
		return aString;
		// System.out.println(aString);
	}

}
