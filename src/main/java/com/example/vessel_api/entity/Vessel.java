package com.example.vessel_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Vessel {
    @Id
    @Column(name = "imo_number", unique = true)
    private long imoNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "departure")
    private String departure;
    @Column(name = "destination")
    private String destination;
    @Column(name = "arrival_date")
    private LocalDate arrivalDate;
}
