package com.cdm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserGroupMappingPage extends CommonActions {

	public UserGroupMappingPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//table//tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxEdgeDevice;
	
	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//input[@name='groupname']")
	WebElement UserGroupNameInput;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement UserGroupNameThreeDot;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/mat-checkbox[1]/label[1]")
	WebElement checkboxforselectionlabel;
	
	
	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgenamethreedotgroup;
	
	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement groupnamethreedotmap;

	@FindBy(xpath= "//ul[@class='nav']/li[2]")
	WebElement edgeGroupsTabforgroup;
	
	@FindBy(xpath= "//h4")
	WebElement headingclick;
	
	@FindBy(xpath= "//ul[@class='nav']/li[3]")
	WebElement edgeDeviceTabforgroup;
	
	
	@FindBy(xpath = "//input[@name='displayname']")
	WebElement edgenamesearchmap;
	
	
	@FindBy(xpath = "//input[@name='displayname']")
	WebElement groupnamesearchmap;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/mat-checkbox[1]/label[1]")
	WebElement checkboxforselectionlabelforAppDeployment;
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/mat-checkbox[1]/label[1]")
	WebElement checkboxforselectionforAppDeployment;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButton;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButton;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/mat-checkbox[1]/label[1]/span[1]")
	WebElement checkboxforselection;

	public void UserGroupNameThreeDot() {
		clickElement(UserGroupNameThreeDot,"");
		//UserGroupNameThreeDot.click();
	}

	public void UserGroupNameInput(String value) {
		SetInputENterKey(UserGroupNameInput,"");
		SetInput(UserGroupNameInput, value, value);
		
//		UserGroupNameInput.sendKeys(Keys.ENTER);
//		UserGroupNameInput.sendKeys(value);
	}

	public void checkboxforUserGroupNameLicenseExpiry() {
		try {

			

			if (checkboxforselection != null) {
				String checked = checkboxforselection.getDomAttribute("checked");
				if (checked != "checked") {
					checkboxforselectionlabel.click();
				}
			}
		} catch (Exception e) {

		}
	}
	
	public void checkboxforUserGroupNameDeployment() {
		try {

			

			if (checkboxforselectionforAppDeployment != null) {
				String checked = checkboxforselectionforAppDeployment.getDomAttribute("checked");
				if (checked != "checked") {
					checkboxforselectionlabelforAppDeployment.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void saveButton() {
		
		JavascriptExecutor	js = (JavascriptExecutor)driver;
		
		js.executeScript("document.querySelector(\".addButton\").click()");
	}

	public void cancelbutton() {
		clickElement(cancelButton, "");
		//cancelButton.click();
	}
	
	public void edgeDeviceTabforgroup() {
		clickElement(edgeDeviceTabforgroup, "");
		//edgeDeviceTabforgroup.click();
	}
	
	
	public void edgenamethreedotgroup() {
		clickElement(edgenamethreedotgroup, "");
		//edgenamethreedotgroup.click();
	}
	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			clickElement(backDropShowing, "");
			//backDropShowing.click();
		}
	}
	
	public void edgenamesearchmap(String value) {
		SetInputENterKey(edgenamesearchmap,"");
		SetInput(edgenamesearchmap, value, value);
//		edgenamesearchmap.sendKeys(Keys.ENTER);
//		edgenamesearchmap.sendKeys(value);
	}
	
	
	public void checkboxManagemapping() {
		try {

			if (checkboxEdgeDevice != null) {
				String checked = checkboxEdgeDevice.getDomAttribute("checked");
				if (checked != "checked") {
					checkboxforselectionlabel.click();
				}
			}
		} catch (Exception e) {

		}
	}
	public void edgeGroupsTabforgroup() {
		clickElement(edgeGroupsTabforgroup, "");
		//edgeGroupsTabforgroup.click();
	}
	
	public void groupnamesearchmap(String value) {
		SetInputENterKey(groupnamesearchmap,"");
		SetInput(groupnamesearchmap, value, value);
		
//		groupnamesearchmap.sendKeys(Keys.ENTER);
//		groupnamesearchmap.sendKeys(value);
	}

	public void headingclickElement() {
		
		clickElement(headingclick, "");
		
	}
	@FindBy(css= ".cdk-overlay-container")
	WebElement outerlayerclick;
	public void outerlayerclick() {
		clickElement(outerlayerclick, "");
		
	}
	

}
