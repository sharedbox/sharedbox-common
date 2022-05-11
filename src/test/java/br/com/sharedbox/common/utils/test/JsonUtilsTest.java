package br.com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.utils.JsonUtils;

/**
 * Call test of JsonUtils class
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 05/09/2022 - Version 1.0.0
 */
public class JsonUtilsTest {
	/**
	 * 
	 */
	@Test
	public void test() {
		assertNotNull(JsonUtils.getJsonValue(LocalDateTime.now()));
		assertNotNull(JsonUtils.getJsonValue("TEST"));
		assertEquals(JsonUtils.getJsonValueDateTime(null), "null");
		assertEquals(JsonUtils.getJsonValueString(null), "null");
	}
}
