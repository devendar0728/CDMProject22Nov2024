package com.cdm.pages.Latest;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeDeviceAdd extends CommonActions {

	public EdgeDeviceAdd(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//mat-select[@formcontrolname='appgroupid']/../../div[3]/span/label")
	WebElement ApplicationGroupSelectAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement edgeNameTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement healthcardTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deploymentcardTooltip;

	@FindBy(xpath = "//input[@formcontrolname='lastheartbeattime']")
	WebElement healthcard;

	@FindBy(xpath = "//h4[@class='titleHeadingsub']")
	WebElement identitylabel;

	@FindBy(xpath = "//label[@id = 'mat-form-field-label-5']")
	WebElement edgeNameInputAddLabel;

	@FindBy(xpath = "//label[@id = 'mat-form-field-label-7']")
	WebElement organizationNameInputAddLabel;

	@FindBy(xpath = "//label[@id = 'mat-form-field-label-9']")
	WebElement edgeGroupNameInputAddLabel;

	@FindBy(xpath = "//label[@id = 'mat-form-field-label-15']")
	WebElement hardwareNameInputAddLabel;

	@FindBy(xpath = "//input[@formcontrolname='devicename']/../../../../../span[1]")
	WebElement validationMessageEdgeNameInvalid;

	@FindBy(xpath = "//input[@formcontrolname='devicename']/../../../../../span[1]")
	WebElement validationMessageEdgeIDwithout;

	@FindBy(xpath = "//input[@formcontrolname='appgroupid']/../../../../../span[1]")
	WebElement validationMessageAppGroupwithout;

	@FindBy(xpath = "//input[@formcontrolname='serverhostaddress']/../../../../../span[1]")
	WebElement validationMessageServerHostIDwithout;

	@FindBy(xpath = "//input[@formcontrolname='serverport']/../../../../../span[1]")
	WebElement validationMessageServerPortwithout;

//	@FindBy(xpath = "//input[@formcontrolname='displayname']")
//	WebElement edgeGroupNameAdd;

	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../div/../../span[1])")
	WebElement validationMessageGroupName;

	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../../span[1]/span)")
	WebElement validationMessageEdgeAdd;

	@FindBy(xpath = "//span[contains(text(),'Alphanumerics of length Min = 2, Max = 64 are allo')]")
	WebElement validationMessageoneEdgeAdd;

	@FindBy(xpath = "//input[@formcontrolname='location']")
	WebElement edgeDeviceAdd;

	@FindBy(xpath = "//*[@id=\"togBtn\"]")
	WebElement sliderOnCheckBox;

	@FindBy(xpath = "//*[@id=\"togBtn\"]/..")
	WebElement sliderOnCheckBoxLabel;

	@FindBy(name = "serialNo")
	WebElement serialNumberAdd;

	@FindBy(xpath = "//input[@formcontrolname='location']")
	WebElement locationAdd;

	@FindBy(xpath = "//input[@formcontrolname='description']")
	WebElement descriptionAdd;

	@FindBy(xpath = "//input[@data-placeholder='Onboarding Key']")
	WebElement onboardingKeyAdd;

	@FindBy(xpath = "//input[@data-placeholder='Image Version']")
	WebElement imageVersionAdd;

	@FindBy(xpath = "//input[@formcontrolname='appinstanceload']")
	WebElement serverportAdd;

	@FindBy(xpath = "//input[@formcontrolname='edgeuser']")
	WebElement edgeUserAdd;

	@FindBy(xpath = "//input[@formcontrolname='edgepassword']")
	WebElement edgePasswordAdd;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement editEdgeDevice;

	@FindBy(xpath = "//input[@formcontrolname='devicename']")
	WebElement edgeIDInputAdd;

	@FindBy(xpath = "//label[@id= 'mat-form-field-label-3']")
	WebElement edgeIDInputAddLabel;

	@FindBy(xpath = "(//input[@formcontrolname='devicename']/../../../../../span)[2]")
	WebElement validationMessageEdgeId;

	@FindBy(xpath = "//input[@formcontrolname='devicename']/../../../../../../div/div")
	WebElement validationMessageEdgeId1;

	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../../span)[1]")
	WebElement validationMessageEdgeName1;

	@FindBy(xpath = "//input[@formcontrolname='displayname']/../../../../../span")
	WebElement validationMessageEdgeName;

	@FindBy(css = ".tableCard h4")
	WebElement AddListpageVerification;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveAddDataBtn;

	@FindBy(css = ".calButton")
	WebElement cancelAddDataButton;

	@FindBy(xpath = "//input[@data-placeholder='EDGE ID']")
	WebElement identityedgeIdAdd;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement identityedgeNameAdd;
	@FindBy(css = ".cdk-overlay-container")
	WebElement outerlayerclick;

	@FindBy(xpath = "//mat-select[@formcontrolname='orgid']")
	WebElement organizationAdd;

	@FindBy(xpath = "//mat-select[@formcontrolname='controllerid']")
	WebElement edgeGroupNameAdd;

	@FindBy(xpath = "//mat-select[@formcontrolname='assignedto']")
	WebElement assignedToAdd;

	@FindBy(xpath = "//h4/span")
	WebElement headingTitleAdd;

	@FindBy(xpath = "//mat-select[@formcontrolname='format']")
	WebElement hardwareNameAdd;

	@FindBy(xpath = "//mat-select[@formcontrolname='appgroupid']")
	WebElement applicationGroupSelect;

	public void identityedgeIdInputAdd(String value) {
//		identityedgeIdAdd.sendKeys(Keys.ENTER);
//		identityedgeIdAdd.sendKeys(value);

		SetInputENterKey(identityedgeIdAdd, "");
		SetInput(identityedgeIdAdd, value, value);
		SetInput(identityedgeIdAdd, value, "Failed to find identityEdgeID element");
	}

	public String identityedgeIdInputGet() {
		return identityedgeIdAdd.getText();
	}

	public void identityedgeNameAdd(String value) {

		SetInputENterKey(identityedgeNameAdd, "");
		SetInput(identityedgeNameAdd, value, value);
		SetInput(identityedgeNameAdd, value, "Failed to find identityedgeNameAdd element");
	}

	public void onBoardingKeyInputAdd(String value) {

		SetInputENterKey(onboardingKeyAdd, "");
		SetInput(onboardingKeyAdd, value, value);
	}

	public void serialNumberInputAdd(String value) {

		SetInputENterKey(serialNumberAdd, "");
		SetInput(serialNumberAdd, value, value);
	}

	public void imageVersionInputAdd(String value) {

		SetInputENterKey(imageVersionAdd, "");
		SetInput(imageVersionAdd, value, value);
	}

	public void serverPortInputAdd(String value) {

		SetInputENterKey(serverportAdd, "");
		SetInput(serverportAdd, value, "Failed to find serverport element");

	}

	public void organizationAdd(String value) throws InterruptedException {

		SelectMatOption(organizationAdd, value);
	}

	public void assignedToAdd(String value) throws InterruptedException {

		SelectMatOption(assignedToAdd, value);
	}

	public void edgeGroupNameAdd(String value) throws InterruptedException {
		SelectMatOption(edgeGroupNameAdd, value);
	}

	public void applicationGroupSelect(String value) throws InterruptedException {
		SelectMatOption(applicationGroupSelect, value);
	}

	public void clearEnteredId() {
		identityedgeIdAdd.clear();
	}

	public void hardWareNameAdd(String value) throws InterruptedException {

		SelectMatOption(hardwareNameAdd, value);
	}

	public String verifyDeviceAddBreadcrumb() {
		String breadcrumb = AddListpageVerification.getText();
		return breadcrumb;

	}

	public void saveAddData() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".addButton\").click();", saveAddDataBtn);

	}

	public void edgeUserInputAdd(String value) {

		SetInput(edgeUserAdd, value, value);

	}

	public void edgeUserPasswordAdd(String value) {

		SetInput(edgePasswordAdd, value, value);

	}

	public void cancelData() {
		clickElement(cancelAddDataButton, "");

	}

	public void scrollingvertical() {

		scrollingvertical("div.pagefooter", "0", "500");
	}

	public void scrollingup() {

		scrollingup("div.pagefooter", "800", "0");
	}

	public String verifyValidationMessageEdgeId1() {
		clickElement(AddListpageVerification, "");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageEdgeId1 == null) {
			return "";
		}
		String message = validationMessageEdgeId1.getText();

		return message.trim();

	}

	public String verifyValidationMessageEdgeName1() {
		clickElement(AddListpageVerification, "");

		if (validationMessageEdgeName1 == null) {
			return "";
		}
		String message = validationMessageEdgeName1.getText();

		return message.trim();

	}

	public String verifyValidationMessageEdgeId() {
		clickElement(AddListpageVerification, "");

		if (validationMessageEdgeId == null) {
			return "";
		}
		String message = validationMessageEdgeId.getText();

		return message.trim();

	}

	public String verifyValidationMessageEdgeName() {
		clickElement(AddListpageVerification, "");

		if (validationMessageEdgeName == null) {
			return "";
		}
		String message = validationMessageEdgeName.getText();

		return message.trim();

	}

	public void editEdgeDeviceClick() {

		clickElement(editEdgeDevice, "Click on Edit icon of Edge Device");

	}

	// Either checked or unchecked
	public void moveSliderCondition(String m) {
		moveSliderCondition(sliderOnCheckBox, sliderOnCheckBoxLabel, m);
	}

	public void locationAdd(String value) {

		SetInputENterKey(locationAdd, "");
		SetInput(locationAdd, value, value);
	}

	public void descriptionAdd(String value) {

		SetInputENterKey(descriptionAdd, "");
		SetInput(descriptionAdd, value, value);
	}

	public void headingTitleAdd() throws InterruptedException {
		clickElement(headingTitleAdd, "");
		Thread.sleep(2000);
	}

	public void location(String value) {

		SetInput(locationAdd, value, value);
	}

	public String verifyValidationMessageEdgeNameAdd() {
		AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageEdgeAdd == null) {
			return "";
		}
		String message = validationMessageEdgeAdd.getText();

		return message.trim();

	}

	public String verifyValidationMessageoneEdgeNameAdd() {
		AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageoneEdgeAdd == null) {
			return "";
		}
		String message = validationMessageoneEdgeAdd.getText();

		return message.trim();

	}

	public String validationMessageGroupNamewithout() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageGroupName == null) {
			return "";
		}
		String message = validationMessageGroupName.getText();

		return message.trim();

	}

	public String validationMessageinvalidEdgeName() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageEdgeNameInvalid == null) {
			return "";
		}
		String message = validationMessageEdgeNameInvalid.getText();

		return message.trim();

	}

	public void identityedgeNameAddDisplayed() {

		boolean isVisible = identityedgeNameAdd.isDisplayed();

		// Assertion for visibility
		Assert.assertTrue(isVisible);

	}

	public String get_Text_EdgeNameToolTip() throws InterruptedException {

		mouseHover(identityedgeNameAdd);

		Thread.sleep(3000);

		if (edgeNameTooltip != null) {
			String edgeNameTooltipText = edgeNameTooltip.getText();

			System.out.println("toolTipText-->" + edgeNameTooltipText);

			return edgeNameTooltipText;
		}
		return "";
	}

	public String get_Text_HealthcardToolTip() throws InterruptedException {

		mouseHover(healthcard);

		Thread.sleep(3000);

		if (healthcardTooltip != null) {
			String healthcardTooltipText = healthcardTooltip.getText();

			System.out.println("toolTipText-->" + healthcardTooltipText);

			return healthcardTooltipText;
		}
		return "";
	}

	public String get_Text_deploymentCardToolTip() throws InterruptedException {

		mouseHover(serverportAdd);

		Thread.sleep(3000);

		if (deploymentcardTooltip != null) {
			String deploymentcardTooltipText = deploymentcardTooltip.getText();

			System.out.println("toolTipText-->" + deploymentcardTooltipText);

			return deploymentcardTooltipText;
		}
		return "";
	}

	public String getlabelidentity() {

		clickElement(identityedgeIdAdd, "");

		System.out.println(getText(identitylabel));
		return getText(identitylabel);

	}

	public String getTextEdgeIdLabel() {

		clickElement(edgeIDInputAdd, "");
		return getText(edgeIDInputAddLabel);
	}

	public String getTextEdgeNameLabel() {
		clickElement(identityedgeNameAdd, "");
		return getText(edgeNameInputAddLabel);
	}

	public String getTextOrganizationNameLabel() {
		clickElement(organizationAdd, "");
		return getText(organizationNameInputAddLabel);
	}

	public String getTextEdgeGroupNameLabel() {
		clickElement(edgeGroupNameAdd, "");

		return getText(edgeGroupNameInputAddLabel);
	}

	public String getTextHardwareLabel() {
		clickElement(hardwareNameAdd, "");
		return getText(hardwareNameInputAddLabel);
	}

	public void outerlayerclick() {
		clickElement(outerlayerclick, "");

	}

	public String getTextAppGroupDropdownLabel() {
		clickElement(applicationGroupSelect, "");
		return getText(ApplicationGroupSelectAddLabel);
	}
}
