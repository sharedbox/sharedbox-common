package br.com.sharedbox.common.utils;

import java.time.LocalDateTime;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 05/06/2022 - Version 1.0.0
 */
public class JsonUtils {
	/**
	 * Check string value to set string json
	 * @param value
	 * @return
	 */
	public static String getJsonValue(String value) {
		return value == null ? "null" : "\"" + value + "\"";
	}
	
	/**
	 * Check date time value to set date time json
	 * @param value
	 * @return
	 */
	public static String getJsonValue(LocalDateTime value) {
		return value == null ? "null" : "\"" + value.toString() + "\"";
	}
	
	/**
	 * Check date time value to set date time json
	 * @param value
	 * @return
	 */
	public static String getJsonValueString(String value) {
		return getJsonValue(value);
	}
	
	/**
	 * Check date time value to set date time json
	 * @param value
	 * @return
	 */
	public static String getJsonValueDateTime(LocalDateTime value) {
		return getJsonValue(value);
	}
}
