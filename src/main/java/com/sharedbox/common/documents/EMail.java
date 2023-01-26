package com.sharedbox.common.documents;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sharedbox.common.network.Network;
import com.sharedbox.common.utils.StringUtils;

/**
 * Validate e-mail
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 12/29/2021 - Version 0.0.1
 */
public class EMail extends DocumentBase implements IDocument {
	/**
	 * Constructor
	 */
	private EMail() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param eMail
	 */
	private EMail(String eMail) {
		super(eMail);
	}
	
	/**
	 * 
	 * @return
	 */
	public static EMail create() {
		return new EMail();
	}
	
	/**
	 * 
	 * @return
	 */
	public static EMail create(String eMail) {
		return new EMail(eMail);
	}

	/**
	 * 
	 */
	private String eMailRegexValidator = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

	/**
	 * 
	 */
	@Override
	public String generate() {
		return generate(StringUtils.strRandom(8));
	}

	/**
	 * 
	 */
	public String generate(String domain) {
		return generate(StringUtils.strRandom(20), null);
	}

	/**
	 * 
	 */
	public String generate(String domain, String tldDomains) {
		return generate(StringUtils.strRandom(20), domain, tldDomains);
	}

	/**
	 * 
	 */
	public String generate(String mail, String domain, String tldDomains) {
		return mail + "@" + domain + (StringUtils.isEmpty(tldDomains) ? "" : "." + tldDomains);
	}

	/**
	 * 
	 */
	@Override
	public String format() throws Exception {
		return null;
	}

	/**
	 * E-mail validate
	 */
	@Override
	public boolean validate() {
		return validate(false);
	}

	/**
	 * E-mail and domain validate
	 * 
	 * @param domainValidate
	 * @return
	 */
	public boolean validate(boolean domainValidate) {
		if (super.isNull()) {
			return false;
		}

		if (super.getValue().endsWith(".")) {
			return false;
		}

		Pattern pattern = Pattern.compile(this.eMailRegexValidator);
		Matcher emailMatcher = pattern.matcher(super.getValue().toString());
		boolean isValid = emailMatcher.matches();

		if (domainValidate) {
			String domain = super.getValue().substring((super.getValue().indexOf("@") + 1), super.getValue().length());
			return Network.exist(domain);
		}

		return isValid;
	}
}
