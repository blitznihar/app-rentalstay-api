package com.blitz.airbnb.apprentalstayapi.repositories;

import com.blitz.airbnb.apprentalstayapi.entities.RentalProperty;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RentalPropertyRepository extends MongoRepository<RentalProperty,String> {
    
}
