package com.sharedbox.common.security;

import java.time.LocalDateTime;

import org.apache.commons.lang3.StringUtils;

/**
 * This class contain encrypt and decrypt    
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 */
public class Token {
	/**
	 * Constructor
	 */
	public Token() {
		super();
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String generate()  {	
		return generate(null);
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public static String generate(long value)  {
		return generate(Long.toBinaryString(value));
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 * @throws Exception 
	 */
	public static String generate(String value)  {
		int hash = 0;
		if (value != null) {
			hash = value.hashCode();
		} else {
			String date = LocalDateTime.now().toString();
			value = Long.toBinaryString(date.hashCode());
		}
		
		String bynary = StringUtils.EMPTY;
		boolean first = true;
		for (byte bt : value.getBytes()) {
			if(first) {
				bynary = "" + bt;
				first = false;
			} else {
				bynary = bynary + ":" + bt;
			}
		}

		String header = "{ \"date\": '" + LocalDateTime.now().toString()
				+ ", \"hash\": " + hash 
				+ ", \"systemBuild\": \"SharedBox\"" 
				+ ", \"bynary\": \"" + bynary + "\" }";
		
		return Cryptography.encrypt(header) + "." + Cryptography.encrypt(value) ;
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 * @throws Exception 
	 */
	public static String reader(String value) throws Exception {
		String[] values = readerValues(value);
		
		if (values == null) {
			return "";
		}
		
		return values[1];
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 * @throws Exception 
	 */
	public static String[] readerValues(String value) throws Exception {
		if(value == null) {
			return null;
		}
		
		String[] values = value.split("\\.");
		if (values.length == 2 ) {
			values[0] = Cryptography.decrypt(values[0]);
			values[1] = Cryptography.decrypt(values[1]);
			return values;
		}
		
		return null;
	}
}
