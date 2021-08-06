package br.com.sharedbox.common.documents.br.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.documents.br.Cnh;

/**
 * 
 * @author Rafael Costi - rafaelcosti@outlook.com
 * @version 1.0.0
 * @since 08/06/2021
 */
public class CnhTest {
	/**
	 * Test constructor class
	 */
	@Test
	void constructorTest() {
		assertNotNull(new Cnh());
	}

	/**
	 * 
	 * @return
	 */
	@Test
	public void validateTest() {
		assertTrue(new Cnh().validate("53369516746"));
		assertFalse(new Cnh().validate("11111111111"));
		assertFalse(new Cnh().validate("123123"));
		assertFalse(new Cnh().validate(""));
		assertFalse(new Cnh().validate("rtyrtyrty78789"));
		assertFalse(new Cnh().validate("rrrrrrrrrrr"));
	}

}
