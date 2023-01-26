package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum ColombiaRegions {
	NotFound(null, null, null, null, null),
	DepartamentoDeAmazonas("Departamento de Amazonas", "CO", "AMA", "01", "Q44724"),
	DepartamentoDeAntioquia("Departamento de Antioquia", "CO", "ANT", "02", "Q123304"),
	DepartamentoDeArauca("Departamento de Arauca", "CO", "ARA", "03", "Q230223"),
	SanAndresProvidenciaYSantaCatalina("Archipiélago de San Andrés, Providencia y Santa Catalina", "CO", "SAP", "25", "Q26855"),
	DepartamentoDelAtlantico("Departamento del Atlántico", "CO", "ATL", "04", "Q230882"),
	DepartamentoDeBolivar("Departamento de Bolívar", "CO", "BOL", "35", "Q230597"),
	DepartamentoDeBoyaca("Departamento de Boyacá", "CO", "BOY", "36", "Q121233"),
	DepartamentoDeCaldas("Departamento de Caldas", "CO", "CAL", "37", "Q230607"),
	DepartamentoDeCaqueta("Departamento de Caquetá", "CO", "CAQ", "08", "Q13985"),
	DepartamentoDeCasanare("Departamento de Casanare", "CO", "CAS", "32", "Q13984"),
	DepartamentoDelCauca("Departamento del Cauca", "CO", "CAU", "09", "Q230602"),
	DepartamentoDeCesar("Departamento de César", "CO", "CES", "10", "Q234916"),
	DepartamentoDeChoco("Departamento de Chocó", "CO", "CHO", "11", "Q230584"),
	DepartamentoDeCundinamarca("Departamento de Cundinamarca", "CO", "CUN", "33", "Q232564"),
	DepartamentoDeCordoba("Departamento de Córdoba", "CO", "COR", "12", "Q234912"),
	DepartamentoDeGuainia("Departamento de Guainía", "CO", "GUA", "15", "Q238645"),
	DepartamentoDeGuaviare("Departamento de Guaviare", "CO", "GUV", "14", "Q272885"),
	DepartamentoDelHuila("Departamento del Huila", "CO", "HUI", "16", "Q234920"),
	DepartamentoDeLaGuajira("Departamento de La Guajira", "CO", "LAG", "17", "Q272747"),
	DepartamentoDeMagdalena("Departamento de Magdalena", "CO", "MAG", "38", "Q199910"),
	Meta("Meta", "CO", "MET", "19", "Q238629"),
	DepartamentoDeNarino("Departamento de Nariño", "CO", "NAR", "20", "Q230217"),
	DepartamentoNorteDeSantander("Departamento Norte de Santander", "CO", "NSA", "21", "Q233058"),
	DepartamentoDePutumayo("Departamento de Putumayo", "CO", "PUT", "22", "Q232953"),
	DepartamentoDelQuindio("Departamento del Quindío", "CO", "QUI", "23", "Q13995"),
	DepartamentoDeRisaralda("Departamento de Risaralda", "CO", "RIS", "24", "Q13993"),
	DepartamentoDeSantander("Departamento de Santander", "CO", "SAN", "26", "Q235166"),
	DepartamentoDeSucre("Departamento de Sucre", "CO", "SUC", "27", "Q235188"),
	DepartamentoDelTolima("Departamento del Tolima", "CO", "TOL", "28", "Q234501"),
	DepartamentoDelValleDelCauca("Departamento del Valle del cauca", "CO", "VAC", "29", "Q13990"),
	DepartamentoDeVaupes("Departamento de Vaupés", "CO", "VAU", "30", "Q234505"),
	DepartamentoDeVichada("Departamento de Vichada", "CO", "VID", "31", "Q268729");

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
	private ColombiaRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static ColombiaRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (ColombiaRegions region : values()) {
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
		
		for (ColombiaRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
