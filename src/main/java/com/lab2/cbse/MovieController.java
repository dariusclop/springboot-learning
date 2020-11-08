package com.lab2.cbse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@GetMapping("/movies")
	public String movies() {
		return "movies working";
	}
}
