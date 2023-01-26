package com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.location.Languages;
import com.sharedbox.common.utils.DateTimeUtils;

/**
 * Call test of DateTimeUtils class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/03/2021 - Version 1.0.0
 */
public class DateTimeUtilsTest {
	/**
	 * Test constructor class
	 */
	@Test
	void constructorTest() {
		assertNotNull(new DateTimeUtils());
	}

	/**
	 * 
	 */
	@Test
	void stringMMMMyyyyToLocalDateTest() {
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.stringMMMMyyyyToLocalDate(null, null));
		assertTrue(thrown.getMessage().contains("Invalid language"));
		
		thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.stringMMMMyyyyToLocalDate(null, Languages.En));
		assertTrue(thrown.getMessage().contains("Invalid date"));

		assertNotNull(DateTimeUtils.stringMMMMyyyyToLocalDate("Março 2021"));
		assertNotNull(DateTimeUtils.stringMMMMyyyyToLocalDate("March 2021", Languages.En));
		assertNotNull(DateTimeUtils.stringMMMMyyyyToLocalDate("march 2021", Languages.En));
		assertNotNull(DateTimeUtils.stringMMMMyyyyToLocalDate("march/2021", Languages.En));
	}

	/**
	 * 
	 */
	@Test
	void stringMMddyyyyToLocalDateTest() {
		assertNotNull(DateTimeUtils.stringMMddyyyyToLocalDate("01/01/2021"));
		
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.stringMMddyyyyToLocalDate(null));
		assertTrue(thrown.getMessage().contains("Invalid date"));

		thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.stringMMddyyyyToLocalDate(""));
		assertTrue(thrown.getMessage().contains("Invalid date"));

		thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.stringMMddyyyyToLocalDate("01012021"));
		assertTrue(thrown.getMessage().contains("Invalid date. Not contains \"/\""));
		
		thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.stringMMddyyyyToLocalDate("13/01/2021"));
		assertTrue(thrown.getMessage().contains("Invalid month"));
		
		thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.stringMMddyyyyToLocalDate("0/01/2021"));
		assertTrue(thrown.getMessage().contains("Invalid month"));

		thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.stringMMddyyyyToLocalDate("12/32/2021"));
		assertTrue(thrown.getMessage().contains("Invalid day"));
		
		thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.stringMMddyyyyToLocalDate("12/0/2021"));
		assertTrue(thrown.getMessage().contains("Invalid day"));
	}

	/**
	 * 
	 */
	@Test
	void dateTime_yyyy_MM_dd_HH_mm_ss_ToStringTest() {
		assertNotNull(DateTimeUtils.dateTime_yyyy_MM_dd_HH_mm_ss_ToString(LocalDateTime.now()));

		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.dateTime_yyyy_MM_dd_HH_mm_ss_ToString(null));
		assertTrue(thrown.getMessage().contains("Invalid date"));
	}
	
	/**
	 * 
	 */
	@Test
	void string_yyyy_MM_dd_HH_mm_ss_DateTimeTest() {
		assertNotNull(DateTimeUtils.string_yyyy_MM_dd_HH_mm_ss_DateTime("2021-03-03 11:00:00"));

		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.string_yyyy_MM_dd_HH_mm_ss_DateTime(null));
		assertTrue(thrown.getMessage().contains("Invalid date"));
		
		thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.string_yyyy_MM_dd_HH_mm_ss_DateTime("2021-03-33 11:00:00"));
		assertTrue(thrown.getMessage().contains("Invalid day"));
	}
	
	/**
	 * 
	 */
	@Test
	void stringyyyy_MM_ddToLocalDateTest() {
		assertNotNull(DateTimeUtils.string_yyyy_MM_dd_ToLocalDate("2022-02-01"));

		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class
				, () -> DateTimeUtils.string_yyyy_MM_dd_ToLocalDate(null));
		assertTrue(thrown.getMessage().contains("Invalid date"));
	}	
}
