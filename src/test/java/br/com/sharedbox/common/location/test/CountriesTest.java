package br.com.sharedbox.common.location.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.location.Countries;

/**
 * Call test of BrazilianStates enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/06/2021
 */
public class CountriesTest {
	/**
	 * Countries test
	 */
	@Test
	public void languageTest() {
		Countries countries = Countries.Brazil;
		assertNotNull(countries);
		assertNotNull(Countries.Brazil.getCountryName());
		assertNotNull(Countries.Brazil.getIso2Code());
		assertNotNull(Countries.Brazil.getIso3Code());
		assertNotNull(Countries.Brazil.getIsoNumCode());
		assertNotNull(Countries.getByCode(null));
		assertNotNull(Countries.getByCode("AAAA"));
		assertNotNull(Countries.getByCode("BR"));
		assertNotNull(Countries.getByCode("BRA"));
		assertNotNull(Countries.getByCode("076"));
		assertNotNull(Countries.getByCode("BR"));
	}
}
