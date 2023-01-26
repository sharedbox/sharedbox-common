package com.sharedbox.common.utils.adapters;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 07/12/2022 - Version 1.0.0
 */
public class LocalDateTimeGsonAdapter implements JsonDeserializer<LocalDateTime> {
	/**
	 * Gson invokes this call-back method during deserialization when it encounters a field of the
	 * specified type.
	 * <p>In the implementation of this call-back method, you should consider invoking
	 * {@link JsonDeserializationContext#deserialize(JsonElement, Type)} method to create objects
	 * for any non-trivial field of the returned object. However, you should never invoke it on the
	 * the same type passing {@code json} since that will cause an infinite loop (Gson will call your
	 * call-back method again).
	 *
	 * @param json The Json data being deserialized
	 * @param typeOfT The type of the Object to deserialize to
	 * @return a deserialized object of the specified type typeOfT which is a subclass of {@code T}
	 * @throws JsonParseException if json is not in the expected format of {@code typeofT}
	 */
	@Override
	public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		
		String date = json.getAsJsonPrimitive().getAsString();
		date = date.replace("/", "-").replace("T", " ");

		return LocalDateTime.parse(date, formatter);
	}

}
