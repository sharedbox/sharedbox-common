package com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.utils.FileUtils;

/**
 * Call test of FileUtils class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/04/2021 - Version 1.0.0
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
		assertNotNull(FileUtils.readAllLines(this.getClass().getResource("/test/test.txt").getFile()));
	}

	/**
	 * 
	 * @throws IOException 
	 */
	@Test
	void writeTest() throws IOException{
		String value = "testWrite";
		assertDoesNotThrow(() -> FileUtils.write(value, this.getClass().getResource("/test/testWrite.txt").getFile()));

		String pth = null;
		RuntimeException thrown = assertThrows(RuntimeException.class
				, () -> FileUtils.write(value, pth));
		assertTrue(thrown.getMessage().contains("Invalid path"));
	}
	
	/**
	 * 
	 * @throws FileNotFoundException 
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	@Test
	void getFileTest() throws FileNotFoundException {
		assertNotNull(FileUtils.getFile(this.getClass().getResource("/test/testWrite.txt").getFile()));
	}

	/**
	 * 
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	@Test
	void getFileFromUrlTest() throws MalformedURLException, IOException {
		assertNotNull(FileUtils.getFileFromUrl("https://www.gstatic.com/android/market_images/web/play_prism_hlock_2x.png"));
	}
}
