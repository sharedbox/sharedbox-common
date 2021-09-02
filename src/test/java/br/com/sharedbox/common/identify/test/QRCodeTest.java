package br.com.sharedbox.common.identify.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.charset.Charset;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.exceptions.SizeException;
import br.com.sharedbox.common.identify.CodeColor;
import br.com.sharedbox.common.identify.ImageOverlay;
import br.com.sharedbox.common.identify.QRCode;
import br.com.sharedbox.common.utils.ColorGrid;
import br.com.sharedbox.common.utils.Extensions;
import br.com.sharedbox.common.utils.FileUtils;

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
				.decorator(ImageOverlay.addImageOverlay("D:\\SharedBox\\docs\\SBLogo.png", 1f, 0.20f))
				.generateBase64(Extensions.PNG);

		assertNotNull(qrCode);
		
		qrCode = QRCode
				.newQRCode()
				.charset(Charset.forName("UTF-8"))
				.content("https://www.instagram.com/sharedboxofficial")
				.size(500)
				.decorator(CodeColor.colorize(ColorGrid.Purple))
				.decorator(ImageOverlay.addImageOverlay(new File("D:\\SharedBox\\docs\\SBLogo.png"), 1f, 0.20f))
				.generateBase64(Extensions.PNG);

		assertNotNull(qrCode);
		
		qrCode = QRCode
				.newQRCode()
				.charset(Charset.forName("UTF-8"))
				.content("https://www.instagram.com/sharedboxofficial")
				.size(500)
				.decorator(CodeColor.colorize(ColorGrid.Purple))
				.decorator(ImageOverlay.addImageOverlay(ImageIO.read(FileUtils.getFile("D:\\SharedBox\\docs\\SBLogo.png")), 1f, 0.20f))
				.generateBase64(Extensions.PNG);

		assertNotNull(qrCode);
		
		qrCode = QRCode
				.newQRCode()
				.charset(Charset.forName("UTF-8"))
				.content("https://www.instagram.com/sharedboxofficial")
				.size(500)
				.decorator(CodeColor.colorize(ColorGrid.Purple))
				.decorator(ImageOverlay.addImageOverlay("D:\\SharedBox\\docs\\SBLogo.png"))
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
