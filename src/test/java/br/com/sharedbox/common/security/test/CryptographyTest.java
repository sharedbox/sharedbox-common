package br.com.sharedbox.common.security.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.security.Cryptography;

/**
 * Call test of Cryptography class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/14/2021
 */
public class CryptographyTest {
	/**
	 * Validate test method
	 * @throws Exception 
	 */
	@Test
	public void validateTest() throws Exception {
		Cryptography cp = new Cryptography();
		assertNotNull(cp);
		
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> Cryptography.encrypt(null));
		assertTrue(thrown.getMessage().contains("Value is null"));
		
		String cryptStr = Cryptography.encrypt("Valor criptografado");
		assertNotNull(cryptStr);
		assertEquals(Cryptography.decrypt(cryptStr), "Valor criptografado");
		
		thrown = assertThrows(IllegalArgumentException.class, () -> Cryptography.decrypt(null));
		assertTrue(thrown.getMessage().contains("Value is null"));
		
		assertNotEquals(Cryptography.getCRC32Checksum(cryptStr.getBytes()), 0);
	}
}
