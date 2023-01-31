package com.bms.movie.repository;

import com.bms.movie.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MovieRepository extends MongoRepository<Movie, String> {

    @Query("{name:'?0'}")
    Movie findMovieByMovieName(String name);

    List<Movie> findAll(String category);


}
