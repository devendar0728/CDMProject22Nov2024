package com.cdm.common;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class CommonActions {

	protected WebDriver driver;
	public ExtentTest logger;
	private boolean isLocalMachine = true;

	public CommonActions(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
	}

	public void moveSliderCondition(WebElement sliderOnCheckBox, WebElement sliderOnCheckBoxLabel, String m) {
		boolean isSelected = sliderOnCheckBox.isSelected();
		if (m == "checked") {
			if (!isSelected) {
				sliderOnCheckBoxLabel.click();
			}
		} else {
			if (isSelected) {
				sliderOnCheckBoxLabel.click();
			}
		}

	}
	public void verifyButtonVisibility(String buttonId, String buttonName,String msg) {
		try {
			WebElement button = driver.findElement(By.id(buttonId));
		    Assert.assertTrue(buttonName + " is not visible", button.isDisplayed());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a>" + msg + "</span>");
		}
	    
	    
	}
	public void waitElementToVisible(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Maximum wait time of 30 seconds
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
	}

	public void waitForPageLoaded() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Maximum wait time of 30 seconds
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete';"));
	}

	public String removePath(String url) throws URISyntaxException {
		URI uri = new URI(url);
		String scheme = uri.getScheme();
		String authority = uri.getAuthority();
		return scheme + "://" + authority;
	}

	// Method to append fragment to URL
	public String appendFragmentWithOutPath(String fragment) throws URISyntaxException, InterruptedException {
		waitForPageLoaded();
		Thread.sleep(500);
		String currentUrl = driver.getCurrentUrl();

		// Remove path from the URL
		String baseUrl = removePath(currentUrl);

		// Append the fragment to the base URL

		URI baseUri = new URI(baseUrl);
		URI finalUri = baseUri.resolve(fragment);
		System.out.println(finalUri.toString());

		for (int i = 0; i < 5; i++) {
			driver.get(finalUri.toString());
			Thread.sleep(1500);
			waitForPageLoaded();
			currentUrl = driver.getCurrentUrl();
			if (currentUrl.equalsIgnoreCase(finalUri.toString())) {
				System.out.println(currentUrl);
				break;
			} else {
				System.out.println(currentUrl + "  not matched with " + finalUri.toString());
			}
		}

		return finalUri.toString();
	}
     

	public String getText(WebElement elm) {

		for (int i = 0; i < 5; i++) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
				wait.until(ExpectedConditions.visibilityOf(elm));
				return elm.getText();
			} catch (Exception e) {

			}
		}
		return "";
	}

	public void wait(WebElement ele, ExtentTest logger) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public void SetInputENterKey(WebElement elm, String msg) {
		for (int i = 0; i < 5; i++) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
				wait.until(ExpectedConditions.visibilityOf(elm));
				elm.clear();
				elm.sendKeys(Keys.ENTER);

				logger.pass(msg + "<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");

				return;
			} catch (Exception e) {
				if (i == 4) {
					System.out.println(e.getMessage());
					logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
							+ getScreenshot() + ">Screenshot</a></span>");
				}
			}
		}

	}

	public void SetInput(WebElement elm, CharSequence[] data, String msg) {
		for (int i = 0; i < 5; i++) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
				wait.until(ExpectedConditions.visibilityOf(elm));
				elm.clear();
				elm.sendKeys(data[0]);
				String value = elm.getText();
				Assert.assertEquals(data.toString(), value);
				logger.pass("<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
				return;
			} catch (Exception e) {
				if (i == 4) {
					System.out.println(e.getMessage());
					logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
							+ getScreenshot() + ">Screenshot</a></span>");
				}
			}
		}
	}

	public void SetInput(WebElement elm, String data, String msg) {
		for (int i = 0; i < 5; i++) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
				wait.until(ExpectedConditions.visibilityOf(elm));
				elm.clear();
				elm.sendKeys(data);
				logger.pass("<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
				return;
			} catch (Exception e) {
				if (i == 4) {
					System.out.println(e.getMessage());
					logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
							+ getScreenshot() + ">Screenshot</a>" + msg + "</span>");
				}
			}
		}
	}

	public void SetInput(By elm, String data, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOfElementLocated(elm));
			driver.findElement(elm).clear();
			driver.findElement(elm).sendKeys(data);
			logger.pass("<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a>" + msg + "</span>");
		}
	}

	public void SetInput(String elm, String data, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(elm))));
			driver.findElement(By.xpath(elm)).clear();
			driver.findElement(By.xpath(elm)).sendKeys(data);
			logger.pass("<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a>" + msg + "</span>");
		}
	}

	public void clickElement(WebElement elm, String msg) {
		for (int i = 0; i < 5; i++) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
				wait.until(ExpectedConditions.elementToBeClickable(elm));
				elm.click();
				logger.pass("<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
				return;
			} catch (Exception e) {
				if (i == 4) {
					System.out.println(e.getMessage());
					logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
							+ getScreenshot() + ">Screenshot</a>" + msg + "</span>");
				}
			}
		}
	}

	public void verifyText(WebElement elm, String text, String msg) {
		for (int i = 0; i < 6; i++) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
				wait.until(ExpectedConditions.elementToBeClickable(elm));
				String eleText = elm.getText();
				Assert.assertEquals(msg, eleText, text);

				logger.pass("<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
				return;
			} catch (Exception e) {
				try {
					Thread.sleep(2000);
				} catch (Exception e1) {
					// TODO: handle exception
				}
				if (i == 4) {
					System.out.println(e.getMessage());
					logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
							+ getScreenshot() + ">Screenshot</a>" + msg + "</span>");
				}
			}
		}
	}

	public void clickElement(By elm, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.elementToBeClickable(elm));
			driver.findElement(elm).click();
			logger.pass("<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a>" + msg + "</span>");
		}
	}

	public void clickElement(String elm, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(elm))));
			driver.findElement(By.xpath(elm)).click();
			logger.pass("<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a>" + msg + "</span>");
		}
	}

	public void ElementExist(WebElement elm, String msg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.isDisplayed();
			logger.pass("<span class='label end-time'><a href=" + getScreenshot() + ">Screenshot</a></span>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a>" + msg + "</span>");
		}
	}

	public void verifyTitle(String exp, String msg) {
		try {
			if (exp.equals(driver.getTitle())) {
				logger.pass("Title matched");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a>" + msg + "</span>");
		}
	}

	public String getScreenshot() {

		if (isLocalMachine) {

		}

		Date d = new Date();
		DateFormat ft = new SimpleDateFormat("ddMMyyyyhhmmss");
		String fileName = ft.format(d);
		String path = System.getProperty("user.dir") + "/src/test/java/com/cdm/reports/screenshot/" + fileName + ".png";
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File SrcFile = ts.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(path);
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return path;
	}

	public void mouseHover(WebElement e) {

		Actions actions = new Actions(driver);
		actions.moveToElement(e).build().perform();
	}

	public void mouseHoverVersion(WebElement e) {
		Actions actions = new Actions(driver);

		actions.moveByOffset(-30, -30).perform();
	}

	public void mouseHoverClick(WebElement e) {

		Actions actions = new Actions(driver);
		actions.moveToElement(e).click().build().perform();
	}

	public void doubleClick(WebElement e) {

		Actions actions = new Actions(driver);
		actions.doubleClick(e).perform();
	}

	public String removalofEneredText(WebElement element, String message) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOf(element));

			String text = element.getDomProperty("value");
			String[] arr = text.split("");
			for (int i = 0; i < arr.length; i++) {
				element.sendKeys(Keys.BACK_SPACE);
			}
			element.sendKeys(Keys.ENTER);
			text = element.getDomProperty("value");

			logger.pass("Text got removed");
			return text;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fail("Step failed due to " + e.getMessage() + "<span class='label end-time'><a href="
					+ getScreenshot() + ">Screenshot</a></span>");
		}

		return ".";

	}

	public String removalofEneredText(WebElement element) {

		String text = element.getDomProperty("value");
		String[] arr = text.split("");
		for (int i = 0; i < arr.length; i++) {
			element.sendKeys(Keys.BACK_SPACE);
		}
		element.sendKeys(Keys.ENTER);
		text = element.getDomProperty("value");
		return text;

	}

	public void scrollingElementRightBar(String cssSelector, String width) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('" + cssSelector + "').scrollLeft=" + width + "", "");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}

	public void scrollingvertical(String cssSelector, String startingPoint, String height) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelector('" + cssSelector + "').scrollTo(" + startingPoint + ", " + height + ")");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void scrollingup(String cssSelector, String startingPoint, String height) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelector('" + cssSelector + "').scrollTo(" + startingPoint + ", " + height + ")");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}

	public void fetchDropDownElement(WebElement dropdownEle, String text) {
		Select s = new Select(dropdownEle);
		s.selectByVisibleText(text);
//	List<WebElement>allOptions =	s.getOptions();
//	for(WebElement paginationOptions:allOptions) {
//		String paginationOptionText = paginationOptions.getText();
//		System.out.println(paginationOptionText);
//	}

	}

	public void SelectMatOption(WebElement ele, String text) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			try {

				ele.click();
				Thread.sleep(2);
				String xpath = "//mat-option/span[contains(text(),'" + text + "')]";
				WebElement optionToSelect = ele.findElement(By.xpath(xpath));
				optionToSelect.click();
				return;
			} catch (Exception ex) {
				Thread.sleep(1000);
				if (i == 4) {

				}
			}
		}

	}

	public static String capture(WebDriver driver, String screenShotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\ErrorScreenshots\\" + screenShotName + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);

		return dest;
	}

}