package br.com.sharedbox.common.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.sharedbox.common.Language;

/**
 * Call test of Language enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 06/30/2021
 */
@ExtendWith(MockitoExtension.class)
public class LanguageTest {
	/**
	 * Language test
	 */
	@Test
	public void languageTest() {
		Language lang = Language.EnUs;

		assertNotNull(Language.getbyCode(""));
		assertNotNull(Language.getbyCode("xx-xx"));
		assertNotNull(Language.getbyCode(lang.getCode()));
	}
}
