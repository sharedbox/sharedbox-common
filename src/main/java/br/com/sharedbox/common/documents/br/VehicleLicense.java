package br.com.sharedbox.common.documents.br;

import br.com.sharedbox.common.documents.DocumentBase;
import br.com.sharedbox.common.documents.IDocument;

/**
 * Validate vehicle Brazilian license (RENAVAM)
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/14/2021
 */
public class VehicleLicense extends DocumentBase implements IDocument {
	/**
	 * Constructor
	 */
	public VehicleLicense() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	public VehicleLicense(String number) {
		super(number);
	}

	@Override
	public String generate() {
		return super.getNumber();
	}

	@Override
	public String format() throws Exception {
		return super.getNumber();
	}

	@Override
	public boolean validate() {
		return false;
	}

}
