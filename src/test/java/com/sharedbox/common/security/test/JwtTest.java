package com.sharedbox.common.security.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.security.Jwt;
import com.sharedbox.common.security.JwtAlgorithim;
import com.sharedbox.common.utils.DateTimeUtils;

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
		String secret = "sharedbox-secret";
		long expiration = 3000;
		JwtAlgorithim algorithin = JwtAlgorithim.HS512;
		String token = "";
		Map<String, Object> claims = new HashMap<String, Object>();
		
		token = Jwt.generateToken(secret, null, expiration, algorithin);
		assertNotNull(token);
		
		token = Jwt.generateToken(secret, subject, expiration, algorithin);
		assertNotNull(token);
		
		token = Jwt.generateToken(secret, subject, expiration, algorithin, null);
		assertNotNull(token);

		claims.put("test", null);
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);

		claims.put("test", "SharedBox");
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);

		claims.put("test", (byte)1);
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);

		claims.put("test", (int)1);
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);

		claims.put("test", (long)1);
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);

		claims.put("test", (float)1);
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);

		claims.put("test", (double)1);
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);

		claims.put("test", true);
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);

		claims.put("test", DateTimeUtils.localDateToDate(LocalDate.now()));
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);

		claims.put("test", LocalDate.now());
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);

		claims.put("test", LocalDateTime.now());
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);

		Map<String, String > map2 = new HashMap<String, String>();
		map2.put("value", "1");
		map2.put("value2", "2");
		map2.put("value3", "3");
		claims.put("test3", map2);
		
		List<String> list = new ArrayList<String>();
		list.add("value");
		list.add("value2");
		list.add("value3");
		claims.put("list", list);
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims);
		assertNotNull(token);
		
		Map<String, Object> claimsHeader = new HashMap<String, Object>();
		claimsHeader.put("system", "sharedbox");
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims, claimsHeader);
		assertNotNull(token);

		IllegalArgumentException thrownIllegalArgumentException = assertThrows(IllegalArgumentException.class, 
				() -> Jwt.generateToken(null, subject, expiration, JwtAlgorithim.HS512, claims, claimsHeader));
		assertTrue(thrownIllegalArgumentException.getMessage().contains("JWT invalid secret"));
		
		token = Jwt.generateToken(secret, subject, expiration, algorithin, null, claimsHeader);
		assertNotNull(token);
		
		algorithin = JwtAlgorithim.HS384;
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims, claimsHeader);
		assertNotNull(token);
		
		algorithin = JwtAlgorithim.HS256;
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims, claimsHeader);
		assertNotNull(token);
		
		algorithin = JwtAlgorithim.NONE;
		token = Jwt.generateToken(secret, subject, expiration, algorithin, claims, claimsHeader);
		assertNotNull(token);

		token = Jwt.generateToken(null, subject, expiration, algorithin, claims, claimsHeader);
		assertNotNull(token);
	}
	
	/**
	 * 
	 */
	@Test
	void headerItemTest() {
		String subject = "SharedBox";
		String secret = "sharedbox-secret";
		long expiration = 3000;
		JwtAlgorithim algorithin = JwtAlgorithim.HS512;
		String token = "";

		Map<String, Object> claimsHeader = new HashMap<String, Object>();
		claimsHeader.put("system", "sharedbox");
		token = Jwt.generateToken(secret, subject, expiration, algorithin, null, claimsHeader);
		
		Object itemHeader = Jwt.getHeaderItem(token, "system");
		assertNotNull(itemHeader);
	}
	
	@Test
	void JwtAlgorithimTest() {
		JwtAlgorithim algorithin = JwtAlgorithim.HS256;
		assertNotNull(algorithin.getValue());
		assertNotNull(algorithin.getDescription());
		assertTrue(algorithin.isJdkStandard());
		assertNotNull(algorithin.getFamilyName());
		assertNotNull(algorithin.getJcaName());
	}
}
