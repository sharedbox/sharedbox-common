package com.sharedbox.common.location;

import java.nio.charset.Charset;

import com.sharedbox.common.utils.JsonUtils;
import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 08/05/2021 - version 1.0.0
 */
public enum Countries {
	NotFound(null, null, null, null, null, null, null, null, false, false, null, 0, null, null, null),
	Andorra("AD", "Andorra", "Andorra", "376", "037", "0370", "AND", "020", false, false, "Q228", 20, "EU", new String[] { "EUR" }, new String[] { "ca" }),
	UnitedArabEmirates("AE", "United Arab Emirates", "الإمارات العربية المتحدة", "971", "244", "2445", "ARE", "784", false, false, "Q878", 784, "AS", new String[] { "AED" }, new String[] { "ar" }),
	Afghanistan("AF", "Afghanistan", "افغانستان", "93", "013", "0132", "AFG", "004", false, false, "Q889", 4, "AS", new String[] { "AFN" }, new String[] { "fa", "ps" }),
	AntiguaAndBarbuda("AG", "Antigua and Barbuda", "Antigua and Barbuda", "1 268", "043", "0434", "ATG", "028", false, false, "Q781", 28, "AM", new String[] { "XCD" }, new String[] { "en" }),
	Albania("AL", "Albania", "Shqipëria", "355", "017", "0175", "ALB", "008", false, false, "Q222", 8, "EU", new String[] { "ALL" }, new String[] { "sq" }),
	Armenia("AM", "Armenia", "Հայաստան", "374", "064", "0647", "ARM", "051", false, false, "Q399", 51, "AS", new String[] { "AMD" }, new String[] { "hy" }),
	Angola("AO", "Angola", "Angola", "244", "040", "0400", "AGO", "024", false, false, "Q916", 24, "AF", new String[] { "AOA" }, new String[] { "pt" }),
	Argentina("AR", "Argentina", "Argentina", "54", "063", "0639", "ARG", "032", true, false, "Q414", 32, "AM", new String[] { "ARS" }, new String[] { "es" }),
	Austria("AT", "Austria", "Österreich", "43", "072", "0728", "AUT", "040", false, true, "Q40", 40, "EU", new String[] { "EUR" }, new String[] { "de" }),
	Australia("AU", "Australia", "Australia", "61", "069", "0698", "AUS", "036", false, false, "Q408", 36, "OC", new String[] { "AUD" }, new String[] { "en" }),
	Azerbaijan("AZ", "Azerbaijan", "Azərbaycan", "994", null, null, "AZE", "031", false, false, "Q227", 31, "AS", new String[] { "AZN" }, new String[] { "az" }),
	BosniaAndHerzegovina("BA", "Bosnia and Herzegovina", "Bosna i Hercegovina", "387", null, null, "BIH", "070", false, false, "Q225", 70, "EU", new String[] { "BAM" }, new String[] { "bs", "hr", "sr" }),
	Barbados("BB", "Barbados", "Barbados", "1 246", "083", "0833", "BRB", "052", false, false, "Q244", 52, "AM", new String[] { "BBD" }, new String[] { "en" }),
	Bangladesh("BD", "Bangladesh", "বাংলাদেশ", "880", "081", "0817", "BGD", "050", false, false, "Q902", 50, "AS", new String[] { "BDT" }, new String[] { "bn" }),
	Belgium("BE", "Belgium", "België", "32", "087", "0876", "BEL", "056", false, true, "Q31", 56, "EU", new String[] { "EUR" }, new String[] { "fr", "de", "nl", "fr" }),
	BurkinaFaso("BF", "Burkina Faso", "Burkina Faso", "226", "031", "0310", "BFA", "854", false, false, "Q965", 854, "AF", new String[] { "XOF" }, new String[] { "fr" }),
	Bulgaria("BG", "Bulgaria", "България", "359", "111", "1112", "BGR", "100", false, false, "Q219", 100, "EU", new String[] { "BGN" }, new String[] { "bg" }),
	Bahrain("BH", "Bahrain", "البحرين", "973", "080", "0809", "BHR", "048", false, false, "Q398", 48, "AS", new String[] { "BHD" }, new String[] { "ar" }),
	Burundi("BI", "Burundi", "Burundi", "257", "115", "1155", "BDI", "108", false, false, "Q967", 108, "AF", new String[] { "BIF" }, new String[] { "fr" }),
	Benin("BJ", "Benin", "Bénin", "229", "229", "2291", "BEN", "204", false, false, "Q962", 204, "AF", new String[] { "XOF" }, new String[] { "fr" }),
	Brunei("BN", "Brunei", "Brunei", "673", "108", "1082", "BRN", "096", false, false, "Q921", 96, "AS", new String[] { "BND" }, new String[] { "ms" }),
	Bolivia("BO", "Bolivia", "Bolivia", "591", "097", "0973", "BOL", "068", false, false, "Q750", 68, "AM", new String[] { "BOB" }, new String[] { "gn", "ay", "es", "qu" }),
	Brazil("BR", "Brazil", "Brasil", "55", "105", "1058", "BRA", "076", true, false, "Q155", 76, "AM", new String[] { "BRL" }, new String[] { "pt" }),
	Bahamas("BS", "The Bahamas", "The Bahamas", "1 242", null, null, "BHS", "044", false, false, "Q778", 44, "AM", new String[] { "BSD" }, new String[] { "en" }),
	Bhutan("BT", "Bhutan", "Bhutan", "975", "119", "1198", "BTN", "064", false, false, "Q917", 64, "AS", new String[] { "BTN" }, new String[] { "dz" }),
	Botswana("BW", "Botswana", "Botswana", "267", "101", "1015", "BWA", "072", false, false, "Q963", 72, "AF", new String[] { "BWP" }, new String[] { "en", "tn" }),
	Belarus("BY", "Belarus", "Беларусь", "375", "085", "0850", "BLR", "112", false, false, "Q184", 112, "EU", new String[] { "BYN" }, new String[] { "be", "ru" }),
	Belize("BZ", "Belize", "Belize", "501", "088", "0884", "BLZ", "084", false, false, "Q242", 84, "AM", new String[] { "BZD" }, new String[] { "en" }),
	Canada("CA", "Canada", "Canada", "1", "149", "1490", "CAN", "124", false, false, "Q16", 124, "AM", new String[] { "CAD" }, new String[] { "en", "fr" }),
	DemocraticRepublicOfTheCongo("CD", "Democratic Republic of the Congo", "République Démocratique du Congo", "243", "888", "8885", "COD", "180", false, false, "Q974", 180, "AF", new String[] { "CDF" }, new String[] { "fr" }),
	CentralAfricanRepublic("CF", "Central African Republic", "République centrafricaine", "236", null, null, "CAF", "140", false, false, "Q929", 140, "AF", new String[] { "XAF" }, new String[] { "sg", "fr" }),
	RepublicOfTheCongo("CG", "Republic of the Congo", "République du Congo", "242", "177", "1775", "COG", "178", false, false, "Q971", 178, "AF", new String[] { "XAF" }, new String[] { "fr" }),
	Switzerland("CH", "Switzerland", "Schweiz", "41", "767", "7676", "CHE", "756", false, false, "Q39", 756, "EU", new String[] { "CHF" }, new String[] { "fr", "it", "rm", "de" }),
	CtedIvoire("CI", "Côte d'Ivoire", "Côte d'Ivoire", "225", "193", "1937", "CIV", "384", false, false, "Q1008", 384, "AF", new String[] { "XOF" }, new String[] { "fr" }),
	Chile("CL", "Chile", "Chile", "56", "158", "1589", "CHL", "152", true, false, "Q298", 152, "AM", new String[] { "CLP" }, new String[] { "es" }),
	Cameroon("CM", "Cameroon", "Cameroun", "237", "145", "1457", "CMR", "120", false, false, "Q1009", 120, "AF", new String[] { "XAF" }, new String[] { "fr", "en" }),
	PeoplesRepublicOfChina("CN", "People's Republic of China", "中华人民共和国", "86", "160", "1600", "CHN", "156", false, false, "Q148", 156, "AS", new String[] { "CNY" }, new String[] { "zh" }),
	Colombia("CO", "Colombia", "Colombia", "57", "169", "1694", "COL", "170", true, false, "Q739", 170, "AM", new String[] { "COP" }, new String[] { "es" }),
	CostaRica("CR", "Costa Rica", "Costa Rica", "506", "196", "1961", "CRI", "188", false, false, "Q800", 188, "AM", new String[] { "CRC" }, new String[] { "es" }),
	Cuba("CU", "Cuba", "Cuba", "53", "199", "1996", "CUB", "192", false, false, "Q241", 192, "AM", new String[] { "CUC", "CUP" }, new String[] { "es" }),
	CapeVerde("CV", "Cape Verde", "cabo Verde", "238", "127", "1279", "CPV", "132", false, false, "Q1011", 132, "AF", new String[] { "CVE" }, new String[] { "pt" }),
	Cyprus("CY", "Cyprus", "Κύπρος", "357", "163", "1635", "CYP", "196", false, true, "Q229", 196, "AS", new String[] { "EUR" }, new String[] { "el", "tr" }),
	CzechRepublic("CZ", "Czech Republic", "Česká republika", "420", "791", "7919", "CZE", "203", false, false, "Q213", 203, "EU", new String[] { "CZK" }, new String[] { "cs" }),
	Germany("DE", "Germany", "Deutschland", "49", "023", "0230", "DEU", "276", false, true, "Q183", 276, "EU", new String[] { "EUR" }, new String[] { "de" }),
	Djibouti("DJ", "Djibouti", "Djibouti", "253", "783", "7838", "DJI", "262", false, false, "Q977", 262, "AF", new String[] { "DJF" }, new String[] { "ar", "so", "aa", "fr" }),
	Denmark("DK", "Denmark", "Danmark", "45", "232", "2321", "DNK", "208", false, false, "Q35", 208, "EU", new String[] { "DKK" }, new String[] { "da" }),
	Dominica("DM", "Dominica", "Dominica", "1 767", "235", "2356", "DMA", "212", false, false, "Q784", 212, "AM", new String[] { "XCD" }, new String[] { "en" }),
	DominicanRepublic("DO", "Dominican Republic", "República Dominicana", "1 809", "647", "6475", "DOM", "214", false, false, "Q786", 214, "AM", new String[] { "DOP" }, new String[] { "es" }),
	Algeria("DZ", "Algeria", "الجزائر", "213", "059", "0590", "DZA", "012", false, false, "Q262", 12, "AF", new String[] { "DZD" }, new String[] { "ar" }),
	Ecuador("EC", "Ecuador", "Ecuador", "593", "239", "2399", "ECU", "218", true, false, "Q736", 218, "AM", new String[] { "USD" }, new String[] { "es" }),
	Estonia("EE", "Estonia", "Eesti", "372", "251", "2518", "EST", "233", false, false, "Q191", 233, "EU", new String[] { "EUR" }, new String[] { "et" }),
	Egypt("EG", "Egypt", "مصر", "20", "240", "2402", "EGY", "818", false, false, "Q79", 818, "AF", new String[] { "EGP" }, new String[] { "ar" }),
	Eritrea("ER", "Eritrea", "Eritrea", "291", "243", "2437", "ERI", "232", false, false, "Q986", 232, "AF", new String[] { "ERN" }, new String[] { "ti", "ar", "en" }),
	Spain("ES", "Spain", "España", "34", "245", "2453", "ESP", "724", false, true, "Q29", 724, "EU", new String[] { "EUR" }, new String[] { "ca", "es", "eu", "gl" }),
	Ethiopia("ET", "Ethiopia", "ኢትዮጵያ", "251", "253", "2534", "ETH", "231", false, false, "Q115", 231, "AF", new String[] { "ETB" }, new String[] { "am", "om" }),
	Finland("FI", "Finland", "Suomi", "358", "271", "2712", "FIN", "246", false, true, "Q33", 246, "EU", new String[] { "EUR" }, new String[] { "fi", "sv", "se" }),
	Fiji("FJ", "Fiji", "Fiji", "679", "870", "8702", "FJI", "242", false, false, "Q712", 242, "OC", new String[] { "FJD" }, new String[] { "en" }),
	FederatedStatesOfMicronesia("FM", "Federated States of Micronesia", "Federated States of Micronesia", "691", "499", "4995", "FSM", "583", false, false, "Q702", 583, "OC", new String[] { "USD" }, new String[] { "en" }),
	France("FR", "France", "France", "33", "275", "2755", "FRA", "250", false, true, "Q142", 250, "EU", new String[] { "EUR" }, new String[] { "fr" }),
	Gabon("GA", "Gabon", "Gabon", "241", "281", "2810", "GAB", "266", false, false, "Q1000", 266, "AF", new String[] { "XAF" }, new String[] { "fr" }),
	UnitedKingdom("GB", "United Kingdom", "United Kingdom", "44", "628", "6289", "GBR", "826", false, false, "Q145", 826, "EU", new String[] { "GBP" }, new String[] { "en", "ga", "cy", "gd", "kw" }),
	Grenada("GD", "Grenada", "Grenada", "1 473", "297", "2976", "GRD", "308", false, false, "Q769", 308, "AM", new String[] { "XCD" }, new String[] { "en" }),
	Georgia("GE", "Georgia", "საქართველოს", "995", "291", "2917", "GEO", "268", false, false, "Q230", 268, "AS", new String[] { "GEL" }, new String[] { "ka" }),
	Ghana("GH", "Ghana", "Ghana", "233", "289", "2895", "GHA", "288", false, false, "Q117", 288, "AF", new String[] { "GHS" }, new String[] { "en" }),
	TheGambia("GM", "The Gambia", "The Gambia", "220", "285", "2852", "GMB", "270", false, false, "Q1005", 270, "AF", new String[] { "GMD" }, new String[] { "en" }),
	Guinea("GN", "Guinea", "Guinée", "224", "329", "3298", "GIN", "324", false, false, "Q1006", 324, "AF", new String[] { "GNF" }, new String[] { "fr" }),
	EquatorialGuinea("GQ", "Equatorial Guinea", "Guinea Ecuatorial", "240", null, null, "GNQ", "226", false, false, "Q983", 226, "AF", new String[] { "XAF" }, new String[] { "fr", "pt", "es" }),
	Greece("GR", "Greece", "Ελλάδα", "30", "301", "3018", "GRC", "300", false, true, "Q41", 300, "EU", new String[] { "EUR" }, new String[] { "el" }),
	Guatemala("GT", "Guatemala", "Guatemala", "502", "317", "3174", "GTM", "320", false, false, "Q774", 320, "AM", new String[] { "GTQ" }, new String[] { "es" }),
	GuineaBissau("GW", "Guinea-Bissau", "Guiné-Bissau", "245", "334", "3344", "GNB", "624", false, false, "Q1007", 624, "AF", new String[] { "XOF" }, new String[] { "pt" }),
	Guyana("GY", "Guyana", "Guyana", "592", "337", "3379", "GUY", "328", true, false, "Q734", 328, "AM", new String[] { "GYD" }, new String[] { "en" }),
	Honduras("HN", "Honduras", "Honduras", "504", "345", "3450", "HND", "340", false, false, "Q783", 340, "AM", new String[] { "HNL" }, new String[] { "es" }),
	Croatia("HR", "Croatia", "Hrvatska", "385", "195", "1953", "HRV", "191", false, false, "Q224", 191, "EU", new String[] { "HRK" }, new String[] { "hr" }),
	Haiti("HT", "Haiti", "Ayiti", "509", "341", "3417", "HTI", "332", false, false, "Q790", 332, "AM", new String[] { "HTG" }, new String[] { "ht", "fr" }),
	Hungary("HU", "Hungary", "Magyarország", "36", "355", "3557", "HUN", "348", false, false, "Q28", 348, "EU", new String[] { "HUF" }, new String[] { "hu" }),
	Indonesia("ID", "Indonesia", "Indonesia", "62", "365", "3654", "IDN", "360", false, false, "Q252", 360, "AS", new String[] { "IDR" }, new String[] { "id" }),
	Ireland("IE", "Ireland", "Éireann", "353", "375", "3751", "IRL", "372", false, true, "Q27", 372, "EU", new String[] { "EUR" }, new String[] { "en", "ga" }),
	Israel("IL", "Israel", "ישראל", "972", "383", "3832", "ISR", "376", false, false, "Q801", 376, "AS", new String[] { "ILS" }, new String[] { "he" }),
	India("IN", "India", "India", "91", "361", "3611", "IND", "356", false, false, "Q668", 356, "AS", new String[] { "INR" }, new String[] { "hi", "en" }),
	Iraq("IQ", "Iraq", "العراق", "964", "369", "3697", "IRQ", "368", false, false, "Q796", 368, "AS", new String[] { "IQD" }, new String[] { "ku", "ar" }),
	Iran("IR", "Iran", "ایران", "98", "372", "3727", "IRN", "364", false, false, "Q794", 364, "AS", new String[] { "IRR" }, new String[] { "fa" }),
	Iceland("IS", "Iceland", "Ísland", "354", "379", "3794", "ISL", "352", false, false, "Q189", 352, "EU", new String[] { "ISK" }, new String[] { "is" }),
	Italy("IT", "Italy", "Italia", "39", "386", "3867", "ITA", "380", false, true, "Q38", 380, "EU", new String[] { "EUR" }, new String[] { "it", "de", "fr" }),
	Jamaica("JM", "Jamaica", "Jamaica", "1 876", "391", "3913", "JAM", "388", false, false, "Q766", 388, "AM", new String[] { "JMD" }, new String[] { "en" }),
	Jordan("JO", "Jordan", "الأردن", "962", "403", "4030", "JOR", "400", false, false, "Q810", 400, "AS", new String[] { "JOD" }, new String[] { "ar" }),
	Japan("JP", "Japan", "日本", "81", "399", "3999", "JPN", "392", false, false, "Q17", 392, "AS", new String[] { "JPY" }, new String[] { "ja" }),
	Kenya("KE", "Kenya", "Kenya", "254", "623", "6238", "KEN", "404", false, false, "Q114", 404, "AF", new String[] { "KES" }, new String[] { "sw", "en" }),
	Kyrgyzstan("KG", "Kyrgyzstan", "Кыргызстан", "996", "625", "6254", "KGZ", "417", false, false, "Q813", 417, "AS", new String[] { "KGS" }, new String[] { "ky", "ru" }),
	Cambodia("KH", "Cambodia", "កម្ពុជា។", "855", "141", "1414", "KHM", "116", false, false, "Q424", 116, "AS", new String[] { "KHR" }, new String[] { "km" }),
	Kiribati("KI", "Kiribati", "Kiribati", "686", "411", "4111", "KIR", "296", false, false, "Q710", 296, "OC", new String[] { "AUD" }, new String[] { "en" }),
	Comoros("KM", "Comoros", "Comores", "269", "173", "1732", "COM", "174", false, false, "Q970", 174, "AF", new String[] { "KMF" }, new String[] { "fr", "sw", "ar" }),
	SaintKittsAndNevis("KN", "Saint Kitts and Nevis", "Saint Kitts and Nevis", "1 869", "695", "6955", "KNA", "659", false, false, "Q763", 659, "AM", new String[] { "XCD" }, new String[] { "en" }),
	NorthKorea("KP", "North Korea", "북한", "850", null, null, "PRK", "408", false, false, "Q423", 408, "AS", new String[] { "KPW" }, new String[] { "ko" }),
	SouthKorea("KR", "South Korea", "대한민국", "82", null, null, "KOR", "410", false, false, "Q884", 410, "AS", new String[] { "KRW" }, new String[] { "ko" }),
	Kuwait("KW", "Kuwait", "الكويت", "965", null, null, "KWT", "414", false, false, "Q817", 414, "AS", new String[] { "KWD" }, new String[] { "ar" }),
	Kazakhstan("KZ", "Kazakhstan", "Қазақстан", "7", "153", "1538", "KAZ", "398", false, false, "Q232", 398, "AS", new String[] { "KZT" }, new String[] { "kk", "ru" }),
	Laos("LA", "Laos", "ປະເທດລາວ", "856", "420", "4200", "LAO", "418", false, false, "Q819", 418, "AS", new String[] { "LAK" }, new String[] { "lo" }),
	Lebanon("LB", "Lebanon", "لبنان", "961", "431", "4316", "LBN", "422", false, false, "Q822", 422, "AS", new String[] { "LBP" }, new String[] { "ar", "fr" }),
	SaintLucia("LC", "Saint Lucia", "Saint Lucia", "1 758", "715", "7153", "LCA", "662", false, false, "Q760", 662, "AM", new String[] { "XCD" }, new String[] { "en" }),
	Liechtenstein("LI", "Liechtenstein", "Liechtenstein", "423", "440", "4405", "LIE", "438", false, false, "Q347", 438, "EU", new String[] { "CHF" }, new String[] { "de" }),
	SriLanka("LK", "Sri Lanka", "ශ්රී ලංකාව", "94", "750", "7501", "LKA", "144", false, false, "Q854", 144, "AS", new String[] { "LKR" }, new String[] { "si", "ta" }),
	Liberia("LR", "Liberia", "Liberia", "231", "434", "4340", "LBR", "430", false, false, "Q1014", 430, "AF", new String[] { "USD" }, new String[] { "en" }),
	Lesotho("LS", "Lesotho", "Lesotho", "266", "426", "4260", "LSO", "426", false, false, "Q1013", 426, "AF", new String[] { "LSL" }, new String[] { "en", "st" }),
	Lithuania("LT", "Lithuania", "Lietuva", "370", "442", "4421", "LTU", "440", false, true, "Q37", 440, "EU", new String[] { "EUR" }, new String[] { "lt" }),
	Luxembourg("LU", "Luxembourg", "Lëtzebuerg", "352", "445", "4456", "LUX", "442", false, true, "Q32", 442, "EU", new String[] { "EUR" }, new String[] { "fr", "de", "lb" }),
	Latvia("LV", "Latvia", "Latvija", "371", "427", "4278", "LVA", "428", false, false, "Q211", 428, "EU", new String[] { "EUR" }, new String[] { "lv" }),
	Libya("LY", "Libya", "ليبيا", "218", "438", "4383", "LBY", "434", false, false, "Q1016", 434, "AF", new String[] { "LYD" }, new String[] { "ar" }),
	Morocco("MA", "Morocco", "المغرب", "212", "474", "4740", "MAR", "504", false, false, "Q1028", 504, "AF", new String[] { "MAD" }, new String[] { "fr", "ar" }),
	Monaco("MC", "Monaco", "Monaco", "377", "495", "4952", "MCO", "492", false, false, "Q235", 492, "EU", new String[] { "EUR" }, new String[] { "fr" }),
	Moldova("MD", "Moldova", "Moldova", "373", "494", "4944", "MDA", "498", false, false, "Q217", 498, "EU", new String[] { "MDL" }, new String[] { "ro", "ru", "uk" }),
	Montenegro("ME", "Montenegro", "Montenegro", "382", "498", "4985", "MNE", "499", false, false, "Q236", 499, "EU", new String[] { "EUR" }, new String[] { "sr", "hr", "bs", "sq" }),
	Madagascar("MG", "Madagascar", "Madagaskar", "261", "450", "4502", "MDG", "450", false, false, "Q1019", 450, "AF", new String[] { "MGA" }, new String[] { "mg", "fr" }),
	MarshallIslands("MH", "Marshall Islands", "Marshall Islands", "692", null, null, "MHL", "584", false, false, "Q709", 584, "OC", new String[] { "USD" }, new String[] { "en", "mh" }),
	NorthMacedonia("MK", "North Macedonia", "Северна Македонија", "389", null, null, "MKD", "807", false, false, "Q221", 807, "EU", new String[] { "MKD" }, new String[] { "mk" }),
	Mali("ML", "Mali", "Mali", "223", "464", "4642", "MLI", "466", false, false, "Q912", 466, "AF", new String[] { "XOF" }, new String[] { "fr" }),
	Myanmar("MM", "Myanmar", "မြန်မာ", "95", "093", "0930", "MMR", "104", false, false, "Q836", 104, "AS", new String[] { "MMK" }, new String[] { "my" }),
	Mongolia("MN", "Mongolia", "Монгол", "976", "497", "4979", "MNG", "496", false, false, "Q711", 496, "AS", new String[] { "MNT" }, new String[] { "mn" }),
	Mauritania("MR", "Mauritania", "موريتانيا", "222", "488", "4880", "MRT", "478", false, false, "Q1025", 478, "AF", new String[] { "MRO" }, new String[] { "ar", "fr" }),
	Malta("MT", "Malta", "Malta", "356", "467", "4677", "MLT", "470", false, true, "Q233", 470, "EU", new String[] { "EUR" }, new String[] { "mt", "en" }),
	Mauritius("MU", "Mauritius", "Mauritius", "230", "485", "4855", "MUS", "480", false, false, "Q1027", 480, "AF", new String[] { "MUR" }, new String[] { "en", "fr" }),
	Maldives("MV", "Maldives", "މޯލްޑިވްސް އެވެ", "960", "461", "4618", "MDV", "462", false, false, "Q826", 462, "AS", new String[] { "MVR" }, new String[] { "dv" }),
	Malawi("MW", "Malawi", "Malawi", "265", null, null, "MWI", "454", false, false, "Q1020", 454, "AF", new String[] { "MWK" }, new String[] { "en", "ny" }),
	Mexico("MX", "Mexico", "México", "52", "493", "4936", "MEX", "484", false, false, "Q96", 484, "AM", new String[] { "MXN" }, new String[] { "es" }),
	Malaysia("MY", "Malaysia", "Malaysia", "60", "455", "4553", "MYS", "458", false, false, "Q833", 458, "AS", new String[] { "MYR" }, new String[] { "ms" }),
	Mozambique("MZ", "Mozambique", "Moçambique", "258", "505", "5053", "MOZ", "508", false, false, "Q1029", 508, "AF", new String[] { "MZN" }, new String[] { "pt" }),
	Namibia("NA", "Namibia", "Namibia", "264", "507", "5070", "NAM", "516", false, false, "Q1030", 516, "AF", new String[] { "NAD" }, new String[] { "en", "de" }),
	Niger("NE", "Niger", "Niger", "227", "525", "5258", "NER", "562", false, false, "Q1032", 562, "AF", new String[] { "XOF" }, new String[] { "fr" }),
	Nigeria("NG", "Nigeria", "Nigeria", "234", "528", "5282", "NGA", "566", false, false, "Q1033", 566, "AF", new String[] { "NGN" }, new String[] { "en" }),
	Nicaragua("NI", "Nicaragua", "Nicaragua", "505", "521", "5215", "NIC", "558", false, false, "Q811", 558, "AM", new String[] { "NIO" }, new String[] { "es" }),
	Netherlands("NL", "Netherlands", "Nederland", "31", null, null, "NLD", "528", false, false, "Q55", 528, "EU", new String[] { "EUR" }, new String[] { "nl" }),
	Norway("NO", "Norway", "Norge", "47", "538", "5380", "NOR", "578", false, false, "Q20", 578, "EU", new String[] { "NOK" }, new String[] { "nb", "nn", "no", "se" }),
	Nepal("NP", "Nepal", "नेपाल", "977", "517", "5177", "NPL", "524", false, false, "Q837", 524, "AS", new String[] { "NPR" }, new String[] { "ne" }),
	Nauru("NR", "Nauru", "Nauru", "674", "508", "5088", "NRU", "520", false, false, "Q697", 520, "OC", new String[] { "AUD" }, new String[] { "na", "en" }),
	NewZealand("NZ", "New Zealand", "New Zealand", "64", "548", "5487", "NZL", "554", false, false, "Q664", 554, "OC", new String[] { "NZD" }, new String[] { "mi", "en" }),
	Oman("OM", "Oman", "سلطنة عمان", "968", "556", "5568", "OMN", "512", false, false, "Q842", 512, "AS", new String[] { "OMR" }, new String[] { "ar" }),
	Panama("PA", "Panama", "Panamá", "507", "580", "5800", "PAN", "591", false, false, "Q804", 591, "AM", new String[] { "PAB", "USD" }, new String[] { "es" }),
	Peru("PE", "Peru", "Perú", "51", "589", "5894", "PER", "604", true, false, "Q419", 604, "AM", new String[] { "PEN" }, new String[] { "es" }),
	PapuaNewGuinea("PG", "Papua New Guinea", "Papua New Guinea", "675", "545", "5452", "PNG", "598", false, false, "Q691", 598, "OC", new String[] { "PGK" }, new String[] { "en", "ho" }),
	Philippines("PH", "Philippines", "Philippines", "63", "267", "2674", "PHL", "608", false, false, "Q928", 608, "AS", new String[] { "PHP" }, new String[] { "en", "tl" }),
	Pakistan("PK", "Pakistan", "Pakistan", "92", "576", "5762", "PAK", "586", false, false, "Q843", 586, "AS", new String[] { "PKR" }, new String[] { "en", "ur" }),
	Poland("PL", "Poland", "Polska", "48", "603", "6033", "POL", "616", false, false, "Q36", 616, "EU", new String[] { "PLN" }, new String[] { "pl" }),
	Portugal("PT", "Portugal", "Portugal", "351", "607", "6076", "PRT", "620", false, true, "Q45", 620, "EU", new String[] { "EUR" }, new String[] { "pt" }),
	Palau("PW", "Palau", "Palau", "680", "575", "5754", "PLW", "585", false, false, "Q695", 585, "OC", new String[] { "USD" }, new String[] { "en", "ja" }),
	Paraguay("PY", "Paraguay", "Paraguay", "595", "586", "5860", "PRY", "600", true, false, "Q733", 600, "AM", new String[] { "PYG" }, new String[] { "es", "gn" }),
	Qatar("QA", "Qatar", "دولة قطر", "974", "154", "1546", "QAT", "634", false, false, "Q846", 634, "AS", new String[] { "QAR" }, new String[] { "ar" }),
	Romania("RO", "Romania", "România", "40", "670", "6700", "ROU", "642", false, false, "Q218", 642, "EU", new String[] { "RON" }, new String[] { "ro" }),
	Serbia("RS", "Serbia", "Србија", "381", "737", "7370", "SRB", "688", false, false, "Q403", 688, "EU", new String[] { "RSD" }, new String[] { "sr" }),
	Russia("RU", "Russia", "Россия", "7", null, null, "RUS", "643", false, false, "Q159", 643, "EU", new String[] { "RUB" }, new String[] { "ru" }),
	Rwanda("RW", "Rwanda", "Rwanda", "250", "675", "6750", "RWA", "646", false, false, "Q1037", 646, "AF", new String[] { "RWF" }, new String[] { "rw", "fr", "en" }),
	SaudiArabia("SA", "Saudi Arabia", "المملكة العربية السعودية", "966", "053", "0531", "SAU", "682", false, false, "Q851", 682, "AS", new String[] { "SAR" }, new String[] { "ar" }),
	SolomonIslands("SB", "Solomon Islands", "Solomon Islands", "677", null, null, "SLB", "090", false, false, "Q685", 90, "OC", new String[] { "SBD" }, new String[] { "en" }),
	Seychelles("SC", "Seychelles", "Les Seychelles", "248", "731", "7315", "SYC", "690", false, false, "Q1042", 690, "AF", new String[] { "SCR" }, new String[] { "fr", "en" }),
	Sudan("SD", "Sudan", "السودان", "249", "759", "7595", "SDN", "729", false, false, "Q1049", 729, "AF", new String[] { "SDG" }, new String[] { "ar", "en" }),
	Sweden("SE", "Sweden", "Sverige", "46", "764", "7641", "SWE", "752", false, false, "Q34", 752, "EU", new String[] { "SEK" }, new String[] { "sv" }),
	Singapore("SG", "Singapore", "Singapura", "65", "741", "7412", "SGP", "702", false, false, "Q334", 702, "AS", new String[] { "SGD" }, new String[] { "en", "ms", "ta" }),
	Slovenia("SI", "Slovenia", "Slovenija", "386", "246", "2461", "SVN", "705", false, false, "Q215", 705, "EU", new String[] { "EUR" }, new String[] { "sl" }),
	Slovakia("SK", "Slovakia", "Slovensko", "421", "247", "2470", "SVK", "703", false, true, "Q214", 703, "EU", new String[] { "EUR" }, new String[] { "sk" }),
	SierraLeone("SL", "Sierra Leone", "Sierra Leone", "232", "735", "7358", "SLE", "694", false, false, "Q1044", 694, "AF", new String[] { "SLL" }, new String[] { "en" }),
	SanMarino("SM", "San Marino", "San Marino", "378", "697", "6971", "SMR", "674", false, false, "Q238", 674, "EU", new String[] { "EUR" }, new String[] { "it" }),
	Senegal("SN", "Senegal", "Sénégal", "221", "728", "7285", "SEN", "686", false, false, "Q1041", 686, "AF", new String[] { "XOF" }, new String[] { "fr" }),
	Somalia("SO", "Somalia", "Soomaaliya", "252", "748", "7480", "SOM", "706", false, false, "Q1045", 706, "AF", new String[] { "SOS" }, new String[] { "so", "ar" }),
	Suriname("SR", "Suriname", "Suriname", "597", "770", "7706", "SUR", "740", true, false, "Q730", 740, "AM", new String[] { "SRD" }, new String[] { "nl" }),
	SouthSudan("SS", "South Sudan", "South Sudan", null, "760", "7600", "SSD", "728", false, false, "Q958", 728, "AF", new String[] { "SSP" }, new String[] { "en" }),
	SaoTomeAndPrncipe("ST", "São Tomé and Príncipe", "São Tomé e Príncipe", "239", "720", "7200", "STP", "678", false, false, "Q1039", 678, "AF", new String[] { "STN" }, new String[] { "pt" }),
	ElSalvador("SV", "El Salvador", "El Salvador", "503", "687", "6874", "SLV", "222", false, false, "Q792", 222, "AM", new String[] { "USD" }, new String[] { "es" }),
	Syria("SY", "Syria", "سوريا", "963", "744", "7447", "SYR", "760", false, false, "Q858", 760, "AS", new String[] { "SYP" }, new String[] { "ku", "ar" }),
	Eswatini("SZ", "Eswatini", "Eswatini", "268", null, null, "SWZ", "748", false, false, "Q1050", 748, "AF", new String[] { "SZL" }, new String[] { "en", "ss" }),
	Chad("TD", "Chad", "تشاد", "235", "788", "7889", "TCD", "148", false, false, "Q657", 148, "AF", new String[] { "XAF" }, new String[] { "ar", "fr" }),
	Togo("TG", "Togo", "Aller", "228", "800", "8001", "TGO", "768", false, false, "Q945", 768, "AF", new String[] { "XOF" }, new String[] { "fr" }),
	Thailand("TH", "Thailand", "ประเทศไทย", "66", "776", "7765", "THA", "764", false, false, "Q869", 764, "AS", new String[] { "THB" }, new String[] { "th" }),
	Tajikistan("TJ", "Tajikistan", "Точикистон", "992", "772", "7722", "TJK", "762", false, false, "Q863", 762, "AS", new String[] { "TJS" }, new String[] { "tg", "ru" }),
	TimorLeste("TL", "Timor-Leste", "Timor-Leste", "670", "795", "7951", "TLS", "626", false, false, "Q574", 626, "AS", new String[] { "USD" }, new String[] { "pt" }),
	Turkmenistan("TM", "Turkmenistan", "Türkmenistan", "993", "824", "8249", "TKM", "795", false, false, "Q874", 795, "AS", new String[] { "TMT" }, new String[] { "tk" }),
	Tunisia("TN", "Tunisia", "تونس", "216", "820", "8206", "TUN", "788", false, false, "Q948", 788, "AF", new String[] { "TND" }, new String[] { "fr", "ar" }),
	Tonga("TO", "Tonga", "Tonga", "676", "810", "8109", "TON", "776", false, false, "Q678", 776, "OC", new String[] { "TOP" }, new String[] { "en" }),
	Turkey("TR", "Turkey", "Türkiye", "90", "827", "8273", "TUR", "792", false, false, "Q43", 792, "AS", new String[] { "TRY" }, new String[] { "tr" }),
	TrinidadAndTobago("TT", "Trinidad and Tobago", "Trinidad and Tobago", "1 868", "815", "8150", "TTO", "780", false, false, "Q754", 780, "AM", new String[] { "TTD" }, new String[] { "en" }),
	Tuvalu("TV", "Tuvalu", "Tuvalu", "688", "828", "8281", "TUV", "798", false, false, "Q672", 798, "OC", new String[] { "AUD" }, new String[] { "en" }),
	Tanzania("TZ", "Tanzania", "Tanzania", "255", "780", "7803", "TZA", "834", false, false, "Q924", 834, "AF", new String[] { "TZS" }, new String[] { "sw", "en" }),
	Ukraine("UA", "Ukraine", "Україна", "380", "831", "8311", "UKR", "804", false, false, "Q212", 804, "EU", new String[] { "UAH" }, new String[] { "uk" }),
	Uganda("UG", "Uganda", "Uganda", "256", "833", "8338", "UGA", "800", false, false, "Q1036", 800, "AF", new String[] { "UGX" }, new String[] { "en", "sw" }),
	UnitedStatesOfAmerica("US", "United States of America", "United States of America", "1", null, null, "USA", "840", false, false, "Q30", 840, "AM", new String[] { "USD" }, new String[] { "en" }),
	Uruguay("UY", "Uruguay", "Uruguay", "598", "845", "8451", "URY", "858", true, false, "Q77", 858, "AM", new String[] { "UYU" }, new String[] { "es" }),
	Uzbekistan("UZ", "Uzbekistan", "Uzbekistan", "998", "847", "8478", "UZB", "860", false, false, "Q265", 860, "AS", new String[] { "UZS" }, new String[] { "uz" }),
	SaintVincentAndTheGrenadines("VC", "Saint Vincent and the Grenadines", "Saint Vincent and the Grenadines", "1 784", "705", "7056", "VCT", "670", false, false, "Q757", 670, "AM", new String[] { "XCD" }, new String[] { "en" }),
	Venezuela("VE", "Venezuela", "Venezuela", "58", "850", "8508", "VEN", "862", true, false, "Q717", 862, "AM", new String[] { "VES" }, new String[] { "es" }),
	Vietnam("VN", "Vietnam", "Việt Nam", "84", "858", "8583", "VNM", "704", false, false, "Q881", 704, "AS", new String[] { "VND" }, new String[] { "vi" }),
	Vanuatu("VU", "Vanuatu", "Vanuatu", "678", "551", "5517", "VUT", "548", false, false, "Q686", 548, "OC", new String[] { "VUV" }, new String[] { "bi", "en", "fr" }),
	Samoa("WS", "Samoa", "Samoa", "685", "690", "6904", "WSM", "882", false, false, "Q683", 882, "OC", new String[] { "WST" }, new String[] { "sm", "en" }),
	Yemen("YE", "Yemen", "اليمن", "967", "357", "3573", "YEM", "887", false, false, "Q805", 887, "AS", new String[] { "YER" }, new String[] { "ar" }),
	SouthAfrica("ZA", "South Africa", "South Africa", "27", "756", "7560", "ZAF", "710", false, false, "Q258", 710, "AF", new String[] { "ZAR" }, new String[] { "en", "af", "st", "tn", "xh", "zu" }),
	Zambia("ZM", "Zambia", "Zambia", "260", "890", "8907", "ZMB", "894", false, false, "Q953", 894, "AF", new String[] { "ZMW" }, new String[] { "en" }),
	Zimbabwe("ZW", "Zimbabwe", "Zimbabwe", "263", "665", "6653", "ZWE", "716", false, false, "Q954", 716, "AF", new String[] { "USD" }, new String[] { "en", "sn", "nd" });
	
