package br.com.sharedbox.common.location;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * Currencies of the world
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 03/03/2022 - Version 1.0.0
 */
public enum Currencies {
	NotFound(0, null, null, null, null, null),
	ArgentinePeso(32, "Peso Argentino", "Argentine Peso", "Peso Argentino", "ARS", "$"),
	AustralianDollar(36, "Dólar Australiano", "Australian Dollar", "Dólar Australiano", "AUD", "$"),
	Balboa(590, "Balboa", "Balboa", "Balboa", "PAB", "B/"),
	Bolivar(862, "Bolívar Venezuelano", "Venezuelan Bolivar", "Bbolívar Venezolano", "VEF", "Bs.F"),
	Bolivian(68, "Boliviano", "Bolivian", "Boliviano", "BOB", "Bs"),
	CanadianDollar(124, "Dólar Canadense", "Canadian Dollar", "Dolar Canadiense", "CAD", "$"),
	ChileanPeso(152, "Peso Chileno", "Chilean Peso", "Peso Chileno", "CLP", "$"),
	ColombianPeso(170, "Peso Colombiano", "Colombian Peso", "Peso Colombiano", "COP", "$"),
	CostaRicanColon(188, "Colón costa-riquenho", "Costa Rican Colon", "Colón Costarricense", "CRC", "₡"),
	CubanPeso(192, "Peso Cubano", "Cuban Peso", "Peso Cubano", "CUP", "$"),
	Euro(978, "Euro", "Euro", "Euro", "EUR", "€"),
	Guarani(600, "Guarani", "Guarani", "Guaraní", "PYG", "₲"),
	GuyanaDollar(328, "Dólar Guianense", "Guyana Dollar", "Dólar Guyanés", "GYD", "GY$"),
	MexicanPeso(484, "Peso Mexicano", "Mexican Peso", "Peso Mexicano", "MXN", "$"),
	NewZealandDollar(554, "Dólar neozelandês", "New Zealand Dollar", "Dolar de Nueva Zelanda", "NZD", "$"),
	NuevoSol(604, "Novo Sol", "Nuevo Sol", "Nuevo Sol", "PEN", "S/"),
	RealBrasileiro(986, "Real Brasileiro", "Brazilian Real", "Real Brasileño", "BRL", "R$"),
	RomanianLeu(642, "Leu Romeno", "Romanian Leu", "Leu Rumano", "RON", "Lei"),
	SurinameDollar(740, "Dólar Surinamês", "Suriname Dollar", "Dólar de Surinam", "SRD", "$"),
	USDollar(840, "Dólar Americano", "US Dollar", "Dólar Estadounidense", "USD", "$"),
	UruguayanPeso(858, "Peso Uruguaio","Uruguayan Peso", "Peso Uruguayo", "UYU", "$"),
	Złoty(985, "Złoty", "Złoty", "Złoty", "PLN", "zł");

	
	/**
	 * 
	 */
	private int id;

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
	private String code;

	/**
	 * 
	 */
	private String symbol;
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param namePt
	 * @param nameEn
	 * @param nameEs
	 * @param code
	 * @param symbol
	 */
	private Currencies(int id, String namePt, String nameEn, String nameEs, String code, String symbol) {
		this.id = id;
		this.namePt = namePt;
		this.nameEn = nameEn;
		this.nameEs = nameEs;
		this.code = code;
		this.symbol = symbol;
	}

	/**
	 * @return the id
	 */
	public int getId() {
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public static Currencies getById(String id) {
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
	public static Currencies getById(int id) {
		for (Currencies currency : values()) {
			if (currency != NotFound) {
				if (currency.getId() == id) {
					return currency;
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
			+ ", \"namePt\": \"" + this.getNamePt() + "\""
			+ ", \"nameEn\": \"" + this.getNameEn() + "\""
			+ ", \"nameEs\": \"" + this.getNameEs() + "\""
			+ ", \"code\": \"" + this.getCode() + "\""
			+ ", \"symbol\": \"" + this.getSymbol() + "\" }";
	}
	
	/**
	 * List all currencies on json
	 * @return
	 */
	public static String toJsonList() {
		String response = StringUtils.EMPTY;
		
		for (Currencies currency : values()) {
			if (currency != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + currency.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
