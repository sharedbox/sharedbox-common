package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum UnitedStatesOfAmericaRegions {
	NotFound(null, null, null, null, null),
	Alabama("Alabama", "US", "AL", "01", "Q173"),
	Alaska("Alaska", "US", "AK", "02", "Q797"),
	AmericanSamoa("American Samoa", "US", "AS", "AQ", "Q16641"),
	Arizona("Arizona", "US", "AZ", "04", "Q816"),
	Arkansas("Arkansas", "US", "AR", "05", "Q1612"),
	California("California", "US", "CA", "06", "Q99"),
	Colorado("Colorado", "US", "CO", "08", "Q1261"),
	Connecticut("Connecticut", "US", "CT", "09", "Q779"),
	Delaware("Delaware", "US", "DE", "10", "Q1393"),
	DistrictOfColumbia("District of Columbia", "US", "DC", "11", "Q3551781"),
	Florida("Florida", "US", "FL", "12", "Q812"),
	Georgia("Georgia", "US", "GA", "13", "Q1428"),
	Guam("Guam", "US", "GU", "GQ", "Q16635"),
	Hawaii("Hawaii", "US", "HI", "15", "Q782"),
	Idaho("Idaho", "US", "ID", "16", "Q1221"),
	Illinois("Illinois", "US", "IL", "17", "Q1204"),
	Indiana("Indiana", "US", "IN", "18", "Q1415"),
	Iowa("Iowa", "US", "IA", "19", "Q1546"),
	Kansas("Kansas", "US", "KS", "20", "Q1558"),
	Kentucky("Kentucky", "US", "KY", "21", "Q1603"),
	Louisiana("Louisiana", "US", "LA", "22", "Q1588"),
	Maine("Maine", "US", "ME", "23", "Q724"),
	Maryland("Maryland", "US", "MD", "24", "Q1391"),
	Massachusetts("Massachusetts", "US", "MA", "25", "Q771"),
	Michigan("Michigan", "US", "MI", "26", "Q1166"),
	Minnesota("Minnesota", "US", "MN", "27", "Q1527"),
	Mississippi("Mississippi", "US", "MS", "28", "Q1494"),
	Missouri("Missouri", "US", "MO", "29", "Q1581"),
	Montana("Montana", "US", "MT", "30", "Q1212"),
	Nebraska("Nebraska", "US", "NE", "31", "Q1553"),
	Nevada("Nevada", "US", "NV", "32", "Q1227"),
	NewHampshire("New Hampshire", "US", "NH", "33", "Q759"),
	NewJersey("New Jersey", "US", "NJ", "34", "Q1408"),
	NewMexico("New Mexico", "US", "NM", "35", "Q1522"),
	NewYork("New York", "US", "NY", "36", "Q1384"),
	NorthCarolina("North Carolina", "US", "NC", "37", "Q1454"),
	NorthDakota("North Dakota", "US", "ND", "38", "Q1207"),
	NorthernMarianaIslands("Northern Mariana Islands", "US", "MP", "CQ", "Q16644"),
	Ohio("Ohio", "US", "OH", "39", "Q1397"),
	Oklahoma("Oklahoma", "US", "OK", "40", "Q1649"),
	Oregon("Oregon", "US", "OR", "41", "Q824"),
	Pennsylvania("Pennsylvania", "US", "PA", "42", "Q1400"),
	PuertoRico("Puerto Rico", "US", "PR", "RQ", "Q1183"),
	RhodeIsland("Rhode Island", "US", "RI", "44", "Q1387"),
	SouthCarolina("South Carolina", "US", "SC", "45", "Q1456"),
	SouthDakota("South Dakota", "US", "SD", "46", "Q1211"),
	Tennessee("Tennessee", "US", "TN", "47", "Q1509"),
	Texas("Texas", "US", "TX", "48", "Q1439"),
	UnitedStatesVirginIslands("United States Virgin Islands", "US", "VI", "VQ", "Q11703"),
	Utah("Utah", "US", "UT", "49", "Q829"),
	Vermont("Vermont", "US", "VT", "50", "Q16551"),
	Virginia("Virginia", "US", "VA", "51", "Q1370"),
	Washington("Washington", "US", "WA", "53", "Q1223"),
	WestVirginia("West Virginia", "US", "WV", "54", "Q1371"),
	Wisconsin("Wisconsin", "US", "WI", "55", "Q1537"),
	Wyoming("Wyoming", "US", "WY", "56", "Q1214"),
	UnitedStatesMinorOutlyingIslands("United States Minor Outlying Islands", "US", "UM", "UM", "Q16645");

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
	private UnitedStatesOfAmericaRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static UnitedStatesOfAmericaRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (UnitedStatesOfAmericaRegions region : values()) {
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
		
		for (UnitedStatesOfAmericaRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
