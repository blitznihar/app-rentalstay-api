package com.blitz.airbnb.apprentalstayapi.controllers;

import java.util.List;

import com.blitz.airbnb.apprentalstayapi.entities.RentalProperty;
import com.blitz.airbnb.apprentalstayapi.services.RentalPropertyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rentalproperty")
public class RentalPropertyController {
    
    @Autowired
    public RentalPropertyService rentalPropertyService;

    @GetMapping("")
    public List<RentalProperty> getRentalPropertyAll()
    {
        return rentalPropertyService.getRentalPropertyAll();
    }

}
