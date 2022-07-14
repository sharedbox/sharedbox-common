package br.com.sharedbox.common.location;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 03/04/2022 - Version 1.0.0
 */
public enum Languages {
	Pt("Portuguese", "Português", "pt", "por", "por"),
	Ab("Abkhazian", "аҧсуа бызшәа, аҧсшәа", "ab", "abk", "abk"),
	Aa("Afar", "Afaraf", "aa", "aar", "aar"),
	Af("Afrikaans", "Afrikaans", "af", "afr", "afr"),
	Ak("Akan", "Akan", "ak", "aka", "aka"),
	Sq("Albanian", "Shqip", "sq", "alb", "sqi"),
	Am("Amharic", "አማርኛ", "am", "amh", "amh"),
	Ar("Arabic", "العربية", "ar", "ara", "ara"),
	An("Aragonese", "aragonés", "an", "arg", "arg"),
	Hy("Armenian", "Հայերեն", "hy", "arm", "hye"),
	As("Assamese", "অসমীয়া", "as", "asm", "asm"),
	Av("Avaric", "авар мацӀ, магӀарул мацӀ", "av", "ava", "ava"),
	Ae("Avestan", "avesta", "ae", "ave", "ave"),
	Ay("Aymara", "aymar aru", "ay", "aym", "aym"),
	Az("Azerbaijani", "azərbaycan dili, تۆرکجه", "az", "aze", "aze"),
	Bm("Bambara", "bamanankan", "bm", "bam", "bam"),
	Ba("Bashkir", "башҡорт теле", "ba", "bak", "bak"),
	Eu("Basque", "euskara, euskera", "eu", "baq", "eus"),
	Be("Belarusian", "беларуская мова", "be", "bel", "bel"),
	Bn("Bengali", "বাংলা", "bn", "ben", "ben"),
	Bi("Bislama", "Bislama", "bi", "bis", "bis"),
	Bs("Bosnian", "bosanski jezik", "bs", "bos", "bos"),
	Br("Breton", "brezhoneg", "br", "bre", "bre"),
	Bg("Bulgarian", "български език", "bg", "bul", "bul"),
	My("Burmese", "ဗမာစာ", "my", "bur", "mya"),
	Ca("Catalan, Valencian", "català, valencià", "ca", "cat", "cat"),
	Km("Central Khmer", "ខ្មែរ, ខេមរភាសា, ភាសាខ្មែរ", "km", "khm", "khm"),
	Ch("Chamorro", "Chamoru", "ch", "cha", "cha"),
	Ce("Chechen", "нохчийн мотт", "ce", "che", "che"),
	Ny("Chichewa, Chewa, Nyanja", "chiCheŵa, chinyanja", "ny", "nya", "nya"),
	Zh("Chinese", "中文 (Zhōngwén), 汉语, 漢語", "zh", "chi", "zho"),
	Cu("Church Slavic, Old Slavonic, Church Slavonic, Old Bulgarian, Old Church Slavonic", "ѩзыкъ словѣньскъ", "cu", "chu", "chu"),
	Cv("Chuvash", "чӑваш чӗлхи", "cv", "chv", "chv"),
	Kw("Cornish", "Kernewek", "kw", "cor", "cor"),
	Co("Corsican", "corsu, lingua corsa", "co", "cos", "cos"),
	Cr("Cree", "ᓀᐦᐃᔭᐍᐏᐣ", "cr", "cre", "cre"),
	Hr("Croatian", "hrvatski jezik", "hr", "hrv", "hrv"),
	Cs("Czech", "čeština, český jazyk", "cs", "cze", "ces"),
	Da("Danish", "dansk", "da", "dan", "dan"),
	Dv("Divehi, Dhivehi, Maldivian", "ދިވެހި", "dv", "div", "div"),
	Nl("Dutch, Flemish", "Nederlands, Vlaams", "nl", "dut", "nld"),
	Dz("Dzongkha", "རྫོང་ཁ", "dz", "dzo", "dzo"),
	En("English", "English", "en", "eng", "eng"),
	Eo("Esperanto", "Esperanto", "eo", "epo", "epo"),
	Et("Estonian", "eesti, eesti keel", "et", "est", "est"),
	Ee("Ewe", "Eʋegbe", "ee", "ewe", "ewe"),
	Fo("Faroese", "føroyskt", "fo", "fao", "fao"),
	Fj("Fijian", "vosa Vakaviti", "fj", "fij", "fij"),
	Fi("Finnish", "suomi, suomen kieli", "fi", "fin", "fin"),
	Fr("French", "Français", "fr", "fre", "fra"),
	Ff("Fulah", "Fulfulde, Pulaar, Pular", "ff", "ful", "ful"),
	Gd("Gaelic, Scottish Gaelic", "Gàidhlig", "gd", "gla", "gla"),
	Gl("Galician", "Galego", "gl", "glg", "glg"),
	Lg("Ganda", "Luganda", "lg", "lug", "lug"),
	Ka("Georgian", "ქართული", "ka", "geo", "kat"),
	De("German", "Deutsch", "de", "ger", "deu"),
	El("Greek, Modern (–)", "ελληνικά", "el", "gre", "ell"),
	Gn("Guarani", "Avañe'ẽ", "gn", "grn", "grn"),
	Gu("Gujarati", "ગુજરાતી", "gu", "guj", "guj"),
	Ht("Haitian, Haitian Creole", "Kreyòl ayisyen", "ht", "hat", "hat"),
	Ha("Hausa", "(Hausa) هَوُسَ", "ha", "hau", "hau"),
	He("Hebrew", "עברית", "he", "heb", "heb"),
	Hz("Herero", "Otjiherero", "hz", "her", "her"),
	Hi("Hindi", "हिन्दी, हिंदी", "hi", "hin", "hin"),
	Ho("Hiri Motu", "Hiri Motu", "ho", "hmo", "hmo"),
	Hu("Hungarian", "magyar", "hu", "hun", "hun"),
	Is("Icelandic", "Íslenska", "is", "ice", "isl"),
	Io("Ido", "Ido", "io", "ido", "ido"),
	Ig("Igbo", "Asụsụ Igbo", "ig", "ibo", "ibo"),
	Id("Indonesian", "Bahasa Indonesia", "id", "ind", "ind"),
	Ia("Interlingua (International Auxiliary Language Association)", "Interlingua", "ia", "ina", "ina"),
	Ie("Interlingue, Occidental", "(originally:) Occidental, (after WWII:) Interlingue", "ie", "ile", "ile"),
	Iu("Inuktitut", "ᐃᓄᒃᑎᑐᑦ", "iu", "iku", "iku"),
	Ik("Inupiaq", "Iñupiaq, Iñupiatun", "ik", "ipk", "ipk"),
	Ga("Irish", "Gaeilge", "ga", "gle", "gle"),
	It("Italian", "Italiano", "it", "ita", "ita"),
	Ja("Japanese", "日本語 (にほんご)", "ja", "jpn", "jpn"),
	Jv("Javanese", "ꦧꦱꦗꦮ, Basa Jawa", "jv", "jav", "jav"),
	Kl("Kalaallisut, Greenlandic", "kalaallisut, kalaallit oqaasii", "kl", "kal", "kal"),
	Kn("Kannada", "ಕನ್ನಡ", "kn", "kan", "kan"),
	Kr("Kanuri", "Kanuri", "kr", "kau", "kau"),
	Ks("Kashmiri", "कॉशुर, کٲشُر‎", "ks", "kas", "kas"),
	Kk("Kazakh", "қазақ тілі", "kk", "kaz", "kaz"),
	Ki("Kikuyu, Gikuyu", "Gĩkũyũ", "ki", "kik", "kik"),
	Rw("Kinyarwanda", "Ikinyarwanda", "rw", "kin", "kin"),
	Ky("Kirghiz, Kyrgyz", "Кыргызча, Кыргыз тили", "ky", "kir", "kir"),
	Kv("Komi", "коми кыв", "kv", "kom", "kom"),
	Kg("Kongo", "Kikongo", "kg", "kon", "kon"),
	Jo("Korean", "한국어", "ko", "kor", "kor"),
	Kj("Kuanyama, Kwanyama", "Kuanyama", "kj", "kua", "kua"),
	Ku("Kurdish", "Kurdî, کوردی‎", "ku", "kur", "kur"),
	Lo("Lao", "ພາສາລາວ", "lo", "lao", "lao"),
	La("Latin", "latine, lingua latina", "la", "lat", "lat"),
	Lv("Latvian", "latviešu valoda", "lv", "lav", "lav"),
	Li("Limburgan, Limburger, Limburgish", "Limburgs", "li", "lim", "lim"),
	Ln("Lingala", "Lingála", "ln", "lin", "lin"),
	Lt("Lithuanian", "lietuvių kalba", "lt", "lit", "lit"),
	Lu("Luba-Katanga", "Kiluba", "lu", "lub", "lub"),
	Lb("Luxembourgish, Letzeburgesch", "Lëtzebuergesch", "lb", "ltz", "ltz"),
	Mk("Macedonian", "македонски јазик", "mk", "mac", "mkd"),
	Mg("Malagasy", "fiteny malagasy", "mg", "mlg", "mlg"),
	Ms("Malay", "Bahasa Melayu, بهاس ملايو‎", "ms", "may", "msa"),
	Ml("Malayalam", "മലയാളം", "ml", "mal", "mal"),
	Mt("Maltese", "Malti", "mt", "mlt", "mlt"),
	Gv("Manx", "Gaelg, Gailck", "gv", "glv", "glv"),
	Mi("Maori", "te reo Māori", "mi", "mao", "mri"),
	Mr("Marathi", "मराठी", "mr", "mar", "mar"),
	Mh("Marshallese", "Kajin M̧ajeļ", "mh", "mah", "mah"),
	Mn("Mongolian", "Монгол хэл", "mn", "mon", "mon"),
	Na("Nauru", "Dorerin Naoero", "na", "nau", "nau"),
	Nv("Navajo, Navaho", "Diné bizaad", "nv", "nav", "nav"),
	Ng("Ndonga", "Owambo", "ng", "ndo", "ndo"),
	Ne("Nepali", "नेपाली", "ne", "nep", "nep"),
	Nd("North Ndebele", "isiNdebele", "nd", "nde", "nde"),
	Se("Northern Sami", "Davvisámegiella", "se", "sme", "sme"),
	No("Norwegian", "Norsk", "no", "nor", "nor"),
	Nb("Norwegian Bokmål", "Norsk Bokmål", "nb", "nob", "nob"),
	Nn("Norwegian Nynorsk", "Norsk Nynorsk", "nn", "nno", "nno"),
	Oc("Occitan", "occitan, lenga d'òc", "oc", "oci", "oci"),
	Oj("Ojibwa", "ᐊᓂᔑᓈᐯᒧᐎᓐ", "oj", "oji", "oji"),
	Or("Oriya", "ଓଡ଼ିଆ", "or", "ori", "ori"),
	Om("Oromo", "Afaan Oromoo", "om", "orm", "orm"),
	Os("Ossetian, Ossetic", "ирон ӕвзаг", "os", "oss", "oss"),
	Pi("Pali", "पालि, पाळि", "pi", "pli", "pli"),
	Ps("Pashto, Pushto", "پښتو", "ps", "pus", "pus"),
	Fa("Persian", "فارسی", "fa", "per", "fas"),
	Pl("Polish", "język polski, polszczyzna", "pl", "pol", "pol"),
	Pa("Punjabi, Panjabi", "ਪੰਜਾਬੀ, پنجابی‎", "pa", "pan", "pan"),
	Qu("Quechua", "Runa Simi, Kichwa", "qu", "que", "que"),
	Ro("Romanian, Moldavian, Moldovan", "Română, Moldovenească", "ro", "rum", "ron"),
	Rm("Romansh", "Rumantsch Grischun", "rm", "roh", "roh"),
	Rn("Rundi", "Ikirundi", "rn", "run", "run"),
	Ru("Russian", "русский", "ru", "rus", "rus"),
	Sm("Samoan", "gagana fa'a Samoa", "sm", "smo", "smo"),
	Sg("Sango", "yângâ tî sängö", "sg", "sag", "sag"),
	Sa("Sanskrit", "संस्कृतम्, 𑌸𑌂𑌸𑍍𑌕𑍃𑌤𑌮𑍍", "sa", "san", "san"),
	Sc("Sardinian", "sardu", "sc", "srd", "srd"),
	Sr("Serbian", "српски језик", "sr", "srp", "srp"),
	Sn("Shona", "chiShona", "sn", "sna", "sna"),
	Ii("Sichuan Yi, Nuosu", "ꆈꌠ꒿ Nuosuhxop", "ii", "iii", "iii"),
	Sd("Sindhi", "सिंधी, سنڌي‎", "sd", "snd", "snd"),
	Si("Sinhala, Sinhalese", "සිංහල", "si", "sin", "sin"),
	Sk("Slovak", "Slovenčina, Slovenský jazyk", "sk", "slo", "slk"),
	Sl("Slovenian", "Slovenski jezik, Slovenščina", "sl", "slv", "slv"),
	So("Somali", "Soomaaliga, af Soomaali", "so", "som", "som"),
	Nr("South Ndebele", "isiNdebele", "nr", "nbl", "nbl"),
	St("Southern Sotho", "Sesotho", "st", "sot", "sot"),
	Es("Spanish", "Español", "es", "spa", "spa"),
	Su("Sundanese", "Basa Sunda", "su", "sun", "sun"),
	Sw("Swahili", "Kiswahili", "sw", "swa", "swa"),
	Ss("Swati", "SiSwati", "ss", "ssw", "ssw"),
	Sv("Swedish", "Svenska", "sv", "swe", "swe"),
	Tl("Tagalog", "Wikang Tagalog", "tl", "tgl", "tgl"),
	Ty("Tahitian", "Reo Tahiti", "ty", "tah", "tah"),
	Tg("Tajik", "тоҷикӣ, toçikī, تاجیکی‎", "tg", "tgk", "tgk"),
	Ta("Tamil", "தமிழ்", "ta", "tam", "tam"),
	Tt("Tatar", "татар теле, tatar tele", "tt", "tat", "tat"),
	Te("Telugu", "తెలుగు", "te", "tel", "tel"),
	Th("Thai", "ไทย", "th", "tha", "tha"),
	Bo("Tibetan", "བོད་ཡིག", "bo", "tib", "bod"),
	Ti("Tigrinya", "ትግርኛ", "ti", "tir", "tir"),
	To("Tonga (Tonga Islands)", "Faka Tonga", "to", "ton", "ton"),
	Ts("Tsonga", "Xitsonga", "ts", "tso", "tso"),
	Tn("Tswana", "Setswana", "tn", "tsn", "tsn"),
	Tr("Turkish", "Türkçe", "tr", "tur", "tur"),
	Tk("Turkmen", "Türkmençe, Türkmen dili", "tk", "tuk", "tuk"),
	Tw("Twi", "Twi", "tw", "twi", "twi"),
	Ug("Uighur, Uyghur", "ئۇيغۇرچە‎, Uyghurche", "ug", "uig", "uig"),
	Uk("Ukrainian", "Українська", "uk", "ukr", "ukr"),
	Ur("Urdu", "اردو", "ur", "urd", "urd"),
	Uz("Uzbek", "Oʻzbek, Ўзбек, أۇزبېك‎", "uz", "uzb", "uzb"),
	Ve("Venda", "Tshivenḓa", "ve", "ven", "ven"),
	Vi("Vietnamese", "Tiếng Việt", "vi", "vie", "vie"),
	Vo("Volapük", "Volapük", "vo", "vol", "vol"),
	Wa("Walloon", "Walon", "wa", "wln", "wln"),
	Cy("Welsh", "Cymraeg", "cy", "wel", "cym"),
	Fy("Western Frisian", "Frysk", "fy", "fry", "fry"),
	Wo("Wolof", "Wollof", "wo", "wol", "wol"),
	Xh("Xhosa", "isiXhosa", "xh", "xho", "xho"),
	Yi("Yiddish", "ייִדיש", "yi", "yid", "yid"),
	Yo("Yoruba", "Yorùbá", "yo", "yor", "yor"),
	Za("Zhuang, Chuang", "Saɯ cueŋƅ, Saw cuengh", "za", "zha", "zha"),
	Zu("Zulu", "isiZulu", "zu", "zul", "zul"),
	NotFound(null, null, null, null, null);
	
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
	private String code;
	
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
	private Languages(String name, String nativeName, String code, String iso6392B, String iso6392T) {
		this.name = name;
		this.nativeName = nativeName;
		this.code = code;
		this.iso6392B = iso6392B;
		this.iso6392T = iso6392T;
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
	public String getCode() {
		return code;
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
	 * @param code
	 * @return
	 */
	public static Languages getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for (Languages language : values()) {
			if (language != NotFound) {
				if (language.getCode().equalsIgnoreCase(code)
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
		return "{ \"name\": \"" + this.getName() + "\""
			+ ", \"nativeName\": \"" + this.getNativeName() + "\""
			+ ", \"code\": \"" + this.getCode() + "\""
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
