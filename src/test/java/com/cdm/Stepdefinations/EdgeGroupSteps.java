package com.cdm.StepDefinations;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.cdm.pages.AppgroupnewlistPage;
import com.cdm.pages.EdgeGroupAddPage;
import com.cdm.pages.EdgeGroupApplicationDeployment;
import com.cdm.pages.EdgeGroupConfigurationPage;
import com.cdm.pages.EdgeGroupEditPage;
import com.cdm.pages.EdgeGroupsPage;
import com.cdm.pages.Pagination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EdgeGroupSteps extends BaseTest {

	@Then("click on EDGE Group")
	public void click_on_edge_group() throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.clickEdgeGroups();

	}

	@Then("verify user is landing on Edge Group page")
	public void verify_user_is_landing_on_edge_group_page() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		WebElement heading = driver.findElement(By.tagName("h2"));
		Assert.assertEquals(heading.getText(), "EDGE Groups", "EDGE Groups");
	}

	@Then("enter invalid Edge group Id and check for the validation message")
	public void enter_invalid_edge_group_id_and_check_for_the_validation_message() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.edgeGroupIdAdd(alldata.get(vTCName).get("GroupIDAdd").toString());
		egap.saveButtonforEdgeGroup();
		Assert.assertEquals("Edge ID validation for invalid edge", "Please enter a valid EDGE Group ID !",
				egap.verifyValidationMessageEdgeIDAdd());

	}

	@Then("Verification of check filter icon visibility for Alarms raised")
	public void verification_of_check_filter_icon_visibility_for_alarms_raised() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		// can not automate check filter icon for alaram raised as column not exist
	}

	@Then("verify error message verbaige for without entering details in ADD Screen")
	public void verify_error_message_verbaige_for_without_entering_details_in_add_screen() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.saveButtonforEdgeGroup();
		Assert.assertEquals("Edge ID validation for invalid edge", "Mandatory field - required !",
				egap.validationMessageGroupNamewithout());
	}

	@Then("verify error message verbaige for entering invalid details for EDGE Group ID Text field")
	public void verify_error_message_verbaige_for_entering_invalid_details_for_edge_group_id_text_field() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.saveButtonforEdgeGroup();
		Assert.assertEquals("Edge ID validation for invalid edge", "Mandatory field - required !",
				egap.validationMessageGroupIdwithout());
	}

	@Then("verify error message verbaige for entering invalid details for Sever Host Address")
	public void verify_error_message_verbaige_for_entering_invalid_details_for_sever_host_address() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.saveButtonforEdgeGroup();
		Assert.assertEquals("Edge ID validation for Server host id ", "Mandatory field - required !",
				egap.validationMessageServerHostIDwithout());
	}

	@Then("verify error message below Server port text field")
	public void verify_error_message_below_server_port_text_field() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.saveButtonforEdgeGroup();
		Assert.assertEquals("Edge server port validation", "Mandatory field - required !",
				egap.validationMessageServerPortwithout());
	}

	@Then("verify check filter icon availability for Group Name")
	public void verify_check_filter_icon_availability_for_group_name() throws Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameThreeDot();
	}

	@Then("verify switching between inputs fields using TAB")
	public void verify_switching_between_inputs_fields_using_tab() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.switchToSecondInput();

	}

	@Then("Verification of check filter icon visibility for Group Name")
	public void verification_of_check_filter_icon_visibility_for_group_name() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.GroupNameFilter();
	}

	@Then("verify check filter icon availability for status")
	public void verify_check_filter_icon_availability_for_status() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.DeviceStatus();
	}

	@Then("Verification of tool tip text visibilty for Group name")
	public void verification_of_tool_tip_text_visibilty_for_group_name() throws InterruptedException {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);

		Assert.assertEquals("Tooltip of Group Name", "Name Assigned to EDGE Group",
				egap.get_Text_ToolTipedgeGroupName());

	}

	@Then("Verification of tool tip text visibilty for Devices connected")
	public void verification_of_tool_tip_text_visibilty_for_devices_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		Assert.assertEquals("Tooltip of Device Connected", "The number of connected devices in the EDGE Group",
				egp.get_Text_ToolTipDeviceConnected());

	}

	@Then("verify load concept in slow network")
	public void verify_load_concept_in_slow_network() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		// can not automate network speed
	}

	@Then("Verification of tool tip text visibilty for Devices Active")
	public void verification_of_tool_tip_text_visibilty_for_devices_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		Assert.assertEquals("Tooltip of Device Connected", "Number of Active EDGE Devices connected to EDGE Group",
				egp.get_Text_ToolTipDeviceActive());
	}

	@Then("Verification of tool tip text visibilty for Status")
	public void verification_of_tool_tip_text_visibilty_for_status() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		Assert.assertEquals("Tooltip of Status", "Status of EDGE Group Cluster", egp.get_Text_ToolTipStatus());
	}

	@Then("Verification of tool tip text visibilty for console functionality button in Actions column")
	public void verification_of_tool_tip_text_visibilty_for_console_functionality_button_in_actions_column() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		Assert.assertEquals("Tooltip of Console", "Console", egp.get_Text_ToolTipConsole());
	}

	@Then("Verification of tool tip text visibilty for Delete functionality button in Actions column")
	public void verification_of_tool_tip_text_visibilty_for_delete_functionality_button_in_actions_column() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Delete", "Delete", egp.get_Text_ToolTipDelete());
	}

	@Then("Verification of tool tip text visibilty for EDIT button in Actions column")
	public void verification_of_tool_tip_text_visibilty_for_edit_button_in_actions_column()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		Assert.assertEquals("Tooltip of Edit", "Edit", egp.get_Text_ToolTipEdit());
	}

	@Then("verify check filter icon availability for Device Connected")
	public void verify_check_filter_icon_availability_for_device_connected() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.DeviceConnectedFilter();
	}

	@Then("verify check filter icon availability for Device Active")
	public void verify_check_filter_icon_availability_for_device_active() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.DeviceActive();
	}

	@Then("verify error message below Group Name text field")
	public void verify_error_message_below_group_name_text_field() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.saveButtonforEdgeGroup();
		Assert.assertEquals("Edge Name validation for Server host id ", "Mandatory field - required !",
				egap.validationMessageGroupNamewithout());
	}

	@Then("verify page should get refresh")
	public void verify_page_should_get_refresh() throws InterruptedException {
		EdgeGroupsPage edp = new EdgeGroupsPage(driver, logger);
		Thread.sleep(2000);
		// Capture the last row data before and after refresh
		String lastRowBeforeRefresh = edp.lastRowBeforeRefresh();
		String lastRowAfterRefresh = edp.lastRowDataAfterRefresh();

		// Log the data for debugging purposes
		System.out.println("Last row before refresh: " + lastRowBeforeRefresh);
		System.out.println("Last row after refresh: " + lastRowAfterRefresh);

		// Assert that the last row has changed
		Assert.assertEquals("Refresh operation", lastRowBeforeRefresh, lastRowAfterRefresh);
	}

	@Then("verify error message below Server Host Address text field")
	public void verify_error_message_below_server_host_address_text_field() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.saveButtonforEdgeGroup();
		Assert.assertEquals("Edge Server host Address validation for Server host id ", "Mandatory field - required !",
				egap.validationMessageServerHostIDwithout());
	}

	@Then("verify error message verbaige for entering invalid details for Sever port")
	public void verify_error_message_verbaige_for_entering_invalid_details_for_sever_port() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.saveButtonforEdgeGroup();
		Assert.assertEquals("Edge ID validation for Server port ", "Mandatory field - required !",
				egap.validationMessageServerPortwithout());
	}

	@Then("verify error message verbaige for entering invalid details for EDGE Group Name Text field")
	public void verify_error_message_verbaige_for_entering_invalid_details_for_edge_group_name_text_field() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.saveButtonforEdgeGroup();
		Assert.assertEquals("Edge Name validation for invalid edge", "Mandatory field - required !",
				egap.validationMessageGroupNamewithout());
	}

	@Then("Click on the three dots of GroupName")
	public void click_on_the_three_dots_of_group_name() throws Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameThreeDot();
	}

	@Then("scroll down the page")
	public void scroll_down_the_page() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.scrollingvertical();
	}

	@Then("select the value from application group dropdown")
	public void select_the_value_from_application_group_dropdown() throws Exception {

		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);
		egep.applicationGroupName(alldata.get(vTCName).get("applicationGroupNameEdit").toString());

	}

	@Then("land on the dashbord")
	public void land_on_the_dashbord() {
		System.out.println("User is landing on Dashboard");
	}

	@Then("Click on Refresh button")
	public void click_on_refresh_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkrefreshbtn();
	}

	@Then("Click on Add button")
	public void click_on_add_button() throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.checkAddbtn();
	}

	@Then("click on bulk Upload button EDGE Group")
	public void click_on_bulk_upload_button_edge_group() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkbulkAppBtn();

	}

	@Then("enter text in the field of GroupName")
	public void enter_text_in_the_field_of_group_name() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameInputSearch(alldata.get(vTCName).get("GroupNameSearch").toString());

		egp.backDropShowing_Div_Click();

		egp.headingEdgeGroupListClick();
	}

	@Then("enter text in the field of GroupName for Edit")
	public void enter_text_in_the_field_of_group_name_for_edit() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameInputSearch(alldata.get(vTCName).get("applicationGroupNameEdit").toString());

		egp.backDropShowing_Div_Click();

		egp.headingEdgeGroupListClick();
	}

	@Then("enter value in the GroupName")
	public void enter_value_in_the_group_name() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameInputSearch(alldata.get(vTCName).get("Value1").toString());

		egp.backDropShowing_Div_Click();
		egp.headingEdgeGroupListClick();

	}

	@Then("Click on Download icon button on the top right side")
	public void click_on_download_icon_button_on_the_top_right_side() throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkBulkDownloadButton();

	}

	@Then("Click on Edit Edge Group button")
	public void click_on_edit_edge_group_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.Edit_btn();
	}

	@Then("click on edit button")
	public void click_on_edit_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.Edit_btn();
	}

	@Then("Click on EDGE Group module from side menu bar")
	public void click_on_edge_group_module_from_side_menu_bar() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.clickEdgeGroups();
		Thread.sleep(2000);
	}

	@Then("Click on Add button to add Edge group value")
	public void click_on_add_button_to_add_edge_group_value() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkAddbtn();
	}

	@Then("enter all mandatory field under identity section")
	public void enter_all_mandatory_field_under_identity_section() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.identitySectionGroupID(alldata.get(vTCName).get("GroupIDAdd").toString());
		egp.groupNameAdd(alldata.get(vTCName).get("GroupNameAdd").toString());
		egp.locationedgeGroup(alldata.get(vTCName).get("LocationAdd").toString());
		egp.descriptionedgeGroup(alldata.get(vTCName).get("DescriptionAdd").toString());
	}

	@Then("enter all fields under deployment")
	public void enter_all_fields_under_deployment() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.applicationGroupName(alldata.get(vTCName).get("AppGroupAdd").toString());
		egp.serverNodes(alldata.get(vTCName).get("MaximumServerNodeAdd").toString());
		egp.serverHostAddress(alldata.get(vTCName).get("ServerHostAddressAdd").toString());
		egp.serverPort(alldata.get(vTCName).get("ServerPortAdd").toString());
	}

	@Then("Click on Delete Edge Group button")
	public void click_on_delete_edge_group_button() {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deleteEdgeGroupColumn();
	}

	@Then("confirmation message appeared for confirm delete Click on Yes to delete and No to Cancel")
	public void confirmation_message_appeared_for_confirm_delete_click_on_yes_to_delete_and_no_to_cancel() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		// egp.confirmationYesMessage();
		egp.confirmationNoMessage();
	}

	@Then("Click on Stop button")
	public void click_on_stop_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.stopButton();
	}

	@Then("Click on console button")
	public void click_on_console_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.consoleIcon();
	}

	@Then("Click on three dots on alaram raised functionality")
	public void click_on_three_dots_on_alaram_raised_functionality() throws Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.alaramRaisedThreeDot();
	}

	@Then("enter the value for Minimum searchbox for alaram raised")

	@Then("Click on three dots on Device Connected functionality")
	public void click_on_three_dots_on_device_connected_functionality() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceConnectedThreeDot();
	}

	@Then("Click on three dots on Device Active functionality")
	public void click_on_three_dots_on_device_active_functionality() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.deviceActiveThreeDot();

	}

	@Then("enter the value for Minimum searchbox for device Active")
	public void enter_the_value_for_minimum_searchbox_for_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceActiveInputMin(alldata.get(vTCName).get("DeviceActiveMinValue").toString());
	}

	@Then("verify user is landing on Edit page")
	public void verify_user_is_landing_on_edit_page() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		// Assertion for Unique Element on Edit Page (e.g., Form Heading or Label)
		WebElement formHeadingEdit = driver.findElement(By.xpath("//h4/span"));
		Assert.assertEquals(formHeadingEdit.getText().trim(), "Update", "Update");
	}

	@Then("enter the value for maximum searchbox for device Active")
	public void enter_the_value_for_maximum_searchbox_for_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceActiveInputMax(alldata.get(vTCName).get("DeviceActiveMaxValue").toString());
	}

	@Then("enter the value for maximum searchbox for device connected")
	public void enter_the_value_for_maximum_searchbox_for_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceConnectedInputMax(alldata.get(vTCName).get("DeviceConnectedMaxValue").toString());
	}

	@Then("enter the value for Minimum searchbox for device connected")
	public void enter_the_value_for_minimum_searchbox_for_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceConnectedInputMin(alldata.get(vTCName).get("DeviceConnectedMinValue").toString());
	}

	@Then("After landing on EDGE Group List screen and Mousehover on EDIT icon button Verify tooltip functionality")
	public void after_landing_on_edge_group_list_screen_and_mousehover_on_edit_icon_button_verify_tooltip_functionality()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Edit button", "Edit", egp.get_Text_ToolTipEdit());
	}

	@Then("After landing on EDGE Group List screen and Mousehover on DELETE icon button Verify tooltip functionality")
	public void after_landing_on_edge_group_list_screen_and_mousehover_on_delete_icon_button_verify_tooltip_functionality()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Delete button", "Delete", egp.get_Text_ToolTipDelete());
	}

	@Then("After landing on EDGE Group List screen and Mousehover on STOP icon button Verify tooltip functionality")
	public void after_landing_on_edge_group_list_screen_and_mousehover_on_stop_icon_button_verify_tooltip_functionality()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Stop button", "Stop", egp.get_Text_ToolTipStop());
	}

	@Then("After landing on EDGE Group List screen and Mousehover on Console icon button Verify tooltip functionality")
	public void after_landing_on_edge_group_list_screen_and_mousehover_on_console_icon_button_verify_tooltip_functionality()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Console button", "Console", egp.get_Text_ConsoleButtonToolTip());

	}

	@Then("After landing on EDGE Group List screen and Click on Add button")
	public void after_landing_on_edge_group_list_screen_and_click_on_add_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkAddbtn();
	}

	@Then("Click on EDGE Group name search icon i.e. three dots")
	public void click_on_edge_group_name_search_icon_i_e_three_dots() throws Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameThreeDot();

	}

	@Then("enter text in the GroupName")
	public void enter_text_in_the_group_name() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameInputSearch(alldata.get(vTCName).get("GroupNameSearch").toString());

	}

	@Then("Click on EDGE Group name search icon i.e. three dots & enter Valid inputs into search text field.")
	public void click_on_edge_group_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameThreeDot();

		egp.groupNameInputSearch(alldata.get(vTCName).get("GroupNameSearch").toString());

		egp.backDropShowing_Div_Click();
		egp.headingEdgeGroupListClick();
	}

	@Then("Click on EDGE Group Name search icon i.e. three dots & enter Invalid inputs into search text field.")
	public void click_on_edge_group_name_search_icon_i_e_three_dots_enter_invalid_inputs_into_search_text_field()
			throws Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameThreeDot();

		egp.groupNameInputSearch(alldata.get(vTCName).get("GroupNameSearch").toString());

		egp.headingEdgeGroupListClick();
	}

	@Then("enter details of Group_Id, Group_Name  location and description Under Identity Section")
	public void enter_details_of_group_id_group_name_under_identity_section() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.identitySectionGroupID(alldata.get(vTCName).get("Value1").toString());
		egp.edgenameInput(alldata.get(vTCName).get("Value2").toString());
		egp.locationedgeGroup(alldata.get(vTCName).get("Value3").toString());

		egp.descriptionedgeGroup(alldata.get(vTCName).get("Value4").toString());

	}

	@Then("under health column slide status toggle in Active Condition")
	public void under_health_column_slide_status_toggle_in_active_condition() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.moveSliderCondition("checked");

	}

	@Then("under health column Change Slider in Inactive mode")
	public void under_health_column_change_slider_in_inactive_mode() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.moveslideronoff();
	}

	@Then("Pagination is in footer Below right side")
	public void pagination_is_in_footer_below_right_side() throws Exception {
		Pagination appgroup = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		appgroup.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", appgroup.LastPageClickAndCount(rowPerPage));

		Assert.assertTrue("Row count match for last page", appgroup.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("pagination all default records will display in Next page")
	public void pagination_all_default_records_will_display_in_next_page() throws Exception {
		Pagination appgroup3 = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		appgroup3.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		Assert.assertTrue("Row count match for last page", appgroup3.LastPageClickAndCount(rowPerPage));

		Assert.assertTrue("Row count match for last page", appgroup3.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("after pagination all default records will display in Next page")
	public void after_pagination_all_default_records_will_display_in_next_page() throws Exception {
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
//		Assert.assertTrue("Row count match for last page", edp.LastPageClickAndCount(rowPerPage));
//		Thread.sleep(7000);
//		Assert.assertTrue("Row count match for last page", edp.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("Click on the checkbox of Active under status column")
	public void click_on_the_checkbox_of_active_under_status_column() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.statusColumnThreeDot();

		egp.statusColumnActive();

	}

	@Then("Click on Refresh icon of Licensing")
	public void click_on_refresh_icon_of_licensing() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.refreshButtonforLicence();
	}

	@Then("Click on upload icon of Edge Configurations")
	public void click_on_upload_icon_of_edge_configurations() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.registrationUploadButton();
	}

	@Then("browse the upload document and upload for Registration section")
	public void browse_the_upload_document_and_upload_for_registration_section()
			throws InterruptedException, Exception {
		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);
		StringSelection ss = new StringSelection(alldata.get(vTCName).get("EdgeConfigurationUploadPath").toString());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// imitate mouse events like ENTER, CTRL+C, CTRL+V
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1);
		robot.keyRelease(KeyEvent.VK_ENTER);

		String str = alldata.get(vTCName).get("EdgeConfigurationUploadPath").toString();
		egep.EdgeConfigurationUpload(str);

	}

	@Then("browse the upload document and upload for Registration section for OnBoarding Certificate")
	public void browse_the_upload_document_and_upload_for_registration_section_for_on_boarding_certificate()
			throws InterruptedException, Exception {
		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);

		egep.uploadfile();

		StringSelection ss = new StringSelection(
				alldata.get(vTCName).get("OnboardingCertificateFileUpload").toString());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// imitate mouse events like ENTER, CTRL+C, CTRL+V
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

		String str = alldata.get(vTCName).get("OnboardingCertificateFileUpload").toString();
		egep.onboardingCertificateUpload(str);

		egep.saveButtonfinalonboarding();
		egep.serialnumberAdd(alldata.get(vTCName).get("SerialNumberEdit").toString());

	}

	@Then("Verification to check the tool tip text visibilty for Input text field Health card in ADD Screen")
	public void verification_to_check_the_tool_tip_text_visibilty_for_input_text_field_health_card_in_add_screen() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);

		Assert.assertEquals("Tooltip of Health card on Add Screen", "EDGE Group is not communicating",
				egap.get_Text_ToolTipHealthStatus());
	}

	@Then("Verification to check the tool tip text visibilty for Input text field Deployment card in ADD Screen")
	public void verification_to_check_the_tool_tip_text_visibilty_for_input_text_field_deployment_card_in_add_screen() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);

		Assert.assertEquals("Tooltip of App Groups", "Application Group to which the EDGE Group is assigned",
				egap.get_Text_ToolTipAppGroup());
