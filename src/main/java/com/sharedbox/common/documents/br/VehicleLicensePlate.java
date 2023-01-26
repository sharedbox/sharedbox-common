package com.sharedbox.common.documents.br;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sharedbox.common.documents.DocumentBase;
import com.sharedbox.common.documents.IDocument;
import com.sharedbox.common.utils.StringUtils;

/**
 * Validate vehicle Brazilian license plate
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/01/2021 - Version 0.0.1
 */
public class VehicleLicensePlate extends DocumentBase implements IDocument {
	/**
	 * Constructor
	 */
	private VehicleLicensePlate() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	private VehicleLicensePlate(String number) {
		super(number);
	}
	
	/**
	 * 
	 * @return
	 */
	public static VehicleLicensePlate create() {
		return new VehicleLicensePlate();
	}
	
	/**
	 * 
	 * @return
	 */
	public static VehicleLicensePlate create(String number) {
		return new VehicleLicensePlate(number);
	}
	
	/**
	 * Regex validation 
	 */
    private String licensePlateRegexValidator = "[A-Z]{3}[0-9][0-9A-Z][0-9]{2}";
    
    /**
     * Generate Mercosul license plate
     * 
     * @return licesePlate
     */
	public String generateMercosul() {
		char[] plate = generate().toCharArray(); 
		plate[4] = StringUtils.strRandom(1, true).charAt(0);
		return new StringBuilder().append(plate).toString();
	}

    /**
     * Generate license plate
     * Suffix
     * @return licesePlate
     */
	@Override
	public String generate() {
		return "" + StringUtils.strRandom(3, true)
				+ StringUtils.leftPad("0", 4, Integer.toString(new Random().nextInt(9999)));
	}

	@Override
	public String format() throws Exception {
		if(super.isNull()) {
			return "AAA-0000";
		}
		
		String licensePlate = super.getValue();
		
		if (licensePlate.length() < 7) {
			licensePlate = StringUtils.leftPad("A", 7, super.getValue());
		}
		
		return licensePlate.substring(0, 3) + "-" + licensePlate.substring(3, (licensePlate.length()));
	}

	/**
	 * Validate license plate
	 */
	@Override
	public boolean validate() {
		if(isNull()) {
			return false;
		}
		
		String licensePlate = super.getValue().toString().replace("-", "").toUpperCase();
		
		Pattern pat = Pattern.compile (this.licensePlateRegexValidator);
        Matcher mat = pat.matcher(licensePlate);
        if (!mat.matches()) {
        	return false;
        }
		return true;
	}
}
