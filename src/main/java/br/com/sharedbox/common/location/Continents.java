package br.com.sharedbox.common.location;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * Constinents Enum
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 03/03/2022 - Version 1.0.0
 */
public enum Continents {
	NotFound((byte)0, null, null, null, null),
	America((byte)1, "América", "America", "America", "AM"),
	Asia((byte)2, "Ásia", "Asia", "Asia", "AS"),
	Europe((byte)3, "Europa", "Europe", "Europa", "EU"),
	Africa((byte)4, "África", "Africa", "África", "AF"),
	Oceania((byte)5, "Oceania", "Oceania", "Oceanía", "OC"),
	Antarctica((byte)6, "Antártida", "Antarctica", "Antártida", "AN");
	
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
	private String continentCode;
	
	/**
	 * 
	 */
	private byte id;
	
	/**
	 * Constructor
	 * 
	 * @param namePt
	 * @param nameEn
	 * @param nameEs
	 * @param continentCode
	 */
	private Continents(byte id, String namePt, String nameEn, String nameEs, String continentCode){
		this.id = id;
		this.namePt = namePt;
		this.nameEn = nameEn;
		this.nameEs = nameEs;
		this.continentCode = continentCode;
	}

	/**
	 * @return the id
	 */
	public byte getId() {
		return this.id;
	}

	/**
	 * @return the namePt
	 */
	public String getNamePt() {
		return this.namePt;
	}

	/**
	 * @return the nameEn
	 */
	public String getNameEn() {
		return this.nameEn;
	}

	/**
	 * @return the nameEs
	 */
	public String getNameEs() {
		return this.nameEs;
	}

	/**
	 * @return the continentCode
	 */
	public String getContinentCode() {
		return this.continentCode;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static Continents getById(String id) {
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
	public static Continents getById(byte id) {
		for (Continents continent : values()) {
			if (continent.getId() == id) {
				return continent;
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
			+ ", \"continentCode\": \"" + this.getContinentCode() + "\" }";
	}
	
	/**
	 * List all continents on json
	 * @return
	 */
	public static String toJsonList() {
		String response = StringUtils.EMPTY;
		
		for (Continents continent : values()) {
			if (continent != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " " : ", ") + continent.toJson() + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}
}
