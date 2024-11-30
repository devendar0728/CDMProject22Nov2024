package com.cdm.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class ConfigurationsModulePage extends CommonActions {

	public ConfigurationsModulePage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]/div[2]/div[3]")
	public WebElement edgeIdSortDescend;

	@FindBy(xpath = "//div[contains(text(),'EDGE ID')]")
	public WebElement edgeIDTool;

	@FindBy(xpath = "//div[contains(text(),'App Name')]")
	public WebElement appTool;

	@FindBy(xpath = "//div[contains(text(),'Config Name')]")
	public WebElement configTool;

	@FindBy(xpath = "//div[contains(text(),'Response Status')]")
	public WebElement responseStatusTool;

	@FindBy(xpath = "//div[contains(text(),'Timestamp')]")
	public WebElement timeStampTool;

	@FindBy(xpath = "//div[contains(text(),'Last Updated')]")
	public WebElement lastUpdatedTool;

	@FindBy(xpath = "//th[contains(text(),'Actions')]")
	public WebElement actionTool;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[2]")
	public WebElement downloadTool;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	public WebElement viewResponseTool;

	@FindBy(css = ".mat-tooltip-trigger.fa.fa-times-circle-o.profilecancel")
	public WebElement closeTool;

	@FindBy(xpath =  "/html[1]/body[1]/div[3]/div[3]/div[1]/mat-tooltip-component[1]/div[1]")
	WebElement closeToolTip;

	@FindBy(xpath = "//span[contains(text(),' Apply ')]")
	public WebElement applybuttoncalender;

	@FindBy(css = ".cdk-overlay-container")
	WebElement appNameConfigThreeDotToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement edgeIDThreeDotConfigTextToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement configNameThreeDotToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement responseStatusToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement timeStampToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement lastUpdatedToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement downloadToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement viewResponseToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement actionsToolTip;

	@FindBy(xpath = "//button[@aria-label ='Choose month and year']")
	public WebElement arrowforyearandmonth;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	WebElement calenderIcon;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement downloadbutton;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/img[1]")
	WebElement viewResponseBodyIcon;

	@FindBy(xpath = "//input[@name='devicename']")
	WebElement inputEdgeId;

	@FindBy(xpath = "//input[@placeholder='  App Name ']")
	WebElement inputAppName;

	@FindBy(xpath = "//input[@placeholder='Config Name ']")
	WebElement inputConfigName;

	@FindBy(xpath = "//input[@name='status']")
	WebElement inputResponseStatus;

	@FindBy(css = ".cdk-overlay-container")
	WebElement refreshConfigButtonToolTip;

	@FindBy(xpath = "/html/body/div[3]/div/div/mat-tooltip-component/div")
	WebElement viewResponseBodyToolTip;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement appNameConfigThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement edgeIDThreeDotConfig;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement configNameThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement responseStatusThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[5]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement timeStampThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[6]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement lastUpdatedThreeDot;

	@FindBy(xpath = "//span[contains(text(),'Configurations')]")
	WebElement configTabmain;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-configuration-app[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement currentviewbuttonclick;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-configuration-app/div/div[2]/div[1]/div/div/table/tbody/tr/td[7]/div")
	WebElement row_present;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-configuration-app/div/div[2]/div[1]/div/div/table/tbody/tr/td[7]/div")
	WebElement responseBodyIcon;

	@FindBy(className = "titleHeading")
	WebElement configHeading;

	@FindBy(className = "mat-tooltip-trigger")
	WebElement view_response;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[5]/a/span")
	WebElement config_tab;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-configuration-app[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement refreshBtn;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-device-add-edit-detail-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-config-deploy-history[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement currentView;

	public void movetoconfiguration() {
		clickElement(config_tab, "Clicking on Configuration main menu navigation");
	}

	public void responseBodyIcon() {
		clickElement(responseBodyIcon, "");
		// responseBodyIcon.click();
	}

	public void refreshbutton() {
		clickElement(refreshBtn, "");
//		refreshBtn.click();

	}

	public String removalofEnteredTextForEdgeID() {

		return removalofEneredText(inputEdgeId);

	}

	public String removalofEnteredTextForAppName() {

		return removalofEneredText(inputAppName);

	}

	public String removalofEnteredTextForConfigName() {

		return removalofEneredText(inputConfigName);

	}

	public String removalofEnteredTextForResponseStatus() {

		return removalofEneredText(inputResponseStatus);

	}

	public void configTabmain() {

		clickElement(configTabmain, "");
		// configTabmain.click();
	}

	public String get_Text_ToolTipEdgeID() throws InterruptedException {
		Thread.sleep(4000);
		mouseHover(edgeIDTool);

		String edgeIDThreeDotConfigText = edgeIDThreeDotConfigTextToolTip.getText();

		System.out.println("toolTipText-->" + edgeIDThreeDotConfigText);

		return edgeIDThreeDotConfigText;

	}

	public String get_Text_ToolTipAppName() throws InterruptedException {

		mouseHover(appTool);

		String appNameConfigThreeDotText = appNameConfigThreeDotToolTip.getText();

		System.out.println("toolTipText-->" + appNameConfigThreeDotText);

		return appNameConfigThreeDotText;

	}

	public String get_Text_ToolTipConfig() throws InterruptedException {

		mouseHover(configTool);

		String configNameThreeDotText = configNameThreeDotToolTip.getText();

		System.out.println("toolTipText-->" + configNameThreeDotText);

		return configNameThreeDotText;

	}

	public String get_Text_ToolTipRefreshConfig() throws InterruptedException {
		Thread.sleep(4000);
		mouseHover(refreshBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String refreshconfigtoolTipText1 = refreshConfigButtonToolTip.getText();

		System.out.println("toolTipText-->" + refreshconfigtoolTipText1);

		return refreshconfigtoolTipText1;

	}

	public String get_Text_ToolTipViewResponseBody() throws InterruptedException {
		Thread.sleep(2000);
		mouseHover(viewResponseBodyIcon);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String refreshconfigtoolTipText1 = viewResponseBodyToolTip.getText();

		System.out.println("toolTipText-->" + refreshconfigtoolTipText1);

		return refreshconfigtoolTipText1;

	}

	public void currentviewbuttonclick() {
		clickElement(currentviewbuttonclick, "");
		// currentviewbuttonclick.click();
	}

	public void historyviewbuttonclick() {
		clickElement(currentviewbuttonclick, "");
		// currentviewbuttonclick.click();
	}

	public void appNameConfigThreeDot() {
		clickElement(appNameConfigThreeDot, "");
		// appNameConfigThreeDot.click();
	}

	public void edgeIDThreeDotConfig() {
		clickElement(edgeIDThreeDotConfig, "");
		// edgeIDThreeDotConfig.click();
	}

	public void configNameThreeDot() {
		clickElement(configNameThreeDot, "");
		// configNameThreeDot.click();
	}

	public void responseStatusThreeDot() {
		clickElement(responseStatusThreeDot, "");

//		responseStatusThreeDot.click();
	}

	public void timeStampThreeDot() {
		clickElement(timeStampThreeDot, "");

//		timeStampThreeDot.click();
	}

	public void lastUpdatedThreeDot() {
		clickElement(lastUpdatedThreeDot, "");

//		lastUpdatedThreeDot.click();
	}

	public void sendValueSearchinputBoxForEdgeID(String value) {
		SetInputENterKey(inputEdgeId, "");
		SetInput(inputEdgeId, value, value);

//		inputEdgeId.sendKeys(Keys.ENTER);
//		inputEdgeId.sendKeys(value);

	}

	public void sendValueSearchinputBoxForAppName(String value) {
		SetInputENterKey(inputAppName, "");
		SetInput(inputAppName, value, value);

//		inputAppName.sendKeys(Keys.ENTER);
//		inputAppName.sendKeys(value);

	}

	public void sendValueSearchinputBoxForConfigName(String value) {
		SetInputENterKey(inputConfigName, "");
		SetInput(inputConfigName, value, value);
//
//		inputConfigName.sendKeys(Keys.ENTER);
//		inputConfigName.sendKeys(value);

	}

	public void sendValueSearchinputBoxForResponseStatus(String value) {
		SetInputENterKey(inputResponseStatus, "");
		SetInput(inputResponseStatus, value, value);

//		inputResponseStatus.sendKeys(Keys.ENTER);
//		inputResponseStatus.sendKeys(value);

	}

	public void viewResponseBodyIcon() {
		clickElement(viewResponseBodyIcon, "");

//		viewResponseBodyIcon.click();
	}

	public void downloadAction() {
		clickElement(downloadbutton, "");
//		downloadbutton.click();
	}

	public void calenderIcon() {
		clickElement(calenderIcon, "");
//		calenderIcon.click();
	}

	public void arrowforyearandmonth() {
		clickElement(arrowforyearandmonth, "");
//		arrowforyearandmonth.click();

	}

	public void applybuttoncalender() {
		clickElement(applybuttoncalender, "");
//		applybuttoncalender.click();
	}

	public void minimizewindow() {

		driver.manage().window().minimize();

	}

	public void maximizewindow() {
		driver.manage().window().maximize();

	}

	public String get_Text_TooltipResponseStatus() {
		mouseHover(responseStatusTool);

		String appNameConfigThreeDotText = appNameConfigThreeDotToolTip.getText();

		System.out.println("toolTipText-->" + appNameConfigThreeDotText);

		return appNameConfigThreeDotText;
	}

	public String get_Text_TooltipTimeStamp() {
		mouseHover(timeStampTool);

		String appNameConfigThreeDotText = appNameConfigThreeDotToolTip.getText();

		System.out.println("toolTipText-->" + appNameConfigThreeDotText);

		return appNameConfigThreeDotText;
	}

	public String get_Text_TooltipDownloadButton() {
		mouseHover(downloadTool);

		String downloadToolText = downloadToolTip.getText();

		System.out.println("toolTipText-->" + downloadToolText);

		return downloadToolText;
	}

	public String get_Text_TooltipActions() {
		mouseHover(actionTool);

		String downloadToolText = actionsToolTip.getText();

		System.out.println("toolTipText-->" + downloadToolText);

		return downloadToolText;
	}

	public String get_Text_TooltipCloseButton() throws InterruptedException {
		Thread.sleep(4000);
		mouseHover(closeTool);
		System.out.println("Checking get_Text_TooltipCloseButton ............");
		System.out.println(closeTool.getAttribute("class"));
		Thread.sleep(4000);
		String closeToolTipText = closeToolTip.getText();

		System.out.println("toolTipText-->" + closeToolTipText);

		return closeToolTipText;

	}

	public void edgeIDSortDecending() {
		clickElement(edgeIdSortDescend, "");

	}
	@FindBy(xpath = "//*[@id='matTable']/table/thead/tr/th[3]/div/span/div/div[1]")
	public WebElement configAppColumnElement;
	

	@FindBy(css = ".cdk-overlay-container")
	WebElement configAppToolTip;
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement historyToolTip;
	
	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-configuration-app/div/div[1]/div/img[2]")
	WebElement historyWebElement;

	@FindBy(xpath = "//app-configuration-app/div/div[2]/div[1]/div/div/table/tbody/tr/td[7]/img[2]")
	WebElement downLoadElement;
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement downLoadTooltip ;
	
	
	@FindBy(xpath = "//app-configuration-app/div/div[2]/div[1]/div/div/table/thead/tr/th[6]/div/span/div/div[1]")
	WebElement lastUpdatedElement;
	
	public boolean isAssertionAddedSuccessfully() {
		return configHeading.isDisplayed();
	}

	public String get_Text_ToolTipViewConfigName() throws InterruptedException {
		Thread.sleep(4000);
		mouseHover(configAppColumnElement);
		
		Thread.sleep(4000);
		String configAppToolTipText = configAppToolTip.getText();

		System.out.println("toolTipText-->" + configAppToolTipText);

		return configAppToolTipText;
	}

	public String get_Text_TooltipLastUpdated() throws InterruptedException {
		Thread.sleep(4000);
		mouseHover(lastUpdatedElement);
		
		Thread.sleep(4000);
		String lastUpdatedToolTipText = lastUpdatedToolTip.getText();

		System.out.println("toolTipText-->" + lastUpdatedToolTipText);

		return lastUpdatedToolTipText;
	}

	public String get_Text_TooltipDownload() throws InterruptedException {
		Thread.sleep(4000);
		mouseHover(downLoadElement);
		
		Thread.sleep(4000);
		String downLoadToolTipText = downLoadTooltip.getText();

		System.out.println("toolTipText-->" + downLoadToolTipText);

		return downLoadToolTipText;
	}

	public String get_Text_TooltipHistoryView() throws InterruptedException {
		Thread.sleep(4000);
		mouseHover(historyWebElement);
		
		Thread.sleep(4000);
		String historyoolTipText = historyToolTip.getText();

		System.out.println("toolTipText-->" + historyoolTipText);

		return historyoolTipText;
		
	}

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;
	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			// clickElement(backDropShowing, "");
			backDropShowing.click();
		}
		
	}
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	WebElement ListDeploy;
	
	@FindBy(xpath = "	//app-configuration-app/div/div[1]/div/img[2]")
	WebElement historyViewButton;

	public String resultTable() {
		return ListDeploy.getText();
	}

	public void historyviewConfig() {
		clickElement(historyViewButton, "Clicking on History view Button");
		
	}
	@FindBy(xpath = "//tbody/tr")
	List<WebElement> gridRows;

	public List<String> getRowData() {

		List<String> rowData = new ArrayList<>();
		for (WebElement row : gridRows) {
			rowData.add(row.getText());
		}
		return rowData;
	}


	public int getRowCount() {
		return gridRows.size();
			}

	@FindBy(xpath = "//mat-sidenav-content/div[2]/div/app-configuration-app/div/div[2]/div[2]/span")
	 WebElement noResultMessage;
	
	public String noResultMessage() {
		String noResultMessageDisplay =  noResultMessage.getText().trim();
		return noResultMessageDisplay ;
		
		
		
	}
	

}
