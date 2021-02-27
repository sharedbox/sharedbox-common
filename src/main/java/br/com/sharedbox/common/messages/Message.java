package br.com.sharedbox.common.messages;

/**
 * This enum contain message type 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0 
 *
 */
public class Message {
	/**
	 * Constructor
	 */
	public Message() {
		this("", 0, MessageType.Default, null);
	}

	/**
	 * Constructor
	 * @param description
	 */
	public Message(String description) {
		this(description, 0, MessageType.Default, null);
	}

	/**
	 * Constructor
	 * @param description
	 * @param code
	 */
	public Message(String description, int code) {
		this(description, code, MessageType.Default, null);
	}

	/**
	 * Constructor
	 * @param description
	 * @param code
	 * @param messageType
	 */
	public Message(String description, int code, MessageType messageType) {
		this(description, code, messageType, null);
	}
	
	/**
	 * Constructor
	 * @param code
	 */
	public Message(int code) {
		this("", code, MessageType.Default, null);
	}
	
	/**
	 * Constructor
	 */
	public Message(int code, MessageType messageType) {
		this("", code, messageType, null);
	}

	/**
	 * Constructor
	 * @param messageType
	 */
	public Message(MessageType messageType) {
		this("", 0, messageType, null);
	}

	/**
	 * Constructor
	 * @param exception
	 */
	public Message(Exception exception) {
		this(exception.getMessage()
				, MessageType.Exception.getCode()
				, MessageType.Exception
				, exception);
	}
	
	/**
	 * Constructor
	 * @param description
	 * @param code
	 * @param messageType
	 * @param exception
	 */
	public Message(String description, int code, MessageType messageType, Exception exception) {
		this.description = description;
		this.code = code;
		this.messageType = messageType;
		this.exception = exception;
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
	private int code;

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
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
