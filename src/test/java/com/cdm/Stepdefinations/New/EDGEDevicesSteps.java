package com.cdm.Stepdefinations.New;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Assume;

import com.cdm.Stepdefinations.BaseTest;
import com.cdm.pages.ConfigurationsPage;
import com.cdm.pages.DeviceLogs;
import com.cdm.pages.EdgeAppConfigurationPage;
import com.cdm.pages.EdgeDeploymentsPage;
import com.cdm.pages.Menu;
import com.cdm.pages.Pagination;
import com.cdm.pages.SettingsWellPage;
import com.cdm.pages.UserSettingsPage;
import com.cdm.pages.WellMapping;
import com.cdm.pages.Latest.EdgeDeviceAdd;
import com.cdm.pages.Latest.EdgeDeviceEdit;
import com.cdm.pages.Latest.EdgeDevicesPage;
import com.cdm.pages.Latest.EdgeGroupConfigurationPage;
import com.cdm.pages.Latest.EnvironmentalVariablePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EDGEDevicesSteps extends BaseTest {

	@Then("User enters valid values for all required text fields and selects right values from dropdown")
	public void user_enters_valid_values_for_all_required_text_fields_and_selects_right_values_from_dropdown()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd((alldata.get(vTCName).get("Edge ID Add").toString()));
		eda.identityedgeNameAdd((alldata.get(vTCName).get("Edge Name Add").toString()));
		eda.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());
		eda.edgeGroupNameAdd(alldata.get(vTCName).get("EDGE Group Name Add").toString());

		eda.locationAdd((alldata.get(vTCName).get("LocationAdd").toString()));

		eda.hardWareNameAdd((alldata.get(vTCName).get("Hardware Name Add").toString()));

		eda.descriptionAdd((alldata.get(vTCName).get("DescriptionAdd").toString()));

		eda.serialNumberInputAdd((alldata.get(vTCName).get("serialNumberInputAdd").toString()));
		eda.onBoardingKeyInputAdd((alldata.get(vTCName).get("onBoardingKeyInputAdd").toString()));
		eda.imageVersionInputAdd((alldata.get(vTCName).get("imageVersionInputAdd").toString()));

		String text = (alldata.get(vTCName).get("serverPortInputAdd").toString());
		eda.serverPortInputAdd(text);

		eda.applicationGroupSelect((alldata.get(vTCName).get("applicationGroupSelectAdd").toString()));

		eda.edgeUserInputAdd((alldata.get(vTCName).get("edgeUserInputAdd").toString()));
		eda.edgeUserPasswordAdd((alldata.get(vTCName).get("edgeUserPasswordAdd").toString()));
	}

	@Then("user clicks on the save button")
	public void user_clicks_on_the_save_button() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
	}

	@Then("Verify that newly added device is displayed in the edge device list view")
	public void verify_that_newly_added_device_is_displayed_in_the_edge_device_list_view() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.status();
		edp.statusInactive();
		edp.outerlayerclick();
		Thread.sleep(3000);

		edp.scrollingElementRightBar("div.example-container", "900");

		edp.edgeIdSearch_Button();

		edp.sendValueSearchIcon((alldata.get(vTCName).get("EDGEIDSearch").toString()));

		edp.backDropShowing_Div_Click();

	}

	@Then("After landing on the EDGE Device List screen, the user verifies the list view")
	public void after_landing_on_the_edge_device_list_screen_the_user_verifies_the_list_view() throws Exception {
		// Wait for the EDGE Device List screen to load

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("EDGE Devices", edp.verifyListScreenTitle());
		Assert.assertEquals("EDGE ID", edp.verifyheaderColumnEdgeID());
		Assert.assertEquals("EDGE Name", edp.verifyheaderColumnEdgeName());

	}

	@Then("User clicks on the ADD New button at the top right and lands on the EDGE ADD screen")
	public void user_clicks_on_the_add_new_button_at_the_top_right_and_lands_on_the_edge_add_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
	}

	@Then("User verifies that all required text fields and dropdown with correct labels are present")
	public void user_verifies_that_all_required_text_fields_and_dropdown_with_correct_labels_are_present()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		Assert.assertTrue("Organization dropdown label found", eda.getTextOrganizationNameLabel().contains("*"));
		eda.outerlayerclick();

		Assert.assertTrue("Edge Group Name label dropdown Found", eda.getTextEdgeGroupNameLabel().contains("*"));
		eda.outerlayerclick();
		Thread.sleep(5000);

		Assert.assertTrue("Hardware dropdown Found", eda.getTextHardwareLabel().contains("*"));
		eda.outerlayerclick();
		Thread.sleep(5000);

		Assert.assertTrue("Edge Id Label found", eda.getTextEdgeIdLabel().contains("*"));

		Assert.assertTrue("Edge Name Label found", eda.getTextEdgeNameLabel().contains("*"));

		Thread.sleep(5000);

		eda.scrollingvertical();

		Assert.assertTrue("App Group dropdown label found under Deployment accordion",
				eda.getTextAppGroupDropdownLabel().contains("*"));
		eda.outerlayerclick();
	}

	@Then("User verifies that labels for all required text fields are correct")
	public void user_verifies_that_labels_for_all_required_text_fields_are_correct() throws Exception {
		// Verify the label for "Identity"

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.verifyIdentityLabel("Identity");
		edp.verifyHealthLabel("Health");
		// Verify the label for "Registration"
		edp.verifyRegistrationLabel("Registration");
		edp.verifydeploymentLabel("Deployment");
		edp.verifyWellMappingLabel("Well Mapping");

	}

	@Then("User enters valid values for all required text fields")
	public void user_enters_valid_values_for_all_required_text_fields() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd((alldata.get(vTCName).get("Edge ID Add").toString()));
		eda.identityedgeNameAdd((alldata.get(vTCName).get("Edge Name Add").toString()));
		eda.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());
		eda.edgeGroupNameAdd(alldata.get(vTCName).get("EDGE Group Name Add").toString());

		eda.locationAdd((alldata.get(vTCName).get("LocationAdd").toString()));

		eda.hardWareNameAdd((alldata.get(vTCName).get("Hardware Name Add").toString()));

		eda.descriptionAdd((alldata.get(vTCName).get("DescriptionAdd").toString()));

		eda.serialNumberInputAdd((alldata.get(vTCName).get("serialNumberInputAdd").toString()));
		eda.onBoardingKeyInputAdd((alldata.get(vTCName).get("onBoardingKeyInputAdd").toString()));
		eda.imageVersionInputAdd((alldata.get(vTCName).get("imageVersionInputAdd").toString()));

		String text = (alldata.get(vTCName).get("serverPortInputAdd").toString());
		eda.serverPortInputAdd(text);

		eda.applicationGroupSelect((alldata.get(vTCName).get("applicationGroupSelectAdd").toString()));

		eda.edgeUserInputAdd((alldata.get(vTCName).get("edgeUserInputAdd").toString()));
		eda.edgeUserPasswordAdd((alldata.get(vTCName).get("edgeUserPasswordAdd").toString()));
	}

	@Then("User clicks on the Save button to add the Edge Device")
	public void user_clicks_on_the_save_button_to_add_the_edge_device() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
	}

	@Then("verify page with resize option the login page")
	public void verify_page_with_resize_option_the_login_page() {
		driver.manage().window().fullscreen();
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.setZoomLevel(800, 600);
	}

	@Then("check the alignmnet for maximise and minimize the screen")
	public void check_the_alignmnet_for_maximise_and_minimize_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assume.assumeFalse(
				"we can not automate alignment for maximise and minimise screen . It depends on the resolution of every device",
				false);
	}

	@Then("check verification of accessbility the filter icon for Group Name")
	public void check_verification_of_accessbility_the_filter_icon_for_group_name() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// edp.edgeGroupNameSearch_Button();

	}

	@Then("Verification of loading properly in slow network")
	public void verification_of_loading_properly_in_slow_network() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
	}

	@Then("Verification of alignment of  i.e. ADD,refresh,bulk upload,bulk download &bulk app deployment buttons top right side")
	public void verification_of_alignment_of_i_e_add_refresh_bulk_upload_bulk_download_bulk_app_deployment_buttons_top_right_side() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
	}

	@Then("Verification of visualization of icons in action column")
	public void verification_of_visualization_of_icons_in_action_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

	}

	@Then("Verification of visibilty the input field format")
	public void verification_of_visibilty_the_input_field_format() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
