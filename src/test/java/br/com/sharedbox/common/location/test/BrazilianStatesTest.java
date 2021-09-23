package br.com.sharedbox.common.location.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.location.BrazilianRegions;

/**
 * Call test of BrazilianStates enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/03/2021
 */
public class BrazilianStatesTest {
	/**
	 * Brazlian state test
	 */
	@Test
	public void languageTest() {
		BrazilianRegions bs = BrazilianRegions.SaoPaulo;
		assertNotNull(bs);
		assertNotNull(BrazilianRegions.SaoPaulo.getName());
		assertNotNull(BrazilianRegions.SaoPaulo.getAcronyms());
	}
}
