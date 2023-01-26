package com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.utils.GeolocationUtils;

/**
 * Call test of GeolocationUtils class
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/23/2021 - Version 1.0.0
 */
public class GeolocationUtilsTest {
	/**
	 * Constructor test
	 */
	@Test
	public void construcotTest() {
		assertNotNull(new GeolocationUtils());
	}
	
	/**
	 * Generates random latitude
	 */
	@Test
	public void generateLatitudeTest() {
		assertNotNull(GeolocationUtils.generateLatitude());
	}
	
	/**
	 * Generates random longitude
	 */
	@Test
	public void generateLongitudeTest() {
		assertNotNull(GeolocationUtils.generateLongitude());
	}
}
