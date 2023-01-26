package com.sharedbox.common.documents;

/**
 * Document interface
 * Contain basic document function
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 */
public interface IDocument {
	/**
	 * Generate document
	 * 
	 * @return document
	 */
	String generate();
	
	/**
	 * Document format
	 * 
	 * @param value
	 * @return String
	 */
	String format() throws Exception;
	
	/**
	 * Validate document
	 * 
	 * @param value
	 * @return boolean
	 */
	boolean validate();
}