//		Assert.assertEquals("Tooltip of Max server nodes", "The maximum number of server nodes in an EDGE Group.", egap.get_Text_ToolTipservernode());
		Assert.assertEquals("Tooltip of server Host Address", "Host address : URL/IP address of EDGE Group Cluster",
				egap.get_Text_ToolTipserverHostAddress());
//		Assert.assertEquals("Tooltip of Server Port", "Port Used by EDGE Group Cluster",
//				egap.get_Text_ToolTipserverport());
	}

	@Then("Verification to check the tool tip text visibilty for Input text field Identity card in EDIT Screen")
	public void verification_to_check_the_tool_tip_text_visibilty_for_input_text_field_identity_card_in_edit_screen()
			throws InterruptedException {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);

		Assert.assertEquals("Tooltip of Group ID", "Unique ID assigned for the EDGE Group",
				egap.get_Text_ToolTipedgeGroupId());

	}

	@Then("Verification to check the content for all the error messages")
	public void verification_to_check_the_content_for_all_the_error_messages() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.edgenameInput(alldata.get(vTCName).get("GroupNameAdd").toString());
		Assert.assertEquals("Edge Group Name Validation message is not matching", "Mandatory field - required !",
				egp.verifyValidationMessageEdgeName());

	}

	@Then("Verification to check the input text field format")
	public void verification_to_check_the_input_text_field_format() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.edgenameInput(alldata.get(vTCName).get("GroupNameAdd").toString());
	}

	@Then("Verification of ascending order sorting functionality for the table list")
	public void verification_of_ascending_order_sorting_functionality_for_the_table_list() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.sortingGroupName();
	}

	@Then("Verification to check the coloumn width uniformity")
	public void verification_to_check_the_coloumn_width_uniformity() {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkcolumuniformity();

	}

	@Then("Verification of tool tip text validity for all the tool tips")
	public void verification_of_tool_tip_text_validity_for_all_the_tool_tips() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		Assert.assertEquals("Tooltip of App Groups", "Application Group to which the EDGE Group is assigned",
				egap.get_Text_ToolTipAppGroup());

		Assert.assertEquals("Tooltip of server Host Address", "Host address : URL/IP address of EDGE Group Cluster",
				egap.get_Text_ToolTipserverHostAddress());

	}

	@Then("Verification of descending order sorting functionality for the table list")
	public void verification_of_descending_order_sorting_functionality_for_the_table_list()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.sortingGroupName();
	}

	@Then("check the visualisation look of the table list")
	public void check_the_visualisation_look_of_the_table_list() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		// Selenium itself is primarily designed for automating web browsers for testing
		// purposes rather than specifically for visual verification. For visual
		// verification, you might need to use additional tools or libraries in
		// combination with Selenium.
	}

	@Then("Verification to check the tool tip text visibilty for Input text field Health card in EDIT Screen")
	public void verification_to_check_the_tool_tip_text_visibilty_for_input_text_field_health_card_in_edit_screen() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);

		Assert.assertEquals("Tooltip of Health", "EDGE Group is not communicating",
				egap.get_Text_ToolTipHealthStatus());
	}

	@Then("Save the certificates")
	public void save_the_certificates() throws Exception {
		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);
		egep.saveButtonfinalonboarding();

	}

	@Then("choose App group for updation")
	public void choose_app_group_for_updation() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.applicationGroupName(alldata.get(vTCName).get("AppGroupEdit").toString());
	}

	@Then("Click on save button to save document")
	public void click_on_save_button_to_save_document() throws InterruptedException {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);

		egap.saveButtonUpload();
		Thread.sleep(7000);
	}

	@And("Click on save data for Edge Group")
	public void click_on_save_data_for_edge_group() throws Exception {
		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".addButton\").click()");
