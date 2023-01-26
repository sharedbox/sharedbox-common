package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum JamaicaRegions {
	NotFound(null, null, null, null, null),
	ClarendonParish("Clarendon Parish", "JM", "13", "01", "Q1095557"),
	HanoverParish("Hanover Parish", "JM", "09", "02", "Q1131779"),
	KingstonParish("Kingston Parish", "JM", "01", "17", "Q1473680"),
	ManchesterParish("Manchester Parish", "JM", "12", "04", "Q920496"),
	PortlandParish("Portland Parish", "JM", "04", "07", "Q125148"),
	SaintAndrew("Saint Andrew", "JM", "02", "08", "Q2212935"),
	SaintAnnParish("Saint Ann Parish", "JM", "06", "09", "Q1326284"),
	SaintCatherineParish("Saint Catherine Parish", "JM", "14", "10", "Q1473663"),
	SaintElizabethParish("Saint Elizabeth Parish", "JM", "11", "11", "Q1473646"),
	SaintJamesParish("Saint James Parish", "JM", "08", "12", "Q1421939"),
	SaintMaryParish("Saint Mary Parish", "JM", "05", "13", "Q633565"),
	SaintThomasParish("Saint Thomas Parish", "JM", "03", "14", "Q1422332"),
	TrelawnyParish("Trelawny Parish", "JM", "07", "15", "Q1123340"),
	WestmorelandParish("Westmoreland Parish", "JM", "10", "16", "Q1440250");

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
	private JamaicaRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static JamaicaRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (JamaicaRegions region : values()) {
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
		
		for (JamaicaRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
