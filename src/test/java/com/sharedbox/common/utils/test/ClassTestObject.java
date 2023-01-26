package com.sharedbox.common.utils.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Class for ObjectUtilsTest
 * 
 * @author Rafael Costi
 * @version 1.0.2
 * @since 06/11/2022 - Version 1.0.0
 */
class ClassTestObject {
	/**
	 * 
	 */
	private int value1;

	/**
	 * 
	 */
	private String value2;

	/**
	 * 
	 */
    @JsonFormat(pattern="MM-dd-yyyy")
	private LocalDate date;

	/**
	 * 
	 */
    @JsonFormat(pattern="MM-dd-yyyy HH:mm:ss")
	private LocalDateTime datetime;

	/**
	 * Constructor
	 */
	public ClassTestObject() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param value1
	 * @param value2
	 * @param date
	 * @param dateTime
	 */
	public ClassTestObject(int value1, String value2, LocalDate date, LocalDateTime dateTime) {
		super();
		this.setValue1(value1);
		this.setValue2(value2);
		this.setDate(date);
		this.setDatetime(dateTime);
	}

	/**
	 * @return the value1
	 */
	public int getValue1() {
		return value1;
	}

	/**
	 * @param value1 the value1 to set
	 */
	public void setValue1(int value1) {
		this.value1 = value1;
	}

	/**
	 * @return the value2
	 */
	public String getValue2() {
		return value2;
	}

	/**
	 * @param value2 the value2 to set
	 */
	public void setValue2(String value2) {
		this.value2 = value2;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the dateTime
	 */
	public LocalDateTime getDatetime() {
		return datetime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	@Override
	public String toString() {
		return "ClassTestObject [value1=" + this.getValue1() + ", value2=" + this.getValue2() + ", date="
				+ this.getDate() + ", dateTime=" + this.getDatetime() + "]";
	}
}
