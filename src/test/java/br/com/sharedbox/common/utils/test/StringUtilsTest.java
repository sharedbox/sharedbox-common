package br.com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * Call test of StringUtils class
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/14/2021
 */
public class StringUtilsTest {
	/**
	 * 
	 */
	@Test
	public void test() {
		assertNotNull(new StringUtils());
	}

	/**
	 * 
	 */
	@Test
	public void convertToSha1HexTest() throws Exception {
		assertNotNull(StringUtils.convertToSha1Hex("Test", "Test"));
	}
	
	/**
	 * @throws Exception 
	 * 
	 */
	@Test
	public void convertToMD5Test() throws Exception {
		assertNotNull(StringUtils.convertToMD5("TEST MD5"));
		assertNotNull(StringUtils.convertToMD5("TEST", 16));
	}
		
	/**
	 * 
	 */
	@Test
	public void onlyNumbersTest() {
		assertTrue(StringUtils.onlyNumbers("qqqqq789swd54asd").equals("78954"));
		assertTrue(StringUtils.onlyNumbers("").equals("0"));
		assertTrue(StringUtils.onlyNumbers(null).equals("0"));
	}
	
	/**
	 * 
	 */
	@Test
	public void strRandonTest() {
		assertNotNull(StringUtils.strRandon(10));
		assertNotNull(StringUtils.strRandon(10, true));
		assertNotNull(StringUtils.strRandon(10, true, true));
		assertNotNull(StringUtils.strRandon(10, true, true, true));
		assertNotNull(StringUtils.strRandon(10, true, true, true, true));
	}
	
	/**
	 * 
	 */
	@Test
	public void removeEqualCharsNumbersTest() {
		String value = StringUtils.removeEqualCharsNumbers("QQ99WW");
		assertTrue(value.equals("QQ9WW"));
	}

	/**
	 * 
	 */
	@Test
	public void trimTrailingCharacterTest() {
		assertEquals(StringUtils.trimTrailingCharacter("TEST ", ' '), "TEST");
		assertNotEquals(StringUtils.trimTrailingCharacter("VOID", ' '), "TEST");
		assertEquals("", StringUtils.trimTrailingCharacter("", ' '));
		assertEquals(null, StringUtils.trimTrailingCharacter(null, ' '));
	}

	/**
	 * 
	 */
	@Test
	public void newUUIDTest() {
		assertNotNull(StringUtils.newUUID());
	}

	/**
	 * 
	 */
	@Test
	public void newUUIDFromBytesTest() {
		assertNotNull(StringUtils.newUUIDFromBytes("TEST".getBytes()));
	}
		
	/**
	 * 
	 */
	@Test
	public void removeNumbersTest() {
		assertNotNull(StringUtils.removeNumbers(""));
		assertNotNull(StringUtils.removeNumbers("TEST 1234567890"));
	}
}
