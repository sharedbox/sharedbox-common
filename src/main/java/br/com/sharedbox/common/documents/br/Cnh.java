package br.com.sharedbox.common.documents.br;

import br.com.sharedbox.common.documents.DocumentBase;
import br.com.sharedbox.common.documents.DocumentUtils;

/**
 * Validate CNH (Brazilian driver's license)
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 0.0.1
 */
public class Cnh extends DocumentBase implements DocumentUtils {

	@Override
	public String generate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String format(String value) {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public boolean validate(Object value) {
		if(super.isNull(value)) {
			return false;			
		}
		char char1 = value.toString().charAt(0);
		if (value.toString().replaceAll("\\D+", "").length() != 11
				|| String.format("%0" + 11 + "d", 0).replace('0', char1).equals(value.toString())) {
			return false;
		}

		long v = 0, j = 9;

		for (int i = 0; i < 9; ++i, --j) {
			v += ((value.toString().charAt(i) - 48) * j);
		}

		long dsc = 0, vl1 = v % 11;

		if (vl1 >= 10) {
			vl1 = 0;
			dsc = 2;
		}

		v = 0;
		j = 1;

		for (int i = 0; i < 9; ++i, ++j) {
			v += ((value.toString().charAt(i) - 48) * j);
		}

		long x = v % 11;
		long vl2 = (x >= 10) ? 0 : x - dsc;

		return (String.valueOf(vl1) 
				+ String.valueOf(vl2)).equals(value.toString().substring(value.toString().length() - 2));

	}
}
