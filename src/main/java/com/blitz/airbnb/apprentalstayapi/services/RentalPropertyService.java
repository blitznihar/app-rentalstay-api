package com.blitz.airbnb.apprentalstayapi.services;

import com.blitz.airbnb.apprentalstayapi.entities.RentalProperty;
import com.blitz.airbnb.apprentalstayapi.repositories.RentalPropertyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RentalPropertyService {
    
    @Autowired
    public RentalPropertyRepository rentalPropertyRepository;

    public List<RentalProperty> getRentalPropertyAll()
    {
        return rentalPropertyRepository.findAll();
    }

}
