package com.cdm.StepDefinations;

import java.util.Collection;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.cdm.pages.HomePage;
import com.cdm.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Common extends BaseTest {
	@Before
	public void getScenario(Scenario scenario) throws InterruptedException {
		// initiation();
		vTCName = scenario.getName();
		Collection<String> tagNames = scenario.getSourceTagNames();
		Iterator<String> itrator = tagNames.iterator();
		while (itrator.hasNext()) {
			String temp = itrator.next();
			System.out.println("I am tag Name" + temp);
			if (temp.startsWith("@Sheet")) {
				tagName = temp.replace("@Sheet", "");
				System.out.println("I am in Sheet" + tagName);
			}
		}
		initiationData();
		logger = extent.createTest(vTCName);

	}

	@After
	public void savereport() {

		extent.flush();
		//driver.close();
		driver.quit();
		driver=null;
	}

	@Given("User launch application in chrome browser")
	public void user_launch_application_in_chrome_browser() {

		driver.get(prop.getProperty("AppUrl") + alldata.get(vTCName).get("Url"));
		//HomePage home = new HomePage(driver, logger);


	}

	@When("user enters credentials and click on login button")

	public void user_enters_credentials_and_click_on_login_button() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger); // object creation()

		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));

		lp.checkboxClickTermsandConditions();

		lp.clickLogin();
		Thread.sleep(2000);


	}

	@When("Successfull login should be happen")
	public void successfull_login_should_be_happen() throws Exception {
		LoginPage lp = new LoginPage(driver, logger);
		lp.verifyDashboard();
	}

	@Then("verify page with resize the login page")
	public void verify_logipage_resize() throws InterruptedException {
		System.out.println("I am in start of verify_logipage_resize");
		LoginPage lp = new LoginPage(driver, logger);
		driver.manage().window().minimize();
		System.out.println("I am in start of verify_logipage_resize after maximize");

		logger.pass("window is resize to 50%");
		Thread.sleep(300);
		driver.manage().window().maximize();
		logger.pass("window is resize to 100%");
		Thread.sleep(300);
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		logger.pass("window is resize to 150%");
		System.out.println("I am in start of verify_logipage_resize END");

	}
}
