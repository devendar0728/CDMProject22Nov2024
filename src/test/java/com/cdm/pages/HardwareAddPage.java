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

public class HardwareAddPage extends CommonActions {

	public HardwareAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='example-toolbar sticky']/div/div/div/p/img")
	WebElement expandtoggle;

	@FindBy(xpath = "//div[@class='example-toolbar sticky']/div/div/div/p/img")
	WebElement collapseToggle;

	@FindBy(xpath = "//mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/mat-icon[1]")
	WebElement bellIcon;

	@FindBy(css = ".cdk-overlay-container")
	WebElement HardWareDisplayNameToolTip;

	@FindBy(xpath = "//mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/button[1]/span[1]/img[1]")
	WebElement profileIcon;

	@FindBy(css = ".cdk-overlay-container")
	WebElement HardWareNameToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement HardWareDescriptionToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement HardWareMakeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement HardWareProcessorToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement HardWareOSToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement HardWareModelToolTip;
	@FindBy(xpath = "//tbody/tr[1]/td[8]/img[2]")
	WebElement hardwareDelete;

	@FindBy(xpath = "//ul[@class='nav']/li[6]")
	WebElement hardware_tab;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement hardwarethreedot;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement hardwareSavebutton;

	@FindBy(xpath = "//input[@name='hardwarename']")
	WebElement hardwarenamesearch;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/span/img")
	WebElement hardwareAddPlusicon;

	@FindBy(xpath = "//input[@formcontrolname='hardwarename']")
	WebElement hardwareName;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement hardwareDisplayName;

	@FindBy(xpath = "//input[@formcontrolname='description']")
	WebElement hardwareDescription;

	@FindBy(xpath = "//input[@formcontrolname='model']")
	WebElement hardwareModel;

	@FindBy(xpath = "//input[@formcontrolname='os']")
	WebElement hardwareOS;

	@FindBy(xpath = "//input[@formcontrolname='make']")
	WebElement hardwareMake;

	@FindBy(xpath = "//input[@formcontrolname='processor']")
	WebElement hardwareProcessor;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveAddDataBtn;

	@FindBy(xpath = "(//input[@formcontrolname='hardwarename']/../../../../div/../../span[2])")
	WebElement validationMessageHardwareName;

	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../div/../../span[1])")
	WebElement validationMessageHardwareDisplayName;

	@FindBy(xpath = "(//input[@formcontrolname='description']/../../../../div/../../span[1])")
	WebElement validationMessageHardwareDescription;

	@FindBy(xpath = "(//input[@formcontrolname='model']/../../../../div/../../span[1])")
	WebElement validationMessageHardwareModel;

	@FindBy(xpath = "(//input[@formcontrolname='os']/../../../../div/../../span[1])")
	WebElement validationMessageHardwareOS;

	@FindBy(xpath = "(//input[@formcontrolname='processor']/../../../../div/../../span[1])")
	WebElement validationMessageHardwareProcessor;

	@FindBy(xpath = "(//input[@formcontrolname='make']/../../../../div/../../span[1])")
	WebElement validationMessageHardwareMake;

	public String verifyValidationMessageHardwareName() throws InterruptedException {

		Thread.sleep(3000);

		if (validationMessageHardwareName == null) {
			return "";
		}
		String message = validationMessageHardwareName.getText();

		return message.trim();

	}

	public String verifyValidationMessageHardwareDisplayName() {

		if (validationMessageHardwareDisplayName == null) {
			return "";
		}
		String message = validationMessageHardwareDisplayName.getText();

		return message.trim();

	}

	public String verifyValidationMessageHardwareDescription() {

		if (validationMessageHardwareDescription == null) {
			return "";
		}
		String message = validationMessageHardwareDescription.getText();

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

	public String verifyValidationMessageHardwareProcessor() {

		if (validationMessageHardwareProcessor == null) {
			return "";
		}
		String message = validationMessageHardwareProcessor.getText();

		return message.trim();

	}

	@FindBy(xpath = "//input[@formcontrolname='controllername']")
	WebElement edgeGroupIdAdd;

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
//		hardwareModel.sendKeys(Keys.ENTER);
//		hardwareModel.sendKeys(value);
	}

	public void hardwareOS(String value) {
		SetInputENterKey(hardwareOS, "");
		SetInput(hardwareOS, value, value);
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

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void hardwareSavebutton() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".addButton\").click();");

	}

	public void hardwareDelete() {
		clickElement(hardwareDelete, "");
		// hardwareDelete.click();
	}

	public void confirmationYesButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement confirmationYesButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Yes')]")));

		clickElement(confirmationYesButton, "");

		// Perform a click action on the confirmation Yes button
		// confirmationYesButton.click();

	}

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public String get_Text_ToolTipHardwareDisplayName() {

		mouseHover(hardwareDisplayName);

		String HardWareDisplayNameText = HardWareDisplayNameToolTip.getText();

		HardWareDisplayNameText.trim();

		return HardWareDisplayNameText;
	}

	public String get_Text_ToolTipHardwareName() {
		mouseHover(hardwareName);

		String HardWareNameText = HardWareNameToolTip.getText();

		HardWareNameText.trim();

		return HardWareNameText;
	}

	public String get_Text_ToolTipHardwareDescription() {
		mouseHover(hardwareDescription);

		String HardWareDescriptionText = HardWareDescriptionToolTip.getText();

		HardWareDescriptionText.trim();

		return HardWareDescriptionText;
	}

	public String get_Text_ToolTipHardwareModel() {
		mouseHover(hardwareModel);

		String HardWareModelText = HardWareModelToolTip.getText();

		HardWareModelText.trim();

		return HardWareModelText;
	}

	public String get_Text_ToolTipHardwareOS() {
		mouseHover(hardwareOS);

		String HardWareOSText = HardWareOSToolTip.getText();

		HardWareOSText.trim();

		return HardWareOSText;
	}

	public String get_Text_ToolTipHardwareMake() {
		mouseHover(hardwareMake);

		String HardWareMakeText = HardWareMakeToolTip.getText();

		HardWareMakeText.trim();

		return HardWareMakeText;

	}

	public String get_Text_ToolTipHardwareProcessor() {
		mouseHover(hardwareProcessor);

		String HardWareMakeText = HardWareMakeToolTip.getText();

		HardWareMakeText.trim();

		return HardWareMakeText;

	}

	public void belliconClick() {
		clickElement(bellIcon, "");
		// bellIcon.click();
	}

	public void profileIconClick() {
		clickElement(profileIcon, "");
		// profileIcon.click();

	}

	public void expandtoggle() {
		clickElement(expandtoggle, "");
		// expandtoggle.click();
	}

	public void collapseToggle() {
		clickElement(collapseToggle, "");
		// collapseToggle.click();
	}
}
