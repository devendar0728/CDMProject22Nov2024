package com.cdm.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
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

public class Edgegroupconfiguration extends CommonActions {

	public Edgegroupconfiguration(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/mat-checkbox[1]/label[1]/span[1]")
	WebElement Restartcheckbox;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/mat-checkbox[2]/label[1]/span[1]")
	WebElement Purgecheckbox;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/mat-checkbox[3]/label[1]/span[1]")
	WebElement Activatecheckbox;

	@FindBy(css = ".cdk-overlay-container")
	WebElement RestartTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement PurgeTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement ActivateTooltip;

	@FindBy(xpath = "//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement appNameSearchDot;

	@FindBy(xpath = "//input[@formcontrolname='displayname']/../../../../../span[1]/span[1]")
	WebElement selectAppName;

	@FindBy(xpath = "//input[@formcontrolname='displayname']/../../../../../span[1]/span[1]")
	WebElement validationMessageEdgeEdit;

	@FindBy(xpath = "//a[contains(text(),'Configuration')]")
	WebElement configsubmodule;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement identityedgeNameEdit;

	@FindBy(xpath = "//input[@name='assignedto']")
	WebElement assignedtoUpdate;

	@FindBy(xpath = "//input[@formcontrolname='location']")
	WebElement locationUpdate;

	@FindBy(xpath = "//input[@formcontrolname='description']")
	WebElement descriptionUpdate;

	@FindBy(name = "serialNo")
	WebElement serialNumberUpdate;

	@FindBy(xpath = "//input[@formcontrolname='onboardingkey']")
	WebElement onboardingKeyUpdate;

	@FindBy(xpath = "//input[@data-placeholder='Image Version']")
	WebElement imageVersionUpdate;

	@FindBy(xpath = "//input[@formcontrolname='appinstanceload']")
	WebElement serverportUpdate;

	@FindBy(xpath = "//input[@formcontrolname='edgeuser']")
	WebElement edgeUserUpdate;

	@FindBy(xpath = "//input[@formcontrolname='edgepassword']")
	WebElement edgePasswordUpdate;
	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement editEdgeDevice;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement edgeNameInputUpdate;

	@FindBy(xpath = "//input[@name= 'appgroupname']")
	WebElement edgeAppgroupsInputUpdate;

	@FindBy(css = "mat-select[formcontrolname=controllerid] span")
	WebElement edgeGroupNameUpdate;

	@FindBy(xpath = "//mat-select[@formcontrolname='format']")
	WebElement hardWareNameInputUpdate;

	@FindBy(xpath = "//input[@name= 'assignedto']")
	WebElement edgeAssignedToUpdate;

	@FindBy(xpath = "//input[@name= 'description']")
	WebElement edgeDescriptionUpdate;

	@FindBy(xpath = "(//input[@formcontrolname='devicename']/../../../../../span)[2]")
	WebElement validationMessageEdgeId;

	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../../span)[1]")
	WebElement validationMessageEdgeName;

	@FindBy(css = ".tableCard h4")
	WebElement EditListpageVerification;

	@FindBy(css = ".addButton")
	WebElement saveAddDataBtn;

	@FindBy(css = ".calButton")
	WebElement cancelAddDataButton;

	@FindBy(xpath = "//input[@data-placeholder='EDGE ID']")
	WebElement identityedgeIdUpdate;

	@FindBy(xpath = "//input[@data-placeholder='EDGE Name']")
	WebElement identityedgeNameUpdate;

	@FindBy(xpath = "//input[@data-placeholder='EDGE Name']")
	WebElement editidentityedgeNameUpdate;

	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organizationUpdate;

	@FindBy(name = "assignedto")
	WebElement assignedToUpdate;

	@FindBy(xpath = "//mat-select[@formcontrolname='appgroupid']")
	WebElement applicationGroupSelectUpdate;

	public void identityedgeIdInputUpdate(String value) {
		SetInputENterKey(identityedgeIdUpdate, "");
		SetInput(identityedgeIdUpdate, value, value);
//		
//		identityedgeIdUpdate.sendKeys(Keys.ENTER);
//		identityedgeIdUpdate.sendKeys(value);
	}

	public void edgeAssignedToUpdate(String value) throws InterruptedException {

		SetInputENterKey(edgeAssignedToUpdate, "");
		SetInput(edgeAssignedToUpdate, value, value);

//		edgeAssignedToUpdate.sendKeys(value);
//		
//		edgeAssignedToUpdate.click();

	}

	public void edgeGroupName(String value) throws InterruptedException {
		SelectMatOption(edgeGroupNameUpdate, value);
	}

	public void assignedTo(String value) {
//		assignedToUpdate.sendKeys(Keys.ENTER);
//		assignedToUpdate.sendKeys(value);

		SetInputENterKey(assignedToUpdate, "");
		SetInput(assignedToUpdate, value, value);
	}

	public void applicationGroupSelectUpdate(String value) throws InterruptedException {
		SelectMatOption(applicationGroupSelectUpdate, value);
	}

	public void clearEnteredName() {

		identityedgeNameUpdate.clear();
	}

	public void hardWareName(String value) throws InterruptedException {

		SelectMatOption(hardWareNameInputUpdate, value);
	}

	public String verifyDeviceAddBreadcrumb() {
		String breadcrumb = EditListpageVerification.getText();
		return breadcrumb;

	}

	public void saveAddData() {
		clickElement(saveAddDataBtn, "");
		// saveAddDataBtn.click();
	}

	public void cancelData() {

		clickElement(cancelAddDataButton, "");
		// cancelAddDataButton.click();
	}

	public void scrollingvertical() {

		scrollingvertical("div.pagefooter", "0", "500");
	}

	public String verifyValidationMessageEdgeId() {
		clickElement(EditListpageVerification, "");
		// EditListpageVerification.click();

		if (validationMessageEdgeId == null) {
			return "";
		}
		String message = validationMessageEdgeId.getText();

		return message.trim();

	}

	public String verifyValidationMessageEdgeName() {
		clickElement(EditListpageVerification, "");
		// EditListpageVerification.click();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//
//		}

		if (validationMessageEdgeName == null) {
			return "";
		}
		String message = validationMessageEdgeName.getText();

		return message.trim();

	}

	public void editEdgeDeviceClick() {
		clickElement(editEdgeDevice, "");
		// editEdgeDevice.click();
	}

	public void setEditClearField() {

		editidentityedgeNameUpdate.clear();
	}

	public void identityedgeNameUpdate(String value) {
		// edgeNameInputUpdate.sendKeys(value);
		SetInput(edgeNameInputUpdate, value, value);
	}

	public void organizationUpdate(String value) throws InterruptedException {

		SelectMatOption(organizationUpdate, value);
	}

	public void hardwareNameUpdate(String value) throws InterruptedException {

		SelectMatOption(hardWareNameInputUpdate, value);
	}

	public void performAutosuggestion(String partialText, String value) {

		assignedtoUpdate.sendKeys(value);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		// Wait for autosuggestion dropdown to appear
		By autosuggestDropdown = By.xpath("//div[@role='listbox']/mat-option");
		wait.until(ExpectedConditions.visibilityOfElementLocated(autosuggestDropdown));

		// Select the desired suggestion
		selectAutosuggestion(partialText, value);
	}

	public void selectAutosuggestion(String partialText, String value) {
		// Locate the autosuggestion dropdown
		By autosuggestDropdown = By.xpath("//div[@role='listbox']/mat-option");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(autosuggestDropdown));

		// Locate all suggestion elements
		List<WebElement> suggestions = dropdown
				.findElements(By.xpath("//mat-option/span[contains(text(),'" + value + "')]"));

		// Iterate through suggestions and click on the one that matches the partial
		// text
		for (WebElement suggestion : suggestions) {
			if (suggestion.getText().contains(partialText)) {
				clickElement(suggestion, "");

				break;
			}
		}
	}

