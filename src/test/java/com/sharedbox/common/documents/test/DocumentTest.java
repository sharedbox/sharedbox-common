package com.sharedbox.common.documents.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.documents.Document;

/**
 * 
 * @author Rafael Costi - rafaelcosti@outlook.com
 * @version 1.0.0
 * @since 03/03/2022
 */
public class DocumentTest {
	/**
	 * 
	 * @return
	 */
	@Test
	public void testEnum() {
		assertEquals(Document.CPF.getId(), 1);
		assertEquals(Document.getById("999999"), Document.NotFound);
		assertEquals(Document.getById(1), Document.CPF);
		assertNotEquals(Document.getById(999999), Document.CPF);
		assertEquals(Document.getById("1"), Document.CPF);
		assertNotEquals(Document.getById("AA"), Document.CPF);
		assertNotEquals(Document.getById(null), Document.CPF);
		assertNotEquals(Document.getById(Long.MAX_VALUE + ""), Document.CPF);
		
		String json = Document.CPF.toJson();
		assertNotNull(json);
		
		json = Document.toJsonList();
		assertNotNull(json);
	}
}
