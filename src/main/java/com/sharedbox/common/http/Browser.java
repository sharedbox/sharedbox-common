package com.sharedbox.common.http;

import com.sharedbox.common.utils.StringUtils;

/**
 * Browser list
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/11/2021
 */
public enum Browser {
	Chrome(1),
	Default(0),
	Edge(2),
	FireFox(3),
	IE(4),
	NotFound(0),
	Opera(5),
	Safari(6),
	Vivald(7);
	
	/**
	 * Driver code 
	 */
	private int code;
	
	/**
	 * Constructor
	 * @param driveInstance
	 */
	private Browser(int code) {
		this.code = code;
	}
	
	/**
	 * Get driver code
	 * @return
	 */
	public int getCode() {
		return this.code;
	}

	/**
	 * 
	 * @param string
	 * @return
	 */
	public static Browser getByNameOrCode(int value) {
		return getByNameOrCode(Integer.toString(value));
	}

	/**
	 * 
	 * @param string
	 * @return
	 */
	public static Browser getByNameOrCode(String value) {
		if (StringUtils.isEmpty(value)) {
			return NotFound;
		}

		int code = 0;
		if(StringUtils.isNumeric(value)) {
			code = Integer.parseInt(value);
		} 
		String name = value.toUpperCase().trim();
		for (Browser browser : values()) {
			if (code > 0) {
				if (browser.getCode() == code) {
					return browser;
				}
			} else {
				if (browser.name().toUpperCase().equals(name)) {
					return browser;
				}
			}
		}
		return NotFound;
	}
}