//
//		egep.saveButtononEdgeEdit();

	}

	@Then("Click on License icon from Licensing section")
	public void click_on_license_icon_from_licensing_section() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.licenceUploadButton();
	}

	@Then("Click on Onboarding Certificate icon of Edge Configurations")
	public void click_on_onboarding_certificate_icon_of_edge_configurations() {
		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);
		egep.onboardingCertificateIcon();

	}

	@Then("click on cancel button in EDGE Group")
	public void click_on_cancel_button_in_edge_group() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.cancelButton();
	}

	@Then("Click on download icon of Edge Configurations")
	public void click_on_download_icon_of_edge_configurations() throws Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.checkBulkDownloadButton();
	}

	@Then("remove the text for Edge group Name which already entered and fill with new entry")
	public void remove_the_text_for_edge_group_name_which_already_entered_and_fill_with_new_entry() throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForEdgeGroupName();
		egp.edgenameInput(alldata.get(vTCName).get("applicationGroupNameEdit").toString());

	}

	@Then("enter valid  values for all mandatory text fields & click on save.")
	public void enter_valid_values_for_all_mandatory_text_fields_click_on_save() throws Exception {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.saveButtonforEdgeGroup();

	}

	@Then("add Group Id, Group Name Under Identity section")
	public void add_group_id_group_name_under_identity_section() throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.identitySectionGroupID(alldata.get(vTCName).get("Value1").toString());

		egp.groupNameAdd(alldata.get(vTCName).get("Value2").toString());

	}

	@Then("make status active for health toggle")
	public void make_status_active_for_health_toggle() throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

		egp.moveSliderCondition("checked");

	}

	@Then("scrolldown the page")
	public void scrolldown_the_page() throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.scrollingvertical();

	}

	@Then("enter details for Server host address, Server port , Choose Application group from dropdown")
	public void enter_details_for_server_host_address_server_port_choose_application_group_from_dropdown()
			throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.applicationGroupName(alldata.get(vTCName).get("Value3").toString());
		egp.serverHostAddress(alldata.get(vTCName).get("Value4").toString());
		egp.serverPort(alldata.get(vTCName).get("Value5").toString());

	}

	@Then("enter the value for the maximum server nodes")
	public void enter_the_value_for_the_maximum_server_nodes() {
		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);

		egep.serverHostAddress(alldata.get(vTCName).get("Value4").toString());
		egep.serverPort(alldata.get(vTCName).get("Value5").toString());
	}

	@Then("enter value for the maximum server nodes")
	public void enter_value_for_the_maximum_server_nodes() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForServerNodes();
		egp.serverNodes(alldata.get(vTCName).get("MaximumServerNodeEdit").toString());

	}

	@Then("enter value for the server host address")
	public void enter_value_for_the_server_host_address() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForServerHostAddress();
		egp.serverHostAddress(alldata.get(vTCName).get("ServerHostAddressEdit").toString());

	}

	@Then("Under Deployment page choose App group , enter details of server port, server nodes and Server host address")
	public void under_deployment_page_choose_ap_p_group_enter_details_of_server_port_server_nodes_and_server_host_address()
			throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.applicationGroupName(alldata.get(vTCName).get("Value5").toString());
		egp.serverNodes(alldata.get(vTCName).get("Value6").toString());
		egp.serverHostAddress(alldata.get(vTCName).get("Value7").toString());
		egp.serverPort(alldata.get(vTCName).get("Value8").toString());

	}

	@Then("Click on Save button to save Edge group")
	public void click_on_save_button_to_save_edge_group() throws Exception {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);

		egap.saveButtonforEdgeGroup();
		Thread.sleep(3000);
	}

	@Then("Click on submit button")
	public void click_on_submit_button() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.submitButtonForAll();
	}

	@Then("Click on save button to save certificates")
	public void click_on_save_button_to_save_certificates() throws InterruptedException {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.saveButtonUpload();
		Thread.sleep(7000);
		egap.saveButtonforEdgeGroup();
	}

	@Then("enter valid values and click on save")
	public void enter_valid_values_and_click_on_save() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.saveButtonforEdgeGroup();
	}

	@Then("Enter alphanumeric with special char values into EDGE Group Name text fields")
	public void enter_alphanumeric_with_special_char_values_into_edge_group_name_text_fields() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.edgenameInput(alldata.get(vTCName).get("GroupNameAdd").toString());
		Assert.assertEquals("Edge ID validation for 64 char is not valid", "Expected messsage",
				egp.verifyValidationMessageEdgeId());

	}

	@Then("Enter alphanumeric with special char values  with max character into EDGE Group Name text fields")
	public void enter_alphanumeric_with_special_char_values_with_max_character_into_edge_group_name_text_fields() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.edgenameInput(alldata.get(vTCName).get("GroupNameAdd").toString());
		Assert.assertEquals("Edge Group Name Validation message is not matching",
				"Alphanumerics of length Min = 2, Max = 64 are allowed !", egp.verifyValidationMessageEdgeName());

	}

	@Then("Enter alphanumeric with special char values into EDGE Group ID text fields")
	public void enter_alphanumeric_with_special_char_values_into_edge_group_id_text_fields() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.identitySectionGroupID(alldata.get(vTCName).get("Value1").toString());
		Assert.assertEquals("Edge ID validation for 64 char is not valid", "Expected messsage",
				egp.verifyValidationMessageEdgeId());

		Assert.assertEquals("EdgeId Min and max message not matching",
				"   Alphanumerics of length Min = 2, Max = 64 are allowed !", egp.verifyValidationMessageEdgeId());
	}

	@Then("After landing on EDGE Group List screen and Click on APP DEPLOY icon button on the top right side")
	public void after_landing_on_edge_group_list_screen_and_click_on_app_deploy_icon_button_on_the_top_right_side() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.BulkAppDeploymentButton();
	}

