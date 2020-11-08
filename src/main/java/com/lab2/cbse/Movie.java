package com.lab2.cbse;

public class Movie {
	private String title;
	private String director;
	private int movieLength;
	
	public Movie(String title, String director, int movieLength) {
		this.title = title;
		this.movieLength = movieLength;
		this.director = director;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}
}
