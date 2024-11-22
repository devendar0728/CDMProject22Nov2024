package com.cdm.pages.Latest;

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

public class EdgeGroupConfigurationPage extends CommonActions {

	public EdgeGroupConfigurationPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//mat-horizontal-stepper[1]/div[2]/div[4]/form[1]/div[2]/button[1]")
	WebElement previousButtonApplicationonDeploymentButton;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//thead/tr[1]/th[1]/mat-checkbox/label/span/input")
	WebElement checkallAppName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//thead/tr[1]/th[1]/mat-checkbox/label")
	WebElement checkboxAllappNameLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxConfigName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr[1]//td[1]//mat-checkbox//label")
	WebElement checkboxAppNameSingleSelectLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr[2]//td[1]//mat-checkbox//label")
	WebElement checkboxAppNameSingleSelectLabelTwo;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr/th[1]/mat-checkbox//input")
	WebElement checkboxEdgeDeviceAll;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxApplicationConfiguration;

	@FindBy(xpath = "//div[contains(text(),'Version/Tag ')]/../../..//mat-icon")

	WebElement edgeVersionDot;

	@FindBy(xpath = "//div[contains(text(),'App Name')]/../../..//mat-icon")

	WebElement edgeAppNameDot;

	@FindBy(xpath = "//div[contains(text(),' EDGE Group Name ')]/../../..//mat-icon")

	WebElement edgeGroupNameConfigDot;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//input[@name ='controllername']")
	WebElement edgeGroupNamedeployment;

	@FindBy(xpath = "//input[@name ='displayname']")
	WebElement applicationDeploymentGroupNameSearch;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement selectedCheckbox;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxEdgeGroupNameDeploymentLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label//input")
	WebElement selectedCheckboxEdgeGroupNameDeploymentInput;

	@FindBy(xpath = "//input[@name='appname']")
	WebElement appNameInput;

	@FindBy(xpath = "//input[@name='appname']")
	WebElement appNameConfigInput;

	@FindBy(xpath = "//input[@name='tag']")
	WebElement edgeVersionNameInput;

	@FindBy(xpath = "//input[@name ='devicename']")
	WebElement edgeDeployment;

	@FindBy(xpath = "//input[@name ='devicename']")
	WebElement edgeIdConfigurationInput;

	@FindBy(xpath = "//input[@name='appgroupname']")
	WebElement appGroupNameInputdeploy;

	// @FindBy(xpath = "((//tbody/tr[1]/td[1]/mat-checkbox)//input)[3]")
	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxEdgeStepThreeName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox/label")
	WebElement selectedcheckboxEdgeStepThreeNameLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//input")
	WebElement checkboxEdgeGroupsAppGroupName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//(//tbody/tr[1]/td[1]/mat-checkbox[1])[2]//label")
	WebElement selectedCheckboxEdgeGroupsAppGroupNameLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxEdgeName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr//td)[1]//input")
	WebElement checkboxEdgeNameApplication;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox[1]/label/span[1]/input")
	WebElement checkboxApplicationEdgeDeviceConfig;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[2]/td[1]/mat-checkbox[1]/label/span[1]/input")
	WebElement checkboxApplicationEdgeDeviceConfig1;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr//td)[1]//label")
	WebElement selectedCheckboxEdgeNameSacLabel;

	@FindBy(xpath = "//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/mat-checkbox[1]/label[1]")
	WebElement selectedCheckboxEdgeNameSacLabel1;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox[1]/label")
	WebElement selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfigLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//mat-checkbox//label)")
	WebElement selectedCheckboxAppNameConfigLabel;

	@FindBy(xpath = "//div[@role='tabpanel' and @aria-expanded='true']//table//mat-checkbox//input")
	WebElement selectedCheckboxAppNameConfigInputBoxField;

	@FindBy(xpath = "//div[@role='tabpanel' and @aria-expanded='true']//table//mat-checkbox//label[1]")
	WebElement selectedCheckboxAppNameConfigLabelType;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//mat-checkbox//input)")
	WebElement selectedCheckboxAppNameConfiginputBox;

