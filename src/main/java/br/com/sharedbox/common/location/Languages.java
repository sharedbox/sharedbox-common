package br.com.sharedbox.common.location;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 03/04/2022 - Version 1.0.0
 */
public enum Languages {
	Pt(1, "Portuguese", "Português", "pt", "por", "por"),
	Ab(127, "Abkhazian", "аҧсуа бызшәа, аҧсшәа", "ab", "abk", "abk"),
	Aa(2, "Afar", "Afaraf", "aa", "aar", "aar"),
	Af(3, "Afrikaans", "Afrikaans", "af", "afr", "afr"),
	Ak(4, "Akan", "Akan", "ak", "aka", "aka"),
	Sq(5, "Albanian", "Shqip", "sq", "alb", "sqi"),
	Am(6, "Amharic", "አማርኛ", "am", "amh", "amh"),
	Ar(7, "Arabic", "العربية", "ar", "ara", "ara"),
	An(8, "Aragonese", "aragonés", "an", "arg", "arg"),
	Hy(9, "Armenian", "Հայերեն", "hy", "arm", "hye"),
	As(10, "Assamese", "অসমীয়া", "as", "asm", "asm"),
	Av(11, "Avaric", "авар мацӀ, магӀарул мацӀ", "av", "ava", "ava"),
	Ae(12, "Avestan", "avesta", "ae", "ave", "ave"),
	Ay(13, "Aymara", "aymar aru", "ay", "aym", "aym"),
	Az(14, "Azerbaijani", "azərbaycan dili, تۆرکجه", "az", "aze", "aze"),
	Bm(15, "Bambara", "bamanankan", "bm", "bam", "bam"),
	Ba(16, "Bashkir", "башҡорт теле", "ba", "bak", "bak"),
	Eu(17, "Basque", "euskara, euskera", "eu", "baq", "eus"),
	Be(18, "Belarusian", "беларуская мова", "be", "bel", "bel"),
	Bn(19, "Bengali", "বাংলা", "bn", "ben", "ben"),
	Bi(20, "Bislama", "Bislama", "bi", "bis", "bis"),
	Bs(21, "Bosnian", "bosanski jezik", "bs", "bos", "bos"),
	Br(22, "Breton", "brezhoneg", "br", "bre", "bre"),
	Bg(23, "Bulgarian", "български език", "bg", "bul", "bul"),
	My(24, "Burmese", "ဗမာစာ", "my", "bur", "mya"),
	Ca(25, "Catalan, Valencian", "català, valencià", "ca", "cat", "cat"),
	Km(26, "Central Khmer", "ខ្មែរ, ខេមរភាសា, ភាសាខ្មែរ", "km", "khm", "khm"),
	Ch(27, "Chamorro", "Chamoru", "ch", "cha", "cha"),
	Ce(28, "Chechen", "нохчийн мотт", "ce", "che", "che"),
	Ny(29, "Chichewa, Chewa, Nyanja", "chiCheŵa, chinyanja", "ny", "nya", "nya"),
	Zh(30, "Chinese", "中文 (Zhōngwén), 汉语, 漢語", "zh", "chi", "zho"),
	Cu(31, "Church Slavic, Old Slavonic, Church Slavonic, Old Bulgarian, Old Church Slavonic", "ѩзыкъ словѣньскъ", "cu", "chu", "chu"),
	Cv(32, "Chuvash", "чӑваш чӗлхи", "cv", "chv", "chv"),
	Kw(33, "Cornish", "Kernewek", "kw", "cor", "cor"),
	Co(34, "Corsican", "corsu, lingua corsa", "co", "cos", "cos"),
	Cr(35, "Cree", "ᓀᐦᐃᔭᐍᐏᐣ", "cr", "cre", "cre"),
	Hr(36, "Croatian", "hrvatski jezik", "hr", "hrv", "hrv"),
	Cs(37, "Czech", "čeština, český jazyk", "cs", "cze", "ces"),
	Da(38, "Danish", "dansk", "da", "dan", "dan"),
	Dv(39, "Divehi, Dhivehi, Maldivian", "ދިވެހި", "dv", "div", "div"),
	Nl(40, "Dutch, Flemish", "Nederlands, Vlaams", "nl", "dut", "nld"),
	Dz(41, "Dzongkha", "རྫོང་ཁ", "dz", "dzo", "dzo"),
	En(42, "English", "English", "en", "eng", "eng"),
	Eo(43, "Esperanto", "Esperanto", "eo", "epo", "epo"),
	Et(44, "Estonian", "eesti, eesti keel", "et", "est", "est"),
	Ee(45, "Ewe", "Eʋegbe", "ee", "ewe", "ewe"),
	Fo(46, "Faroese", "føroyskt", "fo", "fao", "fao"),
	Fj(47, "Fijian", "vosa Vakaviti", "fj", "fij", "fij"),
	Fi(48, "Finnish", "suomi, suomen kieli", "fi", "fin", "fin"),
	Fr(49, "French", "Français", "fr", "fre", "fra"),
	Ff(50, "Fulah", "Fulfulde, Pulaar, Pular", "ff", "ful", "ful"),
	Gd(51, "Gaelic, Scottish Gaelic", "Gàidhlig", "gd", "gla", "gla"),
	Gl(52, "Galician", "Galego", "gl", "glg", "glg"),
	Lg(53, "Ganda", "Luganda", "lg", "lug", "lug"),
	Ka(54, "Georgian", "ქართული", "ka", "geo", "kat"),
	De(55, "German", "Deutsch", "de", "ger", "deu"),
	El(56, "Greek, Modern (1453–)", "ελληνικά", "el", "gre", "ell"),
	Gn(57, "Guarani", "Avañe'ẽ", "gn", "grn", "grn"),
	Gu(58, "Gujarati", "ગુજરાતી", "gu", "guj", "guj"),
	Ht(59, "Haitian, Haitian Creole", "Kreyòl ayisyen", "ht", "hat", "hat"),
	Ha(60, "Hausa", "(Hausa) هَوُسَ", "ha", "hau", "hau"),
	He(61, "Hebrew", "עברית", "he", "heb", "heb"),
	Hz(62, "Herero", "Otjiherero", "hz", "her", "her"),
	Hi(63, "Hindi", "हिन्दी, हिंदी", "hi", "hin", "hin"),
	Ho(64, "Hiri Motu", "Hiri Motu", "ho", "hmo", "hmo"),
	Hu(65, "Hungarian", "magyar", "hu", "hun", "hun"),
	Is(66, "Icelandic", "Íslenska", "is", "ice", "isl"),
	Io(67, "Ido", "Ido", "io", "ido", "ido"),
	Ig(68, "Igbo", "Asụsụ Igbo", "ig", "ibo", "ibo"),
	Id(69, "Indonesian", "Bahasa Indonesia", "id", "ind", "ind"),
	Ia(70, "Interlingua (International Auxiliary Language Association)", "Interlingua", "ia", "ina", "ina"),
	Ie(71, "Interlingue, Occidental", "(originally:) Occidental, (after WWII:) Interlingue", "ie", "ile", "ile"),
	Iu(72, "Inuktitut", "ᐃᓄᒃᑎᑐᑦ", "iu", "iku", "iku"),
	Ik(73, "Inupiaq", "Iñupiaq, Iñupiatun", "ik", "ipk", "ipk"),
	Ga(74, "Irish", "Gaeilge", "ga", "gle", "gle"),
	It(75, "Italian", "Italiano", "it", "ita", "ita"),
	Ja(76, "Japanese", "日本語 (にほんご)", "ja", "jpn", "jpn"),
	Jv(77, "Javanese", "ꦧꦱꦗꦮ, Basa Jawa", "jv", "jav", "jav"),
	Kl(78, "Kalaallisut, Greenlandic", "kalaallisut, kalaallit oqaasii", "kl", "kal", "kal"),
	Kn(79, "Kannada", "ಕನ್ನಡ", "kn", "kan", "kan"),
	Kr(80, "Kanuri", "Kanuri", "kr", "kau", "kau"),
	Ks(81, "Kashmiri", "कॉशुर, کٲشُر‎", "ks", "kas", "kas"),
	Kk(82, "Kazakh", "қазақ тілі", "kk", "kaz", "kaz"),
	Ki(83, "Kikuyu, Gikuyu", "Gĩkũyũ", "ki", "kik", "kik"),
	Rw(84, "Kinyarwanda", "Ikinyarwanda", "rw", "kin", "kin"),
	Ky(85, "Kirghiz, Kyrgyz", "Кыргызча, Кыргыз тили", "ky", "kir", "kir"),
	Kv(86, "Komi", "коми кыв", "kv", "kom", "kom"),
	Kg(87, "Kongo", "Kikongo", "kg", "kon", "kon"),
	Jo(88, "Korean", "한국어", "ko", "kor", "kor"),
	Kj(89, "Kuanyama, Kwanyama", "Kuanyama", "kj", "kua", "kua"),
	Ku(90, "Kurdish", "Kurdî, کوردی‎", "ku", "kur", "kur"),
	Lo(91, "Lao", "ພາສາລາວ", "lo", "lao", "lao"),
	La(92, "Latin", "latine, lingua latina", "la", "lat", "lat"),
	Lv(93, "Latvian", "latviešu valoda", "lv", "lav", "lav"),
	Li(94, "Limburgan, Limburger, Limburgish", "Limburgs", "li", "lim", "lim"),
	Ln(95, "Lingala", "Lingála", "ln", "lin", "lin"),
	Lt(96, "Lithuanian", "lietuvių kalba", "lt", "lit", "lit"),
	Lu(97, "Luba-Katanga", "Kiluba", "lu", "lub", "lub"),
	Lb(98, "Luxembourgish, Letzeburgesch", "Lëtzebuergesch", "lb", "ltz", "ltz"),
	Mk(99, "Macedonian", "македонски јазик", "mk", "mac", "mkd"),
	Mg(100, "Malagasy", "fiteny malagasy", "mg", "mlg", "mlg"),
	Ms(101, "Malay", "Bahasa Melayu, بهاس ملايو‎", "ms", "may", "msa"),
	Ml(102, "Malayalam", "മലയാളം", "ml", "mal", "mal"),
	Mt(103, "Maltese", "Malti", "mt", "mlt", "mlt"),
	Gv(104, "Manx", "Gaelg, Gailck", "gv", "glv", "glv"),
	Mi(105, "Maori", "te reo Māori", "mi", "mao", "mri"),
	Mr(106, "Marathi", "मराठी", "mr", "mar", "mar"),
	Mh(107, "Marshallese", "Kajin M̧ajeļ", "mh", "mah", "mah"),
	Mn(108, "Mongolian", "Монгол хэл", "mn", "mon", "mon"),
	Na(109, "Nauru", "Dorerin Naoero", "na", "nau", "nau"),
	Nv(110, "Navajo, Navaho", "Diné bizaad", "nv", "nav", "nav"),
	Ng(111, "Ndonga", "Owambo", "ng", "ndo", "ndo"),
	Ne(112, "Nepali", "नेपाली", "ne", "nep", "nep"),
	Nd(113, "North Ndebele", "isiNdebele", "nd", "nde", "nde"),
	Se(114, "Northern Sami", "Davvisámegiella", "se", "sme", "sme"),
	No(115, "Norwegian", "Norsk", "no", "nor", "nor"),
	Nb(116, "Norwegian Bokmål", "Norsk Bokmål", "nb", "nob", "nob"),
	Nn(117, "Norwegian Nynorsk", "Norsk Nynorsk", "nn", "nno", "nno"),
	Oc(118, "Occitan", "occitan, lenga d'òc", "oc", "oci", "oci"),
	Oj(119, "Ojibwa", "ᐊᓂᔑᓈᐯᒧᐎᓐ", "oj", "oji", "oji"),
	Or(120, "Oriya", "ଓଡ଼ିଆ", "or", "ori", "ori"),
	Om(121, "Oromo", "Afaan Oromoo", "om", "orm", "orm"),
	Os(122, "Ossetian, Ossetic", "ирон ӕвзаг", "os", "oss", "oss"),
	Pi(123, "Pali", "पालि, पाळि", "pi", "pli", "pli"),
	Ps(124, "Pashto, Pushto", "پښتو", "ps", "pus", "pus"),
	Fa(125, "Persian", "فارسی", "fa", "per", "fas"),
	Pl(126, "Polish", "język polski, polszczyzna", "pl", "pol", "pol"),
	Pa(128, "Punjabi, Panjabi", "ਪੰਜਾਬੀ, پنجابی‎", "pa", "pan", "pan"),
	Qu(129, "Quechua", "Runa Simi, Kichwa", "qu", "que", "que"),
	Ro(130, "Romanian, Moldavian, Moldovan", "Română, Moldovenească", "ro", "rum", "ron"),
	Rm(131, "Romansh", "Rumantsch Grischun", "rm", "roh", "roh"),
	Rn(132, "Rundi", "Ikirundi", "rn", "run", "run"),
	Ru(133, "Russian", "русский", "ru", "rus", "rus"),
	Sm(134, "Samoan", "gagana fa'a Samoa", "sm", "smo", "smo"),
	Sg(135, "Sango", "yângâ tî sängö", "sg", "sag", "sag"),
	Sa(136, "Sanskrit", "संस्कृतम्, 𑌸𑌂𑌸𑍍𑌕𑍃𑌤𑌮𑍍", "sa", "san", "san"),
	Sc(137, "Sardinian", "sardu", "sc", "srd", "srd"),
	Sr(138, "Serbian", "српски језик", "sr", "srp", "srp"),
	Sn(139, "Shona", "chiShona", "sn", "sna", "sna"),
	Ii(140, "Sichuan Yi, Nuosu", "ꆈꌠ꒿ Nuosuhxop", "ii", "iii", "iii"),
	Sd(141, "Sindhi", "सिंधी, سنڌي‎", "sd", "snd", "snd"),
	Si(142, "Sinhala, Sinhalese", "සිංහල", "si", "sin", "sin"),
	Sk(143, "Slovak", "Slovenčina, Slovenský jazyk", "sk", "slo", "slk"),
	Sl(144, "Slovenian", "Slovenski jezik, Slovenščina", "sl", "slv", "slv"),
	So(145, "Somali", "Soomaaliga, af Soomaali", "so", "som", "som"),
	Nr(146, "South Ndebele", "isiNdebele", "nr", "nbl", "nbl"),
	St(147, "Southern Sotho", "Sesotho", "st", "sot", "sot"),
	Es(148, "Spanish", "Español", "es", "spa", "spa"),
	Su(149, "Sundanese", "Basa Sunda", "su", "sun", "sun"),
	Sw(150, "Swahili", "Kiswahili", "sw", "swa", "swa"),
	Ss(151, "Swati", "SiSwati", "ss", "ssw", "ssw"),
	Sv(152, "Swedish", "Svenska", "sv", "swe", "swe"),
	Tl(153, "Tagalog", "Wikang Tagalog", "tl", "tgl", "tgl"),
	Ty(154, "Tahitian", "Reo Tahiti", "ty", "tah", "tah"),
	Tg(155, "Tajik", "тоҷикӣ, toçikī, تاجیکی‎", "tg", "tgk", "tgk"),
	Ta(156, "Tamil", "தமிழ்", "ta", "tam", "tam"),
	Tt(157, "Tatar", "татар теле, tatar tele", "tt", "tat", "tat"),
	Te(158, "Telugu", "తెలుగు", "te", "tel", "tel"),
	Th(159, "Thai", "ไทย", "th", "tha", "tha"),
	Bo(160, "Tibetan", "བོད་ཡིག", "bo", "tib", "bod"),
	Ti(161, "Tigrinya", "ትግርኛ", "ti", "tir", "tir"),
	To(162, "Tonga (Tonga Islands)", "Faka Tonga", "to", "ton", "ton"),
	Ts(163, "Tsonga", "Xitsonga", "ts", "tso", "tso"),
	Tn(164, "Tswana", "Setswana", "tn", "tsn", "tsn"),
	Tr(165, "Turkish", "Türkçe", "tr", "tur", "tur"),
	Tk(166, "Turkmen", "Türkmençe, Türkmen dili", "tk", "tuk", "tuk"),
	Tw(167, "Twi", "Twi", "tw", "twi", "twi"),
	Ug(168, "Uighur, Uyghur", "ئۇيغۇرچە‎, Uyghurche", "ug", "uig", "uig"),
	Uk(169, "Ukrainian", "Українська", "uk", "ukr", "ukr"),
	Ur(170, "Urdu", "اردو", "ur", "urd", "urd"),
	Uz(171, "Uzbek", "Oʻzbek, Ўзбек, أۇزبېك‎", "uz", "uzb", "uzb"),
	Ve(172, "Venda", "Tshivenḓa", "ve", "ven", "ven"),
	Vi(173, "Vietnamese", "Tiếng Việt", "vi", "vie", "vie"),
	Vo(174, "Volapük", "Volapük", "vo", "vol", "vol"),
	Wa(175, "Walloon", "Walon", "wa", "wln", "wln"),
	Cy(176, "Welsh", "Cymraeg", "cy", "wel", "cym"),
	Fy(177, "Western Frisian", "Frysk", "fy", "fry", "fry"),
	Wo(178, "Wolof", "Wollof", "wo", "wol", "wol"),
	Xh(179, "Xhosa", "isiXhosa", "xh", "xho", "xho"),
	Yi(180, "Yiddish", "ייִדיש", "yi", "yid", "yid"),
	Yo(181, "Yoruba", "Yorùbá", "yo", "yor", "yor"),
	Za(182, "Zhuang, Chuang", "Saɯ cueŋƅ, Saw cuengh", "za", "zha", "zha"),
	Zu(183, "Zulu", "isiZulu", "zu", "zul", "zul"),
	NotFound(0, null, null, null, null, null);
	
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
	private String nativeName;
	
