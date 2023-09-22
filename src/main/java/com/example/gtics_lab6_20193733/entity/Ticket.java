package com.example.gtics_lab6_20193733.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "ticket")
@Getter
@Setter
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TicketId", nullable = false)
    private Integer ticketid;

    @ManyToOne
    @JoinColumn(name = "SiteId")
    private Site siteid;

    @ManyToOne
    @JoinColumn(name = "TechnicianId")
    private Technician technicianid;


    @Column (name = "Status")
    private String status;

    @Column (name = "OpenedDate")
    private Timestamp openeddate;

    @Column (name = "ClosedDate")
    private Timestamp closeddate;



}
