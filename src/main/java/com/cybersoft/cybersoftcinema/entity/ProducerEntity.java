package com.cybersoft.cybersoftcinema.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "producer")
public class ProducerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "producerEntity")
    private List<MovieProducerEntity> movieProducerEntities;

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

    public List<MovieProducerEntity> getMovieProducerEntities() {
        return movieProducerEntities;
    }

    public void setMovieProducerEntities(List<MovieProducerEntity> movieProducerEntities) {
        this.movieProducerEntities = movieProducerEntities;
    }
}
