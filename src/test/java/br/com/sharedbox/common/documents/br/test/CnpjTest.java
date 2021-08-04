package br.com.sharedbox.common.documents.br.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.documents.br.Cnpj;

/**
 * Call test of VehicleLicense class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/03/2021
 */
public class CnpjTest {
	/**
	 * Test constructor class
	 */
	@Test
	void constructorTest() {
		assertNotNull(new Cnpj());
	}
	/**
	 * Validate test method
	 */
	@Test
	void validateTest() {
		assertFalse(new Cnpj().validate(null));
		assertTrue(new Cnpj().validate("00000000000191"));
		assertFalse(new Cnpj().validate("00000A00000191"));
	}
}
