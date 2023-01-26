package com.sharedbox.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
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
 * @since 05/01/2021 - Version 1.0.0
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
		if (StringUtils.isEmpty(path)) {
			throw new RuntimeException("Invalid path");
		}
				
		String[] foldersPath = path.split("\\\\");
		String folders = StringUtils.EMPTY;
		
		for (int i = 0 ; i < foldersPath.length; i++) {
			if (i < (foldersPath.length - 1)) {
				folders = folders + foldersPath[i] + "\\";
			}
		}
		
		File fl = new File(folders);
		if (!fl.exists()) {
			fl.mkdirs();
		}
		OutputStream ops = new FileOutputStream(path);
		write(value, ops, charset);
	}

	/**
	 * Get file from path
	 * 
	 * @param string
	 * @return
	 * @throws FileNotFoundException 
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public static InputStream getFile(String path) throws FileNotFoundException {
		return getFile(new File(path));
	}

	/**
	 * Get file from path
	 * 
	 * @param File
	 * @return
	 * @throws FileNotFoundException 
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public static InputStream getFile(File path) throws FileNotFoundException {
		return new FileInputStream(path);
	}

	/**
	 * Get file from url
	 * 
	 * @param string
	 * @return
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public static InputStream getFileFromUrl(String path) throws MalformedURLException, IOException {
		return new URL(path).openStream();
	}
}
