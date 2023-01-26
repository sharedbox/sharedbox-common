package com.sharedbox.common.utils;

/**
 * Extensions enum
 * @author Rafael Costi [rafaelcosti@outlook.com] 
 * @version 1.0.0
 * @since 09/02/2021 - Version 1.0.0
 */
public enum Extensions {
	BITMAP(true),
	GIF(true),
	JPG(true),
	JPEG(true),
	PNG(true);
	
	/**
	 * Flag indicating image format
	 */
	private boolean imageFormat;
	
	/**
	 * Constructor
	 * @param imageFormat
	 */
	private Extensions(boolean imageFormat) {
		this.imageFormat = imageFormat;
	}
	
	/**
	 * Indicating image format
	 * @return boolean
	 */
	public boolean isImageFormat() {
		return this.imageFormat;
	}
}
