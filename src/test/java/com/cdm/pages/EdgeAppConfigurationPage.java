package com.cdm.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeAppConfigurationPage extends CommonActions {

	public EdgeAppConfigurationPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edge-appli-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")

	WebElement edgeIDDot;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement saveButton;

	@FindBy(xpath = "//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edge-appli-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")

	WebElement bulkApplicationconfigurationBtn;

	@FindBy(xpath = "//div[contains(text(),' App Group Name ')]/../../..//mat-icon")

	WebElement edgeGroupNameConfigDot;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//input[@name ='controllername']")
	WebElement edgeGroupNamedeployment;

	@FindBy(xpath = "//input[@name ='displayname']")
	WebElement applicationDeploymentGroupNameSearch;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement selectedCheckbox;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxLabel;

	@FindBy(xpath = "//input[@name='appname']")
	WebElement appNameInput;

	@FindBy(xpath = "//input[@name='tag']")
	WebElement edgeVersionNameInput;

	@FindBy(xpath = "//input[@name='devicename']")
	WebElement applicationconfigurationEdgeIDDevice;

	@FindBy(xpath = "//input[@name ='devicename']")
	WebElement edgeDeployment;

	@FindBy(xpath = "//input[@name='appgroupname']")
	WebElement appGroupNameInputdeploy;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/mat-checkbox")

	// @FindBy(xpath="/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-edge-appli-config/div/div/mat-horizontal-stepper/div[2]/div[3]/form/div[1]/div/div/div/table/tbody/tr[6]/td[1]/mat-checkbox/label/span[1]")
	WebElement checkboxEdgeStepThreeName;

	@FindBy(xpath = "//div[contains(text(),'Config Name')]/../../..//mat-icon")
	WebElement ConfigNameAppDeploymentDot;

	@FindBy(xpath = "//input[@name='name']")
	WebElement ConfigNameAppDeploymentInput;

	@FindBy(xpath = "((//tbody/tr[1]/td[1]/mat-checkbox)//label)[3]")
	WebElement selectedcheckboxEdgeStepThreeNameLabel;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement checkboxAppName;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[2]//label")
	WebElement selectedCheckboxAppNameLabel;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[2]//input")
	WebElement checkboxEdgeName;

	@FindBy(xpath = "((//tbody)[4])/tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxConfigName;

	@FindBy(xpath = "((//tbody)[4])/tr[1]/td[1]/mat-checkbox//label")
	WebElement selectedCheckboxConfigNameLabel;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[2]//label")
	WebElement selectedCheckboxEdgeNameSacLabel;

	@FindBy(xpath = "//div[contains(text(),'App Group Name ')]/../../..//mat-icon")
	WebElement appGroupNameDot;

	@FindBy(xpath = "//input[@formcontrolname='name']")
	WebElement nameconfiguration;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edge-appli-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[4]/form[1]/div[1]/img[1]")
	WebElement addconfigurationicon;

	@FindBy(xpath = "//input[@formcontrolname = 'proxy_app']")
	WebElement proxyAppinput;

	@FindBy(xpath = "//div[contains(text(),'  EDGE ')]/../../..//mat-icon")
	WebElement edgeDot;

	@FindBy(xpath = "//mat-select[@formcontrolname='type']")
	WebElement configurationFileType;

	@FindBy(xpath = "//div[contains(text(),' EDGE Group Name ')]/../../..//mat-icon")
	WebElement deployementEdgeGroupNameDot;

	@FindBy(xpath = "//div[contains(text(),' EDGE ID')]/../../..//mat-icon")
	WebElement deploymentEdgeGroupId;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-controller[1]/div[1]/div[1]/div[1]/img[5]")
	WebElement BulkAppDeploymentButton;

	@FindBy(xpath = "//h4/span[contains(text(),'Application Deployment')]")
	WebElement headingConfigurationTitle;

	@FindBy(xpath = "//h4/span[contains(text(),'Application Configuration')]")
	WebElement headingConfigurationBulk;

	@FindBy(css = ".tableCard h4")
	WebElement deployListpageVerification;

	@FindBy(xpath = "//div[contains(text(),'App Name')]/../../..//mat-icon")

	WebElement appNameDot;

	@FindBy(xpath = "(//button//span[contains(text(),'Next')])[1]/..")
	WebElement NextButton1;

	@FindBy(xpath = "(//button//span[contains(text(),'Next')])[2]/..")
	WebElement NextButton2;

	@FindBy(xpath = "(//button//span[contains(text(),'Next')])[3]/..")
	WebElement NextButton3;

	@FindBy(xpath = "(//button//span[contains(text(),'Next')])[4]/..")
	WebElement NextButton4;

	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	WebElement confirmDeployButton;

	@FindBy(xpath = "//button[@type='submit'][2]")
	WebElement deployButton;

	public void headingConfigurationTitleClick() {
		clickElement(headingConfigurationTitle, "Clicking on Title of heading");
		// headingConfigurationTitle.click();
	}

	public void BulkAppDeploymentButton() {
		clickElement(BulkAppDeploymentButton, "");
		// ElementExist(BulkAppDeploymentButton, getScreenshot());

	}

	public String verifyDeployBreadcrumb() {
		String breadcrumb = deployListpageVerification.getText();
		return breadcrumb;

	}

	public void appNameDot() {
		clickElement(appNameDot, "");
//		appNameDot.click();
	}

	public void NextButtonStep1() {
		clickElement(NextButton1, "");
//		NextButton1.click();
	}

	public void NextButtonStep2() throws InterruptedException {
		clickElement(NextButton2, "");
//		NextButton2.click();
//		
	}

	public void NextButtonStep3() throws InterruptedException {
		clickElement(NextButton3, "");
		// NextButton3.click();

	}

	public void NextButtonStep4() throws InterruptedException {
		clickElement(NextButton4, "");
//		NextButton4.click();
//		
	}

	public void appGroupNameDot() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", appGroupNameDot);

	}

	public void edgeDot() {
		clickElement(edgeDot, "");
		// edgeDot.click();
	}

	public void appGroupNameInputdeploy(String value) {
		appGroupNameInputdeploy.sendKeys(value);
	}

	public void appNameInput(String value) {
		appNameInput.sendKeys(value);
	}

	public void edgeDeployment(String value) {
		edgeDeployment.sendKeys(value);
	}

	public void deployementEdgeGroupNameDot() {
		clickElement(deployementEdgeGroupNameDot, "");
//		deployementEdgeGroupNameDot.click();
	}

	public void edgeGroupNamedeployment(String value) {
		edgeGroupNamedeployment.sendKeys(value);
	}

	public void checkboxEdgeGroupNameStepOneName() {

		clickElement(selectedCheckboxLabel, "");

		if (selectedCheckbox != null) {
			String checked = selectedCheckbox.getDomAttribute("checked");
			if (checked != "checked") {
				clickElement(selectedCheckboxLabel, "");
			}
		}

	}

	public void checkboxEdgeStepThreeName() {

		clickElement(selectedcheckboxEdgeStepThreeNameLabel, "");

		if (checkboxEdgeStepThreeName != null) {
			String checked = checkboxEdgeStepThreeName.getDomAttribute("checked");
			if (checked != "checked") {
				clickElement(selectedcheckboxEdgeStepThreeNameLabel, "");
				// selectedcheckboxEdgeStepThreeNameLabel.click();;

			}
		}

	}

	public void checkboxConfiguration() {
		clickElement(selectedCheckboxConfigNameLabel, "");

		if (checkboxConfigName != null) {
			String checked = checkboxConfigName.getDomAttribute("checked");
			if (checked != "checked") {
				clickElement(selectedCheckboxConfigNameLabel, "");
				// selectedCheckboxConfigNameLabel.click();

			}
		}

	}

	public void checkboxAppNameStepTwoName() {
		clickElement(selectedCheckboxAppNameLabel, "");

		if (checkboxAppName != null) {
			String checked = checkboxAppName.getDomAttribute("checked");
			if (checked != "checked") {
				clickElement(selectedCheckboxAppNameLabel, "");
				// selectedCheckboxAppNameLabel.click();
			}
		}

	}

	public void ConfigcheckboxAppNameStepThree() {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxAppNameLabel));

			if (checkboxAppName != null) {
				String checked = checkboxAppName.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxAppNameLabel.click();
				}
			}
		} catch (Exception e) {

		}

	}

	public void checkboxEdgeNameStepFour() {
		clickElement(selectedCheckboxEdgeNameSacLabel, "");

		if (checkboxEdgeName != null) {
			String checked = checkboxEdgeName.getDomAttribute("checked");
			if (checked != "checked") {
				clickElement(selectedCheckboxEdgeNameSacLabel, "");
//					selectedCheckboxEdgeNameSacLabel.click();
			}
		}

	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void edgeGroupNameConfigDot() {
		clickElement(edgeGroupNameConfigDot, "");
		// edgeGroupNameConfigDot.click();
	}

	public void confirmDeployButton() {
		clickElement(confirmDeployButton, "");
		// confirmDeployButton.click();
	}

	public void edgeVersionNameInput(String value) {
		edgeVersionNameInput.sendKeys(value);
	}

	public void confignameinput(String value) {
		// nameconfiguration.sendKeys(Keys.ENTER);
		nameconfiguration.sendKeys(value);
	}

	public void proxyAppinput(String value) {
		// proxyAppinput.sendKeys(Keys.ENTER);
		proxyAppinput.sendKeys(value);
	}

	public void saveButton() {
		clickElement(saveButton, "");
		// saveButton.click();
	}

	public void applicationDeploymentGroupNameSearch(String value) {
		SetInputENterKey(applicationDeploymentGroupNameSearch, value);
		SetInput(applicationDeploymentGroupNameSearch, value, value);
//		applicationDeploymentGroupNameSearch.sendKeys(Keys.ENTER);
//		applicationDeploymentGroupNameSearch.sendKeys(value);
	}

	public void applicationconfigurationEdgeIDDevice(String value) {
		SetInputENterKey(applicationconfigurationEdgeIDDevice, value);
		SetInput(applicationconfigurationEdgeIDDevice, value, value);
//		applicationconfigurationEdgeIDDevice.sendKeys(Keys.ENTER);
//		applicationconfigurationEdgeIDDevice.sendKeys(value);
	}

	public void deploymentEdgeGroupId() {
		clickElement(deploymentEdgeGroupId, "");
		// deploymentEdgeGroupId.click();
	}

	public void ConfigNameAppDeploymentDot() {

		clickElement(ConfigNameAppDeploymentDot, "");

		// ConfigNameAppDeploymentDot.click();

	}

	public void ConfigNameAppDeploymentInput(String value) {
		SetInputENterKey(ConfigNameAppDeploymentInput, value);
		SetInput(ConfigNameAppDeploymentInput, value, value);
//		
//		ConfigNameAppDeploymentInput.sendKeys(Keys.ENTER);
//		ConfigNameAppDeploymentInput.sendKeys(value);
	}

	public void headingConfigurationBulk() {
		clickElement(headingConfigurationBulk, "");

		// headingConfigurationBulk.click();
	}

	public void addconfigurationicon() {
		clickElement(addconfigurationicon, "");

		// addconfigurationicon.click();
	}

	public void configurationFileType(String value) throws InterruptedException {

		SelectMatOption(configurationFileType, value);
	}

}
