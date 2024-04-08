package com.example.vessel_api.service;

import com.example.vessel_api.entity.Vessel;
import com.example.vessel_api.repository.VesselRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VesselService {
    private final VesselRepository repository;

    public VesselService(VesselRepository repository) {
        this.repository = repository;
    }
    public List<Vessel> findVesselsByArrivalDateAndDestination(LocalDate arrivalDate, String destination){
        return repository.findVesselsByArrivalDateAndDestination(arrivalDate,destination);
    }

    public Vessel findVesselByImoNumber(long imoNumber){
        return repository.findVesselByImoNumber(imoNumber).orElseThrow();
    }

    public List<Vessel> findAllByImoNumberIn(List<Long> imoNumbers){
        return repository.findAllByImoNumberIn(imoNumbers);
    }
    public List<Vessel> getAllVessels(){
        return repository.findAll();
    }
}
