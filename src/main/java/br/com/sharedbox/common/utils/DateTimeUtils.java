package br.com.sharedbox.common.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Date time utils
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 * @since 05/01/2021
 */
public class DateTimeUtils {
	/**
	 * <p>
	 * Convert String format MMMM/yyyy to LocalDate
	 * </p>
	 *  
	 * @param dateStr
	 * @return date
	 */
	public static LocalDate stringMMMMyyyyToLocalDate(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		LocalDate ld = LocalDate.parse("01/" + date, formatter);
		return ld;
	}

	/**
	 * <p>
	 * Convert String format MM/dd/yyyy to LocalDate
	 * </p>
	 *  
	 * @param dateStr
	 * @return date
	 */
	public static LocalDate stringMMddyyyyToLocalDate(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate ld = LocalDate.parse(date, formatter);
		return ld;
	}
	
	/**
	 * <p>
	 * Convert LocalDate format yyyy-MM-dd HH:mm:ss to String
	 * </p>
	 *  
	 * @param date
	 * @return dateStr
	 */
	public static String dateTime_yyyy_MM_dd_HH_mm_ss_ToString(LocalDateTime date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		date.format(formatter);
		return date.toString();
	}
	
	/**
	 * <p>
	 * Convert String format yyyy-MM-dd HH:mm:ss to LocalDateTime
	 * </p>
	 *  
	 * @param dateStr
	 * @return date
	 */
	public static LocalDateTime string_yyyy_MM_dd_HH_mm_ss_DateTime(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime ld = LocalDateTime.parse(date, formatter);
		return ld;
	}
}
