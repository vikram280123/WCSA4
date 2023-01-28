package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriverframework {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream object =new  FileInputStream("./data/ipl.xlsx");
		Workbook wb=WorkbookFactory.create(object);
		                   Sheet sheet = wb.getSheet("ipl");
		                   Row row = sheet.getRow(3);
		                       Cell cell = row.getCell(0);
		                      String data = cell.getStringCellValue();
		                      System.out.println(data);
		
	}

}
