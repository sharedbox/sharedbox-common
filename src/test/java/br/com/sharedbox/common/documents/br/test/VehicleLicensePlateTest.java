package br.com.sharedbox.common.documents.br.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.sharedbox.common.documents.br.VehicleLicensePlate;

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
		assertFalse(new VehicleLicensePlate(null).validate());
		assertFalse(new VehicleLicensePlate("999-9999").validate());
		assertFalse(new VehicleLicensePlate("999-AAAA").validate());
		assertFalse(new VehicleLicensePlate("AAA-AAAA").validate());

		// Generate test
		String plate = new VehicleLicensePlate().generate();
		assertNotNull(plate);
		assertTrue(new VehicleLicensePlate(plate).validate());
	}
	
	/**
	 * Format test method
	 * @throws Exception 
	 */
	@Test
	public void formatTest() throws Exception {
		assertNotNull(new VehicleLicensePlate(null).format());
		assertNotNull(new VehicleLicensePlate("AA9999").format());
		
		String plate = new VehicleLicensePlate().generateMercosul();
		assertNotNull(plate);
		assertNotNull(new VehicleLicensePlate(plate).format());
	}
}
