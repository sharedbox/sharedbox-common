package br.com.sharedbox.common.documents.br;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.sharedbox.common.documents.DocumentBase;
import br.com.sharedbox.common.documents.IDocument;
import br.com.sharedbox.common.utils.StringUtils;

/**
 * Validate vehicle Brazilian license plate
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/01/2021
 */
public class VehicleLicensePlate extends DocumentBase implements IDocument {
	/**
	 * Constructor
	 */
	public VehicleLicensePlate() {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param number
	 */
	public VehicleLicensePlate(String number) {
		super(number);
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
		plate[4] = StringUtils.strRandon(1, true).charAt(0);
		return new StringBuilder().append(plate).toString();
	}

    /**
     * Generate license plate
     * Suffix
     * @return licesePlate
     */
	@Override
	public String generate() {
		return "" + StringUtils.strRandon(3, true)
				+ StringUtils.leftPad("0", 4, Integer.toString(new Random().nextInt(9999)));
	}

	@Override
	public String format() throws Exception {
		if(StringUtils.isEmpty(super.getNumber())) {
			return "AAA-0000";
		}
		
		if (super.getNumber().length() < 7) {
			super.setNumber(StringUtils.leftPad("A", 7, super.getNumber()));
		}
		
		return super.getNumber().substring(0, 3) + "-" + super.getNumber().substring(3, (super.getNumber().length()));
	}

	/**
	 * Validate license plate
	 */
	@Override
	public boolean validate() {
		if(isNull(super.getNumber())) {
			return false;
		}
		
		super.setNumber(super.getNumber().toString().replace("-", "").toUpperCase());
		Pattern pat = Pattern.compile (this.licensePlateRegexValidator);
        Matcher mat = pat.matcher(super.getNumber().toString());
        if (!mat.matches()) {
        	return false;
        }
		return true;
	}
}
