package br.com.sharedbox.common.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Date time utils
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
}
