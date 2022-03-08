package br.com.sharedbox.common.location;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 08/05/2021 - version 1.0.0
 */
public enum Countries {
	NotFound(null, null, null, null, null, null, null, null, null, null, false, false, 0, null, 0, (byte)0, null, null),
	Brazil(1, "Brasil", "Brazil", "Brasil", "+55", "105", "1058", "BR", "BRA", "076", true, false, 76, "Q155", 27, (byte)1, new Integer[] { 986 }, new Integer[] { 1 }),
	Argentina(2, "Argentina", "Argentina", "Argentina", "+54", "063", "0639", "AR", "ARG", "032", true, false, 32, "Q414", 23, (byte)1, new Integer[] { 32 }, new Integer[] { 148 }),
	Canada(3, "Canadá",  "Canada", "Canadá", "+1", "149", "1490", "CA", "CAN", "124", false, false, 124, "Q16", 13, (byte)1, new Integer[] { 124 }, new Integer[] { 42, 49 }),
	Chile(4, "Chile", "Chile", "Chile", "+56", "158", "1589", "CL", "CHL", "152", true, false, 152, "Q298", 16, (byte)1, new Integer[] { 152 }, new Integer[] { 148 }),
	UnitedStatesOfAmerica(5, "Estados Unidos da América", "United States of America", "Estados Unidos de América", "+1", "249", "2496", "US", "USA", "840", false, false, 840, "Q30", 57, (byte)1, new Integer[] { 840 }, new Integer[] { 42 }),
	Poland(6, "Polônia", "Poland", "Polonia", "+48", "603", "6033", "PL", "POL", "616", false, false, 616, "Q36", 16, (byte)3, new Integer[] { 985 }, new Integer[] { 126 }),
	Portugal(7, "Portugal", "Portugal", "Portugal", "+351", "607", "6076", "PT", "PRT", "620", false, true, 620, "Q45", 20, (byte)3, new Integer[] { 978 }, new Integer[] { 1 }),
	Paraguay(8, "Paraguai", "Paraguay", "Paraguay", "+595", "586", "5860", "PY", "PRY", "600", true, false, 600, "Q733", 18, (byte)1, new Integer[] { 600 }, new Integer[] { 148, 57 }),
	Romania(9, "Romênia", "Romania", "Rumania", "+40", "670", "6700", "RO", "ROU", "642", false, false, 642, "Q218", 42, (byte)3, new Integer[] { 642 }, new Integer[] { 130 }),
	Australia(10, "Austrália", "Australia","Australia", "+61", "069", "0698",  "AU", "AUS", "036", false, false, 36, "Q408", 13, (byte)5, new Integer[] { 36 }, new Integer[] { 42 }),
	NewZealand(11, "Nova Zelândia", "New Zealand", "Nueva Zelanda", "+64", "548", "5487", "NZ", "NZL", "554", false, false, 554, "Q664", 18, (byte)5, new Integer[] { 554 }, new Integer[] { 42, 105 }),
	Uruguai(12, "Uruguai", "Uruguay", "Uruguay", "+598", "845", "8451", "UY", "URY", "858", true, false, 858, "Q77", 19, (byte)1, new Integer[] { 858 }, new Integer[] { 148 }),
	Colombia(13, "Colômbia", "Colombia", "Colombia", "+57", "169", "1694", "CO", "COL", "170", true, false, 170, "Q739", 32, (byte)1, new Integer[] { 170 }, new Integer[] { 148 }),
	Peru(14, "Peru", "Peru", "Peru", "+51", "589", "5894", "PE", "PER", "604", true, false, 604, "Q419", 26, (byte)1, new Integer[] { 604 }, new Integer[] { 148 }),
	Mexico(15, "México", "Mexico", "México", "+52", "493", "4936", "MX", "MEX", "484", false, false, 484, "Q96", 32, (byte)1, new Integer[] { 484 }, new Integer[] { 148 }),
	Ecuador(16, "Equador", "Ecuador", "Ecuador", "+593", "239", "2399", "EC", "ECU", "218", true, false, 218, "Q736", 24, (byte)1, new Integer[] { 840 }, new Integer[] { 148 }),
	Bolivia(17, "Bolívia", "Bolivia", "Bolivia", "+591", "097", "0973", "BO", "BOL", "068", false,false, 68, "Q750", 9, (byte)1, new Integer[] { 68 }, new Integer[] { 148, 57, 13, 129 }),
	Panama(18, "Panamá", "Panama", "Panamá", "+507", "580", "5800", "PA", "PAN", "591", false, false, 591, "Q804", 13, (byte)1, new Integer[] { 590, 840 }, new Integer[] { 148 }),
	Suriname(19, "Suriname", "Suriname", "Surinam", "+597", "770", "7706", "SR", "SUR", "740", true, false, 740, "Q730", 10, (byte)1, new Integer[] { 740 }, new Integer[] { 40 }),
	Guiana(20, "Guiana", "Guyana", "Guayana", "+592", "337", "3379", "GY", "GUY", "328", true, false, 328, "Q734", 10, (byte)1, new Integer[] { 328 }, new Integer[] { 42 }),
	CostaRica(21, "Costa Rica", "Costa Rica", "Costa Rica", "+506", "196", "1961", "CR", "CRI", "188", false, false, 188, "Q800", 7, (byte)1, new Integer[] { 188 }, new Integer[] { 148 }),
	Cuba(22, "Cuba", "Cuba", "Cuba", "+53", "199", "1996", "CU", "CUB", "192", false, false, 192, "Q241", 16, (byte)1, new Integer[] { 192 }, new Integer[] { 148 }),
	Venezuela(23, "Venezuela", "Venezuela", "Venezuela", "+58", "850", "8508", "VE", "VEN", "862", true, false, 862, "Q717", 24, (byte)1, new Integer[] { 862 }, new Integer[] { 148 });
	
