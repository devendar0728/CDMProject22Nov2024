package com.cdm.pages.Latest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class UserRoleEditPage extends CommonActions {

	public UserRoleEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement RoleNameDot;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButtonAdd;

	@FindBy(xpath = "//input[@formcontrolname='rolename']")
	WebElement roleNameinputEdit;

	public void roleNameinputEdit(String value) {
		SetInputENterKey(roleNameinputEdit,"");
		SetInput(roleNameinputEdit, value, value);
//		roleNameinputEdit.sendKeys(Keys.ENTER);
//		roleNameinputEdit.sendKeys(value);

	}

	public void saveButtonAdd() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.querySelector(\".addButton\").click();", saveButtonAdd);
	}

	public String removalofEnteredTextForUserRole() {

		return removalofEneredText(roleNameinputEdit);

	}

}
