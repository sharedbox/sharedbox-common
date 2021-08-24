package br.com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.utils.FileUtils;

/**
 * Call test of FileUtils class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/04/2021
 */
public class FileUtilsTest {
	/**
	 * Test constructor class
	 */
	@Test
	void constructorTest() {
		assertNotNull(new FileUtils());
	}

	/**
	 * 
	 * @throws IOException 
	 */
	@Test
	void readAllLinesTest() throws IOException {
		assertNotNull(FileUtils.readAllLines("D:\\SharedBox\\test\\test.txt"));
	}

	/**
	 * 
	 * @throws IOException 
	 */
	@Test
	void writeTest() throws IOException{
		String value = "testWrite";
		String path = "D:\\SharedBox\\test\\testWrite.txt";
		assertDoesNotThrow(() -> FileUtils.write(value, path));
	}
}
