package br.com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.gson.reflect.TypeToken;

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