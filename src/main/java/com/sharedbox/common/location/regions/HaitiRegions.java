package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum HaitiRegions {
	NotFound(null, null, null, null, null),
	Latibonit("Latibonit", "HT", "AR", "06", "Q844024"),
	Sant("Sant", "HT", "CE", "07", "Q844528"),
	GrandAnse("Grand'Anse", "HT", "GA", "14", "Q913231"),
	Penset("Pensèt", "HT", "NI", "15", "Q125232"),
	No("Nò", "HT", "ND", "09", "Q943932"),
	NoEst("Nò-Est", "HT", "NE", "10", "Q928694"),
	NoLwes("Nò-Lwès", "HT", "NO", "03", "Q608361"),
	Lwes("Lwès", "HT", "OU", "11", "Q1434621"),
	Sid("Sid", "HT", "SD", "12", "Q936704"),
	Sides("Sidès", "HT", "SE", "13", "Q936717");

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
	private HaitiRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static HaitiRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (HaitiRegions region : values()) {
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
		
		for (HaitiRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
