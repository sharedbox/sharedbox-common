package br.com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.utils.IpUtils;

/**
 * Call test of IpUtils class
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/23/2021
 */
public class IpUtilsTest {
	/**
	 * Generate a new IP
	 * @return newIp
	 */
	@Test
	public void generateIPTest() {
		assertNotNull(new IpUtils());
		assertNotNull(IpUtils.generateIP());
	}
}