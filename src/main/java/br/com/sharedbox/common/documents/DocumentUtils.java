package br.com.sharedbox.common.documents;

/**
 * Interface validator
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 0.0.1
 */
public interface DocumentUtils {
	/**
	 * 
	 * @return String
	 */
	String generate();
	
	/**
	 * 
	 * @param value
	 * @return String
	 */
	String format(String value) throws Exception;
	
	/**
	 * 
	 * @param value
	 * @return boolean
	 */
	boolean validate(Object value);
}