	/**
	 * 
	 */
	private String code;
	
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
	private String prefixPhone;
	
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
	private String[] currencies;
	
	/**
	 * 
	 */
	private String continent;
	
	/**
	 * 
	 */
	private String[] languages;

	/**
	 * Constructor
	 * 
	 * @param code
	 * @param name
	 * @param nativeName
	 * @param prefixPhone
	 * @param siscomexCode
	 * @param spedCode
	 * @param isoCode31663
	 * @param isoCodeNum
	 * @param mercosul
	 * @param euroZone
	 * @param wikiDataId
	 * @param m49Code
	 * @param continent
	 * @param currencies
	 * @param languages
	 */
	private Countries(String code, String name, String nativeName, String prefixPhone
			, String siscomexCode, String spedCode, String isoCode31663, String isoCodeNum
			, boolean mercosul, boolean euroZone, String wikiDataId, int m49Code, String continent
			, String[] currencies, String[] languages) {
		this.code = code;
		this.name = name;
		this.nativeName = nativeName;
		this.prefixPhone = prefixPhone;
		this.siscomexCode = siscomexCode;
		this.spedCode = spedCode;
		this.isoCode31663 = isoCode31663;
		this.isoCodeNum = isoCodeNum;
 		this.mercosul = mercosul;
		this.euroZone = euroZone;
		this.wikiDataId = wikiDataId;
		this.m49Code = m49Code;
		this.continent = continent;
		this.currencies = currencies;
		this.languages = languages;
	}
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return new String(this.code.getBytes(), Charset.forName("UTF-8"));
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
	 * @return the prefixPhone
	 */
	public String getPrefixPhone() {
		return prefixPhone;
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
	 * @return the currencies
	 */
	public String[] getCurrencies() {
		return currencies;
	}

	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}

