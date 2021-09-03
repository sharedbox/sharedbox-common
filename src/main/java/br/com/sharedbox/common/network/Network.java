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
	 * Check host response
	 * 
	 * @param host
	 * @return
	 * @throws Exception
	 */
	public Map<String, String> checkHost(String host) throws Exception {
		if(StringUtils.isEmpty(host)) {
			throw new IllegalArgumentException("invalid host");
		}
		
		Map<String, String> response = new HashMap<String, String>();
		
		if(InetAddress.getByName(host).isReachable(2000)) {
			response.put("hostName", InetAddress.getByName(host).getHostName());
			response.put("hostAddress", InetAddress.getByName(host).getHostAddress());
			response.put("isSiteLocalAddress", InetAddress.getByName(host).isSiteLocalAddress() ? "true" : "false");
			response.put("host", host);
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
	public Map<String, String> checkLocalHost() throws Exception {
		Map<String, String> response = new HashMap<String, String>();
		
		if(InetAddress.getLocalHost().isReachable(2000)) {
			response.put("hostName", InetAddress.getLocalHost().getHostName());
			response.put("hostAddress", InetAddress.getLocalHost().getHostAddress());
			response.put("isSiteLocalAddress", InetAddress.getLocalHost().isSiteLocalAddress() ? "true" : "false");
		} else {
			response.put("message", "Host does not respond");
		}
		
		return response;
	}
}
