package com.sharedbox.common.utils;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpHost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.sharedbox.common.http.Proxy;

/**
 * Rest utils
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 * @since 06/08/2021 - Version 1.0.0
 */
public class RestUtils {
	/**
	 * Create a new instance at RestTemplate
	 * 
	 * @return restTemplate
	 * @throws KeyStoreException 
	 * @throws NoSuchAlgorithmException 
	 * @throws KeyManagementException 
	 */
	public static RestTemplate newInstance() {
		return newInstance(null);
	}
	
	/**
	 * Create a new instance at RestTemplate
	 * 
	 * @param proxy
	 * @return
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 */
	public static RestTemplate newInstance(Proxy proxy) {
		return newInstance(proxy, 50000);
	}
	
	/**
	 * Create a new instance at RestTemplate
	 * 
	 * @param defaultTimeout
	 * @return
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 */
	public static RestTemplate newInstance(int defaultTimeout) {
		return newInstance(null, defaultTimeout);
	}
	
	/**
	 * Create a new instance at RestTemplate
	 * 
	 * @param proxy
	 * @param defaultTimeout
	 * @return
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 */
	public static RestTemplate newInstance(Proxy proxy, int defaultTimeout) {
		SSLConnectionSocketFactory sslsf = sslConnection();
		
		BasicHttpClientConnectionManager connectionManager =
				new BasicHttpClientConnectionManager(newSocketFactoryRegistry(sslsf));
		
		return new RestTemplate(newClientHttpRequestFactory(proxy, sslsf, connectionManager, defaultTimeout));
	}

	/**
	 * 
	 * @return
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 */
	private static SSLConnectionSocketFactory sslConnection() {
		try {
			TrustStrategy acceptingTrustStrategy = (cert, authType) -> true;
			SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
			return new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 
	 * @param sslsf
	 * @return
	 */
	private static Registry<ConnectionSocketFactory> newSocketFactoryRegistry(SSLConnectionSocketFactory sslsf) {
		return RegistryBuilder.<ConnectionSocketFactory>create()
				.register("https", sslsf)
				.register("http", new PlainConnectionSocketFactory())
				.build();
	}
	/**
	 * 
	 * @param proxy
	 * @param sslsf
	 * @param connectionManager
	 * @param defaultTimeout
	 * @return
	 */
	private static HttpComponentsClientHttpRequestFactory newClientHttpRequestFactory(Proxy proxy
			, SSLConnectionSocketFactory sslsf
			, BasicHttpClientConnectionManager connectionManager
			, int defaultTimeout) {
		
		HttpClientBuilder hcb = HttpClients.custom()
				.setSSLSocketFactory(sslsf)
				.setConnectionManager(connectionManager);
		
		if (proxy != null && (proxy.getPort() > 0 && !StringUtils.isEmpty(proxy.getHost()))) {
			HttpHost httpHost = new HttpHost(proxy.getHost(), proxy.getPort());
			hcb = hcb.setProxy(httpHost);
		}
		
		HttpComponentsClientHttpRequestFactory requestFactory =
				new HttpComponentsClientHttpRequestFactory(hcb.build());

		requestFactory.setConnectTimeout(defaultTimeout);
		requestFactory.setConnectionRequestTimeout(defaultTimeout);
		requestFactory.setReadTimeout(defaultTimeout);
		
		return requestFactory;
	}
}
