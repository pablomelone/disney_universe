package com.alkemy_disney.disney.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "characters")
@Data
public class CharactersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private Integer age;

    private Float weight;

    private String story;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private FilmsEntity film;



}
