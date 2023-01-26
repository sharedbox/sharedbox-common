package com.sharedbox.common.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.ResponseValues;
import com.sharedbox.common.messages.Message;
import com.sharedbox.common.messages.MessageType;

/**
 * Call test of ResponseValues class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/23/2021
 */
public class ResponseValuesTest {
	/**
	 * Value test
	 */
	@Test
	public void valueTest() {
		ResponseValues<String> rv = new ResponseValues<String>();
		assertFalse(rv.hasValue());
		rv.setValue("Teste");
		assertNotNull(rv.getValue());
		assertTrue(rv.hasValue());
	}

	/**
	 * Message test
	 */
	@Test
	public void messageTest() {
		ResponseValues<Void> rv = new ResponseValues<Void>();

		assertNotNull(rv.getMessagesByType(MessageType.Error));

		rv.addMessage(new Message("Message test", "0001", MessageType.Error, new Exception("Message test")));
		
		assertNotNull(rv.getMessages());

		rv.addMessage(new Message("Message test", "0001", null, new Exception("Message test")));
		assertNotNull(rv.getMessagesByType(null));
		assertFalse(rv.hasMessageError());
		
		Map<String, Message> msg = new HashMap<String, Message>();
		rv.setMessages(null);
		msg.put("0000", new Message("Message test", "0000", MessageType.Error, new Exception("Message test")));
		rv.addMessageAll(msg);
		
		rv.setMessages(msg);
		rv.addMessage(new Message("Message test", "0001", MessageType.Error, new Exception("Message test")));

		msg.put("0002", new Message("Message test", "0002", MessageType.Error, new Exception("Message test")));

		rv.addMessageAll(msg);
		rv.addMessageAll(null);
		
		assertNotNull(rv.getMessages());

		assertNotNull(rv.getMessagesByType(MessageType.Error));

		assertNotNull(rv.getMessagesByType(null));
		
		assertTrue(rv.hasMessageError());
	}
}
