package br.com.sharedbox.common.security;

import java.util.Date;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator.Builder;

/**
 * This class contain write and read jwt token
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 */
public class Jwt {
	/**
	 * This method generate JWT token 
	 * 
	 * @param secret
	 * @param subject
	 * @param expiration
	 * @param algorithm
	 * @return token
	 */
	public static String generateToken(String secret, String subject, long expiration, JwtAlgorithim algorithm) {
		return generateToken(secret, subject, expiration, algorithm, null) ;
	}
	
	/**
	 * This method generate JWT token with claims
	 * 
	 * @param secret
	 * @param subject
	 * @param expiration
	 * @param algorithm
	 * @param claims
	 * @return token
	 */
	public static String generateToken(String secret, String subject, long expiration, JwtAlgorithim algorithm, Map<String, String> claims) {
		return generateToken(secret, subject, expiration, algorithm, claims, null);
	}
	
	/**
	 * This method generate JWT token with claims and header claims
	 * 
	 * @param secret
	 * @param subject
	 * @param expiration
	 * @param algorithm
	 * @param claims
	 * @param headerClaims
	 * @return token
	 */
	public static String generateToken(String secret, String subject, long expiration, JwtAlgorithim algorithm
			, Map<String, String> claims, Map<String, Object> headerClaims) {
		Builder builder = JWT.create()
					.withSubject(subject)
					.withExpiresAt(new Date(System.currentTimeMillis() + expiration));
		
		if (claims != null) {
			for (String key : claims.keySet()) {
				builder = builder.withClaim(key, claims.get(key));
			}
		}
		
		if (headerClaims != null) {
			builder = builder.withHeader(headerClaims);
		}
			
		return builder.sign(algorithm.getAlgorithim(secret));
	}
}
