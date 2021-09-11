package com.blitz.airbnb.apprentalstayapi.repositories;
import com.blitz.airbnb.apprentalstayapi.entities.RentalProperty;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;



@DataMongoTest //(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
public class RentalPropertyRepositoryTest {
    

   
    // @DynamicPropertySource
    // static void setProperties(DynamicPropertyRegistry registry) {
    //     registry.add("spring.data.mongodb.host", () -> "localhost");
    //     registry.add("spring.data.mongodb.port", () -> "27017");
    //     registry.add("spring.datasource.password", () -> "");
    //     registry.add("spring.data.mongodb.port", () -> "27017");
    // }

    @Autowired
    private RentalPropertyRepository rentalPropertyRepository;

    @BeforeEach
    public void setUp() throws Exception {
        rentalPropertyRepository.save(new RentalProperty());
    }
    @Test
    public void test() {

        // String jsonString = "{'listing_url':'https://www.airbnb.com/rooms/10006546','name':'Ribeira Charming Duplex','summary':'Fantastic duplex apartment with three bedrooms, located in the historic area of Porto, Ribeira (Cube)'}";
        // Document doc = Document.parse(jsonString);
        // mongoTemplate.insert(doc, "listingsAndReviews");
        //rentalPropertyRepository.findAll();
        assertThat(rentalPropertyRepository.findAll()).isNotEmpty();
       // assertEqual(rentalPropertyList.length(),1);
    }
}
