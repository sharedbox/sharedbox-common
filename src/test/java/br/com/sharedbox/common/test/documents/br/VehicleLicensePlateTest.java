package br.com.sharedbox.common.test.documents.br;

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
		VehicleLicensePlate vlp = new VehicleLicensePlate();
		assertFalse(vlp.validate(null));
		assertFalse(vlp.validate("999-9999"));
		assertFalse(vlp.validate("999-AAAA"));
		assertFalse(vlp.validate("AAA-AAAA"));

		// Generate test
		String plate = vlp.generate();
		assertNotNull(plate);
		assertTrue(vlp.validate(plate));
	}
	
	/**
	 * Format test method
	 * @throws Exception 
	 */
	@Test
	public void formatTest() throws Exception {
		VehicleLicensePlate vlp = new VehicleLicensePlate();
		assertNotNull(vlp.format(null));
		assertNotNull(vlp.format("AA9999"));
		
		String plate = vlp.generateMercosul();
		assertNotNull(plate);
		assertNotNull(vlp.format(plate));
	}
}
