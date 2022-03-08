package br.com.sharedbox.common.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
		assertNotNull(Platform.Windows.getId());
		assertEquals(Platform.getById(Platform.Windows.getId() + ""), Platform.Windows);
		assertNotEquals(Platform.getById(99), Platform.Windows);
		assertEquals(Platform.getById(Long.MAX_VALUE + ""), Platform.NotFound);
		assertEquals(Platform.getById(null), Platform.NotFound);
		assertEquals(Platform.getById("AA"), Platform.NotFound);
		assertEquals(Platform.getById("1"), Platform.Windows);
	}
}
