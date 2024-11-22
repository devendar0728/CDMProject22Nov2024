package com.cdm.pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class VolumesAddPage extends CommonActions {

	public VolumesAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@formcontrolname='volumename']/../../../../../span")
	WebElement validationMessageverifyValidationMessageVolumeName;


	@FindBy(xpath = "//input[@formcontrolname='licensetype']/../../../../../span")
	WebElement validationMessageverifyValidationMessageLicenseType;

	@FindBy(xpath = "//input[@formcontrolname='shakey']/../../../../../span")
	WebElement validationMessageverifyValidationMessageshakey;


	@FindBy(xpath = "//input[@formcontrolname='architecture']/../../../../../span")
	WebElement validationMessageverifyValidationMessagearchitecture;


	@FindBy(xpath = "//*[@id=\"togBtn\"]")
	WebElement sliderOnCheckBox;

	@FindBy(xpath = "//*[@id=\"togBtn\"]/..")
	WebElement sliderOnCheckBoxLabel;


	//Either checked or unchecked
		public void moveSliderCondition(String m) {
			moveSliderCondition(sliderOnCheckBox,sliderOnCheckBoxLabel,m);
		}


	@FindBy(css = ".cdk-overlay-container")
	WebElement volumeNameToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement profileiconToolTip;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[2]/button[1]/span[1]/img[1]")
	WebElement profileicon;

	@FindBy(xpath = "//h4")
	WebElement headingTitleAdd;

	@FindBy(xpath = "//mat-icon[@matbadgecolor='warn']")
	WebElement bellicon;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButton;

	@FindBy(css = ".cdk-overlay-container")
	WebElement englishLogoToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryNameToolTip;

	@FindBy(xpath = "//div[@class='slider round']")
	WebElement sliderRound;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]")

	WebElement englishLogo;

	@FindBy(css = ".cdk-overlay-container")
	WebElement typeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryLinkToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement licenseTypeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement mountDirectoryToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement versionToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement architectureToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement maxsizeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement SHAKeyToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement bellicontooltip;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement VolumeNameSavebutton;

	@FindBy(xpath = "//mat-select[@formcontrolname='type']")
	WebElement volumeRepositoryType;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	@FindBy(xpath = "//mat-select[@formcontrolname='repositoryid']")
	WebElement volumeRepositoryName;

	@FindBy(xpath = "//input[@formcontrolname ='licensetype']")
	WebElement volumeLicenseTypeAdd;

	@FindBy(xpath = "//input[@name ='volumename']")
	WebElement volumeNameSearch;

	@FindBy(xpath = "//input[@formcontrolname='volumename']")
	WebElement volumeNameAdd;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/div/span/img")
	WebElement volumeAddPlusicon;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement volumeNameThreeDot;

	@FindBy(xpath = "//input[@formcontrolname='repositoryid']")
	WebElement volumeRepositoryNameAdd;

	@FindBy(xpath = "//mat-select[@formcontrolname='type']")
	WebElement volumeTypeAdd;

	@FindBy(xpath = "//input[@formcontrolname='repositorylink']")
	WebElement volumerepositorylinkAdd;

	@FindBy(xpath = "//input[@formcontrolname='licensetype']")
	WebElement licensetypeAdd;

	@FindBy(xpath = "//input[@formcontrolname='tag']")
	WebElement volumetagAdd;

	@FindBy(xpath = "//input[@formcontrolname='shakey']")
	WebElement volumeSHAKeyAdd;

	@FindBy(xpath = "//input[@formcontrolname='mountdirectory']")
	WebElement volumemountdirectoryAdd;

	@FindBy(xpath = "//input[@formcontrolname='architecture']")
	WebElement volumearchitectureAdd;

	@FindBy(xpath = "//input[@formcontrolname='maxsize']")
	WebElement volumemaxsizeAdd;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveAddDataBtn;

	@FindBy(xpath = "//tr/td[5]/img[1]")
	WebElement editbutton;

	public void volumeAddPlusicon() {
		clickElement(volumeAddPlusicon,"Clicking on plus icon on volume page");


	}

	public void volumesearch(String value) {
		volumeNameSearch.sendKeys(Keys.ENTER);
		volumeNameSearch.sendKeys(value);
	}

	public void volumeName(String value) {

		wait(volumeNameAdd,logger);
		//volumeNameAdd.sendKeys(Keys.ENTER);
		volumeNameAdd.sendKeys(value);
	}

	public void volumerepositorylinkAdd(String value) {
		volumerepositorylinkAdd.sendKeys(Keys.ENTER);
		volumerepositorylinkAdd.sendKeys(value);
	}

	public void licensetypeAdd(String value) {
		licensetypeAdd.sendKeys(Keys.ENTER);
		licensetypeAdd.sendKeys(value);
	}

	public void volumeLicenseTypeAdd(String value) {
		volumeLicenseTypeAdd.sendKeys(Keys.ENTER);
		volumeLicenseTypeAdd.sendKeys(value);
	}

	public void volumeRepositoryNameAdd(String value) throws InterruptedException {

		wait(volumeRepositoryName,logger);
		SelectMatOption(volumeRepositoryName, value);
	}

	public void volumeRepositoryTypeAdd(String value) throws InterruptedException {

		wait(volumeRepositoryType,logger);
		SelectMatOption(volumeRepositoryType, value);
	}

	public void volumemountdirectoryAdd(String value) {
		SetInputENterKey(volumemountdirectoryAdd,"");
		SetInput(volumemountdirectoryAdd, value, value);
		//volumemountdirectoryAdd.sendKeys(Keys.ENTER);
//		volumemountdirectoryAdd.sendKeys(value);
	}

	public void volumeSHAKeyAdd(String value) {

		SetInputENterKey(volumeSHAKeyAdd,"");
		SetInput(volumeSHAKeyAdd, value, value);

//		volumeSHAKeyAdd.sendKeys(Keys.ENTER);
//		volumeSHAKeyAdd.sendKeys(value);
	}

	public void volumetagAdd(String value) {
		SetInputENterKey(volumetagAdd,"");
		SetInput(volumetagAdd, value, value);

//		volumetagAdd.sendKeys(Keys.ENTER);
//		volumetagAdd.sendKeys(value);
	}

	public void volumearchitectureAdd(String value) {

		SetInputENterKey(volumetagAdd,"");
		SetInput(volumetagAdd, value, value);


//		volumearchitectureAdd.sendKeys(Keys.ENTER);
//		volumearchitectureAdd.sendKeys(value);
	}

	public void volumemaxsizeAdd(String value) {
		SetInputENterKey(volumetagAdd,"");
		SetInput(volumetagAdd, value, value);

//		volumemaxsizeAdd.sendKeys(Keys.ENTER);
//		volumemaxsizeAdd.sendKeys(value);
	}

	public void volumeSavebutton() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".addButton\").click()");
		Thread.sleep(6000);
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			clickElement(backDropShowing, "");
			//backDropShowing.click();
		}
	}

	public String get_Text_ToolTipVolumeName() {

		mouseHover(volumeNameAdd);

		String volumeNameButton = volumeNameToolTip.getText();

		volumeNameButton.trim();

		return volumeNameButton;
	}

	public String get_Text_ToolTipRepositoryName() {

		mouseHover(volumeRepositoryName);

		String repositoryNameTooltip = repositoryNameToolTip.getText();

		repositoryNameTooltip.trim();

		return repositoryNameTooltip;
	}

	public String get_Text_ToolTipType() {

		mouseHover(volumeTypeAdd);

		String typetooltip = typeToolTip.getText();

		typetooltip.trim();

		return typetooltip;
	}

	public String get_Text_ToolTiprepositoryLink() {

		mouseHover(volumerepositorylinkAdd);

		String repositoryLinkToolTiptext = repositoryLinkToolTip.getText();

		repositoryLinkToolTiptext.trim();

		return repositoryLinkToolTiptext;
	}

	public String get_Text_ToolTipmaxSize() {

		mouseHover(volumemaxsizeAdd);

		String maxsizeToolTipText = maxsizeToolTip.getText();

		maxsizeToolTipText.trim();

		return maxsizeToolTipText;
	}

	public String get_Text_ToolTipmountDirectory() {

		mouseHover(volumemountdirectoryAdd);

		String mountDirectoryToolTipText = mountDirectoryToolTip.getText();

		mountDirectoryToolTipText.trim();

		return mountDirectoryToolTipText;
	}

	public String get_Text_ToolTiparchitecture() throws InterruptedException {

		mouseHover(volumearchitectureAdd);
		Thread.sleep(3000);
		String architectureToolTipText = architectureToolTip.getText();

		architectureToolTipText.trim();

		return architectureToolTipText;
	}

	public String get_Text_ToolTipversion() {

		mouseHover(volumetagAdd);

		String versionToolTipText = versionToolTip.getText();

		versionToolTipText.trim();

		return versionToolTipText;
	}

	public String get_Text_ToolTipEnglishLogo() {

		mouseHover(englishLogo);

		String englishLogoToolTipText = englishLogoToolTip.getText();

		englishLogoToolTipText.trim();

		return englishLogoToolTipText;
	}

	public String get_Text_ToolTipbellicon() {

		mouseHover(bellicon);

		String bellicontooltipText = bellicontooltip.getText();

		bellicontooltipText.trim();

		return bellicontooltipText;
	}

	public String get_Text_ToolTipprofile() {

		mouseHover(profileicon);

		String bellicontooltipText = profileiconToolTip.getText();

		bellicontooltipText.trim();

		return bellicontooltipText;
	}

	public void belliconclick() {
		clickElement(bellicon, "");
		//bellicon.click();
	}

	public void profileicon() {
		clickElement(bellicon, "");
		//profileicon.click();
	}

	public void volumeNameThreeDot() {
		clickElement(volumeNameThreeDot, "");
		//volumeNameThreeDot.click();
	}

	public void editbutton() {
		clickElement(editbutton, "");
		//editbutton.click();
	}

	public void cancelButton() {
		clickElement(cancelButton, "");
		//cancelButton.click();
	}

	public void verifyToggleColor(String expectedColor) {
        // Retrieve the stored color value from the context

		String expectedcolour =sliderRound.getCssValue("background-color");


			Assert.assertEquals("rgba(42, 185, 52, 1)", expectedcolour);
    }

	public void headingTitleAdd() {
		clickElement(headingTitleAdd, "");
		//headingTitleAdd.click();
	}

	public String verifyValidationMessageVolumeName() {
		if (validationMessageverifyValidationMessageVolumeName == null) {
			return "";
		}
		String message = validationMessageverifyValidationMessageVolumeName.getText();

		return message;
	}


	public String verifyValidationMessageLicenseType() {
		if (validationMessageverifyValidationMessageLicenseType == null) {
			return "";
		}
		String message = validationMessageverifyValidationMessageLicenseType.getText();

		return message.trim();
	}


	public String verifyValidationMessageSHAkey() {
		if (validationMessageverifyValidationMessageshakey == null) {
			return "";
		}

		String message = validationMessageverifyValidationMessageshakey.getText();

		return message.trim();
	}

	public String verifyValidationMessagearchitecture() {
		if (validationMessageverifyValidationMessagearchitecture == null) {
			return "";
		}
		wait(validationMessageverifyValidationMessagearchitecture,logger);
		String message = validationMessageverifyValidationMessagearchitecture.getText();

		return message.trim();
	}

	public String get_Text_ToolTipSHAKey() {
		mouseHover(volumeSHAKeyAdd);

		String volumeSHAKeyToolTipText = SHAKeyToolTip.getText();

		volumeSHAKeyToolTipText.trim();

		return volumeSHAKeyToolTipText;
	}

	public void minimizeWindow() {
		driver.manage().window().minimize();


	}

	public void maximisewindow() {
		driver.manage().window().maximize();

	}
	@FindBy(css= ".cdk-overlay-container")
	WebElement outerlayerclick;
	public void outerlayerclick() {
		// TODO Auto-generated method stub
		clickElement(outerlayerclick, "");
	}

}
