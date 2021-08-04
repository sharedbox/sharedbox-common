package br.com.sharedbox.common.documents.br;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.sharedbox.common.documents.DocumentBase;
import br.com.sharedbox.common.documents.DocumentUtils;

/**
 * Validate CNPJ (Brazilian business document)
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 0.0.1
 */
public class Cnpj extends DocumentBase implements DocumentUtils {
	/**
	 * 
	 */
    private String cnpjRegexValidator = "(?!(\\d)\\1{14})\\d{14}";
    
	/**
	 * Constructor
	 */
	public Cnpj() {
		super();
	}

	/**
	 * CNPJ generate
	 */
	@Override
	public String generate() {
		return "";
	}

	/**
	 * CNPJ format
	 */
	@Override
	public String format(String value) {
		return "";
	}

	/**
	 * CNPJ validate
	 */
	@Override
	public boolean validate(Object value) {
		if(value == null) {
			return false;			
		}
		
		Pattern pat = Pattern.compile (this.cnpjRegexValidator);
        Matcher mat = pat.matcher(value.toString());
        if (!mat.matches()) {
        	return false;
        }
        
        char dig13, dig14;
        int sm, i, r, num, verify;

        sm = 0;
        verify = 2;
        
        for (i=11; i>=0; i--) {
        	num = (int)(value.toString().charAt(i) - 48);
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
        	num = (int)(value.toString().charAt(i)- 48);
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

        if ((dig13 == value.toString().charAt(12)) && (dig14 == value.toString().charAt(13))) {
        	return true;
        } 
        	
        return false;
	}
}
