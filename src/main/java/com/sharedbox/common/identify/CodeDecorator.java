package com.sharedbox.common.identify;

/**
 * Implement this interface to create custom decorators on QR Code
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 09/01/2021 Version 1.0.0 
 */
public interface CodeDecorator<T> {
	/**
	 * Decorate method
	 * @param qrcode
	 * @return
	 */
	T decorate(T qrcode);
}
