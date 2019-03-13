package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	WebDriver driver;
	
	By firstname=By.id("first_name");
	By lastname=By.id("last_name");
	By address=By.id("mailing_address");
	By DOB=By.id("date_of_birth");
	By city=By.id("city");
	By Zipcode=By.id("zip");
	By continueButton=By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/div[1]/form/div[2]/div/ul/li/button");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeFirstName(String name)
	{
		driver.findElement(firstname).sendKeys(name);
	}
	
	public void typeLastName(String name)
	{
		driver.findElement(lastname).sendKeys(name);
	}
	
	public void typeAdress(String addr)
	{
		driver.findElement(address).sendKeys(addr);
	}
	
	public void typeDOB(String dob)
	{
		driver.findElement(DOB).sendKeys(dob);
	}
	public void typeCity(String cityname)
	{
		driver.findElement(city).sendKeys(cityname);
	}
	
	public void typeZipcode(String code)
	{
		driver.findElement(Zipcode).sendKeys(code);
	}
	
	public void selectState(String state)
	{
		 Select selectByVisibleText = new Select (driver.findElement(By.id("state"))); 
		 
         selectByVisibleText.selectByVisibleText(state); 
	}

	public void clickContinueButton()
	{
		driver.findElement(continueButton).click();
	}

}
