package com.example.gtics_lab6_20193733.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "device")
@Getter
@Setter
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DeviceId", nullable = false)
    private Integer deviceid;

    @Column (name = "DeviceName")
    private String devicename;

    @Column (name = "DeviceType")
    private String devicetype;

    @Column (name = "Model")
    private String model;

    @Column (name = "SerialNumber")
    private String serialnumber;

    @ManyToOne
    @JoinColumn(name = "SiteID")
    private Site siteid;

}
