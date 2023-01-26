package com.sharedbox.common.documents.br;

import com.sharedbox.common.documents.DocumentBase;
import com.sharedbox.common.documents.IDocument;

/**
 * Validate CNH (Brazilian driver's license)
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 0.0.1
 * @since 12/28/2021 - Version 0.0.1
 */
public class Cnh extends DocumentBase implements IDocument {
	/**
	 * Constructor
	 */
	private Cnh() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	private Cnh(String number) {
		super(number);
	}

	/**
	 * 
	 * @return
	 */
	public static Cnh create() {
		return new Cnh();
	}

	/**
	 * 
	 * @return
	 */
	public static Cnh create(String number) {
		return new Cnh(number);
	}

	@Override
	public String generate() {
		return super.getValue();
	}

	@Override
	public String format() {
		return super.getValue();
	}

	@Override
	public boolean validate() {
		if(super.isNull()) {
			return false;			
		}
		
		char char1 = super.getValue().charAt(0);
		if (super.getValue().replaceAll("\\D+", "").length() != 11
				|| String.format("%0" + 11 + "d", 0).replace('0', char1).equals(super.getValue())) {
			return false;
		}

		long v = 0, j = 9;

		for (int i = 0; i < 9; ++i, --j) {
			v += ((super.getValue().charAt(i) - 48) * j);
		}

		long dsc = 0, vl1 = v % 11;

		if (vl1 >= 10) {
			vl1 = 0;
			dsc = 2;
		}

		v = 0;
		j = 1;

		for (int i = 0; i < 9; ++i, ++j) {
			v += ((super.getValue().charAt(i) - 48) * j);
		}

		long x = v % 11;
		long vl2 = (x >= 10) ? 0 : x - dsc;

		return (String.valueOf(vl1) 
				+ String.valueOf(vl2)).equals(super.getValue().substring(super.getValue().length() - 2));
	}
}
