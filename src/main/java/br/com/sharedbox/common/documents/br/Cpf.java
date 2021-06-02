package br.com.sharedbox.common.documents.br;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.sharedbox.common.documents.DocumentBase;
import br.com.sharedbox.common.documents.DocumentUtils;

/**
 * Validate CPF (Brazilian personal document)
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 0.0.1
 */
public class Cpf extends DocumentBase implements DocumentUtils {
	/**
	 * 
	 */
    private String cpfRegexValidator = "(?!(\\d)\\1{10})\\d{11}";

	/**
	 * 
	 * @param String 
	 * @return String
	 */
	public String generate() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param String 
	 * @return String
	 */
	@Override
	public String format(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param Object 
	 */
	public boolean validate(Object value) {
		// Todo colocar pad left
		if(super.isNull(value)) {
			return false;			
		}
		
		Pattern pat = Pattern.compile (this.cpfRegexValidator);
        Matcher mat = pat.matcher(value.toString());
        if (!mat.matches()) {
        	return false;
        }
		
        char dig10, dig11;
        int sm, i, r, num, verify;
        try {
            sm = 0;
            verify = 10;
            for (i=0; i<9; i++) {
	            num = (int)(value.toString().charAt(i) - 48);
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
            	num = (int)(value.toString().charAt(i) - 48);
            	sm = sm + (num * verify);
            	verify = verify - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                 dig11 = '0';
            }  else {
            	dig11 = (char)(r + 48);
            }

            if ((dig10 == value.toString().charAt(9)) 
            		&& (dig11 == value.toString().charAt(10))) {
                 return(true);
            }
        } catch (InputMismatchException ex) {
        	return(false);
        }    
		return true;
	}
}
