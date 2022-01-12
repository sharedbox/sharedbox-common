package br.com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;

import br.com.sharedbox.common.utils.DateTimeUtils;
import br.com.sharedbox.common.utils.ObjectUtils;

/**
 * Call test of ObjectUtils class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/03/2021
 */
public class ObjectUtilsTest {
	/**
	 * Test constructor class
	 */
	@Test
	void constructorTest() {
		assertNotNull(new ObjectUtils());
	}

	/**
	 * 
	 */
	@Test
	void convertToClassModelTest() {
		String json = "{ \"value1\": 10, \"value2\": \"Test value\"}";
		assertNotNull(ObjectUtils.convertToClassModel(json, ClassTestObject.class));
		
		LinkedTreeMap<String, Object> map = new LinkedTreeMap<String, Object>();
		map.put("value1", 10);
		map.put("value2", "Test value");
		assertNotNull(ObjectUtils.convertToClassModel(map, ClassTestObject.class));
		
		json = "[{ \"value1\": 10, \"value2\": \"Test value 2\"},"
				+ "{ \"value1\": 20, \"value2\": \"Test value 2\"}]";
		assertNotNull(ObjectUtils.convertToClassModel(json, new TypeToken<List<ClassTestObject>>(){}.getType()));
	}

	/**
	 * 
	 */
	@Test
	void convertStringToJsonTest() {
		String json = "{ \"value1\": 10, \"value2\": \"Test value\"}";
		assertNotNull(ObjectUtils.convertStringToJson(json));
	}
	
	/**
	 * 
	 */
	@Test
	void convertObjectToMapTest() {
		assertNotNull(ObjectUtils.convertObjectToMap(null));
	}

	/**
	 * 
	 */
	@Test
	void checkTypeTest() {
		assertFalse(ObjectUtils.isBoolean(null));
		assertTrue(ObjectUtils.isBoolean(true));
		assertFalse(ObjectUtils.isBoolean(10));

		assertFalse(ObjectUtils.isString(null));
		assertTrue(ObjectUtils.isString("Teste"));
		assertFalse(ObjectUtils.isString(10));

		assertFalse(ObjectUtils.isByte(null));
		assertTrue(ObjectUtils.isByte((byte)10));
		assertFalse(ObjectUtils.isByte("teste"));

		assertFalse(ObjectUtils.isInteger(null));
		assertTrue(ObjectUtils.isInteger((int)10));
		assertFalse(ObjectUtils.isInteger("teste"));

		assertFalse(ObjectUtils.isLong(null));
		assertTrue(ObjectUtils.isLong((long)10));
		assertFalse(ObjectUtils.isLong("teste"));

		assertFalse(ObjectUtils.isFloat(null));
		assertTrue(ObjectUtils.isFloat((float)10));
		assertFalse(ObjectUtils.isFloat("teste"));

		assertFalse(ObjectUtils.isDouble(null));
		assertTrue(ObjectUtils.isDouble((double)10));
		assertFalse(ObjectUtils.isDouble("teste"));

		assertFalse(ObjectUtils.isList(null));
		assertTrue(ObjectUtils.isList(new ArrayList<String>()));
		assertFalse(ObjectUtils.isList("teste"));

		assertFalse(ObjectUtils.isMap(null));
		assertTrue(ObjectUtils.isMap(new HashMap<String, String>()));
		assertFalse(ObjectUtils.isMap("teste"));

		assertFalse(ObjectUtils.isDate(null));
		assertTrue(ObjectUtils.isDate(DateTimeUtils.localDateTimeToDate(LocalDateTime.now())));
		assertFalse(ObjectUtils.isDate("teste"));

		assertFalse(ObjectUtils.isLocalDate(null));
		assertTrue(ObjectUtils.isLocalDate(LocalDate.now()));
		assertFalse(ObjectUtils.isLocalDate("teste"));

		assertFalse(ObjectUtils.isLocalDateTime(null));
		assertTrue(ObjectUtils.isLocalDateTime(LocalDateTime.now()));
		assertFalse(ObjectUtils.isLocalDateTime("teste"));	
	}
}

/**
 * Class for ObjectUtilsTest
 * @author Rafael Costi
 *
 */
class ClassTestObject {
	int value1;
	String value2;
}