package com.sharedbox.common.documents.br.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.documents.br.Cnh;

/**
 * 
 * @author Rafael Costi - rafaelcosti@outlook.com
 * @version 1.0.0
 * @since 08/06/2021
 */
public class CnhTest {
	/**
	 * 
	 * @return
	 */
	@Test
	public void validateTest() {
		assertTrue(Cnh.create("53369516746").validate());
		assertFalse(Cnh.create("11111111111").validate());
		assertFalse(Cnh.create("123123").validate());
		assertFalse(Cnh.create("").validate());
		assertFalse(Cnh.create("rtyrtyrty78789").validate());
		assertFalse(Cnh.create("rrrrrrrrrrr").validate());
		assertNotNull(Cnh.create("53369516746").generate());
		assertNotNull(Cnh.create("53369516746").format());
	}
}
