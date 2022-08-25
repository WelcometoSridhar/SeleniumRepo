package mavenPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenExcelReading {
	
	
	public static void main(String[] args) throws IOException {
		
//		WebDriver driver= new ChromeDriver();
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//		
//		driver.get("https:\\www.google.com");
		
		
		//System.out.println("Hi");
		
//		File
//		WorkBook
//		Sheet
//		Row
//		Cell
		
//		HSSFWorkbook workbook= new HSSFWorkbook();
//		
//		HSSFSheet   sheet=workbook.createSheet();
//		
//		sheet.createRow(0);
//		sheet.getRow(0).createCell(0).setCellValue("One");
//		sheet.getRow(0).createCell(1).setCellValue("Two");
//		
//		sheet.createRow(1);
//		sheet.getRow(1).createCell(0).setCellValue("Three");
//		sheet.getRow(1).createCell(1).setCellValue("Four");
//		
//		File fil =new File("C:\\Ecplise_Workspace\\OpenCartProject\\ExcelFile\\Test.xlsx");
//		
//		
//		workbook.write(fil);
//		
//		workbook.close();	
		
		String excelfilepath="C:\\Ecplise_Workspace\\OpenCartProject\\Testdata\\TestData.xlsx";
		
		File fil=new File(excelfilepath);
		
		FileInputStream fis= new FileInputStream(fil);
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		XSSFSheet worksheet = workbook.getSheet("Testdata");
		
		int Totrowno= worksheet.getLastRowNum();
		
		int Totcolno= worksheet.getRow(1).getLastCellNum();
		
		
		for (int r=1; r<=Totrowno; r++)
		{
			XSSFRow row= worksheet.getRow(r);
			
			for (int c=1; c<Totcolno; c++)
			{
				XSSFCell cell=row.getCell(c);
				
				
				switch (cell.getCellType())
				{
				case STRING :
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
							
				}
				System.out.println(" | ");
			}
			System.out.println();
			
		}
			
			
	}

}