//		edp.edgeIdSearch_Button();
	}

	@Then("Verification of visibilty duration to load the page")
	public void verification_of_visibilty_duration_to_load_the_page() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

	}

	@Then("add all mandatory field of edge device")
	public void add_all_mandatory_field_of_edge_device() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd((alldata.get(vTCName).get("Edge ID Add").toString()));
		eda.identityedgeNameAdd((alldata.get(vTCName).get("Edge Name Add").toString()));
		eda.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());

		eda.edgeGroupNameAdd(alldata.get(vTCName).get("EDGE Group Name Add").toString());

		eda.locationAdd((alldata.get(vTCName).get("LocationAdd").toString()));

		eda.hardWareNameAdd((alldata.get(vTCName).get("Hardware Name Add").toString()));
		;
		eda.descriptionAdd((alldata.get(vTCName).get("DescriptionAdd").toString()));

		eda.serialNumberInputAdd((alldata.get(vTCName).get("serialNumberInputAdd").toString()));
		eda.onBoardingKeyInputAdd((alldata.get(vTCName).get("onBoardingKeyInputAdd").toString()));
		eda.imageVersionInputAdd((alldata.get(vTCName).get("imageVersionInputAdd").toString()));

		eda.serverPortInputAdd((alldata.get(vTCName).get("serverPortInputAdd").toString()));
		eda.applicationGroupSelect((alldata.get(vTCName).get("applicationGroupSelectAdd").toString()));

		eda.edgeUserInputAdd((alldata.get(vTCName).get("edgeUserInputAdd").toString()));
		eda.edgeUserPasswordAdd((alldata.get(vTCName).get("edgeUserPasswordAdd").toString()));
	}

	@Then("Verify success message in toaster")
	public void verify_success_message_in_toaster() {

	}

	@Then("verify error message verbaige for without entering details in ADD Screen of Edge Device")
	public void verify_error_message_verbaige_for_without_entering_details_in_add_screen_of_edge_device()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
		Assert.assertEquals("Edge ID validation ", "Mandatory field - required !",
				eda.validationMessageGroupNamewithout());
	}

	@Then("verify standarize text format for below EDGE ID text field")
	public void verify_standarize_text_format_for_below_edge_id_text_field() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
		Assert.assertEquals("Edge ID validation ", "Mandatory field - required !",
				eda.verifyValidationMessageEdgeName());
	}

	@Then("check verify the page in slow network")
	public void check_verify_the_page_in_slow_network() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// can not automate above scenario by using 2G and 3G speed , Its depends on
		// network speed on user
	}

	@Then("verify standarize text format for error message below EDGE Name text field")
	public void verify_standarize_text_format_for_error_message_below_edge_name_text_field()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
		Assert.assertEquals("Edge ID validation ", "Mandatory field - required !",
				eda.verifyValidationMessageEdgeName());
	}

	@Then("check verify the page by using mobile network")
	public void check_verify_the_page_by_using_mobile_network() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// can not automate above scenario by using 2G and 3G speed , Its depends on
		// network speed on user
	}

	@Then("verify user can able to login into browser copy & paste the url")
	public void verify_user_can_able_to_login_into_browser_copy_paste_the_url() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

	}

	@Then("verify tool tip text visibilty for Devices connected")
	public void verify_tool_tip_text_visibilty_for_devices_connected() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// no column exist for device connected under Edge Device
	}

	@Then("verify tool tip text visibilty for Status")
	public void verify_tool_tip_text_visibilty_for_status() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip for Status", "Search", edp.get_Text_StatusToolTip());

	}

	@Then("verify tooltip text for group name")
	public void verify_tooltip_text_for_group_name() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip for Edge Group Name", "EDGE Group to which the EDGE Device is assigned",
				edp.get_Text_edgeGroupNameToolTip());
	}

	@Then("verify tool tip text visibilty for Delete functionality button in Actions column")
	public void verify_tool_tip_text_visibilty_for_delete_functionality_button_in_actions_column()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		Assert.assertEquals("Tooltip for delete", "Delete", edp.get_Text_deleteToolTip());
	}

	@Then("verify tool tip text visibilty for Deploy button in Actions column")
	public void verify_tool_tip_text_visibilty_for_deploy_button_in_actions_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		Assert.assertEquals("Tooltip for deploy", "Deploy Apps", edp.get_Text_deployToolTip());
	}

	@Then("verify tool tip text visibilty for Input text field Identity card in ADD Screen")
	public void verify_tool_tip_text_visibilty_for_input_text_field_identity_card_in_add_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Tooltip for identity Card Edge Name", "Name assigned for the EDGE Device",
				eda.get_Text_EdgeNameToolTip());
	}

	@Then("verify tool tip text visibilty for Input text field Health card in ADD Screen")
	public void verify_tool_tip_text_visibilty_for_input_text_field_health_card_in_add_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Tooltip for healthCard",
				"The date (MM-DD-YYYY) and time (HH:MM) (+/- HH:MM) of the last communication from the EDGE Device.",
				eda.get_Text_HealthcardToolTip());
	}

	@Then("verify tool tip text visibilty for Input text field Deployment card in ADD Screen")
	public void verify_tool_tip_text_visibilty_for_input_text_field_deployment_card_in_add_screen()
			throws InterruptedException {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Tooltip for deployment card", "Port Used by EDGE Group Cluster",
				eda.get_Text_deploymentCardToolTip());
	}

	@Then("verify tool tip text visibilty for Input text field Health card in EDIT Screen")
	public void verify_tool_tip_text_visibilty_for_input_text_field_health_card_in_edit_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Tooltip for healthCard",
				"The date (MM-DD-YYYY) and time (HH:MM) (+/- HH:MM) of the last communication from the EDGE Device.",
				eda.get_Text_HealthcardToolTip());
	}

	@Then("Verify to check the tool tip text visibilty for Input text field Deployment card in EDIT Screen")
	public void verify_to_check_the_tool_tip_text_visibilty_for_input_text_field_deployment_card_in_edit_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Tooltip for deployment card", "Port Used by EDGE Group Cluster",
				eda.get_Text_deploymentCardToolTip());
	}

	@Then("verify tool tip text visibilty for Input text field Deployment card in EDIT Screen")
	public void verify_tool_tip_text_visibilty_for_input_text_field_deployment_card_in_edit_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Tooltip for deployment card", "Port Used by EDGE Group Cluster",
				eda.get_Text_deploymentCardToolTip());
	}

	@Then("verify to check the labels of input text fields")
	public void verify_to_check_the_labels_of_input_text_fields() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("label for identity", "Identity", eda.getlabelidentity());
	}

	@Then("verify tool tip text visibilty for EDIT button in Actions column")
	public void verify_tool_tip_text_visibilty_for_edit_button_in_actions_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip for Edit", "Edit", edp.get_Text_ToolTipEdit());
	}

	@Then("verify tool tip text visibilty for Devices Active")
	public void verify_tool_tip_text_visibilty_for_devices_active() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// no data exist for device active under edge device
	}

	@Then("check verify the page is accessible by using wi-fi network")
	public void check_verify_the_page_is_accessible_by_using_wi_fi_network() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// can not automate above scenario by using 2G and 3G speed , Its depends on
		// network speed on user
	}

	@Then("check verification of accessbility the filter icon for Alarms Raised")
	public void check_verification_of_accessbility_the_filter_icon_for_alarms_raised() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		// can not automate because the column does not exist for alaram raised
	}

	@Then("check verification to check the column width & size resolution")
	public void check_verification_to_check_the_column_width_size_resolution() {
		// While Selenium is primarily used for functional testing and automating
		// interactions with web applications, it's not specifically designed for
		// testing accessibility features of web pages
	}

	@Then("check verification of accessbility the filter icon for status")
	public void check_verification_of_accessbility_the_filter_icon_for_status() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		// can not automate because the column does not exist for for status
	}

	@Then("check verification of accessbility the filter icon for Devices Connected")
	public void check_verification_of_accessbility_the_filter_icon_for_devices_connected() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// can not automate because the column does not exist for device connected // We
		// can not test accessibility Testing through automation

	}

	@Then("check verification of accessbility the filter icon for Devices active")
	public void check_verification_of_accessbility_the_filter_icon_for_devices_active() {

	}

	@Then("verify error message verbaige for entering invalid details for EDGE Name Text field in ADD screen")
	public void verify_error_message_verbaige_for_entering_invalid_details_for_edge_name_text_field_in_add_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeNameAdd(alldata.get(vTCName).get("Edge Name Add").toString());
		eda.saveAddData();
		Assert.assertEquals("Edge Name validation ", "Mandatory field - required !",
				eda.validationMessageinvalidEdgeName());
	}

	@Then("verify error message verbaige for not entering details for EDGE ID Text field in ADD screen")
	public void verify_error_message_verbaige_for_not_entering_details_for_edge_id_text_field_in_add_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd(alldata.get(vTCName).get("Edge Name Add").toString());
		eda.saveAddData();
		Assert.assertEquals("Edge ID validation ", "Mandatory field - required !",
				eda.verifyValidationMessageEdgeId1());
	}

	@Then("verify error message verbaige for not entering details for EDGE Name Text field in ADD screen")
	public void verify_error_message_verbaige_for_not_entering_details_for_edge_name_text_field_in_add_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeNameAdd(alldata.get(vTCName).get("Edge Name Add").toString());
		eda.saveAddData();

		Assert.assertEquals("Edge Name validation ", "Mandatory field - required !",
				eda.validationMessageinvalidEdgeName());
	}

	@Then("Verification of error message verbaige for not selecting details for EDGE GROUP NAME")
	public void verification_of_error_message_verbaige_for_not_selecting_details_for_edge_group_name() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// eda.outerlayerclick();
	}

	@Then("Verification of error message verbaige for not selecting details for Organisation")
	public void verification_of_error_message_verbaige_for_not_selecting_details_for_organisation() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// eda.outerlayerclick();
	}

	@Then("Verification of error message verbaige for not selecting details Hardware Name")
	public void verification_of_error_message_verbaige_for_not_selecting_details_hardware_name() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// eda.outerlayerclick();
	}

	@Then("Verification of error message verbaige for entering invalid details for Organisation")
	public void verification_of_error_message_verbaige_for_entering_invalid_details_for_organisation() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// atleast one entry should be choose for orgainzation . here we can not check
		// invalid details under dropdown as this is not input field

	}

	@Then("Verification of check filter icon availability for Devices Active column")
	public void verification_of_check_filter_icon_availability_for_devices_active_column() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// No column exist for device Active column
	}

	@Then("Verification of check filter icon availability for Device Connected")
	public void verification_of_check_filter_icon_availability_for_device_connected() {

	}

	@Then("Verification of check filter icon availability for Alarm raised")
	public void verification_of_check_filter_icon_availability_for_alarm_raised() {

	}

	@Then("Verification of error message verbaige for entering invalid details for App Group Name")
	public void verification_of_error_message_verbaige_for_entering_invalid_details_for_app_group_name() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// atleast one entry should be choose for App Group Name . here we can not check
		// invalid details under dropdown as this is not input field
	}

	@Then("Verification of error message verbaige for entering invalid details for Hardware Name")
	public void verification_of_error_message_verbaige_for_entering_invalid_details_for_hardware_name() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// eda.outerlayerclick();
	}

	@Then("Verification of error message verbaige for entering invalid details for EDGE GROUP NAME")
	public void verification_of_error_message_verbaige_for_entering_invalid_details_for_edge_group_name() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// atleast one entry should be choose for EdgeGroup name . here we can not check
		// invalid details under dropdown as this is not input field
	}

	@Then("verify application functionality for single select choice")
	public void verify_application_functionality_for_single_select_choice() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);

		egcp.titleApplicationDeployment();
		egcp.appNameDot();
		egcp.appNameInput(alldata.get(vTCName).get("appNameApplicationConfiguration").toString());
		egcp.backDropShowing_Div_Click();
		egcp.titleApplicationDeployment();

		;

		egcp.NextButtonStep4();
	}

	@Then("verify application functionality for single select")
	public void verify_application_functionality_for_single_select() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.titleApplicationDeployment();
		// egcp.appNameDot();
		// egcp.appNameInput(alldata.get(vTCName).get("Value4").toString());
		// egcp.backDropShowing_Div_Click();
		// egcp.titleApplicationDeployment();

		egcp.checkboxAppNameSingleSelectStepTwoName();
		egcp.checkboxAppNameSingleSelectStepTwoNamedouble();

		egcp.NextButtonStep4();
	}

	@Then("check pagination per page")
	public void check_pagination_per_page() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		;

		System.out.println(edp.recordsperpage());

	}

	@Then("verify validation of alphanumeric values for Edge ID")
	public void verify_validation_of_alphanumeric_values_for_edge_id() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		String edgeIDData = alldata.get(vTCName).get("EDGE ID").toString();
		eda.identityedgeIdInputAdd(edgeIDData);
		String result = eda.identityedgeIdInputGet();
		Assert.assertEquals(result, edgeIDData);

