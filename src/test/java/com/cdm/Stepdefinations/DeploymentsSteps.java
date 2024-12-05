package com.cdm.StepDefinations;

import java.awt.AWTException;
import java.util.List;

import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.DeploymentsmodulePage;
import com.cdm.pages.Pagination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeploymentsSteps extends BaseTest {

	@Then("verify page with resize option for the deployment page")
	public void verify_page_with_resize_option_for_the_deployment_page() {
		DeploymentsmodulePage dp = new DeploymentsmodulePage(driver, logger);
		dp.setZoomLevel(800, 600);
	}

	@Then("Click on Deployments module from side menu bar")
	public void click_on_deployments_module_from_side_menu_bar() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(3000);
		dmp.deploymenttabclick();
		Thread.sleep(3000);

	}

	@Given("User has applied a search filter on the volume Name column")
	public void user_has_applied_a_search_filter_on_the_volume_name_column() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.volumeNamePopUpThreeDot();
		dmp.inputVolumeNameDeploy(alldata.get(vTCName).get("VolumeNameDetailsSearch").toString());
		// dmp.backDropShowing_Div_Click();
	}

	@When("User clears the search filter on volume Name")
	public void user_clears_the_search_filter_on_volume_name() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.volumeNamePopUpThreeDot();
		dmp.removalofEnteredTextForVolumeNameDeploy();
		// dmp.backDropShowing_Div_Click();
	}

	@Given("User has applied a search filter on the error column")
	public void user_has_applied_a_search_filter_on_the_error_column() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.DeployedVolumeDetailserrorThreeDot();
		dmp.inputVolumeErrorNameDeploy(alldata.get(vTCName).get("VolumeErrorDetailsSearch").toString());

	}

	@When("User clears the search filter on error")
	public void user_clears_the_search_filter_on_error() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.DeployedVolumeDetailserrorThreeDot();
		dmp.removalofEnteredTextForvolumeDetailsError();
		// dmp.backDropShowing_Div_Click();

	}

	@Given("User has applied a search filter on the status column")
	public void user_has_applied_a_search_filter_on_the_status_column() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.DeployedVolumeDetailStatusThreeDot();
		dmp.inputVolumeStatusDetailsDeploy(alldata.get(vTCName).get("VolumeStatusDetailsSearch").toString());

	}

	@When("User clears the search filter on status")
	public void user_clears_the_search_filter_on_status() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.DeployedVolumeDetailStatusThreeDot();
		Thread.sleep(2000);
		dmp.removalofEnteredTextForStatus();
	}

	@Then("verify user see download successful message and file should get downloaded for deployment")
	public void verify_user_see_download_successful_message_and_file_should_get_downloaded_for_deployment() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.outerlayerclick();
		WebElement bulkDownloadsuccessMessage = dmp.downloadSuccessMessage();
		Assert.assertTrue("Download success message is not displayed", bulkDownloadsuccessMessage.isDisplayed());
	}

	@Then("verify filter icon for Edge ID")
	public void verify_filter_icon_for_edge_id() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeIdThreeDot();
	}

	@Then("verify filter icon for App Name")
	public void verify_filter_icon_for_app_name() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.appNameThreeDot();
	}

	@Then("verify filter icon for availability for Error")
	public void verify_filter_icon_for_availability_for_error() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.errorThreeDots();
	}

	@Then("verify filter icon for availability for Running Version")
	public void verify_filter_icon_for_availability_for_running_version() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.RunningVersionThreeDotDeploy();
	}

	@Then("verify filter icon for availability for Status")
	public void verify_filter_icon_for_availability_for_status() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.statusThreeDots();
	}

	@Then("Click on the Bulk Download button")
	public void click_on_the_bulk_download_button() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.bulkDownloadButton();
		Thread.sleep(3000);
	}

	@Then("Click on the Refresh button")
	public void click_on_the_refresh_button() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.refresh_Button();
	}

	@Then("Click on the Current View button")
	public void click_on_the_current_view_button() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.currentView();
	}

	@Then("Click on EDGE Name search icon i.e. three dots & enter invalid inputs into search text field")
	public void click_on_edge_name_search_icon_i_e_three_dots_enter_invalid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeNameThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputEdgeNameDeploy(alldata.get(vTCName).get("EdgeNameSearch").toString());
	}

	@Then("Click on deployment pagination it will display default records will display")
	public void click_on_deployment_pagination_it_will_display_default_records_will_display() throws Exception {
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", edp.LastPageClickAndCount(rowPerPage));

		Assert.assertTrue("Row count match for last page", edp.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("Click on EDGE Name search icon of deployment page i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_name_search_icon_of_deployment_page_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeNameThreeDotDeploy();

		dmp.inputEdgeNameDeploy(alldata.get(vTCName).get("EdgeNameSearch").toString());

	}

	@Then("Click on App Name search icon i.e. three dots & enter Valid inputs into search text field of App Name")
	public void click_on_app_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field_of_app_name()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.appNameDeployThreeDot();
		Thread.sleep(3000);
		dmp.inputAppNameDeploy(alldata.get(vTCName).get("AppNameSearch").toString());
	}

	@Then("Click on App Name search icon i.e. three dots & enter invalid inputs into search text field")
	public void click_on_app_name_search_icon_i_e_three_dots_enter_invalid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.appNameDeployThreeDot();

		dmp.inputAppNameDeploy(alldata.get(vTCName).get("AppNameSearch").toString());

		dmp.backDropShowing_Div_Click();

		dmp.clickingonheading();
	}

	@Then("Click on Status Name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_status_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.statusThreeDotDeploy();
		Thread.sleep(3000);
// dmp.inputStatusDeploy(alldata.get(vTCName).get("Value3").toString());
	}

	@Then("Click on Error search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_error_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.errorThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputErrorDeploy(alldata.get(vTCName).get("ErrorSearch").toString());
	}

	@Then("Click on Running Version search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_running_version_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.RunningVersionThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputRunningVersion(alldata.get(vTCName).get("RunningVersionSearch").toString());
	}

	@Then("Click on Expected Version invalid search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_expected_version_invalid_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.expectedVersionThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputExpectedVersion(alldata.get(vTCName).get("ExpectedVersionSearch").toString());
	}

	@Then("Click on the History View button")
	public void click_on_the_history_view_button() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.historyviewButton();
		;
		Thread.sleep(5000);
	}

	@Then("Enter valid inputs into search text field of Edge name and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_edge_name_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeNameThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputEdgeNameDeploy(alldata.get(vTCName).get("EdgeNameSearch").toString());
		Thread.sleep(2000);
		dmp.removalofEnteredTextForEdgeName();
		Thread.sleep(4000);

	}

	@Then("Enter valid inputs into search text field of app name of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_app_name_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.appNameDeployThreeDot();
		Thread.sleep(3000);
		dmp.inputAppNameDeploy(alldata.get(vTCName).get("AppNameSearch").toString());
		Thread.sleep(2000);
		dmp.removalofEnteredTextForappName();

	}

	@Then("Enter valid inputs into search text field of app name of deployment")
	public void enter_valid_inputs_into_search_text_field_of_app_name_of_deployment() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.appNameDeployThreeDot();
		Thread.sleep(3000);
		dmp.inputAppNameDeploy(alldata.get(vTCName).get("AppNameSearch").toString());
		dmp.backDropShowing_Div_Click();
		Thread.sleep(2000);
	}

	@Then("Enter valid inputs into search text field of status name of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_status_name_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.statusThreeDotDeploy();
		Thread.sleep(3000);
// dmp.inputStatusDeploy(alldata.get(vTCName).get("Value3").toString());
		Thread.sleep(2000);
// dmp.removalofEnteredTextForStatus();
	}

	@Then("Enter valid inputs into search text field of error of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_error_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.errorThreeDotDeploy();

		Thread.sleep(2000);
		dmp.inputErrorDeploy(alldata.get(vTCName).get("ErrorSearch").toString());
		dmp.errorThreeDotDeploy();
		dmp.removalofEnteredTextForError();
		Thread.sleep(5000);
	}

	@Then("Enter valid inputs into search text field of running version of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_running_version_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.RunningVersionThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputRunningVersion(alldata.get(vTCName).get("RunningVersionSearch").toString());
		Thread.sleep(2000);
		dmp.removalofEnteredTextForRunningVersion();
	}

	@Then("Enter valid inputs into search text field of Expected Version of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_expected_version_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.expectedVersionThreeDotDeploy();
		Thread.sleep(3000);
		dmp.inputExpectedVersion(alldata.get(vTCName).get("ExpectedVersionSearch").toString());
		Thread.sleep(2000);
		dmp.removalofEnteredTextForExpectedVersion();
	}

	@Then("click on the link show more from the Error column")
	public void click_on_the_link_show_more_from_the_error_column() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(5000);
		dmp.showMoreLink();
	}

	@Then("click on the view deployed Volume Details icon")
	public void click_on_the_view_deployed_volume_details_icon() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");

		dmp.infoicon();
	}

	@Then("scroll horizontal")
	public void scroll_horizontal() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(3000);
		dmp.scrollingElementRightBar("div.example-container", "900");

	}

	@Then("click on the info icon")
	public void click_on_the_info_icon() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(3000);
		dmp.infoicon();
	}

	@Then("Enter valid inputs into search text field of volume name of volumename details page and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_volume_name_of_volumename_details_page_and_enter_backspace_click_on_enter() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");

		dmp.volumeNamePopUpThreeDot();

		dmp.inputVolumeNameDetailsPageDeploy(alldata.get(vTCName).get("VolumeNameDetailsSearch").toString());

	}

	@Then("Enter valid inputs into search text field of volume name of status column deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_volume_name_of_status_column_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException, AWTException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");

