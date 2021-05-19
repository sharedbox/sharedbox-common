package br.com.sharedbox.common.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.lang.Nullable;

/**
 * String utils
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {
	/**
	 * Constructor
	 */
	public StringUtils() {
		super();
	}

	/**
	 * Convert String to Hash MD5 (default base 64)
	 * @param value
	 * @return MD5
	 */
	public static String convertToMD5(String value) {
		return convertToMD5(value, 64);
	}
	
	/**
	 * Convert String to Hash MD5
	 * @param value
	 * @return MD5
	 */
	public static String convertToMD5(String value, int base) {
		String response = EMPTY;
        try {
			MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(value.getBytes()); 
            BigInteger number = new BigInteger(1, messageDigest); 

        	response = number.toString(base); 
            if (base == 16) {
                while (response.length() < 32) { 
                	response = "0" + response; 
                } 
            }
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
        return response;
	}
	
	/**
	 *
	 */
	public static String trimTrailingCharacter(String str, char trailingCharacter) {
		if (!hasLength(str)) {
			return str;
		}
		int eIx = str.length() - 1;
		while (eIx >= 0 && trailingCharacter == str.charAt(eIx)) {
			eIx--;
		}
		return str.substring(0, eIx + 1);
	}
	
	/**
	 *
	 */
	public static boolean hasLength(@Nullable String str) {
		return (str != null && !str.isEmpty());
	}
}
