package com.sharedbox.common.documents.br;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sharedbox.common.documents.DocumentBase;
import com.sharedbox.common.documents.IDocument;
import com.sharedbox.common.utils.StringUtils;

/**
 * Validate CNPJ (Brazilian business document)
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 0.0.1
 * @since 12/28/2021 - Version 0.0.1
 */
public class Cnpj extends DocumentBase implements IDocument {
	/**
	 * Constructor
	 */
	private Cnpj() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	private Cnpj(String number) {
		super(number);
	}

	/**
	 * 
	 * @return
	 */
	public static Cnpj create() {
		return new Cnpj();
	}

	/**
	 * 
	 * @return
	 */
	public static Cnpj create(String number) {
		return new Cnpj(number);
	}
	
	/**
	 * 
	 */
    private String cnpjRegexValidator = "(?!(\\d)\\1{14})\\d{14}";

	/**
	 * CNPJ generate
	 */
	@Override
	public String generate() {
		return super.getValue();
	}

	/**
	 * CNPJ format
	 */
	@Override
	public String format() {
		return super.getValue();
	}

	/**
	 * CNPJ validate
	 */
	@Override
	public boolean validate() {
		if(super.isNull()) {
			return false;
		}
		
        final String cnpj = StringUtils.leftPad(super.getValue(), 14, "0");
        Pattern pattern = Pattern.compile (this.cnpjRegexValidator);
        Matcher mat = pattern.matcher(cnpj);
        if (!mat.matches()) {
        	return false;
        }
        
        char dig13, dig14;
        int sm, i, r, num, verify;

        sm = 0;
        verify = 2;
        
        for (i=11; i>=0; i--) {
        	num = (int)(cnpj.charAt(i) - 48);
        	sm = sm + (num * verify);
        	verify = verify + 1;
        	
        	if (verify == 10) {
        		verify = 2;
        	}
        }

        r = sm % 11;
        
        if ((r == 0) || (r == 1)) {
        	dig13 = '0'; 
        } else {
        	dig13 = (char)((11-r) + 48);
        }
        	
        sm = 0;
        verify = 2;
        
        for (i=12; i>=0; i--) {
        	num = (int)(cnpj.charAt(i)- 48);
        	sm = sm + (num * verify);
        	verify = verify + 1;
        	
        	if (verify == 10) {
        		verify = 2;
        	}
        }

        r = sm % 11;
        
        if ((r == 0) || (r == 1)) {
        	dig14 = '0';
        } else {
        	dig14 = (char)((11-r) + 48);
        }

        if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13))) {
        	return true;
        } 
        	
        return false;
	}
}
