package com.example.vessel_api.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;
import java.util.Objects;

@Component
public class SecurityCheck {
    @Value("${secret_key}")
    private String secretKey;
    public void secretKeyCheck(String incomeKey){
        if (!secretKey.equals(incomeKey)) throw new NoSuchElementException("You provided wrong secret key!");
    }
}
