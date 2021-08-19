package br.com.sharedbox.common.utils;

import java.lang.reflect.Type;
import java.util.List;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

/**
 * Objec utils
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 * @since 06/08/2021
 */
public class ObjectUtils extends org.apache.commons.lang3.ObjectUtils {
	/**
	 * Convert JSON object to class model
	 * @return model
	 */
	public static <T> T convertToClassModel(Object obj, Class<T> to) {
		return (T) new Gson().fromJson(obj.toString(), to);
	}

	/**
	 * Convert JSON object to class model
	 * @return model
	 */
	public static <T> T convertToClassModel(Object body, Type type) {
		return new Gson().fromJson(body.toString(), type);
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
}
