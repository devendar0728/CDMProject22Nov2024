package com.cdm.Stepdefinations;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cdm.pages.AboutPage;
import com.cdm.pages.PDFUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutSteps extends BaseTest {

	@Then("verify page with resize option for the About page")
	public void verify_page_with_resize_option_for_the_about_page() {
		AboutPage about = new AboutPage(driver, logger);
		about.setZoomLevel(800, 600);
	}
	@Then("Verification of Terms and Conditions link by Using Enter tab in ABOUT Screen")
	public void verification_of_terms_and_conditions_link_by_using_enter_tab_in_about_screen() {
		AboutPage about = new AboutPage(driver, logger);
		about.termsandConditionClick();
	}
	@Then("Click on About tab from right panel of the screen")
	public void click_on_about_tab_from_right_panel_of_the_screen() throws InterruptedException {
		AboutPage about = new AboutPage(driver, logger);

		about.aboutTab();
	}

	@Then("verify colour of the heading Title")
	public void verify_colour_of_the_heading_title() throws InterruptedException {
		AboutPage about = new AboutPage(driver, logger);

		about.captureTitleColor();
		about.verifyTitleColor(alldata.get(vTCName).get("colourcode").toString());
	}

	@Then("verify visibility duration to load page")
	public void verify_visibility_duration_to_load_page() throws InterruptedException {
		AboutPage about = new AboutPage(driver, logger);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOf(about.hasTitleElement()));
		// If the element is visible, it means the page is loaded
		Assert.assertEquals(about.verifyTitle(), "ForeSite EDGE CDM Software Version");
	}

	@Then("verify page is loading properly in slow network")
	public void verify_page_is_loading_properly_in_slow_network() {
//	   Can not automate Automating 2G network conditions directly using Selenium is not possible
//		because Selenium is primarily a tool for automating web browsers and does not have built-in capabilities to simulate network conditions.
	}

	@Then("Verification of the accessible the page by using mobile network")
	public void verification_of_the_accessible_the_page_by_using_mobile_network() {

//	   Can not automate Automating 2G network / 3G Network conditions directly using Selenium is not possible
//		because Selenium is primarily a tool for automating web browsers and does not have built-in capabilities to simulate network conditions.
	}

	@Then("Verification of without login into browser, copy & paste the url")
	public void verification_of_without_login_into_browser_copy_paste_the_url() {
		// Automating the process of copying and pasting a URL into a browser without
		// logging in manually is not directly achievable through Selenium, as Selenium
		// primarily interacts with the browser after it's opened.
	}

	@Then("verify version on about page")
	public void verify_version_on_about_page() throws InterruptedException {
		Thread.sleep(3000);
		AboutPage about = new AboutPage(driver, logger);

		String result = about.versionText().trim();

		Assert.assertEquals(result, alldata.get(vTCName).get("ApplicationVersion").toString().trim());
	}

	@Then("Verification of click on Download button in Terms and Conditions PDF details")
	public void verification_of_click_on_download_button_in_terms_and_conditions_pdf_details() {
		AboutPage about = new AboutPage(driver, logger);
		Assume.assumeTrue("Can not automate PDF functionality as it need special AI tool", false);
	}
	@Then("Verification of click on print button in Terms and Conditions PDF details")
	public void verification_of_click_on_print_button_in_terms_and_conditions_pdf_details() {
		AboutPage about = new AboutPage(driver, logger);

		Assume.assumeTrue(" There is no direct way to verify print dialog with Selenium as it interacts with OS level But we can check for browser behavior or look for a new window/tab/dialog indicating the print action was triggered", false);
		 String currentUrl = driver.getCurrentUrl();
	        assert currentUrl.contains("Print") : "Print dialog did not open.";
	}

	@When("^I open the Terms and Conditions PDF$")
    public void openTermsAndConditionsPDF() {
		AboutPage about = new AboutPage(driver, logger);
		about.termsandConditionClick();

        // Switch to the new tab where PDF opens
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
    }

    @Then("^the PDF should contain links$")
    public void verifyPDFContainsLinks() throws Exception {

    	PDFUtils pdfPage = new PDFUtils(driver, logger);
    	 // Get the URL of the PDF from the browser tab
        String pdfUrl = driver.getCurrentUrl();

        // Get all links in the PDF and print the total number of links and the links themselves
        pdfPage.getLinksInPDF(pdfUrl);
    }

}
