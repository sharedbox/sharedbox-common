package br.com.sharedbox.common;

import java.util.HashMap;
import java.util.Map;

import br.com.sharedbox.common.messages.Message;
import br.com.sharedbox.common.messages.MessageType;

/**
 * This class contain return values
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 *
 */
public class ResponseValues <T> {
	/**
	 * 
	 */
	private T value;
	
	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}	

	/**
	 * Messages
	 */
	private Map<String, Message> messages;
	
	/**
	 * @return the messages
	 */
	public Map<String, Message> getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(Map<String, Message> messages) {
		this.messages = messages;
	}

	/**
	 * Get messages by message type
	 * @return
	 */
	public Map<String, Message> getMessagesByType(MessageType messageType) {
		Map<String, Message> response = new HashMap<String, Message>();
		
		if(this.messages == null) {
			return response; 
		}
		
		for (Message message : this.messages.values()) {
			if (message != null) {
				if (message.getMessageType() != null 
						&& message.getMessageType() == messageType) {
					response.put(message.getCode(), message);
				}				
			}
		}
		return response;
	}
	
	/**
	 * Add message on the map
	 * @param message
	 */
	public void addMessage(Message message) {
		if (this.messages == null) {
			this.messages = new HashMap<String, Message>(); 
		}
		
		this.messages.put(message.getCode(), message);
	}

	/**
	 * Check message error
	 * @return
	 */
	public boolean hasMessageError() {
		return !getMessagesByType(MessageType.Error).isEmpty();
	}
}