	@FindBy(xpath = "//div[contains(text(),'App Group Name ')]/../../..//mat-icon")
	WebElement appGroupNameDot;

	@FindBy(xpath = "//div[contains(text(),'  EDGE ')]/../../..//mat-icon")
	WebElement edgeDot;

	@FindBy(xpath = "//div[contains(text(),' EDGE Group Name ')]/../../..//mat-icon")
	WebElement deployementEdgeGroupNameDot;

	@FindBy(xpath = "//div[contains(text(),' EDGE ID ')]/../../..//mat-icon")
	WebElement edgeIDApplicationConfiguration;

	@FindBy(xpath = "//h2[@class='titleHeading']/../div/img[5]")
	WebElement BulkAppDeploymentButton;

	@FindBy(xpath = "//h4/span[contains(text(),'Application Deployment')]")
	WebElement headingConfigurationTitle;

	@FindBy(css = ".tableCard h4")
	WebElement deployListpageVerification;

	@FindBy(xpath = "(//div[contains(text(),'App Name')]/../../..//mat-icon)[4]")

	WebElement appNameDot;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-edgegroup-config/div/div/mat-horizontal-stepper/div[2]/div[1]/form/div[2]/button")
	WebElement NextButton1;

	@FindBy(xpath = "(//button//span[contains(text(),'Next')])[2]/..")
	WebElement NextButton2;

	@FindBy(xpath = "(//button//span[contains(text(),'Next')])[3]/..")
	WebElement NextButton3;

	@FindBy(xpath = "(//button//span[contains(text(),'Next')])[4]/..")
	WebElement NextButton4;

	@FindBy(xpath = "//h4/span")
	WebElement titleApplicationDeployment;

	@FindBy(xpath = "//button/span[contains(text(),'Confirm')]")
	WebElement confirmDeployButton;

	@FindBy(xpath = "//button[@type='submit'][2]")
	WebElement deployButton;

	@FindBy(xpath = "((//thead)[2])/tr/th[1]/mat-checkbox//label")
	WebElement allselectionEdgeDeviceLabel;

	@FindBy(xpath = "((//thead)[3])/tr/th[1]/mat-checkbox//label")
	WebElement allselectionEdgeDeviceLabelDeploymentlabel;

	public void headingConfigurationTitleClick() {
		clickElement(headingConfigurationTitle, "Clicking on Title of heading");
		// headingConfigurationTitle.click();
	}

	public void BulkAppDeploymentButton() {
		// BulkAppDeploymentButton.click();
		clickElement(BulkAppDeploymentButton, "");
		// ElementExist(BulkAppDeploymentButton, getScreenshot());

	}

	public String verifyDeployBreadcrumb() {
		String breadcrumb = deployListpageVerification.getText();
		return breadcrumb;

	}

	public void appNameDot() {
		clickElement(appNameDot, "");
		// appNameDot.click();
	}

	public void NextButtonStep1() {
		clickElement(NextButton1, "");
		// NextButton1.click();
	}

	public void NextButtonStep2() throws InterruptedException {
		clickElement(NextButton2, "");
		// NextButton2.click();

	}

	public void NextButtonStep3() throws InterruptedException {
		clickElement(NextButton3, "");
		// NextButton3.click();

	}

	public void NextButtonStep4() throws InterruptedException {
		clickElement(NextButton4, "");
		// NextButton4.click();

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
		SetInputENterKey(appGroupNameInputdeploy, "");
		SetInput(appGroupNameInputdeploy, value, value);

		// appGroupNameInputdeploy.sendKeys(value);
	}

	public void appNameInput(String value) {

		SetInputENterKey(appNameInput, "");
		SetInput(appNameInput, value, value);

//		appNameInput.sendKeys(Keys.ENTER);
//		appNameInput.sendKeys(value);
	}

	public void edgeDeployment(String value) {
		SetInputENterKey(edgeDeployment, "");
		SetInput(edgeDeployment, value, value);

		// edgeDeployment.sendKeys(value);
	}

