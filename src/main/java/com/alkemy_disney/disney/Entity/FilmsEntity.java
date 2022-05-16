package com.alkemy_disney.disney.Entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "films")
@Data
public class FilmsEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    private String image;

    private String title;

    @Column(name = "premiere")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate date;

    ///### buscar anotation para range de 1 a 5 ###
    private Integer score;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private CharactersEntity characters;



}