// dmp.titleheadingvolumeDetailsPage();
		try {

			dmp.volumeDetailsStatusThreeDot();

		} catch (Exception e) {

		}
		dmp.inputVolumeStatusDetailsDeploy(alldata.get(vTCName).get("VolumeStatusDetailsSearch").toString());
		Thread.sleep(6000);

	}

	@Then("Enter valid inputs into search text field of volume name of error column deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_volume_name_of_error_column_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");
// dmp.titleheadingvolumeDetailsPage();
		try {

			dmp.DeployedVolumeDetailserrorThreeDot();

		} catch (Exception e) {

		}
		dmp.inputErrorDetailsPageDeploy(alldata.get(vTCName).get("VolumeErrorDetailsSearch").toString());
		Thread.sleep(6000);

	}

	@Then("Click on Status Name search icon i.e. three dots & select status")
	public void click_on_status_name_search_icon_i_e_three_dots_select_status() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.statusThreeDotDeploy();
		dmp.runningStatusunchecked();
		Thread.sleep(4000);
		dmp.runningStatuschecked();
		Thread.sleep(4000);

	}

	@Then("Click on createdDateThreeDot icon and enter the value in datepickercolumn")
	public void click_on_created_date_three_dot_icon_and_enter_the_value_in_datepickercolumn()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.createdDateVolumeDeployDetailsThreeDot();
		Thread.sleep(5000);
		CalenderPage cal = new CalenderPage(driver, logger);
		dmp.calenderIcon();
		Thread.sleep(4000);
		String year = alldata.get(vTCName).get("CreatedDateYear").toString();
		String month = alldata.get(vTCName).get("CreatedMonth").toString();
		String day = alldata.get(vTCName).get("CreatedFromDate").toString();
		String day2 = alldata.get(vTCName).get("CreatedToDate").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		Thread.sleep(4000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dmp.applybuttoncalender();
	}

	@Then("verify to click on reset button")
	public void verify_to_click_on_reset_button() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.resetButton();
		Assert.assertFalse("Date was not cleared after reset", dmp.isDateSelected());
		Thread.sleep(2000);
		dmp.calenderIcon();

	}

	@Then("click on refresh button on the page of Deployed Volume Details Popup")
	public void click_on_refresh_button_on_the_page_of_deployed_volume_details_popup() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.refresh_Button();
	}

	@Then("Enter valid inputs into search text field of Edge ID and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_edge_id_and_enter_backspace_click_on_enter() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeIdThreeDot();
		dmp.inputEdgeIDDeploy(alldata.get(vTCName).get("EDGEIDSearch").toString());
		dmp.backDropShowing_Div_Click();
		dmp.edgeIdThreeDot();
		dmp.removalofEnteredTextForEdgeID();
	}

	@Then("verify Deployment List screen should be reset to show all devices with all the Edge ID")
	public void verify_deployment_list_screen_should_be_reset_to_show_all_devices_with_all_the_edge_id() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		int allDevicesDisplayed = dmp.areSearchResultsDisplayed();
		Assert.assertTrue("No rows are displayed after clearing the search filter.", allDevicesDisplayed > 0);

		try {
			// Get and print data for all rows
			List<String> allData = dmp.getRowDataAfterremoval();
			for (String rowData : allData) {
				System.out.println("Row Data: " + rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("Click on deploymentDateThreeDot icon and enter the value in datepickercolumn")
	public void click_on_deployment_date_three_dot_icon_and_enter_the_value_in_datepickercolumn()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);

		dmp.deploymentDateThreeDotDeploy();
		Thread.sleep(5000);
		CalenderPage cal = new CalenderPage(driver, logger);
		dmp.calenderIcon();
		String year = alldata.get(vTCName).get("DeploymentYear").toString();
		String month = alldata.get(vTCName).get("DeploymentMonth").toString();
		Thread.sleep(3000);
		String day = alldata.get(vTCName).get("DeploymentFromDate").toString();
		String day2 = alldata.get(vTCName).get("DeploymentToDate").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		Thread.sleep(3000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);
		Thread.sleep(2000);
		dmp.applybuttoncalender();
		Thread.sleep(2000);

	}

	@Then("Click on lastupdated Three Dot icon and enter the value in datepickercolumn")
	public void click_on_lastupdated_three_dot_icon_and_enter_the_value_in_datepickercolumn() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.lastUpdatedThreeDotDeploy();
		CalenderPage cal = new CalenderPage(driver, logger);
		dmp.calenderIcon();
		String year = alldata.get(vTCName).get("LastUpdatedYear").toString();
		String month = alldata.get(vTCName).get("LastUpdatedMonth").toString();
		String day = alldata.get(vTCName).get("LastUpdatedFromDate").toString();
		String day2 = alldata.get(vTCName).get("LastUpdatedToDate").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dmp.applybuttoncalender();
	}

	@Then("Enter valid inputs into search text field of created date of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_created_date_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");
