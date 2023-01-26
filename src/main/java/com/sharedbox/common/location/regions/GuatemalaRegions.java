package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum GuatemalaRegions {
	NotFound(null, null, null, null, null),
	DepartamentoDeAltaVerapaz("Departamento de Alta Verapaz", "GT", "AV", "01", "Q504637"),
	DepartamentoDeBajaVerapaz("Departamento de Baja Verapaz", "GT", "BV", "02", "Q504647"),
	DepartamentoDeChimaltenango("Departamento de Chimaltenango", "GT", "CM", "03", "Q765975"),
	DepartamentoDeChiquimula("Departamento de Chiquimula", "GT", "CQ", "04", "Q753037"),
	DepartamentoDeElProgreso("Departamento de El Progreso", "GT", "PR", "05", "Q795591"),
	DepartamentoDeEscuintla("Departamento de Escuintla", "GT", "ES", "06", "Q795587"),
	DepartamentoDeGuatemala("Departamento de Guatemala", "GT", "GU", "07", "Q695660"),
	DepartamentoDeHuehuetenango("Departamento de Huehuetenango", "GT", "HU", "08", "Q842266"),
	DepartamentoDeIzabal("Departamento de Izabal", "GT", "IZ", "09", "Q693658"),
	DepartamentoDeJalapa("Departamento de Jalapa", "GT", "JA", "10", "Q795441"),
	DepartamentoDeJutiapa("Departamento de Jutiapa", "GT", "JU", "11", "Q765984"),
	DepartamentoDePeten("Departamento de Petén", "GT", "PE", "12", "Q466061"),
	DepartamentoDeQuetzaltenango("Departamento de Quetzaltenango", "GT", "QZ", "13", "Q844502"),
	DepartamentoDeQuiche("Departamento de Quiché", "GT", "QC", "14", "Q669802"),
	DepartamentoDeRetalhuleu("Departamento de Retalhuleu", "GT", "RE", "15", "Q888307"),
	DepartamentoDeSacatepequez("Departamento de Sacatepéquez", "GT", "SA", "16", "Q508804"),
	DepartamentoDeSanMarcos("Departamento de San Marcos", "GT", "SM", "17", "Q883907"),
	DepartamentoDeSantaRosa("Departamento de Santa Rosa", "GT", "SR", "18", "Q885656"),
	DepartamentoDeSolola("Departamento de Sololá", "GT", "SO", "19", "Q178136"),
	DepartamentoDeSuchitepequez("Departamento de Suchitepéquez", "GT", "SU", "20", "Q883734"),
	DepartamentoDeTotonicapan("Departamento de Totonicapán", "GT", "TO", "21", "Q885644"),
	DepartamentoDeZacapa("Departamento de Zacapa", "GT", "ZA", "22", "Q780784");

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
	private GuatemalaRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static GuatemalaRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (GuatemalaRegions region : values()) {
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
		
		for (GuatemalaRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
