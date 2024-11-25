package com.cdm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class ReportsPage extends CommonActions {

	public ReportsPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement startToolTip;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/mat-tooltip-component/div")
	WebElement endToolTip;

	@FindBy(xpath = "//img[@src='/assets/img/orangewifi.png']")
	WebElement networkOrange;

	@FindBy(xpath = "//img[@src='/assets/img/orangewifi.png']")
	WebElement networkGreen;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement downloadButton;

	@FindBy(xpath = "//mat-select[@formcontrolname='reporttype']")
	WebElement reportTypeSelect;

	@FindBy(xpath = "//button[@aria-haspopup= 'dialog']")
	WebElement calenderIcon;

	@FindBy(xpath = "(//mat-datepicker-toggle)[2]//button")
	WebElement endDatecalenderIcon;

	@FindBy(xpath = "//span[contains(.,'Reports')]")
	WebElement reportsTab;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//input[@formcontrolname='startdate']")
	WebElement startDate;

	@FindBy(xpath = "//input[@formcontrolname='enddate']")
	WebElement endDate;
	
	@FindBy(xpath = "//button[@aria-label ='Choose month and year']")
	public WebElement arrowforyearandmonth;

	@FindBy(xpath = "//button[@aria-live='polite']")
	public WebElement yearselection;

	@FindBy(xpath = "//button[@class='mat-calendar-body-cell']")
	public WebElement monthselection;

	@FindBy(xpath = "//button[@class='mat-calendar-body-cell']")
	public WebElement dayselection;
	
	
	@FindBy(xpath = "//span[@class='text-danger ng-star-inserted']")
	WebElement validationmessage;

	public String verifyValidationMessageforReports() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationmessage == null) {
			return "";
		}
		String message = validationmessage.getText();

		return message.trim();

	}
	public boolean isReportTypeSelected(String expectedReportType) {
        
        String selectedOption = reportTypeSelect.getText();
        return selectedOption.equals(expectedReportType);
	}
	
	public void reportsTab() {
		try {
			wait(reportsTab,logger);
			clickElement(reportsTab, "");
			//reportsTab.click();	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void reportTypeDropdown(String value) throws InterruptedException {
		Thread.sleep(5000);
		try {
			wait(reportTypeSelect,logger);
			SelectMatOption(reportTypeSelect, value);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void calicon() {
		clickElement(calenderIcon, "");
		//calenderIcon.click();
	}

	public void caliconEndDate() {
		clickElement(endDatecalenderIcon, "");
		//endDatecalenderIcon.click();
	}

	public void arrowforyearandmonth() {
		clickElement(arrowforyearandmonth, "");
		//arrowforyearandmonth.click();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void monthselection(String value) {

		String str = "//button[@aria-label='" + value + "']";
		WebElement ele = driver.findElement(By.xpath(str));
		//ele.click();
		clickElement(ele, "");
	}

	public void yearselection(String value) {
		String str = "//button[@aria-label='" + "2024" + "']";
		WebElement ele = driver.findElement(By.xpath(str));
		ele.click();
		clickElement(ele, "");

	}

	public void dayselection(String value) {
		String str = "//button[@aria-label='" + value + "']";
		WebElement ele = driver.findElement(By.xpath(str));
		//ele.click();
		clickElement(ele, "");
	}

	public void minimiseWindow() {
		driver.manage().window().minimize();
	}

	public void downloadButton() {
		clickElement(downloadButton, "");
		//downloadButton.click();
	}

	public void maximiseWindow() {
		driver.manage().window().maximize();
	}

	public void setdimension(int height, int width) {
		Dimension d = new Dimension(height, width);
		driver.manage().window().setSize(d);

	}
	public void networkGreen() {
		clickElement(networkGreen, "");
		//networkGreen.click();
	}
	
	public void networkOrange() {
		clickElement(networkOrange, "");
		//networkOrange.click();
	}
	
	public String get_Text_ToolTipforStartDate() {
		mouseHover(startDate);

		String startDateToolTipText = startToolTip.getText();

		startDateToolTipText.trim();

		return startDateToolTipText;
		
	}

	@FindBy(xpath = "//div[@id='toast-container']")

	WebElement toasterSuccess;

	
public void ToasterMessageShouldBeDisplayed(String expectedMessage) {
        
        String actualMessage = toasterSuccess.getText();
        assert actualMessage.equals(expectedMessage) : "Expected: " + expectedMessage + ", but got: " + actualMessage;
    }

	
	public String get_Text_ToolTipforEndDate() {
		
		mouseHover(endDate);

		String endDateToolTipText = endToolTip.getText();

		endDateToolTipText.trim();

		return endDateToolTipText;
		
	}
	
	public String getTextReportTypeLabel() {
		clickElement(reportTypeSelect, "");
		return getText(reportTypeLabel);
	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement outerlayerclick;
	
	@FindBy(xpath = "//label[@id='mat-form-field-label-1']")
	WebElement reportTypeLabel;
	
	@FindBy(xpath = "//label[@id='mat-form-field-label-5']")
	WebElement endDateLabel;
	
	@FindBy(xpath = "//label[@id='mat-form-field-label-3']")
	WebElement startDateLabel;
	
	public String getTextStartDate() {
		clickElement(startDate, "");
		return getText(startDateLabel);
	}
	
	public void outerlayerclick() {
		clickElement(outerlayerclick, "");

	}

	
	public String getTextReportEndDate() {
		clickElement(endDate, "");
		return getText(endDateLabel);
	}
}