	/**
	 * @return the languages
	 */
	public String[] getLanguages() {
		return languages;
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public static Countries getByCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		code = new String(code.getBytes(), Charset.forName("UTF-8"));
		for (Countries country : values()) {
			if (country != NotFound) {
				if (country.getCode().equalsIgnoreCase(code)) {
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
			currenciesStr = null;
		} else {
			currenciesStr = "[";
			for (String currency : this.getCurrencies()) {
				currenciesStr = currenciesStr  
						+ (currenciesStr.equals("[") ? " \"" : ", \"") 
						+ currency + "\"";
			}
			currenciesStr = currenciesStr + "]";
		}
		
		// Languages
		String languagesStr = StringUtils.EMPTY;
		if (this.getLanguages() == null) {
			languagesStr = null;
		} else {
			languagesStr = "[";
			for (String language : this.getLanguages()) {
				  languagesStr = languagesStr  
						+ (languagesStr.equals("[") ? " \"" : ", \"") 
						+ language + "\"";
			}
			languagesStr = languagesStr + "]";
		}
		
		return  "{ \"code\": " + JsonUtils.createJsonValue(this.getCode())
		 + ", \"name\": " +JsonUtils.createJsonValue(this.getName())
		 + ", \"nativeName\": " + JsonUtils.createJsonValue(this.getNativeName())
		 + ", \"prefixPhone\": " + JsonUtils.createJsonValue(this.getPrefixPhone())
		 + ", \"siscomexCode\": " + JsonUtils.createJsonValue(this.getSiscomexCode())
		 + ", \"spedCode\": " + JsonUtils.createJsonValue(this.getSpedCode())
		 + ", \"isoCode31663\": " + JsonUtils.createJsonValue(this.getIsoCode31663())
		 + ", \"isoCodeNum\": " + JsonUtils.createJsonValue(this.getIsoCodeNum())
		 + ", \"mercosul\": " + this.isMercosul()
		 + ", \"euroZone\": " + this.isEuroZone()
		 + ", \"wikiDataId\": " + JsonUtils.createJsonValue(this.getWikiDataId())
		 + ", \"m49Code\": " + this.getM49Code()
		 + ", \"continent\": " + JsonUtils.createJsonValue(this.getContinent())
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
						+ (StringUtils.isEmpty(response) ? "" : ", ") + country.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
