package com.sharedbox.common.messages;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0 
 * @since 01/01/2021
 */
public class Message {
	/**
	 * Constructor
	 */
	public Message() {
		this("", "", MessageType.Default, null);
	}
	
	/**
	 * Constructor
	 * @param description
	 * @param code
	 * @param messageType
	 * @param exception
	 */
	public Message(String description, String code, MessageType messageType, Exception exception) {
		this.setDescription(description);
		this.setCode(code);
		this.setMessageType(messageType);
		this.setException(exception);
	}
	
	/**
	 * Message description
	 */
	private String description;

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Message code
	 */
	private String code;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Message Type
	 */
	private MessageType messageType;

	/**
	 * @return the messageType
	 */
	public MessageType getMessageType() {
		return messageType;
	}

	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}

	/**
	 * Exception
	 */
	@JsonIgnore
	private Exception exception;

	/**
	 * @return the exception
	 */
	public Exception getException() {
		return exception;
	}

	/**
	 * @param exception the exception to set
	 */
	public void setException(Exception exception) {
		this.exception = exception;
	}
}
