package com.example.gtics_lab6_20193733.repository;

import com.example.gtics_lab6_20193733.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{
}
