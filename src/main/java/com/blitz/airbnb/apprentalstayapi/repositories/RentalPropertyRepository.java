package com.blitz.airbnb.apprentalstayapi.repositories;

import com.blitz.airbnb.apprentalstayapi.entities.RentalProperty;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalPropertyRepository extends MongoRepository<RentalProperty,String> {   
}
