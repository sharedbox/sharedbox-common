package com.sharedbox.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * This class read and write excel document
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 08/02/2021 - Version 1.0.0
 */
public class Xlsx {	
	/**
	 * Xlsx workbook
	 */
	private final Workbook workbook;
	
	/**
	 * 
	 */
	private File file;
	
	/**
	 * Constructor
	 * @param pathDoc
	 */
	public Xlsx(String pathDoc) throws Exception, IOException, IllegalArgumentException {
		this(new File(pathDoc));
	}

	/**
	 * Constructor
	 * @throws IOException 
	 */
	public Xlsx(File file) throws Exception, IOException, IllegalArgumentException{
		this.workbook = new XSSFWorkbook(new FileInputStream(checkFile(file)));
		this.file = file;
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	private static File checkFile(File file) {
		if (file == null) {
			throw new IllegalArgumentException("Path is null"); 
		}
		
		if (!file.exists()) {
			throw new IllegalArgumentException("File is not exist"); 
		}
		
		if (!file.getName().toUpperCase().endsWith("XLSX")) {
			throw new IllegalArgumentException("Invalid file"); 
		}
		return file;
	}

	/**
	 * Get values on the workbook
	 * @param worksheetName
	 * @return list values
	 */
	public List<String[]> readerWorksheet(String worksheetName) {
		Sheet worksheet = this.workbook.getSheet(worksheetName);
		List<String[]> listRows = new ArrayList<String[]>();
		for (Row row : worksheet) {
			int numberOfCells = row.getPhysicalNumberOfCells();
			String[] cells = new String[numberOfCells];
			
			for (int i = 0; i < numberOfCells; i++) {
				Cell cell = row.getCell(i);
				if (cell.getCellType() != CellType.BLANK) {
					cells[i] = cell.getStringCellValue();
				}
			}
			listRows.add(cells);
		}
		return listRows;
	}
	
	/**
	 * Write data on xlsx file
	 * @param rows
	 * @param worksheetName
	 */
	public void writeWorksheet(List<String[]> rows, String worksheetName) {
		if (rows == null) {
			throw new IllegalArgumentException("Rows is null");
		}

		if (StringUtils.isEmpty(worksheetName)) {
			throw new IllegalArgumentException("Invalid worksheet name");
		}
		
		Sheet worksheet = this.workbook.getSheet(worksheetName);
		if (worksheet == null) {
			worksheet = this.workbook.createSheet(worksheetName);
		}
		
	    int rowIndex = 0;
		for (String[] rowStr : rows) {
	        Row row = worksheet.createRow(rowIndex);
		    int colIndex = 0;
			for(String cellStr : rowStr) {
				Cell cell = row.createCell(colIndex);
				cell.setCellValue(cellStr);
				if(colIndex >= row.getPhysicalNumberOfCells()) {
					break;
				}
				colIndex++;
			}
	        rowIndex++;
		}
		
		try {
			FileOutputStream outputStream = new FileOutputStream(this.file);
			this.workbook.write(outputStream);
		} catch (Exception e) {
			throw new RuntimeException("Error on write xlsx file ", e);
		}
	}
	
	/**
	 * Remove worksheet
	 * @param worksheetName
	 */
	public void removeWorksheet(String worksheetName) {
		removeWorksheet(this.workbook.getSheetIndex(worksheetName));
	}
	
	/**
	 * Remove worksheet
	 * @param index
	 */
	public void removeWorksheet(int index) {
		this.workbook.removeSheetAt(index);
	}
	
	/**
	 * Close workbook
	 * @throws IOException
	 */
	public void close() throws IOException {
		FileOutputStream out = new FileOutputStream(this.file);
		this.workbook.write(out);
		out.close();
		this.workbook.close();
	}
}
