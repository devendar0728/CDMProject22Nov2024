package com.cdm.pages.Latest;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class MappinguserListPage extends CommonActions {

	public MappinguserListPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//table//tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxAddUsers;
	
	@FindBy(xpath = "//h4/span")
	WebElement headingtitle;

	@FindBy(xpath="//table//tr[1]/td[1]/mat-checkbox//label")
	WebElement selectedcheckboxAddUsersLabel;
	
	
	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	
	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement firstnameThreeDot;
	
	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement lastNameThreeDot;
	
	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement emailIDThreeDot;
	
	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement roleNameThreeDot;

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstname;
	
	
	@FindBy(xpath =   "//input[@name='lastname']")
	WebElement lastname;
	
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelbuttonmap;
	
	
	@FindBy(xpath = " //input[@name='emailid']")
	WebElement emailId;

	@FindBy(xpath = " //input[@name='rolename']")
	WebElement RoleName;
	
	public void savebuttonmap() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".addButton\").click();");
	}
	public void cancelbuttonmap() throws InterruptedException {
		clickElement(cancelbuttonmap, "");
		//cancelbuttonmap.click();
		
	}

	public void firstnameSearch(String value) {
		SetInputENterKey(firstname,"");
		SetInput(firstname, value, value);
		
//		firstname.sendKeys(Keys.ENTER);
//		firstname.sendKeys(value);
	}
	
	public void lastnameSearch(String value) {
		SetInputENterKey(lastname,"");
		SetInput(lastname, value, value);
		
//		lastname.sendKeys(Keys.ENTER);
//		lastname.sendKeys(value);
	}
	
	public void RoleNameSearch(String value) {
		SetInputENterKey(RoleName,"");
		SetInput(RoleName, value, value);
		
		
//		RoleName.sendKeys(Keys.ENTER);
//		RoleName.sendKeys(value);
	}
	
	public void emailIdSearch(String value) {
		SetInputENterKey(emailId,"");
		SetInput(emailId, value, value);
		
//		emailId.sendKeys(Keys.ENTER);
//		emailId.sendKeys(value);
	}
	
	public void firstnameThreeDot() {
		clickElement(firstnameThreeDot, "");
		//firstnameThreeDot.click();
	}
	
	public void lastNameThreeDot() {
		clickElement(lastNameThreeDot, "");
		//lastNameThreeDot.click();
	}
	public void emailIDThreeDot() {
		clickElement(emailIDThreeDot, "");
		//emailIDThreeDot.click();
	}
	
	public void roleNameThreeDot() {
		clickElement(roleNameThreeDot, "");
		//roleNameThreeDot.click();
	}
	
	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			clickElement(backDropShowing, "");
			//backDropShowing.click();
		}
	}
	
	public boolean verifycheckboxdisabled() {
		
		 return checkboxAddUsers.isEnabled();
	
	}
	
	public void checkboxAddUsers() {
		try {


//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click()", selectedCheckboxAppNameConfigLabel);

			if (checkboxAddUsers != null) {
				String checked = checkboxAddUsers.getDomAttribute("checked");
				if (checked != "checked") {
					selectedcheckboxAddUsersLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}
	public void headingtitle() {
		
		clickElement(headingtitle, "");
		headingtitle.click();
		
	}



}
