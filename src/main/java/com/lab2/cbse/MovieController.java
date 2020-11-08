package com.lab2.cbse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	private ApplicationContext ctx;

	@GetMapping("/movies")
	public String movies() {
		ctx = new FileSystemXmlApplicationContext("movie.xml"); 
	    MovieLister lister = (MovieLister) ctx.getBean("MovieLister");
	    Movie[] movies = lister.moviesDirectedBy("Darius");
	    for (int i = 0; i < movies.length; i++) { 
	    	System.out.println(movies[i].getTitle());
		}
		return "movies working";
	}
}
