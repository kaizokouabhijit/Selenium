package readexceldataapachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataDemo {
	
	public static void main(String [] args) throws IOException
	{
		File src = new File("C:\\Users\\abhijit.s\\OneDrive - SintecMedia Ltd\\Desktop\\Test.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
		String data1 = sheet1.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(data0 + "  " + data1);
		
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total number of rows "+rowcount);
		
		for(int i=0;i<rowcount;i++)
		{
			System.out.println(sheet1.getRow(i).getCell(0).getStringCellValue());
		}
		
		wb.close();
	}

}
