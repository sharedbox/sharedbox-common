package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum TrinidadAndTobagoRegions {
	NotFound(null, null, null, null, null),
	Chaguanas("Chaguanas", "TT", "CHA", "CHA", "Q1444575"),
	CouvaTabaquiteTalparo("Couva-Tabaquite-Talparo", "TT", "CTT", "CTT", "Q2679127"),
	DiegoMartinRegionalCorporation("Diego Martin Regional Corporation", "TT", "DMN", "DMN", "Q2679107"),
	MayaroRioClaro("Mayaro-Rio Claro", "TT", "MRC", "03", "Q2487249"),
	PenalDebeRegionalCorporation("Penal-Debe Regional Corporation", "TT", "PED", "PED", "Q2056273"),
	PointFortin("Point Fortin", "TT", "PTF", "PTF", "Q786957"),
	PortOfSpain("Port of Spain", "TT", "POS", "05", "Q39178"),
	PrincesTown("Princes Town", "TT", "PRT", "PRT", "Q2228167"),
	SanFernando("San Fernando", "TT", "SFO", "10", "Q1023712"),
	SanJuanLaventille("San Juan–Laventille", "TT", "SJL", "SJL", "Q979608"),
	SangreGrandeRegionalCorporation("Sangre Grande Regional Corporation", "TT", "SGE", "SGE", "Q290292"),
	SipariaRegionalCorporation("Siparia Regional Corporation", "TT", "SIP", "SIP", "Q2679119"),
	Tobago("Tobago", "TT", "TOB", "11", "Q185111"),
	TunapunaPiarcoRegionalCorporation("Tunapuna-Piarco Regional Corporation", "TT", "TUP", "TUP", "Q1899163");

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
	private TrinidadAndTobagoRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static TrinidadAndTobagoRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (TrinidadAndTobagoRegions region : values()) {
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
		
		for (TrinidadAndTobagoRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
