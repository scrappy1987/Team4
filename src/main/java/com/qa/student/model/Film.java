package com.qa.student.model;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Film {

	@Id
	@GeneratedValue
	private long filmId;

	@Column(name = "title")
	private String title;

	@Column(name = "release_date")
	private Calendar releaseDate;

	@Column(name = "description")
	private String description;

	/*
	 * @Column(name = "actor_id") private long actorId;
	 */

	@Column(name = "classification")
	private String classification;

	@Column(name = "duration")
	private String duration;

	@Column(name = "starRating")
	private int starRating;

	@Column(name = "genre")
	private String genre;

	@Column(name = "language")
	private String language;

	@Column(name = "subtitle")
	private boolean subtitle;

	@Column(name = "audioDescription")
	private boolean audioDescription;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Actor> actors = new HashSet<Actor>();

	public Film() {

	}

	public Film(long filmId, String title, Calendar releaseDate,
			String description, String classification, String duration,
			int starRating, String genre, String language, boolean subtitle,
			boolean audioDescription) {
		this.filmId = filmId;
		this.title = title;
		this.releaseDate = releaseDate;
		this.description = description;
		// this.actorId = actorId;
		this.classification = classification;
		this.duration = duration;
		this.starRating = starRating;
		this.genre = genre;
		this.language = language;
		this.subtitle = subtitle;
		this.audioDescription = audioDescription;
	}

	public long getFilmId() {
		return filmId;
	}

	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Calendar getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Calendar releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * public long getActorId() { return actorId; }
	 * 
	 * public void setActorId(long actorId) { this.actorId = actorId; }
	 */

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(boolean subtitle) {
		this.subtitle = subtitle;
	}

	public boolean isAudioDescription() {
		return audioDescription;
	}

	public void setAudioDescription(boolean audioDescription) {
		this.audioDescription = audioDescription;
	}

	public Set<Actor> getActors() {
		return actors;
	}

	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}

	// add to string for set of actors
	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", title=" + title + ", releaseDate="
				+ releaseDate.toString() + ", description=" + description
				+ ", classification=" + classification + ", duration="
				+ duration + ", starRating=" + starRating + ", genre=" + genre
				+ ", language=" + language + ", subtitle=" + subtitle
				+ ", audioDescription=" + audioDescription + "]";
	}

}
