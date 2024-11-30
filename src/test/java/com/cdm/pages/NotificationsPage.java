package com.cdm.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

public class NotificationsPage extends CommonActions {

	public NotificationsPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	

	@FindBy(xpath = "//td[contains(text(),'License Expiry')]")
	WebElement licenseVisibility;

	
	@FindBy(xpath = "//a[contains(text(),'Notifications')]")
	WebElement Notificationtab;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement notificationnameThreeDot;

	@FindBy(xpath = "//input[@name='notificationname']")
	WebElement notificationnamesearchinput;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/img[1]")
	WebElement addUserGroupMapping;

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void Notification_tab() {
	
		wait(Notificationtab,logger);
		clickElement(Notificationtab, "");
		
	}
	public void notificationnameThreeDot() {
		clickElement(notificationnameThreeDot, "");
		//notificationnameThreeDot.click();

	}

	public void notificationnamesearchinput(String value) {
		SetInputENterKey(notificationnamesearchinput,"");
		SetInput(notificationnamesearchinput, value, value);
		
//		notificationnamesearchinput.sendKeys(Keys.ENTER);
//		notificationnamesearchinput.sendKeys(value);
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			clickElement(backDropShowing, "");
			//backDropShowing.click();
		}
	}

	public void addUserGroupMapping() {
		clickElement(addUserGroupMapping, "");
		//addUserGroupMapping.click();
	}

	public void licenseExpiryVisibility() {
		if (licenseVisibility.isDisplayed()){
            System.out.println("Element is visible!");
        } else {
            System.out.println("Element is not visible!");
        }
		
		
	}
	@FindBy(xpath = "//table/thead/tr/th[1]/div/span/div/div[1]")
	WebElement NotificationNameElement;
	
	
	@FindBy(xpath = "//table/thead/tr/th[2]/div/span/div/div[1]")
	WebElement statusElement;
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement notificationTooltip;
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement statusTooltip;

	
	public String get_Text_ToolTipforNotificationName() {
		mouseHover(NotificationNameElement);

		String notificationTooltipText = notificationTooltip.getText();

		notificationTooltipText.trim();

		return notificationTooltipText;
	}

	public String get_Text_ToolTipforStatus() {
		mouseHover(statusElement);

		String statusTooltipText = statusTooltip.getText();

		statusTooltipText.trim();

		return statusTooltipText;
	}

	public void sortingOnNotificationName() throws InterruptedException {
		driver.findElement(By.xpath("//app-notification/div/div[2]/div/div/table/thead/tr/th[1]/div/span/div/div[1]")).click();
		Thread.sleep(2000);
		try {
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

	public void sortingOnNotificationStatus() throws InterruptedException {
		driver.findElement(By.xpath("//app-notification/div/div[2]/div/div/table/thead/tr/th[2]/div/span/div/div[1]")).click();
		Thread.sleep(2000);
		try {
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
	}
		
	

