package com.qa.student.rest;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.Actor;

@Path("/actors")
@RequestScoped
public class ActorService {

		@Inject
		private EntityManager em;

		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Actor> getAllActors() {
			final List<Actor> results = em.createQuery("select a from Actor a order by a.firstname").getResultList();
			return results;
		}
	}