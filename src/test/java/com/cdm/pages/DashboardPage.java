package com.cdm.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class DashboardPage extends CommonActions {

	public DashboardPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/button[3]")
	WebElement updateProfile;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/a[1]/img[1]")
	WebElement helpicon;

	@FindBy(xpath = "//div[contains(text(),'Active EDGE Groups')]")
	WebElement oncardActiveRepositorieswidget;

	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/button[4]")
	WebElement logOut;

	@FindBy(xpath = "	//button[contains(text(),'Update')]")
	WebElement updateButton;

	@FindBy(xpath = "//input[@formcontrolname='selectedFirstName']")
	WebElement selectedFirstName;

	@FindBy(xpath = "//input[@formcontrolname='selectedLastName']")
	WebElement selectedLastName;

	@FindBy(xpath = "//input[@formcontrolname='selectedEmail']")
	WebElement selectedEmailfield;

	@FindBy(xpath = "//input[@formcontrolname='selectedContact']")
	WebElement selectedContactfield;

	@FindBy(xpath = "//input[@formcontrolname='selectedEmail']")
	WebElement selectedEmail;

	@FindBy(xpath = "//input[@formcontrolname='selectedContact']")
	WebElement selectedContact;

	@FindBy(xpath = "//input[@formcontrolname='selectedOldPassword']")
	WebElement selectedOldPassword;

	@FindBy(xpath = "//input[@formcontrolname='selectedOldPassword']")
	WebElement selectedNewPassword;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement updateProfileButton;

	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]")
	WebElement changePassword;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/button[1]/span[1]/img[1]")
	WebElement profileIcon;

	@FindBy(xpath = "//div[@class='example-toolbar sticky']/div/div/div/p/img")
	WebElement expandtoggle;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/img[2]")
	WebElement countryflag;

	@FindBy(xpath = "//input[@type='text']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement LoginBtn;

	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	WebElement dashboardTitle;

	public void enteruserid(String userid) {
		SetInput(username, userid, userid + " has been entered into username field");
	}

	public void enterpwd(String pwd) {
		SetInput(password, pwd, pwd + " has been entered into password field");
	}

	public void clickLogin() {
		clickElement(LoginBtn, "Login button clicked");
	}

	public String verifyUserIsOnDashboard() {
		if(dashboardTitle==null) {
			return "";
		}
		
		//return aboutTitle.getText();
		
		return getText(dashboardTitle);

//		Assert.assertEquals("Dashboard", getText(dashboardTitle));
	}

	public void expandtoggle() {
		clickElement(expandtoggle,"");		 
	}

	public void countryflagicon() {
		clickElement(countryflag,"");

	}

	public void profileIcon() {

		//profileIcon.click();
		clickElement(profileIcon,"");
	}

	public void updateProfile() {
		clickElement(updateProfile,"");
		//updateProfile.click();
	}

	public void changePassword() {
		//changePassword.click();
		clickElement(changePassword,"");
	}

	public void selectedOldPassword(String value) {
		
		SetInputENterKey(selectedOldPassword,"");
		SetInput(selectedOldPassword, value, value);
		//selectedOldPassword.sendKeys(Keys.ENTER);
		//selectedOldPassword.sendKeys(value);
	}

	public void selectedNewPassword(String value) {
		
		
		SetInputENterKey(selectedNewPassword,"");
		SetInput(selectedNewPassword, value, value);
//		selectedNewPassword.sendKeys(Keys.ENTER);
//		selectedNewPassword.sendKeys(value);
	}

	public void update() {
		clickElement(updateButton, "");
		//updateButton.click();
	}

	public void updateselectedFirstName(String value) {
		SetInputENterKey(selectedFirstName,"");
		SetInput(selectedFirstName, value, value);
//		selectedFirstName.sendKeys(Keys.ENTER);
//		selectedFirstName.sendKeys(value);

	}

	public void updateselecteLastName(String value) {
		//selectedLastName.sendKeys(Keys.ENTER);
		//selectedLastName.sendKeys(value);
		SetInputENterKey(selectedLastName,"");
		SetInput(selectedLastName, value, value);
	}

	public void updateselectedEmailId(String value) {
//		selectedEmailfield.sendKeys(Keys.ENTER);
//		selectedEmailfield.sendKeys(value);
		
		SetInputENterKey(selectedEmailfield,"");
		SetInput(selectedEmailfield, value, value);

	}

	public void updatecontactfield(String value) {

		//selectedContact.sendKeys(Keys.ENTER);
		//selectedContact.sendKeys(value);
		
		SetInputENterKey(selectedContact,"");
		SetInput(selectedContact, value, value);
	}

	public void logout() {
		clickElement(logOut, "");
		//logOut.click();
	}

	public void zoomlevel() {

		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='90%'");

	}

	public void oncardboardboxes() {
		if (oncardActiveRepositorieswidget.isDisplayed()) {
            System.out.println("card is displayed!");
        } else {
            System.out.println("card is not displayed!");
        }

		

	}

	public void helpicon() {
		clickElement(helpicon, "");
		//helpicon.click();
	}

	public String removalofEneredTextForFirstName() {

		return removalofEneredText(selectedFirstName);

	}

	public String removalofEneredTextForLastName() {

		return removalofEneredText(selectedLastName);

	}

	public String removalofEneredTextForEmailField() {

		return removalofEneredText(selectedEmailfield);

	}
	
	public String removalofEneredTextForPhoneNumber() {

		return removalofEneredText(selectedContactfield);

	}
}
