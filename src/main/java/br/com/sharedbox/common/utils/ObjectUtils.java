package br.com.sharedbox.common.utils;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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
		Gson gson = new Gson();
		return (T) gson.fromJson(obj.toString(), to);
	}

	/**
	 * Convert JSON object to class model
	 * @return model
	 */
	public static <T> T convertToClassModel(Object body, Type type) {
		return new Gson().fromJson(body.toString(), new TypeToken<List<T>>() {}.getType());
	}
}
