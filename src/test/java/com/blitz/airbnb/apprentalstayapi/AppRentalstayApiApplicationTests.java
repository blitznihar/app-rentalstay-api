package com.blitz.airbnb.apprentalstayapi;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.blitz.airbnb.apprentalstayapi.controllers.RentalPropertyController;
import com.blitz.airbnb.apprentalstayapi.repositories.RentalPropertyRepository;
import com.blitz.airbnb.apprentalstayapi.services.RentalPropertyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class AppRentalstayApiApplicationTests {

	@Autowired
	private RentalPropertyController rentalPropertyController;

	@MockBean
	private RentalPropertyRepository rentalPropertyRepository;
	
	@MockBean
	private RentalPropertyService rentalPropertyService;


	@Test
	void contextLoads() throws Exception{
		assertThat(rentalPropertyController).isNotNull();
	}

}
