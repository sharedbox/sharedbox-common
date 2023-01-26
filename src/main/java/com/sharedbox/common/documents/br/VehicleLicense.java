package com.sharedbox.common.documents.br;

import com.sharedbox.common.documents.DocumentBase;
import com.sharedbox.common.documents.IDocument;

/**
 * Validate vehicle Brazilian license (RENAVAM)
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/14/2021 - Version 0.0.1
 */
public class VehicleLicense extends DocumentBase implements IDocument {
	/**
	 * Constructor
	 */
	private VehicleLicense() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	private VehicleLicense(String number) {
		super(number);
	}

	/**
	 * 
	 * @return
	 */
	public static VehicleLicense create() {
		return new VehicleLicense();
	}

	/**
	 * 
	 * @return
	 */
	public static VehicleLicense create(String number) {
		return new VehicleLicense(number);
	}

	/**
	 * 
	 */
	@Override
	public String generate() {
		return super.getValue();
	}

	@Override
	public String format() throws Exception {
		return super.getValue();
	}

	@Override
	public boolean validate() {
		return false;
	}
}