	/**
	 * 
	 */
	private Integer id;
	
	/**
	 * 
	 */
	private String namePt;
	
	/**
	 * 
	 */
	private String nameEn;
	
	/**
	 * 
	 */
	private String nameEs;
	
	/**
	 * 
	 */
	private String prefixPhoneCode;
	
	/**
	 * 
	 */
	private String siscomexCode;
	
	/**
	 * 
	 */
	private String spedCode;
	
	/**
	 * 
	 */
	private String isoCode31662;
	
	/**
	 * 
	 */
	private String isoCode31663;
	
	/**
	 * 
	 */
	private String isoCodeNum;
	
	/**
	 * 
	 */
	private boolean mercosul;
	
	/**
	 * 
	 */
	private boolean euroZone;
	
	/**
	 * 
	 */
	private int m49Code;
	
	/**
	 * 
	 */
	private String wikiDataId;
	
	/**
	 * 
	 */
	private int regionAmount;
	
	/**
	 * 
	 */
	private Integer[] currencies;
	
	/**
	 * 
	 */
	private byte idContinent;
	
	/**
	 * 
	 */
	private Integer[] languages;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param namePt
	 * @param nameEn
	 * @param nameEs
	 * @param prefixPhoneCode
	 * @param siscomexCode
	 * @param spedCode
	 * @param isoCode31662
	 * @param isoCode31663
	 * @param isoCodeNum
	 * @param mercosul
	 * @param euroZone
	 * @param m49Code
	 * @param wikiDataId
	 * @param regionAmount
	 * @param idContinent
	 * @param currencies
	 * @param languages
	 */
	private Countries(Integer id, String namePt, String nameEn, String nameEs, String prefixPhoneCode, String siscomexCode
			, String spedCode, String isoCode31662, String isoCode31663, String isoCodeNum, boolean mercosul
			, boolean euroZone, int m49Code, String wikiDataId, int regionAmount, byte idContinent, Integer[] currencies
			, Integer[] languages) {
		this.id = id;
		this.namePt = namePt;
		this.nameEn = nameEn;
		this.nameEs = nameEs;
		this.prefixPhoneCode = prefixPhoneCode;
		this.siscomexCode = siscomexCode;
		this.spedCode = spedCode;
		this.isoCode31662 = isoCode31662;
		this.isoCode31663 = isoCode31663;
		this.isoCodeNum = isoCodeNum;
 		this.mercosul = mercosul;
		this.euroZone = euroZone;
		this.m49Code = m49Code;
		this.wikiDataId = wikiDataId;
		this.regionAmount = regionAmount;
		this.idContinent = idContinent;
		this.currencies = currencies;
		this.languages = languages;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the namePt
	 */
	public String getNamePt() {
		return namePt;
	}

	/**
	 * @return the nameEn
	 */
	public String getNameEn() {
		return nameEn;
	}

	/**
	 * @return the nameEs
	 */
	public String getNameEs() {
		return nameEs;
	}

	/**
	 * @return the prefixPhoneCode
	 */
	public String getPrefixPhoneCode() {
		return prefixPhoneCode;
	}

	/**
	 * @return the siscomexCode
	 */
	public String getSiscomexCode() {
		return siscomexCode;
	}

	/**
	 * @return the spedCode
	 */
	public String getSpedCode() {
		return spedCode;
	}

	/**
	 * @return the isoCode31662
	 */
	public String getIsoCode31662() {
		return isoCode31662;
	}

	/**
	 * @return the isoCode31663
	 */
	public String getIsoCode31663() {
		return isoCode31663;
	}

	/**
	 * @return the isoCodeNum
	 */
	public String getIsoCodeNum() {
		return isoCodeNum;
	}

	/**
	 * @return the mercosul
	 */
	public boolean isMercosul() {
		return mercosul;
	}

	/**
	 * @return the euroZone
	 */
	public boolean isEuroZone() {
		return euroZone;
	}

	/**
	 * @return the m49Code
	 */
	public int getM49Code() {
		return m49Code;
	}

	/**
	 * @return the wikiDataId
	 */
	public String getWikiDataId() {
		return wikiDataId;
	}

	/**
	 * @return the regionAmount
	 */
	public int getRegionAmount() {
		return regionAmount;
	}

	/**
	 * @return the idContinent
	 */
	public byte getIdContinent() {
		return idContinent;
	}

	/**
	 * @return the idContinent
	 */
	public Integer[] getCurrencies() {
		return this.currencies;
	}

	/**
	 * @return the languages
	 */
	public Integer[] getLanguages() {
		return this.languages;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static Countries getById(String id) {
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
	public static Countries getById(int id) {
		for (Countries country : values()) {
			if (country != NotFound) {
				if (country.getId() == id) {
					return country;
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
		// Currencies
		String currenciesStr = StringUtils.EMPTY;
		if (this.getCurrencies() == null) {
			currenciesStr = "null";
		} else {
			currenciesStr = "[ ";
			for (int currency : this.getCurrencies()) {
				currenciesStr = currenciesStr  
						+ (currenciesStr.equals("[ ") ? " " : ", ") 
						+ Currencies.getById(currency).toJson();
			}
			currenciesStr = currenciesStr + " ]";
		}
		
		// Languages
		String languagesStr = StringUtils.EMPTY;
		if (this.getLanguages() == null) {
			languagesStr = "null";
		} else {
			languagesStr = "[ ";
			for (int language : this.getLanguages()) {
				languagesStr = languagesStr  
						+ (languagesStr.equals("[ ") ? " " : ", ") 
						+ Languages.getById(language).toJson();
			}
			languagesStr = languagesStr + " ]";
		}
		
		return "{ \"id\": " + this.getId()
			+ ", \"namePt\": \"" + this.getNamePt() + "\""
			+ ", \"nameEn\": \"" + this.getNameEn() + "\""
			+ ", \"nameEs\": \"" + this.getNameEs() + "\""
			+ ", \"prefixPhoneCode\": \"" + this.getPrefixPhoneCode() + "\""
			+ ", \"siscomexCode\": \"" + this.getSiscomexCode() + "\""
			+ ", \"spedCode\": \"" + this.getSpedCode() + "\""
			+ ", \"isoCode31662\": \"" + this.getIsoCode31662() + "\""
			+ ", \"isoCode31663\": \"" + this.getIsoCode31663() + "\""
			+ ", \"isoCodeNum\": \"" + this.getIsoCodeNum() + "\""
			+ ", \"mercosul\": " + this.isMercosul()
			+ ", \"euroZone\": " + this.isEuroZone()
			+ ", \"m49Code\": " + this.getM49Code()
			+ ", \"wikiDataId\": \"" + this.getWikiDataId() + "\""
			+ ", \"regionAmount\": " + this.getRegionAmount()
			+ ", \"idContinent\": " + Continents.getById(this.idContinent).toJson() 
			+ ", \"currencies\": " + currenciesStr 
			+ ", \"languages\": " + languagesStr + " }";
	}
	
	/**
	 * List all countries on json
	 * @return
	 */
	public static String toJsonList() {
		String response = StringUtils.EMPTY;
		
		for (Countries country : values()) {
			if (country != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + country.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
