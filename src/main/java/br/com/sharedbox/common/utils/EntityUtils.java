package br.com.sharedbox.common.utils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 03/25/2022 - Version 1.0.0
 */
public interface EntityUtils {
	/**
	 * Utils to convert class to json
	 */
	String toJson();
	
	/**
	 * Implements solution to format json string field 
	 * @param value
	 * @return formated value
	 */
	String getJsonValue(String value);
}