package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum CostaRicaRegions {
	NotFound(null, null, null, null, null),
	Alajuela("Alajuela", "CR", "A", "01", "Q502188"),
	Guanacaste("Guanacaste", "CR", "G", "03", "Q690026"),
	Heredia("Heredia", "CR", "H", "04", "Q502192"),
	Limon("limon", "CR", "L", "06", "Q642644"),
	ProvinciaDeCartago("Provincia de Cartago", "CR", "C", "02", "Q502181"),
	Puntarenas("Puntarenas", "CR", "P", "07", "Q502170"),
	SanJose("San Jose", "CR", "SJ", "08", "Q647808");

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
	private CostaRicaRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static CostaRicaRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (CostaRicaRegions region : values()) {
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
		
		for (CostaRicaRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
