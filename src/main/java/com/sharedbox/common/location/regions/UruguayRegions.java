package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum UruguayRegions {
	NotFound(null, null, null, null, null),
	DepartamentoDeArtigas("Departamento de Artigas", "UY", "AR", "01", "Q16603"),
	DepartamentoDeCanelones("Departamento de Canelones", "UY", "CA", "02", "Q16577"),
	DepartamentoDeCerroLargo("Departamento de Cerro Largo", "UY", "CL", "03", "Q16575"),
	DepartamentoDeColonia("Departamento de Colonia", "UY", "CO", "04", "Q16580"),
	DepartamentoDeDurazno("Departamento de Durazno", "UY", "DU", "05", "Q16591"),
	DepartamentoDeFlores("Departamento de Flores", "UY", "FS", "06", "Q16578"),
	DepartamentoDeFlorida("Departamento de Florida", "UY", "FD", "07", "Q16593"),
	DepartamentoDeLavalleja("Departamento de Lavalleja", "UY", "LA", "08", "Q460435"),
	DepartamentoDeMaldonado("Departamento de Maldonado", "UY", "MA", "09", "Q331196"),
	DepartamentoDeMontevideo("Departamento de Montevideo", "UY", "MO", "10", "Q16594"),
	DepartamentoDePaysandu("Departamento de Paysandú", "UY", "PA", "11", "Q16576"),
	DepartamentoDeRivera("Departamento de Rivera", "UY", "RV", "13", "Q16609"),
	DepartamentoDeRocha("Departamento de Rocha", "UY", "RO", "14", "Q16582"),
	DepartamentoDeRioNegro("Departamento de Río Negro", "UY", "RN", "12", "Q16596"),
	DepartamentoDeSalto("Departamento de Salto", "UY", "SA", "15", "Q16595"),
	DepartamentoDeSanJose("Departamento de San José", "UY", "SJ", "16", "Q16579"),
	DepartamentoDeSoriano("Departamento de Soriano", "UY", "SO", "17", "Q16584"),
	DepartamentoDeTacuarembo("Departamento de Tacuarembó", "UY", "TA", "18", "Q16587"),
	DepartamentoDeTreintaYTres("Departamento de Treinta y Tres", "UY", "TT", "19", "Q16610");

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
	private UruguayRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static UruguayRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (UruguayRegions region : values()) {
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
		
		for (UruguayRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
