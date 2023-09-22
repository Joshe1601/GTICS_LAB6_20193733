package com.example.gtics_lab6_20193733.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "site")
@Getter
@Setter
public class Site {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "SiteId", nullable = false)
        private Integer siteid;

        @Column (name = "SiteName")
        private String sitename;

        @ManyToOne
        @JoinColumn(name = "LocationId")
        private Location locationid;

        @Column (name = "InstallationDate")
        private Date installationdate;

        @Column (name = "Latitude")
        private Double latitude;

        @Column (name = "Longitude")
        private Double longitude;

}
