package com.qa.student.model.managers.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import com.qa.student.model.Actor;
import com.qa.student.model.managers.ActorManager;

@Default
@Stateless
public class ActorManagerOffline implements ActorManager {
	
	@Override
	public List<Actor> findAllActors() {
		// TODO Auto-generated method stub
		return null;
	}

}
