package br.com.sharedbox.common.documents;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * Common validate
 *
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/01/2021
 */
public class DocumentBase {
	/**
	 * Constructor
	 */
	public DocumentBase() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	public DocumentBase(String number) {
		super();
		this.number = number;
	}
	
	/**
	 * Document number
	 */
	private String number;
	
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public boolean isNull(String value) {
		return StringUtils.isEmpty(value);
	}
}
