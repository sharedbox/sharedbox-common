package com.sharedbox.common.location;

import com.sharedbox.common.utils.JsonUtils;
import com.sharedbox.common.utils.StringUtils;

/**
 * Currencies of the world
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 03/03/2022 - Version 1.0.0
 */
public enum Currencies {
	NotFound(0, null, null, null, null, null),
	AfghanAfghani(4, "Afegane afegão", "Afghan afghani", "afgano afgano", "AFN", "؋"),
	AlgerianDinar(12, "Dinar argelino", "Algerian Dinar", "dinar argelino", "DZD", "د.ج"),
	AndorranPeseta(20, "Peseta Andorrana", "Andorran Peseta", "Peseta Andorrana", "ADP", null),
	ArgentinePeso(32, "Peso Argentino", "Argentine Peso", "Peso Argentino", "ARS", "$"),
	ArmenianDram(51, "Dram arménio", "Armenian Dram", "Dram armenio", "AMD", null),
	ArubanGuilder(533, "Florim arubano", "Aruban Guilder", "Florín de Aruba", "AWG", "ƒ"),
	AustralianDollar(36, "Dólar Australiano", "Australian Dollar", "Dólar Australiano", "AUD", "$"),
	AzerbaijanianManat(31, "Manat azerbaijano", "Azerbaijanian Manat", "manat azerbaiyano", "AZN", null),
	Balboa(590, "Balboa", "Balboa", "Balboa", "PAB", "B/."),
	BahamianDollar(44, "Dólar baamense", "Bahamian Dollar", "dólar bahameño", "BSD", "$"),
	Baht(764, "Baht tailandês", "Baht", "baht", "THB", "฿"),
	BahrainiDinar(48, " Dinar barenita", "Bahraini Dinar", "dinar bahreiní", "BHD", ".د.ب"),
	BarbadosDollar(52, "Dólar dos Barbados", "Barbados Dollar", "Dólar de Barbados", "BBD", "$"),
	BelarussianRuble(974, "Rublo bielorrusso",  "Belarussian Ruble", "Rublo Bielorruso", "BYR", "Br"),
	BelizeDollar(84, "Dólar do Belize", "Belize Dollar", "Dólar de Belice", "BZD", "$"),
	BermudianDollar(60, "Dólar bermudense", "Bermudian Dollar", "dólar bermudeño", "BMD", "$"),
	Bolivar(862, "Bolívar Venezuelano", "Venezuelan Bolivar", "Bbolívar Venezolano", "VEF", "Bs.F"),
	Bolivian(68, "Boliviano", "Bolivian", "Boliviano", "BOB", "Bs."),
	BruneiDollar(96, "Dólar do Brunei", "Brunei Dollar", "Dólar de Brunéi", "BND", "$"),
	BulgarianLev(975, "Lev Búlgaro", "Bulgarian Lev", "Lev Búlgaro", "BGN", "лв"),
	BurundiFranc(108, "Franco burundiano", "Burundi Franc", "Franco de Burundi", "BIF", "Fr"),
	CanadianDollar(124, "Dólar Canadense", "Canadian Dollar", "Dolar Canadiense", "CAD", "$"),
	CapeVerdeanEscudo(132, "Escudo cabo-verdiano", "Cape Verdean Escudo", "Escudo de Cabo Verde", "CVE", "Esc$"),
	CaymanIslandsDollar(136, "Dólar das Ilhas Caimão", "Cayman Islands Dollar", "Dólar de las Islas Caimán", "KYD", "$"),
	Cedi(288, "Cedi", "Cedi", "Cedí", "GHC", null),
	CFAFrancBEAC(950, "Franco CFA BEAC", "CFA Franc BEAC", "Franco CFA BEAC", "XAF", "Fr"),
	CFAFrancBCEAO(952, "Franco CFA BCEAO", "CFA Franc BCEAO", "Franco CFA BCEAO", "XOF", "Fr"),
	CFPFranc(953, "Franco CFP", "CFP Franc", "Franco CFP", "XPF", "Fr"),
	ChileanPeso(152, "Peso Chileno", "Chilean Peso", "Peso Chileno", "CLP", "$"),
	ColombianPeso(170, "Peso Colombiano", "Colombian Peso", "Peso Colombiano", "COP", "$"),
	ComoroFranc(174, "Franco comorense", "Comoro Franc", "franco comorano", "KMF", "Fr"),
	ConstantValueUnit(983, "Unidade de Valor Constante (UVC)", "Constant Value Unit (UVC)", "Unidad de valor constante (UVC)", "ECV", null),
	ConvertibleMarks(977, "Marco Convertível da Bósnia e Herzegovina", "Convertible Marks", "Marcas convertibles", "BAM", "KM"),
	CordobaOro(558, "Córdoba nicaraguano", "Cordoba Oro", "Córdoba Oro", "NIO", "C$"),
	CostaRicanColon(188, "Colón costa-riquenho", "Costa Rican Colon", "Colón Costarricense", "CRC", "₡"),
	Croatiankuna(191, "Kuna croata", "Croatian kuna", "kuna croata", "HRK", "kn"),
	CubanPeso(192, "Peso Cubano", "Cuban Peso", "Peso Cubano", "CUP", "$"),
	CyprusPound(196, "Libra cipriota", "Cyprus Pound", "Libra chipriota", "CYP", null),
	CzechKoruna(203, "Coroa checa", "Czech Koruna", "corona checa", "CZK", "Kč"),
	Dalasi(270, "Dalasi gambiano", "Dalasi", "Dalasi", "GMD", "D"),
	DanishKrone(208, "Coroa dinamarquesa", "Danish Krone", "corona danesa", "DKK", "kr"),
	Denar(807, "Dinar", "Denar", "Denar", "MKD", "ден"),
	DjiboutiFranc(262, "Franco do Djibuti", "Djibouti Franc", "Franco de Yibuti", "DJF", null),
	Dobra(678, "Dobra", "Dobra", "Dobra", "STD", null),
	Dong(704, "Dongue vietnamita", "Dong", "Polla", "VND", "₫"),
	DominicanPeso(214, "Peso dominicano", "Dominican Peso", "peso dominicano", "DOP", "$"),
	EastCaribbeanDollar(951, "Dólar das Caraíbas Orientais", "East Caribbean Dollar", "Dólar del Caribe Oriental", "XCD", "$"),
	EgyptianPound(818, "Libra Egípcia", "Egyptian Pound", "Libra Egipcia", "EGP", "£"),
	ElSalvadorColon(222, "Colón de El Salvador", "El Salvador Colon", "El Salvador Colón", "SVC", null),
	Euro(978, "Euro", "Euro", "Euro", "EUR", "€"),
	EthiopianBirr(230, "Birr etíope", "Ethiopian Birr", "Birr etíope", "ETB", "Br"),
	FalklandIslandsPound(238, "Libra das Ilhas Malvinas", "Falkland Islands Pound", "Libra malvinense", "FKP", "£"),
	FijiDollar(242, "Dólar fijiano", "Fiji Dollar", "Dólar Fiyiano", "FJD", "$"),
	Forint(348, "Florim húngaro", "Forint", "Florín", "HUF", "Ft"),
	FrancCongolais(976, "Franco Congolês", "Franc Congolais", "Franco Congoleño", "CDF", "Fr"),
	GibraltarPound(292, "Libra de Gibraltar", "Gibraltar Pound", "Libra gibraltareña", "GIP", "£"),
	Gourde(332, "Gurde haitiano", "Gourde", "Gourde", "HTG", "G"),
	Guarani(600, "Guarani", "Guarani", "Guaraní", "PYG", "₲"),
	GuineaBissauPeso(624, "Peso da Guiné-Bissau", "Guinea-Bissau Peso", "Peso guineano-bissau", "GWP", null),
	GuineaFranc(324, "Franco guineense", "Guinea Franc", "Franco guineano", "GNF", "Fr"),
	GuyanaDollar(328, "Dólar Guianense", "Guyana Dollar", "Dólar Guyanés", "GYD", "GY$"),
	HongKongDollar(344, "Dólar de Hong Kong", "Hong Kong Dollar", "Dolar de Hong Kong", "HKD", "$"),
	Hryvnia(980, "Grívnia Ucraniana", "Hryvnia", "Grivna", "UAH", "₴"),
	KenyanShilling(404, "Xelim queniano", "Kenyan Shilling", "chelín keniano", "KES", "Sh"),
	Kina(598, "Kina papuásia", "Kina", "Kina", "PGK", "K"),
	Kip(418, "Kipe Lau", "Kip", "Kipe Lau", "LAK", "₭"),
	Kroon(233, "Coroa", "Kroon", "Corona", "EEK", null),
	KuwaitiDinar(414, "Dinar kuwaitiano", "Kuwaiti Dinar", "dinar kuwaití", "KWD", "د.ك"),
	Kwanza(973, "Kwanza angolano", "Kwanza", "Kwanza", "AOA", "Kz"),
	Kyat(104, "Kyat de Mianmar", "Kyat", "Kyat", "MMK", "Ks"),
	IcelandKrona(352, "Coroa islandesa", "Iceland Krona", "corona islandesa", "ISK", "kr"),
	IndianRupee(356, "Rupia indiana", "Indian Rupee", "Rupia india", "INR", "₹"),
	IranianRial(364, "Rial iraniano", "Iranian Rial", "rial iraní", "IRR", "﷼"),
	IraqiDinar(368, "Dinar iraquiano", "Iraqi Dinar", "dinar iraquí", "IQD", "ع.د"),
	JamaicanDollar(388, "Dólar jamaicano", "Jamaican Dollar", "dólar jamaiquino", "JMD", "$"),
	JordanianDinar(400, "Dinar jordano", "Jordanian Dinar", "dinar jordano", "JOD", "د.ا"),
	Lari(981, "Lari Georgiano", "Lari", "Lari", "GEL", "ლ"),
	Leck(8, "Lek albanês", "Leck", "Leck", "ALL", "L"),
	Lempira(340, "Lempira hondurenha", "Lempira", "lempira", "HNL", "L"),
	Lev(100, "Lev", "Lev", "lev", "BGL", null),
	Leone(694, "Leone serra-leonino", "Leone", "Leona", "SLL", "Le"),
	LiberianDollar(430, "Dólar liberiano", "Liberian Dollar", "dólar liberiano", "LRD", "$"),
	Lilangeni(748, "Lilangeni suazilandês", "Lilangeni", "Lilangeni", "SZL", "L"),
	Manat(795, "Manat", "Manat", "manat", "TMM", null),
	MauritiusRupee(480, "Rupia Mauriciana", "Mauritius Rupee", "Rupia de Mauricio", "MUR", "₨"),
	MexicanInvestmentUnit(979, "Unidade Mexicana de Inversão (UDI)", "Mexican Investment Unit (UDI)", "Unidad de Inversión Mexicana (UDI)", "MXV", null),
	MexicanPeso(484, "Peso Mexicano", "Mexican Peso", "Peso Mexicano", "MXN", "$"),
	MalagasyFranc(450, "Franco malgaxe", "Malagasy Franc", "franco malgache", "MGF", null),
	MalaysianRinggit(458, "Ringuite malaio", "Malaysian Ringgit", "Ringgit malayo", "MYR", "RM"),
	MalawianKwacha(454, "Kwacha Malauiano", "Malawian Kwacha", "Kwacha de Malawi", "MWK", "MK"),
	MoldovanLeu(498, "Leu moldávio", "Moldovan Leu", "Leu moldavo", "MDL", "L"),
	MalteseLira(470, "Lira Maltesa", "Maltese Lira", "lira maltesa", "MTL", null),
	MoroccanDirham(504, "Dirame marroquino", "Moroccan Dirham", "Dírham marroquí", "MAD", "د.م."),
	Mvdol(984, "Mvdol", "Mvdol", "Mvdol", "BOV", null),
	Nakfa(232, "Nakfa eritreia", "Nakfa", "Nakfa", "ERN", "Nfk"),
	Naira(566, "Naira nigeriano", "Naira", "Naira", "NGN", "₦"),
	NamibiaDollar(516, "Dólar namibiano", "Namibia Dollar", "dólar namibio", "NAD", "$"),
	NepaleseRupee(524, "Rupia nepalesa", "Nepalese Rupee", "rupia nepalí", "NPR", "₨"),
	NetherlandsAntillanGuilder(532, "Florim antilhano", "Netherlands Antillan Guilder", "florín antillano neerlandés", "ANG", "ƒ"),
	NewIsraeliSheqel(376, "Novo shekel israelense", "New Israeli Sheqel", "Nuevo séquel israelí", "ILS", "₪"),
	NewTaiwanDollar(901, "Novo dólar de Taiuã", "New Taiwan Dollar", "Nuevo dólar taiwanés", "TWD", "$"),
	NewTurkishLira(949, "Lira turca", "New Turkish Lira", "Nueva lira turca", "TRY", ""),
	NewZealandDollar(554, "Dólar neozelandês", "New Zealand Dollar", "Dolar de Nueva Zelanda", "NZD", "$"),
	Ngultrum(64, "Ngultrum butanês", "Ngultrum", "Ngultrum", "BTN", "Nu."),
	NorthKoreanWon(408, "Won norte-coreano", "North Korean Won", "Won norcoreano", "KPW", "₩"),
	NorwegianKrone(578, "Coroa norueguesa", "Norwegian Krone", "corona noruega", "NOK", "kr"),
	NuevoSol(604, "Novo Som", "Nuevo Sol", "Nuevo Sol", "PEN", "S/."),
	Paanga(776, "Paʻanga tonganesa", "Pa´anga", "Pa´anga", "TOP", "T$"),
	PakistanRupee(586, "Rupia paquistanesa", "Pakistan Rupee", "Rupia de Pakistán", "PKR", "₨"),
	Pataca(446, "Pataca macaense", "Pataca", "pataca", "MOP", "P"),
	PhilippinePeso(608, "Peso filipino", "Philippine Peso", "peso filipino", "PHP", "₱"),
	PoundSterling(826, "Libra Esterlina", "Pound Sterling", "Libra Esterlina", "GBP", "£"),
	PromotionUnits(990, "Unidades de fomento", "Unidades de fomento", "unidades de fomento", "CLF", null),
	Pula(72, "Pula do Botsuana", "Pula", "Pula", "BWP", "P"),
	QatariRial(634, "Rial catarense", "Qatari Rial", "Rial qatarí", "QAR", "ر.ق"),
	Quetzal(320, "Quetzal guatemalteco", "Quetzal", "Quetzal", "GTQ", "Q"),
	Ouguiya(478, "Uguia mauritana", "Ouguiya", "Ouguiya", "MRO", "UM"),
	Rand(710, "Rand sul-africano", "Rand", "Rand", "ZAR", "R"),
	RealBrasileiro(986, "Real Brasileiro", "Brazilian Real", "Real Brasileño", "BRL", "R$"),
	RialOmani(512, "Rial omanense", "Rial Omani", "Rial omaní", "OMR", "ر.ع."),
	Riel(116, "Riel cambojano", "Riel", "Riel", "KHR", "៛"),
	RomanianLeu(642, "Leu Romeno", "Romanian Leu", "Leu Rumano", "RON", "Lei"),
	Rufiyaa(462, "Rupia maldiva", "Rufiyaa", "Rufiyaa", "MVR", ".ރ"),
	Rupiah(360, "Rupia indonésia", "Rupiah", "Rupia", "IDR", "Rp"),
	RussianRuble(643, "Rublo russo", "Russian Ruble", "Rublo ruso", "RUB", "₽"),
	RwandaFranc(646, "Franco ruandês", "Rwanda Franc", "franco ruandés", "RWF", "Fr"),
	Taka(50, "Taka", "Taka", "Taka", "BDT", null),
	SaintHelenaPound(654, "Libra de Santa Helena", "Saint Helena Pound", "Libra de Santa Elena", "SHP", "£"),
	SaudiRiyal(682, "Rial saudita", "Saudi Riyal", "rial saudí", "SAR", "ر.س"),
	SeychellesRupee(690, "Rúpia de Seychelles", "Seychelles Rupee", "Rupia de Seychelles", "SCR", null),
	SingaporeDollar(702, "Dólar de Singapura", "Singapore Dollar", "Dolar de Singapur", "SGD", "$"),
	SlovakKoruna(703, "Coroa Eslovaca", "Slovak Koruna", "corona eslovaca", "SKK", null),
	SolomonIslandsDollar(90, "Dólar das Ilhas Salomão", "Solomon Islands Dollar", "Dólar de las Islas Salomón", "SBD", "$"),
	Som(417, "Som Quirguiz", "Som", "Som", "KGS", "лв"),
	SomaliShilling(706, "Xelim somaliano", "Somali Shilling", "chelín somalí", "SOS", "Sh"),
	Somoni(972, "Somoni tajique", "Somoni", "Somoni", "TJS", "ЅМ"),
	Sucre(218, "Sucre", "Sucre", "Sucre", "ECS", null),
	SudanesePound(938, "Libra sudanesa", "Sudanese Pound", "Libra sudanesa", "SDG", "£"),
	SurinameDollar(740, "Dólar Surinamês", "Suriname Dollar", "Dólar de Surinam", "SRD", "$"),
	SriLankaRupee(144, "Rupia do Sri Lanka", "Sri Lanka Rupee", "Rupia de Sri Lanka", "LKR", "Rs"),
	SwedishKrona(752, "Coroa sueca", "Swedish Krona", "Corona sueca", "SEK", "kr"),
	SwissFranc(756, "Franco suíço", "Swiss Franc", "Franco suizo", "CHF", "Fr"),
	SyrianPound(760, "Libra síria", "Syrian Pound", "Libra siria", "SYP", "£"),
	TanzanianShilling(834, "Xelim tanzaniano", "Tanzanian Shilling", "Chelín Tanzano", "TZS", "Sh"),
	Tenge(398, "Tengue cazaque", "Tenge", "Tenge", "KZT", "₸"),
	TimorEscudo(626, "Escudo de Timor", "Timor Escudo", "escudo timorense", "TPE", null),
	Tolar(705, "Tolar", "Tolar", "Tolares", "SIT", null),
	TrinidadAndTobagoDollar(780, "Dólar de Trindade e Tobago", "Trinidad and Tobago Dollar", "Dólar de Trinidad y Tobago", "TTD", "$"),
	Tugrik(496, "Tugrik mongol", "Tugrik", "Tugrik", "MNT", "₮"),
	TugrikMetical(508, "Metical", "Metical", "Metical", "MZM", null),
	TunisianDinar(788, "Dinar tunisino", "Tunisian Dinar", "dinar tunecino", "TND", "د.ت"),
	TurkishLira(792, "Lira turca", "Turkish Lira", "Lira turca", "TRL", null),
	UAEDirham(784, "Dirame dos Emirados Árabes Unidos", "UAE Dirham", "Dírham de los Emiratos Árabes Unidos", "AED", "د.إ"),
	UgandaShilling(800, "Xelim ugandês", "Uganda Shilling", "Chelín ugandés", "UGX", "Sh"),
	UruguayanPeso(858, "Peso Uruguaio","Uruguayan Peso", "Peso Uruguayo", "UYU", "$"),
	UzbekistanSum(860, "Som usbeque", "Uzbekistan Sum", "Suma de Uzbekistán", "UZS", "лв"),
	Vatu(548, "Vatu do Vanuatu", "Vatu", "Vatu", "VUV", "Vt"),
	Won(410, "Won sul-coreano", "Won", "Ganado", "KRW", "₩"),
	Yen(392, "Iene", "Yen", "Yen", "JPY", "¥"),
	YemeniRial(886, "Rial Iemenita", "Yemeni Rial", "Rial Yemení", "YER", "﷼"),
	YuanRenminbi(156, "Renminbi", "Yuan Renminbi", "Yuan renminbi", "CNY", "¥"),
	YugoslavianDinar(891, "Dinar Iugoslavo", "Yugoslavian Dinar", "dinar yugoslavo", "YUM", null),
	ZambianKwacha(894, "Kwacha zambiano", "Zambian Kwacha", "Kwacha Zambiano", "ZMK", "ZK"),
	ZimbabweDollar(716, "Dólar do Zimbábue", "Zimbabwe Dollar", "dólar zimbabuense", "ZWD", null),
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
	public String getName() {
		return this.getName(Languages.En);
	}

	/**
	 * @return the nameEn
	 */
	public String getName(Languages lang){
			switch (lang) {
			case Pt:	
				return namePt;
			case Es:	
				return nameEs;
			default:	
				return nameEn;
		}
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
			+ ", \"namePt\": \"" + this.getName(Languages.Pt) + "\""
			+ ", \"nameEn\": \"" + this.getName(Languages.En) + "\""
			+ ", \"nameEs\": \"" + this.getName(Languages.Es) + "\""
			+ ", \"code\": \"" + this.getCode() + "\""
			+ ", \"symbol\": " + JsonUtils.createJsonValue(this.getSymbol()) + " }";
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
