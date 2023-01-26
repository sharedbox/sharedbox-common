package com.sharedbox.common.documents;

import com.sharedbox.common.utils.StringUtils;

/**
 * Common validate
 *
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/01/2021 - Version 1.0.0
 */
public class DocumentBase {	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	public DocumentBase() {
		super();
		this.value = "";
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	public DocumentBase(String value) {
		super();
		this.value = value;
	}
	
	/**
	 * Document value
	 */
	private final String value;
	
	/**
	 * @return the value
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public boolean isNull() {
		return StringUtils.isEmpty(this.value);
	}
}
