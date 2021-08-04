package br.com.sharedbox.common.messages.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.messages.Message;

/**
 * Call test of Message class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/04/2021
 */
public class MessageTest {	
	/**
	 * Test constructor class
	 */
	@Test
	void gettersTest() {
		Message msg = new Message();
		assertNotNull(msg);
		assertNotNull(msg.getCode());
		assertNotNull(msg.getDescription());
		assertNull(msg.getException());
		assertNotNull(msg.getMessageType());
	}
}
