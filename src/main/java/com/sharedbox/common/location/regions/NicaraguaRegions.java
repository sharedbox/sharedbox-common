package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum NicaraguaRegions {
	NotFound(null, null, null, null, null),
	DepartamentoDeBoaco("Departamento de Boaco", "NI", "BO", "01", "Q280973"),
	DepartamentoDeCarazo("Departamento de Carazo", "NI", "CA", "02", "Q461133"),
	DepartamentoDeChinandega("Departamento de Chinandega", "NI", "CI", "03", "Q644024"),
	DepartamentoDeChontales("Departamento de Chontales", "NI", "CO", "04", "Q498443"),
	DepartamentoDeEsteli("Departamento de Estelí", "NI", "ES", "05", "Q728015"),
	DepartamentoDeGranada("Departamento de Granada", "NI", "GR", "06", "Q258405"),
	DepartamentoDeJinotega("Departamento de Jinotega", "NI", "JI", "07", "Q728120"),
	DepartamentoDeLeon("Departamento de León", "NI", "LE", "08", "Q586818"),
	DepartamentoDeMadriz("Departamento de Madríz", "NI", "MD", "09", "Q728056"),
	DepartamentoDeManagua("Departamento de Managua", "NI", "MN", "10", "Q260009"),
	DepartamentoDeMasaya("Departamento de Masaya", "NI", "MS", "11", "Q570358"),
	DepartamentoDeMatagalpa("Departamento de Matagalpa", "NI", "MT", "12", "Q728099"),
	RegionAutonomaDeLaCostaCaribeNorte("Región Autónoma de la Costa Caribe Norte", "NI", "AN", "17", "Q498452"),
	DepartamentoDeRivas("Departamento de Rivas", "NI", "RI", "15", "Q728127"),
	DepartamentoDeRioSanJuan("Departamento de Río San Juan", "NI", "SJ", "14", "Q728155"),
	RegionAutonomaDeLaCostaCaribeSur("Región Autónoma de la Costa Caribe Sur", "NI", "AS", "18", "Q291279");

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
	private NicaraguaRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static NicaraguaRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (NicaraguaRegions region : values()) {
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
		
		for (NicaraguaRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
