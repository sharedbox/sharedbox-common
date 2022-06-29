package br.com.sharedbox.common.utils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;

/**
 * Objec utils
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 * @since 06/08/2021 - Version 1.0.0
 */
public class ObjectUtils extends org.apache.commons.lang3.ObjectUtils {
	/**
	 * Convert JSON object to class model
	 * @return model
	 */
	public static <T> T convertToClassModel(Object source, Class<T> to) {
		Object obj = null ;
		if (source instanceof LinkedTreeMap) {
			obj =  convertLinkedTreeMapToJson((LinkedTreeMap<?, ?>) source);
		} else {
			obj = source;
		}
		return (T) new Gson().fromJson(obj.toString(), to);
	}
	
	/**
	 * Convert LinkedTreeMap to JsonObject
	 * @param map
	 * @return jsonObject
	 */
	public static JsonObject convertLinkedTreeMapToJson(LinkedTreeMap<?, ?> map) {
		return new Gson().toJsonTree(map).getAsJsonObject();
	}

	/**
	 * Convert JSON object to class model
	 * @return model
	 */
	public static <T> T convertToClassModel(Object source, Type type) {
		Object obj = null ;
		if (source instanceof LinkedTreeMap) {
			obj =  convertLinkedTreeMapToJson((LinkedTreeMap<?, ?>) source);
		} else {
			obj = source;
		}
		return new Gson().fromJson(obj.toString(), type);
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
	 * Check if is String object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isString(Object object) {
		return object == null ? false : object instanceof String;
	}

	/**
	 * Check if is Integer object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isInteger(Object object) {
		return object == null ? false : object instanceof Integer;
	}

	/**
	 * Check if is Long object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isLong(Object object) {
		return object == null ? false : object instanceof Long;
	}

	/**
	 * Check if is Byte object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isByte(Object object) {
		return object == null ? false : object instanceof Byte;
	}

	/**
	 * Check if is Float object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isFloat(Object object) {
		return object == null ? false : object instanceof Float;
	}

	/**
	 * Check if is Double object
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isDouble(Object object) {
		return object == null ? false : object instanceof Double;
	}

	/**
	 * Check if is Boolean
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isBoolean(Object object) {
		return object == null ? false : object instanceof Boolean;
	}

	/**
	 * Check if is Date
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isDate(Object object) {
		return object == null ? false : object instanceof Date;
	}

	/**
	 * Check if is LocalDate
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isLocalDate(Object object) {
		return object == null ? false : object instanceof LocalDate;
	}

	/**
	 * Check if is LocalDateTime
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isLocalDateTime(Object object) {
		return object == null ? false : object instanceof LocalDateTime;
	}

	/**
	 * Check if is List<?>
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isList(Object object) {
		return object == null ? false : object instanceof List<?>;
	}

	/**
	 * Check if is Map<?, ?>
	 * 
	 * @param object
	 * @return true/false
	 */
	public static boolean isMap(Object object) {
		return object == null ? false : object instanceof Map<?, ?>;
	}
	
	/**
	 * 
	 * @param <T>
	 * @param path
	 * @return
	 */
	public static <T> T getObjectFromFileJson(String path) {
		try {
			String linesStr = StringUtils.EMPTY;
			String[] lines = FileUtils.readAllLines(path);
			for (String line : lines) {
				linesStr = linesStr + line + System.lineSeparator();
			}
			return convertToClassModel(linesStr, new TypeToken<T>() {}.getType());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
