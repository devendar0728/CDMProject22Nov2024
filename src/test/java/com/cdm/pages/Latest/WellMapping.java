package com.cdm.pages.Latest;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class WellMapping extends CommonActions {

	public WellMapping(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);

	}
	@FindBy(css= ".cdk-overlay-container")
	WebElement outerlayerclick;
	public void outerlayerclick() {
		clickElement(outerlayerclick, "");
		
	}
	@FindBy(xpath = "(//input[@name='options'])[1]")
	WebElement StatusActiveCheck;

	@FindBy(xpath = "(//input[@name='options'])[2]")
	WebElement StatusInActiveCheck;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement selectedCheckboxWell;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxLabelforWell;

	@FindBy(xpath = "//div[contains(text(),'Well Name')]/../../..//mat-icon")

	WebElement wellnameThreeDot;

	@FindBy(xpath = "//div[contains(text(),'IP Address')]/../../..//mat-icon")

	WebElement IPAddressThreeDot;

	@FindBy(xpath = "//div[@class='toast-top-right toast-container']")

	WebElement alertpopupforWell;

	@FindBy(xpath = "//th//div[contains(text(),'Device Type')]/../../..//mat-icon")

	WebElement deviceTypeThreeDot;

	@FindBy(xpath = "(//th//div[contains(text(),'RTU Address')])[1]/../../..//mat-icon")
	WebElement RTUAddressThreeDot;

	@FindBy(xpath = "//th//div[contains(text(),'Status')]/../../..//mat-icon")

	WebElement StatusThreeDot;

	
	@FindBy(xpath = "//a[contains(text(),'Well Mapping')]")

	WebElement wellmappingtab;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxforWellLabel;

	@FindBy(xpath = "//h4")
	WebElement headingTitle;

	@FindBy(xpath = "//h4")
	WebElement headingTitleWell;

	@FindBy(xpath = "//input[@name='ipaddress']")
	WebElement IPAddressInputSearch;

	@FindBy(xpath = "//input[@name='devicetype']")
	WebElement deviceTypeSearchInput;

	@FindBy(xpath = "//input[@name='wellname']")
	WebElement wellMappingSearchInput;

	@FindBy(xpath = "//input[@name='rtunumber']")
	WebElement RTUAddressSearchInput;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-well-link-edge-device[1]/div[1]/div[4]/button[1]")
	WebElement saveButton;
	// *[@id="nav-user-tab"]
	@FindBy(xpath = "(//*[@id='nav-user-tab'])[5]")
	WebElement wellMappingIcon;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement wellMappingSearchDot;

	// @FindBy(xpath = "//tbody/tr[1]/td[1]/mat-checkbox[1]/label[1]/span[1]")
	@FindBy(xpath = "//*[@id='mat-checkbox-4']/label")
	WebElement selectedCheckbox;

	@FindBy(css = "app-well-link-edge-device .text-right .mat-button-wrapper")
	WebElement saveWellData;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement selectedCheckboxforWell;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	public void wellnameThreeDot() {
		clickElement(wellnameThreeDot, "");
		// wellnameThreeDot.click();
	}

	public void IPAddressThreeDot() {
		clickElement(IPAddressThreeDot, "");
		// IPAddressThreeDot.click();

	}

	public void RTUAddressSearchInput(String value) {
		SetInputENterKey(RTUAddressSearchInput, value);
		SetInput(RTUAddressSearchInput, value, value);
//		RTUAddressSearchInput.sendKeys(Keys.ENTER);
//		RTUAddressSearchInput.sendKeys(value);

	}

	public void deviceTypeThreeDot() {
		clickElement(deviceTypeThreeDot, "");
		// deviceTypeThreeDot.click();

	}

	public void RTUAddressThreeDot() {
		clickElement(RTUAddressThreeDot, "");
		// RTUAddressThreeDot.click();

	}

	public void StatusThreeDot() {

		clickElement(StatusThreeDot, "");
		// StatusThreeDot.click();

	}

	public void wellmappingClick() {
		clickElement(wellMappingIcon, "");
		// wellMappingIcon.click();
	}

	public void wellMappingSearchDot() {
		clickElement(wellMappingSearchDot, "");
		// wellMappingSearchDot.click();
	}

	public void headingClick() {
		clickElement(headingTitle, "");
		// headingTitle.click();
	}

	public void headingbarclick() {

		Actions action = new Actions(driver);

		action.moveToElement(headingTitle).click().perform();
	}

	public void wellMappingSearchInput(String value) {

		wellMappingSearchInput.sendKeys(value);
		wellMappingSearchInput.sendKeys(Keys.ENTER);
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			//clickElement(backDropShowing, "");
			backDropShowing.click();
		}
	}

	public void selectedCheckboxforWell() {
		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxforWellLabel));

			if (selectedCheckboxforWell != null) {
				String checked = selectedCheckboxforWell.getDomAttribute("checked");
				if (checked != "checked") {
					clickElement(selectedCheckboxforWellLabel, "");
					// selectedCheckboxforWellLabel.click();
				}
			}
		} catch (Exception e) {

		}

	}

	public void saveWellData() {
		clickElement(saveWellData, "");
		// saveWellData.click();
	}

	public void wellmappingtab() {
		clickElement(wellmappingtab, "");
		// wellmappingtab.click();
	}

	public void IPAddressInputSearch(String value) {
		SetInputENterKey(IPAddressInputSearch, "");
		SetInput(IPAddressInputSearch, value, value);
//		IPAddressInputSearch.sendKeys(Keys.ENTER);
//		IPAddressInputSearch.sendKeys(value);
	}

	public void deviceTypeSearchInput(String value) throws InterruptedException {
		SetInputENterKey(deviceTypeSearchInput, "");
		SetInput(deviceTypeSearchInput, value, value);

//		deviceTypeSearchInput.sendKeys(Keys.ENTER);
//		deviceTypeSearchInput.sendKeys(value);
//		deviceTypeSearchInput.sendKeys(Keys.ENTER);
		// Thread.sleep(3000);
	}

	public void saveData() {
		clickElement(saveButton, "");
		// saveButton.click();
	}

	public void StatusActiveCheck() {
		clickElement(StatusActiveCheck, "");
		// StatusActiveCheck.click();
	}

	public void StatusInActiveCheck() throws InterruptedException {
		clickElement(StatusInActiveCheck, "");
		// StatusInActiveCheck.click();
		Thread.sleep(2000);
	}

	public void checkboxWell() {

		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxforWellLabel));
			Thread.sleep(4000);
			if (selectedCheckboxforWell != null) {
				String checked = selectedCheckboxforWell.getDomAttribute("checked");
				if (checked != "checked") {
					clickElement(selectedCheckboxforWellLabel, "");
					// selectedCheckboxforWellLabel.click();

				}
			}
			Thread.sleep(2000);
		} catch (Exception e) {

		}

	}

	public void alertpopupforwell() {
		clickElement(alertpopupforWell, "");
		// alertpopupforWell.getText();
	}

	public void headingTitleWell() {
		clickElement(headingTitleWell, "");

	}

}
