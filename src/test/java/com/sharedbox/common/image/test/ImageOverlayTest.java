package com.sharedbox.common.image.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.image.ImageOverlay;

/**
 * Call test of ImageOverlay class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 09/23/2021
 */
public class ImageOverlayTest {
	/**
	 * Method generate test
	 * @throws Exception 
	 */
	@Test
	public void imageTest() throws Exception {
		assertNotNull(ImageOverlay.addImageOverlay(this.getClass().getResource("/test/SBLogo.png").getFile()));
		assertNotNull(ImageOverlay.addImageOverlay(this.getClass().getResource("/test/SBLogo.png").getFile(), 1f, 0.20f));
	}
}
