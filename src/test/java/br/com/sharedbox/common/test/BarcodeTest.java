package br.com.sharedbox.common.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.Barcode;

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
}
