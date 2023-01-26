package com.sharedbox.common.security;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator.Builder;
import com.auth0.jwt.interfaces.Claim;

import com.sharedbox.common.utils.DateTimeUtils;
import com.sharedbox.common.utils.JsonUtils;
import com.sharedbox.common.utils.ObjectUtils;

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
	public static String generateToken(String secret, String subject, long expiration, JwtAlgorithim algorithm, Map<String, Object> claims) {
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
			, Map<String, Object> claims, Map<String, Object> headerClaims) {
		Builder builder = JWT.create()
					.withSubject(subject)
					.withExpiresAt(new Date(System.currentTimeMillis() + expiration));
		
		if (claims != null) {
			for (String key : claims.keySet()) {
				if (claims.get(key) != null) {
					if (ObjectUtils.isString(claims.get(key))) {
						builder = builder.withClaim(key, claims.get(key).toString());
					}
					
					if (ObjectUtils.isLong(claims.get(key))) {
						builder = builder.withClaim(key, Long.parseLong(claims.get(key).toString()));
					}
					
					if (ObjectUtils.isByte(claims.get(key)) || ObjectUtils.isInteger(claims.get(key))) {
						builder = builder.withClaim(key, Integer.parseInt(claims.get(key).toString()));
					}
					
					if (ObjectUtils.isFloat(claims.get(key)) || ObjectUtils.isDouble(claims.get(key))) {
						builder = builder.withClaim(key, Double.parseDouble(claims.get(key).toString()));
					}
					
					if (ObjectUtils.isBoolean(claims.get(key))) {
						builder = builder.withClaim(key, Boolean.parseBoolean(claims.get(key).toString()));
					}
					
					if (ObjectUtils.isLocalDate(claims.get(key))) {
						builder = builder.withClaim(key ,DateTimeUtils.localDateToDate((LocalDate)claims.get(key)));
					}
					
					if (ObjectUtils.isLocalDateTime(claims.get(key))) {
						builder = builder.withClaim(key , DateTimeUtils.localDateTimeToDate((LocalDateTime)claims.get(key)));
					}
					
					if (ObjectUtils.isDate(claims.get(key))) {
						builder = builder.withClaim(key, (Date)claims.get(key));
					}
					
					if (ObjectUtils.isList(claims.get(key))) {
						builder = builder.withClaim(key, Collections.singletonList(claims.get(key)));
					}

					if (ObjectUtils.isMap(claims.get(key))) {
						builder = builder.withClaim(key, JsonUtils.convertObjectToMap(claims.get(key)));
					}
				} else {
					builder = builder.withClaim(key, "");
				}
			}
		}
		
		if (headerClaims != null) {
			builder = builder.withHeader(headerClaims);
		}
			
		return builder.sign(algorithm.getAlgorithim(secret));
	}
	
	/**
	 * 
	 * @param token
	 * @return
	 */
	public static Map<String, Claim> getClaims(String token) {
		return JWT.decode(token).getClaims();
	}
	
	/**
	 * 
	 * @param token
	 * @param key
	 * @return
	 */
	public static Object getHeaderItem(String token, String key) {
		return JWT.decode(token).getHeaderClaim(key).as(Object.class);
	}
}
