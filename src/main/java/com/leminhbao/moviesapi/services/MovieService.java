package com.leminhbao.moviesapi.services;

import com.leminhbao.moviesapi.collections.Movie;
import com.leminhbao.moviesapi.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Page<Movie> allMovies(int page, int size) {
        return movieRepository.findAll(PageRequest.of(page, size));
    }

    public Optional<Movie> getMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
