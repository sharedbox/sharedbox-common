package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum MexicoRegions {
	NotFound(null, null, null, null, null),
	Aguascalientes("Aguascalientes", "MX", "AGU", "01", "Q79952"),
	BajaCalifornia("Baja California", "MX", "BCN", "02", "Q58731"),
	BajaCaliforniaSur("Baja California Sur", "MX", "BCS", "03", "Q46508"),
	Campeche("Campeche", "MX", "CAM", "04", "Q80908"),
	Chiapas("Chiapas", "MX", "CHP", "05", "Q60123"),
	Chihuahua("Chihuahua", "MX", "CHH", "06", "Q655"),
	Coahuila("Coahuila", "MX", "COA", "07", "Q53079"),
	Colima("Colima", "MX", "COL", "08", "Q61309"),
	Durango("Durango", "MX", "DUR", "10", "Q79918"),
	Guanajuato("Guanajuato", "MX", "GUA", "11", "Q46475"),
	Guerrero("Guerrero", "MX", "GRO", "12", "Q60158"),
	Hidalgo("Hidalgo", "MX", "HID", "13", "Q80903"),
	Jalisco("jalisco", "MX", "JAL", "14", "Q13160"),
	CiudadDeMexico("Ciudad de México", "MX", "CMX", "09", "Q1489"),
	Michoacan("Michoacán", "MX", "MIC", "16", "Q79861"),
	Morelos("Morelos", "MX", "MOR", "17", "Q66117"),
	Mexico("México", "MX", "MEX", "15", "Q82112"),
	Nayarit("Nayarit", "MX", "NAY", "18", "Q79920"),
	NuevoLeon("Nuevo León", "MX", "NLE", "19", "Q15282"),
	Oaxaca("Oaxaca", "MX", "OAX", "20", "Q34110"),
	Puebla("puebla", "MX", "PUE", "21", "Q79923"),
	Queretaro("Querétaro", "MX", "QUE", "22", "Q79754"),
	QuintanaRoo("quintana roo", "MX", "ROO", "23", "Q80245"),
	SanLuisPotos("iSan Luis Potosí", "MX", "SLP", "24", "Q78980"),
	Sinaloa("Sinaloa", "MX", "SIN", "25", "Q80252"),
	Sonora("Sonora", "MX", "SON", "26", "Q46422"),
	Tabasco("Tabasco", "MX", "TAB", "27", "Q80914"),
	Tamaulipas("Tamaulipas", "MX", "TAM", "28", "Q80007"),
	Tlaxcala("Tlaxcala", "MX", "TLA", "29", "Q82681"),
	Veracruz("Veracruz", "MX", "VER", "30", "Q60130"),
	Yucatan("Yucatán", "MX", "YUC", "31", "Q60176"),
	Zacatecas("Zacatecas", "MX", "ZAC", "32", "Q80269");

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
	private MexicoRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static MexicoRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (MexicoRegions region : values()) {
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
		
		for (MexicoRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
