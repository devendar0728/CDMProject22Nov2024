package com.cdm.pages.Latest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class AppsPage extends CommonActions {

	public AppsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryEditToolTip;

	@FindBy(xpath = "//app-applist[1]/div[1]/div[1]/img[1]")
	WebElement refreshlist;


	@FindBy(xpath = "//ul[@class='nav']/li[9]")
	WebElement App_tab;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(css = ".cdk-overlay-container")
	WebElement statusToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryVersionAppToolTip;


	@FindBy(xpath = "//input[@formcontrolname='tag']")
	WebElement repositoryVersionApp
	;


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
	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement applicationthreedot;


	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]")
	WebElement applicationNameFilter;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement architecturethreedot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement versionThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement stausThreeDot;

	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[5]/span[1]/img[1]")
	WebElement inActiveIcon;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[1]")
	WebElement viewVolumeDetails;


	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[2]")
	WebElement editButtonConfig;



	@FindBy(xpath = "//input[@formcontrolname='repositorylink']")
	WebElement repositoryLinkEdit;


	@FindBy(xpath = "//input[@name='tag']")
	WebElement versionTag;


	@FindBy(xpath = "//input[@name='appname']")
	WebElement applicationName;

	@FindBy(xpath = "//input[@name='architecture']")
	WebElement architecture;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveAddDataBtn;



	public void applicationName(String value) {
//		applicationName.sendKeys(Keys.ENTER);
//		applicationName.sendKeys(value);

		SetInputENterKey(applicationName, value);
		SetInput(applicationName, value, value);
	}

	public void architecture(String value) {

		SetInputENterKey(architecture, value);
		SetInput(architecture, value, value);

//		architecture.sendKeys(Keys.ENTER);
//		architecture.sendKeys(value);
	}

	public void versionTag(String value) {

		SetInputENterKey(versionTag, value);
		SetInput(versionTag, value, value);

//		versionTag.sendKeys(Keys.ENTER);
//		versionTag.sendKeys(value);
	}



	public void Apps_tab() throws InterruptedException {

		clickElement(App_tab,"");
		//App_tab.click();
	}

	public void applicationthreedot() {
		clickElement(applicationthreedot,"");
		//applicationthreedot.click();
	}
	public void architecturethreedot() {
		clickElement(architecturethreedot,"");
		//architecturethreedot.click();
	}
	public void versionThreeDot() {
		clickElement(versionThreeDot,"");
		//versionThreeDot.click();
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			clickElement(backDropShowing,"");
			//backDropShowing.click();
		}
	}



	public void inactivecrossbar() {
		clickElement(inActiveIcon,"");
		//inActiveIcon.click();
	}

	public void viewVolumeDetails() {
		clickElement(viewVolumeDetails,"");
		//viewVolumeDetails.click();
	}
	public void confirmationYesButton() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement confirmationYesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Yes')]")));
		WebElement confirmationNoButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'No')]")));
       // Perform a click action on the confirmation Yes button
		//clickElement(confirmationYesButton, "");
      // .click();
		clickElement(confirmationNoButton, "");
      // confirmationNoButton.click();

	}

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}
	public void refreshlist() {
		clickElement(refreshlist, "");
		//refreshlist.click();
	}

	public String get_Text_ToolTipStatus() {
		mouseHover(stausThreeDot);

		String statusText = statusToolTip.getText();

		statusText.trim();

		return statusText;
	}

	public void editButtonConfig() {
		wait(editButtonConfig,logger);
		//clickElement(editButtonConfig, "");
		editButtonConfig.click();
	}

	public void applicationNameFilter() {

		clickElement(applicationNameFilter, "");
	}

	public String get_Text_ToolTipRepositoryLink() {


		mouseHover(repositoryLinkEdit);


		String repositoryLinkToolTipText = repositoryLinkToolTip.getText();

		System.out.println("toolTipText-->" + repositoryLinkToolTipText);

		return repositoryLinkToolTipText;
	}

	public String get_Text_ToolTipVersionApp() {

		mouseHover(repositoryVersionApp);


		String repositoryVersionAppToolTipText = repositoryVersionAppToolTip.getText();

		System.out.println("toolTipText-->" + repositoryVersionAppToolTipText);

		return repositoryVersionAppToolTipText;

	}


	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryArchiectureToolTip;

	@FindBy(xpath = "//input[@formcontrolname='architecture']")
	WebElement repositoryArchiecture;

	public String get_Text_ToolTipArchitecture() {
		mouseHover(repositoryArchiecture);


		String repositoryArchiectureText = repositoryArchiectureToolTip.getText();

		System.out.println("toolTipText-->" + repositoryArchiectureText);

		return repositoryArchiectureText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement configMasterEditToolTip;

	@FindBy(xpath = "//input[@formcontrolname='config_master']")
	WebElement configMasterEdit;

	public String get_Text_ToolTipConfigMaster() {
		mouseHover(configMasterEdit);


		String configMasterEditToolTipText = configMasterEditToolTip.getText();

		System.out.println("toolTipText-->" + configMasterEditToolTipText);

		return configMasterEditToolTipText;
	}


	@FindBy(css = ".cdk-overlay-container")
	WebElement configNameToolTip;

	@FindBy(xpath = "//div[contains(text(),'Config Name')]")
	WebElement configNameLabel;

	public String get_Text_ToolTipConfigName() {
		mouseHover(configNameLabel);


		String configNameLabelText = configNameToolTip.getText();

		System.out.println("toolTipText-->" + configNameLabelText);

		return configNameLabelText;
	}

	public void minimiseWindow() {
		driver.manage().window().minimize();
	}

	public void maximiseWindow() {
		driver.manage().window().minimize();

	}


		@FindBy(css= ".cdk-overlay-container")
		WebElement outerlayerclick;
		public void outerlayerclick() {
			clickElement(outerlayerclick, "");

		}

		public void statusThreeDot() {
		clickElement(stausThreeDot,"");
		}

		public void outerlayerClick() {

				clickElement(outerlayerclick, "");

			}

		}





