import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataExcel {

	public static void main(String[] args) throws Exception {
		
		String strPath="D:\\POI_Testdata\\TestData.xlsx";
		
		FileInputStream fis= new FileInputStream(strPath);
		
		Workbook wb= new XSSFWorkbook(fis);
		
		Sheet sh= wb.getSheetAt(0);
		
		int lastrowno = sh.getLastRowNum();
		
		for (int i=1; i<=lastrowno; i++)
		{
			Row row =sh.getRow(i);
			Cell cell = row.createCell(2);
			
			cell.setCellValue(i);
			
			FileOutputStream fos= new FileOutputStream(strPath);
			
			wb.write(fos);
			
			fos.close();
					
		}		
		

	}

}
