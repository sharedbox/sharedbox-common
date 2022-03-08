package br.com.sharedbox.common.location.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.location.Continents;

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
		assertEquals(Continents.America.getId(), 1);
		assertEquals(Continents.America.getContinentCode(), "AM");
		assertEquals(Continents.America.getNamePt(), "América");
		assertEquals(Continents.America.getNameEs(), "America");
		assertEquals(Continents.America.getNameEn(), "America");
		assertEquals(Continents.getById(Continents.America.getId()), Continents.America);
		assertNotEquals(Continents.getById((byte)99), Continents.America);
		assertNotEquals(Continents.getById("999"), Continents.America);
		assertEquals(Continents.getById(null), Continents.NotFound);
		assertEquals(Continents.getById("AA"), Continents.NotFound);
		assertEquals(Continents.getById("1"), Continents.America);
		
		String json = Continents.America.toJson();
		assertNotNull(json);
		
		json = Continents.toJsonList();
		assertNotNull(json);
	}
}
