package com.cdm.pages.Latest;

import java.time.Duration;
import java.util.List;

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
		String displayedCountString = paginationRecordLabel.getText().split(" ")[4];

		int displayedCount = Integer.parseInt(displayedCountString);
		int pageMove = displayedCount % rowPerPage == 0 ? displayedCount / rowPerPage : displayedCount / rowPerPage + 1;

		int lastPageRowCount = displayedCount % rowPerPage;
		if (displayedCount > rowPerPage && lastPageRowCount == 0) {
			lastPageRowCount = rowPerPage;
		}

		if (paginationFirstPageButton != null && paginationFirstPageButton.isEnabled()) {
			paginationFirstPageButton.click();

			// Wait for the page to load or for elements to become stable
			// You may replace the sleep with a more reliable wait strategy
			Thread.sleep(2000);
		}

		// Assuming allRowsInTable is updated after moving to the first page
		if (allRowsInTable.size() == lastPageRowCount) {
			return true;
		} else {
			return false;
		}
	}
}