package br.com.sharedbox.common.documents.br.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
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
		Cpf cpf = new Cpf();
		assertFalse(cpf.validate(null));
		assertFalse(cpf.validate(""));
		assertFalse(cpf.validate("%#$%#$%#$%#$%"));
		assertFalse(cpf.validate("00000000000"));
		assertTrue(cpf.validate("00000000191"));
		assertFalse(cpf.validate("00000000198"));
		assertFalse(cpf.validate("000000001"));
		assertFalse(cpf.validate("00000000761"));
		assertFalse(cpf.validate("99999999999"));
		assertFalse(cpf.validate("00000009120"));
	}
}
