package br.com.sharedbox.common;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * Enum languages
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/03/2021
 */
public enum Language {
	EnAu("en-au"),
	EnCa("en-ca"),
	EnGb("en-gb"),
	EnIe("en-ie"),
	EnNz("en-nz"),
	EnUs("en-us"),
	EsEs("es-es"),
	Esmx("es-mx"),
	Esar("es-ar"),
	Escl("es-cl"),
	Espy("es-py"),
	Esuy("es-uy"),
	PtBr("pt-br"),
	NotFound("");
	
	/**
	 * 
	 */
	private String code;
	
	/**
	 * Constructor
	 * @param code
	 */
	private Language(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return this.code;
	}
	
	/**
	 * 
	 * @param code
	 * @return
	 */
	public static Language getbyCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return NotFound;
		}
		
		for(Language lang : values()) {
			if (lang.getCode().equalsIgnoreCase(code.toLowerCase())) {
				return lang;
			}
		}
		
		return NotFound;
	}
}
