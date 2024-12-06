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

public class EdgeDeviceEdit extends CommonActions {

	public EdgeDeviceEdit(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

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
		clickElement(EditListpageVerification,"");
		//EditListpageVerification.click();
		
		if (validationMessageEdgeId == null) {
			return "";
		}
		String message = validationMessageEdgeId.getText();

		return message.trim();

	}

	public String verifyValidationMessageEdgeName() {
		clickElement(EditListpageVerification,"");
		//EditListpageVerification.click();
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
		//EditListpageVerification.click();
	}
	@FindBy(xpath = "//app-device-add-edit-detail-page/div/div/div/div/div/app-deviceloglist/div/div[2]/div/div/table/thead/tr/th[1]/div/app-filter/div/a/mat-icon")
	WebElement TimeStampThreedDotElement;

	@FindBy(xpath = "//app-device-add-edit-detail-page/div/div/div/div/div/app-deviceloglist/div/div[2]/div/div/table/thead/tr/th[2]/div/app-filter/div/a/mat-icon")
	WebElement severityElement;
	
	@FindBy(xpath = "//app-device-add-edit-detail-page/div/div/div/div/div/app-deviceloglist/div/div[2]/div/div/table/thead/tr/th[3]/div/app-filter/div/a/mat-icon")
	WebElement sourceElement;
	
	@FindBy(xpath = "//app-device-add-edit-detail-page/div/div/div/div/div/app-deviceloglist/div/div[2]/div/div/table/thead/tr/th[4]/div/app-filter/div/a/mat-icon")
	WebElement message;
	public void TimeStampThreeDot() {
		
		clickElement(TimeStampThreedDotElement, "Clicking on three dots of timeStamp");
	}
	
	public void severity() {
		
		clickElement(severityElement, "Clicking on three dots of severity");
	}
	
	public void source() {
		
		clickElement(sourceElement, "Clicking on three dots of source");
	}
	
	@FindBy(xpath = "//app-device-add-edit-detail-page/div/div/div/div/div/app-deviceloglist/div/div[2]/div/div/table/thead/tr/th[4]/div/app-filter/div/a/mat-icon")
	WebElement timeStampInput;
	@FindBy(xpath = "//input[@name='severity']")
	WebElement severityInput;
	@FindBy(xpath = "//input[@name='source']")
	WebElement sourceInput;
	
	@FindBy(xpath = "//input[@name='message']")
	WebElement messageInput;
	
	public void sendTimeStampValue(String value) {
		
			SetInputENterKey(timeStampInput, "");
			SetInput(timeStampInput, value, value);

		}
	public void sendTimeSeverity(String value) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", severityInput);
		SetInputENterKey(severityInput, "");
		SetInput(severityInput, value, value);

	}
	public void sourceValue(String value) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].focus();", sourceInput);
		SetInputENterKey(sourceInput, "");
		SetInput(sourceInput, value, value);

	}
	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	@FindBy(xpath = "//*[@id='matTable']/table/thead/tr/th[4]/div/app-filter/div/a/mat-icon")
	WebElement messageElement;
	
	@FindBy(xpath = "//span[contains(text(),' Apply ')]")
	public WebElement applybuttoncalender;

	public void message() {
	
			
			clickElement(messageElement, "Clicking on three dots of source");
		}
		
	

	public void sendMessage(String value) {
		SetInputENterKey(messageInput, "");
		SetInput(messageInput, value, value);
	}

	public void applybuttoncalender() {
		clickElement(applybuttoncalender, "");	
	}
	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	WebElement calenderIcon;

	public void calenderIcon() {
		clickElement(calenderIcon, "");
		
	}

	public void sortingOnTimeStamp() throws InterruptedException {
		// Click the sorting icon for ascending order
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		try {
		
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

	public void sortingOnSeverity() throws InterruptedException {
		// Click the sorting icon for ascending order
		driver.findElement(By.xpath("//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		try {
			

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

	public void sortingOnSource() throws InterruptedException {
		// Click the sorting icon for ascending order
		driver.findElement(By.xpath("//thead/tr[1]/th[3]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		try {
			

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

	public void sortingOnMessage() throws InterruptedException {
		// Click the sorting icon for ascending order
		driver.findElement(By.xpath("//thead/tr[1]/th[4]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		try {
			
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
	@FindBy(css = ".cdk-overlay-container")
	WebElement outerlayerclick;
	public void outerlayerclick() {
		clickElement(outerlayerclick, "");
		
	}

	@FindBy(xpath="//ul[@class='nav']/li[5]/a")
	WebElement configurationTabElement;
	public void configurationsTab() {
		
		clickElement(configurationTabElement,"Clicking on tab of configurations under Edit");
		
	}

	@FindBy(xpath="//*[@id='matTable']/table/tbody/tr/td[7]/div/img[1]")
	WebElement viewResponseBodyElement;
	public void viewResponseBody() {
		
		clickElement(viewResponseBodyElement, "Clicking on View Response Body");
		
	}

	public void sortingonEdgeName() throws InterruptedException {
		
		driver.findElement(By.xpath("//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		
try {
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

	public void sortingonConfigName() throws InterruptedException {
		
		driver.findElement(By.xpath("//thead/tr[1]/th[3]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		try {
			

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

	public void sortingonLastUpdated() throws InterruptedException {
		driver.findElement(By.xpath("//thead/tr[1]/th[6]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		try {
			
			List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
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

	public void sortingonAppName() throws InterruptedException {
		driver.findElement(By.xpath("//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		try {
			
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
@FindBy(xpath= "//*[@id='nav-application']/div/app-config-deploy-history/div/div[1]/div/img[2]")
	WebElement historyviewButtonElement;
	public void historyViewButton() {
		
		clickElement(historyviewButtonElement, "Clicking on history view button");
		
	}
	@FindBy(xpath= "//h3[@class='profileheading']")
	WebElement headerTitlePopupElement;
	public WebElement headerTitlepoup() {
		headerTitlePopupElement.getText().trim();
		
		return headerTitlePopupElement;
		
		
	}

	@FindBy(xpath= "//*[@id='matTable']/table/tbody/tr/td[7]/div/img[2]")
	WebElement downloadButtonElement;
	public void downloadButton() {
		
		clickElement(downloadButtonElement, "Clicking on download button");
		
	}
	@FindBy(xpath = "//div[@id='toast-container']")
	WebElement bulkUploadsuccessmessage;


	public WebElement downloadPopupmessageText() {
		
		return bulkUploadsuccessmessage;
	}
	
	@FindBy(xpath="//div[@class='devicepagefooter2']")
	WebElement environmentalVariableTabElement;

	public void environmentalVariableTab() {
		clickElement(environmentalVariableTabElement, "Click on Environmental Tab element");
		
		
	}

	public void environmentalAdd() {
		// TODO Auto-generated method stub
		
	}

	public void configAddTopButton() {
		// TODO Auto-generated method stub
		
	}

	
	
		
	
		
	
		
	}

	

		
	

