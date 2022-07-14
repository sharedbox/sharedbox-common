package br.com.sharedbox.common.location.br;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * Contain all Brazilian regions
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 05/31/2021
 */
public enum RegionsBr {
	NotFound(null, "", null, 0, null, null, 0),
	SaoPaulo("São Paulo", "BR", "SP", 35, "27", "Q175", 645),
	Acre("Acre", "BR", "AC", 12, "01", "Q40780", 22),
	Amazonas("Amazonas", "BR", "AM", 13, "04", "Q40040", 62),
	Roraima("Roraima", "BR", "RR", 14, "25", "Q42508", 15),
	Para("Pará", "BR", "PA", 15, "16", "Q39517", 144),
	Amapa("Amapá", "BR", "AP", 16, "03", "Q40130", 16),
	Tocantins("Tocantins", "BR", "TO", 17, "31", "Q43695", 139),
	Maranhao("Maranhão", "BR", "MA", 21, "13", "Q42362", 217),
	Piaui("Piauí", "BR", "PI", 22, "20", "Q42722", 224),
	Ceara("Ceará", "BR", "CE", 23, "06", "Q40123", 184),
	RioGrandeDoNorte("Rio Grande do Norte", "BR", "RN", 24, "22", "Q43255", 167),
	Paraiba("Paraíba", "BR", "PB", 25, "17", "Q38088", 223),
	Pernambuco("Pernambuco", "BR", "PE", 26, "30", "Q40942", 185),
	Alagoas("Alagoas", "BR", "AL", 27, "02", "Q40885", 102),
	Sergipe("Sergipe", "BR", "SE", 28, "28", "Q43783", 75),
	Bahia("Bahia", "BR", "BA", 29, "05", "Q40430", 417),
	MinasGerais("Minas Gerais", "BR", "MG", 31, "15", "Q39109", 853),
	EspiritoSanto("Espírito Santo", "BR", "ES", 32, "08", "Q43233", 78),
	RioDeJaneiro("Rio de Janeiro", "BR", "RJ", 33, "21", "Q41428", 92),
	Rondonia("Rondônia", "BR", "RO", 11, "24", "Q43235", 52),
	Parana("Paraná", "BR", "PR", 41, "18", "Q15499", 399),
	SantaCatarina("Santa Catarina", "BR", "SC", 42, "26", "Q41115", 295),
	RioGrandeDoSul("Rio Grande do Sul", "BR", "RS", 43, "23", "Q40030", 497),
	MatoGrossoDoSul("Mato Grosso do Sul", "BR", "MS", 50, "11", "Q43319", 79),
	MatoGrosso("Mato Grosso", "BR", "MT", 51, "14", "Q42824", 141),
	Goias("Goiás", "BR", "GO", 52, "29", "Q41587", 246),
	DistritoFederal("Distrito Federal", "BR", "DF", 53, "07", "Q119158", 1);

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
	 * 
	 */
	private int cityAmount;
	
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
	 * @param cityAmount
	 */
	private RegionsBr(String name, String country, String code, int ibgeId, String fipsCode, String wikiDataId, int cityAmount) {
		this.name = name;
		this.country = country;
		this.code = code;
		this.ibgeId = ibgeId;
		this.fipsCode = fipsCode;
		this.wikiDataId = wikiDataId;
		this.cityAmount = cityAmount;
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
	 * @return the cityAmount
	 */
	public int getCityAmount() {
		return cityAmount;
	}

	/**
	 * 
	 * @param code
	 * @return
	 */
	public static RegionsBr getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (RegionsBr region : values()) {
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
			+ ", \"wikiDataId\": \"" + this.getWikiDataId() + "\""
			+ ", \"cityAmount\": " + this.getCityAmount() + " }";
	}
	
	/**
	 * List all currencies on json
	 * @return
	 */
	public static String toJsonList() {
		String response = StringUtils.EMPTY;
		
		for (RegionsBr region : values()) {
			if (region != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + region.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
