package com.sharedbox.common.documents.br.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.documents.br.Cnpj;

/**
 * Call test of VehicleLicense class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/03/2021
 */
public class CnpjTest {
	/**
	 * Validate test method
	 */
	@Test
	void validateTest() {
		assertFalse(Cnpj.create(null).validate());
		assertTrue(Cnpj.create("00000000000191").validate());
		assertFalse(Cnpj.create("0000000000761").validate());
		assertFalse(Cnpj.create("761").validate());
		assertTrue(Cnpj.create("191").validate());
		assertFalse(Cnpj.create("00000A00000191").validate());
		assertFalse(Cnpj.create("%#$%#$%#$%#$%").validate());
	}
}
