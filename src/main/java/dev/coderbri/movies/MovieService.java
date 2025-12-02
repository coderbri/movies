package dev.coderbri.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    /* ---- GET All Movies ----- */
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    /* --- GET Single Movies --- */
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
