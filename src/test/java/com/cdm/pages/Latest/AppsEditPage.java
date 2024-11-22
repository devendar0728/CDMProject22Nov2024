package com.cdm.pages.Latest;

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



public class AppsEditPage extends CommonActions {

	public AppsEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}



	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;


	@FindBy(css = ".cdk-overlay-container")
	WebElement appNameToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement appDisplayNameToolTip;


	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryLinkToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licesnseTypeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement configMasterToolTip;


	@FindBy(css = ".cdk-overlay-container")
	WebElement versionToolTip;


	@FindBy(css = ".cdk-overlay-container")
	WebElement architectureToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement rootVolumeToolTip;







	@FindBy(xpath = "//input[@formcontrolname='appname']")
	WebElement applicationName;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement appDisplayName;


	@FindBy(xpath = "//input[@formcontrolname='repositorylink']")
	WebElement repositoryLink;

	@FindBy(xpath = "//input[@formcontrolname='licensetype']")
	WebElement licenseType;

	@FindBy(xpath = "//input[@formcontrolname='config_master']")
	WebElement config_master;


	@FindBy(xpath = "//input[@formcontrolname='tag']")
	WebElement Versiontag;

	@FindBy(xpath = "//input[@formcontrolname='isActive']/..")
	WebElement Active;

	@FindBy(xpath = "//input[@formcontrolname='architecture']")
	WebElement architecture;

	@FindBy(xpath = "//input[@formcontrolname='name']")
	WebElement rootVolume;

	@FindBy(xpath = "//button[@class='addbutton']")
	WebElement saveAddDataBtn;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancel;


public void saveapp() throws InterruptedException {

	//clickElement(saveAddDataBtn, "");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("document.querySelector(\".addButton\").click()");
}

public void cancelapp() {
	//cancel.click();
	clickElement(cancel, "");
}
	public void applicationName(String value) {

		SetInputENterKey(applicationName,"");
		SetInput(applicationName, value, value);

//		applicationName.sendKeys(Keys.ENTER);
//		applicationName.sendKeys(value);
	}

	public void applicationDisplayName(String value) {
		SetInputENterKey(appDisplayName,"");
		SetInput(appDisplayName, value, value);
//
//		appDisplayName.sendKeys(Keys.ENTER);
//		appDisplayName.sendKeys(value);
	}

	public void repositoryLink(String value) {

		SetInputENterKey(repositoryLink,"");
		SetInput(repositoryLink, value, value);


//		repositoryLink.sendKeys(Keys.ENTER);
//		repositoryLink.sendKeys(value);
	}

	public void licenseType(String value) {

		SetInputENterKey(licenseType,"");
		SetInput(licenseType, value, value);


//		licenseType.sendKeys(Keys.ENTER);
//		licenseType.sendKeys(value);
	}

	public void configMaster(String value) {
		SetInputENterKey(config_master,"");
		SetInput(config_master, value, value);

//
//		config_master.sendKeys(Keys.ENTER);
//		config_master.sendKeys(value);
	}

	public void version(String value) {

		SetInputENterKey(Versiontag,"");
		SetInput(Versiontag, value, value);


//		Versiontag.sendKeys(Keys.ENTER);
//		Versiontag.sendKeys(value);
	}

	public void architecture(String value) {
//		architecture.sendKeys(Keys.ENTER);
//		architecture.sendKeys(value);

		SetInputENterKey(architecture,"");
		SetInput(architecture, value, value);
	}

	public void rootVolume(String value) {
//		rootVolume.sendKeys(Keys.ENTER);
//		rootVolume.sendKeys(value);

		SetInputENterKey(rootVolume,"");
		SetInput(rootVolume, value, value);
	}




	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			//clickElement(backDropShowing, "");
			backDropShowing.click();
		}
	}



	public void confirmationYesButton() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement confirmationYesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Yes')]")));

       // Perform a click action on the confirmation Yes button
       confirmationYesButton.click();

	}

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}



	public String get_Text_ToolTipAppName() {
		mouseHover(applicationName);

		String appNameText = appNameToolTip.getText();

		appNameText.trim();

		return appNameText;
	}

	public String get_Text_ToolTipAppDisplayName() {
		mouseHover(appDisplayName);

		String appDisplayNameText = appDisplayNameToolTip.getText();

		appDisplayNameText.trim();

		return appDisplayNameText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement viewVolumeDetailsToolTip;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[1]")
	WebElement viewVolumeDetails;

	public String get_Text_ToolTipviewVolumeDetails() {
		mouseHover(viewVolumeDetails);

		String viewVolumeDetailsToolTipText = viewVolumeDetailsToolTip.getText();

		viewVolumeDetailsToolTipText.trim();

		return viewVolumeDetailsToolTipText;
	}


	public String get_Text_ToolTipRepositoryLink() {
		mouseHover(repositoryLink);

		String repositoryLinkNameText = repositoryLinkToolTip.getText();

		repositoryLinkNameText.trim();

		return repositoryLinkNameText;
	}

	public String get_Text_ToolTiplicenseTypeToolTip() {
		mouseHover(licenseType);

		String licesnseTypeToolTipText = licesnseTypeToolTip.getText();

		licesnseTypeToolTipText.trim();

		return licesnseTypeToolTipText;
	}
	public String get_Text_ToolTipconfigMaster() throws InterruptedException {
		Thread.sleep(3000);
		mouseHover(config_master);

		String configMasterToolTipText = configMasterToolTip.getText();

		configMasterToolTipText.trim();

		return configMasterToolTipText;
	}

	public String get_Text_ToolTiptag() {
		mouseHover(Active);
		mouseHover(Versiontag);

		try {
			Thread.sleep(2000);
			mouseHoverVersion(Versiontag);
			Thread.sleep(2000);
			mouseHover(Versiontag);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		String versionToolTipText = versionToolTip.getText();

		versionToolTipText.trim();

		return versionToolTipText;
	}

	public String get_Text_ToolTiparchitecture() {
		mouseHover(architecture);

		String architectureToolTipText = architectureToolTip.getText();

		architectureToolTipText.trim();

		return architectureToolTipText;
	}

	public String get_Text_ToolTipRootVolume() {
		mouseHover(rootVolume);

		String rootVolumeToolTipText = rootVolumeToolTip.getText();

		rootVolumeToolTipText.trim();

		return rootVolumeToolTipText;
	}

	public String removalofEnteredTextForappName() {

		return removalofEneredText(applicationName);

	}
	public String removalofEnteredTextForappDisplayName() {

		return removalofEneredText(appDisplayName);

	}
	public String removalofEnteredTextForrepositoryLink() {

		return removalofEneredText(repositoryLink);

	}
	public String removalofEnteredTextForlicenseType() {

		return removalofEneredText(licenseType);

	}
	public String removalofEnteredTextForversionTag() {

		return removalofEneredText(Versiontag);

	}
	public String removalofEnteredTextForconfigmaster() {

		return removalofEneredText(config_master);

	}
	public String removalofEnteredTextForarchitecture() {

		return removalofEneredText(architecture);


	}

	public String removalofEnteredTextForRootVolume() {

		return removalofEneredText(rootVolume);


	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryLinkNameToolTip;

	@FindBy(xpath = "//input[@formcontrolname='repositorylink']")
	WebElement repositoryLinkName;

	public String get_Text_ToolTipRepositoryLinkName() {
		mouseHover(repositoryLinkName);
	String repositoryLinkNameToolTipText = repositoryLinkNameToolTip.getText();

		System.out.println("toolTipText-->" + repositoryLinkNameToolTipText);
		return repositoryLinkNameToolTipText;

	}

}
