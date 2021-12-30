package br.com.sharedbox.common.documents;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.sharedbox.common.network.Network;

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
	public EMail() {
		super();
	}

	/**
	 * Constructor
	 * @param eMail
	 */
	public EMail(String eMail) {
		super(eMail);
	}
	
	/**
	 * 
	 */
    private String eMailRegexValidator = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

	@Override
	public String generate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String format() throws Exception {
		// TODO Auto-generated method stub
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
