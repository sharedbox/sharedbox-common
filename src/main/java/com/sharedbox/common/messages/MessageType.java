package com.sharedbox.common.messages;

/**
 * This enum contain message type 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 *
 */
public enum MessageType {
	Default((byte)9999),
	Error((byte)1),
	Exception((byte)-1),
	Info((byte)3),
	NoContent((byte)4),
	PartialContent((byte)5),
	Success((byte)0),
	Warning((byte)2);
	
	/**
	 * Message type code
	 */
	private byte code; 
	
	/**
	 * Constructor
	 * @param code
	 */
	private MessageType(byte code) {
		this.code = code;
	}
	
	/**
	 * Get message type code
	 * @return
	 */
	public byte getCode() {
		return this.code;
	}
	
	/**
	 * Get MessageType by message type code
	 * @param code
	 * @return MessageType
	 */
	public static MessageType getMessageTypeByCode(byte code) {
		if(code == 0) {
			return Success;
		}
		
		for (MessageType mt : values()) {
			if (mt.getCode() == code) {
				return mt;
			}
		}
		
		return Default;
	}
}