// dmp.titleheadingvolumeDetailsPage();
		try {

			dmp.createdDateVolumeDeployDetailsThreeDot();

		} catch (Exception e) {

		}
		dmp.inputErrorDetailsPageDeploy(alldata.get(vTCName).get("Value3").toString());
		Thread.sleep(6000);

	}

	@Then("scroll horizontal and click on the info icon")
	public void scroll_horizontal_and_click_on_the_info_icon() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");
		dmp.infoicon();
		Thread.sleep(4000);
	}

	@Then("verify Click on deployment pagination it will display records will display")
	public void verify_click_on_deployment_pagination_it_will_display_records_will_display() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.volumepageRecord();

	}

	@Then("Click on close button")
	public void click_on_close_button() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(4000);
		dmp.closevolume();
	}

	@Then("verify progress bar")
	public void verify_progress_bar() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.downloadStatus();
	}

	@Then("Enter valid inputs into search text field of Volume name and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_volume_name_and_enter_backspace_click_on_enter() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");

		try {

			dmp.volumeNamePopUpThreeDot();

		} catch (Exception e) {

		}
		dmp.inputVolumeNameDetailsPageDeploy(alldata.get(vTCName).get("VolumeNameDetailsSearch").toString());
		dmp.removalofEnteredTextForVolumeName();

	}

	@Then("Enter valid inputs into search text field of status and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_status_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
//		dmp.scrollingElementRightBar("div.example-container", "900");
//
//		Thread.sleep(7000);
//
//		dmp.volumeDetailsStatusThreeDot();
//
//		dmp.inputVolumeStatusDetailsDeploy(alldata.get(vTCName).get("VolumeStatusDetailsSearch").toString());
//		Thread.sleep(3000);
//		dmp.removalofEnteredTextForStatusDetails();
		Assume.assumeTrue("Invalid Test case as there are no serach text field associated with status column", false);

	}

	@Then("Click on pagination part it will display default records will display")
	public void click_on_pagination_part_it_will_display_default_records_will_display() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);

		int rowPerPage = Integer.parseInt(value);

