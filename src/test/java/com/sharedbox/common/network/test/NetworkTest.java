package com.sharedbox.common.network.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.network.Network;

/**
 * 
 * @author Rafael Costi
 *
 */
public class NetworkTest {
	/**
	 * Test constructor
	 */
	@Test
	void NetworkConstructorTest() {
		assertNotNull(new Network());
	}

	/**
	 * Test checkHost method
	 * @throws Exception 
	 */
	@Test
	void checkHostTest() throws Exception {
		Map<String, String> host = Network.checkHost("185.190.38.1");
		assertNotNull(host);
		
		host = Network.checkHost("122.0.0.70");
		assertNotNull(host.get("message"));
		assertEquals("Host does not respond", host.get("message").toString());
		
		IllegalArgumentException thrownIllegalArgumentException = assertThrows(IllegalArgumentException.class, () -> Network.checkHost(null));
		assertTrue(thrownIllegalArgumentException.getMessage().contains("invalid host"));
	}

	/**
	 * Test checkLocalHost method
	 * @throws Exception 
	 */
	@Test
	void checkLocalHostTest() throws Exception {
		Map<String, String> host = Network.checkLocalHost();
		assertNotNull(host);
	}

	/**
	 * Test exist method
	 * @throws Exception 
	 */
	@Test
	void existHostTest() throws Exception {
		assertFalse(Network.exist(null));
		assertFalse(Network.exist(""));
		assertFalse(Network.exist("http://www.qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm"
				+ "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm"
				+ "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm"
				+ "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm"
				+ "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm"
				+ "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm.com"));

		assertFalse(Network.exist("http://www.google.com."));
		assertFalse(Network.exist("http://www.abcdfghaijlmnopqrstuvxz.com"));
		assertTrue(Network.exist("http://www.google.com"));
		assertTrue(Network.exist("https://www.google.com"));
		assertTrue(Network.exist("google.com"));
	}
}
