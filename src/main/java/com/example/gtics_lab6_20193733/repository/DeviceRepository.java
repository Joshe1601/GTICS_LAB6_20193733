package com.example.gtics_lab6_20193733.repository;

import com.example.gtics_lab6_20193733.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
