package com.cdm.Stepdefinations;

import com.cdm.pages.ReportsPage;

import org.junit.Assert;
import org.junit.Assume;

import com.cdm.pages.CalenderPage;

import io.cucumber.java.en.Then;

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
	@Then("verify switching between inputs fields using TAB for reports")
	public void verify_switching_between_inputs_fields_using_tab_for_reports() {
		ReportsPage report = new ReportsPage(driver, logger);
		Assume.assumeTrue("Input field not found on reports page", false);
	}

	@Then("Verification to check alignment for the download button")
	public void verification_to_check_alignment_for_the_download_button() {
		ReportsPage report = new ReportsPage(driver, logger);
		Assume.assumeTrue("Resolution would be differnet on different screen", false);
	}



	@Then("check visualisation look of calender pop up")
	public void check_visualisation_look_of_calender_pop_up() {
		ReportsPage report = new ReportsPage(driver, logger);
		Assume.assumeTrue(
				"Selenium meant to be designed to automate browser and functional testing , Look and feel can not be automate through selenium ",
				false);
	}
	@Then("check tool tip text visibilty for Start Date text field")
	public void check_tool_tip_text_visibilty_for_start_date_text_field() {
		ReportsPage report = new ReportsPage(driver, logger);
		Assert.assertEquals("Tooltip for start date field", "Start Date", report.get_Text_ToolTipforStartDate());
	}
	@Then("verify all the input text field")
	public void verify_all_the_input_text_field() {
		ReportsPage report = new ReportsPage(driver, logger);
		Assume.assumeTrue("No input field under report section . Invalid Test Case ", false);
	}

	
	@Then("check pagination item per page")
	public void check_pagination_item_per_page() {
		ReportsPage report = new ReportsPage(driver, logger);
		Assume.assumeTrue(
				"No pagination entry on the page of report , functionality does not exist",
				false);
	}
	
	@Then("check tool tip text visibilty for End Date text field")
	public void check_tool_tip_text_visibilty_for_end_date_text_field() {
		ReportsPage report = new ReportsPage(driver, logger);
		Assert.assertEquals("Tooltip for end date field", "End Date", report.get_Text_ToolTipforEndDate());
	}


	@Then("check maximize and minimise the screen")
	public void check_maimise_and_minimise_the_screen() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.minimiseWindow();
		report.maximiseWindow();
	}

	@Then("verify to check the labels of input text field")
	public void verify_to_check_the_labels_of_input_text_field() {
		ReportsPage report = new ReportsPage(driver, logger);
		Assume.assumeTrue("No input field under report section . Invalid manual Test Cases", false);
	}

	@Then("Open Networks tab and observe the UI carefully.")
	public void open_networks_tab_and_observe_the_ui_carefully() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.networkGreen();
		report.networkOrange();
	}

	@Then("Without selecting Audit Report, Start Date & End Date simply hit Download CTA and observe the error message")
	public void without_selecting_audit_report_start_date_end_date_simply_hit_download_cta_and_observe_the_error_message() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.downloadButton();

		Assert.assertEquals("Mandatory field - required !", report.verifyValidationMessageforReports());
	}

	@Then("verify page with resize option for the Reports page")
	public void verify_page_with_resize_option_for_the_reports_page() {
		ReportsPage report = new ReportsPage(driver, logger);
		report.setdimension(300, 200);

	}
	@Then("verify loading time to load page")
	public void verify_loading_time_to_load_page() {
		ReportsPage report = new ReportsPage(driver, logger);
		Assume.assumeTrue("Load time we can not measure through automation, becuase it is depends on various factor like bandwidth, network connectivity", false);
	}


	@Then("Select Audit Report from the Report Type dropdown.")
	public void select_audit_report_from_the_report_type_dropdown() throws InterruptedException {
		ReportsPage report = new ReportsPage(driver, logger);
		report.reportTypeDropdown(alldata.get(vTCName).get("ReportType").toString());
	}

	@Then("Select same date in the Start Date & End Date")
	public void select_same_date_in_the_start_date_end_date() throws InterruptedException {
		ReportsPage report = new ReportsPage(driver, logger);
		report.calicon();
		Thread.sleep(2000);

		CalenderPage cp = new CalenderPage(driver, logger);
		String year = alldata.get(vTCName).get("ReportChooseStartYear").toString();
		String month = alldata.get(vTCName).get("ReportChooseStartMonth").toString();
		String day = alldata.get(vTCName).get("ReportChooseStartDay").toString();
		cp.SelectDay(year, month, day);
		Thread.sleep(4000);

		report.caliconEndDate();
		Thread.sleep(2000);
		String yearEndDate = alldata.get(vTCName).get("ReportChooseEndYear").toString();
		String monthEnd = alldata.get(vTCName).get("ReportChooseEndMonth").toString();
		String dayEnd = alldata.get(vTCName).get("ReportChooseEndDay").toString();
		cp.SelectDay(yearEndDate, monthEnd, dayEnd);
		Thread.sleep(4000);

	}

	@Then("Click on download button")
	public void click_on_download_button() throws InterruptedException {
		ReportsPage report = new ReportsPage(driver, logger);
		Thread.sleep(4000);
		report.downloadButton();
		Thread.sleep(4000);

	}

}
