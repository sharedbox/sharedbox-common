package br.com.sharedbox.common.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.QRCode;

/**
 * Call test of QRCode class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/23/2021
 */
public class QRCodeTest {
	/**
	 * Constructor test
	 */
	@Test
	public void contructorTest() {
		assertNotNull(new QRCode());
	}

}
