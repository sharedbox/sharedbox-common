package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/18/2022 - Version 1.0.0
 */
public enum PeruRegions {
	NotFound(null, null, null, null, null),
	Amazonas("Amazonas", "PE", "AMA", "01", "Q201162"),
	Apurimac("Apurímac", "PE", "APU", "03", "Q208185"),
	Arequipa("Arequipa", "PE", "ARE", "04", "Q205068"),
	Ayacucho("Ayacucho", "PE", "AYA", "05", "Q205112"),
	Cajamarca("Cajamarca", "PE", "CAJ", "06", "Q205078"),
	Callao("Callao", "PE", "CAL", "07", "Q2071352"),
	Cuzco("Cuzco", "PE", "CUS", "08", "Q205057"),
	Huancavelica("Huancavelica", "PE", "HUV", "09", "Q505220"),
	Huanuco("Huánuco", "PE", "HUC", "10", "Q215221"),
	Ica("Ica", "PE", "ICA", "11", "Q208186"),
	Junin("Junín", "PE", "JUN", "12", "Q207973"),
	LaLibertad("La Libertad", "PE", "LAL", "13", "Q205126"),
	Lambayeque("Lambayeque", "PE", "LAM", "14", "Q210061"),
	Lima("Lima", "PE", "LIM", "15", "Q211795"),
	Loreto("Loreto", "PE", "LOR", "16", "Q200938"),
	MadreDeDios("Madre de Dios", "PE", "MDD", "17", "Q210896"),
	Moquegua("Moquegua", "PE", "MOQ", "18", "Q208182"),
	Pasco("Pasco", "PE", "PAS", "19", "Q211208"),
	Piura("Piura", "PE", "PIU", "20", "Q208183"),
	Puno("Puno", "PE", "PUN", "21", "Q205104"),
	SanMartin("San Martín", "PE", "SAM", "22", "Q211793"),
	Tacna("Tacna", "PE", "TAC", "23", "Q207413"),
	Tumbes("Tumbes", "PE", "TUM", "24", "Q209597"),
	Ucayali("Ucayali", "PE", "UCA", "25", "Q207424"),
	Ancash("Áncash", "PE", "ANC", "02", "Q205089");

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
	private PeruRegions(String name, String country, String code, String fipsCode, String wikiDataId) {
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
	public static PeruRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (PeruRegions region : values()) {
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
		
		for (PeruRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
