package br.com.sharedbox.common.location.br.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.location.br.RegionsBr;

/**
 * Call test of RegionsBr enum
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 03/08/2022 - Version 1.0.0
 */
public class RegionsBrTest {
	/**
	 * Continents test
	 */
	@Test
	public void test() {
		assertEquals(RegionsBr.SaoPaulo.getCode(), "SP");
		assertEquals(RegionsBr.SaoPaulo.getName(), "São Paulo");
		assertEquals(RegionsBr.SaoPaulo.getName(), "São Paulo");
		assertEquals(RegionsBr.SaoPaulo.getName(), "São Paulo");
		assertEquals(RegionsBr.getByCode(RegionsBr.SaoPaulo.getCode()), RegionsBr.SaoPaulo);
		assertEquals(RegionsBr.getByCode("ZZ"), RegionsBr.NotFound);
		assertEquals(RegionsBr.getByCode(null), RegionsBr.NotFound);
		assertEquals(RegionsBr.getByCode("AA"), RegionsBr.NotFound);
		assertEquals(RegionsBr.getByCode("1"), RegionsBr.NotFound);
		
		String json = RegionsBr.SaoPaulo.toJson();
		assertNotNull(json);
		
		json = RegionsBr.toJsonList();
		assertNotNull(json);
	}
}
