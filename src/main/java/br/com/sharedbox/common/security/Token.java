package br.com.sharedbox.common.security;

import java.time.LocalDateTime;

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
	public static String generate() throws Exception {		
		return generate(null);
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public static String generate(long value) throws Exception {
		return generate(Long.toBinaryString(value));
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 * @throws Exception 
	 */
	public static String generate(String value) throws Exception {
		int hash = 0;
		if (value != null) {
			hash = value.hashCode();
		}
		
		String header = "{ \"date\": '" + LocalDateTime.now()
				+ ", \"hash:\"" + hash + ", "
				+ ", \"systemBuild\": \"SharedBox\", " 
				+ ", \"bynary: " + value.getBytes() + " }";
		
		return Cryptography.encrypt(header) + "-" + Cryptography.encrypt(value) ;
	}
}
