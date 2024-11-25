package com.cdm.StepDefinations;

import java.util.List;

import org.junit.Assert;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.ReportsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReportSteps extends BaseTest {

	@Then("Click on Report module from side menu bar")
	public void click_on_deployments_module_from_side_menu_bar() {
		ReportsPage report = new ReportsPage(driver, logger);

		report.reportsTab();
	}

	@Then("Minimise the screen and observe the UI carefully.")
	public void minimise_the_screen_and_observe_the_ui_carefully() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.minimiseWindow();
	}

	@Then("Maximize the screen")
	public void maximise_the_screen() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.maximiseWindow();

	}

	@Then("verify to check tool tip text visibilty for Start Date text field")
	public void verify_to_check_tool_tip_text_visibilty_for_start_date_text_field() {
		ReportsPage report = new ReportsPage(driver, logger);
		Assert.assertEquals("Tooltip for start date field", "Start Date", report.get_Text_ToolTipforStartDate());
	}

	@Then("verify to check tool tip text visibilty for End Date text field")
	public void verify_to_check_tool_tip_text_visibilty_for_end_date_text_field() {
		ReportsPage report = new ReportsPage(driver, logger);
		Assert.assertEquals("Tooltip for end date field", "End Date", report.get_Text_ToolTipforEndDate());
	}

	@Then("verify to check the labels of input text field")
	public void verify_to_check_the_labels_of_input_text_field() throws InterruptedException {

		ReportsPage report = new ReportsPage(driver, logger);
		Assert.assertTrue("Report Type Label found", report.getTextReportTypeLabel().contains("*"));
		report.outerlayerclick();
		Thread.sleep(2000);

		Assert.assertTrue("Start Date Label found", report.getTextStartDate().contains("*"));

		Thread.sleep(2000);
		Assert.assertTrue("End Date Label found", report.getTextReportEndDate().contains("*"));

	}

	@Then("check maximize and minimise the screen")
	public void check_maimise_and_minimise_the_screen() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.minimiseWindow();
		report.maximiseWindow();
	}

	@Then("verify Without selecting Audit Report, Start Date & End Date simply hit Download CTA and observe the error message")
	public void without_selecting_audit_report_start_date_end_date_simply_hit_download_cta_and_observe_the_error_message() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.downloadButton();

		Assert.assertEquals("Mandatory field - required !", report.verifyValidationMessageforReports());
	}

	@When("User selects {string} from the dropdown")
	public void user_selects_from_the_dropdown(String string) throws InterruptedException {
		ReportsPage report = new ReportsPage(driver, logger);
		report.reportTypeDropdown(alldata.get(vTCName).get("ReportType").toString());
	}

	@When("User selects a {string} from the date picker")
	public void user_selects_a_from_the_date_picker(String string) throws InterruptedException {
		ReportsPage report = new ReportsPage(driver, logger);
		report.calicon();
		Thread.sleep(2000);

		CalenderPage cp = new CalenderPage(driver, logger);
		String year = alldata.get(vTCName).get("ReportChooseStartYear").toString();
		String month = alldata.get(vTCName).get("ReportChooseStartMonth").toString();
		String day = alldata.get(vTCName).get("ReportChooseStartDay").toString();
		cp.SelectDay(year, month, day);
		Thread.sleep(4000);
	}

	@When("Verify {string} is selected in the dropdown")
	public void verify_is_selected_in_the_dropdown(String expectedReportType) {
		ReportsPage report = new ReportsPage(driver, logger);
		boolean isSelected = report.isReportTypeSelected(expectedReportType);
		Assert.assertEquals("The selected report type is not as expected!", isSelected);
	}

	@When("User selects an {string} from the date picker")
	public void user_selects_an_from_the_date_picker(String string) throws InterruptedException {

		ReportsPage report = new ReportsPage(driver, logger);
		report.caliconEndDate();
		Thread.sleep(2000);
		CalenderPage cp = new CalenderPage(driver, logger);
		String yearEndDate = alldata.get(vTCName).get("ReportChooseEndYear").toString();
		String monthEnd = alldata.get(vTCName).get("ReportChooseEndMonth").toString();
		String dayEnd = alldata.get(vTCName).get("ReportChooseEndDay").toString();
		cp.SelectDay(yearEndDate, monthEnd, dayEnd);
		Thread.sleep(4000);
	}

	@When("User clicks on the {string} button")
	public void user_clicks_on_the_button(String string) throws InterruptedException {
		ReportsPage report = new ReportsPage(driver, logger);
		Thread.sleep(4000);
		report.downloadButton();
		Thread.sleep(4000);
	}

	@Then("verify report should be downloaded successfully")
	public void verify_report_should_be_downloaded_successfully() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.ToasterMessageShouldBeDisplayed(alldata.get(vTCName).get("toastermessage").toString());

	}

}
