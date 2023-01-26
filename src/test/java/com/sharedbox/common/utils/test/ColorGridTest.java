package com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.utils.ColorGrid;

/**
 * Call test of ColorGridTest enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/23/2021 - Version 1.0.0
 */
public class ColorGridTest {
	/**
	 * Color grid test
	 */
	@Test
	public void languageTest() {
		ColorGrid color = ColorGrid.Black;
		assertNotNull(color);
		assertNotNull(ColorGrid.Black.getHexadecimal());
		assertNotNull(ColorGrid.Black.getHtmlHexadecimal());
		int[] rgb = ColorGrid.Black.getRGB();
		assertEquals(rgb[0], 0);
		assertEquals(rgb[1], 0);
		assertEquals(rgb[2], 0);
	}
}
