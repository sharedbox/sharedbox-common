package br.com.sharedbox.common.utils;

import java.io.File;
import java.io.IOException;
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
	public String[] readAllLines(String path) throws IOException {
		return readAllLines(new File(path));
	}
	
	/**
	 * 
	 * @return
	 * @throws IOException 
	 */
	public String[] readAllLines(File path) throws IOException {
		return readAllLines(path.toPath());
	}
	
	/**
	 * 
	 * @return
	 * @throws IOException 
	 */
	public String[] readAllLines(Path path) throws IOException {
		List<String> lines = new ArrayList<String>();
		return Files.readAllLines(path, StandardCharsets.UTF_8)
				.toArray(new String[lines.size()]);
	}
}
