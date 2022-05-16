package com.alkemy_disney.disney.Entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Gender")
@Data
public class GenderEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String image;



}
