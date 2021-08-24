package br.com.sharedbox.common.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * File utils
 * 
 * @author Rafael Costi <rafaelcosti@outlook.com>
 * @version 1.0.0
 * @since 05/01/2021
 */
public class FileUtils extends org.apache.commons.io.IOUtils {
	/**
	 * 
	 * @return
	 * @throws IOException 
	 */
	public static String[] readAllLines(String path) throws IOException {
		return readAllLines(new File(path));
	}
	
	/**
	 * 
	 * @return
	 * @throws IOException 
	 */
	public static String[] readAllLines(File path) throws IOException {
		return readAllLines(path.toPath());
	}
	
	/**
	 * 
	 * @return
	 * @throws IOException 
	 */
	public static String[] readAllLines(Path path) throws IOException {
		List<String> lines = new ArrayList<String>();
		lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		return lines.toArray(new String[lines.size()]);
	}

	/**
	 * 
	 * @param value
	 * @param path
	 * @throws IOException
	 */
	public static void write(String value, String path) throws IOException {
		write(value, path, "UTF-8");
	}

	/**
	 * 
	 * @param value
	 * @param path
	 * @param charset
	 * @throws IOException
	 */
	public static void write(String value, String path, String charset) throws IOException {
		write(value, path, Charset.forName(charset));
	}
	
	/**
	 * 
	 * @param jsonCountries
	 * @param path
	 * @param charset
	 * @throws IOException
	 */
	public static void write(String value, String path, Charset charset) throws IOException {
		OutputStream ops = new FileOutputStream(path);
		write(value, ops, charset);
	}
}
