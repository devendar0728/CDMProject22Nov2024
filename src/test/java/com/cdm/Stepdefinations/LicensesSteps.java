package com.cdm.Stepdefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.junit.Assume;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.LicensesPage;

import io.cucumber.java.en.Then;

public class LicensesSteps extends BaseTest {

	@Then("Click on Licenses module from side menu bar")
	public void click_on_licenses_module_from_side_menu_bar() throws InterruptedException {

		LicensesPage license = new LicensesPage(driver, logger);

		license.movetoLicensetab();

		Thread.sleep(2000);

	}

	@Then("verify sorting alphabetically in ascending as well as descending order for Expiry Date and then refresh the License Tracker")
	public void verify_sorting_alphabetically_in_ascending_as_well_as_descending_order_for_expiry_date_and_then_refresh_the_license_tracker() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.expiryDateArrowFilter();
	}

	@Then("Click on the Add License icon")
	public void click_on_the_add_license_icon() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assume.assumeTrue("No Add button in license", false);
	}

	@Then("verify sorting alphabetically in ascending as well as descending order for Deployment Date and then refresh the License Tracker")
	public void verify_sorting_alphabetically_in_ascending_as_well_as_descending_order_for_deployment_date_and_then_refresh_the_license_tracker() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.deploymentDateArrowFilter();
	}

	@Then("verify sorting alphabetically in ascending as well as descending order for status")
	public void verify_sorting_alphabetically_in_ascending_as_well_as_descending_order_for_status() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.statusArrowFilter();
	}

	@Then("Click on status three dot and choose status as inactive")
	public void click_on_status_three_dot_and_choose_status_as_inactive() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.statusThreeDot();
		lp.inActiveCheckBox();
	}

	@Then("click on the license tracker icon")
	public void click_on_the_license_tracker_icon() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.licenseTrackerIcon();
		Thread.sleep(5000);
	}

	@Then("Click on bulk download icon and verify the downloaded file content")
	public void click_on_bulk_download_icon_and_verify_the_downloaded_file_content() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.bulkDownloadIcon();
	}

	@Then("apply filter on host Id")
	public void apply_filter_on_host_id() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.hostIdThreeDot();
		Thread.sleep(3000);
		lp.hostidInput(alldata.get(vTCName).get("hostidsearch").toString());
		Thread.sleep(3000);
		lp.backDropShowing_Div_Click();
	}

	@Then("verify tooltip for the License Tracker")
	public void verify_tooltip_for_the_license_tracker() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.get_Text_ToolTipLicenseExpiryDate();
	}

	@Then("Verification of  the refresh icon when License Date filter is applied")
	public void verification_of_the_refresh_icon_when_license_date_filter_is_applied() {
		LicensesPage lp = new LicensesPage(driver, logger);

	}

	@Then("verify tool tip text visibilty for License Type")
	public void verify_tool_tip_text_visibilty_for_license_type() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for License Type", "License Type", lp.get_Text_ToolTipLicenseType());
	}

	@Then("verify tool tip text visibilty for Version")
	public void verify_tool_tip_text_visibilty_for_version() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for License Version", "Version", lp.get_Text_ToolTipLicenseVersion());
	}

	@Then("verify tool tip text visibilty for License Info")
	public void verify_tool_tip_text_visibilty_for_license_info() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for License Info", "License Info", lp.get_Text_ToolTipLicenseInfo());
	}

	@Then("verify tool tip text visibilty for License Deployment")
	public void verify_tool_tip_text_visibilty_for_license_deployment() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for License Deployment", "License Deployment",
				lp.get_Text_ToolTipLicenseDeployment());
	}

	@Then("verify tooltip for Expiry Date")
	public void verify_tooltip_for_expiry_date() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for issued Date", "Expiry Date", lp.get_Text_ToolTipLicenseExpiryDate());
	}

	@Then("verify tooltip for Issued Date")
	public void verify_tooltip_for_issued_date() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for issued Date", "Issued Date", lp.get_Text_ToolTipIssuedDate());
	}

	@Then("Click on three dots of version filter")
	public void click_on_three_dots_of_version_filter() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		Thread.sleep(3000);
		lp.versionInput(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("Click on Three dots on Issue Date Filter")
	public void click_on_three_dots_on_issue_date_filter() throws InterruptedException {

		LicensesPage lp = new LicensesPage(driver, logger);
		lp.issueDateThreeDot();
		Thread.sleep(2000);
	}

	@Then("apply filter on issued date")
	public void apply_filter_on_issued_date() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.issueDateThreeDot();

	}

	@Then("apply filter on expiry date")
	public void apply_filter_on_expiry_date() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.expiryDateThreeDot();
	}

	@Then("enter the value for datepicker field for expiry date")
	public void enter_the_value_for_datepicker_field_for_expiry_date() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		CalenderPage cal = new CalenderPage(driver, logger);
		lp.calenderIcon();
		String year = alldata.get(vTCName).get("expiryyear").toString();
		String month = alldata.get(vTCName).get("expirymonth").toString();
		String day = alldata.get(vTCName).get("expirystartdate").toString();
		String day2 = alldata.get(vTCName).get("expiryenddate").toString();

		cal.SelectDDDashMMDashYYYDay(year, month, day);

		Thread.sleep(2000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);
		Thread.sleep(2000);
		lp.applyButtoncalender();
		Thread.sleep(5000);
		lp.backDropShowing_Div_Click();
		Thread.sleep(2000);
		lp.headingTitle();
	}

	@Then("apply filter on License Type")
	public void apply_filter_on_license_type() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.licenseTypeThreeDots();
		lp.licenseType(alldata.get(vTCName).get("licenseType").toString());
		lp.backDropShowing_Div_Click();
	}

	@Then("enter the value for datepicker field")
	public void enter_the_value_for_datepicker_field() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		CalenderPage cal = new CalenderPage(driver, logger);
		lp.calenderIcon();

		Thread.sleep(5000);
		String year = alldata.get(vTCName).get("issuedyear").toString();
		String month = alldata.get(vTCName).get("issuedmonth").toString();
		String day = alldata.get(vTCName).get("issuedstartdate").toString();
		String day2 = alldata.get(vTCName).get("issuedenddate").toString();

		cal.SelectDDDashMMDashYYYDay(year, month, day);

		Thread.sleep(2000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);
		Thread.sleep(2000);
		lp.applyButtoncalender();
		Thread.sleep(5000);
		lp.backDropShowing_Div_Click();
		Thread.sleep(2000);
		lp.headingTitle();
	}

	@Then("Verification of  the refresh icon when Issued Date filter iss applied")

	public void verification_of_the_refresh_icon_when_issued_date_filter_iss_applied() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.refreshButton();
	}

	@Then("verify sorting alphabetically in ascending as well as descending order and then refresh the License Tracker")
	public void verify_sorting_alphabetically_in_ascending_as_well_as_descending_order_and_then_refresh_the_license_tracker()
			throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		Thread.sleep(3000);

		lp.sorting();
	}

	@Then("Verification of  the refresh icon when Host Id filter is applied")
	public void verification_of_the_refresh_icon_when_host_id_filter_is_applied() throws InterruptedException {

		LicensesPage lp = new LicensesPage(driver, logger);

		lp.hostIdThreeDot();

		lp.hostidInput(alldata.get(vTCName).get("hostidsearch").toString());
		lp.backDropShowing_Div_Click();

	}

	@Then("click on three dots for License Type")
	public void click_on_three_dots_for_license_type() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.licenseTypeThreeDot();
	}

	@Then("enter the value for the License Type")
	public void enter_the_value_for_the_license_type() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		Thread.sleep(3000);
		lp.licenseTypeInput(alldata.get(vTCName).get("licenseType").toString());
	}

	@Then("verify check filter icon availability for Status")
	public void verify_check_filter_icon_availability_for_status() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.statusThreeDot();
	}

	@Then("click on three dots for Version")
	public void click_on_three_dots_for_version() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.versionThreeDot();
	}

	@Then("verify icense status getting updated from Active to Expired")
	public void verify_icense_status_getting_updated_from_active_to_expired() {
		LicensesPage lp = new LicensesPage(driver, logger);
	}

	@Then("verify observe the license status getting updated from Sent to failed")
	public void verify_observe_the_license_status_getting_updated_from_sent_to_failed() {
		LicensesPage lp = new LicensesPage(driver, logger);
	}

	@Then("verify tool tip text visibilty for  column")
	public void verify_tool_tip_text_visibilty_for_column() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for License Status", "Status", lp.get_Text_ToolTipLicenseStatus());
	}

