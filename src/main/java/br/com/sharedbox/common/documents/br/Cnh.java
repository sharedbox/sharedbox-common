package br.com.sharedbox.common.documents.br;

import br.com.sharedbox.common.documents.DocumentBase;
import br.com.sharedbox.common.documents.IDocument;

/**
 * Validate CNH (Brazilian driver's license)
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 0.0.1
 */
public class Cnh extends DocumentBase implements IDocument {
	/**
	 * Constructor
	 */
	public Cnh() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	public Cnh(String number) {
		super(number);
	}

	@Override
	public String generate() {
		return getNumber();
	}

	@Override
	public String format() {
		return getNumber();
	}

	@Override
	public boolean validate() {
		if(super.isNull(super.getNumber())) {
			return false;			
		}
		
		char char1 = super.getNumber().charAt(0);
		if (super.getNumber().replaceAll("\\D+", "").length() != 11
				|| String.format("%0" + 11 + "d", 0).replace('0', char1).equals(super.getNumber())) {
			return false;
		}

		long v = 0, j = 9;

		for (int i = 0; i < 9; ++i, --j) {
			v += ((super.getNumber().charAt(i) - 48) * j);
		}

		long dsc = 0, vl1 = v % 11;

		if (vl1 >= 10) {
			vl1 = 0;
			dsc = 2;
		}

		v = 0;
		j = 1;

		for (int i = 0; i < 9; ++i, ++j) {
			v += ((super.getNumber().charAt(i) - 48) * j);
		}

		long x = v % 11;
		long vl2 = (x >= 10) ? 0 : x - dsc;

		return (String.valueOf(vl1) 
				+ String.valueOf(vl2)).equals(super.getNumber().substring(super.getNumber().length() - 2));
	}
}
