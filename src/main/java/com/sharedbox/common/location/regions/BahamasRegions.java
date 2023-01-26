package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum BahamasRegions {
	NotFound(null, null, null, null, null),
	Acklins("Acklins", "BS", "AK", "24", "Q341919"),
	Bimini("Bimini", "BS", "BI", "05", "Q863476"),
	CatIsland("Cat Island", "BS", "CI", "06", "Q1050154"),
	CentralAbaco("Central Abaco", "BS", "CO", "37", "Q2525371"),
	CrookedIsland("Crooked Island", "BS", "CK", "40", "Q1140993"),
	EastGrandBahama("East Grand Bahama", "BS", "EG", "41", "Q2630334"),
	Exuma("Exuma", "BS", "EX", "10", "Q1385577"),
	Freeport("Freeport", "BS", "FP", "25", "Q867573"),
	HarbourIsland("Harbour Island", "BS", "HI", "22", "Q2357510"),
	HopeTown("Hope Town", "BS", "HT", "43", "Q2699709"),
	Inagua("Inagua", "BS", "IN", "13", "Q1353668"),
	LongIsland("Long Island", "BS", "LI", "15", "Q890879"),
	MayaguanaDistrict("Mayaguana District", "BS", "MG", "16", "Q21712462"),
	NewProvidence("New Providence", "BS", "NP", "23", "Q858513"),
	NorthAbaco("North Abaco", "BS", "NO", "46", "Q623327"),
	NorthAndros("North Andros", "BS", "NS", "47", "Q2699411"),
	SanSalvadorIsland("San Salvador Island", "BS", "SS", "35", "Q845540"),
	WestGrandBahama("West Grand Bahama", "BS", "WG", "54", "Q2702338");

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
	private BahamasRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static BahamasRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (BahamasRegions region : values()) {
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
		
		for (BahamasRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