	public void edgeGroupNameUpdate(String value) throws InterruptedException {
		SelectMatOption(edgeGroupNameUpdate, value);
	}

	public void identityedgeName(String value) {
		SetInputENterKey(identityedgeNameUpdate, "");
		SetInput(identityedgeNameUpdate, value, value);

		// identityedgeNameUpdate.sendKeys(value);
	}

	public void onBoardingKeyInput(String value) {
		SetInputENterKey(onboardingKeyUpdate, "");
		SetInput(onboardingKeyUpdate, value, value);

//		onboardingKeyUpdate.sendKeys(Keys.ENTER);
//		onboardingKeyUpdate.sendKeys(value);
	}

	public void serialNumberInput(String value) {
		SetInputENterKey(serialNumberUpdate, "");
		SetInput(serialNumberUpdate, value, value);
//		serialNumberUpdate.sendKeys(Keys.ENTER);
//		serialNumberUpdate.sendKeys(value);
	}

	public void imageVersionInput(String value) {

		SetInputENterKey(imageVersionUpdate, "");
		SetInput(imageVersionUpdate, value, value);

//		imageVersionUpdate.sendKeys(Keys.ENTER);
//		imageVersionUpdate.sendKeys(value);
	}

	public void ongoingBoardUpdate(String value) {
		SetInputENterKey(onboardingKeyUpdate, "");
		SetInput(onboardingKeyUpdate, value, value);

//		onboardingKeyUpdate.sendKeys(Keys.ENTER);
//		onboardingKeyUpdate.sendKeys(value);
	}

