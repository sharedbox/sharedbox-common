package br.com.sharedbox.common.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.Platform;

/**
 * Call test of Platform enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 09/02/2021
 */
public class PlatformTest {
	/**
	 * Platform test
	 */
	@Test
	public void platformTest() {
		Platform plat = Platform.Windows;

		assertNotNull(plat);
		assertNotNull(plat.getId());
	}
}
