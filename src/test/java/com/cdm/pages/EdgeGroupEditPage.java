package com.cdm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeGroupEditPage extends CommonActions {
	public EdgeGroupEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//app-console-terminal/div[1]/div[2]/i")
	WebElement closeIcon;

	@FindBy(xpath = "//mat-dialog-container[@id='mat-dialog-3']")
	WebElement iconwindow;

	@FindBy(css = ".cdk-overlay-container")
	WebElement groupIDToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement groupNamefieldToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement locationToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement descriptionsToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement appGroupToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverportToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverNodeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverHostAddressToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement groupNameToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement editToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement statusToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement consoleToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deleteToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement stopToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deviceConnectedToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deviceActiveToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement maxServerNodeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverPortToolTip;

	@FindBy(xpath = "//button[@class='addButton')]")
	WebElement saveButtononEdgeEditPage;

	@FindBy(xpath = "//input[@formcontrolname='serverhostaddress']")
	WebElement serverHostAddressInput;

	@FindBy(xpath = "//input[@formcontrolname='serialkeys']")
	WebElement serialNumberAdd;
	// serverport

	@FindBy(xpath = "//input[@formcontrolname='maxservernode']")
	WebElement maxserverNode;

	@FindBy(xpath = "//input[@formcontrolname='serverport']")
	WebElement serverPortInput;

	@FindBy(xpath = "//mat-select[@formcontrolname='appgroupid']")
	WebElement applicationGroupName;

	@FindBy(xpath = "//html/body/div[3]/div[2]/div/mat-dialog-container/app-edgeconfigupload/div[3]/button[2]")
	WebElement saveButtonfinalonboarding;

	@FindBy(xpath = "//input[@type='file']")
	WebElement onboardingCertificateUpload;

	@FindBy(xpath = "//input[@type='file']")
	WebElement EdgeConfigurationUpload;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/img[1]")
	WebElement onboardingCertificateIcon;

	public void onboardingCertificateIcon() {
		clickElement(onboardingCertificateIcon, "");
		// onboardingCertificateIcon.click();
	}

	public void onboardingCertificateUpload(String value) {
		//SetInputENterKey(onboardingCertificateUpload, "");
		//SetInput(onboardingCertificateUpload, value, value);
		onboardingCertificateUpload.sendKeys(value);
		// onboardingCertificateUpload.sendKeys(Keys.ENTER);
		// onboardingCertificateUpload.sendKeys(value);
	}

	public void EdgeConfigurationUpload(String value) {
		//SetInputENterKey(EdgeConfigurationUpload, "");
		SetInput(EdgeConfigurationUpload, value, value);

//	EdgeConfigurationUpload.sendKeys(Keys.ENTER);
//	EdgeConfigurationUpload.sendKeys(value);
	}

	public void uploadfile() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", onboardingCertificateUpload);

	}

	public void scrollingverticalAdd() {

		scrollingvertical("div.pagefooter", "0", "500");
	}

	public void applicationGroupName(String value) throws InterruptedException {
		wait(applicationGroupName, logger);
		SelectMatOption(applicationGroupName, value);

	}

	public void serverHostAddress(String value) {

		SetInputENterKey(serverHostAddressInput, "");
		SetInput(serverHostAddressInput, value, value);

		// serverHostAddressInput.sendKeys(value);
	}

	public void serverPort(String value) {
		SetInputENterKey(serverPortInput, "");
		SetInput(serverPortInput, value, value);

		// serverPortInput.sendKeys(value);
	}

	public void saveButtononEdgeEdit() {
		clickElement(saveButtononEdgeEditPage, "");
		// saveButtononEdgeEditPage.click();
	}

	public void saveButtonfinalonboarding() throws InterruptedException {

		// wait(saveButtonfinalonboarding,logger);

		clickElement(saveButtonfinalonboarding, "");

		// saveButtonfinalonboarding.click();

	}

	public void serialnumberAdd(String value) {
		SetInputENterKey(serialNumberAdd, "");
		SetInput(serialNumberAdd, value, value);

//
//		serialNumberAdd.sendKeys(Keys.ENTER);
//		serialNumberAdd.sendKeys(value);

	}

	public String get_Text_ToolTipappGroup() {
		mouseHover(applicationGroupName);

		String appGroupToolTipText = appGroupToolTip.getText();

		appGroupToolTipText.trim();

		return appGroupToolTipText;
	}

	public String get_Text_ToolTipmaxServerNode() {
		mouseHover(maxserverNode);

		String maxServerNodeToolTipText = maxServerNodeToolTip.getText();

		maxServerNodeToolTipText.trim();

		return maxServerNodeToolTipText;
	}

	public String get_Text_ToolTipmaxServerPort() {
		mouseHover(serverPortInput);

		String serverPortToolTipText = serverPortToolTip.getText();

		serverPortToolTipText.trim();

		return serverPortToolTipText;
	}

	public String get_Text_ToolTipmaxServerHostAddress() {
		mouseHover(serverHostAddressInput);

		String serverHostAddressToolTipText = serverHostAddressToolTip.getText();

		serverHostAddressToolTipText.trim();

		return serverHostAddressToolTipText;
	}
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement healthTooltip;
	
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement healthEditElement;

	public String get_Text_ToolTipedgeHealthEdit() {
		mouseHover(healthEditElement);

		String healthToolTipText = healthTooltip.getText();

		healthToolTipText.trim();

		return healthToolTipText;
	}

	public String get_Text_ToolTipserverHostAddressEdit() throws InterruptedException {
		Thread.sleep(2000);
		mouseHover(serverHostAddressInput);

		String serverHostAddressTipText = serverHostAddressToolTip.getText();

		serverHostAddressTipText.trim();

		return serverHostAddressTipText;
	}

	public String get_Text_ToolTipserverPortEdit() {
		mouseHover(serverPortInput);

		String serverportToolTipText = serverportToolTip.getText();

		serverportToolTipText.trim();

		return serverportToolTipText;
	}

	public String get_Text_ToolTipAppGroupEdit() {
		mouseHover(applicationGroupName);

		String appGroupToolTipText = appGroupToolTip.getText();

		appGroupToolTipText.trim();

		return appGroupToolTipText;
	}
	

	@FindBy(css = ".cdk-overlay-container")
	WebElement maximumServerNodesToolTip;
	

	@FindBy(css = ".cdk-overlay-container")
	WebElement maximumServerNodesTooltip;
	
	@FindBy(xpath = "//input[@formcontrolname='maxservernode']")
	WebElement maximumServerNodesElement;
	
	public String get_Text_ToolTipMaximumServerNodesEdit() {
		mouseHover(maximumServerNodesElement);

		String maximumServerNodesTooltipText = maximumServerNodesTooltip.getText();

		maximumServerNodesTooltipText.trim();

		return maximumServerNodesTooltipText;
	}

	@FindBy(xpath = "//input[@formcontrolname='location']")
	WebElement locationElement;
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement locationTooltip;

	
	public String get_Text_tooltipLocationEdit() throws InterruptedException {
		Thread.sleep(3000);
		mouseHover(locationElement);

		String maximumServerNodesTooltipText = locationTooltip.getText();

		maximumServerNodesTooltipText.trim();

		return maximumServerNodesTooltipText;
		
	}
	
	
	@FindBy(xpath = "//input[@name= 'description']")
	WebElement descriptionElement;
	
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement descriptionTooltip;
	
	public String get_Text_ToolTipedgeDescriptionEdit() throws InterruptedException {
		Thread.sleep(4000);
		mouseHover(descriptionElement);

		String descriptionTooltipText = descriptionTooltip.getText();

		descriptionTooltipText.trim();

		return descriptionTooltipText;
		
	}

	@FindBy(xpath = "//input[@formcontrolname='serverport']")
	WebElement serverport;

	@FindBy(xpath = "//input[@formcontrolname='maxservernode']")
	WebElement maxServernode;

	@FindBy(xpath = "//input[@formcontrolname='serverhostaddress']")
	WebElement serverHostAddress;

	@FindBy(xpath = "//input[@formcontrolname='location']")
	WebElement locationAdd;

	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	WebElement descriptionAdd;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement edgeGroupNameEdit;

	public String get_Text_ToolTipedgeGroupNameEdit() throws InterruptedException {
		Thread.sleep(3000);
		mouseHover(edgeGroupNameEdit);

		String groupNameToolTipText = groupNameToolTip.getText();

		groupNameToolTipText.trim();

		return groupNameToolTipText;
	}
	
	@FindBy(xpath = "//input[@formcontrolname='controllername']")
	WebElement edgeGroupIdEdit;
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement edgeGroupIdTooltip;
	
	public String get_Text_ToolTipedgeGroupId() throws InterruptedException {
		Thread.sleep(2000);
		mouseHover(edgeGroupIdEdit);

		String groupNameToolTipText = edgeGroupIdTooltip.getText();

		groupNameToolTipText.trim();

		return groupNameToolTipText;
	}

	@FindBy(xpath = "//app-add-edit-edgegroup/div/div/div/div/div[1]/form/mat-nav-list/mat-expansion-panel[3]/div/div/div/div[2]/div/div/div[2]/img")
	WebElement onBoardingCertificateDownloadElement;
	
	public void onBoardingCertificateDownload() {
		clickElement(onBoardingCertificateDownloadElement, "Click on the download button of onboardingcertificate");
		
	}
	@FindBy(xpath = "//app-add-edit-edgegroup/div/div/div/div/div[1]/form/mat-nav-list/mat-expansion-panel[3]/div/div/div/div[1]/div/div/div[2]/img[2]")
	WebElement edgeConfigurationDownloadElement;
	
	public void edgeConfigurationDownload() {
		
		clickElement(edgeConfigurationDownloadElement, "Click on the download button of edgeConfiguration");
	}


	
}
