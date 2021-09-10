package com.blitz.airbnb.apprentalstayapi.controllers;

import org.junit.jupiter.api.Test;
 import org.mockito.Mock;
 import static org.assertj.core.api.Assertions.assertThat;
 import static org.junit.jupiter.api.Assertions.assertEquals;
 import static org.mockito.Mockito.when;
 import java.util.ArrayList;
 import org.springframework.boot.test.mock.mockito.MockBean;
 import com.blitz.airbnb.apprentalstayapi.entities.RentalProperty;
import com.blitz.airbnb.apprentalstayapi.services.RentalPropertyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RentalPropertyControllerTest {

	@Autowired
	private RentalPropertyController rentalPropertyController;

	 @MockBean
	 private RentalPropertyService rentalPropertyService;

	 @Mock
	 private ArrayList<RentalProperty> mockRentalPropertyList;

	@Test
	public void rentalPropertyControllerisNotNull() throws Exception{
		assertThat(rentalPropertyController).isNotNull();
	}
	@Test
	public void rentalPropertyControllerSuccess() throws Exception{
		when(rentalPropertyService.getRentalPropertyAll()).thenReturn(mockRentalPropertyList);
		assertEquals(rentalPropertyController.getRentalPropertyAll(), mockRentalPropertyList);
	}
}
