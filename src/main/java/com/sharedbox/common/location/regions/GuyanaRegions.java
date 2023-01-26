package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum GuyanaRegions {
	NotFound(null, null, null, null, null),
	BarimaWaini("Barima-Waini", "GY", "BA", "10", "Q537740"),
	CuyuniMazaruni("Cuyuni-Mazaruni", "GY", "CU", "11", "Q1146777"),
	DemeraraMahaica("Demerara-Mahaica", "GY", "DE", "12", "Q1185362"),
	EastBerbiceCorentyne("East Berbice-Corentyne", "GY", "EB", "13", "Q1277758"),
	EssequiboIslandsWestDemerara("Essequibo Islands-West Demerara", "GY", "ES", "14", "Q1368802"),
	MahaicaBerbice("Mahaica-Berbice", "GY", "MA", "15", "Q1466671"),
	PomeroonSupenaam("Pomeroon-Supenaam", "GY", "PM", "16", "Q680382"),
	PotaroSiparuni("Potaro-Siparuni", "GY", "PT", "17", "Q1454035"),
	UpperDemeraraBerbice("Upper Demerara-Berbice", "GY", "UD", "18", "Q1309042"),
	UpperTakutuUpperEssequibo("Upper Takutu-Upper Essequibo", "GY", "UT", "19", "Q1516381");

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
	private GuyanaRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static GuyanaRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (GuyanaRegions region : values()) {
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
		
		for (GuyanaRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
