package com.blitz.airbnb.apprentalstayapi.services;

import org.junit.jupiter.api.Test;
 import org.mockito.Mock;
 import static org.assertj.core.api.Assertions.assertThat;
 import static org.junit.jupiter.api.Assertions.assertEquals;
 import static org.mockito.Mockito.when;
 import java.util.ArrayList;
 import org.springframework.boot.test.mock.mockito.MockBean;
 import com.blitz.airbnb.apprentalstayapi.entities.RentalProperty;
import com.blitz.airbnb.apprentalstayapi.repositories.RentalPropertyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RentalPropertyServiceTest {

	@Autowired
	private RentalPropertyService rentalPropertyService;

	 @MockBean
	 private RentalPropertyRepository rentalPropertyRepository;

	 @Mock
	 private ArrayList<RentalProperty> mockRentalPropertyList;

	@Test
	public void rentalPropertyServiceisNotNull() throws Exception{
		assertThat(rentalPropertyService).isNotNull();
	}
	@Test
	public void rentalPropertyControllerSuccess() throws Exception{
		when(rentalPropertyRepository.findAll()).thenReturn(mockRentalPropertyList);
		assertEquals(rentalPropertyService.getRentalPropertyAll(), mockRentalPropertyList);
	}
}
