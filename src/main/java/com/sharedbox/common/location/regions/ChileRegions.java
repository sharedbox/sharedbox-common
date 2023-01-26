package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum ChileRegions {
	NotFound(null, null, null, null, null),
	RegionDeAntofagasta("Región de Antofagasta", "CL", "AN", "03", "Q2118"),
	RegionDeLaAraucania("Región de la Araucanía", "CL", "AR", "04", "Q2176"),
	RegionDeAricaYParinacota("Región de Arica y Parinacota", "CL", "AP", "16", "Q2109"),
	RegionDeAtacama("Región de Atacama", "CL", "AT", "05", "Q2120"),
	RegionDeAysen("Región de Aysén", "CL", "AI", "02", "Q2181"),
	RegionDelBiobio("Región del Biobío", "CL", "BI", "06", "Q2170"),
	RegionDeCoquimbo("Región de Coquimbo", "CL", "CO", "07", "Q2121"),
	RegionDeLosLagos("Región de Los Lagos", "CL", "LL", "14", "Q2178"),
	RegionDeLosRios("Región de Los Ríos", "CL", "LR", "17", "Q2177"),
	MagallanesYLaRegionAntarticaChilena("Magallanes y la Región Antártica Chilena", "CL", "MA", "10", "Q2189"),
	RegionDelMaule("Región del Maule", "CL", "ML", "11", "Q2166"),
	OHiggins("O\'Higgins", "CL", "LI", "08", "Q2133"),
	RegionMetropolitanaDeSantiago("Región Metropolitana de Santiago", "CL", "RM", "12", "Q2131"),
	RegionDeTarapaca("Región de Tarapacá", "CL", "TA", "15", "Q2114"),
	Valparaiso("Valparaíso", "CL", "VS", "01", "Q219458"),
	RegionDeNuble("Región de Ñuble", "CL", "NB", "18", "Q24076693");

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
	private ChileRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static ChileRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (ChileRegions region : values()) {
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
		
		for (ChileRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
