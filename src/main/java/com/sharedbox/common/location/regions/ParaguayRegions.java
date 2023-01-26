package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum ParaguayRegions {
	NotFound(null, null, null, null, null),
	DepartamentoDelAltoParaguay("Departamento del Alto Paraguay", "PY", "16", "23", "Q682642"),
	DepartamentoDeAltoParana("Departamento de Alto Paraná", "PY", "10", "01", "Q682654"),
	DepartamentoDeAmambay("Departamento de Amambay", "PY", "13", "02", "Q686586"),
	DepartamentoDeBoqueron("Departamento de Boqueron", "PY", "19", "24", "Q741017"),
	Caaguazu("Caaguazú", "PY", "5", "04", "Q880399"),
	Caazapa("Caazapa", "PY", "6", "05", "Q881839"),
	Canindeyu("Canindeyu", "PY", "14", "19", "Q279085"),
	DistritoCapital("Distrito Capital", "PY", "ASU", "22", "Q2723419"),
	DepartamentoCentro("Departamento Centro", "PY", "11", "06", "Q372461"),
	DepartamentoDeConcepcion("Departamento de Concepción", "PY", "1", "07", "Q741009"),
	DepartamentoCordillera("Departamento Cordillera", "PY", "3", "08", "Q755121"),
	DepartamentoDeGuaira("Departamento de Guaira", "PY", "4", "10", "Q755116"),
	Itapua("Itapúa", "PY", "7", "11", "Q222564"),
	DepartamentoDeMisiones("Departamento de Misiones", "PY", "8", "12", "Q591194"),
	DepartamentoDeParaguari("Departamento de Paraguarí", "PY", "9", "15", "Q240014"),
	DepartamentoPresidenteHayes("Departamento Presidente Hayes", "PY", "15", "16", "Q750551"),
	DepartamentoDeSanPedro("Departamento de San Pedro", "PY", "2", "17", "Q526176"),
	DepartamentoDeNeembucu("Departamento de Ñeembucú", "PY", "12", "13", "Q755115");

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
	private ParaguayRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static ParaguayRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (ParaguayRegions region : values()) {
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
		
		for (ParaguayRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
