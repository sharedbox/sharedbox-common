package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum DominicanRepublicRegions {
	NotFound(null, null, null, null, null),
	Azua("Azua", "DO", "02", "01", "Q794239"),
	Baoruco("Baoruco", "DO", "03", "02", "Q807079"),
	Barahona("Barahona", "DO", "04", "03", "Q1137551"),
	Dajabon("Dajabón", "DO", "05", "04", "Q1138575"),
	DistritoNacional("Distrito Nacional", "DO", "01", "34", "Q2499228"),
	Duarte("Duarte", "DO", "06", "06", "Q1262745"),
	ElSeibo("El Seibo", "DO", "08", "28", "Q1774831"),
	EliasPina("Elías Piña", "DO", "07", "11", "Q1137545"),
	Espaillat("Espaillat", "DO", "09", "08", "Q530231"),
	HatoMayor("hato mayor", "DO", "30", "29", "Q937217"),
	HermanasMirabal("Hermanas Mirabal", "DO", "19", "19", "Q549386"),
	Independencia("Independencia", "DO", "10", "09", "Q1424401"),
	LaAltagracia("La Altagracia", "DO", "11", "10", "Q1323353"),
	LaRomana("La Romana", "DO", "12", "12", "Q1140742"),
	LaVega("La Vega", "DO", "13", "30", "Q594405"),
	MariaTrinidadSanchez("María Trinidad Sánchez", "DO", "14", "14", "Q1949656"),
	MonsenorNouel("Monseñor Nouel", "DO", "28", "31", "Q1295496"),
	Montecristi("montecristi", "DO", "15", "15", "Q592624"),
	MontePlata("Monte Plata", "DO", "29", "32", "Q1772745"),
	Pedernales("Pedernales", "DO", "16", "16", "Q1352533"),
	Peravia("Peravía", "DO", "17", "35", "Q1331932"),
	PuertoPlata("Puerto Plata", "DO", "18", "18", "Q693487"),
	Samana("Samaná", "DO", "20", "20", "Q1145487"),
	SanCristobal("San Cristóbal", "DO", "21", "33", "Q1366107"),
	SanJoseDeOcoa("San Jose de Ocoa", "DO", "31", "36", "Q1424391"),
	SanJuan("San Juan", "DO", "22", "23", "Q2001793"),
	SanPedroDeMacoris("San Pedro de Macorís", "DO", "23", "24", "Q1366119"),
	Santiago("santiago", "DO", "25", "25", "Q1772983"),
	SantiagoRodriguez("Santiago Rodriguez", "DO", "26", "26", "Q2021942"),
	SantoDomingo("Santo Domingo", "DO", "32", "37", "Q1352536"),
	SanchezRamirez("Sánchez Ramírez", "DO", "24", "21", "Q1836903"),
	Valverde("Valverde", "DO", "27", "27", "Q1774848");

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
	private DominicanRepublicRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static DominicanRepublicRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (DominicanRepublicRegions region : values()) {
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
		
		for (DominicanRepublicRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
