package com.sharedbox.common.network;

/**
 * Contain TLD domains
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 06/28/2022 - Version 1.0.0
 */
public enum TLDDomain {
	Ai("ai"),
	App("app"),
	Art("art"),
	Best("best"),
	Biz("biz"),
	Br("br"),
	Ca("ca"),
	Cc("cc"),
	Club("club"),
	co("co"),
	CoUk("co.uk"),
	Com("com"),
	ComBr("com.br"),
	Cx("cx"),
	De("de"),
	Design("design"),
	Dev("dev"),
	Eu("eu"),
	Fm("fm"),
	Fun("fun"),
	Gg("gg"),
	Host("host"),
	Icu("icu"),
	Id("id"),
	In("in"),
	Inc("inc"),
	Io("io"),
	Is("is"),
	Info("info"),
	Life("life"),
	Live("live"),
	Me("me"),
	Mx("mx"),
	Net("net"),
	Nl("nl"),
	Online("online"),
	Org("org"),
	Ph("ph"),
	Pro("pro"),
	Pw("pw"),
	Shop("shop"),
	Space("space"),
	Store("store"),
	Tech("tech"),
	To("to"),
	Tv("tv"),
	Uk("uk"),
	Us("us"),
	Vip("vip"),
	World("world"),
	Website("website"),
	Xyz("xyz");
	
	/**
	 * 
	 */
	private String tld;
	
	/**
	 * 
	 * @param dotTld
	 * @param tld
	 */
	private TLDDomain(String tld) {
		this.tld = tld;
	}
	/**
	 * @return the tld
	 */
	public String getTld() {
		return tld;
	}
}
