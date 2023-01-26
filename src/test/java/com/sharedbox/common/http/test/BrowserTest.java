package com.sharedbox.common.http.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sharedbox.common.http.Browser;

/**
 * Call test of Browser enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/30/2021
 */
@ExtendWith(MockitoExtension.class)
public class BrowserTest {
	/**
	 * Validate test method
	 */
	@Test
	public void validateTest() {
		Browser browser = Browser.Chrome;

		assertNotNull(Browser.getByNameOrCode(""));
		assertNotNull(Browser.getByNameOrCode("XYZ"));
		assertNotNull(Browser.getByNameOrCode(9999999));
		assertNotNull(Browser.getByNameOrCode(browser.name()));
		assertNotNull(Browser.getByNameOrCode(browser.getCode()));
	}
}
