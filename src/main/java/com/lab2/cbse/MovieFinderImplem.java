package com.lab2.cbse;

import java.util.Arrays;
import java.util.List;

public class MovieFinderImplem implements MovieFinder {
	private List<Movie> createMovieList() {
		Movie movie1 = new Movie("FirstTitle", "Alex", 90);
		Movie movie2 = new Movie("SecondTitle", "Vlad", 110);
		Movie movie3 = new Movie("ThirdTitle", "Darius", 115);
		Movie movie4 = new Movie("FourthTitle", "Darius", 87);
		Movie movie5 = new Movie("FifthTitle", "Alex", 88);
		return Arrays.asList(movie1, movie2, movie3, movie4, movie5);
	}

	@Override
	public List<Movie> findAll() {
		return createMovieList();
	}

}
