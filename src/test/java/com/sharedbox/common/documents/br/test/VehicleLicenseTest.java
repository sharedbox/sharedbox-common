package com.sharedbox.common.documents.br.test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.documents.br.VehicleLicense;

/**
 * Call test of Cnpj class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/03/2021
 */
public class VehicleLicenseTest {
	/**
	 * Test constructor class
	 */
	@Test
	void constructorTest() {
		assertFalse(VehicleLicense.create(VehicleLicense.create().generate()).validate());
	}
}
