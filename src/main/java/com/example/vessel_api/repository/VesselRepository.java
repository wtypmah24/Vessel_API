package com.example.vessel_api.repository;

import com.example.vessel_api.entity.Vessel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface VesselRepository extends JpaRepository<Vessel, Long> {
    List<Vessel> findVesselsByArrivalDateAndDestination(LocalDate arrivalDate, String destination);
    Optional<Vessel> findVesselByImoNumber(long imoNumber);
    List<Vessel> findAllByImoNumberIn(List<Long> imoNumbers);
}
