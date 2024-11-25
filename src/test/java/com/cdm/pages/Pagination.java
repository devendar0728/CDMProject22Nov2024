package com.cdm.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class Pagination extends CommonActions {

	public Pagination(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table[@class='mat-table cdk-table mat-sort']")
	List<WebElement> tableList;

	@FindBy(xpath = "//tbody/tr")
	List<WebElement> allRowsInTable;

	@FindBy(xpath = "//button[@aria-label='Previous page']")
	WebElement previousButton;

	@FindBy(xpath = "//button[@aria-label='First page']")
	WebElement firstButton;

	@FindBy(xpath = "//button[@aria-label='Next page']")
	WebElement nextButton;

	@FindBy(xpath = "//button[@aria-label='Previous page']")
	WebElement paginationPreviosPageButton;

	@FindBy(xpath = "//button[@aria-label='First page']")
	WebElement paginationFirstPageButton;

	@FindBy(xpath = "//button[@aria-label='Last page']")
	WebElement paginationLastPageButton;

	@FindBy(xpath = "//mat-paginator//mat-select")
	WebElement paginationRecordDropdown;

	//
	@FindBy(xpath = "//div[@class='mat-paginator-range-label']")
	WebElement paginationRecordLabel;

	public boolean nextPageClickAndCountOnLastPage(int rowPerPage) throws Exception {

		String displayedCountString = paginationRecordLabel.getText().split(" ")[4];

		int displayedCount = Integer.parseInt(displayedCountString);

		int pageMove = 0;
		if (displayedCount % rowPerPage == 0) {
			pageMove = displayedCount / rowPerPage;
		} else {
			pageMove = displayedCount / rowPerPage + 1;
		}

		int lastPageRowCount = displayedCount % rowPerPage;
		if (displayedCount > rowPerPage && lastPageRowCount == 0) {
			lastPageRowCount = rowPerPage;
		}

		if (firstButton != null && firstButton.isEnabled()) {
			firstButton.click();
			Thread.sleep(2000);
		}

		for (int i = 1; i < pageMove; i++) {
			if (nextButton != null && nextButton.isEnabled()) {
				nextButton.click();
				Thread.sleep(2000);
			}
		}

		if (allRowsInTable.size() == lastPageRowCount) {
			return true;
		} else {
			return false;
		}

	}

	public boolean LastPageClickAndCount(int rowPerPage) throws Exception {

		String displayedCountString = paginationRecordLabel.getText().split(" ")[4];

		int displayedCount = Integer.parseInt(displayedCountString);
		int pageMove = 0;
		if (displayedCount % rowPerPage == 0) {
			pageMove = displayedCount / rowPerPage;
		} else {
			pageMove = displayedCount / rowPerPage + 1;
		}

		// int pageMove = Math.ceilDivExact(displayedCount, rowPerPage);

		int lastPageRowCount = displayedCount % rowPerPage;
		if (displayedCount > rowPerPage && lastPageRowCount == 0) {
			lastPageRowCount = rowPerPage;
		}

		if (paginationLastPageButton != null && paginationLastPageButton.isEnabled()) {
			paginationLastPageButton.click();
			Thread.sleep(2000);
		}

		if (allRowsInTable.size() == lastPageRowCount) {
			return true;
		} else {
			return false;
		}

	}

	public boolean fullforwardArrowClick(int rowPerPage) throws Exception {

		String displayedCountString = paginationRecordLabel.getText().split(" ")[4];

		int displayedCount = Integer.parseInt(displayedCountString);
		int pageMove = 0;
		if (displayedCount % rowPerPage == 0) {
			pageMove = displayedCount / rowPerPage;
		} else {
			pageMove = displayedCount / rowPerPage + 1;
		}

		// int pageMove = Math.ceilDivExact(displayedCount, rowPerPage);

		int lastPageRowCount = displayedCount % rowPerPage;
		if (displayedCount > rowPerPage && lastPageRowCount == 0) {
			lastPageRowCount = rowPerPage;
		}

		if (paginationLastPageButton != null && paginationLastPageButton.isEnabled()) {
			paginationLastPageButton.click();
			Thread.sleep(2000);
		}

		if (allRowsInTable.size() == lastPageRowCount) {
			return true;
		} else {
			return false;
		}

	}

	public void SelectPageMatOption(String value) {
		try {
			System.out.println("Value is " + value);
			SelectMatOption(paginationRecordDropdown, value);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	public boolean previousPageClickAndCount(int rowPerPage) throws Exception {
		String displayedCountString = paginationRecordLabel.getText().split(" ")[4];
		int displayedCount = Integer.parseInt(displayedCountString);

		int pageMove = displayedCount % rowPerPage == 0 ? displayedCount / rowPerPage : displayedCount / rowPerPage + 1;

		int lastPageRowCount = displayedCount % rowPerPage;
		if (displayedCount > rowPerPage && lastPageRowCount == 0) {
			lastPageRowCount = rowPerPage;
		}
		for (int i = 1; i < pageMove; i++) {
			if (nextButton != null && nextButton.isEnabled()) {
				nextButton.click();
				Thread.sleep(2000);
			}
		}
		for (int i = 1; i < pageMove; i++) {
			if (nextButton != null && nextButton.isEnabled()) {
				nextButton.click();
				Thread.sleep(2000);
			}
		}
		for (int i = 1; i < pageMove; i++) {
			if (previousButton != null && previousButton.isEnabled()) {
				previousButton.click();
			}
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
		wait.until(ExpectedConditions.stalenessOf(allRowsInTable.get(0)));

		// Assuming allRowsInTable is updated after moving to the previous page
		if (allRowsInTable.size() == lastPageRowCount) {
			return true;
		} else {
			return false;
		}
	}

	public boolean firstPageFullBackwardArrow(int rowPerPage) throws Exception {
		  try {
		        // Extract the total record count from the pagination label
		        String displayedCountString = paginationRecordLabel.getText().split(" ")[4];
		        int displayedCount = Integer.parseInt(displayedCountString);

		        // Calculate the number of pages and last page row count
		        int pageMove = displayedCount % rowPerPage == 0 ? displayedCount / rowPerPage : displayedCount / rowPerPage + 1;
		        int lastPageRowCount = displayedCount % rowPerPage;
		        if (displayedCount > rowPerPage && lastPageRowCount == 0) {
		            lastPageRowCount = rowPerPage;
		        }

		        // Ensure the first-page button is present and enabled
		        if (paginationFirstPageButton != null && paginationFirstPageButton.isEnabled()) {
		            paginationFirstPageButton.click();

		           Thread.sleep(5000);

		            // Get the number of rows displayed on the first page
		            List<WebElement> rows = driver.findElements(By.xpath("//div[@class='mat-paginator-range-label'"));
		            int firstPageRowCount = rows.size();

		            // Log for debugging
		            logger.info("Expected row count: " + rowPerPage + ", Actual row count: " + firstPageRowCount);

		            // Verify the row count matches the expected value
		            return firstPageRowCount == rowPerPage;
		        } else {
		            throw new Exception("First Page button is either not visible or not enabled.");
		        }
		    } catch (Exception e) {
		        logger.error("Error in firstPageFullBackwardArrow method: " + e.getMessage());
		        throw e;
		    }

	}

	public boolean clickNextAndVerifyRows(int rowPerPage) throws InterruptedException {
		boolean isNextButtonFunctional = true;

	    // Get the total number of records from a UI element
	    int totalRecords = Integer.parseInt(driver.findElement(By.id("totalRecords")).getText());

	    // Calculate the total number of pages
	    int totalPages = (totalRecords + rowPerPage - 1) / rowPerPage;

	    // Iterate through each page
	    for (int currentPage = 1; currentPage < totalPages; currentPage++) {
	        // Click the Next button (Forward Arrow)
	        driver.findElement(By.cssSelector(".pagination-next-arrow")).click();
	        Thread.sleep(3000);

	        // Count the number of rows displayed on the current page
	        List<WebElement> rows = driver.findElements(By.cssSelector(".table-row"));
	        int displayedRows = rows.size();

	        // Validate that the number of rows matches the expected value
	        if (currentPage < totalPages - 1) {
	            if (displayedRows != rowPerPage) {
	                isNextButtonFunctional = false;
	                break;
	            }
	        } else { 
	            // Last page can have fewer records
	            if (displayedRows <= 0 || displayedRows > rowPerPage) {
	                isNextButtonFunctional = false;
	                break;
	            }
	        }
	    }
	    return isNextButtonFunctional;
	}

	public boolean navigateToLastPageAndVerify(int rowPerPage) throws InterruptedException {
		 // Click on the Full Forward Arrow to navigate to the last page
	    driver.findElement(By.xpath("//button[@aria-label='Last page']")).click();
	    Thread.sleep(3000);
	    // Extract the total records from the text (e.g., "96 – 96 of 96")
	    String totalRecordsText = driver.findElement(By.xpath("//div[@class='mat-paginator-range-label']")).getText(); // Replace with the actual locator
	    String totalRecordsNumber = totalRecordsText.replaceAll("[^0-9]", ""); // Removes all non-numeric characters
	    
	 // Parse the numeric part
	    int totalRecords = Integer.parseInt(totalRecordsNumber);

	    // Calculate the expected number of rows on the last page
	    int totalPages = (totalRecords + rowPerPage - 1) / rowPerPage;
	    int expectedRowsOnLastPage = totalRecords % rowPerPage == 0 ? rowPerPage : totalRecords % rowPerPage;

	    // Count the number of rows displayed on the last page
	    List<WebElement> rows = driver.findElements(By.xpath("//table[@row='table']"));
	    int displayedRows = rows.size();

	    // Validate that the number of displayed rows matches the expected number
	    return displayedRows == expectedRowsOnLastPage && displayedRows > 0;
	}
	}
