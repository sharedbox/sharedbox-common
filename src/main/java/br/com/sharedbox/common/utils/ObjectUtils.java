package br.com.sharedbox.common.utils;

import com.google.gson.Gson;

/**
 * Objec utils
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 * @since 06/08/2021
 */
public class ObjectUtils {
	/**
	 * Convert JSON object to class model
	 * @return model
	 */
	public static <T> T convertToClassModel(Object obj, Class<T> to) {
		Gson gson = new Gson();
		return (T) gson.fromJson(obj.toString(), to);
	}
}
