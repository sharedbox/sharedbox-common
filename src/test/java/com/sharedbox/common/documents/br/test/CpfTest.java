package com.sharedbox.common.documents.br.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sharedbox.common.documents.br.Cpf;

/**
 * Call test of VehicleLicensePlate
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/13/2021
 */
@ExtendWith(MockitoExtension.class)
public class CpfTest {
	/**
	 * Validate test method
	 */
	@Test
	public void validateTest() {
		assertNotNull(Cpf.create().generate());
		assertFalse(Cpf.create(null).validate());
		assertFalse(Cpf.create("").validate());
		assertFalse(Cpf.create("%#$%#$%#$%#$%").validate());
		assertFalse(Cpf.create("00000000000").validate());
		assertTrue(Cpf.create("00000000191").validate());
		assertTrue(Cpf.create("191").validate());
		assertFalse(Cpf.create("00000000198").validate());
		assertFalse(Cpf.create("000000001").validate());
		assertFalse(Cpf.create("00000000761").validate());
		assertFalse(Cpf.create("99999999999").validate());
		assertFalse(Cpf.create("00000009120").validate());
	}
}
