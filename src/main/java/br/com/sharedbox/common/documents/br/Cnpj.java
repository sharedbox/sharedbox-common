package br.com.sharedbox.common.documents.br;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.sharedbox.common.documents.DocumentBase;
import br.com.sharedbox.common.documents.IDocument;
import br.com.sharedbox.common.utils.StringUtils;

/**
 * Validate CNPJ (Brazilian business document)
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 0.0.1
 */
public class Cnpj extends DocumentBase implements IDocument {
	/**
	 * Constructor
	 */
	public Cnpj() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	public Cnpj(String number) {
		super(number);
		super.setNumber(StringUtils.leftPad(super.getNumber(), 14, "0"));
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
		return super.getNumber();
	}

	/**
	 * CNPJ format
	 */
	@Override
	public String format() {
		return super.getNumber();
	}

	/**
	 * CNPJ validate
	 */
	@Override
	public boolean validate() {
		if(super.getNumber() == null) {
			return false;			
		}
		
		Pattern pat = Pattern.compile (this.cnpjRegexValidator);
        Matcher mat = pat.matcher(super.getNumber());
        if (!mat.matches()) {
        	return false;
        }
        
        char dig13, dig14;
        int sm, i, r, num, verify;

        sm = 0;
        verify = 2;
        
        for (i=11; i>=0; i--) {
        	num = (int)(super.getNumber().charAt(i) - 48);
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
        	num = (int)(super.getNumber().charAt(i)- 48);
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

        if ((dig13 == super.getNumber().charAt(12)) && (dig14 == super.getNumber().charAt(13))) {
        	return true;
        } 
        	
        return false;
	}
}
