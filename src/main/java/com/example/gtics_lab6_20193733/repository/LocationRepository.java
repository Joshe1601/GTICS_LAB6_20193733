package com.example.gtics_lab6_20193733.repository;

import com.example.gtics_lab6_20193733.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
