package br.com.sharedbox.common.location.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.sharedbox.common.location.Languages;

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
		assertNotNull(Languages.En.getId());
		assertNotNull(Languages.En.getIso6391());
		assertNotNull(Languages.En.getIso6392B());
		assertNotNull(Languages.En.getIso6392T());
		assertNotNull(Languages.En.getName());
		assertNotNull(Languages.En.getNativeName());
		
		assertNotNull(Languages.En.toJson());
		assertEquals(Languages.getById(null), Languages.NotFound);
		assertEquals(Languages.getById("AA"), Languages.NotFound);
		assertEquals(Languages.getById(Long.MAX_VALUE + ""), Languages.NotFound);
		assertEquals(Languages.getById("0"), Languages.NotFound);
		assertEquals(Languages.getById("42"), Languages.En);

		assertNotNull(Languages.toJsonList());
		
	}
}
