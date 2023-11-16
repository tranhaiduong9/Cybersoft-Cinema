package com.cybersoft.cybersoftcinema.service.imp;

import com.cybersoft.cybersoftcinema.entity.PersonEntity;
import com.cybersoft.cybersoftcinema.payload.response.MovieResponse;
import com.cybersoft.cybersoftcinema.payload.response.MovieTypeResponse;
import com.cybersoft.cybersoftcinema.payload.response.PersonResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

public interface MovieServiceImp {

    boolean insertMovie(String name, int requireAge, int duration, int idCountry, Date releaseDate, String content,
                        MultipartFile file, int idMovieStatus) throws IOException;

    byte[] getMovieImage(String imageName) throws IOException;

    List<MovieResponse> getMovie(int idMovie) throws IOException;

    List<MovieResponse> getMovieByName (String movieName);

    List<MovieResponse> getAllShowingMoviePoster();

    List<MovieResponse> getAllUpcomingMoviePoster();

    List<MovieResponse> getAllMovie() throws IOException;

    List<MovieTypeResponse> getAllMovieType();

    List<PersonResponse> getAllPerson();
}
