package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum EcuadorRegions {
	NotFound(null, null, null, null, null),
	Azuay("Azuay", "EC", "A", "02", "Q220451"),
	Bolivar("Bolívar", "EC", "B", "03", "Q261165"),
	Carchi("Carchi", "EC", "C", "05", "Q321729"),
	Canar("Cañar", "EC", "F", "04", "Q335471"),
	Chimborazo("Chimborazo", "EC", "H", "06", "Q238492"),
	Cotopaxi("Cotopaxi", "EC", "X", "07", "Q241140"),
	ElOro("El Oro", "EC", "O", "08", "Q466019"),
	Esmeraldas("Esmeraldas", "EC", "E", "09", "Q335526"),
	Galapagos("Galápagos", "EC", "W", "01", "Q475038"),
	Guayas("Guayas", "EC", "G", "10", "Q335464"),
	Imbabura("Imbabura", "EC", "I", "11", "Q321863"),
	Loja("Loja", "EC", "L", "12", "Q504238"),
	LosRios("Los Ríos", "EC", "R", "13", "Q504260"),
	Manabi("Manabí", "EC", "M", "14", "Q504666"),
	MoronaSantiago("Morona-Santiago", "EC", "S", "15", "Q549522"),
	Napo("Napo", "EC", "N", "23", "Q211900"),
	Orellana("Orellana", "EC", "D", "24", "Q499475"),
	Pichincha("Pichincha", "EC", "P", "18", "Q272586"),
	Pastaza("Pastaza", "EC", "Y", "17", "Q214814"),
	SantaElena("SantaElena", "EC", "SE", "25", "Q1124125"),
	SantoDomingoDeLosTsachilas("Santo Domingo de los Tsáchilas", "EC", "SD", "26", "Q1123208"),
	Sucumbios("Sucumbíos", "EC", "U", "22", "Q499456"),
	Tungurahua("Tungurahua", "EC", "T", "19", "Q504252"),
	ZamoraChinchipe("Zamora-Chinchipe", "EC", "Z", "20", "Q744670");

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
	private EcuadorRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static EcuadorRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (EcuadorRegions region : values()) {
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
		
		for (EcuadorRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
