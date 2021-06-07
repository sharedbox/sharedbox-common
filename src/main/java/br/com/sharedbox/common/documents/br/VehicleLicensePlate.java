package br.com.sharedbox.common.documents.br;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.sharedbox.common.documents.DocumentBase;
import br.com.sharedbox.common.documents.DocumentUtils;
import br.com.sharedbox.common.utils.StringUtils;

/**
 * Validate vehicle Brazilian license plate
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/01/2021
 */
public class VehicleLicensePlate extends DocumentBase implements DocumentUtils {
	/**
	 * Regex validation 
	 */
    private String licensePlateRegexValidator = "[A-Z]{3}[0-9][0-9A-Z][0-9]{2}";
    
    /**
     * 
     */
    private String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Generate Mercosul license plate
     * 
     * @return licesePlate
     */
	public String generateMercosul() {
		Random random = new Random();
		char[] plate = generate().toCharArray(); 
		plate[4] = chars.charAt(random.nextInt(chars.length()));
		return new StringBuilder().append(plate).toString();
	}

    /**
     * Generate license plate
     * Suffix
     * @return licesePlate
     */
	@Override
	public String generate() {
		Random random = new Random();
		return "" + chars.charAt(random.nextInt(chars.length()))
				+ chars.charAt(random.nextInt(chars.length())) 
				+ chars.charAt(random.nextInt(chars.length())) 
				+ StringUtils.leftPad("0", 4, Integer.toString(random.nextInt(9999)));
	}

	@Override
	public String format(String value) throws Exception {
		return StringUtils.maskFormat("###-####", value);
	}

	/**
	 * Validate license plate
	 */
	@Override
	public boolean validate(Object value) {
		if(isNull(value)) {
			return false;
		}
		
		value = value.toString().replace("-", "");
		Pattern pat = Pattern.compile (this.licensePlateRegexValidator);
        Matcher mat = pat.matcher(value.toString());
        if (!mat.matches()) {
        	return false;
        }
		return true;
	}
}