package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.LoginPage;

public class LoginPageDemo {

	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://purchase-stest.allstate.com/onlinesalesweb/app/auto/");
		LoginPage login=new LoginPage(driver);
		login.typeFirstName("james");
		login.typeLastName("eve");
		login.typeAdress("701 N Michigan Ave");
		login.typeCity("Chicago");
		login.typeDOB("04-23-1976");
		login.typeZipcode("60611");
		login.selectState("IL");
	
		
		
	}
}
