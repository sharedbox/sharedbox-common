package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum HondurasRegions {
	NotFound(null, null, null, null, null),
	DepartamentoDeAtlantida("Departamento de Atlántida", "HN", "AT", "01", "Q622619"),
	DepartamentoDeIslasDeLaBahia("Departamento de Islas de la Bahía", "HN", "IB", "11", "Q751725"),
	DepartamentoDeCholuteca("Departamento de Choluteca", "HN", "CH", "02", "Q899272"),
	DepartamentoDeColon("Departamento de Colón", "HN", "CL", "03", "Q867117"),
	DepartamentoDeComayagua("Departamento de Comayagua", "HN", "CM", "04", "Q823443"),
	DepartamentoDeCopan("Departamento de Copán", "HN", "CP", "05", "Q843984"),
	DepartamentoDeCortes("Departamento de Cortés", "HN", "CR", "06", "Q767244"),
	DepartamentoDeElParaiso("Departamento de El Paraíso", "HN", "EP", "07", "Q867108"),
	DepartamentoDeFranciscoMorazan("Departamento de Francisco Morazán", "HN", "FM", "08", "Q867126"),
	DepartamentoDeGraciasADios("Departamento de Gracias a Dios", "HN", "GD", "09", "Q867112"),
	DepartamentoDeIntibuca("Departamento de Intibucá", "HN", "IN", "10", "Q262125"),
	DepartamentoDeLaPaz("Departamento de La Paz", "HN", "LP", "12", "Q866886"),
	DepartamentoDeLempira("Departamento de Lempira", "HN", "LE", "13", "Q744138"),
	DepartamentoDeOcotepeque("Departamento de Ocotepeque", "HN", "OC", "14", "Q867084"),
	DepartamentoDeOlancho("Departamento de Olancho", "HN", "OL", "15", "Q867089"),
	DepartamentoDeSantaBarbara("Departamento de Santa Bárbara", "HN", "SB", "16", "Q591139"),
	DepartamentoDelValle("Departamento del Valle", "HN", "VA", "17", "Q867097"),
	DepartamentoDeYoro("Departamento de Yoró", "HN", "YO", "18", "Q1123380");

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
	private HondurasRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static HondurasRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (HondurasRegions region : values()) {
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
		
		for (HondurasRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
