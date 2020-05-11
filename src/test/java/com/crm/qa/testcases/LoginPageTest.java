package com.crm.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class LoginPageTest extends TestBase{

	LoginPage login;
	HomePage homePage;
	SignUpPage submitHomePage;
	
	 public LoginPageTest() {
	super();	
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		// login=new LoginPage();
		 submitHomePage= new SignUpPage();
	}
	
	/*@Test(priority=1)
	public void loginPageTitleTest()
	{
		//String title=login.validateLoginPageTitle();
	//	System.out.println("Title is :"+title);
	//	Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}*/
	

	
	
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException
	{
		login=	submitHomePage.submitButton();
		login.logUserInButton();
		login.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
