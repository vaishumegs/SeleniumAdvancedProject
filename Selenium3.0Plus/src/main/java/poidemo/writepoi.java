package poidemo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writepoi {

	public static void main(String[] args) throws InterruptedException, Exception 
	{
File scr=new File("C:\\Users\\v.ramiya.surendran\\Desktop\\Selenium\\Demos\\login.xlsx");
FileInputStream fis= new FileInputStream(scr);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet1=wb.getSheetAt(1) ;
sheet1.getRow(0).createCell(2).setCellValue("pass");
sheet1.getRow(1).createCell(2).setCellValue("fail");

FileOutputStream fo=new FileOutputStream(scr);
wb.write(fo);
wb.close();

}
}