//		if(edgeIDData.matches("^[\\p{L}0-9'#]+$")){
//			eda.identityedgeIdInputAdd(edgeIDData);
//
//		}
	}

	@Then("make health status in Active mode")
	public void make_health_status_in_active_mode() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.moveSliderCondition("checked");

	}

	@Then("Verfication of visibilty the input field format")
	public void verfication_of_visibilty_the_input_field_format() {
		// can not automate visibility input field
	}

	@Then("Verfication of alignment of  i.e. ADD,refresh,bulk upload,bulk download &bulk app deployment buttons top right side")
	public void verfication_of_alignment_of_i_e_add_refresh_bulk_upload_bulk_download_bulk_app_deployment_buttons_top_right_side() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// Can not automate alignment through automation
	}

	@Then("Verfication of visualization of icons in action column")
	public void verfication_of_visualization_of_icons_in_action_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
	}

	@Then("Verify switching between inputs fields using TAB")
	public void verify_switching_between_inputs_fields_using_tab() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assume.assumeTrue("Test case is not valid", false);
	}

	@Then("verify the colour of three dots")
	public void verify_the_colour_of_three_dots() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assume.assumeTrue("Colour of the kebab menu is white ", false);
	}

	@Then("verify check filter icon visibility for Alarms raised")
	public void verify_check_filter_icon_visibility_for_alarms_raised() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// There are no columns exist for alaram raised henceforth can check filter icon
		// visibility for alarams raised
	}

	@Then("verify check filter icon visibility for Devices Connected column")
	public void verify_check_filter_icon_visibility_for_devices_connected_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// There are no columns exist for device connected

	}

	@Then("check visibilty the input field format")
	public void check_visibilty_the_input_field_format() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeNameAddDisplayed();
	}

	@Then("Verfication of visibilty duration to load the page")
	public void verfication_of_visibilty_duration_to_load_the_page() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assume.assumeTrue(
				"can not check visibility duration to laod page it depends on various factor as 2G , 3G network",
				false);

	}

	@Then("After landing on EDGE Device List screen Click on Configuration icon from the column of edge List page")
	public void after_landing_on_edge_device_list_screen_click_on_configuration_icon_from_the_column_of_edge_list_page() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.configurationIcon();

	}

	@Then("Verification of check filter icon availability for Status column")
	public void verification_of_check_filter_icon_availability_for_status_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.status();

	}

	@Then("Click on EDGE Device module from side menu bar")
	public void click_on_edge_device_module_from_side_menu_bar() {
		Menu edp = new Menu(driver, logger);

		String strTitle = alldata.get(vTCName).get("EdgeDeviceTitleList").toString();
		edp.clickEdgeDevices(strTitle);

	}

	@Then("Verify all buttons are working")
	public void click_and_verify_refresh_button_is_working() throws InterruptedException {

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// edp.clickRefreshButton();
		Assert.assertTrue("Refresh button is not visible", edp.isVisibleRefresh());

		Assert.assertTrue("Add button is not visible", edp.isVisibleAdd());

		Assert.assertTrue("Upload button is not visible", edp.isVisibleUpload());

		Assert.assertTrue("Download button is not visible", edp.isVisibleDownload());

		System.out.println("All buttons are present");
	}

	@Then("After landing on EDGE Device List screen, and Click on Refresh button on the top right side")
	public void after_landing_on_edge_device_list_screen_and_click_on_refresh_button_on_the_top_right_side() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickRefreshButton();

	}

	@Then("After landing on EDGE Device List screen, Click on ADD New button on the top right side")
	public void after_landing_on_edge_device_list_screen_click_on_add_new_button_on_the_top_right_side() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();

	}

	@Then("After landing on EDGE Device List screen, Click on Search bar after entering data")
	public void after_landing_on_edge_device_list_screen_click_on_search_bar_after_entering_data() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("EDGE ID").toString());
	}

	@Then("After landing on EDGE Device List screen please Mousehover on EDIT icon button")
	public void after_landing_on_edge_device_list_screen_please_mousehover_on_edit_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip of Edit button", "Edit", edp.get_Text_ToolTipEdit());
	}

	@Then("Click on Bulk Application Configuration icon button on the top right side.")
	public void click_on_bulk_application_configuration_icon_button_on_the_top_right_side() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickConfiguration();

	}

	@Then("After landing on EDGE Device List screen Click on bulk Download icon button on the top right side")
	public void after_landing_on_edge_device_list_screen_click_on_bulk_download_icon_button_on_the_top_right_side()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.clickDownload();

	}

	@Then("After landing on EDGE Device List screen scroll horizontal and Click on DELETE icon button")
	public void after_landing_on_edge_device_list_screen_scroll_horizontal_and_click_on_delete_icon_button()
			throws InterruptedException {

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.clickDeleteButton();

	}

	@Then("Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen")
	public void click_on_deploy_apps_button_on_the_actions_column_landed_on_edge_application_deployment_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickondeployimage();
	}

	@Then("confirmation message appear on the Screen for deletion with option Yes or No")
	public void confirmation_message_appear_on_the_screen_for_deletion_with_option_yes_or_no() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		try {
			// edp.Confirmation_YesButton();
		} catch (Exception e) {
			// TODO: handle exception
		}
		edp.Confirmation_NoButton();

	}

	@Then("Hover the mouse pointer View ALERTS icon Button in ACTIONS columns")
	public void hover_the_mouse_pointer_view_alerts_icon_button_in_actions_columns() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assume.assumeTrue("Alert module removed", false);
	}

	@Then("Click on EDGE ID search icon i.e. three dots.")
	public void click_on_edge_id_search_icon_i_e_three_dots() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();

	}

	@Then("verify upload functionality for onboarding configuration")
	public void verify_upload_functionality_for_onboarding_configuration() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assume.assumeTrue("upload functionality removed from edge device ", false);
	}

	@Then("check download feature for onboarding configuration")
	public void check_download_feature_for_onboarding_configuration() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assume.assumeTrue("download functionality for onboarding configuration removed from edge device ", false);
	}

	@Then("Click on EDGE ID name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_id_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("EDGE ID").toString());
		Thread.sleep(2000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();

	}

	@Then("Click on EDGE ID name search icon i.e. three dots & enter one of the existing EDGE ID")
	public void click_on_edge_id_name_search_icon_i_e_three_dots_enter_one_of_the_existing_edge_id()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("EDGEIDSearch").toString());
		Thread.sleep(3000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();

	}

	@Then("Click on EDGE Name search icon i.e. three dots & enter one of the existing EDGE Name")
	public void click_on_edge_name_search_icon_i_e_three_dots_enter_one_of_the_existing_edge_name()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("EDGENameSearch").toString());
		Thread.sleep(3000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();
	}

	@Then("Verify the row with the EDGE ID Provided is return")
	public void verify_the_row_with_the_edge_id_provided_is_return() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		int rowCount = edp.getRowCount();
		System.out.println("Row Count: " + rowCount);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = edp.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Verify the row with the EDGE Name Provided is return")
	public void verify_the_row_with_the_edge_name_provided_is_return() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		int rowCount = edp.getRowCount();
		System.out.println("Row Count: " + rowCount);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = edp.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Click on EDGE Group name search icon i.e. three dots & enter one of the existing Edge Group Name")
	public void click_on_edge_group_name_search_icon_i_e_three_dots_enter_one_of_the_existing_edge_group_name() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeGroupNameSearch_Button();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("EDGEGroupNameSearch").toString());
		Thread.sleep(3000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();
	}
	@Then("Verify the row with the EDGE Group Name Provided is return")
	public void verify_the_row_with_the_edge_group_name_provided_is_return() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		int rowCount = edp.getRowCount();
		System.out.println("Row Count: " + rowCount);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = edp.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Click on APP Group name search icon i.e. three dots & enter one of the existing App Group Name")
	public void click_on_app_group_name_search_icon_i_e_three_dots_enter_one_of_the_existing_app_group_name() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeAppGroupsSearch_Button();
		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("AppGroupNameSearch").toString());
		Thread.sleep(3000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();
	}
	@Then("Verify the row with the App Group Name Provided is return")
	public void verify_the_row_with_the_app_group_name_provided_is_return() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		int rowCount = edp.getRowCount();
		System.out.println("Row Count: " + rowCount);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = edp.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Remove the Hardward Name search field")
	public void remove_the_hardward_name_search_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.removalofEneredTextHardWareName();
		edp.outerlayerclick();
		}
	@Then("Click on Hardware name search icon i.e. three dots & enter one of the existing Hardware Name")
	public void click_on_hardware_name_search_icon_i_e_three_dots_enter_one_of_the_existing_hardware_name() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.hardwareNameSearchDot();
		edp.hardwareNameInput(alldata.get(vTCName).get("HardwareNameSearch").toString());
		Thread.sleep(3000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();
	}
	@Then("Verify the row with the Hardware Name Provided is return")
	public void verify_the_row_with_the_hardware_name_provided_is_return() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		int rowCount = edp.getRowCount();
		System.out.println("Row Count: " + rowCount);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = edp.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}




	@Then("modify the value of mandatory field of Identity Section")
	public void modify_the_value_of_mandatory_field_of_identity_section() throws InterruptedException {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEnteredTextForEdgeName();
		ede.identityedgeNameUpdate(alldata.get(vTCName).get("Edge Name Update").toString());

		ede.edgeGroupNameUpdate(alldata.get(vTCName).get("Edge Group Name Update").toString());

		ede.hardwareNameUpdate(alldata.get(vTCName).get("Hardware Name Update").toString());

	}


	@Then("modify the value of optional field of Identity section")
	public void modify_the_value_of_optional_field_of_identity_section() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEneredTextForLocation();
		ede.locationUpdate(alldata.get(vTCName).get("LocationUpdate").toString());

		ede.removalofEneredTextForDescription();
		ede.descriptionUpdate(alldata.get(vTCName).get("DescriptionUpdate").toString());

	}

	@Then("Click on EDGE Id field search icon i.e. three dots & enter Valid inputs into search text field.")
	public void click_on_edge_id_field_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("EDGE ID").toString());
		Thread.sleep(8000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();

	}

	@Then("After pagination all default records will display in Next page.")
	public void after_pagination_all_default_records_will_display_in_next_page() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);

		// int rowPerPage = Integer.parseInt(value);

		// Assert.assertTrue("Row count match for Next page",
		// p.nextPageClickAndCountOnLastPage(rowPerPage));

	}

	@Then("Click on APP Group name search icon i.e. three dots & enter Valid inputs into search text field.")
	public void click_on_app_group_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeAppGroupsSearch_Button();
		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("App Groups").toString());
		edp.backDropShowing_Div_Click();
	}

	@Then("Click on three dots & enter Valid inputs into search text field.")
	public void click_on_three_dots_enter_valid_inputs_into_search_text_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value1").toString());

	}

	@Then("Click on bulk upload button for Edge Device")
	public void click_on_bulk_upload_button_for_edge_device() throws InterruptedException, AWTException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.fileupload();
		try {
			Robot rb = new Robot();

			// copying File path to Clipboard
			StringSelection str = new StringSelection(alldata.get(vTCName).get("BulkUpload").toString());
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("Click on search icon i.e. three dots & search text field visible")
	public void click_on_search_icon_i_e_three_dots_search_text_field_visible() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.edgeIdSearch_Button();
		Assert.assertTrue("EdgeId search text box is not visible", edp.isVisibleEdgeIdSearchbox());

	}

	@Then("Click and Verify Bulk Download button is working")
	public void click_and_verify_bulk_download_button_is_working() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickDownload();

	}

	@Then("verify downloaded alert popup message")
	public void verify_downloaded_alert_popup_message() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Verify Pop up message text", "Downloading Successful", edp.get_Text_bulkDownload());

		// edp.verifyalertfordownload();

	}

	@Then("Click and Verify Bulk Application Configuration button is working")
	public void click_and_verify_bulk_application_configuration_button_is_working() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.Configuration_Icon_Button();
	}

	@Then("Enter valid inputs as per required from table details into search text field and enter backspace & click on enter")
	public void enter_valid_inputs_as_per_required_from_table_details_into_search_text_field_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.edgeIdSearch_Button();

		edp.sendValueSearchIcon(alldata.get(vTCName).get("EDGE ID").toString());
		;
		edp.removalofEneredTextForEdgeId();
		edp.backDropShowing_Div_Click();
		edp.headingClick();
		Thread.sleep(7000);

