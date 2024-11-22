package com.cdm.pages.Latest;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class LogOutPage extends CommonActions {

	public LogOutPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@aria-haspopup='true']/span/img") // these all are locators
	WebElement profileImage;

	@FindBy(xpath = "//button[contains(text(),'Logout')]")
	WebElement Logout;

	
	public void profileImage() {
		Actions act = new Actions(driver);
		act.moveToElement(profileImage).build().perform();
		clickElement(profileImage, "");
		//profileImage.click();
	}
	
	
	public void logout() {
		
		Actions act = new Actions(driver);
		act.moveToElement(Logout).build().perform();
		clickElement(Logout, "");
		//Logout.click();
	}

}
