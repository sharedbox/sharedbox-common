package com.sharedbox.common.utils;

/**
 * Geolocation utils
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 * @since 06/15/2021 - Version 1.0.0
 */
public class GeolocationUtils {
	/**
	 * Generates random latitude
	 *
	 * @return latitude
	 */
	public static double generateLatitude() {
		return generateCoordinate() - 38.5290245;
	}
	
	/**
	 * Generates random seed for latitude and longitude coordinates.
	 */
	private static double generateCoordinate() {
		double seed;
	    seed = 2000 / Math.sqrt(Math.random());
	    seed = seed * Math.sin(2 * 3.141592654 * Math.random());
	    return seed;
	}
	
	/**
	 * Generates random longitude
	 *
	 * @return random longitude
	 */
	public static double generateLongitude() {
		return generateCoordinate() - 3.7506985;
	}
}