@Then("verify check filter icon availability for License Type")
public void verify_check_filter_icon_availability_for_license_type() {
	LicensesPage lp = new LicensesPage(driver, logger);
	lp.licenseTypeThreeDot();

}

@Then("verify check filter icon availability for Version")
public void verify_check_filter_icon_availability_for_version() {
	LicensesPage lp = new LicensesPage(driver, logger);
	lp.versionThreeDot();
}





	@Then("verify tool tip text visibilty for License Deployment under Actions")
	public void verify_tool_tip_text_visibilty_for_license_deployment_under_actions() {
		LicensesPage lp = new LicensesPage(driver, logger);
		try {
			Assert.assertEquals("Tooltip for License Revoke", "License Deployment", lp.get_Text_ToolTipLicenseDeployment());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Then("verify tool tip text visibilty for License Deployment under Actions column")
	public void verify_tool_tip_text_visibilty_for_license_deployment_under_actions_column() {
		LicensesPage lp = new LicensesPage(driver, logger);

	}
	@Then("verify tool tip text visibilty for License revoke under Actions")
	public void verify_tool_tip_text_visibilty_for_license_revoke_under_actions() {
		LicensesPage lp = new LicensesPage(driver, logger);
		try {
			Assert.assertEquals("Tooltip for License Revoke", "License Revoke", lp.get_Text_ToolTipLicenseRevoke());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("verify tool tip text visibilty for deActivate License button in Actions column")
	public void verify_tool_tip_text_visibilty_for_de_activate_license_button_in_actions_column() {
		LicensesPage lp = new LicensesPage(driver, logger);
		// Assert.assertEquals("Tooltip for License active", "License Active",
		// lp.get_Text_ToolTipLicenseActivate());
	}

	@Then("verify tool tip text visibilty for Refresh button")
	public void verify_tool_tip_text_visibilty_for_refresh_button() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for License refresh", "Refresh", lp.get_Text_ToolTipLicenseRefresh());
	}

	@Then("verify tooltip  for Host ID")
	public void verify_tooltip_for_host_id() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for Host ID", "Host ID", lp.get_Text_ToolTipHostID());
	}
	@Then("verify page accessbility filter icon for Issued Date")
	public void verify_page_accessbility_filter_icon_for_issued_date() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.issueDateThreeDot();
	}

	@Then("verify page accessbility the filter icon for Expiry Date")
	public void verify_page_accessbility_the_filter_icon_for_expiry_date() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.expiryDateThreeDot();
	}



	@Then("verify tool tip text visibilty for License Upload button")
	public void verify_tool_tip_text_visibilty_for_license_upload_button() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for License Upload", "License Upload", lp.get_Text_ToolTipLicenseBulkUpload());
	}

	@Then("verify tool tip text visibilty for License bulk download button")
	public void verify_tool_tip_text_visibilty_for_license_bulk_download_button() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for License Download", "Bulk Download in CSV Format",
				lp.get_Text_ToolTipLicenseBulkDownload());
	}

	@Then("verify tool tip text visibilty for Request License button")
	public void verify_tool_tip_text_visibilty_for_request_license_button() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for Request License", "Request License", lp.get_Text_ToolTipRequestLicense());
	}

	@Then("verify tool tip text visibilty for License Tracker button")
	public void verify_tool_tip_text_visibilty_for_license_tracker_button() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for License Tracker", "License Tracker", lp.get_Text_ToolTipLicenseTraker());
	}

	@Then("click on license tracker")
	public void click_on_license_tracker() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.licenseTrackerIcon();
		Thread.sleep(6000);
	}

	@Then("verify tool tip text visibilty for Edge Name")
	public void verify_tool_tip_text_visibilty_for_edge_name() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for Edge  Name", "Name assigned for the EDGE Device",
				lp.get_Text_ToolTipEdgeName());
	}

	@Then("verify tool tip text visibilty for EDGE Group Name")
	public void verify_tool_tip_text_visibilty_for_edge_group_name() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for Edge  Group Name", "EDGE Group to which the EDGE Device is assigned",
				lp.get_Text_ToolTipEdgeGroupName());
	}

	@Then("verify tool tip text visibilty for Entity Name")
	public void verify_tool_tip_text_visibilty_for_entity_name() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for Entity", "Entity Name", lp.get_Text_ToolTipEntity());
	}

	@Then("verify tool tip text visibilty for Expiry Date")
	public void verify_tool_tip_text_visibilty_for_expiry_date() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for Expiry Date", "Expiry Date", lp.get_Text_ToolTipExpiryDate());
	}

	@Then("verify tool tip text visibilty for Status license")
	public void verify_tool_tip_text_visibilty_for_status_license() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for Status license", "Status", lp.get_Text_ToolTipLicenseStatus());
	}

	@Then("verify tool tip text visibilty for Status license tracker")
	public void verify_tool_tip_text_visibilty_for_status_license_tracker() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for Status", "Status", lp.get_Text_ToolTipLicenseStatusTracker());
	}

	@Then("verify tool tip text visibilty for Refresh button in License Tracker")
	public void verify_tool_tip_text_visibilty_for_refresh_button_in_license_tracker() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for Refresh", "Refresh", lp.get_Text_ToolTipLicenseRefresh());
	}

	@Then("verify to check the tool tip text visibilty for Bulk Download button in License Tracker")
	public void verify_to_check_the_tool_tip_text_visibilty_for_bulk_download_button_in_license_tracker() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for bulk download", "License Table", lp.get_Text_ToolTipLicenseBulkDownload());
	}

	@Then("verify to check the tool tip text visibilty for License Table in License Tracker")
	public void verify_to_check_the_tool_tip_text_visibilty_for_license_table_in_license_tracker() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for bulk download", "License Table", lp.get_Text_ToolTipLicenseBulkDownload());
	}

	@Then("verify to ascending order sorting functionality for the table list")
	public void verify_to_ascending_order_sorting_functionality_for_the_table_list() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.hostIdAscElement();
	}

	@Then("verify to descending order sorting functionality for the table list")
	public void verify_to_descending_order_sorting_functionality_for_the_table_list() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.hostIdAscElement();
	}

	@Then("verify refresh icon when Version filter is applied")
	public void verify_refresh_icon_when_version_filter_is_applied() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.refreshButton();
	}

	@Then("Click on Bulk upload icon at the top of the screen")
	public void click_on_bulk_upload_icon_at_the_top_of_the_screen() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.uploadLicenseButton();
	}

	@Then("Click on Bulk upload icon")
	public void click_on_bulk_upload_icon() throws AWTException {
		StringSelection ss = new StringSelection(alldata.get(vTCName).get("licenseuploadpath").toString());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);

		String str = alldata.get(vTCName).get("licenseuploadpath").toString();
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.uploadButtonSaveElement();
	}

	@Then("verify tool tip text visibilty for Deployment Date")
	public void verify_tool_tip_text_visibilty_for_deployment_date() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for Deployment Date", "Deployment Date", lp.get_Text_ToolTipDeploymentDate());
	}

	@Then("verify tool tip text visibilty for Host ID")
	public void verify_tool_tip_text_visibilty_for_host_id() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assert.assertEquals("Tooltip for Host ID", "Host ID", lp.get_Text_ToolTipHostID());

	}

	@Then("verify tool tip text visibilty for Activate License button in Actions column")
	public void verify_tool_tip_text_visibilty_for_activate_license_button_in_actions_column() {
		LicensesPage lp = new LicensesPage(driver, logger);
		// Assert.assertEquals("Tooltip for License active", "License Active",
		// lp.get_Text_ToolTipLicenseActivate());
	}

	@Then("verify tool tip text visibilty for License Info from Actions column")
	public void verify_tool_tip_text_visibilty_for_license_info_from_actions_column() {
		LicensesPage lp = new LicensesPage(driver, logger);
		try {
			Assert.assertEquals("Tooltip for License Info", "License Info", lp.get_Text_ToolTipLicenseInfo());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("verify tool tip text visibilty for License Tracker button at the top navigation")
	public void verify_tool_tip_text_visibilty_for_license_tracker_button_at_the_top_navigation() {
		LicensesPage lp = new LicensesPage(driver, logger);
		try {
			Assert.assertEquals("Tooltip for License Tracker", "License Tracker", lp.get_Text_ToolTipLicenseTraker());
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

	@Then("wait for window eight hours")
	public void wait_for_window_eight_hours() {
		LicensesPage lp = new LicensesPage(driver, logger);
	}

	@Then("verify page accessbility the filter icon for Host ID")
	public void verify_page_accessbility_the_filter_icon_for_host_id() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.hostIdThreeDot();
		lp.hostidInput(alldata.get(vTCName).get("hostidsearch").toString());
	}

	@Then("verify status getting updated from Sent to Active")
	public void verify_status_getting_updated_from_sent_to_active() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assume.assumeTrue(
				"not able to automate scenario, can not check status from sent to active  because we need to attach device and hardware testing not possible",
				false);
	}

	@Then("verify page accessible the screen by using wi-fi network")
	public void verify_page_accessible_the_screen_by_using_wi_fi_network() {
		LicensesPage lp = new LicensesPage(driver, logger);
	}

	@Then("verify the visibilty duration to load the page")
	public void verify_the_visibilty_duration_to_load_the_page() {
		LicensesPage lp = new LicensesPage(driver, logger);
		Assume.assumeTrue("Can not automate visibility duration to load page", false);
	}

	@Then("verify visualization of icons in Actions column")
	public void verify_visualization_of_icons_in_actions_column() {
		LicensesPage lp = new LicensesPage(driver, logger);
	}

	@Then("verify page accessible the page by using mobile network")
	public void verify_page_accessible_the_page_by_using_mobile_network() {
		LicensesPage lp = new LicensesPage(driver, logger);
	}

	@Then("enter the value for the Version")
	public void enter_the_value_for_the_version() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.versionInput(alldata.get(vTCName).get("Version").toString());
	}

	@Then("Click on status three dot")
	public void click_on_status_three_dot() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.statusThreeDot();

	}

	@Then("Verification of the refresh icon when more than one filter is applied")
	public void verification_of_the_refresh_icon_when_more_than_one_filter_is_applied() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);

		lp.hostIdThreeDot();
		Thread.sleep(3000);
		lp.hostidInput(alldata.get(vTCName).get("hostidsearch").toString());
		lp.backDropShowing_Div_Click();
		Thread.sleep(3000);
		lp.versionThreeDot();
		lp.versionInput(alldata.get(vTCName).get("Version").toString());
		lp.backDropShowing_Div_Click();
		Thread.sleep(2000);
		lp.refreshButton();

	}

	@Then("Verification of the refresh icon when License Type filter is applied")
	public void verification_of_the_refresh_icon_when_license_type_filter_is_applied() throws InterruptedException {
		Thread.sleep(200);
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.refreshButton();
	}

	@Then("Verification of the refresh icon when Expiry Date filter is applied")
	public void verification_of_the_refresh_icon_when_expiry_date_filter_is_applied() throws InterruptedException {

		LicensesPage lp = new LicensesPage(driver, logger);
		lp.expiryDateThreeDot();
		Thread.sleep(3000);
		CalenderPage cal = new CalenderPage(driver, logger);

		lp.calenderIcon();

		Thread.sleep(5000);
		String year = alldata.get(vTCName).get("expiryyear").toString();
		String month = alldata.get(vTCName).get("expirymonth").toString();
		String day = alldata.get(vTCName).get("expirystartdate").toString();
		String day2 = alldata.get(vTCName).get("expiryenddate").toString();

		cal.SelectDDDashMMDashYYYDay(year, month, day);

		Thread.sleep(3000);

		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		Thread.sleep(3000);
		lp.applyButtoncalender();
		Thread.sleep(5000);
		lp.backDropShowing_Div_Click();
		Thread.sleep(2000);
		lp.headingTitle();

	}

	@Then("Click on bulk download icon on license table page")
	public void click_on_bulk_download_icon_on_license_table_page() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.bulkDownloadButton();

	}

	@Then("Click on Add license button")
	public void click_on_add_license_button() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.addButton();
	}

	@Then("Click on upload license button")
	public void click_on_upload_license_button() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.uploadLicenseButton();
	}

	@Then("upload license file and click on upload button")
	public void upload_license_file_and_click_on_upload_button() throws InterruptedException, AWTException {

		LicensesPage lp = new LicensesPage(driver, logger);
		Thread.sleep(3000);
		try {
			Robot rb = new Robot();

			// copying File path to Clipboard
			StringSelection str = new StringSelection(alldata.get(vTCName).get("licenseuploadpath").toString());
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.delay(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(4000);
		lp.uploadButton();
	}

	@Then("upload invalid license file and click on upload button")
	public void upload_invalid_license_file_and_click_on_upload_button() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		Thread.sleep(3000);
		try {
			Robot rb = new Robot();

			// copying File path to Clipboard
			StringSelection str = new StringSelection(alldata.get(vTCName).get("licenseuploadpath").toString());
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.delay(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(4000);
		lp.uploadButton();
		try {
			lp.invalidLicenseValidationmessagetext();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("click on upload button to verify validation message")
	public void click_on_upload_button_to_verify_validation_message() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.uploadButton();
	}

	@Then("Click on three dots of host Id and enter the text for host id")
	public void click_on_three_dots_of_host_id_and_enter_the_text_for_host_id() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.hostIdThreeDot();
		lp.hostidInput(alldata.get(vTCName).get("hostidsearch").toString());
	}

	@Then("Click on three dots of issued date for license")
	public void click_on_three_dots_of_issued_date_for_license() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.issueDateThreeDot();
		Thread.sleep(5000);
		lp.opencalenderdot();

		String startDate = alldata.get(vTCName).get("issuedstartdate").toString();
		String endDate = alldata.get(vTCName).get("issuedenddate").toString();
		try {
			lp.selectDateRange(startDate, endDate);
			Thread.sleep(500000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		lp.applyButtoncalender();

	}

	@Then("click on three dots of Host ID and enter the value for the host id")
	public void click_on_three_dots_of_host_id_and_enter_the_value_for_the_host_id() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.hostIdThreeDot();
		lp.hostidInput(alldata.get(vTCName).get("hostidsearch").toString());
		lp.backDropShowing_Div_Click();
	}

	@Then("Click on License deployment button")
	public void click_on_license_deployment_button() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.licenseDeployment();
	}

	@Then("select edge device")
	public void select_edge_device() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.edgeIDDotElement();
		lp.edgeIDInput(alldata.get(vTCName).get("edgeIdSearch").toString());
		lp.backDropShowing_Div_Click();
		lp.checkboxEdgeIDStepOneName();
	}

	@Then("verify sorting alphabetically in ascending as well as descending order for Entity Name and then refresh the License Tracker")
	public void verify_sorting_alphabetically_in_ascending_as_well_as_descending_order_for_entity_name_and_then_refresh_the_license_tracker() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.issuedateArrowFilter();

	}

	@Then("verify sorting alphabetically in ascending as well as descending order for Edge Name and then refresh the License Tracker")
	public void verify_sorting_alphabetically_in_ascending_as_well_as_descending_order_for_edge_name_and_then_refresh_the_license_tracker() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.edgeNameArrowFilter();
	}

	@Then("click on bulk download icon")
	public void click_on_bulk_download_icon() {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.bulkDownloadButton();
	}

	@Then("click on Next button")
	public void click_on_next_button() throws InterruptedException {
		LicensesPage lp = new LicensesPage(driver, logger);
		lp.NextButtonStep();
		Thread.sleep(4000);
	}

	@Then("select license entity name")
	public void select_license_entity_name() {
		LicensesPage lp = new LicensesPage(driver, logger);
//		lp.licenseEntityElement();
//		lp.licenseEntityInput(alldata.get(vTCName).get("entityNameSearch").toString());
		// lp.backDropShowing_Div_Click();
		lp.checkboxEntityNameStepOneName();
	}

	@Then("click on deploy button")
	public void click_on_deploy_button() {

	}

}
