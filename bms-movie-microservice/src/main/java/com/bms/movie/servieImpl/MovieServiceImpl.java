package com.bms.movie.servieImpl;

import com.bms.movie.model.Movie;
import com.bms.movie.repository.MovieRepository;
import com.bms.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public Movie findMovieByMovieName(String name) {
        return movieRepository.findMovieByMovieName(name);
    }
}
