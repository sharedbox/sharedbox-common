package com.sharedbox.common.image.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.image.RGBImageFilter;

/**
 * Call test of RGBImageFilter class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 09/02/2021
 */
public class RGBImageFilterTest {
	/**
	 * Constructor test
	 */
	@Test
	public void filterRGBTest() {
		RGBImageFilter rgbImageFilter = new RGBImageFilter();
		
		Exception sizeException = assertThrows(Exception.class, () -> rgbImageFilter.filterRGB(0,0,0));
		assertTrue(sizeException.getMessage().contains("Not informed color"));
	}
}
