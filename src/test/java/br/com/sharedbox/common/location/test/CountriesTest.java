package br.com.sharedbox.common.location.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.location.Countries;

/**
 * Call test of countries enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/06/2021 - Version 1.0.0
 */
public class CountriesTest {
	/**
	 * Countries test
	 */
	@Test
	public void test() {
		Countries countries = Countries.Brazil;
		assertNotNull(countries);
		assertNotNull(countries.getCurrencies());
		assertNotNull(countries.getId());
		assertNotNull(countries.getIdContinent());
		assertNotNull(countries.getIsoCode31662());
		assertNotNull(countries.getIsoCode31663());
		assertNotNull(countries.getIsoCodeNum());
		assertNotNull(countries.getM49Code());
		assertNotNull(countries.getNameEn());
		assertNotNull(countries.getNameEs());
		assertNotNull(countries.getNamePt());
		assertNotNull(countries.getPrefixPhoneCode());
		assertNotNull(countries.getRegionAmount());
		assertNotNull(countries.getSiscomexCode());
		assertNotNull(countries.getSpedCode());
		assertNotNull(countries.getWikiDataId());
		assertNotNull(countries.isEuroZone());
		assertNotNull(countries.isMercosul());

		assertEquals(Countries.getById(null) , Countries.NotFound);
		assertEquals(Countries.getById("") , Countries.NotFound);
		assertEquals(Countries.getById("AAA") , Countries.NotFound);
		assertEquals(Countries.getById(Long.MAX_VALUE + "") , Countries.NotFound);
		assertNotNull(Countries.getById("0").toJson());
		
		countries = Countries.getById(1);
		String json = countries.toJson();
		assertNotNull(json);

		json = Countries.toJsonList();
		assertNotNull(json);
	}
}
