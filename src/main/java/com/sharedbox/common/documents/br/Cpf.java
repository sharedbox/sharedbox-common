package com.sharedbox.common.documents.br;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sharedbox.common.documents.DocumentBase;
import com.sharedbox.common.documents.IDocument;
import com.sharedbox.common.utils.StringUtils;

/**
 * Validate CPF (Brazilian personal document)
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 0.0.1
 * @since 12/28/2021 - Version 0.0.1
 */
public class Cpf extends DocumentBase implements IDocument {
	/**
	 * Constructor
	 */
	private Cpf() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	private Cpf(String number) {
		super(number);
	}

	/**
	 * 
	 * @return
	 */
	public static Cpf create() {
		return new Cpf();
	}

	/**
	 * 
	 * @return
	 */
	public static Cpf create(String number) {
		return new Cpf(number);
	}
	
	/**
	 * 
	 */
    private String cpfRegexValidator = "(?!(\\d)\\1{10})\\d{11}";

	/**
	 * 
	 * @return String
	 */
	@Override
	public String generate() {
		return super.getValue();
	}

	/**
	 * 
	 * @return String
	 */
	@Override
	public String format() {
		return super.getValue();
	}

	/**
	 * 
	 */
	@Override
	public boolean validate() {
		if(super.isNull()) {
			return false;			
		}
		
		final String cpf = StringUtils.leftPad(super.getValue(), 11, "0");
		Pattern pat = Pattern.compile (this.cpfRegexValidator);
        Matcher mat = pat.matcher(cpf);
        if (!mat.matches()) {
        	return false;
        }
		
        char dig10, dig11;
        
        int sm, i, r, num, verify;
        sm = 0;
        verify = 10;
        
        for (i=0; i<9; i++) {
        	num = (int)(cpf.charAt(i) - 48);
        	sm = sm + (num * verify);
        	verify = verify - 1;
        }
        
        r = 11 - (sm % 11);
        if ((r == 10) || (r == 11)) {
        	dig10 = '0';
        } else {
        	dig10 = (char)(r + 48);
        }

        sm = 0;
        verify = 11;
        
        for(i=0; i<10; i++) {
        	num = (int)(cpf.charAt(i) - 48);
        	sm = sm + (num * verify);
        	verify = verify - 1;
        }

        r = 11 - (sm % 11);
        if ((r == 10) || (r == 11)) {
        	dig11 = '0';
        }  else {
        	dig11 = (char)(r + 48);
        }

        if ((dig10 == cpf.charAt(9)) 
        		&& (dig11 == cpf.charAt(10))) {
        	return true;
        }
		
        return false;
	}
}
