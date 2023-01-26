package com.sharedbox.common.identify.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.identify.CodeType;

/**
 * Call test of CodeType enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/02/2021
 */
public class CodeTypeTest {
	/**
	 * Constructor test
	 */
	@Test
	public void contructorTest() {
		assertNotNull(CodeType.AZTEC);
		assertNotNull(CodeType.AZTEC.getCodeFormat());
	}
}
