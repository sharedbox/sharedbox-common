package com.sharedbox.common.location.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sharedbox.common.location.Languages;

/**
 * Call test of Language enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/30/2021
 */
@ExtendWith(MockitoExtension.class)
public class LanguagesTest {
	/**
	 * Language test
	 */
	@Test
	public void languageTest() {
		assertNotNull(Languages.En);
		assertNotNull(Languages.En.getCode());
		assertNotNull(Languages.En.getIso6392B());
		assertNotNull(Languages.En.getIso6392T());
		assertNotNull(Languages.En.getName());
		assertNotNull(Languages.En.getNativeName());
		
		assertNotNull(Languages.En.toJson());
		assertEquals(Languages.getByCode(null), Languages.NotFound);
		assertEquals(Languages.getByCode(""), Languages.NotFound);
		assertEquals(Languages.getByCode("hy"), Languages.Hy);
		assertEquals(Languages.getByCode("arm"), Languages.Hy);
		assertEquals(Languages.getByCode("hye"), Languages.Hy);
		assertEquals(Languages.getByCode("XYZWW"), Languages.NotFound);

		assertNotNull(Languages.toJsonList());
	}
}
