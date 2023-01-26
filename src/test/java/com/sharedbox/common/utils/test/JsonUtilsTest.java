package com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;

import com.sharedbox.common.utils.JsonUtils;

/**
 * Call test of JsonUtils class
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 05/09/2022 - Version 1.0.0
 */
public class JsonUtilsTest {
	/**
	 * @throws JsonProcessingException 
	 * @throws JsonMappingException 
	 * 
	 */
	@Test
	public void test() throws JsonMappingException, JsonProcessingException {
		assertNotNull(new JsonUtils());
		assertNotNull(JsonUtils.createJsonValue(LocalDateTime.now()));
		assertNotNull(JsonUtils.createJsonValue("TEST"));
		assertEquals(JsonUtils.createJsonValueDateTime(null), "null");
		assertEquals(JsonUtils.createJsonValueString(null), "null");

		String os = System.getProperty("os.name");
		String jsonFilePath = this.getClass().getResource("/test/test.json").getFile();
		if (!os.toUpperCase().contains("LINUX")) {
			jsonFilePath = jsonFilePath.substring(1);
		}
		
		assertNotNull(JsonUtils.getObjectFromFileJson(jsonFilePath, new TypeToken<ClassTestObject>() {}));
		assertNotNull(JsonUtils.getObjectFromFileJson(jsonFilePath, ClassTestObject.class));
		
		Object json = "{ \"value1\": 10, \"value2\": \"Test value 2\", \"date\": \"10-10-2022\", \"datetime\": \"10-10-2022 12:00:00\"}";
		assertNotNull(JsonUtils.convertToClassModel(json, ClassTestObject.class));
		assertNotNull(JsonUtils.convertToObject(json.toString(), ClassTestObject.class));
		assertNotNull(JsonUtils.convertToObject(json.toString(), new TypeToken<ClassTestObject>(){}.getType()));
		
		LinkedTreeMap<String, Object> map = new LinkedTreeMap<String, Object>();
		map.put("value1", 10);
		map.put("value2", "Test value");
		map.put("date", "10-10-2022");
		map.put("datetime", "10-10-2022 12:00:00");
		assertNotNull(JsonUtils.convertToClassModel(map, ClassTestObject.class));
		assertNotNull(JsonUtils.convertToClassModel(map, new TypeToken<ClassTestObject>(){}.getType()));
		
		json = "[{ \"value1\": 10, \"value2\": \"Test value 2\", \"date\": \"10-10-2022\", \"datetime\": \"10-10-2022 12:00:00\"},"
				+ "{ \"value1\": 10, \"value2\": \"Test value 2\", \"date\": \"10-10-2022\", \"datetime\": \"10-10-2022 12:00:00\"}]";
		assertNotNull(JsonUtils.convertToClassModel(json, new TypeToken<List<ClassTestObject>>(){}.getType()));
		
		json = "{ \"value1\": 10, \"value2\": \"Test value 2\", \"date\": null, \"datetime\": null}";
		assertNotNull(JsonUtils.convertToClassModel(json, ClassTestObject.class));
		
		assertNotNull(JsonUtils.convertStringToJson(json.toString()));

		assertNotNull(JsonUtils.convertObjectToMap(null));

		assertNotNull(JsonUtils.convertToClassModelObjMapper(json, ClassTestObject.class));
		assertNotNull(JsonUtils.convertToClassModelListObjMapper("[" + json + "]"));
	}
}
