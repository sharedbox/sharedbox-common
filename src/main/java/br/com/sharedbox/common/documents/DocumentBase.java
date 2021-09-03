package br.com.sharedbox.common.documents;

import br.com.sharedbox.common.utils.StringUtils;

/**
 * Common validate
 *
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/01/2021
 */
public class DocumentBase {
	/**
	 * 
	 * @param value
	 * @return
	 */
	public boolean isNull(String value) {
		return StringUtils.isEmpty(value);
	}
}
