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

public class EdgeGroupApplicationDeployment extends CommonActions {

	public EdgeGroupApplicationDeployment(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement edgeGroupNameToolTip;

	@FindBy(xpath = "//div[contains(text(),'EDGE Group Name')]")
	WebElement edgeGrouplabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//thead/tr[1]/th[1]/mat-checkbox/label/span/input")
	WebElement checkallAppName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//thead/tr[1]/th[1]/mat-checkbox/label")
	WebElement checkboxAllappNameLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxConfigName;

	@FindBy(xpath = "(//table)[2]//tr[1]//td[1]//mat-checkbox//label[1])")
	WebElement checkboxAppNameSingleSelectLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr/th[1]/mat-checkbox//input")
	WebElement checkboxEdgeDeviceAll;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxApplicationConfiguration;

	@FindBy(xpath = "//div[contains(text(),'Version/Tag ')]/../../..//mat-icon")

	WebElement edgeVersionDot;

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

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label")
	WebElement selectedCheckboxEdgeGroupNameDeploymentLabel;

	@FindBy(xpath = "(//tbody/tr[1]/td[1]/mat-checkbox[1])[1]//label//input")
	WebElement selectedCheckboxEdgeGroupNameDeploymentInput;

	@FindBy(xpath = "//input[@name='appname']")
	WebElement appNameInput;

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

	@FindBy(xpath = "(//table)[2]//tr[1]//td[1]//mat-checkbox//label//span//input")
	WebElement checkboxEdgeGroupsAppGroupName;

	@FindBy(xpath = "(//table)[2]//tr[1]//td[1]//mat-checkbox//label")
	WebElement selectedCheckboxEdgeGroupsAppGroupNameLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox//input")
	WebElement checkboxEdgeName;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tr//td)[1]//input")
	WebElement checkboxEdgeNameApplication;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox[1]/label/span[1]/input")
	WebElement checkboxApplicationEdgeDeviceConfig;

	@FindBy(xpath = "((//div[@aria-expanded='true']//table)//tr//td)[1]//label")
	WebElement selectedCheckboxEdgeNameSacLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//tbody/tr[1]/td[1]/mat-checkbox[1]/label")
	WebElement selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfigLabel;

	@FindBy(xpath = "(//div[@aria-expanded='true']//table)//mat-checkbox//label)")
	WebElement selectedCheckboxAppNameConfigLabel;

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

	@FindBy(xpath = "//div[contains(text(),'App Name')]/../../..//mat-icon")

	WebElement edgeappNameDot;

	@FindBy(xpath = "//app-filter[@name='appname']/div/a/mat-icon")

	WebElement appnameApplicationDeployment;

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

	@FindBy(xpath = "//input[@name='appname']")
	WebElement edgeAppNameInput;

	@FindBy(xpath = "((//thead)[2])/tr/th[1]/mat-checkbox//label")
	WebElement allselectionEdgeDeviceLabel;

	public void headingConfigurationTitleClick() {
		clickElement(headingConfigurationTitle, "Clicking on Title of heading");
		// headingConfigurationTitle.click();
	}

	public void BulkAppDeploymentButton() {
		// BulkAppDeploymentButton.click();
		clickElement(BulkAppDeploymentButton, "");

	}

	public String verifyDeployBreadcrumb() {
		String breadcrumb = deployListpageVerification.getText();
		return breadcrumb;

	}

	public void edgeappNameDot() {
		clickElement(edgeappNameDot, "");
		// edgeappNameDot.click();
	}

	public void NextButtonStep1() {
		clickElement(NextButton1, "");
		// NextButton1.click();
	}

	public void NextButtonStep2() throws InterruptedException {
		clickElement(NextButton2, "");
		// NextButton2.click();
		Thread.sleep(3000);
	}

	public void NextButtonStep3() throws InterruptedException {
		clickElement(NextButton3, "");
		// NextButton3.click();
		Thread.sleep(3000);
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
		SetInput(appGroupNameInputdeploy, value, value);
		// appGroupNameInputdeploy.sendKeys(value);
	}

	public void appNameInput(String value) {
		SetInput(appNameInput, value, value);
		// appNameInput.sendKeys(value);
	}

	public void edgeDeployment(String value) {
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
//		edgeGroupNamedeployment.sendKeys(Keys.ENTER);
//		edgeGroupNamedeployment.sendKeys(value);
	}

	public void checkboxEdgeGroupNameDeploymentStepOneName() {

		try {
			Thread.sleep(2000);
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
		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript("arguments[0].click()",
		// selectedcheckboxEdgeStepThreeNameLabel);
		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(selectedcheckboxEdgeStepThreeNameLabel));
			if (checkboxEdgeStepThreeName != null) {
				String checked = checkboxEdgeStepThreeName.getDomAttribute("checked");
				if (checked != "checked") {
					selectedcheckboxEdgeStepThreeNameLabel.click();

				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxEdgeGroupsAppGroups() {
		try {
			Thread.sleep(4000);
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
		try {
			Thread.sleep(6000);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions
					.elementToBeClickable(selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfigLabel));

			if (checkboxApplicationEdgeDeviceConfig != null) {
				String checked = checkboxEdgeName.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfigLabel.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void checkboxApplicationConfiguration() {
		try {

//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click()", selectedCheckboxAppNameConfigLabel);

			if (checkboxApplicationConfiguration != null) {
				String checked = checkboxApplicationConfiguration.getDomAttribute("checked");
				if (checked != "checked") {
					selectedCheckboxAppNameConfigLabel.click();
				}
			}
		} catch (Exception e) {

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
	}
//		edgeVersionNameInput.sendKeys(value);

	public void applicationDeploymentGroupNameSearch(String value) {

		SetInputENterKey(applicationDeploymentGroupNameSearch, "");
		SetInput(applicationDeploymentGroupNameSearch, value, value);

//		applicationDeploymentGroupNameSearch.sendKeys(Keys.ENTER);
//		applicationDeploymentGroupNameSearch.sendKeys(value);
	}

	public void checkboxAllconfigurationEdgeDevice() {
		try {

			if (checkboxEdgeDeviceAll != null) {
				String checked = checkboxEdgeDeviceAll.getDomAttribute("checked");
				if (checked != "checked") {
					allselectionEdgeDeviceLabel.click();
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

	@FindBy(xpath = "(//table)[2]//tr[1]//td[1]//mat-checkbox//label[1]//span//input")
	WebElement checkboxAppNameSingleSelectInput;

	public void checkboxAppNameSingleSelectStepTwoName() {

		clickElement(checkboxAppNameSingleSelectLabel, "");
		if (checkboxAppNameSingleSelectInput != null) {
			String checked = checkboxAppNameSingleSelectInput.getDomAttribute("checked");
			if (checked != "checked") {
				checkboxAppNameSingleSelectLabel.click();
			}
		}

	}

	public void edgeAppNameInput(String value) {
		SetInputENterKey(edgeAppNameInput, "");
		SetInput(edgeAppNameInput, value, value);

//		edgeAppNameInput.sendKeys(Keys.ENTER);
//		edgeAppNameInput.sendKeys(value);
	}

	public void appnameApplicationDeployment() {
		clickElement(appnameApplicationDeployment, "");
		// appnameApplicationDeployment.click();
	}

	public String get_Text_ToolTipedgeGroupNameToolTipText() {
		mouseHover(edgeGrouplabel);

		String edgeGroupNameToolTipText = edgeGroupNameToolTip.getText();

		edgeGroupNameToolTipText.trim();

		return edgeGroupNameToolTipText;
	}

	public void checkboxEdgeGroupNameStepOneName() {

		//clickElement(selectedCheckboxEdgeGroupNameDeploymentLabel, "");
		if (selectedCheckboxEdgeGroupNameDeploymentInput != null) {
			String checked = selectedCheckboxEdgeGroupNameDeploymentInput.getDomAttribute("checked");
			if (checked != "checked") {
				clickElement(selectedCheckboxEdgeGroupNameDeploymentLabel, "");
				//selectedCheckboxEdgeGroupNameDeploymentLabel.click();
			}
		}
	}
}
