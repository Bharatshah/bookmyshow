package com.bms.movie.controller;

import com.bms.movie.model.Movie;
import com.bms.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/movies/{movieName}")
	public Movie getMovies(@PathVariable String movieName) {
		return movieService.findMovieByMovieName(movieName);
	}

}
