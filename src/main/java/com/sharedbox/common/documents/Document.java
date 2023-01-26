package com.sharedbox.common.documents;

import com.sharedbox.common.utils.StringUtils;

/**
 * Document types
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 02/25/2022 - Version 1.0.0
 */
public enum Document {
	CNH(4),
	CNPJ(2),
	CPF(1),
	NotFound(0),
	RG(3),
	VehicleLicence(5),
	VehicleLicensePlate(6);
	
	/**
	 * 
	 */
	private int id;
	
	/**
	 * Constructor
	 * 
	 * @param id
	 */
	private Document(int id) {
		this.id = id;
	}
	
	/**
	 * Get document id
	 * 
	 * @return id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Object json
	 * @return
	 */
	public String toJson() {
		return "{ \"id\": " + this.getId()
		+ ", \"typeName\": \"" + this.name() + "\" }";
	}
	
	/**
	 * List all documents type on json
	 * @return
	 */
	public static String toJsonList() {
		String response = StringUtils.EMPTY;
		
		for (Document doc : values()) {
			if (doc != NotFound) {
				response = response 
						+ (StringUtils.isEmpty(response) ? " { " : ", { ")
						+ "\"id\": " + doc.getId()
						+ ", \"typeName\": \"" + doc.name() + "\" }" + System.lineSeparator();
			}
		}
		return "[" + response + "]";
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public static Document getById(String id) {
		if (StringUtils.isEmpty(id)) {
			return NotFound;
		}
		
		if (!StringUtils.isNumeric(id)) {
			return NotFound;
		} else {
			long value = Long.parseLong(id);
			
			if (value > Integer.MAX_VALUE) {
				return NotFound;
			}
		}
		
		return getById(Integer.parseInt(id));
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public static Document getById(int id) {
		for (Document document : values()) {
			if (document.getId() == id) {
				return document;
			}
		}
		
		return NotFound;
	}
}
