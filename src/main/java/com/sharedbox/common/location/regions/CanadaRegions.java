package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum CanadaRegions {
	NotFound(null, null, null, null, null),
	Alberta("Alberta", "CA", "AB", "01", "Q1951"),
	BritishColumbia("British Columbia", "CA", "BC", "02", "Q1974"),
	Manitoba("Manitoba", "CA", "MB", "03", "Q1948"),
	NewBrunswick("New Brunswick", "CA", "NB", "04", "Q1965"),
	NewfoundlandAndLabrador("Newfoundland and Labrador", "CA", "NL", "05", "Q2003"),
	NorthwestTerritories("Northwest Territories", "CA", "NT", "13", "Q2007"),
	NovaScotia("Nova Scotia", "CA", "NS", "07", "Q1952"),
	Nunavut("Nunavut", "CA", "NU", "14", "Q2023"),
	Ontario("Ontario", "CA", "ON", "08", "Q1904"),
	PrinceEdwardIsland("Prince Edward Island", "CA", "PE", "09", "Q1979"),
	Quebec("Quebec", "CA", "QC", "10", "Q176"),
	Saskatchewan("Saskatchewan", "CA", "SK", "11", "Q1989"),
	Yukon("Yukon", "CA", "YT", "12", "Q2009");

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
	private CanadaRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static CanadaRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (CanadaRegions region : values()) {
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
		
		for (CanadaRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