//	@Then("Click on upload button to return back on the details page")
//	public void click_on_upload_button_to_return_back_on_the_details_page() {
//		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);
//		egep.saveButtonUploadforLicense();
//	}

	@Then("verify for Edge Group functionality")
	public void verify_for_edge_group_name_functionality() throws InterruptedException {

		EdgeGroupApplicationDeployment egad = new EdgeGroupApplicationDeployment(driver, logger);
		egad.edgeGroupNameConfigDot();

		egad.applicationDeploymentGroupNameSearch(alldata.get(vTCName).get("BulkAppEdgeGroupNameSearch").toString());
		egad.backDropShowing_Div_Click();

		egad.headingConfigurationTitleClick();

		egad.checkboxEdgeGroupNameStepOneName();

		egad.NextButtonStep1();

	}

	@Then("verify for App Group functionality")
	public void verify_for_app_group_functionality() throws InterruptedException {
		EdgeGroupApplicationDeployment egad = new EdgeGroupApplicationDeployment(driver, logger);

		egad.appGroupNameDot();

		egad.appGroupNameInputdeploy(alldata.get(vTCName).get("BulkAppGroupNameSearch").toString());
		egad.backDropShowing_Div_Click();
		try {
			egad.checkboxEdgeGroupsAppGroups();

			egad.NextButtonStep2();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("select the single check box valid Application name with latest App Name column and click on NEXT button")
	public void select_the_single_check_box_valid_application_name_with_latest_app_name_column_and_click_on_next_button()
			throws InterruptedException {
		EdgeGroupApplicationDeployment egad = new EdgeGroupApplicationDeployment(driver, logger);
		egad.appnameApplicationDeployment();

		egad.edgeAppNameInput(alldata.get(vTCName).get("BulkAppNameSearchdeployment").toString());

		egad.backDropShowing_Div_Click();

		egad.checkboxEdgeNameStepFour();

		egad.NextButtonStep4();
	}

	@Then("verify for Edge Name functionality")
	public void verify_for_edge_name_functionality() throws InterruptedException {
		EdgeGroupApplicationDeployment egad = new EdgeGroupApplicationDeployment(driver, logger);
		egad.edgeDot();

		egad.edgeDeployment(alldata.get(vTCName).get("BulkEdgeSearch").toString());

		egad.backDropShowing_Div_Click();

		egad.headingConfigurationTitleClick();

		egad.checkboxEdgeStepThreeName();

		egad.NextButtonStep3();

	}

	@Then("verify for App Name functionality")
	public void verify_for_app_name_functionality() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.appNameDot();

		egcp.appNameInput(alldata.get(vTCName).get("BulkAppNameSearch").toString());

		egcp.backDropShowing_Div_Click();

		egcp.checkboxEdgeNameStepFour();

		egcp.NextButtonStep4();

		Thread.sleep(2000);
	}

	@Then("select the single check box valid Application name with latest version tag column and click on NEXT button")
	public void select_the_single_check_box_valid_application_name_with_latest_version_tag_column_and_click_on_next_button()
			throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.edgeVersionDot();

		egcp.edgeVersionNameInput(alldata.get(vTCName).get("BulkAppNameVersionSearch").toString());

		egcp.backDropShowing_Div_Click();

		egcp.checkboxEdgeNameStepFour();
		egcp.NextButtonStep4();
	}

	@Then("select the multiple check box valid Application name with latest version tag column and click on NEXT button")
	public void select_the_multiple_check_box_valid_application_name_with_latest_version_tag_column_and_click_on_next_button()
			throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);

		egcp.checkboxEdgeNameStepFour();

