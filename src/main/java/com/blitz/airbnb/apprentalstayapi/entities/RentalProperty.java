package com.blitz.airbnb.apprentalstayapi.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "listingsAndReviews")
public class RentalProperty {
        private String _id;
        private String listing_url;
        private String name;
        private String summary;
        private String space;
        private String description;
        private String neighborhood_overview;
        private String notes;
        private String transit;
        private String access;
        private String interaction;
        private String house_rules;
        private String property_type;
        private String room_type;
        private String bed_type;
        private String minimum_nights;
        private String maximum_nights;
        private String cancellation_policy;
        private Date last_scraped;
        private Date calendar_last_scraped;
        private Date first_review;
        private Date last_review;
        private Float accommodates;
        private Float bedrooms;
        private Float beds;
        private Float number_of_reviews;
        private Float bathrooms;
        private List<String> amenities;
        private BigDecimal price;
        private BigDecimal security_deposit;
        private BigDecimal cleaning_fee;
        private Float extra_people;
        private Float guests_included;
        private Images images;
        private Address address;
        private Availability availability;
    }
