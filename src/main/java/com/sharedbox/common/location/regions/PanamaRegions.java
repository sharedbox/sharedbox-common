package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum PanamaRegions {
	NotFound(null, null, null, null, null),
	BocasDelToro("bocas del toro", "PA", "1", "01", "Q217138"),
	Chiriqui("Chiriquí", "PA", "4", "02", "Q739651"),
	Cocle("Coclé", "PA", "2", "03", "Q825799"),
	Colon("Colon", "PA", "3", "04", "Q820514"),
	Darien("Darién", "PA", "5", "05", "Q688660"),
	ComarcaEmberaWounaan("Comarca Emberá-Wounaan", "PA", "EM", "11", "null"),
	GunaYala("Guna Yala", "PA", "KY", "09", "Q919017"),
	Herrera("herrera", "PA", "6", "06", "Q842886"),
	LosSantos("los Santos", "PA", "7", "07", "Q911278"),
	ComarcaNgobeBugle("Comarca Ngöbe-Buglé", "PA", "NB", "12", "Q1129783"),
	PanamaOeste("Panamá Oeste", "PA", "10", "13", "Q16250688"),
	Panama("Panamá", "PA", "8", "08", "Q557506"),
	Veraguas("Veraguas", "PA", "9", "10", "Q593137");

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	private String country;

	/**
	 * 
	 */
	private String code;

	/**
	 * 
	 */
	private String fipsCode;

	/**
	 * 
	 */
	private String wikiDataId;

	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param name
	 * @param country
	 * @param code
	 * @param ibgeId
	 * @param fipsCode
	 * @param wikiDataId
	 */
	private PanamaRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
		this.name = name;
		this.country = country;
		this.code = code;
		this.fipsCode = fipsCode;
		this.wikiDataId = wikiDataId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the fipsCode
	 */
	public String getFipsCode() {
		return fipsCode;
	}

	/**
	 * @return the wikiDataId
	 */
	public String getWikiDataId() {
		return wikiDataId;
	}

	/**
	 * 
	 * @param code
	 * @return
	 */
	public static PanamaRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (PanamaRegions region : values()) {
			if (region != NotFound) {
				if (region.getCode() == code) {
					return region;
				}
			}
		}
		
		return NotFound;
	}

	/**
	 * Object json
	 * @return
	 */
	public String toJson() {
		return "{ \"name\": \"" + this.getName() + "\""
			+ ", \"code\": \"" + this.getCode() + "\""
			+ ", \"country\": \"" + this.getCountry() + "\""
			+ ", \"fipsCode\": \"" + this.getFipsCode() + "\""
			+ ", \"wikiDataId\": \"" + this.getWikiDataId() + " }";
	}
	
	/**
	 * List all currencies on json
	 * @return
	 */
	public static String toJsonList() {
		String response = StringUtils.EMPTY;
		
		for (PanamaRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
