package com.example.vessel_api.controller;

import com.example.vessel_api.entity.Vessel;
import com.example.vessel_api.security.SecurityCheck;
import com.example.vessel_api.service.VesselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vessel_api")
public class VesselController {

    private final VesselService service;
    private final SecurityCheck securityCheck;

    @Autowired
    public VesselController(VesselService service, SecurityCheck securityCheck) {
        this.service = service;
        this.securityCheck = securityCheck;
    }

    @GetMapping("/get_all/{secret_key}")
    public List<Vessel> getAllVessels(@PathVariable String secret_key) {
        securityCheck.secretKeyCheck(secret_key);
        return service.getAllVessels();
    }
}
