package com.sharedbox.common.location.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.location.Currencies;
import com.sharedbox.common.location.Languages;

/**
 * Call test of currencies enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/03/2021 - Version 1.0.0
 */
public class CurrenciesTest {
	/**
	 * Countries test
	 */
	@Test
	public void test() {
		Currencies currency = Currencies.RealBrasileiro;
		assertNotNull(currency);
		assertNotNull(currency.getId());
		assertNotNull(currency.getName(Languages.En));
		assertNotNull(currency.getName(Languages.Es));
		assertNotNull(currency.getName(Languages.Pt));
		assertNotNull(currency.getSymbol());

		assertEquals(Currencies.getById(null), Currencies.NotFound);
		assertEquals(Currencies.getById("A"), Currencies.NotFound);
		assertEquals(Currencies.getById(Long.MAX_VALUE + ""), Currencies.NotFound);
		assertEquals(Currencies.getById("0"), Currencies.NotFound);
		
		assertNotNull(Currencies.getById("986").toJson());
		assertNotNull(Currencies.toJsonList());
	}
}
