package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum CubaRegions {
	NotFound(null, null, null, null, null),
	Artemisa("Artemisa", "CU", "15", "AR", "Q115325"),
	Camaguey("Camagüey", "CU", "09", "05", "Q215147"),
	CiegoDeAvila("Ciego de Ávila", "CU", "08", "07", "Q220692"),
	Cienfuegos("Cienfuegos", "CU", "06", "08", "Q115444"),
	Granma("Granma", "CU", "12", "09", "Q115046"),
	Guantanamo("Guantánamo", "CU", "14", "10", "Q115319"),
	LaHabana("la Habana", "CU", "03", "02", "Q12588"),
	Holguin("Holguín", "CU", "11", "12", "Q115302"),
	IslaDeLaJuventud("isla de la juventud", "CU", "99", "04", "Q115027"),
	LasTunas("Las Tunas", "CU", "10", "13", "Q115334"),
	Matanzas("Matanzas", "CU", "04", "03", "Q115438"),
	Mayabeque("Mayabeque", "CU", "16", "MA", "Q115310"),
	PinarDelRio("Pinar del Rio", "CU", "01", "01", "Q115497"),
	SanctiSpiritus("Sancti Spíritus", "CU", "07", "14", "Q115441"),
	SantiagoDeCuba("Santiago de Cuba", "CU", "13", "15", "Q234200"),
	Villaclara("Villaclara", "CU", "05", "16", "Q115434");

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
	private CubaRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static CubaRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (CubaRegions region : values()) {
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
		
		for (CubaRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
