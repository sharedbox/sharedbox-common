package com.sharedbox.common.location.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.location.Continents;

/**
 * Call test of Continents enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 03/03/2022 - Version 1.0.0
 */
public class ContinentsTest {
	/**
	 * Continents test
	 */
	@Test
	public void test() {
		assertEquals(Continents.America.getCode(), "AM");
		assertEquals(Continents.America.getNamePt(), "América");
		assertEquals(Continents.America.getNameEs(), "America");
		assertEquals(Continents.America.getNameEn(), "America");
		assertEquals(Continents.getByCode(Continents.America.getCode()), Continents.America);
		assertEquals(Continents.getByCode(null), Continents.NotFound);
		assertEquals(Continents.getByCode("AA"), Continents.NotFound);
		assertEquals(Continents.getByCode("AM"), Continents.America);
		
		String json = Continents.America.toJson();
		assertNotNull(json);
		
		json = Continents.toJsonList();
		assertNotNull(json);
	}
}
