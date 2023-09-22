package com.example.gtics_lab6_20193733.repository;

import com.example.gtics_lab6_20193733.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{
    @Query(value = "SELECT SiteName, count(ticket.TicketID) FROM site INNER JOIN ticket GROUP BY SiteName", nativeQuery = true)
    public String[] getEstadistics();
}
