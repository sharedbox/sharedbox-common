package com.sharedbox.common.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;

import com.sharedbox.common.location.Languages;

/**
 * Utilities for dealing with date/times
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 * @since 05/01/2021 - Version 1.0.0
 */
public class DateTimeUtils {
	/**
	 * <p>
	 * Convert String format MMMM/yyyy to LocalDate
	 * </p>
	 * 
	 * @param date
	 * @return
	 */
	public static LocalDate stringMMMMyyyyToLocalDate(String date) {
		return stringMMMMyyyyToLocalDate(date, Languages.Pt);
	}

	/**
	 * <p>
	 * Convert String format MMMM/yyyy to LocalDate
	 * </p>
	 * 
	 * @param date
	 * @param lang
	 * @return
	 */
	public static LocalDate stringMMMMyyyyToLocalDate(String date, Languages lang) {
		if (lang == null) {
			throw new IllegalArgumentException("Invalid language");
		}
		
		dateValidate(date);
		
		if (date.contains("/")) {
			date = date.replace("/", " ");
		}
		
		if (lang.equals(Languages.Pt)) {
			date = date.toLowerCase();
		} else {
			date = StringUtils.upperCaseFirstChar(date);
		}
		
		Locale locale = new Locale(lang.getCode());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy")
				.localizedBy(locale);
		
		TemporalAccessor ta = formatter.localizedBy(locale).parse(date);
	    YearMonth ym = YearMonth.from(ta);
		return LocalDate.of(ym.getYear(),  ym.getMonthValue(), 1);
	}

	/**
	 * <p>
	 * Convert String format MMMM/yyyy to LocalDate
	 * </p>
	 * 
	 * @param date
	 * @return
	 */
	public static LocalDateTime stringMMMMyyyyToLocalDateTime(String date) {
		return stringMMMMyyyyToLocalDateTime(date, Languages.Pt);
	}

	/**
	 * <p>
	 * Convert String format MMMM/yyyy to LocalDate
	 * </p>
	 * 
	 * @param date
	 * @param lang
	 * @return
	 */
	public static LocalDateTime stringMMMMyyyyToLocalDateTime(String date, Languages lang) {
		if (lang == null) {
			throw new IllegalArgumentException("Invalid language");
		}
		
		dateValidate(date);
		
		if (date.contains("/")) {
			date = date.replace("/", " ");
		}
		
		if (lang.equals(Languages.Pt)) {
			date = date.toLowerCase();
		} else {
			date = StringUtils.upperCaseFirstChar(date);
		}
		
		Locale locale = new Locale(lang.getCode());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy")
				.localizedBy(locale);
		
		TemporalAccessor ta = formatter.localizedBy(locale).parse(date);
	    YearMonth ym = YearMonth.from(ta);
		return LocalDateTime.of(ym.getYear(),  ym.getMonthValue(), 1, 0, 0);
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
		dateValidate(date);
		
		if (!date.contains("/")) {
			throw new IllegalArgumentException("Invalid date. Not contains \"/\"");
		}
		
		String[] dt = date.split("/");
		monthValidate(Integer.parseInt(dt[0]));
		dayValidate(Integer.parseInt(dt[1]));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate ld = LocalDate.parse(date, formatter);
		return ld;
	}
	
	/**
	 * Convert String format yyyy-MM-dd to LocalDate
	 * 
	 * @param date
	 * @return
	 */
	public static LocalDate string_yyyy_MM_dd_ToLocalDate(String date) {
		dateValidate(date);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		String[] dt = date.split("-");
		monthValidate(Integer.parseInt(dt[1]));
		dayValidate(Integer.parseInt(dt[2]));

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
		dateValidate(date);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return date.format(formatter);
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
		dateValidate(date);
		String[] dt = date.split("-");
		dt[2] = dt[2].split(" ")[0];
		dayValidate(Integer.parseInt(dt[2]));
		monthValidate(Integer.parseInt(dt[1]));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime ld = LocalDateTime.parse(date, formatter);
		return ld;
	}
	
	/**
	 * 
	 * @param date
	 */
	private static void dateValidate(LocalDateTime date) {
		if (date == null) {
			throw new IllegalArgumentException("Invalid date");
		}
	}
	
	/**
	 * 
	 * @param date
	 */
	private static void dateValidate(String date) {
		if (StringUtils.isEmpty(date)) {
			throw new IllegalArgumentException("Invalid date");
		}
	}
	
	/**
	 * Check month is valid
	 * 
	 * @param month
	 * @return
	 */
	private static void monthValidate(int month) {
		if (month > 12 || month < 1) {
			throw new IllegalArgumentException("Invalid month");
		}
	}
	
	/**
	 * Check day is valid
	 * 
	 * @param month
	 * @return
	 */
	private static void dayValidate(int day) {
		if (day > 31 || day < 1) {
			throw new IllegalArgumentException("Invalid day");
		}
	}

	/**
	 * Convert LocalDate to Date
	 * @param object
	 */
	public static Date localDateToDate(LocalDate localDate) {
		return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	/**
	 * Convert LocalDateTime to Date
	 * @param object
	 */
	public static Date localDateTimeToDate(LocalDateTime localDateTime) {
		return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
	}
}
