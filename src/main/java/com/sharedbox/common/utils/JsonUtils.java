package com.sharedbox.common.utils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;

import com.sharedbox.common.utils.adapters.LocalDateGsonAdapter;
import com.sharedbox.common.utils.adapters.LocalDateTimeGsonAdapter;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 05/06/2022 - Version 1.0.0
 */
public class JsonUtils {
	/**
	 * Check string value to set string json
	 * @param value
	 * @return
	 */
	public static String createJsonValue(String value) {
		return value == null ? "null" : "\"" + value + "\"";
	}
	
	/**
	 * Check date time value to set date time json
	 * @param value
	 * @return
	 */
	public static String createJsonValue(LocalDateTime value) {
		return value == null ? "null" : "\"" + value.toString() + "\"";
	}
	
	/**
	 * Check date time value to set date time json
	 * @param value
	 * @return
	 */
	public static String createJsonValueString(String value) {
		return createJsonValue(value);
	}
	
	/**
	 * Check date time value to set date time json
	 * @param value
	 * @return
	 */
	public static String createJsonValueDateTime(LocalDateTime value) {
		return createJsonValue(value);
	}
	
	/**
	 * Convert JSON object to class model
	 * 
	 * If your json contains date or date time fields, this method use 
	 * "MM-dd-yyyy" and "MM-dd-yyyy HH:mm:ss" format by default. 
	 * 
	 * @param <T>
	 * @param source
	 * @param to
	 * @return model
	 */
	public static <T> T convertToClassModel(Object source, Class<T> to) {
		Object obj = null ;
		if (source instanceof LinkedTreeMap) {
			obj =  convertLinkedTreeMapToJson((LinkedTreeMap<?, ?>) source);
		} else {
			obj = source;
		}
		
		return (T) newGson().fromJson(obj.toString(), to);
	}

	/**
	 * Convert JSON object to class model
	 * 
	 * If your json contains date or date time fields, this method use 
	 * "MM-dd-yyyy HH:mm:ss" and "MM-dd-yyyy HH:mm:ss" format by default. 
	 * 
	 * @return model
	 */
	public static <T> T convertToClassModel(Object source, Type type) {
		Object obj = null ;
		if (source instanceof LinkedTreeMap) {
			obj =  convertLinkedTreeMapToJson((LinkedTreeMap<?, ?>) source);
		} else {
			obj = source;
		}
		return newGson().fromJson(obj.toString(), type);
	}
	
	/**
	 * Convert LinkedTreeMap to JsonObject
	 * 
	 * If your json contains date or date time fields, this method use 
	 * "MM-dd-yyyy HH:mm:ss" and "MM-dd-yyyy HH:mm:ss" format by default. 
	 * 
	 * @param map
	 * @return jsonObject
	 */
	public static JsonObject convertLinkedTreeMapToJson(LinkedTreeMap<?, ?> map) {
		return newGson().toJsonTree(map).getAsJsonObject();
	}
	
	/**
	 * 
	 * @param <T>
	 * @param path
	 * @return
	 */
	public static <T> T getObjectFromFileJson(String path, TypeToken<T> tt) {
		try {
			String linesStr = StringUtils.EMPTY;
			String[] lines = FileUtils.readAllLines(path);
			for (String line : lines) {
				linesStr = linesStr + line + System.lineSeparator();
			}
			return convertToClassModel(linesStr, tt.getType());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 
	 * @param substring
	 * @param class1
	 * @return
	 */
	public static Object getObjectFromFileJson(String path, Class<?> clazz) {
		try {
			String linesStr = StringUtils.EMPTY;
			String[] lines = FileUtils.readAllLines(path);
			for (String line : lines) {
				linesStr = linesStr + line + System.lineSeparator();
			}
			return convertToClassModel(linesStr, clazz);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	} 
	
	/**
	 * 
	 * @param json
	 * @return
	 */
	public static JSONObject convertStringToJson(String json) {
		return new JSONObject(json);
	}
	
	/**
	 * Convert JSON object to class model
	 * @return model
	 * @throws JsonProcessingException 
	 * @throws JsonMappingException 
	 */
	public static <T> T convertToClassModelObjMapper(Object obj, Class<T> to) 
			throws JsonMappingException, JsonProcessingException {
		return (T) new ObjectMapper().readValue(obj.toString(), to);
	}

	/**
	 * Convert JSON object to class model
	 * @return model
	 */
	@SuppressWarnings("unchecked")
	public static <T> T convertToClassModelListObjMapper(Object body) 
			throws JsonMappingException, JsonProcessingException {
		return (T) new ObjectMapper().readValue(body.toString(), new TypeReference<List<T>>(){});
	}
	
	/**
	 * Convert object to Map
	 * @param obj
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, ?> convertObjectToMap(Object obj) {
		if (obj == null) {
			return new HashMap<>();
		}
		
		ObjectMapper mapObject = new ObjectMapper();
		return (Map<String, ?>) mapObject.convertValue(obj, obj.getClass());
	}
	
	/**
	 * Create new Gson Instance
	 * 
	 * @return
	 */
	private static Gson newGson() {
		return new GsonBuilder()
				.registerTypeAdapter(LocalDate.class, new LocalDateGsonAdapter())
				.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeGsonAdapter())
				.create();
	}

	/**
	 * Convert JSON String to Object
	 * @return
	 */
	public static <T> T convertToObject(String obj, Class<T> to) {
		return convertToClassModel(obj, to);
	}

	/**
	 * Convert JSON String to Object
	 * @return
	 */
	public static <T> T convertToObject(String obj, Type to) {
		return convertToClassModel(obj, to);
	}
}
