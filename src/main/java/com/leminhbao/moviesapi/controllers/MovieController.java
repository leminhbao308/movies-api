package com.leminhbao.moviesapi.controllers;

import com.leminhbao.moviesapi.collections.Movie;
import com.leminhbao.moviesapi.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<Page<Movie>> getAllMovies(@RequestParam(name = "page", required = false, defaultValue = "1") int page,
                                                    @RequestParam(name = "size", required = false, defaultValue = "5") int size) {
        return new ResponseEntity<>(movieService.allMovies(page - 1, size), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable String imdbId) {
        Optional<Movie> result = movieService.getMovieByImdbId(imdbId);

        return new ResponseEntity<>(result, result.isPresent() ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }
}
