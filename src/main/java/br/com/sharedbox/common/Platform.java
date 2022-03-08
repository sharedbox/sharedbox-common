package br.com.sharedbox.common;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * Enum with name and platform code
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 08/13/021 - Version 1.0.0 
 */
public enum Platform {
	NotFound(0),
	Windows(1),
    MacOS(2),
    Linux(3),
    Cross(4),
    IOS(5),
    Android(6);
	
	/**
	 * Platform id
	 */
	private int id;
	
	/**
	 * Constructor
	 * @param id
	 */
	private Platform(int id) {
		this.id = id;
	}
	
	/**
	 * Get platform id
	 * @return
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static Platform getById(String id) {
		if (StringUtils.isEmpty(id)) {
			return NotFound;
		}
		
		if (!StringUtils.isNumeric(id)) {
			return NotFound;
		} else {
			long value = Long.parseLong(id);
			
			if (value > Byte.MAX_VALUE) {
				return NotFound;
			}
		}
		
		return getById(Byte.parseByte(id));
	}
		
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static Platform getById(int id) {
		for (Platform platform : values()) {
			if (platform.getId() == id) {
				return platform;
			}
		}
		return NotFound;
	}
}
