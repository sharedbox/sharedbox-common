package br.com.sharedbox.common.location;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 08/05/2021 - version 1.0.0
 */
public enum Countries {
	NotFound("", "", "", ""),
	Brazil("BR", "Brazil", "BRA", "076"),
	USA("US", "United States of America", "USA", "840");

	/**
	 * 
	 */
	private String countryName;
	
	/**
	 * 
	 */
	private String iso3Code;
	
	/**
	 * 
	 */
	private String isoNumCode;
	
	/**
	 * Constructor
	 * 
	 * @param iso2Code
	 */
	private Countries(String iso2Code, String countryName, String iso3Code, String isoNumCode) {
		this.iso2Code = iso2Code;
		this.countryName = countryName;
		this.iso3Code = iso3Code;
		this.isoNumCode = isoNumCode;
	}
	
	/**
	 * 
	 */
	private String iso2Code;
	
	/**
	 * @return the iso2Code
	 */
	public String getIso2Code() {
		return iso2Code;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @return the iso3Code
	 */
	public String getIso3Code() {
		return iso3Code;
	}

	/**
	 * @return the isoNumCode
	 */
	public String getIsoNumCode() {
		return isoNumCode;
	}
	
	/**
	 * Get value by ISO code 
	 * @param code
	 * @return
	 */
	public static Countries getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		code = code.toUpperCase();

		for (Countries country : values()) {
			if  (country.getIso2Code().equals(code)
					|| country.getIso3Code().equals(code)
					|| country.getIsoNumCode().equals(code)) {
				return country;
			}
		}
		
		return NotFound;
	}
}
