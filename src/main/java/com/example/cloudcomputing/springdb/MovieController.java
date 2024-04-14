package com.example.cloudcomputing.springdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    IMovieService movieService;

    @Autowired
    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        System.out.println(movie.getId() + movie.getTitle() + movie.getGenre() + movie.getYear());
        return movieService.saveMovie(movie);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return movieService.getAllMovies();
    }
}
