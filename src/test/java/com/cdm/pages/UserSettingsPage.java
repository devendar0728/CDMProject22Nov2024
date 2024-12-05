package com.cdm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserSettingsPage extends CommonActions {

	public UserSettingsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[@class='far fa-eye-slash showpwd']")
	WebElement eyeiconpassword;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deleteButtonNameToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement editButtonNameToolTip;

	@FindBy(xpath = "//div[@id='toast-container']")
	WebElement sucessmessage;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/img[1]")
	WebElement edituserbutton;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement FirstNameDot;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement LastNameDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement EmailDot;

	@FindBy(xpath = "//div[@class='tableCard']/../div/div[1]/div/span/img[1]")
	WebElement addButton;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement RoleNameDot;

	@FindBy(xpath = "//input[@data-placeholder='password']")
	WebElement password;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement StatusDot;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/label[1]/input[1]")
	WebElement activestatusSelection;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButton;

	@FindBy(xpath = "//input[@data-placeholder='First Name']")
	WebElement firstNameinputAdd;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastNameinput;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement emailidinput;

	@FindBy(xpath = "//input[@name='rolename']")
	WebElement roleNameinput;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/label[1]/input[1]")
	WebElement statusinputActive;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[2]/label[1]/input[1]")
	WebElement statusinputinActive;

	@FindBy(xpath = "///span[@innertext=' Settings ']")
	WebElement Setting_tab;

	@FindBy(xpath = "//ul[@class='nav']/li[2]")
	WebElement Users_tab;

	@FindBy(xpath = "//ul[@class='nav']/li[4]")
	WebElement Users_Role;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-users[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement Refresh_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-users[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement Add_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-users[1]/div[1]/div[1]/div[1]/span[1]/img[2]")
	WebElement BulkUpload_btn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-users[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement Download_btn;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButton;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/img[2]")
	WebElement deleteButton;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement yesbutton;

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstNameInput;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastNameInput;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement emailidInput;

	@FindBy(xpath = "//input[@name='contact']")
	WebElement phoneInput;

	public void Setting_tab() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			waitElementToVisible("//mat-nav-list//img");
			appendFragmentWithOutPath("/#/home/setting");
			waitElementToVisible("//mat-nav-list//img");
		} catch (Exception e) {

			e.printStackTrace();
		}


	}

	public void Users_tab() {
		clickElement(Users_tab, "");
		// Users_tab.click();
	}

	public boolean isVisibleRefresh() {

		return Refresh_btn != null && Refresh_btn.isDisplayed();
	}

	public boolean isVisibleAdd() {

		return Add_btn != null && Add_btn.isDisplayed();
	}

	public boolean isVisibleUpload() {

		return BulkUpload_btn != null && BulkUpload_btn.isDisplayed();
	}

	public boolean isVisibleDownload() {

		return Download_btn != null && Download_btn.isDisplayed();
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(css = ".cdk-overlay-container")
	WebElement cdkcontainer;

	public void FirstNameDot() {
		clickElement(FirstNameDot, "");

		// FirstNameDot.click();
	}

	public void LastNameDot() {

		clickElement(LastNameDot, "");

		// LastNameDot.click();
	}

	public void EmailDot() {
		clickElement(EmailDot, "");
		// EmailDot.click();
	}

	public void RoleNameDot() {
		clickElement(RoleNameDot, "");
		// RoleNameDot.click();
	}

	public void status() {
		clickElement(StatusDot, "");
		// StatusDot.click();
	}

	public void firstNameinput(String value) {
		SetInputENterKey(firstNameInput, "");
		SetInput(firstNameInput, value, value);
//		firstNameInput.sendKeys(Keys.ENTER);
//		firstNameInput.sendKeys(value);
	}

	public void firstNameinputSearch() {
		SetInputENterKey(firstNameInput, "");

		// firstNameInput.sendKeys(Keys.ENTER);

	}

	public void lastNameinput(String value) {
		SetInputENterKey(lastNameinput, "");
		SetInput(lastNameinput, value, value);

//		lastNameinput.sendKeys(Keys.ENTER);
//		lastNameinput.sendKeys(value);
	}

	public void emailidinput(String value) {
		SetInputENterKey(emailidinput, "");
		SetInput(emailidinput, value, value);

//		emailidinput.sendKeys(Keys.ENTER);
//		emailidinput.sendKeys(value);
	}

	public void phoneInput(String value) {
		SetInputENterKey(phoneInput, "");
		SetInput(phoneInput, value, value);

//		phoneInput.sendKeys(Keys.ENTER);
//		phoneInput.sendKeys(value);
	}

	public void password(String value) {
		SetInputENterKey(password, "");
		SetInput(password, value, value);

//		password.sendKeys(Keys.ENTER);
//		password.sendKeys(value);
	}

	public void roleNameinput(String value) {
		SetInputENterKey(roleNameinput, "");
		SetInput(roleNameinput, value, value);

//		roleNameinput.sendKeys(Keys.ENTER);
//		roleNameinput.sendKeys(value);
	}

	public void addButton() {
		clickElement(addButton, "");
		// addButton.click();
	}

	public void BulkUpload_btn() {
		clickElement(BulkUpload_btn, "");
		// BulkUpload_btn.click();
	}

	public void Download_btn() {
		clickElement(Download_btn, "");
		// Download_btn.click();
	}

	public void saveButton() {
		clickElement(saveButton, "");
		// saveButton.click();
	}

	public void cancelButton() {
		clickElement(cancelButton, "");
		// cancelButton.click();
	}

	public void edituserbutton() throws InterruptedException {
		Thread.sleep(3000);
		try {

			edituserbutton.click();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void cdkcontainer() {
		clickElement(cdkcontainer, "");
		// cdkcontainer.click();
	}

	public void deleteButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"#matTable img.mat-tooltip-trigger.ml-2.ng-star-inserted\").click()");

	}

	public void deleteButtonUser() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelector(\"#matTable > tbody > tr > td.mat-cell.cdk-cell.table-data.cdk-column-Action.mat-column-Action.ng-star-inserted > img:nth-child(2)\").click()");

	}

	public String get_Text_ToolTipDelete() throws InterruptedException {

		Thread.sleep(3000);
		mouseHover(deleteButton);

		String deleteButtonDisplayNameText = deleteButtonNameToolTip.getText();

		deleteButtonDisplayNameText.trim();

		return deleteButtonDisplayNameText;
	}

	public String get_Text_ToolTipEdit() throws InterruptedException {

		Thread.sleep(3000);
		mouseHover(edituserbutton);

		String editButtonNameDisplayNameText = editButtonNameToolTip.getText();

		editButtonNameDisplayNameText.trim();

		return editButtonNameDisplayNameText;
	}

	public void confirmationYesButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement confirmationYesButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Yes')]")));

		// Perform a click action on the confirmation Yes button
		clickElement(confirmationYesButton, "");
		// confirmationYesButton.click();

	}

	public void Users_Role() {
		clickElement(Users_Role, "");
		// Users_Role.click();
	}

	public String sucessmessage() {

		mouseHover(sucessmessage);

		String sucessmessageText = sucessmessage.getText();

		sucessmessageText.trim();

		return sucessmessageText;

	}

	public void activestatusSelection() {
		clickElement(activestatusSelection, "");
		// activestatusSelection.click();
	}

	public void statusinputinActive() {
		clickElement(statusinputinActive, "");
		// statusinputinActive.click();
	}

	public void eyeiconpassword() {
		clickElement(eyeiconpassword, "");
		// eyeiconpassword.click();

	}

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[1]")
	WebElement FirstNameLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement firstNameToolTip;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[1]")
	WebElement LastNameLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement LastNameToolTip;

	public String get_Text_ToolTipFirstName() {
		mouseHover(FirstNameLabel);

		String firstNameToolTipText = firstNameToolTip.getText();

		System.out.println("toolTipText-->" + firstNameToolTipText);

		return firstNameToolTipText;
	}

	public String get_Text_ToolTipLastName() {
		mouseHover(LastNameLabel);

		String LastNameToolTipText = LastNameToolTip.getText();

		System.out.println("toolTipText-->" + LastNameToolTipText);

		return LastNameToolTipText;
	}

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/span[1]/div[1]/div[1]")
	WebElement EmailIDLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement EmailIDToolTip;

	public String get_Text_ToolTipEmailID() {
		mouseHover(EmailIDLabel);

		String EmailIDToolTipText = EmailIDToolTip.getText();

		System.out.println("toolTipText-->" + EmailIDToolTipText);

		return EmailIDToolTipText;
	}

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/span[1]/div[1]/div[1]")
	WebElement roleNameLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement roleNameToolTip;

	public String get_Text_ToolTipRoleName() {
		mouseHover(roleNameLabel);

		String roleNameToolTipText = roleNameToolTip.getText();

		System.out.println("toolTipText-->" + roleNameToolTipText);

		return roleNameToolTipText;
	}

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]/div[2]/div[3]")

	WebElement firstnameAscending;

	public void firstnameAscending() {
		clickElement(firstnameAscending, "");

	}

}
