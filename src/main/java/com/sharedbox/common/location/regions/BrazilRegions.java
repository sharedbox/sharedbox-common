package com.sharedbox.common.location.regions;

import com.sharedbox.common.utils.StringUtils;

/**
 * Contain all Brazilian regions
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 05/31/2021
 */
public enum BrazilRegions {
	NotFound(null, "", null, 0, null, null),
	SaoPaulo("São Paulo", "BR", "SP", 35, "27", "Q175"),
	Acre("Acre", "BR", "AC", 12, "01", "Q40780"),
	Amazonas("Amazonas", "BR", "AM", 13, "04", "Q40040"),
	Roraima("Roraima", "BR", "RR", 14, "25", "Q42508"),
	Para("Pará", "BR", "PA", 15, "16", "Q39517"),
	Amapa("Amapá", "BR", "AP", 16, "03", "Q40130"),
	Tocantins("Tocantins", "BR", "TO", 17, "31", "Q43695"),
	Maranhao("Maranhão", "BR", "MA", 21, "13", "Q42362"),
	Piaui("Piauí", "BR", "PI", 22, "20", "Q42722"),
	Ceara("Ceará", "BR", "CE", 23, "06", "Q40123"),
	RioGrandeDoNorte("Rio Grande do Norte", "BR", "RN", 24, "22", "Q43255"),
	Paraiba("Paraíba", "BR", "PB", 25, "17", "Q38088"),
	Pernambuco("Pernambuco", "BR", "PE", 26, "30", "Q40942"),
	Alagoas("Alagoas", "BR", "AL", 27, "02", "Q40885"),
	Sergipe("Sergipe", "BR", "SE", 28, "28", "Q43783"),
	Bahia("Bahia", "BR", "BA", 29, "05", "Q40430"),
	MinasGerais("Minas Gerais", "BR", "MG", 31, "15", "Q39109"),
	EspiritoSanto("Espírito Santo", "BR", "ES", 32, "08", "Q43233"),
	RioDeJaneiro("Rio de Janeiro", "BR", "RJ", 33, "21", "Q41428"),
	Rondonia("Rondônia", "BR", "RO", 11, "24", "Q43235"),
	Parana("Paraná", "BR", "PR", 41, "18", "Q15499"),
	SantaCatarina("Santa Catarina", "BR", "SC", 42, "26", "Q41115"),
	RioGrandeDoSul("Rio Grande do Sul", "BR", "RS", 43, "23", "Q40030"),
	MatoGrossoDoSul("Mato Grosso do Sul", "BR", "MS", 50, "11", "Q43319"),
	MatoGrosso("Mato Grosso", "BR", "MT", 51, "14", "Q42824"),
	Goias("Goiás", "BR", "GO", 52, "29", "Q41587"),
	DistritoFederal("Distrito Federal", "BR", "DF", 53, "07", "Q119158");

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
	private int ibgeId;

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
	private BrazilRegions(String name, String country, String code, int ibgeId, String fipsCode, String wikiDataId) {
		this.name = name;
		this.country = country;
		this.code = code;
		this.ibgeId = ibgeId;
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
	 * @return the ibgeId
	 */
	public int getIbgeId() {
		return ibgeId;
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
	public static BrazilRegions getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (BrazilRegions region : values()) {
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
			+ ", \"ibgeId\": " + this.getIbgeId()
			+ ", \"fipsCode\": \"" + this.getFipsCode() + "\""
			+ ", \"wikiDataId\": \"" + this.getWikiDataId() + "\" }";
	}
	
	/**
	 * List all currencies on json
	 * @return
	 */
	public static String toJsonList() {
		String response = StringUtils.EMPTY;
		
		for (BrazilRegions region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
