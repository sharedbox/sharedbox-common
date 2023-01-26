package com.sharedbox.common.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Objec utils
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 * @since 06/08/2021 - Version 1.0.0
 */
public class ObjectUtils extends org.apache.commons.lang3.ObjectUtils {
	/**
	 * Check if is String object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isString(Object object) {
		return object == null ? false : object instanceof String;
	}

	/**
	 * Check if is Integer object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isInteger(Object object) {
		return object == null ? false : object instanceof Integer;
	}

	/**
	 * Check if is Long object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isLong(Object object) {
		return object == null ? false : object instanceof Long;
	}

	/**
	 * Check if is Byte object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isByte(Object object) {
		return object == null ? false : object instanceof Byte;
	}

	/**
	 * Check if is Float object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isFloat(Object object) {
		return object == null ? false : object instanceof Float;
	}

	/**
	 * Check if is Double object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isDouble(Object object) {
		return object == null ? false : object instanceof Double;
	}

	/**
	 * Check if is Boolean
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isBoolean(Object object) {
		return object == null ? false : object instanceof Boolean;
	}

	/**
	 * Check if is Date
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isDate(Object object) {
		return object == null ? false : object instanceof Date;
	}

	/**
	 * Check if is LocalDate
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isLocalDate(Object object) {
		return object == null ? false : object instanceof LocalDate;
	}

	/**
	 * Check if is LocalDateTime
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isLocalDateTime(Object object) {
		return object == null ? false : object instanceof LocalDateTime;
	}

	/**
	 * Check if is List<?>
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isList(Object object) {
		return object == null ? false : object instanceof List<?>;
	}

	/**
	 * Check if is Map<?, ?>
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isMap(Object object) {
		return object == null ? false : object instanceof Map<?, ?>;
	}
}
