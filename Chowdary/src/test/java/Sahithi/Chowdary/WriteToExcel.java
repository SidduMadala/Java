package Sahithi.Chowdary;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws Exception {

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Siddu");

		List<String> data = Arrays.asList("Siddu", "Sridhar", "Mahesh");

		int rowNum = 0;

		for (String value : data) {
			Row row = sheet.createRow(rowNum++);
			Cell cell = row.createCell(0);
			cell.setCellValue(value);
		}

		FileOutputStream fos = new FileOutputStream("C:\\Users\\MadalaSi\\Desktop\\Madalasidduchowdary.xlsx");
		workbook.write(fos);
		fos.close();
		workbook.close();

		System.out.println("Data written successfully!");
	}
}
