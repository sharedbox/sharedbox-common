package com.sharedbox.common.security;

import com.auth0.jwt.algorithms.Algorithm;

import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 *
 */
public enum JwtAlgorithim {
    /** JWA name for {@code No digital signature or MAC performed} */
    NONE("none", "No digital signature or MAC performed", "None", null, false),
    /** JWA algorithm name for {@code HMAC using SHA-256} */
    HS256("HS256", "HMAC using SHA-256", "HMAC", "HmacSHA256", true),
    /** JWA algorithm name for {@code HMAC using SHA-384} */
    HS384("HS384", "HMAC using SHA-384", "HMAC", "HmacSHA384", true),
    /** JWA algorithm name for {@code HMAC using SHA-512} */
    HS512("HS512", "HMAC using SHA-512", "HMAC", "HmacSHA512", true),
    /** JWA algorithm name for {@code RSASSA-PKCS-v1_5 using SHA-256} */
    RS256("RS256", "RSASSA-PKCS-v1_5 using SHA-256", "RSA", "SHA256withRSA", true),
    /** JWA algorithm name for {@code RSASSA-PKCS-v1_5 using SHA-384} */
    RS384("RS384", "RSASSA-PKCS-v1_5 using SHA-384", "RSA", "SHA384withRSA", true),
    /** JWA algorithm name for {@code RSASSA-PKCS-v1_5 using SHA-512} */
    RS512("RS512", "RSASSA-PKCS-v1_5 using SHA-512", "RSA", "SHA512withRSA", true),
    /**
     * JWA algorithm name for {@code ECDSA using P-256 and SHA-256}.  <b>This is not a JDK standard algorithm and
     * requires that a JCA provider like BouncyCastle be in the runtime classpath.</b>  BouncyCastle will be used
     * automatically if found in the runtime classpath.
     */
    ES256("ES256", "ECDSA using P-256 and SHA-256", "Elliptic Curve", "SHA256withECDSA", false),
    /**
     * JWA algorithm name for {@code ECDSA using P-384 and SHA-384}.  <b>This is not a JDK standard algorithm and
     * requires that a JCA provider like BouncyCastle be in the runtime classpath.</b>  BouncyCastle will be used
     * automatically if found in the runtime classpath.
     */
    ES384("ES384", "ECDSA using P-384 and SHA-384", "Elliptic Curve", "SHA384withECDSA", false),
    /**
     * JWA algorithm name for {@code ECDSA using P-512 and SHA-512}.  <b>This is not a JDK standard algorithm and
     * requires that a JCA provider like BouncyCastle be in the runtime classpath.</b>  BouncyCastle will be used
     * automatically if found in the runtime classpath.
     */
    ES512("ES512", "ECDSA using P-512 and SHA-512", "Elliptic Curve", "SHA512withECDSA", false),
    /**
     * JWA algorithm name for {@code RSASSA-PSS using SHA-256 and MGF1 with SHA-256}.  <b>This is not a JDK standard
     * algorithm and requires that a JCA provider like BouncyCastle be in the runtime classpath.</b>  BouncyCastle
     * will be used automatically if found in the runtime classpath.
     */
    PS256("PS256", "RSASSA-PSS using SHA-256 and MGF1 with SHA-256", "RSA", "SHA256withRSAandMGF1", false),
    /**
     * JWA algorithm name for {@code RSASSA-PSS using SHA-384 and MGF1 with SHA-384}.  <b>This is not a JDK standard
     * algorithm and requires that a JCA provider like BouncyCastle be in the runtime classpath.</b>  BouncyCastle
     * will be used automatically if found in the runtime classpath.
     */
    PS384("PS384", "RSASSA-PSS using SHA-384 and MGF1 with SHA-384", "RSA", "SHA384withRSAandMGF1", false),
    /**
     * JWA algorithm name for {@code RSASSA-PSS using SHA-512 and MGF1 with SHA-512}. <b>This is not a JDK standard
     * algorithm and requires that a JCA provider like BouncyCastle be in the classpath.</b>  BouncyCastle will be used
     * automatically if found in the runtime classpath.
     */
    PS512("PS512", "RSASSA-PSS using SHA-512 and MGF1 with SHA-512", "RSA", "SHA512withRSAandMGF1", false);
	
	private final String  value;
    private final String  description;
    private final String  familyName;
    private final String  jcaName;
    private final boolean jdkStandard;

    JwtAlgorithim(String value, String description, String familyName, String jcaName, boolean jdkStandard) {
        this.value = value;
        this.description = description;
        this.familyName = familyName;
        this.jcaName = jcaName;
        this.jdkStandard = jdkStandard;
    }
    
    public Algorithm getAlgorithim(String secret) {
    	if (StringUtils.isEmpty(secret) && this != NONE) {
    		throw new IllegalArgumentException("JWT invalid secret");
    	}
    	
    	Algorithm algorithm = null;
    	switch (this) {
			case HS256:
				algorithm = Algorithm.HMAC256(secret.getBytes());
				break;
				
			case HS384:
				algorithm = Algorithm.HMAC384(secret.getBytes());
				break;
				
			case HS512:
				algorithm = Algorithm.HMAC512(secret.getBytes());
				break;
				
			default:
				algorithm = Algorithm.none();
    	}
    	
    	return algorithm;
    }

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the jdkStandard
	 */
	public boolean isJdkStandard() {
		return jdkStandard;
	}

	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * @return the jcaName
	 */
	public String getJcaName() {
		return jcaName;
	}
}
