package com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.http.Proxy;
import com.sharedbox.common.utils.RestUtils;

/**
 * Call test of RestUtils class
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/23/2021 - Version 1.0.0
 */
public class RestUtilsTest {
	/**
	 * New instance test
	 * @throws KeyStoreException 
	 * @throws NoSuchAlgorithmException 
	 * @throws KeyManagementException 
	 */
	@Test
	public void newInstanceTest() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
		assertNotNull(new RestUtils());
		assertNotNull(RestUtils.newInstance());
		assertNotNull(RestUtils.newInstance(50000));
		assertNotNull(RestUtils.newInstance(new Proxy("host.name", 8080)));
		assertNotNull(RestUtils.newInstance(new Proxy("host.name", 0)));
		assertNotNull(RestUtils.newInstance(new Proxy(null, 8080)));
		assertNotNull(RestUtils.newInstance(new Proxy(null, 8080), 50000));
	}
}
