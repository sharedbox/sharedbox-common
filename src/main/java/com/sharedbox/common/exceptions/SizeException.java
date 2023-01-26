package com.sharedbox.common.exceptions;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 09/01/2021 - Version 1.0.0
 */
public class SizeException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 * 
	 * @param message
	 */
	public SizeException(String message){
		super(message);
		
	}
}
