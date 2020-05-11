package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	//page Factory
	
	@FindBy(id="btn-login")
	WebElement loginButton;
	
	
	@FindBy(name="login_mobile")
	WebElement username;
	
	@FindBy(name="login_password")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='login_form']/p[3]/input")
	WebElement submitBtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	/*public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	*/
	
	public void logUserInButton() throws InterruptedException{
		Thread.sleep(2000);
		loginButton.click();
	}
	
	
	public HomePage login(String un,String pwd)
	{
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		
		return new HomePage();
	}
	
	
	
}
