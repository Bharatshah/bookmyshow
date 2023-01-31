package com.bms.movie.service;

import com.bms.movie.model.Movie;

public interface MovieService {
    Movie findMovieByMovieName(String name);
}
