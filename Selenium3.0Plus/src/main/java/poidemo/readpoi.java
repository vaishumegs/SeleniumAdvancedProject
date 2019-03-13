package poidemo;


import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class readpoi {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v.ramiya.surendran\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoaut.com/");
	
		File src= new File("C://Python//data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// HSSFWorkbook - for xls file
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = 	sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is : " +data0);
		driver.findElement(By.name("userName")).sendKeys(data0);
		
		String data1 = 	sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is : " +data1);
		driver.findElement(By.name("password")).sendKeys(data1);
		driver.findElement(By.name("login")).click();
		wb.close(); 

}
}
