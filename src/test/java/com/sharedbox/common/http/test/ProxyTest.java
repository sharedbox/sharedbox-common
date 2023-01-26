package com.sharedbox.common.http.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.http.Proxy;

/**
 * Call test of Proxy class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/30/2021
 */
public class ProxyTest {

	/**
	 * Validate test method
	 */
	@Test
	public void constructorTest() {
		Proxy browser = new Proxy("host.test", 8080);
		assertNotNull(new Proxy());
		assertNotNull(browser);

		assertNotNull(browser.getHost());
		assertNotNull(browser.getPort());
	}
}
