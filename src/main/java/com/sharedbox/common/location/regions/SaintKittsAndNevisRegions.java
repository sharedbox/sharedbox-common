package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum SaintKittsAndNevisRegions {
	NotFound(null, null, null, null, null),
	ChristChurchNicholaTownParish("Christ Church Nichola Town Parish", "KN", "01", "01", "Q176164"),
	Nevis("Nevis", "KN", "N", null, "Q207794"),
	SaintAnneSandyPointParish("Saint Anne Sandy Point Parish", "KN", "02", "02", "Q1473654"),
	SaintGeorgeBasseterreParish("Saint George Basseterre Parish", "KN", "03", "03", "Q1540744"),
	SaintGeorgeGingerlandParish("Saint George Gingerland Parish", "KN", "04", "04", "Q1472520"),
	SaintJamesWindwardParish("Saint James Windward Parish", "KN", "05", "05", "Q1342139"),
	SaintJohnCapisterreParish("Saint John Capisterre Parish", "KN", "06", "06", "Q668498"),
	SaintJohnFigtreeParish("Saint John Figtree Parish", "KN", "07", "07", "Q657318"),
	SaintKitts("Saint Kitts", "KN", "K", null, "Q204989"),
	SaintMaryCayonParish("Saint Mary Cayon Parish", "KN", "08", "08", "Q1538034"),
	SaintPaulCapisterreParish("Saint Paul Capisterre Parish", "KN", "09", "09", "Q952735"),
	SaintPaulCharlestownParish("Saint Paul Charlestown Parish", "KN", "10", "10", "Q1752127"),
	SaintPeterBasseterreParish("Saint Peter Basseterre Parish", "KN", "11", "11", "Q1725609"),
	SaintThomasLowlandParish("Saint Thomas Lowland Parish", "KN", "12", "12", "Q1752122"),
	SaintThomasMiddleIslandParish("Saint Thomas Middle Island Parish", "KN", "13", "13", "Q1752101"),
	TrinityPalmettoPointParish("Trinity Palmetto Point Parish", "KN", "15", "15", "Q376738");

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
	private SaintKittsAndNevisRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static SaintKittsAndNevisRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}

		for (SaintKittsAndNevisRegions region : values()) {
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
	 * 
	 * @return
	 */
	public String toJson() {
		return "{ \"name\": \"" + this.getName() + "\"" + ", \"code\": \"" + this.getCode() + "\"" + ", \"country\": \""
				+ this.getCountry() + "\"" + ", \"fipsCode\": \"" + this.getFipsCode() + "\"" + ", \"wikiDataId\": \""
				+ this.getWikiDataId() + " }";
	}

	/**
	 * List all currencies on json
	 * 
	 * @return
	 */
	public static String toJsonList() {
		String response = StringUtils.EMPTY;

		for (SaintKittsAndNevisRegions region : values()) {
			if (region != NotFound) {
				response = response + (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson()
						+ System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
