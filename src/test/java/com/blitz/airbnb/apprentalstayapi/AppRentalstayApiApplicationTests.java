package com.blitz.airbnb.apprentalstayapi;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.blitz.airbnb.apprentalstayapi.controllers.RentalPropertyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppRentalstayApiApplicationTests {

	@Autowired
	private RentalPropertyController rentalPropertyController;

	@Test
	void contextLoads() throws Exception{
		assertThat(rentalPropertyController).isNotNull();
	}

}
