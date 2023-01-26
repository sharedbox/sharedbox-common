package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum VenezuelaRegions {
	NotFound(null, null, null, null, null),
	Amazonas("Amazonas", "VE", "Z", "01", "Q170453"),
	Anzoategui("Anzoátegui", "VE", "B", "02", "Q190922"),
	UnPuro("Un puro", "VE", "C", "03", "Q41146"),
	Aragua("Aragua", "VE", "D", "04", "Q190687"),
	Barinas("barinas", "VE", "E", "05", "Q43271"),
	Bolivar("Bolívar", "VE", "F", "06", "Q191164"),
	DistritoCapital("Distrito Capital", "VE", "A", "25", "Q492791"),
	Carabobo("Carabobo", "VE", "G", "07", "Q191186"),
	Cojedes("Cojedes", "VE", "H", "08", "Q205460"),
	DeltaAmacuro("Delta Amacuro", "VE", "Y", "09", "Q201137"),
	Halcon("Halcón", "VE", "I", "11", "Q202071"),
	Guarico("Guarico", "VE", "J", "12", "Q202075"),
	Lara("Lara", "VE", "K", "13", "Q205796"),
	Miranda("Miranda", "VE", "M", "15", "Q191174"),
	Monagas("Monagas", "VE", "N", "16", "Q205776"),
	Merida("Mérida", "VE", "L", "14", "Q165582"),
	NuevaEsparta("Nueva Esparta", "VE", "O", "17", "Q204876"),
	Portuguesa("portuguesa", "VE", "P", "18", "Q205784"),
	Sucre("Sucre", "VE", "R", "19", "Q205824"),
	Trujillo("Trujillo", "VE", "T", "21", "Q202068"),
	Tachira("Táchira", "VE", "S", "20", "Q41144"),
	Vargas("Vargas", "VE", "X", "26", "Q205843"),
	Yaracuy("Yaracuy", "VE", "U", "22", "Q201121"),
	Zulia("Zulia", "VE", "V", "23", "Q43269");

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
	private VenezuelaRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static VenezuelaRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (VenezuelaRegions region : values()) {
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
		
		for (VenezuelaRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
