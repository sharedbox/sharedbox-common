package br.com.sharedbox.common.security.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.security.Jwt;

/**
 * Call test of Jwt class
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/23/2021
 */
public class JwtTest {
	/**
	 * Constructor test
	 */
	@Test
	public void construcotTest() {
		assertNotNull(new Jwt());
	}
}
