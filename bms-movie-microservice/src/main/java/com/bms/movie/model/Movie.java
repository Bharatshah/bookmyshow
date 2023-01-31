package com.bms.movie.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Document("movie")
public class Movie {

	@Id
	private int movieId;
	
	private String movieName;
	
	private String language;
	
	private String duration;
	
	private String genre;
	
	private String plotDescription;
	
	private String castAndCrew;
	
	public Movie() {
		
	}

	public Movie(int movieId, String movieName, String language, String duration, String genre, String plotDescription,
			String castAndCrew) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.duration = duration;
		this.genre = genre;
		this.plotDescription = plotDescription;
		this.castAndCrew = castAndCrew;
	}
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlotDescription() {
		return plotDescription;
	}

	public void setPlotDescription(String plotDescription) {
		this.plotDescription = plotDescription;
	}

	public String getCastAndCrew() {
		return castAndCrew;
	}

	public void setCastAndCrew(String castAndCrew) {
		this.castAndCrew = castAndCrew;
	}
}
