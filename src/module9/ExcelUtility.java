package module9;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
	
		FileInputStream fis = new FileInputStream("D:\\Training\\Programs\\Edureka_28July\\src\\module9\\TestData\\TestData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheetAt(0);
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String celval = cell.getStringCellValue();
		System.out.println(celval);		
	}
}
