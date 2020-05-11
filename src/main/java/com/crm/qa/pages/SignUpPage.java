package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase  {
 
	
	@FindBy(id="store_submit")
	WebElement submitPopup;
	
	
	@FindBy(name="pincode")
	WebElement pincode;
	
	
	@FindBy(xpath=".//select[@name='area']/option[2]")
	WebElement areaSelected;
	
	public SignUpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	/*public String validateLoginPageTitle(){
		return driver.getTitle();
	}*/
	
	public LoginPage submitButton(){
		
		pincode.sendKeys("110092");
		areaSelected.click();
		submitPopup.click();
		
		return new LoginPage();
	}
	
	
	
	
	
	
}