	public void deployementEdgeGroupNameDot() {
		clickElement(deployementEdgeGroupNameDot, "");
		// deployementEdgeGroupNameDot.click();
	}

	public void edgeGroupNamedeployment(String value) {
		SetInputENterKey(edgeGroupNamedeployment, "");
		SetInput(edgeGroupNamedeployment, value, value);
//		
//		edgeGroupNamedeployment.sendKeys(Keys.ENTER);
//		edgeGroupNamedeployment.sendKeys(value);
	}

	public void checkboxEdgeGroupNameDeploymentStepOneName() {

		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxEdgeGroupNameDeploymentLabel));

			if (selectedCheckboxEdgeGroupNameDeploymentInput != null) {
				String checked = selectedCheckboxEdgeGroupNameDeploymentInput.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxEdgeGroupNameDeploymentLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxEdgeStepThreeName() {

		clickElement(selectedcheckboxEdgeStepThreeNameLabel, "");
		if (checkboxEdgeStepThreeName != null) {
			String checked = checkboxEdgeStepThreeName.getDomAttribute("checked");
			if (checked != "checked") {
				selectedcheckboxEdgeStepThreeNameLabel.click();

			}
		}

	}

	public void checkboxEdgeGroupsAppGroups() {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(selectedCheckboxEdgeGroupsAppGroupNameLabel));

			if (checkboxEdgeGroupsAppGroupName != null) {
				String checked = checkboxEdgeGroupsAppGroupName.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxEdgeGroupsAppGroupNameLabel.click();
				}
			}
		} catch (Exception e) {

		}

	}

	public void checkboxEdgeNameStepFour() {
		try {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", selectedCheckboxEdgeNameSacLabel);

			if (checkboxEdgeNameApplication != null) {
				String checked = checkboxEdgeNameApplication.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxEdgeNameSacLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfig() {

		clickElement(selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfigLabel, "");
		if (checkboxApplicationEdgeDeviceConfig != null) {
			String checked = checkboxEdgeName.getDomAttribute("checked");
			if (checked != "checked") {
				selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfigLabel.click();
			}
		}

	}

	public void selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfiglabelTwo() {
		clickElement(selectedCheckboxEdgeNameSacLabel1, "");

		if (checkboxApplicationEdgeDeviceConfig1 != null) {
			String checked = checkboxApplicationEdgeDeviceConfig1.getDomAttribute("checked");
			if (checked != "checked") {
				selectedCheckboxEdgeNameSacLabel1.click();
			}
		}
	}

	public void checkboxApplicationConfiguration() {
		try {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", selectedCheckboxAppNameConfigLabel);

			if (checkboxApplicationConfiguration != null) {
				String checked = checkboxApplicationConfiguration.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxAppNameConfigLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxApplicationConfigurationAppName() {

		if (selectedCheckboxAppNameConfigInputBoxField != null) {
			String checked = selectedCheckboxAppNameConfigInputBoxField.getDomAttribute("checked");
			if (checked != "checked") {
//				clickElement(selectedCheckboxAppNameConfigLabelType, "");
				selectedCheckboxAppNameConfigLabelType.click();
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

	public void deployApp() {
		clickElement(deployButton, "");
		// deployButton.click();
	}

	public void edgeVersionDot() {
		clickElement(edgeVersionDot, "");
		// edgeVersionDot.click();
	}

	public void edgeVersionNameInput(String value) {
		SetInputENterKey(edgeVersionNameInput, "");
		SetInput(edgeVersionNameInput, value, value);

		// edgeVersionNameInput.sendKeys(value);
	}

	public void applicationDeploymentGroupNameSearch(String value) {
		SetInputENterKey(applicationDeploymentGroupNameSearch, "");
		SetInput(applicationDeploymentGroupNameSearch, value, value);
//		
//		
//		applicationDeploymentGroupNameSearch.sendKeys(Keys.ENTER);
//		applicationDeploymentGroupNameSearch.sendKeys(value);
	}

	public void checkboxAllconfigurationEdgeDevice() {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(allselectionEdgeDeviceLabel));
			if (checkboxEdgeDeviceAll != null) {
				String checked = checkboxEdgeDeviceAll.getDomAttribute("checked");
				if (checked != "checked") {
					allselectionEdgeDeviceLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxAllDeploymentEdgeDevice() {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(allselectionEdgeDeviceLabelDeploymentlabel));
			if (checkboxEdgeDeviceAll != null) {
				String checked = checkboxEdgeDeviceAll.getDomAttribute("checked");
				if (checked != "checked") {
					allselectionEdgeDeviceLabelDeploymentlabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxmultiforAppName() {

		clickElement(checkboxAllappNameLabel, "");
		if (checkallAppName != null) {
			String checked = checkallAppName.getDomAttribute("checked");
			if (checked != "checked") {
				checkboxAllappNameLabel.click();
			}
		}
	}

	public void edgeIDApplicationConfigurationThreeDot() {
		clickElement(edgeIDApplicationConfiguration, "");
		// edgeIDApplicationConfiguration.click();
	}

	public void edgeIdConfigurationInput(String value) {
		SetInputENterKey(edgeIdConfigurationInput, "");
		SetInput(edgeIdConfigurationInput, value, value);

		// edgeIdConfigurationInput.sendKeys(value);
	}

	public void titleApplicationDeployment() {
		clickElement(titleApplicationDeployment, "");
		// titleApplicationDeployment.click();
	}

	@FindBy(xpath = "(//table)[3]//tr[1]//td[1]//mat-checkbox//label//span//input")
	WebElement checkboxAppNameSingleSelect;

	public void checkboxAppNameSingleSelectStepTwoName() {
		clickElement(checkboxAppNameSingleSelectLabel, "");
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.elementToBeClickable(checkboxAppNameSingleSelectLabel));

		if (checkboxAppNameSingleSelect != null) {
			String checked = checkboxAppNameSingleSelect.getDomAttribute("checked");
			if (checked != "checked") {
				clickElement(checkboxAppNameSingleSelectLabel, "");
				// checkboxAppNameSingleSelectLabel.click();
			}
		}
	}

	public void checkboxAppNameSingleSelectStepTwoNamedouble() {
		clickElement(checkboxAppNameSingleSelectLabelTwo, "");

		if (checkboxAppNameSingleSelect != null) {
			String checked = checkboxAppNameSingleSelect.getDomAttribute("checked");
			if (checked != "checked") {
				clickElement(checkboxAppNameSingleSelectLabelTwo, "");
//					checkboxAppNameSingleSelectLabelTwo.click();
			}
		}
	}

	public void checkboxAppNamemultiSelectStepTwoNamedouble() {
		clickElement(checkboxAppNameSingleSelectLabelTwo, "");

		if (checkboxAppNameSingleSelect != null) {
			String checked = checkboxAppNameSingleSelect.getDomAttribute("checked");
			if (checked != "checked") {
				clickElement(checkboxAppNameSingleSelectLabelTwo, "");
//					checkboxAppNameSingleSelectLabelTwo.click();
			}
		}
	}

	public void previousButtonApplicationonDeployment() throws InterruptedException {
		clickElement(previousButtonApplicationonDeploymentButton, "");
		//previousButtonApplicationonDeploymentButton.click();
	}

	public void appNameConfigInput(String value) {

		SetInputENterKey(appNameConfigInput, "");
		SetInput(appNameConfigInput, value, value);

//		
//		appNameConfigInput.sendKeys(Keys.ENTER);
//		appNameConfigInput.sendKeys(value);
	}

	public void edgeAppNameDot() throws InterruptedException {
		clickElement(edgeAppNameDot, "");
		// edgeAppNameDot.click();

	}

	public void checkboxEdgeGroupNameStepOneName() {

		clickElement(selectedCheckboxEdgeGroupNameDeploymentLabel, "");
		if (selectedCheckboxEdgeGroupNameDeploymentInput != null) {
			String checked = selectedCheckboxEdgeGroupNameDeploymentInput.getDomAttribute("checked");
			if (checked != "checked") {
				selectedCheckboxEdgeGroupNameDeploymentLabel.click();
			}
		}

	}
}