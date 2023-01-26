package com.sharedbox.common.location.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.location.Countries;

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
		assertEquals(countries , Countries.Brazil);
		assertNotNull(countries.getCurrencies());
		assertNotNull(countries.getContinent());
		assertNotNull(countries.getCode());
		assertNotNull(countries.getIsoCode31663());
		assertNotNull(countries.getIsoCodeNum());
		assertNotNull(countries.getM49Code());
		assertNotNull(countries.getName());
		assertNotNull(countries.getNativeName());
		assertNotNull(countries.getPrefixPhone());
		assertNotNull(countries.getSiscomexCode());
		assertNotNull(countries.getSpedCode());
		assertNotNull(countries.getWikiDataId());
		assertNotNull(countries.isEuroZone());
		assertNotNull(countries.isMercosul());

		assertEquals(Countries.getByCode(null) , Countries.NotFound);
		assertEquals(Countries.getByCode("") , Countries.NotFound);
		assertEquals(Countries.getByCode("AAA") , Countries.NotFound);
		assertNotNull(Countries.getByCode("BR").toJson());
		
		countries = Countries.getByCode("BR");
		String json = countries.toJson();
		assertNotNull(json);

		json = Countries.toJsonList();
		assertNotNull(json);
	}
}
