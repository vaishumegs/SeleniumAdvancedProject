package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import LibraryFunctions.BrowserFactory;
import PageFactory.LoginPageUsingPageFactory;

    public class LoginPageUsingPageFactoryDemoNew {

	public static void main(String args[])
	{
		//calling the utillitypack for initializing the browser and passing the url
		WebDriver driver=BrowserFactory.startBrowser("firefox", "https://purchase-stest.allstate.com/onlinesalesweb/app/auto/");
		
		//this will create a page object of loginpageNew class and return the object.
		LoginPageUsingPageFactory login=PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
		
		
		//call the method
	login.form("john", "eve", "701 N Michigan Ave", "04-23-1976", "Chicago", "60611");
	login.selectState("IL");
	login.clickContinueButton();
	}
}

    
    
    
    
    