//		edp.edgeNameSearch_Button();
//		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("EDGE Name").toString());
//
//		edp.removalofEneredTextForEdgeName();
//		edp.backDropShowing_Div_Click();
//
//		edp.headingClick();
//
//		Thread.sleep(7000);
//		edp.headingClick();

//		edp.edgeGroupNameSearch_Button();
//		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("EDGE Group Name").toString());
//		edp.removalofEneredTextForEdgeGroupName();
//		edp.backDropShowing_Div_Click();
//		edp.headingClick();
//		;
//
//         edp.edgeAppGroupsSearch_Button();
//		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("App Groups").toString());
//
//		edp.removalofEneredTextForAppGroups();
//		edp.backDropShowing_Div_Click();
//		edp.headingClick();
//
//		edp.scrollingElementRightBar("div.example-container", "900");
//
//		edp.hardwareNameSearchDot();
//		edp.hardwareNameInput(alldata.get(vTCName).get("Hardware Name").toString());
//		edp.removalofEneredTextHardWareName();
//		edp.backDropShowing_Div_Click();
//		edp.headingClick();

	}

	@Then("scroll up")
	public void scroll_up() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.scrollingup();

	}

	@Then("Enter valid inputs as per required from table details into search text field & click on enter")
	public void enter_valid_inputs_as_per_required_from_table_details_into_search_text_field_click_on_enter() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.backDropShowing_Div_Click();
		edp.edgeIdSearch_Button();

		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());

		edp.backDropShowing_Div_Click();
		edp.edgeNameSearch_Button();

		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value2").toString());

		edp.backDropShowing_Div_Click();
		edp.edgeGroupNameSearch_Button();

		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value3").toString());

		edp.backDropShowing_Div_Click();
		edp.edgeAppGroupsSearch_Button();

		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("Value4").toString());

		edp.scrollingElementRightBar("div.example-container", "900");

		edp.backDropShowing_Div_Click();
		edp.hardwareNameSearchDot();

		edp.hardwareNameInput(alldata.get(vTCName).get("Value5").toString());

	}

	@Then("Click on search menu bar on the top of the screen.")
	public void click_on_search_menu_bar_on_the_top_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();

	}

	@Then("Enter invalid inputs into search text field & click on search")
	public void enter_invalid_inputs_into_search_text_field_click_on_search() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.backDropShowing_Div_Click();
		edp.edgeIdSearch_Button();

		edp.sendValueSearchIcon(alldata.get(vTCName).get("Value1").toString());

		edp.headingClick();

		edp.edgeNameSearch_Button();

		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value2").toString());

		edp.headingClick();

		edp.edgeGroupNameSearch_Button();

		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("Value3").toString());

		edp.headingClick();

		edp.edgeAppGroupsSearch_Button();

		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("Value4").toString());

		edp.headingClick();

		edp.scrollingElementRightBar("div.example-container", "900");

		edp.hardwareNameSearchDot();

		edp.hardwareNameInput(alldata.get(vTCName).get("Value5").toString());

		edp.headingClick();

	}

	@Then("Click on ADD New button on the top right side")
	public void click_on_add_new_button_on_the_top_right_side() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();

	}

	@Then("After landing on EDGE Device List screen")
	public void after_landing_on_edge_device_list_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Verify title of the breadcrumb does not match", "EDGE Devices",
				edp.get_Text_EdgeListHeading());

	}

	@Then("Click on ADD New button on the top right side & landed on EDGE>ADD Screen")
	public void click_on_add_new_button_on_the_top_right_side_landed_on_edge_add_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();

	}

	@Then("without enter any values")
	public void without_enter_any_values() {
		System.out.println("Put all input field blanks");
	}

	@Then("scroll down")
	public void scroll_down() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.scrollingvertical();

	}

	@Then("scroll down to deployment section")
	public void scroll_down_to_deployment_section() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.scrollingvertical();
	}

	@Then("click on save button")
	public void click_on_save_button() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// eda.saveAddData();
	}

	@Then("Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen")
	public void click_on_add_new_button_icon_on_the_top_right_side_landed_on_edge_add_screen()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();

	}

	@Then("click on cancel button in EDGE>ADD screen")
	public void click_on_cancel_button_in_edge_add_screen() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.cancelData();

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Verify title of the breadcrumb does not match", "EDGE Devices",
				edp.get_Text_EdgeListHeading());

	}

	@Then("Click on Deploy apps button on the Actions column")
	public void click_on_deploy_apps_button_on_the_actions_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
		edp.clickondeployimage();

	}

	@Then("landed on EDGE>Application Deployment screen")
	public void landed_on_edge_application_deployment_screen() {

		EdgeGroupConfigurationPage egc = new EdgeGroupConfigurationPage(driver, logger);

		Assert.assertEquals("Edge Group Configuration breadcrum does not matching ",
				"EDGE Devices > Application Deployment", egc.verifyDeployBreadcrumb());
	}

	@Given("move to EdgeDevices tab")
	public void move_to_edge_devices_tab() {
		// Write code here that turns the phrase above into concrete actions
		initiationData();
	}

	@Then("EdgeDevices tab should open")
	public void edge_devices_tab_should_open() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("After landing on EDGE Device List screen please Mousehover on DELETE icon button")
	public void after_landing_on_edge_device_list_screen_please_mousehover_on_delete_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip of delete button", "Delete", edp.get_Text_ToolTipDelete());

	}

	@Then("enter valid values for all text fields")
	public void enter_valid_values_for_all_text_fields() throws InterruptedException {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd((alldata.get(vTCName).get("Edge ID Add").toString()));
		eda.identityedgeNameAdd((alldata.get(vTCName).get("Edge Name Add").toString()));
		eda.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());
		eda.edgeGroupNameAdd(alldata.get(vTCName).get("EDGE Group Name Add").toString());

		eda.locationAdd((alldata.get(vTCName).get("LocationAdd").toString()));

		eda.hardWareNameAdd((alldata.get(vTCName).get("Hardware Name Add").toString()));

		eda.descriptionAdd((alldata.get(vTCName).get("DescriptionAdd").toString()));

		eda.serialNumberInputAdd((alldata.get(vTCName).get("serialNumberInputAdd").toString()));
		eda.onBoardingKeyInputAdd((alldata.get(vTCName).get("onBoardingKeyInputAdd").toString()));
		eda.imageVersionInputAdd((alldata.get(vTCName).get("imageVersionInputAdd").toString()));

		try {
			String text = (alldata.get(vTCName).get("serverPortInputAdd").toString());
			eda.serverPortInputAdd(text);

		} catch (Exception e) {
			e.printStackTrace();
		}
		eda.applicationGroupSelect((alldata.get(vTCName).get("applicationGroupSelectAdd").toString()));

		eda.edgeUserInputAdd((alldata.get(vTCName).get("edgeUserInputAdd").toString()));
		eda.edgeUserPasswordAdd((alldata.get(vTCName).get("edgeUserPasswordAdd").toString()));

	}

	@Then("Enter numeric values into EDGE ID text fields")
	public void enter_numeric_values_into_edge_id_text_fields() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.identityedgeIdInputAdd(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("Enter numeric values to check character strength into EDGE ID text fields")
	public void enter_numeric_values_to_check_character_strength_into_edge_id_text_fields()
			throws InterruptedException {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd(alldata.get(vTCName).get("Edge ID Add").toString());

		eda.headingTitleAdd();

		// Assert.assertEquals("Error message", "Please enter a valid EDGE ID !",
		// eda.verifyValidationMessageEdgeId1());

		Assert.assertEquals("Validation message", "Alphanumerics of length Min = 2, Max = 64 are allowed !",
				eda.verifyValidationMessageEdgeId());

	}

	@Then("verify standarize text format for error message below Oraganisation text field")
	public void verify_standarize_text_format_for_error_message_below_oraganisation_text_field()
			throws InterruptedException {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd((alldata.get(vTCName).get("Edge ID Add").toString()));
		eda.identityedgeNameAdd((alldata.get(vTCName).get("Edge Name Add").toString()));

		eda.saveAddData();
	}

	@Then("verify standarize text format for error message below EDGE Group text field")
	public void verify_standarize_text_format_for_error_message_below_edge_group_text_field()
			throws InterruptedException {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.edgeGroupNameAdd(alldata.get(vTCName).get("EDGE Group Name Add").toString());

		eda.headingTitleAdd();

		Assert.assertEquals("Validation message", "Mandatory field - required ! ",
				eda.validationMessageGroupNamewithout());

	}

	@Then("Enter alphanumeric with special char values to check character strength into EDGE NAME text fields on Add Screen")
	public void enter_alphanumeric_with_special_char_values_to_check_character_strength_into_edge_name_text_fields_on_add_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.identityedgeNameAdd(alldata.get(vTCName).get("Edge Name Add").toString());

		eda.headingTitleAdd();

		Assert.assertEquals("Edge Name error message", "Please Enter a valid EDGE Name !",
				eda.verifyValidationMessageEdgeName1());
	}

	@Then("Enter numeric values to check character strength into EDGE Name text fields of Edit Section")
	public void enter_numeric_values_to_check_character_strength_into_edge_name_text_fields_of_edit_section()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.identityedgeNameAdd(alldata.get(vTCName).get("Edge Name Add").toString());

		Assert.assertEquals("Edge Name error message", "Please Enter a valid EDGE Name !",
				eda.verifyValidationMessageEdgeName());
	}

	@Then("Click & select options from Organization drop down")
	public void click_select_options_from_organization_drop_down() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());
	}

	@Then("modify few text fields i.e. EDGE NAME,assigned to\\(Operator)and Description text fields")
	public void modify_few_text_fields_i_e_edge_name_assigned_to_operator_and_description_text_fields() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("EdgeName search text box is not empty", "", edp.removalofEneredTextForEdgeName());

		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);

		ede.identityedgeName(alldata.get(vTCName).get("Value4").toString());
	}

	@Then("Click & select options from EDGE Group Name drop down")
	public void click_select_options_from_edge_group_name_drop_down() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.edgeGroupNameAdd(alldata.get(vTCName).get("EDGE Group Name Add").toString());
	}

	@Then("click on save button on add page")
	public void click_on_save_button_on_add_page() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();

		Thread.sleep(8000);
	}

	@Then("Enter numeric values to check character strength into EDGE NAME text fields")
	public void enter_numeric_values_to_check_character_strength_into_edge_name_text_fields()
			throws InterruptedException {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeNameAdd(alldata.get(vTCName).get("EDGE Name").toString());
		eda.headingTitleAdd();
		;
		Assert.assertEquals("Please Enter a valid EDGE Name !", eda.verifyValidationMessageEdgeName());

	}

	@Then("Click on EDIT \\(Pen icon) button on the Actions column & landed on EDGE>UPDATE Screen")
	public void click_on_edit_pen_icon_button_on_the_actions_column_landed_on_edge_update_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.scrollingElementRightBar("div.example-container", "900");

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.editEdgeDeviceClick();
	}

	@Then("modify few text fields like EDGE NAME & click on Save button")
	public void modify_few_text_fields_i_e_edge_id_edge_name_click_on_save_button() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.setEditClearField();

		ede.identityedgeName(alldata.get(vTCName).get("Value2").toString());

		ede.saveAddData();

	}

	@Then("fill details of Edge Id , Edge Name , Select dropdown organization")
	public void fill_details_of_edge_id_edge_name_select_dropdown_organization() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.identityedgeIdInputAdd((alldata.get(vTCName).get("Value1").toString()));

		eda.identityedgeNameAdd((alldata.get(vTCName).get("Value2").toString()));

		eda.organizationAdd(alldata.get(vTCName).get("Value3").toString());

	}

	@Then("select value from dropdown Edge Group Name")
	public void select_value_from_dropdown_edge_group_name() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.edgeGroupNameAdd(alldata.get(vTCName).get("EDGE Group Name Add").toString());

	}

	@Then("enter the role of assigner")
	public void enter_the_role_of_assigner() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.assignedToAdd((alldata.get(vTCName).get("AssignedToAdd").toString()));

	}

	@Then("select hardwareName from hardware dropdown")
	public void select_hardware_name_from_hardware_dropdown() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.hardWareNameAdd(alldata.get(vTCName).get("HardWare Name Add").toString());

		eda.scrollingvertical();

	}

	@Then("Scrolldown bar and inside regisration accordion add Serial Number , Onboarding Key, Image Version")
	public void scrolldown_bar_and_inside_regisration_accordion_add_serial_number_onboarding_key_image_version()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.serialNumberInputAdd(alldata.get(vTCName).get("serialNumberInputAdd").toString());

		eda.onBoardingKeyInputAdd(alldata.get(vTCName).get("onBoardingKeyInputAdd").toString());

		eda.imageVersionInputAdd(alldata.get(vTCName).get("imageVersionInputAdd").toString());

	}

	@Then("enter Edge user and password inside well mapping accordion")
	public void enter_edge_user_and_password_inside_well_mapping_accordion() throws InterruptedException {

		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.edgeUserInputAdd(alldata.get(vTCName).get("Value12").toString());

		eda.edgeUserPasswordAdd(alldata.get(vTCName).get("Value13").toString());
		;
	}

	@Then("click on save button to add Edge")
	public void click_on_save_button_to_add_edge() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
	}

	@Then("click on save")
	public void click_on_save() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();

	}

	@Then("Click on Edit icon button on Actions Column & landed on EDGE> edit page")
	public void click_on_edit_icon_button_on_actions_column_landed_on_edge_edit_page() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.editEdgeDeviceClick();
	}

	@Then("After landing on EDGE Device module List screen scoll page to right side")
	public void after_landing_on_edge_device_module_list_screen_scoll_page_to_right_side() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickEditButton();
	}

	@Then("update the EdgeName , Organization, groupName, AssignedTo, HardWareName and Description")
	public void update_the_edge_name_organization_group_name_assigned_to_hard_ware_name_and_description()
			throws InterruptedException {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		;
		ede.clearEnteredName();
		;
		ede.identityedgeNameUpdate(alldata.get(vTCName).get("Value2").toString());

		ede.updatesaveAddDataBtn();
	}

	@Then("enter value for HardWare Name")
	public void enter_value_for_hard_ware_name() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.hardwareNameInput(alldata.get(vTCName).get("Hardware Name").toString());
		;
	}

	@Then("Click on HardWare Name Dots")
	public void click_on_hard_ware_name_dots() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
		edp.hardwareNameSearchDot();
	}

	@Then("Click on Communication Status search icon i.e. three dots & select desire communication status for edge")
	public void click_on_communication_status_search_icon_i_e_three_dots_select_desire_communication_status_for_edge()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.communicationStatusThreeDot();
		Thread.sleep(1000);

		edp.communicationconnected();
		edp.deselectCheckboxforconnected();
		Thread.sleep(1000);

		edp.communicationDisconnected();
		edp.deselectCheckboxforDisconnected();
		Thread.sleep(1000);

		edp.BrokerDisconnected();
		edp.deselectCheckboxforBrokerdisconnected();
		Thread.sleep(1000);

		edp.EdgeDisconnected();
		edp.deselectCheckboxforEdgeDisconnected();

	}

	@Then("Click on EDGE Group name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_group_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.edgeGroupNameSearch_Button();

		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("EDGE Group Name").toString());
		edp.backDropShowing_Div_Click();
	}

	@Then("Click on Deployments tab")
	public void click_on_deployments_tab() throws InterruptedException {
		EdgeDeploymentsPage dp = new EdgeDeploymentsPage(driver, logger);
		dp.deploymenttoggle();

	}

	@Then("Click on Deployment Edge Name and search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_deployment_edge_name_and_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		EdgeDeploymentsPage dp = new EdgeDeploymentsPage(driver, logger);
		dp.deploymentAppNamethreedots();
		dp.deploymentAppName(alldata.get(vTCName).get("Value17").toString());

	}

	@Then("Click on Deployment Status and search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_deployment_status_and_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		EdgeDeploymentsPage dp = new EdgeDeploymentsPage(driver, logger);
		dp.deploymentStatusNamethreedots();
		dp.deploymentStatusInput(alldata.get(vTCName).get("Value18").toString());
		dp.backDropShowing_Div_Click();

	}

	@Then("verify Status in Deployment List")
	public void verify_status_in_deployment_list() {
		EdgeDeploymentsPage dp = new EdgeDeploymentsPage(driver, logger);
		dp.backDropTransparent_Div_Click();
		Assert.assertEquals("Deployment Status is not valid", alldata.get(vTCName).get("Value18").toString(),
				dp.get_Text_EdgeDeploymentStatus());

	}

	@Then("verify Expected Version in Deployment List")
	public void verify_expected_version_in_deployment_list() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("Click on pagination it will display default records will display")
	public void click_on_pagination_it_will_display_default_records_will_display() throws Exception {
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		// Assert.assertTrue("Row count match for last page",
		// edp.LastPageClickAndCount(rowPerPage));
		Thread.sleep(7000);
		// Assert.assertTrue("Row count match for last page",
		// edp.nextPageClickAndCountOnLastPage(rowPerPage));

	}

	@Then("After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button")
	public void after_landing_on_edge_device_list_screen_scroll_horizontal_and_click_on_edit_icon_button()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		;
		edp.clickEditButton();

		;

	}

	@Then("Scroll down page go to the registration section of Edit screen and enter value for onboarding Key")
	public void scroll_down_page_go_to_the_registration_section_of_edit_screen_and_enter_value_for_onboarding_key() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.scrollingvertical();

		ede.removalofEneredTextForOnboardingKey();

		ede.ongoingBoardUpdate(alldata.get(vTCName).get("OnboardingKeyEdit").toString());
	}

	@Then("Click on Environment Variable")
	public void click_on_environment_variable() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.environmentalVariableTab();
	}

	@Then("Click on Add new button")
	public void click_on_add_new_button() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.environmentalVariableAddButton();

	}

	@Then("Click and Verify Add button is working")
	public void click_and_verify_add_button_is_working() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
	}

	@Then("Enter details for Config Name and Config Value")
	public void enter_details_for_config_name_and_config_value() throws InterruptedException {

		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.configNameInput(alldata.get(vTCName).get("environmentalConfigNameAdd").toString());

		ev.configValueInput(alldata.get(vTCName).get("environmentalConfigValueAdd").toString());

	}

	@Then("Click on Add new button of Environmental variable")
	public void click_on_add_new_button_of_environmental_variable() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.environmentalVariableAddButton();
	}

	@Then("Click on Environmental variable Tab")
	public void click_on_environmental_variable_tab() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.environmentalVariableTab();
	}

	@Then("inactivate environmental variable")
	public void inactivate_environmental_variable() throws InterruptedException {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.moveSliderCondition("unchecked");

		ev.moveSliderCondition("checked");

		ev.moveSliderCondition("unchecked");

	}

	@Then("Click on save button for environmental variable")
	public void click_on_save_button_for_environmental_variable() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.saveDataConfig();
	}

	@Then("Click on Delete button")
	public void click_on_delete_button() throws InterruptedException {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.deleteButtonConfigClick();

		ev.confirmationYesDeleteButton();
		// ev.confirmationCancelDeleteButton();
	}

	@Then("Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_id_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		//
		edp.sendValueSearchIcon(alldata.get(vTCName).get("EDGE ID").toString());

		edp.backDropShowing_Div_Click();
		edp.headingClick();

	}

	@Then("Click on Edit button")
	public void click_on_edit_button() throws InterruptedException {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.clickEditevButton();
		ev.clickInputField();
		ev.environmentalConfigName(alldata.get(vTCName).get("Value20").toString());
		ev.clickInputFieldconfigValue();
		ev.environmentalConfigValue(alldata.get(vTCName).get("Value21").toString());
		ev.saveDataConfig();
	}

	@Then("Click on bulk upload button")
	public void click_on_bulk_upload_button() throws IOException {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.bulkUploadButton();

		ev.uploadConfig(alldata.get(vTCName).get("Value22").toString());

	}

	@Then("Click on search icon of configName")
	public void click_on_search_icon_of_config_name() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.configNameSearchThreeDot();
		ev.searchconfigNameValue(alldata.get(vTCName).get("confignamesearch").toString());

		ev.backDropShowing_Div_Click();

	}

	@Then("Enter details for Config Name")
	public void enter_details_for_config_name() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.configNameInput(alldata.get(vTCName).get("environmentalConfigNameAdd").toString());

	}

	@Then("Click on search icon of configValue")
	public void click_on_search_icon_of_config_value() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.configValueSearchThreeDot();
		ev.searchconfigValue(alldata.get(vTCName).get("configvaluesearch").toString());
	}

	@Then("Enter details for Config Value")
	public void enter_details_for_config_value() {
		EnvironmentalVariablePage ev = new EnvironmentalVariablePage(driver, logger);
		ev.configValueInput(alldata.get(vTCName).get("environmentalConfigValueAdd").toString());

	}

	@Then("Click on EDGE Group ID search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_group_id_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field() {

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeGroupNameSearch_Button();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("EDGE Group Name Add").toString());
	}

	@Then("Click on Device Log Tab")
	public void click_on_device_log_tab() throws InterruptedException {
		DeviceLogs dl = new DeviceLogs(driver, logger);
		dl.deviceLogTab();

	}

	@Then("Click on Configuration Tab")
	public void click_on_config_tab() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configTabmain();
	}

	@Then("Click on Configuration submodule")
	public void click_on_config_submodule() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.configsubmodule();
	}

	@Then("Click on Well Mapping Tab")
	public void click_on_well_mapping_tab() throws InterruptedException {
		WellMapping wp = new WellMapping(driver, logger);
		wp.wellmappingClick();
		wp.wellMappingSearchDot();
		wp.wellMappingSearchInput(alldata.get(vTCName).get("WellNameSearch").toString());

		wp.backDropShowing_Div_Click();
		wp.headingClick();

		wp.selectedCheckboxforWell();

	}

	@Then("Scroll down page go to the registration section of add screen and enter value for onboarding Key")
	public void scroll_down_page_go_to_the_registration_section_of_add_screen_and_enter_value_for_onboarding_key() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.scrollingvertical();
		ede.serialNumberInput(alldata.get(vTCName).get("serialNumberInputAdd").toString());
		ede.ongoingBoardUpdate(alldata.get(vTCName).get("OnboardingKeyAdd").toString());
		ede.saveAddData();
	}

	@Then("Click on Pagination is in footer Below left side")
	public void click_on_pagination_is_in_footer_below_left_side() throws Exception {
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		edp.SelectPageMatOption(value);
		try {
			int rowPerPage = Integer.parseInt(value);
//			Assert.assertTrue("Row count match for last page", edp.LastPageClickAndCount(rowPerPage));
//
//			Assert.assertTrue("Row count match for last page", edp.nextPageClickAndCountOnLastPage(rowPerPage));
		} catch (NumberFormatException e) {

		}

	}

	@Then("Click on Pagination is in footer\\(Below) right side")
	public void click_on_pagination_is_in_footer_below_right_side() throws Exception {

		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
//		Assert.assertTrue("Row count match for last page", edp.LastPageClickAndCount(rowPerPage));
//
//		Assert.assertTrue("Row count match for last page", edp.nextPageClickAndCountOnLastPage(rowPerPage));

	}

	@Then("Click on APP DEPLOY  icon button on Actions Column & landed on EDGE>Application Configuration Screen")
	public void click_on_app_deploy_icon_button_on_actions_column_landed_on_edge_application_configuration_screen() {
		EdgeDeploymentsPage dp = new EdgeDeploymentsPage(driver, logger);
		dp.deploymenticonColumnsection();

	}

	@Then("After landing on EDGE Device List screen scroll horizontal")
	public void after_landing_on_edge_device_list_screen_scroll_horizontal() {

		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
	}

	@When("Click on Bulk Application Configuration button")
	public void click_on_bulk_application_configuration_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.Configuration_Icon_Button();

	}

	@Then("verify App Group functionality")
	public void verify_app_group_functionality() throws InterruptedException {
		EdgeAppConfigurationPage eacp = new EdgeAppConfigurationPage(driver, logger);
		eacp.appGroupNameDot();

		eacp.appGroupNameInputdeploy(alldata.get(vTCName).get("Value1").toString());

		eacp.backDropShowing_Div_Click();

		eacp.checkboxEdgeGroupNameStepOneName();

		eacp.NextButtonStep1();
		;
	}

	@Then("verify Edge Device functionality")
	public void verify_edge_device_functionality() throws InterruptedException {
		EdgeAppConfigurationPage eacp = new EdgeAppConfigurationPage(driver, logger);
		eacp.deploymentEdgeGroupId();

		eacp.applicationconfigurationEdgeIDDevice(
				alldata.get(vTCName).get("applicationconfigurationEdgeIDDevice").toString());

		eacp.backDropShowing_Div_Click();

		eacp.checkboxEdgeNameStepFour();

		eacp.NextButtonStep2();
		;
	}

	@Then("verify application functionality")
	public void verify_application_functionality() throws InterruptedException {

		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);

		egcp.appNameDot();

		egcp.appNameInput(alldata.get(vTCName).get("appNameInput").toString());

		egcp.backDropShowing_Div_Click();

		egcp.selectedCheckboxapplicationselectcheckboxforEdgeDeviceconfig();

		egcp.NextButtonStep3();

	}

	@Then("verify breaching of max character limit")
	public void verify_breaching_of_max_character_limit() {
		EdgeDeviceEdit edp = new EdgeDeviceEdit(driver, logger);
		String s = alldata.get(vTCName).get("Value2").toString();

		edp.edgeUserNameUpdate(s);
		// edp.headingClick();
		// String message=edp.getUserNameUpdateMessage();

	}

	@Then("Verify Configuration functionality")
	public void verify_configuration_functionality() throws InterruptedException {
		EdgeAppConfigurationPage eacp = new EdgeAppConfigurationPage(driver, logger);
		eacp.ConfigNameAppDeploymentDot();
		eacp.ConfigNameAppDeploymentInput(alldata.get(vTCName).get("ConfigNameAppDeploymentInput").toString());
		eacp.backDropShowing_Div_Click();
		eacp.headingConfigurationBulk();

		eacp.checkboxConfiguration();
		Thread.sleep(8000);

		eacp.NextButtonStep4();

	}

	@Then("search for Edge Group Name")
	public void search_for_edge_group_name() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeGroupNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("EDGE Name").toString());
		edp.backDropShowing_Div_Click();
		edp.headingClick();
	}

	@When("Click on configuration icon button from Action column")
	public void click_on_configuration_icon_button_from_action_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.configurationIcon();
	}

	@Then("Click on Configurations module from left navigation bar")
	public void click_on_configurations_module_from_left_navigation_bar() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.ConfigurationsTab();
	}

	@Then("Verify deployment functionality")
	public void verify_deployment_functionality() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.confirmClick();
		;
		edp.deployButtonClick();
		;

	}

	@And("click on edit button beside search items")
	public void click_on_edit_button_beside_search_items() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickEditButton();

	}

	@Then("Click on save well map")
	public void click_on_save_well_map() {
		WellMapping wp = new WellMapping(driver, logger);
		wp.saveWellData();
	}

	@Then("search for Edge ID enter the value for Edge ID and Clear Search")
	public void search_for_edge_id_enter_the_value_for_edge_id_and_clear_search() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("EDGE ID").toString());
		edp.backDropShowing_Div_Click();
		edp.headingClick();
		edp.edgeIdSearch_Button();
		edp.removalofEneredTextForEdgeId();
		edp.backDropShowing_Div_Click();

	}

	@Then("After pagination all default records will display")
	public void after_pagination_all_default_records_will_display() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);

		int rowPerPage = Integer.parseInt(value);

		p.nextPageClickAndCountOnLastPage(rowPerPage);
		// Assert.assertTrue("Row count match",
		// p.nextPageClickAndCountOnLastPage(rowPerPage));

	}

	@Then("search for Edge Name enter the value for Edge Name and Clear Search")
	public void search_for_edge_name_enter_the_value_for_edge_name_and_clear_search() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("EDGE Name").toString());
		edp.backDropShowing_Div_Click();
		edp.headingClick();

	}

	@Then("Enter alphanumeric with special char values to check character strength into EDGE NAME text fields")
	public void enter_alphanumeric_with_special_char_values_to_check_character_strength_into_edge_name_text_fields()
			throws InterruptedException {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEnteredTextForEdgeName();
		ede.identityedgeNameEdit(alldata.get(vTCName).get("Edge Name Update").toString());

		ede.headingeditclick();

		Assert.assertEquals("Validation message", "Please Enter a valid EDGE Name !",
				ede.verifyValidationMessageEdgeName());
	}

	@Then("Enter alphanumeric with special char values to check character strength into EDGE NAME text fields in update field")
	public void enter_alphanumeric_with_special_char_values_to_check_character_strength_into_edge_name_text_fields_in_update_field()
			throws InterruptedException {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEnteredTextForEdgeName();
		ede.identityedgeNameEdit(alldata.get(vTCName).get("Edge Name Update").toString());

		ede.headingeditclick();
		Assert.assertEquals("Validation message", "Alphanumerics of length Min = 2, Max = 64 are allowed !",
				ede.verifyValidationMessageEdgeName());
	}

	@Then("Click on Well mapping tab module")
	public void click_on_well_mapping_tab_module() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.wellmappingtab();
		wm.headingbarclick();
	}

	@Then("Click on the three dots of well and search for Well Name")
	public void click_on_the_three_dots_of_well_and_search_for_well_name() throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.wellnameThreeDot();

		wm.wellMappingSearchInput(alldata.get(vTCName).get("WellNameSearch").toString());
		// wm.backDropShowing_Div_Click();
		wm.headingTitleWell();

	}

	@Then("Click on the three dots of RTUAddress")
	public void click_on_the_three_dots_of_rtu_address() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.RTUAddressThreeDot();
	}

	@Then("Enter the value for RTUAddress")
	public void enter_the_value_for_rtu_address() throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.RTUAddressThreeDot();
		wm.RTUAddressSearchInput(alldata.get(vTCName).get("WellRTUAddressSearch").toString());
		wm.backDropShowing_Div_Click();
		wm.headingbarclick();

	}

	@Then("Click on Status Three Dot and Select the Active status Checkbox")
	public void click_on_status_three_dot_and_select_the_active_status_checkbox() throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.StatusThreeDot();

	}

	@Then("Click on Save button For Well")
	public void click_on_save_button_for_well() throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.saveWellData();

	}

	@Then("Enter the value for Well name")
	public void enter_the_value_for_well_name() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.wellMappingSearchInput(alldata.get(vTCName).get("WellNameSearch").toString());
		wm.backDropShowing_Div_Click();
	}

	@Then("Click on Status Three Dot and Select the inActive status Checkbox")
	public void click_on_status_three_dot_and_select_the_active_status_checkbox_and_in_active_status_checkbox()
			throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);

		wm.StatusThreeDot();

		wm.StatusInActiveCheck();

		wm.headingbarclick();

	}

	@Then("Enter the value for Well name to map setting from well module")
	public void enter_the_value_for_well_name_to_map_setting_from_well_module() throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.wellMappingSearchDot();
		wm.wellMappingSearchInput(alldata.get(vTCName).get("WellNameSearch").toString());
		// wm.backDropShowing_Div_Click();

	}

	@Then("Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field to check well")
	public void click_on_edge_id_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field_to_check_well()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("EDGE ID").toString());

		edp.backDropShowing_Div_Click();
		edp.headingClick();
	}

	@Then("Click on the three dots of DeviceType")
	public void click_on_the_three_dots_of_device_type() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.deviceTypeThreeDot();

	}

	@Then("Enter the value for DeviceType")
	public void enter_the_value_for_device_type() throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.deviceTypeSearchInput(alldata.get(vTCName).get("WellDeviceTypeSearch").toString());
		wm.backDropShowing_Div_Click();

		wm.headingClick();

	}

	@Then("After pagination all default records will display in Last page.")
	public void after_pagination_all_default_records_will_display_in_last_page() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);

	}

	@Then("check full backward functionality is working")
	public void check_full_backward_functionality_is_working() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);

	}

	@Then("Click on EDGE Group name search icon i.e. three dots & enter invalid inputs into search text field")
	public void click_on_edge_group_name_search_icon_i_e_three_dots_enter_invalid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeGroupNameSearch_Button();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("EDGE Group Name").toString());

	}

	@Then("After pagination all default records will display in Previous page.")
	public void after_pagination_all_default_records_will_display_in_previous_page() throws Exception {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);
		;
		int rowPerPage = Integer.parseInt(value);
		// ;
		// Assert.assertTrue("Row count match for Previous page",
		// p.previousPageClickAndCount(rowPerPage));
	}

	@Then("Check the checkbox to well map")
	public void check_the_checkbox_to_well_map() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.checkboxWell();
	}

	@Then("Click on the three dots of IPAddress and search for IPAddress")
	public void click_on_the_three_dots_of_ip_address_and_search_for_ip_address() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.IPAddressThreeDot();

	}

	@Then("Enter the value for IPAddress")
	public void enter_the_value_for_ip_address() {
		WellMapping wm = new WellMapping(driver, logger);
		wm.IPAddressInputSearch(alldata.get(vTCName).get("WellIPAddressSearch").toString());

		wm.headingbarclick();

	}

	@Then("verify Alert poup once edge is successfully mapped")
	public void verify_alert_poup_once_edge_is_successfully_mapped() throws InterruptedException {
		WellMapping wm = new WellMapping(driver, logger);
		wm.alertpopupforwell();

	}

	@Then("search for Edge Group Name enter the value for Edge Group Name and Clear Search")
	public void search_for_edge_name_enter_the_value_for_edge_group_name_and_clear_search()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.edgeGroupNameSearch_Button();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("EDGE Group Name").toString());
		// edp.backDropShowing_Div_Click();
		edp.removalofEneredTextForEdgeGroupName();
		try {

			edp.headingClick();

		} catch (Exception e) {

		}

	}

	@Then("search for App Groups enter the value for App Groups and Clear Search")
	public void search_for_app_groups_enter_the_value_for_app_groups_and_clear_search() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeAppGroupsSearch_Button();
		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("App Groups").toString());
		edp.backDropShowing_Div_Click();
		edp.headingClick();
		edp.edgeAppGroupsSearch_Button();
		edp.removalofEneredTextForAppGroups();
		edp.backDropShowing_Div_Click();
	}

	@Then("search for Hardware Name enter the value for HardWare Name and Clear Search")
	public void search_for_hardware_name_enter_the_value_for_hard_ware_name_and_clear_search()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.hardwareNameSearchDot();
		edp.hardwareNameInput(alldata.get(vTCName).get("Hardware Name").toString());
		edp.backDropShowing_Div_Click();
		edp.headingClick();

	}

	@Then("verify multiple select application functionality")
	public void verify_multiple_select_application_functionality() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);

		egcp.checkboxmultiforAppName();

		egcp.NextButtonStep4();
	}

	@Then("verify deploy button should be in inactive mode and become active when user click on Confirm button")
	public void verify_deploy_button_should_be_in_inactive_mode_and_become_active_when_user_click_on_confirm_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.checkdisabledeploybutton();
	}

	@When("Click on configuration icon button from Action columnn")
	public void click_on_configuration_icon_button_from_action_columnn() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.configurationIcon();
	}

	@Then("verify application functionality for configuration")
	public void verify_application_functionality_for_configuration() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.edgeAppNameDot();

		egcp.appNameConfigInput(alldata.get(vTCName).get("appNameApplicationConfiguration").toString());

		egcp.backDropShowing_Div_Click();

		egcp.checkboxApplicationConfigurationAppName();

		egcp.NextButtonStep3();

	}

	@Then("verify multiSelect Edge Device functionality")
	public void verify_multi_select_edge_device_functionality() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.checkboxAllconfigurationEdgeDevice();
	}

	@Then("click on bulk configuration button at the corner of the page")
	public void click_on_bulk_configuration_button_at_the_corner_of_the_page() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.BulkAppDeploymentButton();
	}

	@Then("verify app group name functionality")
	public void verify_app_group_name_functionality() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.appGroupNameDot();
		egcp.edgeIdConfigurationInput(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("verify edge Device configuration functionality")
	public void verify_edge_device_configuration_functionality() {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.edgeIDApplicationConfigurationThreeDot();
		egcp.appGroupNameInputdeploy(alldata.get(vTCName).get("Value1").toString());
	}

	@Then("Click on Setting tab from left side bar and click on well tab from Navigation menu")
	public void click_on_setting_tab_from_left_side_bar_and_click_on_well_tab_from_navigation_menu() {
		UserSettingsPage us = new UserSettingsPage(driver, logger);
		us.Setting_tab();
		SettingsWellPage swp = new SettingsWellPage(driver, logger);
		swp.clickWellNavigationTab();
	}

	@Then("Click on Add button to add new well")
	public void click_on_add_button_to_add_new_well() {
		SettingsWellPage swp = new SettingsWellPage(driver, logger);
		swp.addWell();
	}

	@Then("Click on deployment icon button from Action columnn")
	public void click_on_deployment_icon_button_from_action_columnn() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickondeployimage();
	}

	@Then("Check SelectAll checkbox from select column")
	public void check_select_all_checkbox_from_select_column() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.checkboxAllDeploymentEdgeDevice();
		Thread.sleep(7000);
	}

	@Then("verify Active Single Edge")
	public void verify_active_single_edge() throws InterruptedException {
		EdgeGroupConfigurationPage egcp = new EdgeGroupConfigurationPage(driver, logger);
		egcp.previousButtonApplicationonDeployment();
	}

	@Then("Enter the details for Well Name , Port Number , IP Address and choose the Device Type")
	public void enter_the_details_for_well_name_port_number_ip_address_and_choose_the_device_type()
			throws InterruptedException {
		SettingsWellPage swp = new SettingsWellPage(driver, logger);
		swp.inputWellName(alldata.get(vTCName).get("AddWellName").toString());
		swp.deviceTypeSelectAdd(alldata.get(vTCName).get("SelectDeviceType").toString());

		swp.inputPortNumber(alldata.get(vTCName).get("AddPortNumber").toString());

		swp.inputIPAddress(alldata.get(vTCName).get("AddIPAddress").toString());

	}

	@Then("Click on Save button To Save Well")
	public void click_on_save_button_to_save_well() throws InterruptedException {
		SettingsWellPage swp = new SettingsWellPage(driver, logger);

		swp.savebuttonforSettingwell();

	}

	@Then("click on add icon to add configuration")
	public void click_on_add_icon_to_add_configuration() throws InterruptedException {
		EdgeAppConfigurationPage eac = new EdgeAppConfigurationPage(driver, logger);
		eac.addconfigurationicon();
	}

	@Then("scroll mouse toward left hand side")
	public void scroll_mouse_toward_left_hand_side() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementLeftBar("div.example-container", "0");

	}

	@Then("Choose inactive mode from status column")
	public void choose_inactive_mode_from_status_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.status();
		edp.statusInactive();
		edp.outerlayerclick();

	}

	@Then("scroll horizontal to see status column")
	public void scroll_horizontal_to_see_status_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// edp.scrollingElementRightBar("div.example-container", "900");
		edp.scrollingElement(edp.actioncolumn());
	}

	@Then("Click on Status Three Dot")
	public void click_on_status_three_dot() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.status();
	}

	@Then("update Edge Name , Serial Number, OnboardingKey, ImageVersion, Server Port")
	public void update_edge_name_serial_number_onboarding_key_image_version_server_port() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.removalofEneredTextForEdgeName();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("Value2").toString());
	}

	@Then("Click on Save button to update edge")
	public void click_on_save_button_to_update_edge() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.saveEdgeDeviceButton();

	}

	@Then("After landing on EDGE Device List please scroll horizontal and Click on Edit icon button")
	public void after_landing_on_edge_device_list_please_scroll_horizontal_and_click_on_edit_icon_button()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
		edp.clickEditButton();

	}

	@Then("scroll horizontal and Click on EDIT icon button")
	public void scroll_horizontal_and_click_on_edit_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
		edp.clickEditButton();
	}

	@Then("Remove the EDGE ID name search field")
	public void remove_the_edge_id_name_search_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.removalofEneredTextForEdgeId();
		edp.backDropShowing_Div_Click();
	}

	@Then("Remove the EDGE Name search field")
	public void remove_the_edge_name_search_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeNameSearch_Button();
		edp.removalofEneredTextForEdgeName();
		edp.backDropShowing_Div_Click();
	}
	@Then("Remove the Edge Group Name search field")
	public void remove_the_edge_group_name_search_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeGroupNameSearch_Button();
		edp.removalofEneredTextForEdgeGroupName();
		edp.backDropShowing_Div_Click();
	}



	@Then("Remove the App Group name search field")
	public void remove_the_app_group_name_search_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeAppGroupsSearch_Button();
		edp.removalofEneredTextForAppGroups();
		edp.backDropShowing_Div_Click();
	}

	@Then("Click on Hardware name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_hardware_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.hardwareNameSearchDot();
		edp.hardwareNameInput(alldata.get(vTCName).get("Hardware Name").toString());
	}

	@Then("Remove the Hardware name search field")
	public void remove_the_hardware_name_search_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.hardwareNameSearchDot();
		edp.removalofEneredTextHardWareName();
		edp.backDropShowing_Div_Click();
	}

	@Then("update Edge Name, location, Description , Assigned To from Identity section")
	public void update_edge_name_location_description_assigned_to_from_identity_section() throws InterruptedException {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEnteredTextForEdgeName();
		ede.identityedgeNameEdit(alldata.get(vTCName).get("Edge Name Update").toString());

		ede.removalofEneredTextForLocation();
		ede.locationUpdate(alldata.get(vTCName).get("LocationUpdate").toString());

		ede.removalofEneredTextForDescription();
		ede.descriptionUpdate(alldata.get(vTCName).get("DescriptionUpdate").toString());

		ede.hardwareNameUpdate(alldata.get(vTCName).get("Hardware Name Update").toString());

		ede.edgeGroupName(alldata.get(vTCName).get("Edge Group Name Update").toString());

	}

	@Then("update the value of Serial Number, OnboardingKey, ImageVersion from the Registration accordion")
	public void update_the_value_of_serial_number_onboarding_key_image_version_from_the_registration_accordion() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEnteredTextForSerialNo();
		ede.serialNumberUpdate(alldata.get(vTCName).get("serialNumberUpdate").toString());

		ede.removalofEneredTextForOnboardingKey();
		ede.ongoingBoardUpdate(alldata.get(vTCName).get("ongoingBoardUpdate").toString());

		ede.removalofEnteredTextForAssignedToImageVersion();
		ede.imageVersionUpdate(alldata.get(vTCName).get("imageVersionUpdate").toString());
	}

	@Then("update the value of Server Port from the deployment")
	public void update_the_value_of_server_port_from_the_deployment() {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.removalofEnteredTextForServerport();

		ede.serverPortUpdate(alldata.get(vTCName).get("serverPortUpdate").toString());
	}

	@Then("select the value for App Group from the deployment")
	public void select_the_value_for_app_group_from_the_deployment() throws InterruptedException {
		EdgeDeviceEdit ede = new EdgeDeviceEdit(driver, logger);
		ede.applicationGroupUpdate(alldata.get(vTCName).get("applicationGroupUpdate").toString());
	}

	@Then("verify tool tip text visibilty for config App button in Actions column")
	public void verify_tool_tip_text_visibilty_for_config_app_button_in_actions_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip for Config Apps", "Config Apps", edp.get_Text_ConfigToolTip());
	}

	@Then("the red color status toggle button should be visible")
	public void the_red_color_status_toggle_button_should_be_visible() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		Assert.assertTrue("The red toggle button is not visible", evp.isRedToggleButtonVisible());

	}

	@Then("choose inactive checkbox from status")
	public void choose_inactive_checkbox_from_status() throws InterruptedException {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		evp.statusThreeDot();
		evp.checkInactiveoption();
		evp.outerlayerclick();

	}

	@Then("click on filter of config name and Config value")
	public void click_on_filter_of_config_name_and_config_value() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		evp.configNameSearchThreeDot();
		evp.configValueSearchThreeDot();
	}

	@Then("verify visiblility of green color status toggle button in Environment variables")
	public void verify_visiblility_of_green_color_status_toggle_button_in_environment_variables() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		Assert.assertTrue("The green toggle button is not visible", evp.isGreenToggleButtonVisible());
	}

	@Then("Click on edit button of environment variables")
	public void click_on_edit_button_of_environment_variables() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);

		evp.configNameSearchThreeDot();
		evp.setFocusonInputonConfigName();
		evp.searchconfigNameValue(alldata.get(vTCName).get("confignamesearch").toString());
		evp.backDropShowing_Div_Click();
		evp.clickEditButton();
	}

	@Then("check filter icon accessbility of Config Name in Environment Variables List screen")
	public void check_filter_icon_accessbility_of_config_name_in_environment_variables_list_screen() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);

		evp.configNameSearchThreeDot();
		evp.setFocusonInputonConfigName();
		evp.searchconfigNameValue(alldata.get(vTCName).get("confignamesearch").toString());
		evp.backDropShowing_Div_Click();

	}

	@Then("check filter icon accessbility of Config value in Environment Variables List screen")
	public void check_filter_icon_accessbility_of_config_value_in_environment_variables_list_screen() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		evp.configNameSearchThreeDot();
		evp.setFocusonInputonConfigName();
		evp.searchconfigValue(alldata.get(vTCName).get("configvaluesearch").toString());
		evp.backDropShowing_Div_Click();
	}

	@Then("check accessbility the filter icon for status")
	public void check_accessbility_the_filter_icon_for_status() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);

		evp.statusThreeDot();
	}

	@Then("verify tooltip text for edit")
	public void verify_tooltip_text_for_edit() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		Assert.assertEquals("Tooltip for Edit", "Edit", evp.gettooltipforEditEnvironmental());

	}

	@Then("verify accessbilty of csv format icon in Environment Variable Bulk upload pop up screen")
	public void verify_accessbilty_of_csv_format_icon_in_environment_variable_bulk_upload_pop_up_screen() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		evp.csvFormatIconEnvironmentalVariable();

	}

	@Then("click on upload button without uploading any file")
	public void click_on_upload_button_without_uploading_any_file() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		evp.clickOnUploadButton();
	}

	@Then("verify tooltip text for delete")
	public void verify_tooltip_text_for_delete() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		Assert.assertEquals("Tooltip for Delete", "Delete", evp.gettooltipforDeleteEnvironmental());
	}

	@Then("verify tooltip text for delete on Edge Device")
	public void verify_tooltip_text_for_delete_on_edge_device() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip for edge device delete button", "Delete", edp.get_Text_deleteToolTip());
	}

	@Then("verify tooltip text for console on Edge Device")
	public void verify_tooltip_text_for_console_on_edge_device() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip for edge device console button", "Console", edp.get_Text_ConsoleToolTip());
	}

	@Then("scroll horizontal scrollbar")
	public void scroll_horizontal_scrollbar() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
	}

	@Then("verify tooltip text for bulk upload button")
	public void verify_tooltip_text_for_bulk_upload_button() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		Assert.assertEquals("Tooltip for button bulk upload", "Bulk Upload (in .csv format)",
				evp.gettooltipforBulkUploadEnvironmental());
	}

	@Then("verify tooltip text for bulk download button")
	public void verify_tooltip_text_for_bulk_download_button() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		Assert.assertEquals("Tooltip for button bulk download", "Bulk Download (in .csv format)",
				evp.gettooltipforBulkDownloadEnvironmental());
	}

	@Then("click on bulk upload icon in Environment Variable List screen")
	public void click_on_bulk_upload_icon_in_environment_variable_list_screen() {
		EnvironmentalVariablePage evp = new EnvironmentalVariablePage(driver, logger);
		evp.bulkUploadButton();
	}

	@Given("I am on the Communication Status page")
	public void i_am_on_the_communication_status_page() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.communicationStatusThreeDot();

	}

	@When("I check the {string} checkbox")
	public void i_check_the_checkbox(String checkboxName) {
		switch (checkboxName) {
		case "Connected":
			EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
			edp.checkConnected();
			break;
		case "Disconnected":
			EdgeDevicesPage edp1 = new EdgeDevicesPage(driver, logger);
			edp1.checkDisconnected();
			break;
		case "Edge Disconnected":
			EdgeDevicesPage edp2 = new EdgeDevicesPage(driver, logger);
			edp2.checkEdgeDisconnected();
			break;
		case "Broker Disconnected":
			EdgeDevicesPage edp3 = new EdgeDevicesPage(driver, logger);
			edp3.checkBrokerDisconnected();
			break;

		}
	}

	@Then("the {string} checkbox should be checked")
	public void the_checkbox_should_be_checked(String checkboxName) {
		switch (checkboxName) {
		case "Connected":
			EdgeDevicesPage edp1 = new EdgeDevicesPage(driver, logger);

			edp1.isConnectedChecked();
			break;
		case "Disconnected":
			EdgeDevicesPage edp2 = new EdgeDevicesPage(driver, logger);
			edp2.isDisconnectedChecked();
			break;
		case "Edge Disconnected":
			EdgeDevicesPage edp3 = new EdgeDevicesPage(driver, logger);
			edp3.isEdgeDisconnectedChecked();
			break;
		case "Broker Disconnected":
			EdgeDevicesPage edp4 = new EdgeDevicesPage(driver, logger);
			edp4.isBrokerDisconnectedChecked();
			break;
		}
	}

	@When("I uncheck the {string} checkbox")
	public void i_uncheck_the_checkbox(String checkboxName) {
		switch (checkboxName) {
		case "Connected":
			EdgeDevicesPage edp1 = new EdgeDevicesPage(driver, logger);
			edp1.uncheckConnected();
			break;
		case "Disconnected":
			EdgeDevicesPage edp2 = new EdgeDevicesPage(driver, logger);
			edp2.uncheckDisconnected();
			;
			break;
		case "Edge Disconnected":
			EdgeDevicesPage edp3 = new EdgeDevicesPage(driver, logger);
			edp3.uncheckEdgeDisconnected();
			;
			break;
		case "Broker Disconnected":
			EdgeDevicesPage edp4 = new EdgeDevicesPage(driver, logger);
			edp4.uncheckBrokerDisconnected();
			break;
		}
	}

	@Then("the {string} checkbox should be unchecked")
	public void the_checkbox_should_be_unchecked(String checkboxName) {
		switch (checkboxName) {
		case "Connected":
			EdgeDevicesPage edp1 = new EdgeDevicesPage(driver, logger);
			Assert.assertFalse(edp1.isConnectedChecked());
			break;
		case "Disconnected":
			EdgeDevicesPage edp2 = new EdgeDevicesPage(driver, logger);
			Assert.assertFalse(edp2.isDisconnectedChecked());
			break;
		case "Edge Disconnected":
			EdgeDevicesPage edp3 = new EdgeDevicesPage(driver, logger);
			Assert.assertFalse(edp3.isEdgeDisconnectedChecked());
			break;
		case "Broker Disconnected":
			EdgeDevicesPage edp4 = new EdgeDevicesPage(driver, logger);
			Assert.assertFalse(edp4.isBrokerDisconnectedChecked());
			break;
		}
	}

	@Then("close identity accordion")
	public void close_identity_accordion() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