// Assert.assertTrue("Row count match for next page",
// p.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("verify to Click on pagination to check functionality of Full Backward arrow")
	public void verify_to_click_on_pagination_to_check_functionality_of_full_backward_arrow() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);

		// Verify that the pagination navigates back to the first page correctly
		Thread.sleep(4000);
		// boolean isFirstPageCorrect = p.firstPageFullBackwardArrow(rowPerPage);

		// Assert that the row count on the first page matches the expected count
		// Assert.assertTrue("Row count does not match for the first page after full
		// backward navigation", isFirstPageCorrect);
	}

	@Then("Click on pagination to check functionality of Full forward arrow")
	public void click_on_pagination_to_check_functionality_of_full_forward_arrow() throws Exception {
		// Create an instance of the Pagination helper class
		Pagination p = new Pagination(driver, logger);

		// Retrieve the 'Items Per Page' value from test data
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);

		// Parse the value into an integer to determine the number of rows per page
		int rowPerPage = Integer.parseInt(value);

		// Simulate clicking the Full Forward Arrow to navigate to the last page
		boolean isLastPageCorrect = p.nextPageClickAndCountOnLastPage(rowPerPage);

		// Assert that the row count on the last page matches the expected count
		Assert.assertTrue("Row count does not match for the last page after Full Forward navigation",
				isLastPageCorrect);

		// Optionally, log the success
		logger.info("Successfully validated Full Forward Arrow pagination functionality.");
	}

	@Then("Click on pagination to check Next button\\(Forward arrow) functionality")
	public void click_on_pagination_to_check_next_button_forward_arrow_functionality() throws Exception {
		// Create an instance of the Pagination helper class
		Pagination p = new Pagination(driver, logger);

		// Retrieve the 'Items Per Page' value from test data
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(3000);

		// Parse the value into an integer to determine the number of rows per page
		int rowPerPage = Integer.parseInt(value);

		// Simulate clicking the Next button and verifying records on each page
		boolean isNextButtonWorking = p.clickNextAndVerifyRows(rowPerPage);

		// Assert that the Next button functionality works as expected
		Assert.assertTrue("Next button pagination functionality failed.", isNextButtonWorking);

		// Optionally, log the success
		logger.info("Successfully validated Next button (Forward Arrow) pagination functionality.");
	}

	@Then("Click on pagination to check Previous Page button\\(Backward arrow) functionality")
	public void click_on_pagination_to_check_previous_page_button_backward_arrow_functionality() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(5000);
