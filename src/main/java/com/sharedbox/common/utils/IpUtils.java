package com.sharedbox.common.utils;

import java.util.Random;

/**
 * IP utils
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 * @since 06/15/2021 - Version 1.0.0
 */
public class IpUtils  {
	/**
	 * Generate a new IP
	 * @return newIp
	 */
	public static String generateIP() {
		Random r = new Random();
		return r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256);
	}
}
