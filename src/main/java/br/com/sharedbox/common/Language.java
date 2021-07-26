package br.com.sharedbox.common;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * Enum languages
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/03/2021
 */
public enum Language {
	En("en"),
	Es("es"),
	Pt("pt"),
	NotFound("");
	
	/**
	 * 
	 */
	private String code;
	
	/**
	 * Constructor
	 * @param code
	 */
	private Language(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return this.code;
	}
	
	/**
	 * 
	 * @param code
	 * @return
	 */
	public static Language getbyCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for(Language lang : values()) {
			if (lang.getCode().equalsIgnoreCase(code.toLowerCase())) {
				return lang;
			}
		}
		
		return NotFound;
	}
}
