package com.sharedbox.common.location;

import com.sharedbox.common.utils.StringUtils;

/**
 * Constinents Enum
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 03/03/2022 - Version 1.0.0
 */
public enum Continents {
	NotFound(null, null, null, null),
	America("América", "America", "America", "AM"),
	Asia("Ásia", "Asia", "Asia", "AS"),
	Europe("Europa", "Europe", "Europa", "EU"),
	Africa("África", "Africa", "África", "AF"),
	Oceania("Oceania", "Oceania", "Oceanía", "OC"),
	Antarctica("Antártida", "Antarctica", "Antártida", "AN");
	
	/**
	 * 
	 */
	private String namePt;
	
	/**
	 * 
	 */
	private String nameEn;
	
	/**
	 * 
	 */
	private String nameEs;
	
	/**
	 * 
	 */
	private String code;
	
	/**
	 * Constructor
	 * 
	 * @param namePt
	 * @param nameEn
	 * @param nameEs
	 * @param continentCode
	 */
	private Continents(String namePt, String nameEn, String nameEs, String code){
		this.namePt = namePt;
		this.nameEn = nameEn;
		this.nameEs = nameEs;
		this.code = code;
	}

	/**
	 * @return the namePt
	 */
	public String getNamePt() {
		return this.namePt;
	}

	/**
	 * @return the nameEn
	 */
	public String getNameEn() {
		return this.nameEn;
	}

	/**
	 * @return the nameEs
	 */
	public String getNameEs() {
		return this.nameEs;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return this.code;
	}
		
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static Continents getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (Continents continent : values()) {
			if (continent.getCode() == code) {
				return continent;
			}
		}
		return NotFound;
	}

	/**
	 * Object json
	 * @return
	 */
	public String toJson() {
		return "{\"namePt\": \"" + this.getNamePt() + "\""
			+ ", \"nameEn\": \"" + this.getNameEn() + "\""
			+ ", \"nameEs\": \"" + this.getNameEs() + "\""
			+ ", \"code\": \"" + this.getCode() + "\" }";
	}
	
	/**
	 * List all continents on json
	 * @return
	 */
	public static String toJsonList() {
		String response = StringUtils.EMPTY;
		
		for (Continents continent : values()) {
			if (continent != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + continent.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
