package com.cdm.Stepdefinations;

import java.awt.AWTException;

import org.junit.Assert;
import org.junit.Assume;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.DeploymentsmodulePage;
import com.cdm.pages.Pagination;

import io.cucumber.java.en.Then;

public class DeploymentsSteps extends BaseTest {

	@Then("verify page with resize option for the deployment page")
	public void verify_page_with_resize_option_for_the_deployment_page() {
		DeploymentsmodulePage dp = new DeploymentsmodulePage(driver, logger);
		dp.setZoomLevel(800, 600);
	}

	@Then("Click on Deployments module from side menu bar")
	public void click_on_deployments_module_from_side_menu_bar() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.deploymenttabclick();
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
	public void click_on_the_bulk_download_button() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.bulkDownloadButton();
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

		String value = alldata.get(vTCName).get("ItemPerPage").toString();
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
		//dmp.backDropShowing_Div_Click();

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
	;
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
	public void scroll_horizontal() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
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
	@Then("click on reset button")
	public void click_on_reset_button() throws InterruptedException {
	   DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
	   dmp.resetButton();
	   Thread.sleep(2000);
	   dmp.calenderIcon();
	}
	@Then("click on refresh button on the page of Deployed Volume Details Popup")
	public void click_on_refresh_button_on_the_page_of_deployed_volume_details_popup() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.refresh_Button();
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
		String day = alldata.get(vTCName).get("DeploymentFromDate").toString();
		String day2 = alldata.get(vTCName).get("DeploymentToDate").toString();
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

	@Then("Click on deployment pagination it will display records will display")
	public void click_on_deployment_pagination_it_will_display_records_will_display() {
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
		String value = alldata.get(vTCName).get("ItemPerPage").toString();
		p.SelectPageMatOption(value);

		int rowPerPage = Integer.parseInt(value);

// Assert.assertTrue("Row count match for next page",
// p.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("Click on pagination to check functionality of Full Backward arrow")
	public void click_on_pagination_to_check_functionality_of_full_backward_arrow() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(4000);
		p.nextPageClickAndCountOnLastPage(rowPerPage);
// Assert.assertTrue("Row count match for first page",
// p.firstPageFullBackwardArrow(rowPerPage));
	}

	@Then("Click on pagination to check functionality of Full forward arrow")
	public void click_on_pagination_to_check_functionality_of_full_forward_arrow() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(4000);

		Thread.sleep(7000);
// Assert.assertTrue("Row count match for full forward means Last page",
// p.fullforwardArrowClick(rowPerPage));
	}

	@Then("Click on pagination to check Next button\\(Forward arrow) functionality")
	public void click_on_pagination_to_check_next_button_forward_arrow_functionality() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(4000);

		Thread.sleep(7000);
// Assert.assertTrue("Row count match for next page",
// p.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("Click on pagination to check Previous Page button\\(Backward arrow) functionality")
	public void click_on_pagination_to_check_previous_page_button_backward_arrow_functionality() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(5000);
// Assert.assertTrue("Row count match for Previous page",
// p.previousPageClickAndCount(rowPerPage));
	}

	@Then("Verfication of loading properly in slow network")
	public void verfication_of_loading_properly_in_slow_network() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
	}
	@Then("verify tool tip text visibilty for EDGE ID")
	public void verify_tool_tip_text_visibilty_for_edge_id() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip of EdgeID ", "Unique ID assigned for the EDGE Device", dmp.get_Text_ToolTipforEdgeID());
	}
	@Then("verify tool tip text visibility for APP Name")
	public void verify_tool_tip_text_visibility_for_app_name() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip of App Name ", "Unique Name assigned for the Application", dmp.get_Text_ToolTipforAppName());
	}
	@Then("verify tool tip text visibility for Status")
	public void verify_tool_tip_text_visibility_for_status() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip of Status", "Status of Deployment", dmp.get_Text_ToolTipforStatus());
	}
	@Then("verify tool tip text visibility for Running Version")
	public void verify_tool_tip_text_visibility_for_running_version() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip of Running Status", "Status of Deployment", dmp.get_Text_ToolTipforStatus());
	}
	@Then("verify tool tip text visibility for Deployment Date")
	public void verify_tool_tip_text_visibility_for_deployment_date() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip of Deployment date", "The date (MM-DD-YYYY) and time (HH:MM) (+/-HH:MM) the application was deployed on the EDGE Device", dmp.get_Text_ToolTipforDeploymentDate());
	}
	@Then("verify tool tip text visibility for Expected Version")
	public void verify_tool_tip_text_visibility_for_expected_version() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip of Expected Version", "Version of the application expected to be running on the EDGE Device, e.g., latest", dmp.get_Text_ToolTipforExpectedVersion());
	}
	@Then("verify tool tip text visibility for view deployed volume details button in Actions column")
	public void verify_tool_tip_text_visibility_for_view_deployed_volume_details_button_in_actions_column() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip of deployed volume details", "View Deployed Volume Details", dmp.get_Text_ToolTipforViewDeployedVolume());
	}
	@Then("verify tool tip text visibility for for delete button in Actions column")
	public void verify_tool_tip_text_visibility_for_for_delete_button_in_actions_column() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip of delete", "Delete", dmp.get_Text_ToolTipforDelete());
	}

	@Then("verify alignment for maximize & minimize the screen")
	public void verify_alignment_for_maximize_minimize_the_screen() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.minimizeBrowser();
		dmp.maximizeBrowser();
	}

	@Then("verify tool tip text visibilty for Close button in Deployed volume details in History view screen")
	public void verify_tool_tip_text_visibilty_for_close_button_in_deployed_volume_details_in_history_view_screen() throws InterruptedException {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		dmp.infoicon();


		Assert.assertEquals("Tooltip of close", "Close", dmp.get_Text_ToolTipClose());
	}



	@Then("verify tool tip text visibility for Last updated")
	public void verify_tool_tip_text_visibility_for_last_updated() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip of Last Updated", "The timestamp when the configuration was last updated", dmp.get_Text_ToolTipforLastUpdatedVersion());
	}
	@Then("verify to check the text varbaige for all the tool tips")
	public void verify_to_check_the_text_varbaige_for_all_the_tool_tips() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip of Last Updated", "The timestamp when the configuration was last updated", dmp.get_Text_ToolTipforLastUpdatedVersion());
	}




	@Then("verify tool tip text visibility for Error")
	public void verify_tool_tip_text_visibility_for_error() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assert.assertEquals("Tooltip Error", "Lists of any deployment errors", dmp.get_Text_ToolTipforError());
	}



	@Then("Verfication to check the alignment of Refresh,bulk download & History View buttons on the top right side")
	public void verfication_to_check_the_alignment_of_refresh_bulk_download_history_view_buttons_on_the_top_right_side() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assume.assumeTrue("checking alignment of different screen resolution is not possible to automate", false);
	}

	@Then("check the coloumn width uniformity")
	public void check_the_coloumn_width_uniformity() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assume.assumeTrue("check the coloumn width uniformity", false);
	}

	@Then("verify to check the coloumn width & size resolution")
	public void verify_to_check_the_coloumn_width_size_resolution() {
		DeploymentsmodulePage dmp = new DeploymentsmodulePage(driver, logger);
		Assume.assumeTrue("checking alignment of coloumn width & size resolution is not possible to automate", false);
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
}