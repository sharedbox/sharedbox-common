package br.com.sharedbox.common.network.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.network.Network;

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
	 * Test constructor
	 * @throws Exception 
	 */
	@Test
	void checkHostTest() throws Exception {
		Network network = new Network();
		
		Map<String, String> host = network.checkHost("185.190.38.1");
		assertNotNull(host);
		
		host = network.checkHost("122.0.0.70");
		assertNotNull(host.get("message"));
		assertEquals("Host does not respond", host.get("message").toString());
		
		IllegalArgumentException thrownIllegalArgumentException = assertThrows(IllegalArgumentException.class, () -> network.checkHost(null));
		assertTrue(thrownIllegalArgumentException.getMessage().contains("invalid host"));
	}
	
	
}
