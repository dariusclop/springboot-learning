package com.lab2.cbse;

import java.util.Iterator;
import java.util.List;

public class MovieLister {
	private MovieFinder finder;
	
	public void setFinder(MovieFinder finder) { 
	     this.finder = finder;
	}
	  
	public Movie[] moviesDirectedBy(String arg) { 
	  List<Movie> allMovies = finder.findAll(); 
	  for (Iterator<Movie> it = allMovies.iterator(); it.hasNext();) { 
	     Movie movie = (Movie) it.next();
	     if (!movie.getDirector().equals(arg)) it.remove();}
	  return (Movie[]) allMovies.toArray(new Movie[allMovies.size()]); 
	}
	
}
