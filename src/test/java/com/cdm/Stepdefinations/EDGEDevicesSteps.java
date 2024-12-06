package com.cdm.StepDefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.EdgeDeviceAdd;
import com.cdm.pages.EdgeDeviceEdit;
import com.cdm.pages.EdgeDevicesPage;
import com.cdm.pages.Edgegroupconfiguration;
import com.cdm.pages.Menu;
import com.cdm.pages.Pagination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EDGEDevicesSteps extends BaseTest {

	@Then("User enters valid values for all required text fields and selects right values from dropdown")
	public void user_enters_valid_values_for_all_required_text_fields_and_selects_right_values_from_dropdown()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd((alldata.get(vTCName).get("EdgeIDAdd").toString()));
		eda.identityedgeNameAdd((alldata.get(vTCName).get("EdgeNameAdd").toString()));
		eda.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());
		eda.edgeGroupNameAdd(alldata.get(vTCName).get("EDGEGroupNameAdd").toString());

		eda.locationAdd((alldata.get(vTCName).get("LocationAdd").toString()));

		eda.hardWareNameAdd((alldata.get(vTCName).get("HardwareNameAdd").toString()));

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
		Thread.sleep(3000);
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
		eda.identityedgeNameAdd((alldata.get(vTCName).get("EdgeNameAdd").toString()));
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

	@Then("add all mandatory field of edge device")
	public void add_all_mandatory_field_of_edge_device() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd((alldata.get(vTCName).get("Edge ID Add").toString()));
		eda.identityedgeNameAdd((alldata.get(vTCName).get("EdgeNameAdd").toString()));
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

	@Then("verify standarize text format for error message below EDGE Name text field")
	public void verify_standarize_text_format_for_error_message_below_edge_name_text_field()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
		Assert.assertEquals("Edge ID validation ", "Mandatory field - required !",
				eda.verifyValidationMessageEdgeName());
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

	@Then("verify error message verbaige for entering invalid details for EDGE Name Text field in ADD screen")
	public void verify_error_message_verbaige_for_entering_invalid_details_for_edge_name_text_field_in_add_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeNameAdd(alldata.get(vTCName).get("EdgeNameAdd").toString());
		eda.saveAddData();
		Assert.assertEquals("Edge Name validation ", "Mandatory field - required !",
				eda.validationMessageinvalidEdgeName());
	}

	@Then("verify error message verbaige for not entering details for EDGE ID Text field in ADD screen")
	public void verify_error_message_verbaige_for_not_entering_details_for_edge_id_text_field_in_add_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd(alldata.get(vTCName).get("EdgeNameAdd").toString());
		eda.saveAddData();
		Assert.assertEquals("Edge ID validation ", "Mandatory field - required !",
				eda.verifyValidationMessageEdgeId1());
	}

	@Then("verify error message verbaige for not entering details for EDGE Name Text field in ADD screen")
	public void verify_error_message_verbaige_for_not_entering_details_for_edge_name_text_field_in_add_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeNameAdd(alldata.get(vTCName).get("EdgeNameAdd").toString());
		eda.saveAddData();

		Assert.assertEquals("Edge Name validation ", "Mandatory field - required !",
				eda.validationMessageinvalidEdgeName());
	}

	@Then("check pagination per page")
	public void check_pagination_per_page() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

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

	@Then("check visibilty the input field format")
	public void check_visibilty_the_input_field_format() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeNameAddDisplayed();
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
	public void click_on_edge_device_module_from_side_menu_bar() throws InterruptedException {
		Menu edp = new Menu(driver, logger);

		String strTitle = alldata.get(vTCName).get("EdgeDeviceTitleList").toString();
		edp.clickEdgeDevices(strTitle);
		Thread.sleep(2000);
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
	public void after_landing_on_edge_device_list_screen_click_on_search_bar_after_entering_data()
			throws InterruptedException {
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
	public void click_on_deploy_apps_button_on_the_actions_column_landed_on_edge_application_deployment_screen()
			throws InterruptedException {
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

	@Then("Click on EDGE ID search icon i.e. three dots.")
	public void click_on_edge_id_search_icon_i_e_three_dots() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();

	}

	@Then("Click on EDGE ID name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_id_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("EDGEIDSearch").toString());
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

	@Then("Verify all the rows having the EDGE ID Provided are returned")
	public void verify_all_the_rows_having_the_edge_id_provided_are_returned() {
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

	@Then("Verify all the rows with the EDGE Name Provided are returned")
	public void verify_all_the_row_with_the_edge_name_provided_are_returned() {
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
	public void click_on_edge_group_name_search_icon_i_e_three_dots_enter_one_of_the_existing_edge_group_name()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeGroupNameSearch_Button();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("EDGEGroupNameSearch").toString());
		Thread.sleep(3000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();
	}

	@Then("Verify all the rows with the EDGE Group Name Provided are returned")
	public void verify_all_the_row_with_the_edge_group_name_provided_are_returned() {
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
	public void click_on_app_group_name_search_icon_i_e_three_dots_enter_one_of_the_existing_app_group_name()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeAppGroupsSearch_Button();
		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("AppGroupNameSearch").toString());
		Thread.sleep(3000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();
	}

	@Then("Verify all the rows with the App Group Name Provided are returned")
	public void verify_all_the_rows_with_the_app_group_name_provided_are_return() {
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
	public void click_on_hardware_name_search_icon_i_e_three_dots_enter_one_of_the_existing_hardware_name()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.hardwareNameSearchDot();
		edp.hardwareNameInput(alldata.get(vTCName).get("HardwareNameSearch").toString());
		Thread.sleep(3000);
		edp.backDropShowing_Div_Click();
		edp.headingClick();
	}

	@Then("Verify all the rows with the Hardware Name Provided are returned")
	public void verify_all_the_rows_with_the_hardware_name_provided_are_returned() {
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
	public void click_on_search_icon_i_e_three_dots_search_text_field_visible() throws InterruptedException {
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
	public void enter_valid_inputs_as_per_required_from_table_details_into_search_text_field_click_on_enter()
			throws InterruptedException {
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
	public void click_on_search_menu_bar_on_the_top_of_the_screen() throws InterruptedException {
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
	public void click_on_deploy_apps_button_on_the_actions_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
		edp.clickondeployimage();

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
		eda.identityedgeNameAdd((alldata.get(vTCName).get("EdgeNameAdd").toString()));
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
		eda.identityedgeNameAdd((alldata.get(vTCName).get("EdgeNameAdd").toString()));

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

		eda.identityedgeNameAdd(alldata.get(vTCName).get("EdgeNameAdd").toString());

		eda.headingTitleAdd();

		Assert.assertEquals("Edge Name error message", "Please Enter a valid EDGE Name !",
				eda.verifyValidationMessageEdgeName1());
	}

	@Then("Enter numeric values to check character strength into EDGE Name text fields of Edit Section")
	public void enter_numeric_values_to_check_character_strength_into_edge_name_text_fields_of_edit_section()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.identityedgeNameAdd(alldata.get(vTCName).get("EdgeNameAdd").toString());

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

//	@Then("Click & select options from EDGE Group Name drop down")
//	public void click_select_options_from_edge_group_name_drop_down() throws InterruptedException {
//		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
//		eda.edgeGroupNameAdd(alldata.get(vTCName).get("EDGE Group Name Add").toString());
//	}

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

	@Then("Click and Verify Add button is working")
	public void click_and_verify_add_button_is_working() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
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

	@Then("Enter the value for RTUAddress")

	@Then("Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field to check well")
	public void click_on_edge_id_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field_to_check_well()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("EDGE ID").toString());

		edp.backDropShowing_Div_Click();
		edp.headingClick();
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

		// int rowPerPage = Integer.parseInt(value);
		// ;
		// Assert.assertTrue("Row count match for Previous page",
		// p.previousPageClickAndCount(rowPerPage));
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

	@Then("Choose inactive checkbox from status column")
	public void choose_inactive_checkbox_from_status_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.status();
		edp.statusInactive();
		edp.outerlayerclick();

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

	@Then("Click on deployment icon button from Action columnn")
	public void click_on_deployment_icon_button_from_action_columnn() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickondeployimage();
	}

	@Then("Choose both active and inactive checkboxes from status column")
	public void choose_both_active_and_inactive_checkboxes_from_status_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.status();
		edp.statusInactive();
		edp.outerlayerclick();

	}

	@Then("scroll horizontal to see status column")
	public void scroll_horizontal_to_see_status_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");

	}

	@Then("scroll horizontal to see action column")
	public void scroll_horizontal_to_see_action_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
	}

	@When("User mousehovers on the EDIT icon button")
	public void user_mousehovers_on_the_edit_icon_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.mousehoveronEdit();
	}

	@Then("Tooltip should appear for Edit icon with correct value")
	public void tooltip_should_appear_for_edit_icon_with_correct_value() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		Assert.assertEquals("Tooltip of Edit button", "Edit", edp.get_Text_ToolTipEdit());

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
	public void remove_the_edge_id_name_search_field() throws InterruptedException {
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

	@Given("user is on the Communication Status page")
	public void user_is_on_the_communication_status_page() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.communicationStatusThreeDot();

	}

	@Then("the {string} checkbox should be checked")

	@Then("verify all the {string} devices displayed on the list view page in communication status column")
	public void verify_all_the_devices_displayed_on_the_list_view_page_in_communication_status_column(String string) {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		int rowCount = edp.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		// List<String> rowData = edp.getRowData();
		List<String> communicationStatusrowData = edp.getStatusRowData();
		List<String> expectedStatuses = Arrays.asList("Connected", "Disconnected", "Edge Disconnected",
				"Broker Disconnected");

		for (String row : communicationStatusrowData) {
			Assert.assertTrue("Unexpected status: " + row, expectedStatuses.contains(row));
		}

	}
//		tsry {
	// List<String> rowData = edp.getRowData();
//			for (String row : rowData) {
//				Assert.assertEquals(row,"Connected");
////				Assert.assertEquals(row,"Disconnected");
////				Assert.assertEquals(row,"Edge Disconnected");
////				Assert.assertEquals(row,"Broke Disconnected");
//
//
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

	@Then("verify tooltip for Edge ID")
	public void verify_tooltip_for_edge_id() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		Assert.assertEquals("Tooltip for Edge ID on Edge Device List page", "Unique ID assigned for the EDGE Device",
				edp.get_Text_ToolTipEdgeID());

	}

	@Then("verify tooltip for Edge Name")
	public void verify_tooltip_for_edge_name() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip for Edge Name on Edge Device List page", "Name assigned for the EDGE Device",
				edp.get_Text_EdgeNameToolTip());

	}

	@Then("verify tooltip for Edge Group Name")
	public void verify_tooltip_for_edge_group_name() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip for Edge Group Name on Edge Device List page",
				"EDGE Group to which the EDGE Device is assigned", edp.get_Text_edgeGroupNameToolTip());
	}

	@Then("verify tooltip for Hardware Name")
	public void verify_tooltip_for_hardware_name() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Tooltip for Hardware Name Edge Device List page", "Unique Name assigned for the Hardware",
				edp.get_Text_ToolTipHardwareName());
	}

	@Then("verify tooltip for communication status and status column")
	public void verify_tooltip_for_communication_status_and_status_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		Assert.assertEquals("Tooltip for communication Name on Edge Device List page",
				"Defines the health condition of the EDGE Device. It displays Green, Amber and Red depending on various conditions (with Green being the healthiest)",
				edp.get_Text_ToolTipCommunicationName());

	}

	@Then("verify tooltip for Add button, Refresh, Application configuration,Bulk Upload & Download button icons on top right side of EDGE Device List screen")
	public void verify_tooltip_for_add_button_refresh_application_configuration_bulk_upload_download_button_icons_on_top_right_side_of_edge_device_list_screen() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("verify tooltip for Edit, Delete, Deploy Apps,Config Apps, info")
	public void verify_tooltip_for_edit_delete_deploy_apps_config_apps_info() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user select the checkbox for a valid Communication Status entry {string}")
	public void user_select_the_checkbox_for_a_valid_communication_status_entry(String status) {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.selectCheckbox(status);
	}

	@Then("verify Tooltip should appear for Edit icon")
	public void verify_tooltip_should_appear_for_edit_icon() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		Assert.assertEquals("Tooltip for Edit", "Edit", edp.get_Text_ToolTipEdit());
	}

	@When("User selects {string} chekbox from the status column")
	public void user_selects_chekbox_from_the_status_column(String string) {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
//		int expectedIconCount = status.equals("Active") ? 3 : 5;
//	    int actualIconCount = edgeDevicePage.getActionsMenuIconCount();
	}

	@Then("The {string} menu should display only {int} icons")
	public void the_menu_should_display_only_icons(String string, Integer int1) {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		int iconCount = edp.getActionsMenuIconCount();
		Assert.assertEquals("The number of icons in the Actions menu is not 3.", iconCount, 3);
	}

	@Then("verify only devices with the {string} Communication Status should be displayed in the list")
	public void verify_only_devices_with_the_communication_status_should_be_displayed_in_the_list(String expectedStatus)
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Thread.sleep(2000);
		List<String> displayedStatuses = edp.getDisplayedStatuses();

		boolean result = displayedStatuses.stream().allMatch(status -> status.equalsIgnoreCase(expectedStatus));
		Assert.assertTrue("Some devices have a status other than: " + expectedStatus, result);

	}

	@Then("scroll mouse toward left-hand side")
	public void scroll_mouse_toward_left_hand_side() {

	}

	@Given("User has applied a search filter on the EDGE ID column")
	public void user_has_applied_a_search_filter_on_the_edge_id_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeIdSearch_Button();
		edp.sendValueSearchIcon(alldata.get(vTCName).get("EDGEIDSearch").toString());
	}

	@Given("User has applied a search filter on the EDGE Name column")
	public void user_has_applied_a_search_filter_on_the_edge_name_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("EDGENameSearch").toString());
	}

	@When("User clears the search filter on Edge Name")
	public void user_clears_the_search_filter_on_edge_name() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.removalofEneredTextForEdgeName();
	}

	@Given("The search results are displayed on the EDGE Device List screen")
	public void the_search_results_are_displayed_on_the_edge_device_list_screen() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Thread.sleep(2000);
		int rowCount = edp.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		Assert.assertTrue("Row found for search.", rowCount > 0);
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

	@When("User clears the search filter")
	public void user_clears_the_search_filter() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.removalofEneredTextForEdgeId();
	}

	@Given("User has applied a search filter on the EDGE Group Name column")
	public void user_has_applied_a_search_filter_on_the_edge_group_name_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeGroupNameSearch_Button();
		edp.sendValueSearchinputBoxForEdgeGroupName(alldata.get(vTCName).get("EDGEGroupNameSearch").toString());
	}

	@When("User clears the search filter on Edge Group Name")
	public void user_clears_the_search_filter_on_edge_group_name() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.removalofEneredTextForEdgeGroupName();
	}

	@Then("verify EDGE Device List screen should be reset to show all devices with all the Edge Group Name")
	public void verify_edge_device_list_screen_should_be_reset_to_show_all_devices_with_all_the_edge_group_name() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		int allDevicesDisplayed = edp.areSearchResultsDisplayed();
		Assert.assertTrue("No rows are displayed after clearing the search filter.", allDevicesDisplayed > 0);

		try {
			// Get and print data for all rows
			List<String> allData = edp.getRowDataAfterremoval();
			for (String rowData : allData) {
				System.out.println("Row Data: " + rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Given("User has applied a search filter on the App Group Name column")
	public void user_has_applied_a_search_filter_on_the_app_group_name_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeAppGroupsSearch_Button();
		edp.sendValueSearchIconByAppGroups(alldata.get(vTCName).get("EDGEGroupNameSearch").toString());
	}

	@When("User clears the search filter on App Group Name")
	public void user_clears_the_search_filter_on_app_group_name() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.removalofEneredTextForAppGroups();
	}

	@Then("verify EDGE Device List screen should be reset to show all devices with app groups")
	public void verify_edge_device_list_screen_should_be_reset_to_show_all_devices_with_app_groups() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		int allDevicesDisplayed = edp.areSearchResultsDisplayed();
		Assert.assertTrue("No rows are displayed after clearing the search filter.", allDevicesDisplayed > 0);

		try {
			// Get and print data for all rows
			List<String> allData = edp.getRowDataAfterremoval();
			for (String rowData : allData) {
				System.out.println("Row Data: " + rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("verify EDGE Device List screen should be reset to show with all Edge Name")
	public void verify_edge_device_list_screen_should_be_reset_to_show_with_all_edge_name() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		int allDevicesDisplayed = edp.areSearchResultsDisplayed();
		Assert.assertTrue("No rows are displayed after clearing the search filter.", allDevicesDisplayed > 0);

		try {
			// Get and print data for all rows
			List<String> allData = edp.getRowDataAfterremoval();
			for (String rowData : allData) {
				System.out.println("Row Data: " + rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("verify EDGE Device List screen should be reset to show with all Edge ID")
	public void verify_edge_device_list_screen_should_be_reset_to_show_with_all_edge_id() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		int allDevicesDisplayed = edp.areSearchResultsDisplayed();
		Assert.assertTrue("No rows are displayed after clearing the search filter.", allDevicesDisplayed > 0);

		try {
			// Get and print data for all rows
			List<String> allData = edp.getRowDataAfterremoval();
			for (String rowData : allData) {
				System.out.println("Row Data: " + rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Given("User has applied a search filter on the Hardware Name column")
	public void user_has_applied_a_search_filter_on_the_hardware_name_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.hardwareNameSearchDot();
		edp.sendValueSearchIconByHardwareName(alldata.get(vTCName).get("HardwareNameSearch").toString());
		edp.backDropShowing_Div_Click();

	}

	@When("User clears the search filter on hardware name")
	public void user_clears_the_search_filter_on_hardware_name() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.hardwareNameSearchDot();
		edp.removalofEneredTextHardWareName();
	}

	@Then("verify EDGE Device List screen should be reset to show all devices with hardware")
	public void verify_edge_device_list_screen_should_be_reset_to_show_all_devices_with_hardware() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		int allDevicesDisplayed = edp.areSearchResultsDisplayed();
		Assert.assertTrue("No rows are displayed after clearing the search filter.", allDevicesDisplayed > 0);

		try {
			// Get and print data for all rows
			List<String> allData = edp.getRowDataAfterremoval();
			for (String rowData : allData) {
				System.out.println("Row Data: " + rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@When("user select the {string} checkbox in the status column")
	public void user_select_the_checkbox_in_the_status_column(String status) {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		if (status.equalsIgnoreCase("Active")) {
			edp.selectActiveCheckbox();
		} else if (status.equalsIgnoreCase("Inactive")) {
			edp.selectInactiveCheckbox();
		}
	}

	@Then("deselect checkbox for Active")
	public void deselect_checkbox_for_active() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.status();
		Thread.sleep(3000);
		edp.statusActive();
	}

	@Then("should see {int} icons in the action column")
	public void should_see_icons_in_the_action_column(Integer expectedIconCount) {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		// Count icons
		int actualIconCount = edp.countActionIcons();
		Assert.assertEquals("Icon count mismatch!", (int) expectedIconCount, actualIconCount);

		// Get tooltips for icons
		List<String> iconTooltips = edp.getIconTooltips();

		// Log or Assert tooltips as needed
		for (String tooltip : iconTooltips) {
			logger.info("Tooltip: " + tooltip);
		}

		// Optional: Assert specific tooltips, if required
		Assert.assertFalse("No tooltips found!", iconTooltips.isEmpty());
	}

	@Then("verify Refresh button should be visible on the top right side of the screen")
	public void verify_refresh_button_should_be_visible_on_the_top_right_side_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		WebElement refreshButton = edp.RefreshButtonText();
		Assert.assertTrue("Refresh button is not visible", refreshButton.isDisplayed());
	}

	@Then("verify Add button should be visible on the top right side of the screen")
	public void verify_add_button_should_be_visible_on_the_top_right_side_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		WebElement addButton = edp.addButtonText();
		Assert.assertTrue("Add button is not visible", addButton.isDisplayed());

	}

	@Then("verify Bulk Upload button should be visible on the top right side of the screen")
	public void verify_bulk_upload_button_should_be_visible_on_the_top_right_side_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		WebElement bulkUploadButton = edp.bulkUploadButtonText();
		Assert.assertTrue("Bulk Upload button is not visible", bulkUploadButton.isDisplayed());
	}

	@Then("verify Bulk Download button should be visible on the top right side of the screen")
	public void verify_bulk_download_button_should_be_visible_on_the_top_right_side_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		WebElement bulkDownloadButton = edp.bulkDownloadText();
		Assert.assertTrue("Bulk Download button is not visible", bulkDownloadButton.isDisplayed());
	}

	@Then("verify Bulk Application Configuration button should be visible on the top right side of the screen")
	public void verify_bulk_application_configuration_button_should_be_visible_on_the_top_right_side_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		WebElement bulkApplicationConfigurationButton = edp.bulkApplicationConfigurationText();
		Assert.assertTrue("Bulk Download button is not visible", bulkApplicationConfigurationButton.isDisplayed());
	}

	@When("user clicks on Refresh button at the top right side of the screen")
	public void user_clicks_on_refresh_button_at_the_top_right_side_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickRefreshButton();
	}

	@Then("verify Edge Device List should get refreshed")
	public void verify_edge_device_list_should_get_refreshed() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.waitForPageLoaded(); // Replace with actual loader locator

		WebElement refreshButton = edp.RefreshButtonText();
		Assert.assertTrue("Edge Device List did not refresh properly", refreshButton.isDisplayed());
	}

	@When("user clicks on Add button at the top right side of the screen")
	public void user_clicks_on_add_button_at_the_top_right_side_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickAddButton();
	}

	@Then("verify user should be redirected to the Add EDGE Device screen")
	public void verify_user_should_be_redirected_to_the_add_edge_device_screen() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("User is not redirected to Add EDGE Device screen", currentUrl.contains("add"));
	}

	@When("user clicks on Bulk upload button at the top right side of the screen")
	public void user_clicks_on_bulk_upload_button_at_the_top_right_side_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickBulkUpload();

	}

	@When("user upload csv file and click on upload button")
	public void user_upload_csv_file_and_click_on_upload_button() throws AWTException {
		StringSelection selection = new StringSelection(alldata.get(vTCName).get("uploadfileforEdgeDevice").toString());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		// Use Robot class to handle the file upload dialog
		Robot robot = new Robot();

		// Simulate Ctrl+V to paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Simulate pressing Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	@Then("verify user should see popup screen for Bulk upload")
	public void verify_user_should_see_popup_screen_for_bulk_upload() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		WebElement bulkUploadpopup = edp.bulkUploadPopupmessageText();
		Assert.assertTrue("Bulk upload popup is not displayed", bulkUploadpopup.isDisplayed());
	}

	@When("user clicks on Bulk Download button at the top right side of the screen")
	public void user_clicks_on_bulk_download_button_at_the_top_right_side_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickDownload();
	}

	@Then("verify user see download successful message and file should get downloaded")
	public void verify_user_see_download_successful_message_and_file_should_get_downloaded()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Thread.sleep(2000);
		WebElement bulkDownloadsuccessMessage = edp.downloadSuccessMessage();
		Assert.assertTrue("Download success message is not displayed", bulkDownloadsuccessMessage.isDisplayed());
	}

	@When("user clicks on Bulk Application Configuration button at the top right side of the screen")
	public void user_clicks_on_bulk_application_configuration_button_at_the_top_right_side_of_the_screen() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.clickConfiguration();
	}

	@Then("verify user should be redirected to the Bulk Application Configuration Device screen")
	public void verify_user_should_be_redirected_to_the_bulk_application_configuration_device_screen() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("User is not redirected to Bulk Application Configuration screen",
				currentUrl.contains("edgeappconfiguration")); // Replace with expected URL or identifier
	}

	@Then("scroll horizontal to see actions column")
	public void scroll_horizontal_to_see_actions_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
	}

	@When("User hovers over the Edit icon under the Action column")
	public void user_hovers_over_the_edit_icon_under_the_action_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Edit", edp.get_Text_ToolTipEdit());

	}

	@Then("verify tooltip should be displayed for Edit button")
	public void verify_tooltip_should_be_displayed_for_edit_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Edit", edp.get_Text_ToolTipEdit());

	}

	@When("User hovers over the Delete icon under the Action column")
	public void user_hovers_over_the_delete_icon_under_the_action_column() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Delete", edp.get_Text_ToolTipDelete());
	}

	@Then("verify tooltip should be displayed for Delete button")
	public void verify_tooltip_should_be_displayed_for_delete_button() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Delete", edp.get_Text_ToolTipDelete());
	}

	@When("User hovers over the Deploy Apps icon under the Action column")
	public void user_hovers_over_the_deploy_apps_icon_under_the_action_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Deploy Apps", edp.get_Text_deployToolTip());
		Thread.sleep(2000);
	}

	@Then("verify tooltip should be displayed for Deploy Apps button")
	public void verify_tooltip_should_be_displayed_for_deploy_apps_button() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Deploy Apps", edp.get_Text_deployToolTip());
		Thread.sleep(2000);
	}

	@When("User hovers over the Config Apps icon under the Action column")
	public void user_hovers_over_the_config_apps_icon_under_the_action_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Config Apps", edp.get_Text_ConfigToolTip());
		Thread.sleep(2000);
	}

	@Then("verify tooltip should be displayed for Config Apps button")
	public void verify_tooltip_should_be_displayed_for_config_apps_button() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Config Apps", edp.get_Text_ConfigToolTip());
		Thread.sleep(3000);
	}

	@When("User hovers over the Info icon under the Action column")
	public void user_hovers_over_the_info_icon_under_the_action_column() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Info", edp.get_Text_InfoToolTip());
		Thread.sleep(2000);
	}

	@Then("verify tooltip should be displayed for Info button")
	public void verify_tooltip_should_be_displayed_for_info_button() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		Assert.assertEquals("Info", edp.get_Text_InfoToolTip());
		Thread.sleep(2000);
	}

	@Then("verify Cancel icon should be visible on add screen of Edge Device page")
	public void verify_cancel_icon_should_be_visible_on_add_screen_of_edge_device_page() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Assert.assertTrue("Cancel icon should be visible", eda.isCancelIconVisible());
	}

	@Then("verify Cancel icon should be clickable and page should be redirected on Edge Device List page")
	public void verify_cancel_icon_should_be_clickable_and_page_should_be_redirected_on_edge_device_list_page() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.cancelData();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = alldata.get(vTCName).get("expectedUrl").toString();
		Assert.assertEquals(expectedUrl, currentUrl);
	}

	@Then("User leaves the input text field blank")
	public void user_leaves_the_input_text_field_blank() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd(alldata.get(vTCName).get("EdgeIDAdd").toString());

	}

	@Then("verify validation message should appear for the blank input field")
	public void verify_validation_message_should_appear_for_the_blank_input_field() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		WebElement validationMessageEdgeID = eda.verifyValidationMessageForEdgeId();
		Assert.assertTrue("Validation message is not displayed for the blank input field.",
				validationMessageEdgeID.isDisplayed());

	}

	@Then("verify validation message should say Please enter a valid Edge Name!")
	public void verify_validation_message_should_say_please_enter_a_valid_edge_name() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		Assert.assertEquals("Mandatory field - required !", eda.verifyValidationMessageEdgeName());
	}

	@Then("User enters a value exceeding the maximum character limit inside Edge Name input field")
	public void user_enters_a_value_exceeding_the_maximum_character_limit_inside_edge_name_input_field() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeNameAdd(alldata.get(vTCName).get("EdgeNameAdd").toString());
		Assert.assertEquals("Alphanumerics of length Min = 2, Max = 64 are allowed !",
				eda.verifyValidationMessageEdgeName1());
	}

	@Then("User enters a value exceeding the maximum character limit inside Edge ID input field")
	public void user_enters_a_value_exceeding_the_maximum_character_limit_inside_edge_id_input_field() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd(alldata.get(vTCName).get("EdgeIDAdd").toString());
	}

	@Then("verify The validation message should say Alphanumeric of length Min = {int}, Max = {int} are allowed !")
	public void verify_the_validation_message_should_say_alphanumeric_of_length_min_max_are_allowed(Integer int1,
			Integer int2) {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Validation message for excedding characters in Edge Name",
				"Alphanumerics of length Min = 2, Max = 64 are allowed !", eda.verifyValidationMessageEdgeName1());
	}

	@Then("User enters invalid value under Edge ID under Identity section")
	public void user_enters_invalid_value_under_edge_id_under_identity_section() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd(alldata.get(vTCName).get("EdgeIDAdd").toString());
	}

	@Then("verify validation message should say Please enter a valid Edge ID!")
	public void verify_validation_message_should_say_please_enter_a_valid_edge_id() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Validation message", "Please enter a valid EDGE ID !",
				eda.verifyValidationMessageInvalidEdgeID());
	}

	@Then("verify that the devices are listed in the correct ascending order by EDGE ID when the user clicks on the Edge ID sorting icon")
	public void verify_that_the_devices_are_listed_in_the_correct_ascending_order_by_edge_id_when_the_user_clicks_on_the_edge_id_sorting_icon()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.verifysortingonEdgeID();
		Thread.sleep(3000);
		edp.headingClick();
	}

	@Then("verify Edge ID sorting")
	public void verify_edge_id_sorting() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.verifysortingonEdgeID();
	}

	@Then("verify EDGE Name sorting")
	public void verify_edge_name_sorting() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.verifysortingonEdgeName();
	}

	@Then("verify EDGE Group Name sorting")
	public void verify_edge_group_name_sorting() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.verifysortingonEdgeGroupName();
	}

	@Then("verify App Groups sorting")
	public void verify_app_groups_sorting() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.verifysortingonAppGroups();
	}

	@Then("verify Hardware Name sorting")
	public void verify_hardware_name_sorting() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.verifysortingonHardwareName();
	}

	@Then("verify Communication Status sorting")
	public void verify_communication_status_sorting() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.scrollingElementRightBar("div.example-container", "900");
		edp.verifysortingonCommunicationName();
	}

	@Then("verify Status sorting")
	public void verify_status_sorting() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

		edp.verifysortingonStatus();
	}

	@When("User does not select any value from the organization mandatory dropdown field")
	public void user_does_not_select_any_value_from_the_organization_mandatory_dropdown_field() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.saveEdgeDeviceButton();
	}

	@Then("A validation message should appear for the mandatory organization dropdown field")
	public void a_validation_message_should_appear_for_the_mandatory_organization_dropdown_field() {
		EdgeDeviceAdd edp = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Mandatory field - required !", edp.validationMessageForOrganization());
	}

	@When("User does not select any value from the mandatory Edge Group Name dropdown field")
	public void user_does_not_select_any_value_from_the_mandatory_edge_group_name_dropdown_field()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
	}

	@Then("A validation message should appear for the mandatory Edge Group Name dropdown field")
	public void a_validation_message_should_appear_for_the_mandatory_edge_group_name_dropdown_field() {
		EdgeDeviceAdd edp = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Mandatory field - required !", edp.validationMessageForEdgeGroupName());
	}

	@When("User does not select any value from the mandatory Hardware Name dropdown field")
	public void user_does_not_select_any_value_from_the_mandatory_hardware_name_dropdown_field()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.saveAddData();
	}

	@Then("A validation message should appear for the mandatory Hardware Name dropdown field")
	public void a_validation_message_should_appear_for_the_mandatory_hardware_name_dropdown_field() {
		EdgeDeviceAdd edp = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Mandatory field - required !", edp.validationMessageForHardwareName());
	}

	@Then("User enters invalid value under Edge Name under Identity section")
	public void user_enters_invalid_value_under_edge_name_under_identity_section() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.identityedgeNameAdd(alldata.get(vTCName).get("EdgeNameAdd").toString());

		eda.headingTitleAdd();

		Assert.assertEquals("Edge Name error message", "Please Enter a valid EDGE Name !",
				eda.verifyValidationMessageEdgeName1());
	}

	@When("User does not select any value from the mandatory App Group Name dropdown field")
	public void user_does_not_select_any_value_from_the_mandatory_app_group_name_dropdown_field()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.scrollingvertical();
		eda.saveAddData();
	}

	@Then("A validation message should appear for the mandatory App Group Name dropdown field")
	public void a_validation_message_should_appear_for_the_mandatory_app_group_name_dropdown_field() {
		EdgeDeviceAdd edp = new EdgeDeviceAdd(driver, logger);
		Assert.assertEquals("Mandatory field - required !", edp.validationMessageForAppGroupName());
	}

	@When("user enters valid data in all mandatory and optional text fields under identity accordion")
	public void user_enters_valid_data_in_all_mandatory_and_optional_text_fields_under_identity_accordion()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.identityedgeIdInputAdd(alldata.get(vTCName).get("EdgeIDAdd").toString());
		eda.identityedgeNameAdd(alldata.get(vTCName).get("EdgeNameAdd").toString());
		eda.organizationAdd(alldata.get(vTCName).get("OrganizationAdd").toString());
		eda.edgeGroupNameAdd(alldata.get(vTCName).get("EDGEGroupNameAdd").toString());
		// eda.assignedToAdd(alldata.get(vTCName).get("AssignedToAdd").toString());
		Thread.sleep(5000);
		// eda.selectassignedToAdd(alldata.get(vTCName).get("AssignedToAdd").toString());
		eda.locationAdd(alldata.get(vTCName).get("LocationAdd").toString());
		eda.hardWareNameAdd(alldata.get(vTCName).get("HardwareNameAdd").toString());
		eda.descriptionAdd(alldata.get(vTCName).get("DescriptionAdd").toString());
	}

	@When("user enters valid data in serial number, onboarding key ,image version as optional field under registration accordion")
	public void user_enters_valid_data_in_serial_number_onboarding_key_image_version_as_optional_field_under_registration_accordion() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.serialNumberInputAdd(alldata.get(vTCName).get("SerialNumberAdd").toString());
		eda.onBoardingKeyInputAdd(alldata.get(vTCName).get("OnboardingKeyAdd").toString());
		eda.imageVersionInputAdd(alldata.get(vTCName).get("ImageVersionNumberAdd").toString());
	}

	@When("user select App group dropdown value under deployment accordion")
	public void user_select_app_group_dropdown_value_under_deployment_accordion() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.applicationGroupSelect(alldata.get(vTCName).get("AppGroupAdd").toString());
	}

	@When("user enters valid data in Edge username and Edge password under the well mapping accordion")
	public void user_enters_valid_data_in_edge_username_and_edge_password_under_the_well_mapping_accordion() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.edgeUserInputAdd(alldata.get(vTCName).get("edgeuserNameAdd").toString());
		eda.edgeUserPasswordAdd(alldata.get(vTCName).get("edgepasswordAdd").toString());
	}

	@Then("verify device should be added successfully")
	public void verify_device_should_be_added_successfully() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);

	}

	@Then("verify success message should be displayed")
	public void verify_success_message_should_be_displayed() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.ToasterMessageShouldBeDisplayed(alldata.get(vTCName).get("toastermessage").toString());
	}



	@Then("search Edge Name from existing Edge device to deply app")
	public void search_edge_name_from_existing_edge_device_to_deply_app() throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("EDGENameSearch").toString());
		edp.backDropShowing_Div_Click();
		Thread.sleep(2000);
	}

	@When("User clears the EDGE Name field under the Identity section")
	public void user_clears_the_edge_name_field_under_the_identity_section() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		Thread.sleep(3000);
		eda.removalofEneredTextForEdgeName();
	}

	@Then("verify validation message should appear for the blank input field of Edge Name")
	public void verify_validation_message_should_appear_for_the_blank_input_field_of_edge_name() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		Assert.assertEquals("Mandatory field - required !", eda.verifyValidationMessageEdgeName());
	}

	@When("User clears the edge username and password")
	public void user_clears_the_edge_username_and_password() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		eda.removalofEneredTextForEdgeUserName();

	}

	@Then("verify no validation error message should be displayed for Edge Username, password under well mapping of User Edit screen")
	public void verify_no_validation_error_message_should_be_displayed_for_edge_username_password_under_well_mapping_of_user_edit_screen() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		// Assert no validation error messages are displayed
		Assert.assertFalse("Validation error is displayed for the Edge Username Number field!",
				eda.isElementDisplayedForEdgeUsernameForWellMApping());
		eda.removalofEneredTextForEdgePassword();
		Assert.assertFalse("Validation error is displayed for the Edge Password Number field!",
				eda.isElementDisplayedForEdgePasswordForWellMApping());

	}

	@When("User clears the Location and Description field under identity")
	public void user_clears_the_location_and_description_field_under_identity() {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);
		eda.removalofEneredTextForDescription();
		// Assert.assertFalse("Validation error is displayed for the Description
		// field!",eda.isElementDisplayedForDescription());
	}

	@Then("verify no validation error message should be displayed for Location and Description of User Edit screen")
	public void verify_no_validation_error_message_should_be_displayed_for_location_and_description_of_user_edit_screen()
			throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		Assert.assertFalse("Validation error is displayed for the Location field!",
				eda.isElementDisplayedForLocation());
		Thread.sleep(3000);

	}

	@Then("verify all tooltips on Edge Edit screen")
	public void verify_all_tooltips_on_edge_edit_screen() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		Assert.assertEquals("Unique ID assigned for the EDGE Device", eda.get_tooltipforEdgeID());
		Assert.assertEquals("Name assigned for the EDGE Device", eda.get_tooltipforEdgeName());
		Assert.assertEquals("Organization to which the User is assigned", eda.get_tooltipforOrganization());
		Assert.assertEquals("EDGE Group to which the EDGE Device is assigned", eda.get_tooltipforEdgeGroupName());
		Assert.assertEquals("User assigned for the EDGE Device", eda.get_tooltipforAssignedTo());
		Assert.assertEquals("Site at which the EDGE Device is installed", eda.get_tooltipforLocation());
		Assert.assertEquals("Short specific information about the EDGE Device", eda.get_tooltipforDescription());
		Thread.sleep(3000);
		Assert.assertEquals("Unique Name assigned for the Hardware", eda.get_tooltipforHardwareName());

		eda.scrollingvertical();

		Assert.assertEquals(
				"The date (MM-DD-YYYY) and time (HH:MM) (+/- HH:MM) of the last communication from the EDGE Device.",
				eda.get_tooltipforHealthLastHeartBeatTimeStamp());

		Assert.assertEquals(
				"The date (MM-DD-YYYY) and time (HH:MM) (+/- HH:MM) of last broker timestamp from the EDGE Device",
				eda.get_tooltipforlastHeartBrokerTimeStamp());
		Assert.assertEquals("Serial Number of EDGE Device", eda.get_tooltipSerialNumber());
		Assert.assertEquals("Alphanumeric key assigned for the EDGE Device to be onboarded",
				eda.get_tooltipforOnboardingKey());
		Assert.assertEquals("Version of the EVE Operating System", eda.get_tooltipforImageVersion());

		Assert.assertEquals("Application Group to which the EDGE Device is assigned", eda.get_tooltipDeployment());
		Assert.assertEquals("EDGE Username", eda.get_tooltipEdgeUser());
		Assert.assertEquals("EDGE Password", eda.get_tooltipEdgepassword());

	}

	@Then("verify all tooltips on Edge Add screen")
	public void verify_all_tooltips_on_edge_add_screen() throws InterruptedException {
		EdgeDeviceAdd eda = new EdgeDeviceAdd(driver, logger);

		Assert.assertEquals("Unique ID assigned for the EDGE Device", eda.get_tooltipforEdgeID());
		Assert.assertEquals("Name assigned for the EDGE Device", eda.get_tooltipforEdgeName());
		Assert.assertEquals("Organization to which the User is assigned", eda.get_tooltipforOrganization());
		Assert.assertEquals("EDGE Group to which the EDGE Device is assigned", eda.get_tooltipforEdgeGroupName());
		Assert.assertEquals("User assigned for the EDGE Device", eda.get_tooltipforAssignedTo());
		Assert.assertEquals("Site at which the EDGE Device is installed", eda.get_tooltipforLocation());
		Assert.assertEquals("Short specific information about the EDGE Device", eda.get_tooltipforDescription());
		Thread.sleep(3000);
		Assert.assertEquals("Unique Name assigned for the Hardware", eda.get_tooltipforHardwareName());

		eda.scrollingvertical();
		Assert.assertEquals(
				"The date (MM-DD-YYYY) and time (HH:MM) (+/- HH:MM) of the last communication from the EDGE Device.",
				eda.get_tooltipforHealthLastHeartBeatTimeStamp());

		Assert.assertEquals(
				"The date (MM-DD-YYYY) and time (HH:MM) (+/- HH:MM) of last broker timestamp from the EDGE Device",
				eda.get_tooltipforlastHeartBrokerTimeStamp());
		Assert.assertEquals("Serial Number of EDGE Device", eda.get_tooltipSerialNumber());
		Assert.assertEquals("Alphanumeric key assigned for the EDGE Device to be onboarded",
				eda.get_tooltipforOnboardingKey());
		Assert.assertEquals("Version of the EVE Operating System", eda.get_tooltipforImageVersion());

		Assert.assertEquals("EDGE Username", eda.get_tooltipEdgeUser());
		Assert.assertEquals("EDGE Password", eda.get_tooltipEdgepassword());
		Assert.assertEquals("Application Group to which the EDGE Device is assigned", eda.get_tooltipDeployment());
	}

	@Then("search Edge Name from existing Edge device and click on deploy button from the action column")
	public void search_edge_name_from_existing_edge_device_and_click_on_deploy_button_from_the_action_column()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("EDGENameSearch").toString());
		edp.backDropShowing_Div_Click();
		edp.scrollingElementRightBar("div.example-container", "900");
		Thread.sleep(3000);
		edp.clickondeployimage();

	}

	@Then("Select the check box next to the name of each application you want to deploy to the EDGE.")
	public void select_the_check_box_next_to_the_name_of_each_application_you_want_to_deploy_to_the_edge()
			throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.appNameSearchDot();

		egc.sendvalueAppName(alldata.get(vTCName).get("appNameInput").toString());

		egc.backDropShowing_Div_Click();
		egc.selectCheckboxesForApplications(alldata.get(vTCName).get("appNameSelection").toString());
		Thread.sleep(2000);
		egc.verifyCheckboxesSelected(alldata.get(vTCName).get("appNameSelection").toString());

	}

	@When("User clicks on the {string} button at step {int} \\(App Name)")
	public void user_clicks_on_the_button_at_step_app_name(String string, Integer int1) {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.nextButtonFour();
	}

	@Then("The user should be navigated to step {int} \\(Deployment)")
	public void the_user_should_be_navigated_to_step_deployment(Integer int1) {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		String step5Text = egc.stepperfiveHeader().getText();
		Assert.assertEquals("Deployment", step5Text);

		boolean deployCondition = egc.deployButtonOnStepperFive();
		Assert.assertFalse("Deploy button is not activated.", deployCondition);

	}

	@When("User clicks on the {string} button to approve the selections")
	public void user_clicks_on_the_button_to_approve_the_selections(String string) throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.confirmButtonStepFive();
		Thread.sleep(8000);

	}

	@Then("verify {string} button should become activated")
	public void verify_button_should_become_activated(String string) {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		// Verify that the "Deploy" button is active After user click on confirm button
		boolean deployConditionAfterConfirmation = egc.deployButtonOnStepperFive();
		Assert.assertTrue(deployConditionAfterConfirmation);
	}

	@Then("verify user should be able to proceed with the deployment")
	public void verify_user_should_be_able_to_proceed_with_the_deployment() throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.deployButtonOnStepperFiveclick();
		Thread.sleep(8000);
	}

	@Then("verify each application has three actions available having Restart, Purge")
	public void verify_each_application_has_three_actions_available_having_restart_purge() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		List<WebElement> applicationRows = driver.findElements(By.xpath("//table/tbody/tr[1]/td[4]"));

		for (WebElement row : applicationRows) {

			WebElement actionsCheckbox = row.findElement(By.cssSelector(".mat-checkbox "));
			Actions actions = new Actions(driver);
			actions.moveToElement(actionsCheckbox).perform();
		}
		Assert.assertEquals("Restart", egc.get_tooltipRestart());
		Assert.assertEquals("Purge", egc.get_tooltipPurge());
		Assert.assertEquals("Activate", egc.get_tooltipActivate());
	}

	@Then("verify Steps {int} \\(EDGE Groups), {int} \\(APP Groups), {int} \\(EDGE) should be disabled")
	public void verify_steps_edge_groups_app_groups_edge_should_be_disabled(Integer int1, Integer int2, Integer int3) {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);

		Assert.assertEquals("Step 1 (EDGE Groups) unexpectedly has a hyperlink.", "EDGE Group", egc.stepperOne());
		Assert.assertEquals("Step 2 (App Groups) unexpectedly has a hyperlink.", "App Groups", egc.stepperTwo());

	}

	@Then("verify Step {int} \\(App Name) should be highlighted as the active step")
	public void verify_step_app_name_should_be_highlighted_as_the_active_step(Integer int1) {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		String fontWeight = egc.stepperFour();
		Assert.assertTrue("Step 4 (App Name) is not visually highlighted.",
				fontWeight.equals("bold") || Integer.parseInt(fontWeight) >= 400);

	}

	@Then("Select Click to expand the JSON file configuration Expand to maximize the JSON file configuration.")
	public void select_click_to_expand_the_json_file_configuration_expand_to_maximize_the_json_file_configuration() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.expandJsonButton();
		Assert.assertEquals("section", egc.verifyjsoncontainer(), "inline");
	}

	@Then("Select Click to collapse icon to minimize the JSON file configuration.")
	public void select_click_to_collapse_icon_to_minimize_the_json_file_configuration() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.collapseJsonButton();
		Assert.assertEquals("section", egc.verifyjsoncontainerCollapse(), "auto");
	}

	@Then("click on Previous button to verify tooltip for Edge, Status and also verify tooltip for Restart checkbox tooltip under Actions column under Step3\\(EDGE)")
	public void click_on_previous_button_to_verify_tooltip_for_edge_status_and_also_verify_tooltip_for_restart_checkbox_tooltip_under_actions_column_under_step3_edge()
			throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.previousButtonStepFour();
		Thread.sleep(3000);

		Assert.assertEquals("Tooltip for Edge", "Name assigned for the EDGE Device", egc.get_Text_EdgeColumn());

		Assert.assertEquals("Tooltip for Status", "Defines the deployment status of the EDGE",
				egc.get_Text_EdgeStatusColumn());

	}

	@Then("click on Previous button to verify tooltip select, App Group Name and status under Step2\\(App Groups)")
	public void click_on_previous_button_to_verify_tooltip_select_app_group_name_and_status_under_step2_app_groups() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);

		Assert.assertEquals("Tooltip for App Group Name", "Unique Name assigned for the App Group",
				egc.get_Text_appGroupNameColumn());

		Assert.assertEquals("Tooltip for Status", "Defines the deployment status of the App Group",
				egc.get_Text_StatusColumnForAppGroups());
	}

	@When("user click on the kebab menu next to the App Name")
	public void user_click_on_the_kebab_menu_next_to_the_app_name() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.appNameSearchDot();

	}

	@When("user type an invalid search query in the search bar of App Name")
	public void user_type_an_invalid_search_query_in_the_search_bar_of_app_name() throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.sendvalueAppName(alldata.get(vTCName).get("AppNameSearch").toString());
		egc.backDropShowing_Div_Click();
		Thread.sleep(2000);
	}

	@Then("verify user should see a message saying {string}")
	public void verify_user_should_see_a_message_saying(String string) {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);

		Assert.assertEquals("No Data Found", egc.noResultMessage());

	}

	@When("user type valid search query in the search bar of App Name")
	public void user_type_valid_search_query_in_the_search_bar_of_app_name() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.appNameSearchDot();
		egc.sendvalueAppName(alldata.get(vTCName).get("AppNameSearch").toString());

	}

	@Then("verify search results of App Name should be relevant to the query entered")
	public void verify_search_results_of_app_name_should_be_relevant_to_the_query_entered() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);

		int rowCount = egc.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		Assert.assertTrue("Row found for search.", rowCount > 0);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = egc.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("user click on the kebab menu next to the Edge")
	public void user_click_on_the_kebab_menu_next_to_the_edge() throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.EdgeIDDot();
		Thread.sleep(3000);
	}

	@When("user type invalid search query in the search bar of EDGE")
	public void user_type_invalid_search_query_in_the_search_bar_of_edge() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.sendvalueEdgeName(alldata.get(vTCName).get("EdgeSearch").toString());
		egc.backDropShowing_Div_Click();
	}

	@Then("click on previous button to visit EDGE Stepper")
	public void click_on_previous_button_to_visit_edge_stepper() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.previousButtonStepFour();
	}

	@Then("click on previous button to visit App Groups")
	public void click_on_previous_button_to_visit_app_groups() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.previousButtonStepThree();
	}

	@When("user click on the kebab menu next to the App Groups")
	public void user_click_on_the_kebab_menu_next_to_the_app_groups() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.appGroupNameDot();
	}

	@When("user type valid search query in the search bar of App Groups")
	public void user_type_valid_search_query_in_the_search_bar_of_app_groups() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.sendvalueAppGroupName(alldata.get(vTCName).get("AppGroupNameSearchConfig").toString());
		egc.backDropShowing_Div_Click();
	}

	@When("user type invalid search query in the search bar of App Groups")
	public void user_type_invalid_search_query_in_the_search_bar_of_app_groups() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.sendvalueAppGroupName(alldata.get(vTCName).get("AppGroupNameSearchConfig").toString());
		egc.backDropShowing_Div_Click();
	}

	@Then("click on previous button to visit Edge Groups")
	public void click_on_previous_button_to_visit_edge_groups() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.previousButtonStepTwo();
	}

	@When("user click on the kebab menu next to the Edge Groups")
	public void user_click_on_the_kebab_menu_next_to_the_edge_groups() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.edgeGroupNameDot();
	}

	@When("user type valid search query in the search bar of Edge Groups")
	public void user_type_valid_search_query_in_the_search_bar_of_edge_groups() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.sendvalueEdgeGroupName(alldata.get(vTCName).get("EdgeGroupNameSearchConfig").toString());
		egc.backDropShowing_Div_Click();
	}

	@Then("verify search results of Edge Groups should be relevant to the query entered")
	public void verify_search_results_of_edge_groups_should_be_relevant_to_the_query_entered() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);

		int rowCount = egc.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		Assert.assertTrue("Row found for search.", rowCount > 0);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = egc.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("verify search results of App Groups should be relevant to the query entered")
	public void verify_search_results_of_app_groups_should_be_relevant_to_the_query_entered() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);

		int rowCount = egc.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		Assert.assertTrue("Row found for search.", rowCount > 0);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = egc.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("search Edge Name from existing Edge device and click on config apps button from the action column")
	public void search_edge_name_from_existing_edge_device_and_click_on_config_apps_button_from_the_action_column()
			throws InterruptedException {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeNameSearch_Button();
		edp.sendValueSearchIconByEdgeName(alldata.get(vTCName).get("EDGENameSearch").toString());
		edp.backDropShowing_Div_Click();
		Thread.sleep(2000);
		edp.scrollingElementRightBar("div.example-container", "900");
		edp.configAppButton();

	}

	@Then("select the app which user want to configure")
	public void select_the_app_which_user_want_to_configure() throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);

		egc.appNameSearchDot();

		egc.sendvalueAppName(alldata.get(vTCName).get("AppnameSearchconfig").toString());

		egc.backDropShowing_Div_Click();

		Thread.sleep(3000);
		egc.selectCheckboxesForApplications(alldata.get(vTCName).get("checkApp").toString());
		Thread.sleep(3000);
	}

	@Then("click on Next button")
	public void click_on_next_button() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.nextButtonThree();
	}

	@Then("upload configuration file icon at the corner of the page")
	public void upload_configuration_file_icon_at_the_corner_of_the_page() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.addconfigurationFileButton();
	}

	@Then("the user clicks on the Choose File option from the popup for ConfiguringApps")
	public void the_user_clicks_on_the_choose_file_option_from_the_popup_for_configuring_apps() {

		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		File uploadFile = new File(alldata.get(vTCName).get("UploadFilePathForConfig").toString());
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		fileInput.sendKeys(uploadFile.getAbsolutePath());
	}

	@Then("add information about fqdn information  and Proxy app details")
	public void add_information_about_fqdn_information_and_proxy_app_details() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.sendvalueforfqdn(alldata.get(vTCName).get("fqdninfo").toString());
		egc.enterProxyAppInfo(alldata.get(vTCName).get("ProxyAppInfo").toString());
	}

	@Then("click on save button to upload configuration file")
	public void click_on_save_button_to_upload_configuration_file() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.saveConfigFile();

	}

	@Then("user should see a {string} message on application configuration page")
	public void user_should_see_a_message_on_application_configuration_page(String expectedmessage)
			throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		Thread.sleep(3000);
		Object toasterMessageObj = alldata.get(vTCName).get("toastermessageForBulkAppConfig");
		if (toasterMessageObj == null) {
			throw new IllegalArgumentException("No toaster message found for test case: " + vTCName);
		}
		String expectedMessage = toasterMessageObj.toString().trim();
		Thread.sleep(2000);

		// Get the actual message from the page
		String actualMessage = egc.getConfirmationMessage();

		// Validate the expected and actual messages
		Assert.assertEquals("Confirmation message did not match", expectedMessage, actualMessage);
	}

	@Then("verify tooltips on stepper three\\(application)")
	public void verify_tooltips_on_stepper_three_application() {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);

		Assert.assertEquals("Tooltip for Select", "Select", egc.get_tooltipSelect());
		Assert.assertEquals("Tooltip for AppName", "Unique Name assigned for the Application",
				egc.get_tooltipAppName());
		Assert.assertEquals("Tooltip for Version/Tag", "Version number of the Application", egc.get_tooltipVersion());
		Assert.assertEquals("Tooltip for Status", "Indicates the Status of the Application", egc.get_tooltipStatus());
	}

	@Then("verify sorting on config App stepper Three")
	public void verify_sorting_on_config_app_stepper_three() throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.sortingOnAppName();
		egc.outerlayerclick();
		Thread.sleep(2000);
		egc.verifysortinOnVersion();
		egc.verifySortingOnStatus();
	}

	@Then("verify sorting on config App stepper four")
	public void verify_sorting_on_config_app_stepper_four() throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);

		egc.sortingonConfigName();
		egc.outerlayerclick();
		egc.sortingOnProxyApp();
		egc.outerlayerclick();

	}

	@Then("verify pagination on Stepper Four")
	public void verify_pagination_on_stepper_four() throws Exception {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
		// Assert.assertTrue("Row count match for last page",
		// edp.LastPageClickAndCount(rowPerPage));

		// Assert.assertTrue("Row count match for last page",
		// edp.nextPageClickAndCountOnLastPage(rowPerPage));
	}

	@Then("verify search functionality on config App and proxy App")
	public void verify_search_functionality_on_config_app_and_proxy_app() throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.searchconfigApp();
		egc.sendvalueConfigName(alldata.get(vTCName).get("ConfigApp").toString());
		egc.backDropShowing_Div_Click();
		Thread.sleep(3000);
		egc.searchProxyApp();
		egc.sendvalueProxyAppName(alldata.get(vTCName).get("ProxyApp").toString());
		egc.backDropShowing_Div_Click();

	}

	@Then("click on icon of Bulk Application configuration which is placed at top corner of the page")
	public void click_on_icon_of_bulk_application_configuration_which_is_placed_at_top_corner_of_the_page()
			throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.bulkApplicationConfigurationIcon();
		Thread.sleep(2000);
	}

	@Then("select App group and click on Next button")
	public void select_app_group_and_click_on_next_button() throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.appGroupNameDot();
		egc.sendvalueAppGroupName(alldata.get(vTCName).get("AppGroupNameSearchConfigBulkApplication").toString());
		egc.backDropShowing_Div_Click();
		egc.selectAppGroupName();
		Thread.sleep(3000);
		egc.nextButtonOne();
		Thread.sleep(2000);
	}

	@Then("select all the Edge Device and click on Next button")
	public void select_all_the_edge_device_and_click_on_next_button() throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.selectAllEdgeDevice();
		egc.nextButtonTwo();
		Thread.sleep(3000);
	}

	@Then("select application which user want to proceed for configuration")
	public void select_application_which_user_want_to_proceed_for_configuration() throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		egc.appNameSearchDot();
		egc.sendvalueAppName(alldata.get(vTCName).get("selectCheckboxForBulkApplicationConfiguration").toString());
		egc.backDropShowing_Div_Click();
		egc.selectCheckboxesForApplicationsForConfiguration();
		Thread.sleep(3000);
		egc.nextButtonThree();
		Thread.sleep(3000);
	}


	@Then("click on EDGE Device Logs tab")
	public void click_on_edge_device_logs_tab() {
		EdgeDevicesPage edp = new EdgeDevicesPage(driver, logger);
		edp.edgeDeviceLogsTab();
	}

	@Then("verify search functionality of all column placed on EDGE Device logs")
	public void verify_search_functionality_of_all_column_placed_on_edge_device_logs() throws InterruptedException {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.TimeStampThreeDot();
		Thread.sleep(2000);
		CalenderPage cal = new CalenderPage(driver, logger);
		edep.calenderIcon();
		Thread.sleep(2000);
		String year = alldata.get(vTCName).get("TimeStampYear").toString();
		String month = alldata.get(vTCName).get("TimeStampMonth").toString();
		Thread.sleep(3000);
		String day = alldata.get(vTCName).get("TimeStampFromDate").toString();
		String day2 = alldata.get(vTCName).get("TimeStampToDate").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		Thread.sleep(3000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);
		Thread.sleep(2000);
		edep.applybuttoncalender();
		
		Thread.sleep(2000);
		edep.TimeStampThreeDot();
		edep.outerlayerclick();
		edep.severity();
		edep.sendTimeSeverity(alldata.get(vTCName).get("SeverityInput").toString());
		edep.outerlayerclick();
		Thread.sleep(2000);
		edep.source();
		edep.sourceValue(alldata.get(vTCName).get("sourcevalue").toString());
		edep.outerlayerclick();
		Thread.sleep(2000);
		edep.message();
		edep.sendMessage(alldata.get(vTCName).get("sendMessagevalue").toString());
		edep.outerlayerclick();
		Thread.sleep(2000);

	}
	@Then("click on configurations tab")
	public void click_on_configurations_tab() throws InterruptedException {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.configurationsTab();
		Thread.sleep(5000);
	}
	@Then("verify view response body functionality")
	public void verify_view_response_body_functionality() {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.viewResponseBody();
	}

	@Then("verify sorting on TimeStamp")
	public void verify_sorting_on_time_stamp() throws InterruptedException {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.sortingOnTimeStamp();
	}

	@Then("verify sorting on severity")
	public void verify_sorting_on_severity() throws InterruptedException {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.sortingOnSeverity();
	}

	@Then("verify sorting on source")
	public void verify_sorting_on_source() throws InterruptedException {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.sortingOnSource();
	}

	@Then("verify sorting on message")
	public void verify_sorting_on_message() throws InterruptedException {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.sortingOnMessage();
	}
	
	@Then("verify sorting on EDGEName")
	public void verify_sorting_on_edge_name() throws InterruptedException {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.sortingonEdgeName();
		edep.outerlayerclick();
		Thread.sleep(2000);
	}
	
	@Then("verify sorting on AppName")
	public void verify_sorting_on_app_name() throws InterruptedException {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.sortingonAppName();
		edep.outerlayerclick();
		Thread.sleep(2000);
	}
	@Then("click on History view button")
	public void click_on_history_view_button() {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.historyViewButton();
	}

	@Then("verify {string} on the poup of view response body")
	public void verify_on_the_poup_of_view_response_body(String expectedTitle) throws InterruptedException {
	EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
	
	Thread.sleep(2000);
	
	String mainWindowHandle = driver.getWindowHandle(); // Save the main window handle

	// Wait for the popup to open
	new WebDriverWait(driver, Duration.ofSeconds(20))
	        .until(driver -> driver.getWindowHandles().size() >= 1);

	// Get all window handles
	Set<String> allWindowHandles = driver.getWindowHandles();

	// Switch to the popup window
	for (String handle : allWindowHandles) {
	    if (!handle.equals(mainWindowHandle)) {
	        driver.switchTo().window(handle); // Switch focus to the popup
	        break;
	    }
	}

	// Wait for the popup title to match the expected title
	new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.titleIs("Configuration Response Body"));

	// Get the title of the popup window
	String popupTitle = driver.getTitle();
	System.out.println("Popup Title: " + popupTitle);

	// Assert the popup title
	assert popupTitle.equals("Configuration Response Body") : "Popup title does not match the expected value.";

	// Close the popup window
	driver.close();

	// Switch back to the main window
	driver.switchTo().window(mainWindowHandle);

    
}





	@Then("verify sorting on ConfigName")
	public void verify_sorting_on_config_name() throws InterruptedException {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.sortingonConfigName();
		edep.outerlayerclick();
		Thread.sleep(2000);
	}
	@Then("verify sorting on LastUpdated")
	public void verify_sorting_on_last_updated() throws InterruptedException {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.sortingonLastUpdated();
		edep.outerlayerclick();
		Thread.sleep(2000);
	}
	@Then("click on download button under configurations tab when modifying an EDGE device")
	public void click_on_download_button_under_configurations_tab_when_modifying_an_edge_device() {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		edep.downloadButton();
	}
	@Then("verify user see download successful message and file should get downloaded for configurations")
	public void verify_user_see_download_successful_message_and_file_should_get_downloaded_for_configurations() {
		EdgeDeviceEdit edep = new EdgeDeviceEdit(driver, logger);
		WebElement downloadMessage = edep.downloadPopupmessageText();
		Assert.assertTrue("Bulk upload popup is not displayed", downloadMessage.isDisplayed());
	}

	@Then("search Edge Name from existing Edge device and click on Edit button from the action column")
	public void search_edge_name_from_existing_edge_device_and_click_on_edit_button_from_the_action_column() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("click on Environmental variable tab")
	public void click_on_environmental_variable_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Click on Add new button")
	public void click_on_add_new_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Enter details for Config Name and Config Value")
	public void enter_details_for_config_name_and_config_value() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Click on save button for environmental variable")
	public void click_on_save_button_for_environmental_variable() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}





}
