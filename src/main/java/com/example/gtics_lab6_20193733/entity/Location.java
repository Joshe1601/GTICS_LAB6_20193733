package com.example.gtics_lab6_20193733.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "location")
@Getter
@Setter
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LocationId", nullable = false)
    private Integer locationid;

    @Column (name = "City")
    private String city;

    @Column (name = "Country")
    private String country;


}
