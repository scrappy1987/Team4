package com.qa.student.model.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.qa.student.model.Actor;
import com.qa.student.model.managers.ActorManager;

@Alternative
@Stateless
public class ActorManagerOnline implements ActorManager {

	@Inject private EntityManager entityManager;
	
	@Override
	public List<Actor> findAllActors() {
		return entityManager.createQuery("select a from Actor a order by a.firstname").getResultList();
	}

}
