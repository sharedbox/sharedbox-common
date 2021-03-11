package br.com.sharedbox.common.http;

/**
 * Http codes
 *
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 */
public enum HttpCodes {
	NotFound(-1),
	Ok(200);
	
	/**
	 * Http code
	 */
	private int code;
	
	/**
	 * Constructor
	 * @param code
	 */
	HttpCodes(int code) {
		this.code = code;
	}
	
	/**
	 * Get code http
	 * @return
	 */
	public int getCode() {
		return this.code;
	}
	
	/**
	 * Get http code enum by code http
	 * 
	 * @param code
	 * @return
	 */
	public static HttpCodes getByCode(int code) {
		if (code == 0) {
			return NotFound;
		}
		
		HttpCodes response = NotFound;
		
		for (HttpCodes http : values()) {
			if(http.getCode() == code) {
				response = http;
				break;
			}
		}

		return response;
	}
}
