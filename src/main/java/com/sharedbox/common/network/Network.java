package com.sharedbox.common.network;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

import com.sharedbox.common.utils.StringUtils;

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
	public static final String HTTP_PREFIX = "http://";
	
	/**
	 * 
	 */
	public static final String HTTPS_PREFIX = "https://";
	
	/**
	 * 
	 */
	public static final String WWW_PREFIX = "www.";
	
	/**
	 * 
	 */
	public static final String IS_SITE_LOCAL_ADDRESS = "isSiteLocalAddress";

	/**
	 * Maximum length of a full domain name, including separators, and leaving room for the root
	 * label. See <a href="http://www.ietf.org/rfc/rfc2181.txt">RFC 2181</a> part 11.
	 */
	private static final int MAX_HOST_LENGTH = 253;
	
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
	
	/**
	 * Check exist host name
	 * 
	 * @param host
	 * @return
	 */
	public static boolean exist(String host) {
		try {
			if (StringUtils.isEmpty(host)) {
				return false;
			}
			
			if (host.length() > MAX_HOST_LENGTH) {
				return false;
			}
			
			if (host.endsWith(".")) {
				return false;
			}
			
			if (host.contains(HTTP_PREFIX) || host.contains(HTTPS_PREFIX)) {
				host = host.replace(HTTPS_PREFIX, "").replace(HTTP_PREFIX, "");
			}

			if (host.contains(WWW_PREFIX)) {
				host = host.replace(WWW_PREFIX, "");
			}
			
			if(InetAddress.getByName(host).getHostAddress()
						.matches("\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b")) {
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
}
