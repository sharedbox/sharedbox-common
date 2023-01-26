package com.sharedbox.common.image;

import java.awt.Color;

import com.sharedbox.common.utils.ColorGrid;

/**
 * 
 * @author Rafael Costi [rafaelcosti@outlook.]
 * @see java.awt.image.RGBImageFilter
 * @version 1.0.0
 * @since 08/02/2021 - Version 1.0.0
 */
public class RGBImageFilter extends java.awt.image.RGBImageFilter {
	/**
	 * Constructor
	 */
	public RGBImageFilter() {
		super();
	}

	/**
	 * Constructor
	 */
	public RGBImageFilter(ColorGrid colorGrid) {
		super();
		this.colorGrid = colorGrid;
	}
	
	/**
	 * Informed color 
	 */
	private ColorGrid colorGrid;
	
	@Override
	public int filterRGB(int x, int y, int rgb) {
		if (this.colorGrid == null) {
			throw new RuntimeException("Not informed color");
		}
		
		if ((this.colorGrid != null && this.colorGrid == ColorGrid.Black)
				|| (this.colorGrid == null && rgb == Color.black.getRGB())) {
			return Color.black.getRGB();
		}
		
		return Color.decode(this.colorGrid.getHtmlHexadecimal()).getRGB();
	}
}
