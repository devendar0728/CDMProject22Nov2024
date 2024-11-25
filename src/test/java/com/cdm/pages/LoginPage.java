package com.cdm.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class LoginPage extends CommonActions {

	public LoginPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),' Invalid Username ! ')]")
	WebElement invaliderrormessage;


	@FindBy(xpath="//mat-checkbox/label[@for='mat-checkbox-1-input']/span[1]")

	WebElement checkboxTermsandConditions;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-auth[1]/app-login[1]/div[1]/div[1]/form[1]/mat-card[1]/div[1]/mat-card-content[1]/div[3]/mat-checkbox[1]/label[1]/span[1]/input")

	WebElement checkboxTermsandConditionsLabel;

	@FindBy(xpath = "//label[contains(text(),'Username')]")
	WebElement LoginTitle;

	@FindBy(xpath = "//input[@formcontrolname='username']") // these all are locators
	WebElement username;

	@FindBy(xpath = "//label[contains(text(),'Username')]")
	WebElement loginheaderTitle;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement password;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-auth[1]/app-login[1]/div[1]/div[1]/form[1]/mat-card[1]/mat-card-actions[1]/div[1]/button[1]")
	WebElement LoginBtn;

	@FindBy(xpath = "//div[contains(text(),'Invalid User Name !')]")
	WebElement errmsg;

	@FindBy(xpath = "//div[contains(text(),'Invalid User Name !')]")
	WebElement errmsgpwd;

	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/button[4]")
	WebElement logOut;

//	@FindBy(xpath = "//*[text()='Password is required']")
//	WebElement errmsgpassword;

	@FindBy(xpath = "//input[@formcontrolname='username']/../div/div")
	WebElement errmsgusername;

	@FindBy(xpath = "//input[@formcontrolname='password']/../div/div")
	WebElement errmsgpassword;

	@FindBy(xpath = "//span[@class='far fa-eye-slash showpwd']")
	WebElement showpasswordicon;

	@FindBy(xpath = "//div[contains(text(),'DEPLOYMENT REPORT')]")
	WebElement dashboard;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/button[1]/span[1]/img[1]")
	WebElement profileIcon;

	@FindBy(xpath = "//span[contains(text(),'Super Admin')]")
	WebElement SuperAdmin;



	@FindBy(xpath = "//div[contains(text(),'Invalid User Name !')]")
	WebElement invalidUserName;

	public void initializeWebDriver(String browser) {

		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			throw new IllegalArgumentException("Invalid browser specified: " + browser);
		}
		// You can add more browsers based on your requirements
	}

	public WebElement getUsernameField() {
		return username;
	}

	public WebElement hasTitleElement() {

		return LoginTitle;
	}

	public WebElement getPasswordField() {
		return password;
	}

	public int getUsernameFieldLength() {
		return username.getText().length();

	}

	public int getPasswordFieldLength() {
		return password.getAttribute("value").length();
	}

	public void pressEnterKey() {
		SetInputENterKey(password,"");

		//password.sendKeys(Keys.ENTER);
	}

	public String verifyTitle() {
		if (LoginTitle == null) {
			return "";
		}

		return LoginTitle.getText();
	}

	public void calculateLoginTime() {
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();

		// Calculate and print the login time
		long loginTime = endTime - startTime;
		System.out.println("Time taken to log in: " + loginTime + " milliseconds");

	}

	public boolean isInputFieldVisible() {
		return username.isDisplayed();
	}

	public void enterCredentials(String uname, String pwd) {

		username.sendKeys(uname);
		password.sendKeys(pwd);
	}

	public void clickLoginButton() {

		clickElement(LoginBtn, "");
		// LoginBtn.click();
	}

	public void profileIcon() {
		clickElement(profileIcon, "");
		// profileIcon.click();
	}

	public void SuperAdmin() {
		clickElement(SuperAdmin, "");
		// SuperAdmin.click();
	}

	public void enteruserid(String value) {
//		username.sendKeys(Keys.ENTER);
//		username.sendKeys(value);

		SetInputENterKey(username,"");
		SetInput(username, value, value);
	}

	public void enterpwd(String value) {

		SetInputENterKey(password,"");
		SetInput(password, value, value);
//		password.sendKeys(Keys.ENTER);
//		password.sendKeys(value);
	}

	public void clickshowpwd() {
		clickElement(showpasswordicon, "");
		//showpasswordicon.click();
	}

	public void clickLogin() {
		clickElement(LoginBtn, "Clicked on Login Button");
		// LoginBtn.click();
	}

	public void login(String uid, String pass) {

		SetInput(username, uid, uid + " has been entered into username field");
		SetInput(password, pass, pass + " has been entered into password field");
		//clickElement(LoginBtn, "Login button clicked");

	}

	public String verifyErrorMsg() {
		return errmsg.getText();
	}

	public String verifyErrorMsgforLogin() {
		return invalidUserName.getText();
	}

	public void verifyDashboard() {
		ElementExist(dashboard, "Dashboard page displayed successfully");

	}

	public void verifyErrorMsgusername() {
		ElementExist(errmsgusername, "Error message User Name is required validated successfully");
	}

	public void verifyErrorMsgpwd() {
		ElementExist(errmsgpassword, "Error message Password is required validated successfully");

	}

	public void newTab() {
		driver.switchTo().newWindow(WindowType.TAB);
	}

	public void verifyFont(WebElement element, String expectedFont) {
		String actualFont = element.getCssValue("font-family");

		Assert.assertEquals(expectedFont, actualFont);
	}

	public void browserBack() {
		driver.navigate().back();
	}

	public void verifyTextColor(WebElement element, String expectedColor) {
		String actualColor = element.getCssValue("color");

		Assert.assertEquals(expectedColor, actualColor);
	}

	public void verifyColorCoding(WebElement element, String expectedColorCode) {
		String actualColorCode = element.getCssValue("background-color");

		Assert.assertEquals(expectedColorCode, actualColorCode);
	}

	public WebElement getUsernameInput() {
		return username;
	}

	public WebElement getPasswordInput() {
		return password;
	}

	public void enterCredentialsLogin(String username, String password) {
		getUsernameInput().sendKeys(username);
		getPasswordInput().sendKeys(password);


	}

	public void opennewTab() {
		// Opens a new tab and switches to new tab
		driver.switchTo().newWindow(WindowType.TAB);

	}

	public String get_validationmessageusername() {

		wait(errmsgusername, logger);
		if (errmsgusername == null) {
			return "";
		}
		String message = errmsgusername.getText();

		return message.trim();
	}

	public String get_validationmessagepassword() {

		wait(errmsgpassword, logger);
		if (errmsgpassword == null) {
			return "";
		}
		String message = errmsgpassword.getText();

		return message.trim();
	}

	public String get_invaliduserName() {

		if (invaliderrormessage == null) {
			return "";
		}
		String message = invaliderrormessage.getText();

		return message.trim();
	}


	public void setUsernameFieldLength(String userId) {
		username.sendKeys(userId);

	}

	public void logout() {
		clickElement(logOut, "");
		// logOut.click();
	}

	public String getUsernameFieldValue() {
		LoginPage lp = new LoginPage(driver, logger);
		WebElement usernameField = lp.getUsernameInput();
		return usernameField.getAttribute("value");
	}

	// Method to get the value of the password field
	public String getPasswordFieldValue() {

		LoginPage lp = new LoginPage(driver, logger);
		WebElement passwordField = lp.getPasswordInput();

		return passwordField.getAttribute("value");
	}

	public void checkboxClickTermsandConditions() {

		clickElement(checkboxTermsandConditions,"clicking on terms and condition checkbox");

	}



}