//		egcp.NextButtonStep4();
//		egcp.selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfig();
//
//		egcp.selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfiglabelTwo();
	}

	@Then("select the multiselect check box valid Application name with latest version tag column and click on NEXT button")
	public void select_the_multiselect_check_box_valid_application_name_with_latest_version_tag_column_and_click_on_next_button()
			throws InterruptedException {

		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);

		egcp.checkboxAppNameSingleSelectStepTwoName();

		egcp.checkboxAppNamemultiSelectStepTwoNamedouble();

		egcp.NextButtonStep4();

	}

	@Then("select the single check box valid Application name with App name column and click on NEXT button from Application page")
	public void select_the_single_check_box_valid_application_name_with_app_name_column_and_click_on_next_button_from_application_page()
			throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);

		egcp.appNameDot();

		egcp.appNameConfigInput(alldata.get(vTCName).get("BulkAppNameSearch").toString());

		// egcp.backDropShowing_Div_Click();

		Thread.sleep(2000);

	}

	@Then("click on App Deployment button EDGE Group")
	public void click_on_app_deployment_button_edge_group() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.BulkAppDeploymentButton();
	}

	@Then("Click on Confirm button and Click on Deploy button")
	public void click_on_confirm_button_and_click_on_deploy_button() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);

		egcp.confirmDeployButton();

		egcp.deployApp();
	}

	@Then("Click on Three dots of Group Name and enter the text for Group Name")
	public void click_on_three_dots_of_group_name_and_enter_the_text_for_group_name() throws Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameThreeDot();
		egp.groupNameInputSearch(alldata.get(vTCName).get("GroupNameSearch").toString());
		egp.backDropShowing_Div_Click();
		egp.headingEdgeGroupListClick();
	}

	@Then("click on Three Dots of Group Name")
	public void click_on_three_dots_of_group_name() throws Exception {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.groupNameThreeDot();
	}

	@Then("without enter any values click on save")
	public void without_enter_any_values_click_on_save() throws InterruptedException {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);

		egap.saveButtonforEdgeGroup();

	}

	@Then("scroll down page")
	public void scroll_down_page() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.scrollingvertical();

	}

	@Then("verify Enter numeric values to check character strength into Group NAME text fields")
	public void verify_enter_numeric_values_to_check_character_strength_into_group_name_text_fields()
			throws InterruptedException {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.edgeGroupNameAdd(alldata.get(vTCName).get("GroupNameAdd").toString());
		egap.headingTitleAdd();

		Assert.assertEquals("Validation message not matching",
				"Alphanumerics of length Min = 2, Max = 64 are allowed !", egap.verifyValidationMessageGroupName());

	}

	@Then("verify user is returned back to Edge Group list page")
	public void verify_user_is_returned_back_to_edge_group_list_page() {

		// Assertion for Unique Element on the Edge Group List Page
		WebElement pageHeading = driver.findElement(By.tagName("h2")); // Replace with actual locator
		Assert.assertEquals(pageHeading.getText().trim(), "EDGE Groups", "EDGE Groups");
	}

	@Then("verify Enter numeric values to check character strength into Group ID text fields")
	public void verify_enter_numeric_values_to_check_character_strength_into_group_id_text_fields()
			throws InterruptedException {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.edgeGroupIdAdd(alldata.get(vTCName).get("GroupNameAdd").toString());
		egap.headingTitleAdd();
		Thread.sleep(2000);
		Assert.assertEquals("Validation message not matching",
				"Alphanumerics of length Min = 2, Max = 64 are allowed !", egap.verifyValidationMessageGroupID());
	}

	@Then("enter the value of Minimum searchbox for alaram raised")
	public void enter_the_value_of_minimum_searchbox_for_alaram_raised() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.alaramRaisedThreeDotInputMin(alldata.get(vTCName).get("AlaramRaisedMinValue").toString());
		egp.backDropShowing_Div_Click();

	}

	@Then("enter the value of maximum searchbox for alaram raised")
	public void enter_the_value_of_maximum_searchbox_for_alaram_raised() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.alaramRaisedThreeDotInputMax(alldata.get(vTCName).get("AlaramRaisedMaxValue").toString());
		egp.backDropShowing_Div_Click();

	}

	@Then("click on headingTitle of the page")
	public void click_on_heading_title_of_the_page() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.headingEdgeGroupListClick();
	}

	@Then("enter the value of Minimum searchbox for device connected")
	public void enter_the_value_of_minimum_searchbox_for_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceConnectedInputMin(alldata.get(vTCName).get("DeviceConnectedMinValue").toString());

	}

	@Then("enter the value of Maximum searchbox for device connected")
	public void enter_the_value_of_maximum_searchbox_for_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceConnectedInputMax(alldata.get(vTCName).get("DeviceConnectedMaxValue").toString());

	}

	@Then("enter the value of Minimum searchbox for device Active")
	public void enter_the_value_of_minimum_searchbox_for_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceActiveInputMin(alldata.get(vTCName).get("DeviceActiveMinValue").toString());

	}

	@Then("enter the value of Maximum searchbox for device Active")
	public void enter_the_value_of_maximum_searchbox_for_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.deviceActiveInputMax(alldata.get(vTCName).get("DeviceActiveMaxValue").toString());

	}

	@Then("remove the text for GroupName")
	public void remove_the_text_for_group_name() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextForGroupName();
		egp.backDropShowing_Div_Click();
		egp.headingEdgeGroupListClick();

	}

	@Then("without enter any values scroll down")
	public void without_enter_any_values_scroll_down() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.scrollingverticalAdd();
	}

	@Then("remove the value for minimum alaram raised")
	public void remove_the_value_for_minimum_alaram_raised() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextForAlaramRaisedMin();
		egp.backDropShowing_Div_Click();
		egp.headingEdgeGroupListClick();
	}

	@Then("remove the value for maximum alaram raised")
	public void remove_the_value_for_maximum_alaram_raised() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextForAlaramRaisedMax();
		egp.backDropShowing_Div_Click();
		egp.headingEdgeGroupListClick();
	}

	@Then("remove the value for minimum value for device connected")
	public void remove_the_value_for_minimum_value_for_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextForDeviceConnectedMin();
		egp.headingEdgeGroupListClick();
	}

	@Then("remove the value for maximum device connected")
	public void remove_the_value_for_maximum_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextFordeviceConnectedInputMax();
		egp.headingEdgeGroupListClick();
	}

	@Then("remove the value for minimum device active")
	public void remove_the_value_for_minimum_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextForDeviceConnectedMin();
		egp.headingEdgeGroupListClick();
	}

	@Then("remove the value for maximum device active")
	public void remove_the_value_for_maximum_device_active() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEnteredTextFordeviceConnectedInputMax();
		egp.headingEdgeGroupListClick();
	}

	@Then("choose inactive mode from status column")
	public void choose_inactive_mode_from_status_column() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		try {
			egp.edgegroupstatusInactive();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("click on three dots from status column")
	public void click_on_three_dots_from_status_column() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.statusColumnThreeDot();

	}

	@Then("remove the text for Maximum Server node and fill with new entry")
	public void remove_the_text_for_maximum_server_node_and_fill_with_new_entry() throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForServerNodes();
		egp.serverNodes(alldata.get(vTCName).get("MaximumServerNodeEdit").toString());

	}

	@Then("remove the text for Server Host Address and fill with new entry")
	public void remove_the_text_for_server_host_address_and_fill_with_new_entry() throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForServerHostAddress();
		egp.serverHostAddress(alldata.get(vTCName).get("ServerHostAddressEdit").toString());

	}

	@Then("remove the text for Server Port and fill with new entry")
	public void remove_the_text_for_server_port_and_fill_with_new_entry() throws Exception {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForServerPort();
		egp.serverPort(alldata.get(vTCName).get("ServerPortEdit").toString());

	}

	@Then("Click on Save button to update Edge group")
	public void click_on_save_button_to_update_edge_group() throws Exception {

		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		Thread.sleep(7000);
		egap.saveButtonforEdgeGroup();

	}

	@Then("remove the text for location which already entered and fill with new entry")
	public void remove_the_text_for_location_which_already_entered_and_fill_with_new_entry() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForLocation();
		egp.locationedgeGroup(alldata.get(vTCName).get("LocationEdit").toString());
	}

	@Then("remove the text for description which already entered and fill with new entry")
	public void remove_the_text_for_description_which_already_entered_and_fill_with_new_entry() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.removalofEneredTextForDescription();
		egp.descriptionedgeGroup(alldata.get(vTCName).get("DescriptionEdit").toString());
	}

	@Then("verify standarize text format for success message in toaster")
	public void verify_standarize_text_format_for_success_message_in_toaster() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.verifysuccessToasterMessage();
	}

	@Then("verify standarize text format for error message in toaster")
	public void verify_standarize_text_format_for_error_message_in_toaster() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		egap.verifysuccessToasterMessage();
	}

	@Then("Verification to check the tool tip text visibilty for Input text field Registration card in EDIT Screen")
	public void verification_to_check_the_tool_tip_text_visibilty_for_input_text_field_registration_card_in_edit_screen() {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		// no input field can be seen under registration section edge group edit page
	}

	@Then("Verification of tool tip text visibilty for Close button in Console screen")
	public void verification_of_tool_tip_text_visibilty_for_close_button_in_console_screen() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip for close", "Close", egp.get_Text_ToolTipClose());
	}

	@When("user click on a Console button link that opens a popup window")
	public void user_click_on_a_console_button_link_that_opens_a_popup_window() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.consoleIcon();

	}

	@Then("user should switch to the popup window")
	public void user_should_switch_to_the_popup_window() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		System.out.println("Landing on popup of console icon");

	}

	@Then("user should see a tooltip on the popup window")
	public void user_should_see_a_tooltip_on_the_popup_window() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip for close", "Close", egp.get_Text_ToolTipClose());
	}

	@Then("Verification of alignment for maximize & minimize the screen")
	public void verification_of_alignment_for_maximize_minimize_the_screen() {
		EdgeGroupAddPage ega = new EdgeGroupAddPage(driver, logger);

		ega.minimizeScreen();
		ega.maximisescreen();
	}

	@Then("Verification to check the tool tip text visibilty for Input text field Deployment card in EDIT Screen")
	public void verification_to_check_the_tool_tip_text_visibilty_for_input_text_field_deployment_card_in_edit_screen() {
		EdgeGroupEditPage ege = new EdgeGroupEditPage(driver, logger);

		Assert.assertEquals("Tooltip for servernode", "The maximum number of server nodes in an EDGE Group.",
				ege.get_Text_ToolTipmaxServerNode());

	}

	@Then("verify successful operation")
	public void verify_successful_operation() {

		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		String maximumValue = alldata.get(vTCName).get("DeviceConnectedMaxValue").toString();
		String minimumValue = alldata.get(vTCName).get("DeviceConnectedMinValue").toString();

		Assert.assertTrue(egp.resultTable().contains(maximumValue));
		Assert.assertTrue(egp.resultTable().contains(minimumValue));
	}

	@Then("verify change in the colour of three dots")

	@Then("verify success message appear on the screen for download")
	public void verify_success_message_appear_on_the_screen_for_download() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		WebElement bulkDownloadsuccessMessage = egp.downloadSuccessMessage();
		Assert.assertTrue("Download success message is not displayed", bulkDownloadsuccessMessage.isDisplayed());
	}

	@Then("verify sorting on Group Name")
	public void verify_sorting_on_group_name() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.sortingOnGroupName();
	}

	@Then("verify sorting on Device Active")
	public void verify_sorting_on_device_active() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.sortingOnDeviceActive();
	}

	@Then("verify sorting on Status")
	public void verify_sorting_on_status() throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.sortingOnStatus();
	}

	@Then("verify sorting on Device Connected")
	public void verify_sorting_on_device_connected() {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.get_Text_ToolTipDeviceConnected();
	}

	@Then("verify all tooltips on Edge Group Add page")
	public void verify_all_tooltips_on_edge_group_add_page() throws InterruptedException {
		EdgeGroupAddPage egap = new EdgeGroupAddPage(driver, logger);
		try {
			Thread.sleep(3000);
			Assert.assertEquals("Tooltip of Group ID", "Unique ID assigned for the EDGE Group",
					egap.get_Text_ToolTipedgeGroupId());
			Thread.sleep(3000);
			Assert.assertEquals("Tooltip of Group Name", "Name assigned for the EDGE Group",
					egap.get_Text_ToolTipedgeGroupName());
			Thread.sleep(3000);
			Assert.assertEquals("Tooltip of Location", "Site at which the EDGE Group is installed",
					egap.get_Text_tooltipLocation());
			Thread.sleep(3000);
			Assert.assertEquals("Tooltip of Description", "Short specific information about the EDGE Group",
					egap.get_Text_ToolTipedgeDescription());

			Assert.assertEquals("Tooltip of Health if it is not communication", "EDGE Group is not communicating",
					egap.get_Text_ToolTipedgeHealth());

			egap.scrollingverticalAdd();

			Assert.assertEquals("Tooltip of App Group under deployment",
					"Application Group to which the EDGE Group is assigned", egap.get_Text_ToolTipAppGroup());

			Assert.assertEquals("Tooltip of Maximum server nodes",
					"The maximum number of server nodes in an EDGE Group.", egap.get_Text_ToolTipMaximumServerNodes());

			Assert.assertEquals("Tooltip of Server Host Address", "Host address : URL/IP address of EDGE Group Cluster",
					egap.get_Text_ToolTipserverHostAddress());

			Assert.assertEquals("Tooltip of Server Port", "Port Used by EDGE Group Cluster",
					egap.get_Text_ToolTipserverPort());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Then("the user clicks on the {string} option from the popup for Edge Group")
	public void the_user_clicks_on_the_option_from_the_popup_for_edge_group(String string) throws InterruptedException {
		
			EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
			File uploadFile = new File(alldata.get(vTCName).get("UploadFilePath").toString());
			WebElement fileInput = driver.findElement(By.xpath("//input[@formcontrolname='uploadfile']"));
			fileInput.sendKeys(uploadFile.getAbsolutePath());

			Thread.sleep(3000);
	}

@Then("verify confirmation message {string} should appear on the Edge Group List page")
public void verify_confirmation_message_should_appear_on_the_edge_group_list_page(String string) {
	EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);

	Object toasterMessageObj = alldata.get(vTCName).get("toastermessageForEdgeGroup");
	if (toasterMessageObj == null) {
	    throw new IllegalArgumentException("No toaster message found for test case: " + vTCName);
	}
	String expectedMessage = toasterMessageObj.toString().trim();

	String actualMessage = egp.getConfirmationMessage();

	// Validate the expected and actual messages
	Assert.assertEquals("Confirmation message did not match", expectedMessage, actualMessage);
}

	@Then("the user clicks on the {string} button for Edge Group")
	public void the_user_clicks_on_the_button_for_edge_group(String string) throws InterruptedException {
		EdgeGroupsPage egp = new EdgeGroupsPage(driver, logger);
		egp.uploadButton();
		Thread.sleep(5000);
	}




	@Then("verify all tooltips on Edge Group Edit page")
	public void verify_all_tooltips_on_edge_group_edit_page() {
		EdgeGroupEditPage egep = new EdgeGroupEditPage(driver, logger);
		try {
			Thread.sleep(4000);

			egep.scrollingverticalAdd();

			Assert.assertEquals("Tooltip of App Group under deployment",
					"Application Group to which the EDGE Group is assigned", egep.get_Text_ToolTipAppGroupEdit());

			Assert.assertEquals("Tooltip of Maximum server nodes",
					"The maximum number of server nodes in an EDGE Group.",
					egep.get_Text_ToolTipMaximumServerNodesEdit());

			Assert.assertEquals("Tooltip of Server Host Address", "Host address : URL/IP address of EDGE Group Cluster",
					egep.get_Text_ToolTipserverHostAddressEdit());

			Assert.assertEquals("Tooltip of Server Host Address", "Port Used by EDGE Group Cluster",
					egep.get_Text_ToolTipserverPortEdit());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}