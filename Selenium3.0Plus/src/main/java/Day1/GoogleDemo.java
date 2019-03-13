package Day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleDemo {

	public static void main(String[] args) throws AWTException, InterruptedException, InvalidFormatException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\v.ramiya.surendran\\Downloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
//		driver.get("http://www.allstate.com");
//	     WebElement searchicon = driver.findElement(By.linkText("Contact Us"));
//	     WebElement claimicon=driver.findElement(By.linkText("Claims"));
//	     Actions builder = new Actions(driver);
//	     builder.clickAndHold(searchicon).release(searchicon);
//	     builder.build().perform();
		
//	    driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
//	 	WebElement resize = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
//	 	Actions action = new Actions(driver);
//	 	action.dragAndDropBy(resize, 400, 200).perform();
	 	
//	 	driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); 
//        driver.findElement(By.xpath("/html/body/div/section/div/div[1]/ul[7]/li[3]/a')]")).click();            
//	           Robot robot = new Robot();             Thread.sleep(2000); // Thread.sleep throws InterruptedException    
//	           robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button               
//	           Thread.sleep(2000);  
//	           robot.keyPress(KeyEvent.VK_TAB);      
//	           Thread.sleep(2000);    
//	           robot.keyPress(KeyEvent.VK_TAB);      
//	           Thread.sleep(2000);    
//	           robot.keyPress(KeyEvent.VK_TAB);      
//	           Thread.sleep(2000);    
//	           robot.keyPress(KeyEvent.VK_ENTER); 
	           
//	           driver.get("http://www.allstate.com");
//	   	    
//	   		driver.manage().window().maximize();
//	   		
//	   		// how to get title of the webpage using javascript
//	   		
	   		JavascriptExecutor js = (JavascriptExecutor)driver;
	   		String sText =  js.executeScript("return document.title;").toString();
	   		System.out.println(sText);
	   		
	   		
	   		//how to click a button in Selenium WebDriver using JavaScript

	   		WebElement contact_icon = driver.findElement(By.linkText("Contact Us"));
	   		JavascriptExecutor executor = (JavascriptExecutor)driver;
	   		executor.executeScript("arguments[0].click();", contact_icon );
	   	

	   		
	   		//execute a alert popup window using javascript

	   		JavascriptExecutor js1 = (JavascriptExecutor)driver;
	   		js1.executeScript("alert('hello world');", driver.findElement(By.xpath(".//*[@id='s_Text']")));

	   	

		
	}

}
