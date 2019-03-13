package Day1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POIDemo {

	public static void main(String[] args) throws InterruptedException, Exception 
	{
		
		File scr=new File("C://Python//data.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(scr);
XSSFSheet sheet1=wb.getSheetAt(0) ;
	
String s=sheet1.getRow(0).getCell(0).getStringCellValue();

String s1=sheet1.getRow(0).getCell(1).getStringCellValue();

System.out.println(s);
System.out.println(s1);

wb.close();

}
}
