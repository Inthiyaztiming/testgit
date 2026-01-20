package PracticePackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenProvider {

	public static Object[][] excelDriven(String filepath, String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetname);
		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data = new Object[rows - 1][columns];

		DataFormatter formatter = new DataFormatter();

		for (int i = 1; i < rows; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < columns; j++) {
				Cell cell = row.getCell(j);
				data[i - 1][j] = formatter.formatCellValue(cell);
			}
		}
		wb.close();
		return data;
	}

}
