package com.sharedbox.common.identify;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;

import com.sharedbox.common.image.RGBImageFilter;
import com.sharedbox.common.utils.ColorGrid;

/**
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 09/02/2021 - Version 1.0.0
 */
public class CodeColor implements CodeDecorator<BufferedImage> {
	/**
	 * Constructor
	 */
	private CodeColor(ColorGrid colorGrid) {
		super();
		this.colorGrid = colorGrid;
	}
	
	/**
	 * Code colorize
	 * @param color
	 * @return
	 */
	public static CodeDecorator<BufferedImage> colorize(ColorGrid color) {
		return new CodeColor(color);
	}
	
	/**
	 * 
	 */
	private ColorGrid colorGrid;

	/**
	 * Image decorated
	 */
	@Override
	public BufferedImage decorate(BufferedImage qrcode) {		
		FilteredImageSource filteredImage = new FilteredImageSource(qrcode.getSource(), new RGBImageFilter(this.colorGrid));
		Image image = Toolkit.getDefaultToolkit().createImage(filteredImage);

		BufferedImage bufferedImage = new BufferedImage(image.getWidth(null)
				, image.getHeight(null)
				, BufferedImage.TYPE_INT_ARGB);
		
		Graphics2D g2 = bufferedImage.createGraphics();
		g2.drawImage(image, 0, 0, null);
		g2.dispose();

	    return bufferedImage;
	}
}
