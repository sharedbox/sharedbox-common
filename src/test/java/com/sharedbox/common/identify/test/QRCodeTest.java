package com.sharedbox.common.identify.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.nio.charset.Charset;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.exceptions.SizeException;
import com.sharedbox.common.identify.CodeColor;
import com.sharedbox.common.identify.QRCode;
import com.sharedbox.common.image.ImageOverlay;
import com.sharedbox.common.utils.ColorGrid;
import com.sharedbox.common.utils.Extensions;

/**
 * Call test of QRCode class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 09/23/2021
 */
public class QRCodeTest {
	/**
	 * Method generate test
	 * @throws Exception 
	 */
	@Test
	public void generateTest() throws Exception {
		String qrCode = QRCode
				.newQRCode()
				.charset(Charset.forName("UTF-8"))
				.content("https://www.instagram.com/sharedboxofficial")
				.size(500)
				.decorator(CodeColor.colorize(ColorGrid.Purple))
				.decorator(ImageOverlay.addImageOverlay(
						this.getClass().getResourceAsStream("/test/SBLogo.png"), 1f, 0.20f))
				.generateBase64(Extensions.PNG);

		assertNotNull(qrCode);
		
		qrCode = QRCode
				.newQRCode()
				.charset(Charset.forName("UTF-8"))
				
				.content("https://www.instagram.com/sharedboxofficial")
				.size(500)
				.decorator(CodeColor.colorize(ColorGrid.Purple))
				.decorator(ImageOverlay.addImageOverlay(
						this.getClass().getResourceAsStream("/test/SBLogo.png"), 1f, 0.20f))
				.generateBase64(Extensions.PNG);

		assertNotNull(qrCode);
		
		qrCode = QRCode
				.newQRCode()
				.charset(Charset.forName("UTF-8"))
				.content("https://www.instagram.com/sharedboxofficial")
				.size(500)
				.decorator(CodeColor.colorize(ColorGrid.Purple))
				.decorator(ImageOverlay.addImageOverlay(
						this.getClass().getResourceAsStream("/test/SBLogo.png"), 1f, 0.20f))
				.generateBase64(Extensions.PNG);

		assertNotNull(qrCode);
		
		qrCode = QRCode
				.newQRCode()
				.charset(Charset.forName("UTF-8"))
				.content("https://www.instagram.com/sharedboxofficial")
				.size(500)
				.decorator(CodeColor.colorize(ColorGrid.Purple))
				.decorator(ImageOverlay.addImageOverlay(
						this.getClass().getResourceAsStream("/test/SBLogo.png"), 1f, 0.20f))
				.generateBase64(Extensions.GIF);

		assertNotNull(qrCode);
		
		SizeException sizeException = assertThrows(SizeException.class, () -> QRCode.newQRCode().size(0));
		assertTrue(sizeException.getMessage().contains("Width is to small should be > 0 is"));
		
		Exception ex = assertThrows(Exception.class, () -> QRCode.newQRCode().generateBase64(Extensions.JPG));
		assertTrue(ex.getMessage().contains("Is not a valid format"));

		BufferedImage img = null;
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class
				, () -> QRCode.newQRCode().decorator(ImageOverlay.addImageOverlay(img)));
		assertTrue(iae.getMessage().contains("Overlay is required"));
	}
}
