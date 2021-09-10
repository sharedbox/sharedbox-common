package br.com.sharedbox.common.documents.br;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.sharedbox.common.documents.DocumentBase;
import br.com.sharedbox.common.documents.IDocument;
import br.com.sharedbox.common.utils.StringUtils;

/**
 * Validate CPF (Brazilian personal document)
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 0.0.1
 */
public class Cpf extends DocumentBase implements IDocument {
	/**
	 * Constructor
	 */
	public Cpf() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	public Cpf(String number) {
		super(number);
		super.setNumber(StringUtils.leftPad(super.getNumber(), 11, "0"));
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
		return super.getNumber();
	}

	/**
	 * 
	 * @return String
	 */
	@Override
	public String format() {
		return super.getNumber();
	}

	/**
	 * 
	 */
	@Override
	public boolean validate() {
		if(super.isNull(super.getNumber())) {
			return false;			
		}
		
		Pattern pat = Pattern.compile (this.cpfRegexValidator);
        Matcher mat = pat.matcher(super.getNumber().toString());
        if (!mat.matches()) {
        	return false;
        }
		
        char dig10, dig11;
        
        int sm, i, r, num, verify;
        sm = 0;
        verify = 10;
        
        for (i=0; i<9; i++) {
        	num = (int)(super.getNumber().charAt(i) - 48);
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
        	num = (int)(super.getNumber().charAt(i) - 48);
        	sm = sm + (num * verify);
        	verify = verify - 1;
        }

        r = 11 - (sm % 11);
        if ((r == 10) || (r == 11)) {
        	dig11 = '0';
        }  else {
        	dig11 = (char)(r + 48);
        }

        if ((dig10 == super.getNumber().charAt(9)) 
        		&& (dig11 == super.getNumber().charAt(10))) {
        	return true;
        }
		
        return false;
	}
}
