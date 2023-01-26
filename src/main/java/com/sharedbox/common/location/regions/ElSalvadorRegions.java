package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum ElSalvadorRegions {
	NotFound(null, null, null, null, null),
	DepartamentoDeAhuachapan("Departamento de Ahuachapán", "SV", "AH", "01", "Q572993"),
	DepartamentoDeCabanas("Departamento de Cabañas", "SV", "CA", "02", "Q914058"),
	DepartamentoDeChalatenango("Departamento de Chalatenango", "SV", "CH", "03", "Q522221"),
	DepartamentoDeCuscatlan("Departamento de Cuscatlán", "SV", "CU", "04", "Q1130677"),
	DepartamentoDeLaLibertad("Departamento de La Libertad", "SV", "LI", "05", "Q930820"),
	DepartamentoDeLaPaz("Departamento de La Paz", "SV", "PA", "06", "Q1129788"),
	DepartamentoDeLaUnion("Departamento de La Unión", "SV", "UN", "07", "Q1130688"),
	DepartamentoDeMorazan("Departamento de Morazán", "SV", "MO", "08", "Q1122836"),
	DepartamentoDeSanMiguel("Departamento de San Miguel", "SV", "SM", "09", "Q930804"),
	DepartamentoDeSanSalvador("Departamento de San Salvador", "SV", "SS", "10", "Q1543219"),
	DepartamentoDeSanVicente("Departamento de San Vicente", "SV", "SV", "12", "Q1130180"),
	DepartamentoDeSantaAna("Departamento de Santa Ana", "SV", "SA", "11", "Q671158"),
	DepartamentoDeSonsonate("Departamento de Sonsonate", "SV", "SO", "13", "Q212540"),
	DepartamentoDeUsulutan("Departamento de Usulután", "SV", "US", "14", "Q1122748");

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
	private ElSalvadorRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static ElSalvadorRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (ElSalvadorRegions region : values()) {
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
		
		for (ElSalvadorRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
