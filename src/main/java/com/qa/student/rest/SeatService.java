package com.qa.student.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.Seat;

@Path("/seats")
@RequestScoped
public class SeatService {

		@Inject
		private EntityManager em;

		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Seat> getAllSeats() {
			final List<Seat> results = em.createQuery("select s from Seat s order by s.seatid").getResultList();
			return results;
		}
	}
