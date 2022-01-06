package br.com.sharedbox.common.security.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.security.Jwt;
import br.com.sharedbox.common.security.JwtAlgorithim;

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
	
	/**
	 * Generate token test
	 */
	@Test
	public void generateTokenTest() {
		String subject = "SharedBox";
		
		String token = Jwt.generateToken("SECRET_TEST", subject, 6000, JwtAlgorithim.HS512);
		assertNotNull(token);
		
		Map<String, String> claims = new HashMap<String, String>();
		claims.put("user", "sharedbox");
		claims.put("test", "test");

		Map<String, Object> claimsHeader = new HashMap<String, Object>();
		claimsHeader.put("system", "sharedbox");
		
		token = Jwt.generateToken("SECRET_TEST", subject, 6000, JwtAlgorithim.HS512, claims);
		assertNotNull(token);
		
		token = Jwt.generateToken(null, subject, 6000, JwtAlgorithim.NONE, claims);
		assertNotNull(token);
		
		token = Jwt.generateToken("SECRET_TEST", subject, 6000, JwtAlgorithim.HS512, null, claimsHeader);
		
		IllegalArgumentException thrownIllegalArgumentException = assertThrows(IllegalArgumentException.class, 
				() -> Jwt.generateToken(null, subject, 6000, JwtAlgorithim.HS512));
		assertTrue(thrownIllegalArgumentException.getMessage().contains("JWT invalid secret"));

		token = Jwt.generateToken("SECRET_TEST", subject, 6000, JwtAlgorithim.HS512, claims, claimsHeader);
		assertNotNull(token);
		token = Jwt.generateToken("SECRET_TEST", subject, 6000, JwtAlgorithim.HS384, claims, claimsHeader);
		assertNotNull(token);
		token = Jwt.generateToken("SECRET_TEST", subject, 6000, JwtAlgorithim.HS256, claims, claimsHeader);
		assertNotNull(token);
	}
}
