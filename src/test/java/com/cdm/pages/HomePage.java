package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class HomePage extends CommonActions {

	public HomePage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "	//button[contains(text(),'Forgot Password')]")
	WebElement forgotPasswordLink;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginbuttonHome;

	@FindBy(xpath = "//input[@formcontrolname='emailid']")
	WebElement forgotemailidsetup;

	@FindBy(xpath = "//button[contains(text(),'Get Reset Password Link')]")
	WebElement resetPasswordLink;

	public void forgotpasswordLink() {

		// forgotPasswordLink.click();
		clickElement(forgotPasswordLink, "");

	}

	public void setinputforgotemailidsetup(String value) {

		SetInputENterKey(forgotemailidsetup, "");
		SetInput(forgotemailidsetup, value, value);
		// forgotemailidsetup.sendKeys(Keys.ENTER);
//		forgotemailidsetup.sendKeys(value);

	}

	public void loginbuttonHomeFun() {

		clickElement(loginbuttonHome, "");

	}

	public WebElement getLoginButton() {
		return loginbuttonHome;
	}

	public void getResetPasswordLink() {

		// resetPasswordLink.click();
		clickElement(resetPasswordLink, "");

	}

}
