package br.com.sharedbox.common.utils;

import java.lang.reflect.Type;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.text.MaskFormatter;

import org.apache.commons.codec.binary.Hex;

/**
 * String utils
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 * @since 06/08/2021
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {
	/**
	 * Constructor
	 */
	public StringUtils() {
		super();
	}

	/**
	 * 
	 * @param secret
	 * @param input
	 * @return
	 */
	public static String convertToSha1Hex(String secret, String input) {
	    String check = null;
	    try {
	    	Mac sha1_HMAC = Mac.getInstance("HmacSHA1");
	    	SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(), "HmacSHA1");
	    	sha1_HMAC.init(secretKey);
	    	byte[] hash = sha1_HMAC.doFinal(input.getBytes());
	    	check = Hex.encodeHexString(hash);
	    } catch (NoSuchAlgorithmException | InvalidKeyException exception) {
	    	throw new RuntimeException(exception);
	    }
	    return check;
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
	public static boolean hasLength(String str) {
		return (str != null && !str.isEmpty());
	}

	/**
	 * Create a new uuid
	 * @return
	 */
	public static String newUUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * Create a new uuid from string
	 * @return
	 */
	public static String newUUIDByString(String str) {
		return UUID.fromString(str).toString();
	}

	/**
	 * Create a new uuid by bytes
	 * @return
	 */
	public static String newUUIDFromBytes(byte[] bt) {
		return UUID.nameUUIDFromBytes(bt).toString();
	}
	
	/**
	 * Create mask format on value
	 * @return
	 * @throws Exception 
	 */
	public static String maskFormat(String mask, String value) throws Exception {
		return new MaskFormatter(mask).valueToString(value);
	}
	
	/**
	 * Remove special character
	 * @return
	 */
	public static String removeSpecialCharacter(String value) {
		return value.replaceAll("[^a-zA-Z0-9]", "");
	}

	/**
	 * Only numbers
	 * @return
	 */
	public static String onlyNumbers(String value) {
		if(isEmpty(value)) {
			return "0";
		}
		return value.replaceAll("[^0-9]", "");
	}

	/**
	 * Convert JSON String to Object
	 * @return
	 */
	public static <T> T  convertToObject(String obj, Class<T> to) {
		return ObjectUtils.convertToClassModel(obj, to);
	}

	/**
	 * Convert JSON String to Object
	 * @return
	 */
	public static <T> T  convertToObject(String obj, Type to) {
		return ObjectUtils.convertToClassModel(obj, to);
	} 

	/**
	 * Generate random string 
	 * 
	 * @param amount character
	 * @return
	 */
	public static String strRandon(int amountChar) {
		return strRandon(amountChar, false, false, false, false);
	}

	/**
	 * Generate random string 
	 * 
	 * @param amount character
	 * @param whith upper
	 * @return
	 */
	public static String strRandon(int amountChar, boolean upper) {
		return strRandon(amountChar, upper, false, false, false);
	}

	/**
	 * Generate random string 
	 * 
	 * @param amount character
	 * @param whith upper
	 * @param whith lower
	 * @return
	 */
	public static String strRandon(int amountChar, boolean upper, boolean lower) {
		return strRandon(amountChar, upper, lower, false, false);
	}

	/**
	 * Generate random string 
	 * 
	 * @param amount character
	 * @param whith upper
	 * @param whith lower
	 * @param whith number
	 * @return
	 */
	public static String strRandon(int amountChar, boolean upper, boolean lower, boolean number) {
		return strRandon(amountChar, upper, lower, number, false);
	}
	
	/**
	 * Generate random string 
	 * 
	 * @param amount character
	 * @param whith upper
	 * @param whith lower
	 * @param whith number
	 * @param whith specialChar
	 * @return
	 */
	public static String strRandon(int amountChar, boolean upper, boolean lower, boolean number, boolean specialChar) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String special = "!@#$%&?£";
		String strRandom = EMPTY;
		
		strRandom = upper ? strRandom = alpha.toUpperCase() : EMPTY;
		strRandom = lower ? strRandom = strRandom + alpha.toLowerCase() : EMPTY;
		strRandom = number ? strRandom = strRandom + numbers : EMPTY;
		strRandom = specialChar ? strRandom = strRandom + special : EMPTY;
		
		if (isEmpty(strRandom)) {
			strRandom = alpha.toUpperCase() + alpha.toLowerCase() + numbers ;
		}
		
		String reponse = EMPTY;
		Random random = new Random();
		
		for (int i = 0; i < amountChar; i++) {
			reponse = reponse + strRandom.charAt(random.nextInt(strRandom.length()));
		}
		
		return reponse;
	}
}
