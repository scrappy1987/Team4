package com.qa.student.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Actor {

		@Id
		@GeneratedValue
		private Long actorId;
		
		@Column(name = "firstname")
		private String firstName;
		
		private String surname;


		@OneToMany(cascade = CascadeType.ALL)
		private Set<Film> films = new HashSet<Film>();
		
		public Actor(){
			
		}
		
		public Actor(Long actorId, String firstName, String surname) {
			this.actorId = actorId;
			this.firstName = firstName;
			this.surname = surname;
		}

		public Long getActorId() {
			return actorId;
		}

		public void setActorId(Long actorId) {
			this.actorId = actorId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}
		
		public Set<Film> getFilms(){
			return films;
		}
		
		public void setFilms(Set<Film> films){
			this.films = films;
		}

		@Override
		public String toString() {
			return "Actor [actorId=" + actorId + ", firstName=" + firstName
					+ ", surname=" + surname + "]";
		}
		
		
		
		
}
