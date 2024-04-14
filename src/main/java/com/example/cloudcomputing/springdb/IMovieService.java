package com.example.cloudcomputing.springdb;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IMovieService {
    ResponseEntity<Movie> saveMovie(Movie movie);
    ResponseEntity<List<Movie>> getAllMovies();
}