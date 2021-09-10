package br.com.sharedbox.common.network;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0 
 * @since 08/21/2021
 */
public class Network {
	/**
	 * 
	 */
	public static final String HOST = "host";
	/**
	 * 
	 */
	public static final String HOST_NAME = "hostName";
	
	/**
	 * 
	 */
	public static final String HOST_ADDRESS = "hostAddress";
	
	/**
	 * 
	 */
	public static final String IS_SITE_LOCAL_ADDRESS = "isSiteLocalAddress";
	
	/**
	 * Check host response
	 * 
	 * @param host
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> checkHost(String host) throws Exception {
		if(StringUtils.isEmpty(host)) {
			throw new IllegalArgumentException("invalid host");
		}
		
		Map<String, String> response = new HashMap<String, String>();
		
		if(InetAddress.getByName(host).isReachable(2000)) {
			response.put(HOST_NAME, InetAddress.getByName(host).getHostName());
			response.put(HOST_ADDRESS, InetAddress.getByName(host).getHostAddress());
			response.put(IS_SITE_LOCAL_ADDRESS, InetAddress.getByName(host).isSiteLocalAddress() ? "true" : "false");
			response.put(HOST, host);
		} else {
			response.put("message", "Host does not respond");
		}
		
		return response;
	}
	
	/**
	 * Check local host response
	 * 
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> checkLocalHost() {
		Map<String, String> response = new HashMap<String, String>();
		
		try {
			if(InetAddress.getLocalHost().isReachable(2000)) {
				response.put(HOST_NAME, InetAddress.getLocalHost().getHostName());
				response.put(HOST_ADDRESS, InetAddress.getLocalHost().getHostAddress());
			} else {
				response.put("message", "Host does not respond");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return response;
	}
}