	public void serialNumberUpdate(String value) {
		SetInputENterKey(serialNumberUpdate, "");
		SetInput(serialNumberUpdate, value, value);

//		serialNumberUpdate.sendKeys(Keys.ENTER);
//		serialNumberUpdate.sendKeys(value);
	}

	public void imageVersionUpdate(String value) {

		SetInputENterKey(imageVersionUpdate, "");
		SetInput(imageVersionUpdate, value, value);

//		imageVersionUpdate.sendKeys(Keys.ENTER);
//		imageVersionUpdate.sendKeys(value);
	}

	public void serverPortUpdate(String value) {

		SetInputENterKey(serverportUpdate, "");
		SetInput(serverportUpdate, value, value);

//		serverportUpdate.sendKeys(Keys.ENTER);
//		serverportUpdate.sendKeys(value);
	}

	public void edgeUserNameUpdate(String value) {
		SetInputENterKey(edgeUserUpdate, "");
		SetInput(edgeUserUpdate, value, value);

//		edgeUserUpdate.sendKeys(Keys.ENTER);
//		edgeUserUpdate.sendKeys(value);

	}

	public void edgePasswordUpdate(String value) {

		SetInputENterKey(edgePasswordUpdate, "");
		SetInput(edgePasswordUpdate, value, value);

//		
//		edgePasswordUpdate.sendKeys(Keys.ENTER);
//		edgePasswordUpdate.sendKeys(value);
	}

	public void applicationGroupUpdate(String value) throws InterruptedException {
		SelectMatOption(applicationGroupSelectUpdate, value);
	}

	public void serverPortInput(String value) {
		SetInputENterKey(serverportUpdate, "");
		SetInput(serverportUpdate, value, value);

		// serverportUpdate.sendKeys(value);
	}

	public String removalofEnteredTextForEdgeName() {

		return removalofEneredText(edgeNameInputUpdate);

	}

	public String removalofEnteredTextForhardware() {

		return removalofEneredText(hardWareNameInputUpdate);

	}

	public String removalofEnteredTextForGroupName() {

		return removalofEneredText(edgeAppgroupsInputUpdate);

	}

	public String removalofEneredTextForOnboardingKey() {

		return removalofEneredText(onboardingKeyUpdate);

	}

	public String removalofEnteredTextForAssignedTo() {

		return removalofEneredText(assignedtoUpdate);

	}

	public String removalofEneredTextForLocation() {

		return removalofEneredText(locationUpdate);

	}

	public String removalofEnteredTextForOnboardingKey() {
		return removalofEneredText(onboardingKeyUpdate);
	}

	public String removalofEnteredTextForSerialNo() {
		return removalofEneredText(serialNumberUpdate);
	}

	public String removalofEnteredTextForAssignedToImageVersion() {
		return removalofEneredText(imageVersionUpdate);
	}

	public String removalofEnteredTextForServerport() {
		return removalofEneredText(serverportUpdate);
	}

	public String removalofEneredTextForDescription() {

		return removalofEneredText(descriptionUpdate);

	}

