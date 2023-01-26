package com.sharedbox.common.utils;

/**
 * Color grid with Hexadecimal and RGB 
 * 
 * @author Z169131
 * @version 1.0.0
 * @since 06/14/2021 - Version 1.0.0
 */
public enum ColorGrid {
	Aquamarine("7FFFD4", new int[]{127, 255, 212}),
	AquaCyan("00FFFF", new int[]{0, 255, 255}),
	Black("000000 ", new int[]{0, 0, 0}),
	Blue("0000FF", new int[]{0, 0, 255}),
	Darkviolet("9400D3", new int[]{148, 0, 211}),
	Fuchsia("FF00FF", new int[]{255, 0, 255}),
	Green("008000 ", new int[]{0, 128, 0}),
	Gray("808080", new int[]{128, 128, 128}),
	Palevioletred("DB7093", new int[]{219, 112, 147}),
	Purple("800080", new int[]{128, 0, 128}),
	Red("FF0000", new int[]{255, 0, 0}),
	Violet("EE82EE", new int[]{238, 130, 238}),
	Yelow("FFFF00", new int[]{255, 255, 0}),
	White("FFFFFF ", new int[]{255, 255, 255});
	
	/**
	 * Hexadecimal color value
	 */
	private String hexadecimal;
	
	/**
	 * RGB int array color value
	 */
	private int[] rgb;
	
	/**
	 * Constructor
	 */
	private ColorGrid(String hexadecimal, int[] rgb) {
		this.hexadecimal = hexadecimal;
		this.rgb = rgb;
	}
	
	/**
	 * Get hexadecimal color
	 * @return
	 */
	public String getHexadecimal() {
		return this.hexadecimal;
	}
	
	/**
	 * Get hexadecimal color
	 * @return
	 */
	public String getHtmlHexadecimal() {
		return "#" +this.hexadecimal;
	}

	
	/**
	 * Get RGB color
	 * @return
	 */
	public int[] getRGB() {
		return rgb;
	}
}
