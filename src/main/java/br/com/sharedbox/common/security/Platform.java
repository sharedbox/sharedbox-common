package br.com.sharedbox.common.security;

public enum Platform {
	Windows(1),
    MacOS(2),
    Linux(3),
    Cross(4),
    IOS(5),
    Android(6);
	
	/**
	 * Platform id
	 */
	private int id;
	
	/**
	 * Constructor
	 * @param id
	 */
	private Platform(int id) {
		this.id = id;
	}
	
	/**
	 * Get platform id
	 * @return
	 */
	public int getId() {
		return this.id;
	}
}
