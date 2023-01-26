package com.sharedbox.common.identify.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.identify.Barcode;
import com.sharedbox.common.identify.CodeType;

/**
 * Call test of Barcode class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/30/2021
 */
public class BarcodeTest {
	/**
	 * Constructor test
	 */
	@Test
	public void contructorTest() {
		assertNotNull(new Barcode());
	}

	/**
	 * @throws Exception 
	 * 
	 */
	@Test
	void generateTet() throws Exception {
		Barcode barcode = new Barcode();
		assertNotNull(barcode.generate("1234567891234", CodeType.AZTEC));
		assertNotNull(barcode.generate("123456789123", CodeType.EAN13));
		assertNotNull(barcode.generate("12345678912", CodeType.UPCA));
		
		Exception ex = assertThrows(Exception.class, () -> barcode.generate("1234567891234", CodeType.NotFound));
		assertTrue(ex.getMessage().contains("Unexpected value:"));
	}
}