	/**
	 * 
	 */
	private String iso6391;
	
	/**
	 * 
	 */
	private String iso6392B;
	
	/**
	 * 
	 */
	private String iso6392T;
	
	/**
	 * 
	 */
	private Languages(int id, String name, String nativeName, String iso6391, String iso6392B, String iso6392T) {
		this.id = id;;
		this.name = name;
		this.nativeName = nativeName;
		this.iso6391 = iso6391;
		this.iso6392B = iso6392B;
		this.iso6392T = iso6392T;
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
	 * @return the nativeName
	 */
	public String getNativeName() {
		return nativeName;
	}

	/**
	 * @return the iso6391
	 */
	public String getIso6391() {
		return iso6391;
	}

	/**
	 * @return the iso6392B
	 */
	public String getIso6392B() {
		return iso6392B;
	}

	/**
	 * @return the iso6392T
	 */
	public String getIso6392T() {
		return iso6392T;
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public static Languages getById(String id) {
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
	public static Languages getById(int id) {
		for (Languages language : values()) {
			if (language != NotFound) {
				if (language.getId() == id) {
					return language;
				}
			}
		}
		return NotFound;
	}
	
	/**
	 * 
	 * @param language
	 * @return
	 */
	public static Languages getByCodeOrId(String value) {
		if (StringUtils.isEmpty(value)) {
			return NotFound;
		}
		
		if (StringUtils.isNumeric(value)) {
			return getById(value);
		}
		
		return getByCode(value);
	}
	
	/**
	 * 
	 * @param code
	 * @return
	 */
	public static Languages getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (Languages language : values()) {
			if (language != NotFound) {
				if (language.getIso6391().equalsIgnoreCase(code)
						|| language.getIso6392B().equalsIgnoreCase(code)
						|| language.getIso6392T().equalsIgnoreCase(code)) {
					return language;
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
			+ ", \"nativeName\": \"" + this.getNativeName() + "\""
			+ ", \"iso6391\": \"" + this.getIso6391() + "\""
			+ ", \"iso6392B\": \"" + this.getIso6392B() + "\""
			+ ", \"iso6392T\": \"" + this.getIso6392T() + "\" }";
	}
	
	/**
	 * List all currencies on json
	 * @return
	 */
	public static String toJsonList() {
		String response = StringUtils.EMPTY;
		for (Languages languagee : values()) {
			if (languagee != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + languagee.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
