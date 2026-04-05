package Sahithi.Chowdary;

import java.io.File;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
	@Test
	public void read() throws Exception {
		File file = new File("C:\\Users\\MadalaSi\\Desktop\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		System.out.println(sheet);
		int row = sheet.getLastRowNum();
		DataFormatter f = new DataFormatter();
		for (int i = 1; i < row; i++) {
			String username = f.formatCellValue(sheet.getRow(i).getCell(0));
			String password = f.formatCellValue(sheet.getRow(i).getCell(1));
			System.out.println("UserName:__" + username + " Password:__" + password);

		}
	}
}
