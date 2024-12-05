package com.cdm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class HardwarePage extends CommonActions {

	public HardwarePage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img")
	WebElement refreshlist;

	@FindBy(xpath = "//tbody/tr[1]/td[8]/img[2]")
	WebElement hardwareDelete;

	@FindBy(xpath = "//ul[@class='nav']/li[6]")
	WebElement hardware_tab;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hardwarethreedot;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hardwareDisplayNamethreedot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hardwareMakethreedot;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hardwareModelthreedot;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hardwareProcessorthreedot;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hardwareosthreedot;

	@FindBy(xpath ="//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]")
	WebElement sortHardwareName;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement hardwareSavebutton;

	@FindBy(xpath = "//input[@name='hardwarename']")
	WebElement hardwarenamesearch;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/span/img")
	WebElement hardwareAddPlusicon;

	@FindBy(xpath = "//input[@name='hardwarename']")
	WebElement hardwareName;

	@FindBy(xpath = "//input[@name='displayname']")
	WebElement hardwareDisplayName;

	@FindBy(xpath = "//input[@name='description']")
	WebElement hardwareDescription;

	@FindBy(xpath = "//input[@name='model']")
	WebElement hardwareModel;

	@FindBy(xpath = "//input[@name='os']")
	WebElement hardwareOS;

	@FindBy(xpath = "//input[@name='make']")
	WebElement hardwareMake;

	@FindBy(xpath = "//input[@name='processor']")
	WebElement hardwareProcessor;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveAddDataBtn;

	public void hardwareAddPlusicon() {
		clickElement(hardwareAddPlusicon, "");
		// hardwareAddPlusicon.click();

	}

	public void hardwareName(String value) {
		SetInputENterKey(hardwareName, "");
		SetInput(hardwareName, value, value);

//		hardwareName.sendKeys(Keys.ENTER);
//		hardwareName.sendKeys(value);
	}

	public void hardwareDisplayName(String value) {

		SetInputENterKey(hardwareDisplayName, "");
		SetInput(hardwareDisplayName, value, value);

//
//		hardwareDisplayName.sendKeys(Keys.ENTER);
//		hardwareDisplayName.sendKeys(value);
	}

	public void hardwareDescription(String value) {
		SetInputENterKey(hardwareDescription, "");
		SetInput(hardwareDescription, value, value);

//
//		hardwareDescription.sendKeys(Keys.ENTER);
//		hardwareDescription.sendKeys(value);
	}

	public void hardwareModel(String value) {
		SetInputENterKey(hardwareModel, "");
		SetInput(hardwareModel, value, value);
//
//		hardwareModel.sendKeys(Keys.ENTER);
//		hardwareModel.sendKeys(value);
	}

	public void hardwareOS(String value) {

		SetInputENterKey(hardwareOS, "");
		SetInput(hardwareOS, value, value);
//
//		hardwareOS.sendKeys(Keys.ENTER);
//		hardwareOS.sendKeys(value);
	}

	public void hardwareMake(String value) {
		SetInputENterKey(hardwareMake, "");
		SetInput(hardwareMake, value, value);

//
//		hardwareMake.sendKeys(Keys.ENTER);
//		hardwareMake.sendKeys(value);
	}

	public void hardwareProcessor(String value) {
		SetInputENterKey(hardwareProcessor, "");
		SetInput(hardwareProcessor, value, value);
//
//		hardwareProcessor.sendKeys(Keys.ENTER);
//		hardwareProcessor.sendKeys(value);
	}

	public void hardwareNameSearch(String value) {
		SetInputENterKey(hardwarenamesearch, "");
		SetInput(hardwarenamesearch, value, value);

//		hardwarenamesearch.sendKeys(Keys.ENTER);
//		hardwarenamesearch.sendKeys(value);
	}

	public void hardware_tab() throws InterruptedException {
		clickElement(hardware_tab, "");
		// hardware_tab.click();
	}

	public void hardwarethreedot() {
		clickElement(hardwarethreedot, "");
		// hardwarethreedot.click();
	}

	public void hardwareDisplayNamethreedot() {
		clickElement(hardwareDisplayName, "");
		// hardwareDisplayName.click();
	}

	public void hardwareMakethreedot() {
		clickElement(hardwareMakethreedot, "");

		// hardwareMakethreedot.click();
	}

	public void hardwareProcessorthreedot() {
		clickElement(hardwareProcessorthreedot, "");

		// hardwareProcessorthreedot.click();
	}

	public void hardwareosthreedot() {
		clickElement(hardwareosthreedot, "");
		// hardwareosthreedot.click();
	}

	public void hardwareModelthreedot() {
		clickElement(hardwareModelthreedot, "");
		// hardwareModelthreedot.click();
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			clickElement(backDropShowing, "");
			// backDropShowing.click();
		}
	}

	public void hardwareSavebutton() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".addButton\").click();");
		Thread.sleep(6000);
	}

	public void hardwareDelete() {
		clickElement(hardwareDelete, "");
		// hardwareDelete.click();
	}

	public void confirmationYesButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement confirmationYesButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Yes')]")));

		// Perform a click action on the confirmation Yes button

		clickElement(confirmationYesButton, "");
		// confirmationYesButton.click();

	}

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void refreshlist() {
		clickElement(refreshlist, "");
		// refreshlist.click();
	}

	public void confirmationNoButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement confirmationNoButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'No')]")));

		// Perform a click action on the confirmation Yes button
		clickElement(confirmationNoButton, "");

		// confirmationNoButton.click();
	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement hardwareNameTooltip;


	@FindBy(xpath = "//thead/tr[1]/th[7]/div[1]/span[1]/div[1]/div[1]")
	WebElement hardwareStatus;

	@FindBy(css = ".cdk-overlay-container")
	WebElement hardwareStatusTooltip;


	@FindBy(xpath = "//div[contains(text(),'Hardware Name')]")
	WebElement hardwareNameLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement hardwareDisplayNameTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement hardwareMakeTooltip;


	@FindBy(css = ".cdk-overlay-container")
	WebElement hardwareModelTooltip;


	@FindBy(xpath = "//div[contains(text(),'Hardware Display Name')]")
	WebElement hardwareDisplayNameLabel;


	public String get_Text_ToolTipHardwareName() {
		mouseHover(hardwareNameLabel);

		String hardwareNameTooltipText = hardwareNameTooltip.getText();

		hardwareNameTooltipText.trim();

		return hardwareNameTooltipText;
	}
	@FindBy(css= ".cdk-overlay-container")
	WebElement outerlayerclick;
	public void outerlayerclick() {
		clickElement(outerlayerclick, "");

	}

	public String get_Text_ToolTipHardwareDisplayName() throws Exception {


		mouseHover(hardwareDisplayNameLabel);

		Thread.sleep(4000);

		String hardwareDisplayNameTooltipText = hardwareDisplayNameTooltip.getText();

		hardwareDisplayNameTooltipText.trim();

		return hardwareDisplayNameTooltipText;

	}

	public String get_Text_ToolTipHardwareMake() {
		mouseHover(hardwareMake);

		String hardwareMakeTooltipText = hardwareMakeTooltip.getText();

		hardwareMakeTooltipText.trim();

		return hardwareMakeTooltipText;
	}

	public String get_Text_ToolTipHardwareModel() {
		mouseHover(hardwareModel);

		String hardwareModelTooltipText = hardwareModelTooltip.getText();

		hardwareModelTooltipText.trim();

		return hardwareModelTooltipText;
	}

	public String get_Text_ToolTipHardwareStatus() {
		mouseHover(hardwareStatus);

		String hardwareStatusTooltipText = hardwareStatusTooltip.getText();

		hardwareStatusTooltipText.trim();

		return hardwareStatusTooltipText;
	}

	public void sortHardwareName() {

		clickElement(sortHardwareName,"");

	}
	@FindBy(xpath = "(//input[@formcontrolname='hardwarename']/../../../../../span)[2]")
	WebElement validationMessageHardwareName;

	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../../span)[1]")
	WebElement validationMessageHardwareDisplayName;

	@FindBy(xpath = "(//input[@formcontrolname='model']/../../../../../span)[1]")
	WebElement validationMessageHardwareModel;

	@FindBy(xpath = "(//input[@formcontrolname='os']/../../../../../span)[1]")
	WebElement validationMessageHardwareOS;

	@FindBy(xpath = "(//input[@formcontrolname='make']/../../../../../span)[1]")
	WebElement validationMessageHardwareMake;

	@FindBy(xpath = "(//input[@formcontrolname='processor']/../../../../../span)[1]")
	WebElement validationMessageHardwareProcessor;

	public String verifyValidationMessageHardwareName() {
		if (validationMessageHardwareName == null) {
			return "";
		}
		String message = validationMessageHardwareName.getText();

		return message.trim();
	}

	public Object verifyValidationMessageHardwareDisplayName() {

		if (validationMessageHardwareDisplayName == null) {
			return "";
		}
		String message = validationMessageHardwareDisplayName.getText();

		return message.trim();
	}

	public String verifyValidationMessageHardwareModel() {
		if (validationMessageHardwareModel == null) {
			return "";
		}
		String message = validationMessageHardwareModel.getText();

		return message.trim();
	}

	public String verifyValidationMessageHardwareOS() {
		if (validationMessageHardwareOS == null) {
			return "";
		}
		String message = validationMessageHardwareOS.getText();

		return message.trim();
	}

	public String verifyValidationMessageHardwareMake() {
		if (validationMessageHardwareMake == null) {
			return "";
		}
		String message = validationMessageHardwareMake.getText();

		return message.trim();
	}
}
