package com.sharedbox.common.documents.br.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sharedbox.common.documents.br.VehicleLicensePlate;

/**
 * Call test of VehicleLicensePlate
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/30/2021
 */
@ExtendWith(MockitoExtension.class)
public class VehicleLicensePlateTest {
	/**
	 * Validate test method
	 */
	@Test
	public void validateTest() {
		assertFalse(VehicleLicensePlate.create(null).validate());
		assertFalse(VehicleLicensePlate.create("999-9999").validate());
		assertFalse(VehicleLicensePlate.create("999-AAAA").validate());
		assertFalse(VehicleLicensePlate.create("AAA-AAAA").validate());

		// Generate test
		String plate = VehicleLicensePlate.create().generate();
		assertNotNull(plate);
		assertTrue(VehicleLicensePlate.create(plate).validate());
	}
	
	/**
	 * Format test method
	 * @throws Exception 
	 */
	@Test
	public void formatTest() throws Exception {
		assertNotNull(VehicleLicensePlate.create(null).format());
		assertNotNull(VehicleLicensePlate.create("AA9999").format());
		
		String plate = VehicleLicensePlate.create().generateMercosul();
		assertNotNull(plate);
		assertNotNull(VehicleLicensePlate.create(plate).format());
	}
}