	public void updatesaveAddDataBtn() {
		clickElement(saveAddDataBtn, "");
		// saveAddDataBtn.click();
	}

	public void assignedtoUpdate(String value) {
		SetInputENterKey(assignedtoUpdate, "");
		SetInput(assignedtoUpdate, value, value);

//		assignedtoUpdate.sendKeys(Keys.ENTER);
//		assignedtoUpdate.sendKeys(value);
	}

	public void locationUpdate(String value) {

		SetInputENterKey(locationUpdate, "");
		SetInput(locationUpdate, value, value);

//		
//		locationUpdate.sendKeys(Keys.ENTER);
//		locationUpdate.sendKeys(value);
	}

	public void descriptionUpdate(String value) {
		SetInputENterKey(descriptionUpdate, "");
		SetInput(descriptionUpdate, value, value);

//		descriptionUpdate.sendKeys(Keys.ENTER);
//		descriptionUpdate.sendKeys(value);
	}

	public String verifyValidationMessageEdgeNameEdit() {
		EditListpageVerification.click();

		clickElement(EditListpageVerification, "");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageEdgeEdit == null) {
			return "";
		}
		String message = validationMessageEdgeEdit.getText();

		return message.trim();

	}

	public void identityedgeNameEdit(String value) throws InterruptedException {

		SetInputENterKey(identityedgeNameEdit, "");
		SetInput(identityedgeNameEdit, value, value);

//		
//		identityedgeNameEdit.sendKeys(Keys.ENTER);
//		identityedgeNameEdit.sendKeys(value);
	}

	public void configsubmodule() {
		clickElement(configsubmodule, "");
		// configsubmodule.click();
	}

	public void headingeditclick() {
		clickElement(EditListpageVerification, "");
		// EditListpageVerification.click();
	}

	@FindBy(xpath = "")
	WebElement selectAppNameCheckbox;

	public void selectCheckboxesForApplications(String value) {

		WebElement checkbox = driver.findElement(By.xpath("//td[contains(text(),'" + value + "')]/../td[1]//label"));

		if (!checkbox.isSelected()) {
			checkbox.click();
		}
	}

	//
	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void verifyCheckboxesSelected(String appName) {

		WebElement checkbox = driver.findElement(By.xpath("//td[contains(text(),'" + appName + "')]/../td[1]//input"));

		Assert.assertTrue("Checkbox for app " + appName + " is not selected.", checkbox.isSelected());
	}

	public void appNameSearchDot() {

		clickElement(appNameSearchDot, "");

	}

	@FindBy(xpath = "//input[@name='appname']")
	WebElement appNamesendKeys;

	public void sendvalueAppName(String value) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", appNamesendKeys);
		SetInputENterKey(appNamesendKeys, "");

		SetInput(appNamesendKeys, value, value);

	}

	public String get_tooltipRestart() {
		mouseHover(Restartcheckbox);

		if (RestartTooltip != null) {
			String RestartTooltipText = RestartTooltip.getText();

			System.out.println("toolTipText-->" + RestartTooltipText);

			return RestartTooltipText;
		}
		return "";
	}

	public String get_tooltipPurge() {
		mouseHover(Purgecheckbox);

		if (PurgeTooltip != null) {
			String PurgeTooltipText = PurgeTooltip.getText();

			System.out.println("toolTipText-->" + PurgeTooltipText);

			return PurgeTooltipText;
		}
		return "";
	}

	public String get_tooltipActivate() {
		mouseHover(Activatecheckbox);

		if (ActivateTooltip != null) {
			String ActivateTooltipText = ActivateTooltip.getText();

			System.out.println("toolTipText-->" + ActivateTooltipText);

			return ActivateTooltipText;
		}
		return "";
	}

	@FindBy(xpath = "(//button//span[contains(text(),'Next')])[4]/..")
	WebElement nextFourButton;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-edgegroup-config/div/div/mat-horizontal-stepper/div[2]/div[4]/form/div[2]/button[1]")
	WebElement PreviousFourButton;

	@FindBy(xpath = "//mat-horizontal-stepper[1]/div[2]/div[5]/div[2]/button[2]")
	WebElement deployButtonOnStepFive;

	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	WebElement confirmButtonOnStepFive;

	public void nextButtonFour() {

		clickElement(nextFourButton, "Clicking on next button");

	}

	@FindBy(xpath = "//div[contains(text(),'Deployment')]")
	WebElement stepperFiveDisplay;

	@FindBy(xpath = "//div[contains(text(),'EDGE Group')]")
	WebElement stepperOne;

	@FindBy(xpath = "//div[contains(text(),'App Groups')]")
	WebElement stepperTwo;

	@FindBy(xpath = "//div[contains(text(),'EDGE')]")
	WebElement stepperThree;

	@FindBy(xpath = "//div[contains(text(),'App Name')]")
	WebElement stepperFour;

	public String stepperOne() {
		String text = stepperOne.getText();

		return text;

	}

	public String stepperTwo() {
		String text = stepperTwo.getText();

		return text;
	}

	public String stepperThree() {
		String text = stepperThree.getText();

		return text;
	}

	public WebElement stepperfiveHeader() {
		stepperFiveDisplay.getText();
		return stepperFiveDisplay;
	}

	public boolean deployButtonOnStepperFive() {
		return deployButtonOnStepFive.isEnabled();

	}

	public void confirmButtonStepFive() {

		clickElement(confirmButtonOnStepFive, "Clicking on confirm button");
	}

	public void deployButtonOnStepperFiveclick() {

		clickElement(deployButtonOnStepFive, "Clicking on Deploy button");
	}

	public String stepperFour() {
		return stepperFour.getCssValue("font-weight");
	}

	@FindBy(xpath = "//mat-icon[contains(text(),'launch']")
	WebElement jsonButtonClick;

	public void expandJsonButton() {
		clickElement(jsonButtonClick, "Clicking on json button");
	}

	@FindBy(xpath = "//ngx-json-viewer")
	WebElement jsonContainer;

	public String verifyjsoncontainer() {

		String displayStyle = jsonContainer.getCssValue("display");
		return displayStyle;
	}

	@FindBy(xpath = "//mat-icon[contains(text(),'input']")
	WebElement jsonCollapseClick;

	public void collapseJsonButton() {

		clickElement(jsonCollapseClick, "Clicking in Collapse button");

	}

	public String verifyjsoncontainerCollapse() {
		//String displayStyle = jsonContainer.getCssValue("display");
		String heightStyle = jsonContainer.getCssValue("height");
		return heightStyle;
	}

	public void previousButtonStepFour() {
		clickElement(PreviousFourButton, "Clicking on previosu button on Step 4");

	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement edgeColumnTooltip;

	@FindBy(xpath = "//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/span[1]/div[1]/div[1]")
	WebElement edgeColumnStepper;

	@FindBy(css = ".cdk-overlay-container")
	WebElement actionsColumnTooltip;

	@FindBy(xpath = "//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/span[1]/div[1]/div[1]")
	WebElement actionsColumnStepper;

	@FindBy(css = ".cdk-overlay-container")
	WebElement statusColumnTooltip;

	@FindBy(xpath = "//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]/div[1]/span[1]/div[1]/div[1]")
	WebElement statusColumnStepper;

	public String get_Text_EdgeColumn() {
		mouseHover(edgeColumnStepper);

		if (edgeColumnTooltip != null) {
			String EdgeColumnTooltipText = edgeColumnTooltip.getText();

			System.out.println("toolTipText-->" + EdgeColumnTooltipText);

			return EdgeColumnTooltipText;
		}
		return "";

	}

	public String get_Text_ActionsColumn() throws InterruptedException {
		Thread.sleep(3000);
		mouseHover(actionsColumnStepper);

		if (actionsColumnTooltip != null) {
			String ActionsColumnTooltipText = actionsColumnTooltip.getText();

			System.out.println("toolTipText-->" + ActionsColumnTooltipText);

			return ActionsColumnTooltipText;
		}
		return "";
	}

	public String get_Text_EdgeStatusColumn() {
		mouseHover(statusColumnStepper);

		if (statusColumnTooltip != null) {
			String statusColumnTooltipText = statusColumnTooltip.getText();

			System.out.println("toolTipText-->" + statusColumnTooltipText);

			return statusColumnTooltipText;
		}
		return "";
	}

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/div[2]/button[1]/span[1]")
	WebElement PreviousThreeButton;

	public void previousButtonStepThree() {
		clickElement(PreviousThreeButton, "Clicking pn previous button");

	}

	public Object get_Text_appGroupNameColumn() {
		mouseHover(appGroupNameColumnStepper);

		if (appGroupColumnTooltip != null) {
			String appGroupColumnTooltipText = appGroupColumnTooltip.getText();

			System.out.println("toolTipText-->" + appGroupColumnTooltipText);

			return appGroupColumnTooltipText;
		}
		return "";
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement appGroupNameStatusColumnTooltip;

	@FindBy(xpath = "//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]/div[1]/span[1]/div[1]/div[1]")
	WebElement appGroupNameStatusColumnStepper;

	@FindBy(css = ".cdk-overlay-container")
	WebElement appGroupColumnTooltip;

	@FindBy(xpath = "//div[contains(text(),'App Group Name')]")
	WebElement appGroupNameColumnStepper;

	public String get_Text_StatusColumnForAppGroups() {
		mouseHover(appGroupNameStatusColumnStepper);

		if (appGroupNameStatusColumnTooltip != null) {
			String appGroupNameStatusColumnTooltipText = appGroupNameStatusColumnTooltip.getText();

			System.out.println("toolTipText-->" + appGroupNameStatusColumnTooltipText);

			return appGroupNameStatusColumnTooltipText;
		}
		return "";
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement outerlayerclick;

	public void outerlayerclick() {
		clickElement(outerlayerclick, "");

	}

	public void mouseoverNextButton() {
		mouseHover(nextFourButton);

	}

	@FindBy(xpath = "//span[contains(text(),'No Data Found')]")
	WebElement noResultMessageValidation;

	public String noResultMessage() {

		return noResultMessageValidation.getText();

	}
public List<String> getRowData() {
		
		List<String> rowData = new ArrayList<>();
		for (WebElement row : gridRows) {
			rowData.add(row.getText());
		}
		return rowData;
	}
	@FindBy(xpath = "//tbody/tr")
	List<WebElement> gridRows;
	public int getRowCount() {

		return gridRows.size();
	}

	@FindBy(xpath="//app-edgegroup-config/div/div/mat-horizontal-stepper/div[2]/div[3]/form/div[1]/div/div/div/table/thead/tr/th[2]/div/app-filter/div/a/mat-icon")
	WebElement EdgeIDDot;
	public void EdgeIDDot() {
		clickElement(EdgeIDDot, "Clicking on Edge ID Dot");
		
	}

	@FindBy(xpath="//input[@name='devicename']")
	WebElement edgeNameSendKeys;
	public void sendvalueEdgeName(String value) {
		SetInputENterKey(edgeNameSendKeys, "");
		SetInput(edgeNameSendKeys, value, value);
	}

	@FindBy(xpath="//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement appGroupNameThreeDot;
	
	public void appGroupNameDot() {
		
		clickElement(appGroupNameThreeDot, "Clicking on three dots of GroupName");
		
	}

	@FindBy(xpath="//input[@name='appgroupname']")
	WebElement appGroupNameSendKeys;
	public void sendvalueAppGroupName(String value) {
		SetInputENterKey(appGroupNameSendKeys, "");
		SetInput(appGroupNameSendKeys, value, value);
		
	}
	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/div[2]/button[1]/span[1]")
	WebElement PreviousTwoButton;
	public void previousButtonStepTwo() {
		clickElement(PreviousTwoButton, "Clicking on Previous button");
		
	}

	@FindBy(xpath="//input[@name='displayname']")
	WebElement edgeGroupNameSendKeys;
	
	@FindBy(xpath="//body[1]/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-edgegroup-config[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeGroupNameThreeDot;
	
	public void edgeGroupNameDot() {
		clickElement(edgeGroupNameThreeDot, "Clicking on three dots of EdgeGroupName");
	}
	
	public void sendvalueEdgeGroupName(String value) {
		SetInputENterKey(edgeGroupNameSendKeys, "");
		SetInput(edgeGroupNameSendKeys, value, value);
		
	}
}
