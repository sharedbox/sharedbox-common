package br.com.sharedbox.common.documents.br.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.sharedbox.common.documents.br.Cpf;

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
		assertNotNull(new Cpf());
		assertFalse(new Cpf(null).validate());
		assertFalse(new Cpf("").validate());
		assertFalse(new Cpf("%#$%#$%#$%#$%").validate());
		assertFalse(new Cpf("00000000000").validate());
		assertTrue(new Cpf("00000000191").validate());
		assertTrue(new Cpf("191").validate());
		assertFalse(new Cpf("00000000198").validate());
		assertFalse(new Cpf("000000001").validate());
		assertFalse(new Cpf("00000000761").validate());
		assertFalse(new Cpf("99999999999").validate());
		assertFalse(new Cpf("00000009120").validate());
	}
}
