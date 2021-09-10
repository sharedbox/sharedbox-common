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
		assertTrue(new Cnh("53369516746").validate());
		assertFalse(new Cnh("11111111111").validate());
		assertFalse(new Cnh("123123").validate());
		assertFalse(new Cnh("").validate());
		assertFalse(new Cnh("rtyrtyrty78789").validate());
		assertFalse(new Cnh("rrrrrrrrrrr").validate());
	}

}