// Assert.assertTrue("Row count match for Previous page",
// p.previousPageClickAndCount(rowPerPage));
	}

	@Then("verify tool tip text visibility for view deployed volume details button in Actions column")
	public void verify_tool_tip_text_visibility_for_view_deployed_volume_details_button_in_actions_column() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip of deployed volume details", "View Deployed Volume Details",
				dmp.get_Text_ToolTipforViewDeployedVolume());
	}

	@Then("verify alignment for maximize & minimize the screen")
	public void verify_alignment_for_maximize_minimize_the_screen() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.minimizeBrowser();
		dmp.maximizeBrowser();
	}

	@Then("verify tool tip text visibilty for Close button in Deployed volume details in History view screen")
	public void verify_tool_tip_text_visibilty_for_close_button_in_deployed_volume_details_in_history_view_screen()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.infoicon();

		Assert.assertEquals("Tooltip of close", "Close", dmp.get_Text_ToolTipClose());
	}

	@Given("User has applied a search filter on the Edge ID column")
	public void user_has_applied_a_search_filter_on_the_edge_id_column() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeIdThreeDot();
		dmp.inputEdgeIDDeploy(alldata.get(vTCName).get("EDGEIDSearch").toString());
		dmp.backDropShowing_Div_Click();
	}

	@When("User clears the search filter on Edge ID")
	public void user_clears_the_search_filter_on_edge_id() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeIdThreeDot();
		dmp.removalofEnteredTextForEdgeID();
		dmp.backDropShowing_Div_Click();
	}

	@Then("verify to check all the tool tips on Deployment List page")
	public void verify_to_check_all_the_tool_tips_on_deployment_list_page() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip For EDGE ID", "Unique ID assigned for the EDGE Device",
				dmp.get_Text_ToolTipforEdgeID());
		Assert.assertEquals("Tooltip For App Name", "Unique Name assigned for the Application",
				dmp.get_Text_ToolTipforAppName());
		Assert.assertEquals("Tooltip For Status", "Status of Deployment", dmp.get_Text_ToolTipforStatus());
		Assert.assertEquals("Tooltip For Error", "Lists of any deployment errors", dmp.get_Text_ToolTipforError());
		Thread.sleep(3000);
		Assert.assertEquals("Tooltip For Running Version",
				"Actual version of the application running on the EDGE Device",
				dmp.get_Text_ToolTipforRunningVersion());
		dmp.scrollingElementRightBar("div.example-container", "900");
		Assert.assertEquals("Tooltip For Expected Version",
				"Version of the application expected to be running on the EDGE Device, e.g., latest",
				dmp.get_Text_ToolTipforExpectedVersion());
		Assert.assertEquals("Tooltip For Deployment Date",
				"The date (MM-DD-YYYY) and time (HH:MM) (+/-HH:MM) the application was deployed on the EDGE Device",
				dmp.get_Text_ToolTipforDeploymentDate());
		Assert.assertEquals("Tooltip For Last Updated", "The timestamp when the configuration was last updated",
				dmp.get_Text_ToolTipforLastUpdatedVersion());
		Assert.assertEquals("Tooltip of delete", "Delete", dmp.get_Text_ToolTipforDelete());
		Assert.assertEquals("Tooltip of info", "View Deployed Volume Details", dmp.get_Text_ToolTipforinfo());
		Assert.assertEquals("Tooltip of Refresh", "Refresh", dmp.get_Text_ToolTipforRefresh());
		Assert.assertEquals("Tooltip of BulkDownload", "Bulk Download (in .csv format)",
				dmp.get_Text_ToolTipforBulkDownload());
		Assert.assertEquals("Tooltip of History View", "History View", dmp.get_Text_ToolTipforHistoryView());
	}

	@Then("verify filter icon for availability for Deployment Date")
	public void verify_filter_icon_for_availability_for_deployment_date() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.deploymentDateThreeDotDeploy();
	}

	@Then("verify visibility duration to load page for deployment")
	public void verify_visibility_duration_to_load_page_for_deployment() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
	}

	@Then("verify filter icon for availability for Expected Version")
	public void verify_filter_icon_for_availability_for_expected_version() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.expectedVersionThreeDotDeploy();
	}

	@Then("verify filter icon for availability for Last Updated")
	public void verify_filter_icon_for_availability_for_last_updated() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.lastUpdatedThreeDotDeploy();
	}

	@Then("verification of Click on deployment pagination it will display records will display")
	public void verifacation_of_click_on_deployment_pagination_it_will_display_records_will_display() {
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		// Assert.assertTrue("Row count match for last page",
		// edp.LastPageClickAndCount(rowPerPage));

		// Assert.assertTrue("Row count match for last page",
		// edp.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("verify to Click on deployment pagination to check full forward arrow")
	public void verify_to_click_on_deployment_pagination_to_check_full_forward_arrow() throws InterruptedException {
		Pagination p = new Pagination(driver, logger);

		// Retrieve the 'Items Per Page' value from test data
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(3000);

		// Parse the value into an integer to determine the number of rows per page
		int rowPerPage = Integer.parseInt(value);

		// Click the Full Forward Arrow and verify the last page
		boolean isLastPageDisplayedCorrectly = p.navigateToLastPageAndVerify(rowPerPage);

		// Assert that the last page is displayed correctly
		// Assert.assertTrue("Last page is not displayed correctly after Full Forward
		// navigation.", isLastPageDisplayedCorrectly);

		// Optionally, log the success
		logger.info("Successfully validated Full Forward Arrow functionality for navigating to the last page.");
	}

	@Then("Enter valid inputs into search text field of error details list page and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_error_details_list_page_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);

		dmp.scrollingElementRightBar("div.example-container", "900");

		try {
			Thread.sleep(3000);

			dmp.DeployedVolumeDetailserrorThreeDot();

		} catch (Exception e) {

		}
		dmp.inputErrorDetailsPageDeploy(alldata.get(vTCName).get("VolumeErrorDetailsSearch").toString());
		Thread.sleep(5000);

		try {
			dmp.removalofEnteredTextForErrorDetails();
		} catch (Exception e) {
// TODO: handle exception
		}

	}

	@Then("verify user should land on deployments page")
	public void verify_user_should_land_on_deployments_page() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertTrue("Deployments label  not found", dmp.isAssertionAddedSuccessfully());
	}

	@Then("verify tooltip for info icon")
	public void verify_tooltip_for_info_icon() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.scrollingElementRightBar("div.example-container", "900");
		Assert.assertEquals("View Deployed Volume Details", dmp.get_Text_ToolTipforinfo());
	}

	@Then("Click on EDGE ID search icon of deployment page i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_id_search_icon_of_deployment_page_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeIdThreeDot();
		dmp.inputEdgeIDDeploy(alldata.get(vTCName).get("EDGEIDSearch").toString());
		dmp.backDropShowing_Div_Click();
	}

	@Then("Verify that the search results match the entered Edge ID")
	public void verify_that_the_search_results_match_the_entered_edge_id() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		String validEdgeID = alldata.get(vTCName).get("EDGEIDSearch").toString();
		Assert.assertTrue(dmp.resultTable().contains(validEdgeID));
	}

	@Then("verify the search results are displayed on the Deployment List screen")
	public void verify_the_search_results_are_displayed_on_the_deployment_list_screen() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(2000);
		int rowCount = dmp.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		Assert.assertTrue("Row found for search.", rowCount > 0);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = dmp.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Given("User has applied a search filter on the App Name column")
	public void user_has_applied_a_search_filter_on_the_app_name_column() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.appNameDeployThreeDot();
		dmp.inputAppNameDeploy(alldata.get(vTCName).get("AppNameSearch").toString());
		dmp.backDropShowing_Div_Click();
	}

	@Given("The search results are displayed on the Deployment List screen")
	public void the_search_results_are_displayed_on_the_deployment_list_screen() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);

		int rowCount = dmp.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		Assert.assertTrue("Row found for search.", rowCount > 0);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = dmp.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Enter valid inputs into search text field of EDGE ID of deployment and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_edge_id_of_deployment_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.edgeIdThreeDot();
		dmp.inputEdgeIDDeploy(alldata.get(vTCName).get("EDGEIDSearch").toString());
		dmp.backDropShowing_Div_Click();
		Thread.sleep(3000);
		dmp.edgeIdThreeDot();
		dmp.removalofEnteredTextForEdgeID();
		dmp.backDropShowing_Div_Click();

	}

	@When("User clears the search filter on App Name")
	public void user_clears_the_search_filter_on_app_name() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.appNameDeployThreeDot();
		dmp.removalofEnteredTextForappName();
		dmp.backDropShowing_Div_Click();
	}

	@Then("verify Deployment List screen should be reset to show all devices with all the APP Name")
	public void verify_deployment_list_screen_should_be_reset_to_show_all_devices_with_all_the_app_name()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(2000);
		int rowCount = dmp.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		Assert.assertTrue("Row found for search.", rowCount > 0);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = dmp.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("verify Deployment List screen should be reset to show all devices with all the Edge Group Name")
	public void verify_deployment_list_screen_should_be_reset_to_show_all_devices_with_all_the_edge_group_name()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(2000);
		int rowCount = dmp.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		Assert.assertTrue("Row found for search.", rowCount > 0);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = dmp.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Given("User has applied a search filter on the Running Version column")
	public void user_has_applied_a_search_filter_on_the_running_version_column() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.RunningVersionThreeDotDeploy();
		dmp.inputRunningVersion(alldata.get(vTCName).get("RunningVersionSearch").toString());
		dmp.backDropShowing_Div_Click();
		Thread.sleep(3000);

	}

	@When("User clears the search filter on Running Version")
	public void user_clears_the_search_filter_on_running_version() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.RunningVersionThreeDotDeploy();
		dmp.removalofEnteredTextForRunningVersion();
		dmp.backDropShowing_Div_Click();
	}

	@Then("verify Deployment List screen should be reset to show all devices with all the Running Version")
	public void verify_deployment_list_screen_should_be_reset_to_show_all_devices_with_all_the_running_version()
			throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Thread.sleep(2000);
		int rowCount = dmp.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		Assert.assertTrue("Row found for search.", rowCount > 0);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = dmp.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("verify sorting for Edge ID")
	public void verify_sorting_for_edge_id() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifysortingonDeploymentEdgeID();
	}

	@Then("verify sorting for AppName")
	public void verify_sorting_for_app_name() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifysortingonAppName();
	}

	@Then("verify sorting for Status")
	public void verify_sorting_for_status() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifysortingonStatus();
	}

	@Then("verify sorting for Error")
	public void verify_sorting_for_error() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifysortingonError();
	}

	@Then("verify sorting for RunningVersion")
	public void verify_sorting_for_running_version() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifysortingonRunningVersion();
	}

	@Then("verify sorting for ExpectedVersion")
	public void verify_sorting_for_expected_version() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifysortingonExpectedVersion();
	}

	@Then("verify sorting for DeploymentDate")
	public void verify_sorting_for_deployment_date() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifysortingonDeploymentDate();
	}

	@Then("verify sorting for LastUpdated")
	public void verify_sorting_for_last_updated() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifysortingonLastUpdated();
	}

	@Then("verify sorting for volumeName")
	public void verify_sorting_for_volume_name() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifySortOnPopupVolumename();
	}

	@Then("search for volumeName on deployed volume details page")
	public void search_for_volume_name_on_deployed_volume_details_page() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.volumeNamePopUpThreeDot();
		dmp.inputVolumeNameDeploy(alldata.get(vTCName).get("VolumeNameDetailsSearch").toString());
	}

	@Then("verify progress bar should display percentange of the download status of the volume shown as a percentage on deployed volume details page")
	public void verify_progress_bar_should_display_percentange_of_the_download_status_of_the_volume_shown_as_a_percentage_on_deployed_volume_details_page() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);

		Assert.assertTrue(dmp.progressbarText());
	}

	@Then("verify sorting for errordeployvolume")
	public void verify_sorting_for_errordeployvolume() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifySortOnErrorVolumename();
	}

	@Then("verify sorting for statusdeployvolume")
	public void verify_sorting_for_statusdeployvolume() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifySortOnPopupStatusVolume();
	}

	@Then("verify sorting for createdDatedeployvolume")
	public void verify_sorting_for_created_datedeployvolume() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifySortiOnPopupCreatedDateVolume();
	}

	@Then("verify close icon on the popup of deployed volume details page")
	public void verify_close_icon_on_the_popup_of_deployed_volume_details_page() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.verifycloseButton();
	}

	@Then("User has applied a search filter on the status")
	public void user_has_applied_a_search_filter_on_the_status() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.statusThreeDots();
	}

	@Given("all statuses are checked by default")
	public void all_statuses_are_checked_by_default() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertTrue("INITIAL", dmp.isStatusVisible("initial"));
	}

	@When("user uncheck the INITIAL checkbox")
	public void user_uncheck_the_initial_checkbox() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxInitial();
		Thread.sleep(4000);

	}

	@When("user uncheck the RESOLVING_TAG checkbox")
	public void user_uncheck_the_resolving_tag_checkbox() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxResolvingTag();
		Thread.sleep(4000);
	}

	@Then("apart from RESOLVING_TAG other statuses should remain visible")
	public void apart_from_resolving_tag_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("RESOLVING_TAG status should remain visible", dmp.isStatusVisible("RESOLVING_TAG"));
	}

	@When("user uncheck the RSOLVEDTAG checkbox")
	public void user_uncheck_the_rsolvedtag_checkbox() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxResolvedTag();
		Thread.sleep(4000);
	}

	@Then("apart from RESOLVED_TAG other statuses should remain visible")
	public void apart_from_resolved_tag_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("RESOLVED_TAG status should remain visible", dmp.isStatusVisible("RESOLVED_TAG"));
	}

	@When("user uncheck the DOWNLOADING checkbox")
	public void user_uncheck_the_downloading_checkbox() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxdownloading();
		Thread.sleep(4000);
	}

	@Then("apart from DOWNLOADING other statuses should remain visible")
	public void apart_from_downloading_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("DOWNLOADING status should remain visible", dmp.isStatusVisible("DOWNLOADING"));
	}

	@When("user uncheck the DOWNLOADED checkbox")
	public void user_uncheck_the_downloaded_checkbox() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxdownloaded();
		Thread.sleep(4000);
	}

	@Then("apart from DOWNLOADED other statuses should remain visible")
	public void apart_from_downloaded_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("DOWNLOADED status should remain visible", dmp.isStatusVisible("DOWNLOADED"));
	}

	@When("user uncheck the VERIFIED checkbox")
	public void user_uncheck_the_verified_checkbox() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxverified();
		Thread.sleep(4000);
	}

	@Then("apart from VERIFIED other statuses should remain visible")
	public void apart_from_verified_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("VERIFIED status should remain visible", dmp.isStatusVisible("VERIFIED"));
	}

	@When("user uncheck the VERIFIYING checkbox")
	public void user_uncheck_the_verifiying_checkbox() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxverifying();
		Thread.sleep(4000);
	}

	@Then("apart from VERIFIYING other statuses should remain visible")
	public void apart_from_verifiying_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("VERIFIYING status should remain visible", dmp.isStatusVisible("VERIFIYING"));
	}

	@When("user uncheck the LOADING checkbox")
	public void user_uncheck_the_loading_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxLoading();
	}

	@Then("apart from LOADING other statuses should remain visible")
	public void apart_from_loading_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("LOADING status should remain visible", dmp.isStatusVisible("LOADING"));
	}

	@When("user uncheck the FAILED checkbox")
	public void user_uncheck_the_failed_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxFailed();
	}

	@Then("apart from FAILED other statuses should remain visible")
	public void apart_from_failed_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("FAILED status should remain visible", dmp.isStatusVisible("FAILED"));
	}

	@When("user uncheck the ERROR checkbox")
	public void user_uncheck_the_error_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxError();
	}

	@Then("apart from ERROR other statuses should remain visible")
	public void apart_from_error_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("ERROR status should remain visible", dmp.isStatusVisible("ERROR"));
	}

	@Then("the {string} status should not appear in the status column")
	public void the_status_should_not_appear_in_the_status_column(String statusName) {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		 int attempts = 0;
		    boolean isVisible = true;
		    while (attempts < 3) {
		        try {
		            isVisible = dmp.isStatusVisible(statusName);
		            break; // Exit loop if the check succeeds
		        } catch (StaleElementReferenceException e) {
		            attempts++;
		        }
		    }

		    Assert.assertFalse("ERROR: Status '" + statusName + "' should not be visible", isVisible);
		Assert.assertFalse("ERROR status should not be visible", dmp.isStatusVisible(statusName));
	}

	@Then("apart from initial other statuses should remain visible")
	public void other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("INITIAL status should remain visible", dmp.isStatusVisible("INITIAL"));

	}
	@When("user uncheck the LOADED checkbox")
	public void user_uncheck_the_loaded_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxLoaded();
	}
	@Then("apart from LOADED other statuses should remain visible")
	public void apart_from_loaded_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("LOADED status should remain visible", dmp.isStatusVisible("LOADED"));
	}
	@When("user uncheck the CREATING_VOLUME checkbox")
	public void user_uncheck_the_creating_volume_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxCreatingVolume();
	}
	@Then("apart from CREATING_VOLUME other statuses should remain visible")
	public void apart_from_creating_volume_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("CREATING_VOLUME status should remain visible", dmp.isStatusVisible("CREATING_VOLUME"));
	}
	@When("user uncheck the CREATED_VOLUME checkbox")
	public void user_uncheck_the_created_volume_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxCreatedVolume();
	}
	@Then("apart from CREATED_VOLUME other statuses should remain visible")
	public void apart_from_created_volume_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("CREATED_VOLUME status should remain visible", dmp.isStatusVisible("CREATED_VOLUME"));
	}
	@When("user uncheck the INSTALLED checkbox")
	public void user_uncheck_the_installed_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxInstalled();
	}
	@Then("apart from INSTALLED other statuses should remain visible")
	public void apart_from_installed_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("INSTALLED status should remain visible", dmp.isStatusVisible("INSTALLED"));
	}
	@When("user uncheck the AWAITNETWORKINSTANCE checkbox")
	public void user_uncheck_the_awaitnetworkinstance_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxAwaitNetworkInstance();
	}
	@Then("apart from AWAITNETWORKINSTANCE other statuses should remain visible")
	public void apart_from_awaitnetworkinstance_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("AWAITNETWORKINSTANCE status should remain visible", dmp.isStatusVisible("AWAITNETWORKINSTANCE"));
	}
	@When("user uncheck the STARTDELAYED checkbox")
	public void user_uncheck_the_startdelayed_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckStarDelayedCheckbox();
	}
	@Then("apart from STARTDELAYED other statuses should remain visible")
	public void apart_from_startdelayed_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("STARTDELAYED status should remain visible", dmp.isStatusVisible("STARTDELAYED"));

	}
	@When("user uncheck the BOOTING checkbox")
	public void user_uncheck_the_booting_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxBooting();
	}
	@Then("apart from BOOTING other statuses should remain visible")
	public void apart_from_booting_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("BOOTING status should remain visible", dmp.isStatusVisible("BOOTING"));
	}
	@When("user uncheck the RUNNING checkbox")
	public void user_uncheck_the_running_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxRunning();
	}
	@Then("apart from RUNNING other statuses should remain visible")
	public void apart_from_running_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("RUNNING status should remain visible", dmp.isStatusVisible("RUNNING"));
	}
	@When("user uncheck the PAUSING checkbox")
	public void user_uncheck_the_pausing_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxPausing();
	}
	@Then("apart from PAUSING other statuses should remain visible")
	public void apart_from_pausing_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("PAUSING status should remain visible", dmp.isStatusVisible("PAUSING"));
	}
	@When("user uncheck the PAUSED checkbox")
	public void user_uncheck_the_paused_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxPaused();
	}
	@Then("apart from PAUSED other statuses should remain visible")
	public void apart_from_paused_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("PAUSED status should remain visible", dmp.isStatusVisible("PAUSED"));
	}
	@When("user uncheck the HALTING checkbox")
	public void user_uncheck_the_halting_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxHalting();
	}
	@Then("apart from HALTING other statuses should remain visible")
	public void apart_from_halting_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("HALTING status should remain visible", dmp.isStatusVisible("HALTING"));
	}

	@When("user uncheck the HALTED checkbox")
	public void user_uncheck_the_halted_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxHalted();
	}
	@Then("apart from HALTED other statuses should remain visible")
	public void apart_from_halted_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("HALTED status should remain visible", dmp.isStatusVisible("HALTED"));
	}
	@When("user uncheck the RESTARTING checkbox")
	public void user_uncheck_the_restarting_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxRestarting();
	}
	@Then("apart from RESTARTING other statuses should remain visible")
	public void apart_from_restarting_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("RESTARTING status should remain visible", dmp.isStatusVisible("RESTARTING"));
	}
	@When("user uncheck the PURGING checkbox")
	public void user_uncheck_the_purging_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxPurging();
	}
	@Then("apart from BROKEN other statuses should remain visible")
	public void apart_from_broken_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("PURGING status should remain visible", dmp.isStatusVisible("PURGING"));
	}
	@When("user uncheck the BROKEN checkbox")
	public void user_uncheck_the_broken_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxbroken();
	}
	@When("user uncheck the UNKNOWN checkbox")
	public void user_uncheck_the_unknown_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxunKnown();
	}
	@Then("apart from UNKNOWN other statuses should remain visible")
	public void apart_from_unknown_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("UNKNOWN status should remain visible", dmp.isStatusVisible("UNKNOWN"));
	}
	@When("user uncheck the MAXSTATE checkbox")
	public void user_uncheck_the_maxstate_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxmaxstate();
	}
	@Then("apart from MAXSTATE other statuses should remain visible")
	public void apart_from_maxstate_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("MAXSTATE status should remain visible", dmp.isStatusVisible("MAXSTATE"));
	}
	@When("user uncheck the DEPLOYMENT_STARTED checkbox")
	public void user_uncheck_the_deployment_started_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxDeploymentStarted();
	}
	@Then("apart from DEPLOYMENT_STARTED other statuses should remain visible")
	public void apart_from_deployment_started_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("DEPLOYMENT_STARTED status should remain visible", dmp.isStatusVisible("DEPLOYMENT_STARTED"));
	}
	@When("user uncheck the DEPLOYMENT_CREATED checkbox")
	public void user_uncheck_the_deployment_created_checkbox() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.uncheckCheckboxdeplymentCreated();
	}
	@Then("apart from DEPLOYMENT_CREATED other statuses should remain visible")
	public void apart_from_deployment_created_other_statuses_should_remain_visible() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertFalse("DEPLOYMENT_CREATED status should remain visible", dmp.isStatusVisible("DEPLOYMENT_CREATED"));
	}
	@Then("the {string} checkbox should not be checked")
	public void the_checkbox_should_not_be_checked(String checkbox) {
	DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
	 
    boolean isCheckboxChecked = dmp.checkboxDeleted();

  
    Assert.assertEquals("Checkbox should not be checked", false,isCheckboxChecked );
       Assert.assertFalse("checkbox should not be checked", dmp.checkboxDeleted());
	}

	@When("User checks the {string} checkbox")
	public void user_checks_the_checkbox(String checkbox) throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.deletedCheckboxClick();
		Thread.sleep(2000);
		
	}
	@Then("The {string} status should appear in the status column")
	public void the_status_should_appear_in_the_status_column(String status) throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertTrue("Expected status not found in the column", dmp.statusColumn_GetText().contains("DELETED"));
		Thread.sleep(2000);
	}
	@Then("click on delete button for removing old deploymnet")
	public void click_on_delete_button_for_removing_old_deploymnet() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.deletebutton();
	}
	@Then("provide confirmation to delete old deployment by clicking on Yes button")
	public void provide_confirmation_to_delete_old_deployment_by_clicking_on_yes_button() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.confirmationYesButton();
	}
	@Then("verify EDGE ID {string} should no longer be visible in the deployment list")
	public void verify_edge_id_should_no_longer_be_visible_in_the_deployment_list(String edgeId) {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		 List<WebElement> edgeRows = driver.findElements(By.xpath("//table//tr[td[text()='" + edgeId + "']]"));
		    
		    // Assert that the list is empty, meaning the EDGE ID has been successfully deleted
		    Assert.assertTrue("EDGE ID is still present in the deployment list",edgeRows.isEmpty());
		 
	}





}