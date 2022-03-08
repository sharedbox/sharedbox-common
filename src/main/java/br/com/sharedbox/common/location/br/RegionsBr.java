package br.com.sharedbox.common.location.br;

import br.com.sharedbox.common.location.Countries;
import br.com.sharedbox.common.utils.StringUtils;

/**
 * Contain all Brazilian regions
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 05/31/2021
 */
public enum RegionsBr {
	NotFound(0, null, 0, null, 0, null, null, 0),
	SaoPaulo(1, "São Paulo", 1, "SP", 35, "27", "Q175", 645),
	Acre(2, "Acre", 1, "AC", 12, "01", "Q40780", 22),
	Amazonas(3, "Amazonas", 1, "AM", 13, "04", "Q40040", 62),
	Roraima(4, "Roraima", 1, "RR", 14, "25", "Q42508", 15),
	Para(5, "Pará", 1, "PA", 15, "16", "Q39517", 144),
	Amapa(6, "Amapá", 1, "AP", 16, "03", "Q40130", 16),
	Tocantins(7, "Tocantins", 1, "TO", 17, "31", "Q43695", 139),
	Maranhao(8, "Maranhão", 1, "MA", 21, "13", "Q42362", 217),
	Piaui(9, "Piauí", 1, "PI", 22, "20", "Q42722", 224),
	Ceara(10, "Ceará", 1, "CE", 23, "06", "Q40123", 184),
	RioGrandeDoNorte(11, "Rio Grande do Norte", 1, "RN", 24, "22", "Q43255", 167),
	Paraiba(12, "Paraíba", 1, "PB", 25, "17", "Q38088", 223),
	Pernambuco(13, "Pernambuco", 1, "PE", 26, "30", "Q40942", 185),
	Alagoas(14, "Alagoas", 1, "AL", 27, "02", "Q40885", 102),
	Sergipe(15, "Sergipe", 1, "SE", 28, "28", "Q43783", 75),
	Bahia(16, "Bahia", 1, "BA", 29, "05", "Q40430", 417),
	MinasGerais(17, "Minas Gerais", 1, "MG", 31, "15", "Q39109", 853),
	EspiritoSanto(18, "Espírito Santo", 1, "ES", 32, "08", "Q43233", 78),
	RioDeJaneiro(19, "Rio de Janeiro", 1, "RJ", 33, "21", "Q41428", 92),
	Rondonia(20, "Rondônia", 1, "RO", 11, "24", "Q43235", 52),
	Parana(21, "Paraná", 1, "PR", 41, "18", "Q15499", 399),
	SantaCatarina(22, "Santa Catarina", 1, "SC", 42, "26", "Q41115", 295),
	RioGrandeDoSul(23, "Rio Grande do Sul", 1, "RS", 43, "23", "Q40030", 497),
	MatoGrossoDoSul(24, "Mato Grosso do Sul", 1, "MS", 50, "11", "Q43319", 79),
	MatoGrosso(25, "Mato Grosso", 1, "MT", 51, "14", "Q42824", 141),
	Goias(26, "Goiás", 1, "GO", 52, "29", "Q41587", 246),
	DistritoFederal(27, "Distrito Federal", 1, "DF", 53, "07", "Q119158", 1);

	/**
	 * 
	 */
	private int id;

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	private int country;

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
	private RegionsBr(int id, String name, int country, String code, int ibgeId, String fipsCode, String wikiDataId, int cityAmount) {
		this.id  = id;
		this.name = name;
		this.country = country;
		this.code = code;
		this.ibgeId = ibgeId;
		this.fipsCode = fipsCode;
		this.wikiDataId = wikiDataId;
		this.cityAmount = cityAmount;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
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
	public int getCountry() {
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
	 * @param id
	 * @return
	 */
	public static RegionsBr getById(String id) {
		if (StringUtils.isEmpty(id)) {
			return NotFound;
		}
		
		if (!StringUtils.isNumeric(id)) {
			return NotFound;
		} else {
			long value = Long.parseLong(id);
			
			if (value > Byte.MAX_VALUE) {
				return NotFound;
			}
		}
		
		return getById(Byte.parseByte(id));
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static RegionsBr getById(int id) {
		for (RegionsBr region : values()) {
			if (region != NotFound) {
				if (region.getId() == id) {
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
		return "{ \"id\": " + this.getId()
			+ ", \"name\": \"" + this.getName() + "\""
			+ ", \"code\": \"" + this.getCode() + "\""
			+ ", \"country\": " + Countries.getById(this.getCountry()) .toJson()
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
