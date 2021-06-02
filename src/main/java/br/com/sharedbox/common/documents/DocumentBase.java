package br.com.sharedbox.common.documents;

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
	public boolean isNull(Object value) {
		return value == null;
	}
}
