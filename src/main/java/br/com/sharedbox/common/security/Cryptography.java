package br.com.sharedbox.common.security;

import java.util.Base64;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * This class contain encrypt and decrypt    
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 */
public class Cryptography {
	/**
	 * 
	 */
	private static byte[] sharedkey = { 0x01, 0x02, 0x03
			, 0x05, 0x07, 0x0B, 0x0D, 0x11, 0x12, 0x11
			, 0x0D, 0x0B, 0x07, 0x02, 0x04, 0x08, 0x01
			, 0x02, 0x03, 0x05, 0x07, 0x0B, 0x0D, 0x11 };

	/**
	 * 
	 */
	private static byte[] sharedvector = { 0x01, 0x02
			, 0x03, 0x05, 0x07, 0x0B, 0x0D, 0x11 };

	/**
	 * 
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(String value) throws Exception {
		if(value == null) {
			throw new IllegalArgumentException("Value is null");
		}
		
		Cipher c = Cipher.getInstance("DESede/CBC/PKCS5Padding");
	    c.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(sharedkey, "DESede"), new IvParameterSpec(sharedvector));
	    byte[] encrypted = c.doFinal(value.getBytes("UTF-32"));
	    return Base64.getEncoder().encodeToString(encrypted).replace("/", "-");
	}

	/**
	 * 
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String value) throws Exception {
		if(value == null) {
			throw new IllegalArgumentException("Value is null");
		}
			
		value = value.replace("-", "/");
		
		Cipher c = Cipher.getInstance("DESede/CBC/PKCS5Padding");
	    c.init(Cipher.DECRYPT_MODE, new SecretKeySpec(sharedkey, "DESede"), new IvParameterSpec(sharedvector));
	    byte[] decrypted = c.doFinal(Base64.getDecoder().decode(value));
	    return new String(decrypted, "UTF-32");
	}
	
	/**
	 * 
	 * @param bytes
	 * @return
	 */
	public static long getCRC32Checksum(byte[] bytes) {
	    Checksum crc32 = new CRC32();
	    crc32.update(bytes, 0, bytes.length);
	    return crc32.getValue();
	}
}
