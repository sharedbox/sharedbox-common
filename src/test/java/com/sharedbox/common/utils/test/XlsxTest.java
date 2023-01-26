package com.sharedbox.common.utils.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.utils.StringUtils;
import com.sharedbox.common.utils.Xlsx;

/**
 * Call test of Xlsx class
 *  
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 08/03/2021 - Version 1.0.0
 */
public class XlsxTest {
	/**
	 * Test constructor class
	 * @throws IOException 
	 * @throws IllegalArgumentException 
	 */
	@Test
	void test() throws Exception {
		String os = System.getProperty("os.name");
		String xlsxFilePath = this.getClass().getResource("/test/sb_test.xlsx").getFile();
		if (!os.toUpperCase().contains("LINUX")) {
			xlsxFilePath = xlsxFilePath.substring(1);
		}
		
		Xlsx xlsx = new Xlsx(xlsxFilePath);
		assertNotNull(xlsx);

		IllegalArgumentException thrown = null;
		
		thrown = assertThrows(IllegalArgumentException.class, () -> new Xlsx("/test/2"));
		assertTrue(thrown.getMessage().contains("File is not exist"));

		final String sbLogoPath = os.toUpperCase().contains("LINUX")
				? this.getClass().getResource("/test/SBLogo.png").getFile()
						: this.getClass().getResource("/test/SBLogo.png").getFile().substring(1);
	
		thrown = assertThrows(IllegalArgumentException.class
				, () -> new Xlsx(sbLogoPath));
		assertTrue(thrown.getMessage().contains("Invalid file"));

		File file = null;
		thrown = assertThrows(IllegalArgumentException.class, () -> new Xlsx(file));
		assertTrue(thrown.getMessage().contains("Path is null"));
	}
	
	/**
	 * Test reader worksheet
	 * @throws Exception 
	 * @throws IOException 
	 * @throws IllegalArgumentException 
	 */
	@Test
	void readerWorksheetTest() throws Exception {
		String os = System.getProperty("os.name");
		String xlsxFilePath = this.getClass().getResource("/test/sb_test.xlsx").getFile();
		if (!os.toUpperCase().contains("LINUX")) {
			xlsxFilePath = xlsxFilePath.substring(1);
		}
		
		Xlsx xlsx = new Xlsx(xlsxFilePath);
		assertNotNull(xlsx.readerWorksheet("WorksheetTest"));
		assertDoesNotThrow(() -> xlsx.close());
	}
	
	/**
	 * 
	 */
	@Test
	void writeWorksheetTest() throws Exception {
		String os = System.getProperty("os.name");
		String xlsxFilePath = this.getClass().getResource("/test/sb_test.xlsx").getFile();
		if (!os.toUpperCase().contains("LINUX")) {
			xlsxFilePath = xlsxFilePath.substring(1);
		}
		
		Xlsx xlsx = new Xlsx(xlsxFilePath);
		
		List<String[]> rows = new ArrayList<String[]>();
		
		String worksheetName = "WSN_" + StringUtils.strRandom(2, false, true, false, false);
		String[] row = new String[2];
		row[0] = "Test A 1";
		row[1] = "Test B 1";
		rows.add(row);

		row[0] = "Test A 2";
		row[1] = "Test B 2";
		rows.add(row);

		row[0] = "Test A 3";
		row[1] = "Test B 3";
		rows.add(row);

		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> xlsx.writeWorksheet(null, null));
		assertTrue(thrown.getMessage().contains("Rows is null"));
				
		thrown = assertThrows(IllegalArgumentException.class, () -> xlsx.writeWorksheet(rows, null));
		assertTrue(thrown.getMessage().contains("Invalid worksheet name"));
		assertDoesNotThrow(() -> xlsx.writeWorksheet(rows, worksheetName));
		assertDoesNotThrow(() -> xlsx.writeWorksheet(rows, "Test name"));
		assertDoesNotThrow(() -> xlsx.removeWorksheet(worksheetName));
		assertDoesNotThrow(() -> xlsx.close());
	}
}
