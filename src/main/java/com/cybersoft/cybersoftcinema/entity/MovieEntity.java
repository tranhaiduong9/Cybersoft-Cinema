package com.cybersoft.cybersoftcinema.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "movie")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "rating")
    private double rating;

    @Column(name = "requiredage")
    private int requiredAge;

    @Column(name = "duration")
    private int duration;

    @Column(name = "releasedate")
    private Date releaseDate;

    @Column(name = "content")
    private String content;

    @Column(name = "images")
    private String images;

    @OneToMany(mappedBy = "movieEntity")
    private List<MovieMovieTypeEntity> movieMovieTypeEntities;

    @ManyToOne
    @JoinColumn(name = "idCountry")
    private CountryEntity countryEntity;

    @ManyToOne
    @JoinColumn(name = "idMoviestatus")
    private MovieStatusEntity movieStatusEntity;

    @OneToMany(mappedBy = "movieEntity")
    private List<MovieProducerEntity> movieProducerEntity;

    @OneToMany(mappedBy = "movieEntity")
    private List<PersonMovieEntity> personMovieEntities;

    public List<MovieProducerEntity> getMovieProducerEntity() {
        return movieProducerEntity;
    }

    public void setMovieProducerEntity(List<MovieProducerEntity> movieProducerEntity) {
        this.movieProducerEntity = movieProducerEntity;
    }

    public List<MovieMovieTypeEntity> getMovieMovieTypeEntities() {
        return movieMovieTypeEntities;
    }

    public void setMovieMovieTypeEntities(List<MovieMovieTypeEntity> movieMovieTypeEntities) {
        this.movieMovieTypeEntities = movieMovieTypeEntities;
    }

    public CountryEntity getCountryEntity() {
        return countryEntity;
    }

    public void setCountryEntity(CountryEntity countryEntity) {
        this.countryEntity = countryEntity;
    }

    public MovieStatusEntity getMovieStatusEntity() {
        return movieStatusEntity;
    }

    public void setMovieStatusEntity(MovieStatusEntity movieStatusEntity) {
        this.movieStatusEntity = movieStatusEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRequiredAge() {
        return requiredAge;
    }

    public void setRequiredAge(int requiredAge) {
        this.requiredAge = requiredAge;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}