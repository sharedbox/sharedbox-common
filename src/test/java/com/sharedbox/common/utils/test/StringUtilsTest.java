package com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.utils.StringUtils;

/**
 * Call test of StringUtils class
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/14/2021 - Version 1.0.0
 */
public class StringUtilsTest {
	/**
	 * 
	 */
	@Test
	public void test() throws Exception {
		assertNotNull(new StringUtils());
		
		// New UUID
		assertNotNull(StringUtils.newUUID());
		assertNotNull(StringUtils.newUUID("TEST"));
		
		// Remove numbers
		assertNotNull(StringUtils.removeNumbers(""));
		assertNotNull(StringUtils.removeNumbers("TEST 1234567890"));
		
		// convert To Sha1Hex
		assertNotNull(StringUtils.convertToSha1Hex("Test", "Test"));
		
		// Only numbers
		assertTrue(StringUtils.onlyNumbers("qqqqq789swd54asd").equals("78954"));
		assertTrue(StringUtils.onlyNumbers("").equals("0"));
		assertTrue(StringUtils.onlyNumbers(null).equals("0"));

		// Convert to MD5
		assertNotNull(StringUtils.convertToMD5("TEST MD5"));
		assertNotNull(StringUtils.convertToMD5("TEST", 16));
		
		// Replace accents
		assertEquals("AAAEEEIIIOOOOUUU", StringUtils.replaceAccents("ÁÀÃÉÉÊÍÌIÔÕÓÒÚÙU"));
		
		// Trim trailing character
		assertEquals(StringUtils.trimTrailingCharacter("TEST ", ' '), "TEST");
		assertNotEquals(StringUtils.trimTrailingCharacter("VOID", ' '), "TEST");
		assertEquals("", StringUtils.trimTrailingCharacter("", ' '));
		assertEquals(null, StringUtils.trimTrailingCharacter(null, ' '));
		
		// String random
		assertNotNull(StringUtils.strRandom(10));
		assertNotNull(StringUtils.strRandom(10, true));
		assertNotNull(StringUtils.strRandom(10, true, true));
		assertNotNull(StringUtils.strRandom(10, true, true, true));
		assertNotNull(StringUtils.strRandom(10, true, true, true, true));
		
		// Remove equal chars numbers
		String value = StringUtils.removeEqualCharsNumbers("QQ99WW");
		assertTrue(value.equals("QQ9WW"));
		
		// Base64 to byte array and byte array to base64
		assertEquals("test", StringUtils.byteArrayToBase64(StringUtils.base64ToByteArray("test")));
	}
}
