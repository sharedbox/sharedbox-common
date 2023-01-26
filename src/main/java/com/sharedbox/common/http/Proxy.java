package com.sharedbox.common.http;

/**
 * Proxy information
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 06/24/2021
 */
public class Proxy {
	/**
	 * Constructor
	 */
	public Proxy() {
		super();
	}

	/**
	 * Constructor
	 */
	public Proxy(String host, int port) {
		super();
		this.setHost(host);
		this.setPort(port);
	}
	
	/**
	 * Proxy port
	 */
	private int port;

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}
	
	/**
	 * Proxy host
	 */
	private String host;

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}
}
