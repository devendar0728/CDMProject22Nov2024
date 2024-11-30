package com.cdm.pages;

import java.io.File;
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

public class AppgroupnewlistPage extends CommonActions {

	public AppgroupnewlistPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement applicationNameTooltip;

	@FindBy(xpath = "//div[@id='matTable']/table/thead/tr/th[2]/div/span/div/div[contains(text(),'Application')][1]")
	WebElement applicationNameElement;

	@FindBy(css = ".cdk-overlay-container")
	WebElement architectureTooltip;

	@FindBy(xpath = "//div[@id='matTable']/table/thead/tr/th[3]/div/span/div/div[contains(text(),'Architecture')][1]")
	WebElement archittectureElement;

	@FindBy(css = ".cdk-overlay-container")
	WebElement versionTooltip;

	@FindBy(xpath = "//div[@id='matTable']/table/thead/tr/th[4]/div/span/div/div[contains(text(),'Version/Tag')][1]")
	WebElement versionElement;

	@FindBy(css = ".cdk-overlay-container")
	WebElement statusTooltip;

	@FindBy(xpath = "//div[@id='matTable']/table/thead/tr/th[5]/div/span/div/div[contains(text(),'Status')][1]")
	WebElement statusElement;

	@FindBy(xpath = "//*[@id='mat-checkbox-6']/label/span[1]")
	WebElement selectedCheckboxforApp;

	public String get_Text_ToolTipforApplicationColumn() {
		mouseHover(applicationNameElement);

		String applicationNameElementTipText = applicationNameTooltip.getText();

		applicationNameElementTipText.trim();

		return applicationNameElementTipText;
	}

	public String get_Text_ToolTipforArchitecture() {
		mouseHover(archittectureElement);

		String architectureTooltipText = architectureTooltip.getText();

		architectureTooltipText.trim();

		return architectureTooltipText;
	}

	public String get_Text_ToolTipforVersion() {
		mouseHover(versionElement);

		String versionTooltipText = versionTooltip.getText();

		versionTooltipText.trim();

		return versionTooltipText;
	}

	public String get_Text_ToolTipforStatus() {
		mouseHover(statusElement);

		String statusTooltipText = statusTooltip.getText();

		statusTooltipText.trim();

		return statusTooltipText;
	}

	@FindBy(css = ".calButton")
	WebElement cancelAddDataButton;

	@FindBy(css = ".addButton")
	WebElement savebuttonAddApplication;

	public boolean isCancelIconVisible() {
		return cancelAddDataButton.isDisplayed();
	}

	public void cancelData() {
		clickElement(cancelAddDataButton, "");

	}

	@FindBy(xpath = "//input[@name='appname']")
	WebElement applicationNameSearch;

	@FindBy(xpath = "//*[@id='matTable']/table/thead/tr/th[2]/div/app-filter/div/a/mat-icon")
	WebElement applicationNameThreeDot;

	public void applicationNameThreeDots() {

		clickElement(applicationNameThreeDot, "Clicking on Application name on appgroupnewlist");

	}

	public void searchforApplicationName(String value) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", applicationNameSearch);
		SetInputENterKey(applicationNameSearch, "");
		SetInput(applicationNameSearch, value, value);

	}

	public void saveButtonApplicationPage() {

		clickElement(savebuttonAddApplication, "Saving data on application");
	}

	public void selectApplication() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxforApp));

			if (selectedCheckboxforApp != null) {
				String checked = selectedCheckboxforApp.getDomAttribute("checked");
				if (checked != "checked") {
					clickElement(selectedCheckboxforApp, "");

				}
			}
		} catch (Exception e) {

		}

	}

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			// clickElement(backDropShowing, "");
			backDropShowing.click();
		}

	}

	@FindBy(xpath = "//input[@formcontrolname='uploadfile']")
	WebElement chooseFile;



	@FindBy(xpath = "//app-csvfileimport/div[2]/div/button[2]/span[contains(text(),'Upload')][1]")
	WebElement uploadFile;

	public void uploadButton() {

		clickElement(uploadFile, "Clicking on upload button");
	}

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-appgroup/div/div[1]/div/img[3]")
	WebElement uploadFileIcon;

	public void bulkUploadIcon() {
		clickElement(uploadFileIcon, "Clicking on upload icon at the top of the page");

	}

	
	@FindBy(xpath = "//div[@id='toast-container']")

	WebElement confirmationMessage;

	
    // Method to get the confirmation message text
    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }
	@FindBy(xpath="//mat-dialog-container[@id='mat-dialog-0']")
	WebElement bulkUploadsuccessmessage;

	public WebElement bulkUploadPopupmessageText() {
		
			return bulkUploadsuccessmessage;
		}
	}


