package Sahithi.Chowdary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EData {

	public static void main(String[] args) throws IOException {

		try (FileInputStream fis = new FileInputStream("C:\\Users\\MadalaSi\\Desktop\\DSR.xlsx");
				Workbook book = WorkbookFactory.create(fis)) {

			String sid = book.getSheet("MyData").getRow(0).getCell(0).getStringCellValue();

			System.out.println(sid);
		}
	}
}