package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

    public class LoginPageUsingPageFactory {

	WebDriver driver;
	
	public LoginPageUsingPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	

	@FindBy(how=How.ID, using="first_name")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(how=How.ID, using="last_name")
	WebElement lastname;
	
	
	@FindBy(how=How.ID,using="mailing_address")
	WebElement address;
	
	
	@FindBy(how=How.ID,using="date_of_birth")
	WebElement DOB;
	
	
	@FindBy(how=How.ID,using="city")
	WebElement city;
	
	@FindBy(how=How.ID,using="zip")
	WebElement Zipcode;
	
	@FindBy(how=How.XPATH, using="html/body/div[1]/div[1]/div[2]/div/div/div[2]/div[1]/form/div[2]/div/ul/li/button")
	WebElement continueButton;
	
	@FindBy(how=How.ID, using="state")
	WebElement dropdown;
	
	
	
	public void form(String first, String last,String addr,String date,String cityname,String zip)
	{
		firstname.sendKeys(first);
		lastname.sendKeys(last);
		address.sendKeys(addr);
		DOB.sendKeys(date);
		city.sendKeys(cityname);
		Zipcode.sendKeys(zip);
		
	}
	
	public void selectState(String state)
	{
		 Select selectByVisibleText = new Select (dropdown); 
		 
         selectByVisibleText.selectByVisibleText(state); 
	}

	public void clickContinueButton()
	{
		continueButton.click();
	}

}
