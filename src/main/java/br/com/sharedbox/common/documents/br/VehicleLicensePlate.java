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
	public String format(String value) throws Exception {
		if(StringUtils.isEmpty(value)) {
			return "AAA-0000";
		}
		
		if (value.length() < 7) {
			value = StringUtils.leftPad("A", 7, value);
		}
		
		return value.substring(0, 3) + "-" + value.substring(3, (value.length()));
	}

	/**
	 * Validate license plate
	 */
	@Override
	public boolean validate(Object value) {
		if(isNull(value)) {
			return false;
		}
		
		value = value.toString().replace("-", "").toUpperCase();
		Pattern pat = Pattern.compile (this.licensePlateRegexValidator);
        Matcher mat = pat.matcher(value.toString());
        if (!mat.matches()) {
        	return false;
        }
		return true;
	}
}
