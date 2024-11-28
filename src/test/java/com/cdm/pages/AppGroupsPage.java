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

public class AppGroupsPage extends CommonActions {

	public AppGroupsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'App Groups')]")
	WebElement appGroupsNaviagtion;

	@FindBy(xpath = "//input[@id='csv']")
	WebElement uploadfile;

	@FindBy(xpath = "(//input[@name= 'options'])[2]")

	WebElement statusinActiveCheckbox;

	@FindBy(xpath = "//app-filter[@name ='isActive']")
	WebElement statusThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement appDisplayNameThreeDot;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement appNameThreeDot;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[4]")
	WebElement bulkdownloadButton;

	@FindBy(xpath = "//input[@name='appgroupname']")
	WebElement appNameSearch;

	@FindBy(xpath = "//input[@name='displayname']")
	WebElement appGroupNameSearch;

	@FindBy(xpath = "//input[@name='displayname']")
	WebElement appGroupNameListSearch;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/img[3]")
	WebElement bulkUploadButton;

	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	WebElement bulkUploadButtonSucess;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/img[2]")
	WebElement deleteIcon;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-confirmationdelete[1]/div[1]/mat-dialog-actions[1]/button[1]")
	WebElement confirmationYesButton;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-appgroup[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement addApplicationButton;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButton;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div/button/input")
	WebElement appGroupDisplayNameInput;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-appgroup[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement addButtonAppGroup;

	@FindBy(xpath = "//mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[7]/a/span")
	WebElement moveAppGroup;

	@FindBy(xpath = "// tbody/tr[1]/td[4]/img[1]")
	WebElement editButton;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/img[2]")
	WebElement deleteButton;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-appgroup/div/div[1]/div/img[1]")
	WebElement refreshButton;

	public void appgroupsNavigationClick() {
		clickElement(appGroupsNaviagtion, "Clicking on App Groups from left hand side navigation menu");

	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement appGroupNameTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement appGroupDisplayNameTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement appGroupStatusTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement editTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deleteTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement addApplicationsTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement refreshTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement addnewTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement bulkUploadTooltip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement bulkDownloadTooltip;

	@FindBy(xpath = "//div[@id='matTable']/table/thead/tr/th[1]/div/span/div/div[contains(text(),'App Group Name')][1]")
	WebElement AppGroupName;

	@FindBy(xpath = "//div[@id='matTable']/table/thead/tr/th[2]/div/span/div/div[contains(text(),'App Group Display Name')][1]")
	WebElement AppGroupDisplayName;

	@FindBy(xpath = "//*[@id='matTable']/table/thead/tr/th[3]/div/span/div/div[1]")
	WebElement statusColumn;

	@FindBy(css = ".cdk-overlay-container")
	WebElement statusTooltip;

	public String get_Text_ToolTipforEditButton() {
		mouseHover(editButton);

		String EditToolTipText = editTooltip.getText();

		EditToolTipText.trim();

		return EditToolTipText;

	}

	public String get_Text_ToolTipforAppGroupNameList() {
		mouseHover(AppGroupName);

		String EditToolTipText = appGroupNameTooltip.getText();

		EditToolTipText.trim();

		return EditToolTipText;

	}

	public String get_Text_ToolTipforAppGroupDisplayNameList() {
		mouseHover(AppGroupDisplayName);

		String EditToolTipText = appGroupDisplayNameTooltip.getText();

		EditToolTipText.trim();

		return EditToolTipText;

	}

	public String get_Text_ToolTipforDeleteButton() {
		mouseHover(deleteButton);

		String DeleteToolTipText = deleteTooltip.getText();

		DeleteToolTipText.trim();

		return DeleteToolTipText;

	}

	public String get_Text_ToolTipforAddApplications() {

		mouseHover(addApplicationButton);

		String addApplicationToolTipText = addApplicationsTooltip.getText();

		addApplicationToolTipText.trim();

		return addApplicationToolTipText;

	}

	public String get_Text_ToolTipforStatus() {
		mouseHover(statusColumn);

		String statusToolTipText = statusTooltip.getText();

		statusToolTipText.trim();

		return statusToolTipText;
	}

	public String get_Text_ToolTipforRefreshButton() {
		mouseHover(refreshButton);

		String refreshToolTipText = refreshTooltip.getText();

		refreshToolTipText.trim();

		return refreshToolTipText;
	}

	public String get_Text_ToolTipforBulkUploadButton() {
		mouseHover(bulkUploadButton);

		String bulkUploadToolTipText = bulkUploadTooltip.getText();

		bulkUploadToolTipText.trim();

		return bulkUploadToolTipText;
	}

	public String get_Text_ToolTipforBulkDownloadButton() {
		mouseHover(bulkdownloadButton);

		String bulkDownloadToolTipText = bulkDownloadTooltip.getText();

		bulkDownloadToolTipText.trim();

		return bulkDownloadToolTipText;
	}

	@FindBy(xpath = "//app-appgroup/div/div[1]/div/img[2]")
	WebElement addAppGroupClick;

	public void appGroupAddClick() {
		clickElement(addAppGroupClick, "Clicking on Add button of App Groups");

	}

	@FindBy(xpath = "//*[@id='matTable']/table/tbody/tr/td[1]")
	WebElement appGroupNameSearchElement;

	public String isGroupPresent() {

		WebElement appGroupTable = appGroupNameSearchElement;
		String appGroupNameSearch = appGroupTable.getText();
		return appGroupNameSearch;

	}

	@FindBy(xpath = "//div[@id='toast-container']")
	WebElement toasterSuccess;

	@FindBy(xpath = "//div[@class='toast-top-right toast-container']")
	WebElement toasterDeleted;

	public String ToasterMessageShouldBeDisplayed(String expectedMessage) {

		String actualMessage = toasterSuccess.getText();
		assert actualMessage.equals(expectedMessage) : "Expected: " + expectedMessage + ", but got: " + actualMessage;
		return actualMessage;
	}

	public String ToasterDeletedMessageShouldBeDisplayed(String expectedMessage) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement toasterElement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='toast-top-right toast-container']"))); // Example
																											// locator
		return toasterElement.getText();
	}

	public void appNameThreeDot() {

		clickElement(appNameThreeDot, "");
		// appNameThreeDot.click();
	}

	public void appDisplayNameThreeDot() {
		clickElement(appDisplayNameThreeDot, "");
		// appDisplayNameThreeDot.click();
	}

	public void appNameSearch(String value) {
//		appNameSearch.sendKeys(Keys.ENTER);
//		appNameSearch.sendKeys(value);

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", appNameSearch);
		SetInputENterKey(appNameSearch, "");
		SetInput(appNameSearch, value, value);
	}

	public void appGroupNameSearch(String value) {
//		appGroupNameSearch.sendKeys(Keys.ENTER);
//		appGroupNameSearch.sendKeys(value);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", appGroupNameSearch);
		SetInputENterKey(appGroupNameSearch, "");
		SetInput(appGroupNameSearch, value, value);
	}

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void appGroupNameListSearch(String value) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", appGroupNameListSearch);
		SetInputENterKey(appGroupNameListSearch, "");
		SetInput(appGroupNameListSearch, value, value);

	}

	@FindBy(xpath = "//span[contains(text(),'No Data Found')]")
	WebElement noResultMessageValidation;

	public String noResultMessage() {
		return noResultMessageValidation.getText();
	}

	@FindBy(xpath = "//*[@id='matTable']/table/thead/tr/th[2]/div/app-filter/div/a/mat-icon")
	WebElement appGroupDisplayName;

	public void appGroupDisplayThreeDot() {
		clickElement(appGroupDisplayName, "Clicking on three dots of appGroupDisplayName");

	}

	@FindBy(xpath = "//input[@name='displayname']")
	WebElement appGroupDisplayNameListSearch;

	public void appGroupDisplayNameListSearch(String value) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", appGroupNameListSearch);
		SetInputENterKey(appGroupDisplayNameListSearch, "");
		SetInput(appGroupDisplayNameListSearch, value, value);

	}

	public void editButton() {
		clickElement(editButton, "Clicking on edit button");
	}

	public void verifysortingonAppGroupName() throws InterruptedException {
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[1]")));

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			List<String> beforeSort = new ArrayList<String>();
			List<String> afterSort = new ArrayList<String>();
			for (int i = 0; i < columns.size(); i++) {
				beforeSort.add(columns.get(i).getText().trim());
				afterSort.add(columns.get(i).getText().trim());
			}

			afterSort.sort((a, b) -> a.compareTo(b));

			for (int i = 0; i < afterSort.size(); i++) {
				Assert.assertEquals("Column data is not sorted in ascending order", afterSort.get(i),
						beforeSort.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Test failed due to exception: " + e.getMessage());
		}

	}

	public void verifysortingonAppGroupDisplayName() throws InterruptedException {
		driver.findElement(By.xpath("//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[2]")));

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
			List<String> beforeSort = new ArrayList<String>();
			List<String> afterSort = new ArrayList<String>();
			for (int i = 0; i < columns.size(); i++) {
				beforeSort.add(columns.get(i).getText().trim());
				afterSort.add(columns.get(i).getText().trim());
			}

			afterSort.sort((a, b) -> a.compareTo(b));

			for (int i = 0; i < afterSort.size(); i++) {
				Assert.assertEquals("Column data is not sorted in ascending order", afterSort.get(i),
						beforeSort.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Test failed due to exception: " + e.getMessage());
		}

	}

	public void verifysortingonStatus() throws InterruptedException {
		driver.findElement(By.xpath("//thead/tr[1]/th[3]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[3]")));

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
			List<String> beforeSort = new ArrayList<String>();
			List<String> afterSort = new ArrayList<String>();
			for (int i = 0; i < columns.size(); i++) {
				beforeSort.add(columns.get(i).getText().trim());
				afterSort.add(columns.get(i).getText().trim());
			}

			afterSort.sort((a, b) -> a.compareTo(b));

			for (int i = 0; i < afterSort.size(); i++) {
				Assert.assertEquals("Column data is not sorted in ascending order", afterSort.get(i),
						beforeSort.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Test failed due to exception: " + e.getMessage());
		}

	}

	@FindBy(xpath = "//table/tbody/tr[1]/td[4]/img[2]")
	WebElement deleteButtonApp;

	public void deleteButton() {

		clickElement(deleteButtonApp, "Clicking on delete button of App groups page");

	}

	public void confirmationYesButton() {
		clickElement(confirmationYesButton, "Clicking on yes button on confirmation popup");
	}

	public void downloadButton() {
		clickElement(bulkdownloadButton, "Clicking on bulk download button");

	}

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div[2]/div/app-appgroup/div/div[1]/div/img[1]")
	WebElement refreshButtonfun;

	public void RefreshButton() {

		clickElement(refreshButtonfun, "Clicking on refresh button");
		
	}

	@FindBy(xpath="//table[@role='table']")
	WebElement refreshedTableGrid;
	
	@FindBy(xpath="//*[@id='matTable']/table/tbody/tr/td")
	WebElement firstRowAfterRefresh;
	
	
	
	public String lastRowBeforeRefresh() {
		
		WebElement tableGrid = driver.findElement(By.xpath("//table[@role='table']")); // Replace with your table locator

	    // Locate the last row before the refresh
	    WebElement lastRowBeforeRefresh = tableGrid.findElement(By.xpath("//tbody/tr[last()]")); // Adjust XPath if necessary
	    return lastRowBeforeRefresh.getText();
     
       
	}
	
	public String lastRowDataAfterRefresh() throws InterruptedException {
		  refreshButtonfun.click();
		  Thread.sleep(2000);
		 
		  
		  WebElement lastRowAfterRefresh = refreshedTableGrid.findElement(By.xpath("//tbody/tr[last()]")); // Adjust XPath if necessary
		    return lastRowAfterRefresh.getText();
		 
		
	}

	@FindBy(xpath="//tbody/tr[1]/td[4]/img[3]")
	WebElement addApplicationIcon;
	
	public void addApplicationIconforAppGroups() {
		clickElement(addApplicationIcon, "Clicking on addApplicationIconforAppGroups");
		
	}

	public void verifysortingonSelectColumn() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@id='matTable']/table/thead/tr/th[1]/div/div[contains(text(),'Select')][1]")).click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[1]")));

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			List<String> beforeSort = new ArrayList<String>();
			List<String> afterSort = new ArrayList<String>();
			for (int i = 0; i < columns.size(); i++) {
				beforeSort.add(columns.get(i).getText().trim());
				afterSort.add(columns.get(i).getText().trim());
			}

			afterSort.sort((a, b) -> a.compareTo(b));

			for (int i = 0; i < afterSort.size(); i++) {
				Assert.assertEquals("Column data is not sorted in ascending order", afterSort.get(i),
						beforeSort.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Test failed due to exception: " + e.getMessage());
		}

	}

	public void verifysortingonApplicationColumn() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='matTable']/table/thead/tr/th[2]/div/span/div/div[contains(text(),'Application')][1]")).click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[2]")));

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
			List<String> beforeSort = new ArrayList<String>();
			List<String> afterSort = new ArrayList<String>();
			for (int i = 0; i < columns.size(); i++) {
				beforeSort.add(columns.get(i).getText().trim());
				afterSort.add(columns.get(i).getText().trim());
			}

			afterSort.sort((a, b) -> a.compareTo(b));

			for (int i = 0; i < afterSort.size(); i++) {
				Assert.assertEquals("Column data is not sorted in ascending order", afterSort.get(i),
						beforeSort.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Test failed due to exception: " + e.getMessage());
		}
		
	}

	public void verifysortingonArchitectureColumn() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='matTable']/table/thead/tr/th[3]/div/span/div/div[contains(text(),'Architecture')][1]")).click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[3]")));

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
			List<String> beforeSort = new ArrayList<String>();
			List<String> afterSort = new ArrayList<String>();
			for (int i = 0; i < columns.size(); i++) {
				beforeSort.add(columns.get(i).getText().trim());
				afterSort.add(columns.get(i).getText().trim());
			}

			afterSort.sort((a, b) -> a.compareTo(b));

			for (int i = 0; i < afterSort.size(); i++) {
				Assert.assertEquals("Column data is not sorted in ascending order", afterSort.get(i),
						beforeSort.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Test failed due to exception: " + e.getMessage());
		}
		
		
	}

	public void sortingonVersion() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='matTable']/table/thead/tr/th[4]/div/span/div/div[contains(text(),'Version/Tag')][1]")).click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[4]")));

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
			List<String> beforeSort = new ArrayList<String>();
			List<String> afterSort = new ArrayList<String>();
			for (int i = 0; i < columns.size(); i++) {
				beforeSort.add(columns.get(i).getText().trim());
				afterSort.add(columns.get(i).getText().trim());
			}

			afterSort.sort((a, b) -> a.compareTo(b));

			for (int i = 0; i < afterSort.size(); i++) {
				Assert.assertEquals("Column data is not sorted in ascending order", afterSort.get(i),
						beforeSort.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Test failed due to exception: " + e.getMessage());
		}
		
	}

	public void sortingOnStatus() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='matTable']/table/thead/tr/th[5]/div/span/div/div[contains(text(),'Status')][1]")).click();
		Thread.sleep(2000);
		try {
			// Wait for table to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[5]")));

			// Fetch column data before sorting
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
			List<String> beforeSort = new ArrayList<String>();
			List<String> afterSort = new ArrayList<String>();
			for (int i = 0; i < columns.size(); i++) {
				beforeSort.add(columns.get(i).getText().trim());
				afterSort.add(columns.get(i).getText().trim());
			}

			afterSort.sort((a, b) -> a.compareTo(b));

			for (int i = 0; i < afterSort.size(); i++) {
				Assert.assertEquals("Column data is not sorted in ascending order", afterSort.get(i),
						beforeSort.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Test failed due to exception: " + e.getMessage());
		}
		
	}
}
