package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase  {

	
	@FindBy(name="filter_name")
	WebElement filterName;
	
	
	@FindBy(id="btn-login")
	WebElement loginButton;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	/*public String validateLoginPageTitle(){
		return driver.getTitle();
	}*/
	
	/*public void submitButton(){
		submitPopup.click();
	}*/
	
	public void logUserInButton(){
		loginButton.click();
	}
	
	
	
	
	
	
	
	
}
