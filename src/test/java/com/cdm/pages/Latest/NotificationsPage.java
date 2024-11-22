package com.cdm.pages.Latest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class NotificationsPage extends CommonActions {

	public NotificationsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	

	@FindBy(xpath = "//td[contains(text(),'License Expiry')]")
	WebElement licenseVisibility;

	
	@FindBy(xpath = "//a[contains(text(),'Notifications')]")
	WebElement Notificationtab;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement notificationnameThreeDot;

	@FindBy(xpath = "//input[@name='notificationname']")
	WebElement notificationnamesearchinput;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/img[1]")
	WebElement addUserGroupMapping;

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void Notification_tab() {
	
		wait(Notificationtab,logger);
		clickElement(Notificationtab, "");
		
	}
	public void notificationnameThreeDot() {
		clickElement(notificationnameThreeDot, "");
		//notificationnameThreeDot.click();

	}

	public void notificationnamesearchinput(String value) {
		SetInputENterKey(notificationnamesearchinput,"");
		SetInput(notificationnamesearchinput, value, value);
		
//		notificationnamesearchinput.sendKeys(Keys.ENTER);
//		notificationnamesearchinput.sendKeys(value);
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			clickElement(backDropShowing, "");
			//backDropShowing.click();
		}
	}

	public void addUserGroupMapping() {
		clickElement(addUserGroupMapping, "");
		//addUserGroupMapping.click();
	}

	public void licenseExpiryVisibility() {
		if (licenseVisibility.isDisplayed()){
            System.out.println("Element is visible!");
        } else {
            System.out.println("Element is not visible!");
        }
		
		
	}
}
