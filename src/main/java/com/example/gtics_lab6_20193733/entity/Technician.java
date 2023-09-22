package com.example.gtics_lab6_20193733.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "technician")
@Getter
@Setter
public class Technician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TechnicianId", nullable = false)
    private Integer technicianid;

    @Column (name = "FirstName")
    private String firstname;

    @Column (name = "LastName")
    private String lastname;

    @Column(name = "Email")
    private String email;

    @Column (name = "Phone")
    private String phone;
}
