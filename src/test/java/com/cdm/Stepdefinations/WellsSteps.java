package com.cdm.Stepdefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;

import com.cdm.pages.WellMapping;
import com.cdm.pages.WellNameAddPage;
import com.cdm.pages.WellNameEditPage;
import com.cdm.pages.WellsPage;

import io.cucumber.java.en.Then;

public class WellsSteps extends BaseTest {

	@Then("Try increasing & decreasing the Zoom% \\(from {int}% to {int}%) from browsers")
	public void try_increasing_decreasing_the_zoom_from_to_from_browsers(Integer int1, Integer int2) {
		WellsPage wells = new WellsPage(driver, logger);
		wells.setZoomLevel(800, 600);
	}

	@Then("Click on Wells tab from right panel of the screen")
	public void click_on_wells_tab_from_right_panel_of_the_screen() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.wellTab();

	}

	@Then("apply filter on well name and hit enter button")
	public void apply_filter_on_well_name_and_hit_enter_button() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.wellNameThreeDot();
		wells.searchWellName(alldata.get(vTCName).get("searchWellName").toString());
		//wells.backDropShowing_Div_Click();
		wells.outerlayerclick();


	}

	@Then("apply filter on IP Address")
	public void apply_filter_on_ip_address() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.ipAddressThreeDot();

		wells.inputIPAddressSearch(alldata.get(vTCName).get("searchipAddress").toString());
//		wells.backDropShowing_Div_Click();
		wells.outerlayerclick();
	}

	@Then("click on refresh button")
	public void click_on_refresh_button() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);

		wells.clickrefreshbutton();

	}

	@Then("Click on Three Dots for Device Type")
	public void click_on_three_dots_for_device_type() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.deviceTypeThreeDot();


	}

	@Then("apply filter on Device Type")
	public void apply_filter_on_device_type() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);

		wells.searchDeviceType(alldata.get(vTCName).get("searchDeviceType").toString().trim());
		wells.outerlayerclick();

	}

	@Then("Click on Three Dots for RTU Address")
	public void click_on_three_dots_for_rtu_address() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.RTUAddressThreeDot();

	}

	@Then("apply filter on RTU Address")
	public void apply_filter_on_rtu_address() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);

		wells.searchRTUAddress(alldata.get(vTCName).get("searchRTUAddress").toString());
		wells.outerlayerclick();

	}

	@Then("Click on Three Dots for Status")
	public void click_on_three_dots_for_status() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.statusThreeDot();

	}

	@Then("select Status inActive")
	public void select_status_in_active() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.inputStatusInActive();

		wells.outerlayerclick();

	}

	@Then("Click on Add new icon")
	public void click_on_add_new_icon() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.addbutton();
	}

	@Then("Click on cancel button from wells add page")
	public void click_on_cancel_button_from_wells_add_page() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);

		wells.cancelButtonwell();
	}

	@Then("Minimise the screen and observe the UI carefully")
	public void minimise_the_screen_and_observe_the_ui_carefully() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);

		wells.mimimizewindow();

	}

	@Then("apply filter on well name")
	public void apply_filter_on_well_name() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);
		wells.wellNameThreeDot();
		wells.searchWellName(alldata.get(vTCName).get("searchWellName").toString());
		//wells.backDropShowing_Div_Click();
		wells.outerlayerclick();

	}

	@Then("Maximise the screen")
	public void maximise_the_screen() throws InterruptedException {
		WellsPage wells = new WellsPage(driver, logger);

		wells.maximisewindow();
	}

	@Then("verify validation message for invalid file")
	public void verify_validation_message_for_invalid_file() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);
		try {
			Assert.assertEquals("Validation message for invalid extension file upload",
					"An error occurred. Please check downloaded error file", wp.get_Textget_Text_PopupMessageinvalid());
		} catch (Exception e) {

		}

	}

	@Then("verify validation message if well name is not being entered")
	public void verify_validation_message_if_well_name_is_not_being_entered() throws InterruptedException {

		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);

		//wellnameadd.verifyValidationMessageWellName();
		Assert.assertEquals("Validation message for Well name", "Mandatory field - required !",
				wellnameadd.verifyValidationMessageWellName());
	}

	@Then("verify validation message if SSID is not entered while creating a new well")
	public void verify_validation_message_if_is_not_entered_while_creating_a_new_well(String string)
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.verifyValidationMessagePassword();
	}

	@Then("verify validation message if IP Address is not entered while creating a new well")
	public void verify_validation_message_if_ip_address_is_not_entered_while_creating_a_new_well()
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
        wellnameadd.saveButton();
		wellnameadd.verifyValidationMessageIPAddress();
		Assert.assertEquals("Validation message for IP Address", "Mandatory field - required !",
				wellnameadd.verifyValidationMessageIPAddress());


	}

	@Then("verify validation message if Port Number is not entered while creating a new well")
	public void verify_validation_message_if_port_number_is_not_entered_while_creating_a_new_well()
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.saveButton();
		wellnameadd.verifyValidationMessagePort();
		Assert.assertEquals("Validation message for Port Number", "Mandatory field - required !",
				wellnameadd.verifyValidationMessagePort());
	}

	@Then("verify validation message if Device Type is left blank while adding a new Well")
	public void verify_validation_message_if_device_type_is_left_blank_while_adding_a_new_well()
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);

		Assert.assertEquals("Validation message for Device Type", "Mandatory field - required !",
				wellnameadd.verifyValidationMessagedeviceType());
	}

	@Then("verify validation message if the non-mandatory field RTU Address is left blank while adding a new Well")
	public void verify_validation_message_if_the_non_mandatory_field_rtu_address_is_left_blank_while_adding_a_new_well()
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.verifyValidationMessageRTUAddress();
		Assert.assertEquals("Validation message for RTU Address",
				"\n" + " Mandatory field - required ! Please enter a valid IP Address!",
				wellnameadd.verifyValidationMessageRTUAddress());
	}

	@Then("Add mandatory or all fields like Well Name,Password, IP Address, Port Number, RTUAddress, Device Type etc")
	public void add_mandatory_or_all_fields_like_well_name_password_ip_address_port_number_rtu_address_device_type_etc()
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.wellnameinputAdd(alldata.get(vTCName).get("wellnameinputAdd").toString());
		wellnameadd.deviceTypeDropdownAdd(alldata.get(vTCName).get("deviceTypeDropdownAdd").toString());
		wellnameadd.portnumberinputAdd(alldata.get(vTCName).get("portnumberinputAdd").toString());
		wellnameadd.RTUAddressinputAdd(alldata.get(vTCName).get("RTUAddressinputAdd").toString());
		wellnameadd.passwordinputAdd(alldata.get(vTCName).get("passwordinputAdd").toString());
		wellnameadd.IPAddressinputAdd(alldata.get(vTCName).get("IPAddressinputAdd").toString());

	}

	@Then("enter the data for well and choose slider in inactive mode")
	public void enter_the_data_for_well_and_choose_slider_in_inactive_mode() throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.wellnameinputAdd(alldata.get(vTCName).get("wellnameinputAdd").toString());
		wellnameadd.deviceTypeDropdownAdd(alldata.get(vTCName).get("deviceTypeDropdownAdd").toString());
		wellnameadd.portnumberinputAdd(alldata.get(vTCName).get("portnumberinputAdd").toString());
		wellnameadd.RTUAddressinputAdd(alldata.get(vTCName).get("RTUAddressinputAdd").toString());
		wellnameadd.passwordinputAdd(alldata.get(vTCName).get("passwordinputAdd").toString());
		wellnameadd.IPAddressinputAdd(alldata.get(vTCName).get("IPAddressinputAdd").toString());
		wellnameadd.moveSliderCondition("unchecked");
	}

	@Then("Enter all fields required to create a new Well on the Add Well Details Page.")
	public void enter_all_fields_required_to_create_a_new_well_on_the_add_well_details_page()
			throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.wellnameinputAdd(alldata.get(vTCName).get("wellnameinputAdd").toString());
		wellnameadd.deviceTypeDropdownAdd(alldata.get(vTCName).get("deviceTypeDropdownAdd").toString());
		wellnameadd.portnumberinputAdd(alldata.get(vTCName).get("portnumberinputAdd").toString());
		wellnameadd.RTUAddressinputAdd(alldata.get(vTCName).get("RTUAddressinputAdd").toString());
		wellnameadd.passwordinputAdd(alldata.get(vTCName).get("passwordinputAdd").toString());
		wellnameadd.IPAddressinputAdd(alldata.get(vTCName).get("IPAddressinputAdd").toString());
	}

	@Then("Observe that the status is Active by default")
	public void observe_that_the_status_is_active_by_default() throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		Assert.assertEquals("Tooltip of activeStatus", "Active", wellnameadd.get_Text_ToolTipActiveUser());

	}

	@Then("Click on the add icon to create new Well")
	public void click_on_the_add_icon_to_create_new_well() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);
		wp.addbutton();
	}

	@Then("click on three dots on well name")
	public void click_on_three_dots_on_well_name() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);
		wp.wellNameThreeDot();
		wp.searchWellName(alldata.get(vTCName).get("searchWellName").toString());
		wp.backDropShowing_Div_Click();

	}

	@Then("Observe the entry of the new well with status as Active")
	public void observe_the_entry_of_the_new_well_with_status_as_active() {
		WellsPage wp = new WellsPage(driver, logger);
		Assert.assertEquals("Tooltip of activeStatus", "Active", wp.get_Text_For_Status());
	}

	@Then("Add all fields except Well Name on the Add New Well tab")
	public void add_all_fields_except_well_name_on_the_add_new_well_tab() throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);

		wellnameadd.deviceTypeDropdownAdd(alldata.get(vTCName).get("deviceTypeDropdownAdd").toString());
		wellnameadd.portnumberinputAdd(alldata.get(vTCName).get("portnumberinputAdd").toString());
		wellnameadd.RTUAddressinputAdd(alldata.get(vTCName).get("RTUAddressinputAdd").toString());
		wellnameadd.passwordinputAdd(alldata.get(vTCName).get("passwordinputAdd").toString());
		wellnameadd.IPAddressinputAdd(alldata.get(vTCName).get("IPAddressinputAdd").toString());
	}
	@Then("without entering device type observe error message")
	public void without_entering_device_type_observe_error_message() throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.wellnameinputAdd(alldata.get(vTCName).get("wellnameinputAdd").toString());
		wellnameadd.portnumberinputAdd(alldata.get(vTCName).get("portnumberinputAdd").toString());
		wellnameadd.RTUAddressinputAdd(alldata.get(vTCName).get("RTUAddressinputAdd").toString());
		wellnameadd.passwordinputAdd(alldata.get(vTCName).get("passwordinputAdd").toString());
		wellnameadd.IPAddressinputAdd(alldata.get(vTCName).get("IPAddressinputAdd").toString());


	}

	@Then("Click on the three dots against the IP Address column inorder to search a particular Well")
	public void click_on_the_three_dots_against_the_ip_address_column_inorder_to_search_a_particular_well()
			throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);

		wp.ipAddressThreeDot();

	}

	@Then("Enter an IP Address to be searched in the available Search box")
	public void enter_an_ip_address_to_be_searched_in_the_available_search_box() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);

		wp.inputIPAddressSearch(alldata.get(vTCName).get("searchipAddress").toString());
		wp.backDropShowing_Div_Click();

	}

	@Then("Click on the three dots against the RTU Address column inorder to search a particular Well")
	public void click_on_the_three_dots_against_the_rtu_address_column_inorder_to_search_a_particular_well()
			throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);

		wp.RTUAddressThreeDot();
	}

	@Then("Enter an RTU Address to be searched in the available Search box")
	public void enter_an_rtu_address_to_be_searched_in_the_available_search_box() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);

		wp.searchRTUAddress(alldata.get(vTCName).get("searchRTUAddress").toString());
		wp.backDropShowing_Div_Click();

	}

	@Then("click on save button to save well")
	public void click_on_save_button_to_save_well() throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);

		wellnameadd.saveButton();

	}

	@Then("Click on download icon")
	public void click_on_download_icon() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);

		wp.downloadButtonWell();
	}

	@Then("deselect Active status")
	public void deselect_active_status() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);

		wp.activeStatusCheck();
	}

	@Then("Click on edit button for well given in the action column")
	public void click_on_edit_button_for_well_given_in_the_action_column() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);

		wp.wellEditButton();
	}

	@Then("modify Well Name")
	public void modify_well_name() throws InterruptedException {
		WellNameEditPage we = new WellNameEditPage(driver, logger);
		we.removalofEnteredTextForwellname();
		Thread.sleep(5000);
		we.wellnameinputEdit(alldata.get(vTCName).get("wellnameinputEdit").toString());

		we.saveButton();

	}

	@Then("modify Well Device Type")
	public void modify_well_device_type() throws InterruptedException {
		WellNameEditPage we = new WellNameEditPage(driver, logger);
		we.deviceTypeDropdownEdit(alldata.get(vTCName).get("deviceTypeDropdownEdit").toString());

		we.saveButton();

	}

	@Then("modify RTU Address")
	public void modify_rtu_address() throws InterruptedException {
		WellNameEditPage we = new WellNameEditPage(driver, logger);
		we.removalofEnteredTextForRTUAddress();
		we.RTUAddressinputEdit(alldata.get(vTCName).get("RTUAddressinputEdit").toString());
		// we.backDropShowing_Div_Click();

		we.saveButton();

	}

	@Then("modify password")
	public void modify_password() {
		WellNameEditPage we = new WellNameEditPage(driver, logger);
		we.removalofEnteredTextForPassword();
		we.passwordinputEdit(alldata.get(vTCName).get("passwordinputEdit").toString());
	}

	@Then("Click on Well Bulk upload icon at the top of the screen")
	public void click_on_well_bulk_upload_icon_at_the_top_of_the_screen() {
		WellMapping wm = new WellMapping(driver, logger);
		WellsPage wp = new WellsPage(driver, logger);
		wp.uploadwellbutton();
	}

	@Then("modify port number")
	public void modify_port_number() throws InterruptedException {
		WellNameEditPage we = new WellNameEditPage(driver, logger);
		we.removalofEnteredTextForPortNumber();
		Thread.sleep(4000);
		we.portnumberinputEdit(alldata.get(vTCName).get("portnumberinputEdit").toString());
		we.saveButton();
	}

	@Then("verify validation message for password")
	public void verify_validation_message_for_password() throws InterruptedException {
		WellNameEditPage we = new WellNameEditPage(driver, logger);

		we.verifyValidationMessagePassword();
	}

	@Then("Click Delete button to delete well")
	public void click_delete_button_to_delete_well() {
		WellsPage wp = new WellsPage(driver, logger);
		wp.deleteButton();

	}

	@Then("verify  well that is chosen for deleting and when Cancelled to do so, it does not get deleted and exists in the Wells list")
	public void verify_well_that_is_chosen_for_deleting_and_when_cancelled_to_do_so_it_does_not_get_deleted_and_exists_in_the_wells_list()
			throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);

		wp.ConfirmationNoButton();

	}

	@Then("Click on choose file option from popup")
	public void click_on_choose_file_option_from_popup() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);

		wp.choosefilebutton();


	}

	@Then("Click on Well Bulk upload icon")
	public void click_on_upload_icon() throws InterruptedException, AWTException {


		StringSelection ss = new StringSelection(alldata.get(vTCName).get("UploadFilePath").toString());
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

		String str = alldata.get(vTCName).get("UploadFilePath").toString();


	}

	@Then("Click on Upload button to upload well successfully")
	public void click_on_upload_button_to_upload_well_successfully() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);

		wp.uploadButtonwell();
		Thread.sleep(1000);
	}

	@Then("Click on template download icon")
	public void click_on_template_download_icon() throws InterruptedException {
		WellsPage wp = new WellsPage(driver, logger);
		wp.templateDownloadFile();

	}

	@Then("verify validation message if directly click on upload button")
	public void verify_validation_message_if_directly_click_on_upload_button() throws InterruptedException {
		;
		WellsPage wp = new WellsPage(driver, logger);
		wp.uploadButtonwell();

		Assert.assertEquals("Validation message for not doing bulk upload", "Please Enter the File",
				wp.validationmessagenotuploadingfile());
	}

	@Then("verify validation message for port")
	public void verify_validation_message_for_port() throws InterruptedException {
		WellNameEditPage wne = new WellNameEditPage(driver, logger);
          wne.removalofEnteredTextForPortNumber();
		  wne.verifyValidationMessagePort();
		Assert.assertEquals("Validation message for Port Number", "Mandatory field - required !",
				wne.verifyValidationMessagePortEdit());
	}

	@Then("Add all fields except Password on the Add Well Details Page")
	public void add_all_fields_except_password_on_the_add_well_details_page() throws InterruptedException {

		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.wellnameinputAdd(alldata.get(vTCName).get("wellnameinputAdd").toString());
		wellnameadd.deviceTypeDropdownAdd(alldata.get(vTCName).get("deviceTypeDropdownAdd").toString().trim());
		wellnameadd.portnumberinputAdd(alldata.get(vTCName).get("portnumberinputAdd").toString());
		wellnameadd.RTUAddressinputAdd(alldata.get(vTCName).get("RTUAddressinputAdd").toString());
		wellnameadd.IPAddressinputAdd(alldata.get(vTCName).get("IPAddressinputAdd").toString());

	}

	@Then("Add all fields except IP Address on the Add Well")
	public void add_all_fields_except_ip_address_on_the_add_well() throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.wellnameinputAdd(alldata.get(vTCName).get("wellnameinputAdd").toString());
		wellnameadd.deviceTypeDropdownAdd(alldata.get(vTCName).get("deviceTypeDropdownAdd").toString().trim());
		wellnameadd.portnumberinputAdd(alldata.get(vTCName).get("portnumberinputAdd").toString());
		wellnameadd.RTUAddressinputAdd(alldata.get(vTCName).get("RTUAddressinputAdd").toString());
		wellnameadd.passwordinputAdd(alldata.get(vTCName).get("passwordinputAdd").toString());
		wellnameadd.IPAddressinputAdd(alldata.get(vTCName).get("IPAddressinputAdd").toString());

	}

	@Then("Add all fields except Port Number on the Add Well")
	public void add_all_fields_except_port_number_on_the_add_well() throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.wellnameinputAdd(alldata.get(vTCName).get("wellnameinputAdd").toString());
		wellnameadd.deviceTypeDropdownAdd(alldata.get(vTCName).get("deviceTypeDropdownAdd").toString().trim());

		wellnameadd.RTUAddressinputAdd(alldata.get(vTCName).get("RTUAddressinputAdd").toString());
		wellnameadd.passwordinputAdd(alldata.get(vTCName).get("passwordinputAdd").toString());
		wellnameadd.IPAddressinputAdd(alldata.get(vTCName).get("IPAddressinputAdd").toString());

	}

	@Then("Add all fields except Device type on the Add Well Details Page")
	public void add_all_fields_except_device_type_on_the_add_well_details_page() throws InterruptedException {
		WellNameAddPage wellnameadd = new WellNameAddPage(driver, logger);
		wellnameadd.wellnameinputAdd(alldata.get(vTCName).get("wellnameinputAdd").toString());
		wellnameadd.portnumberinputAdd(alldata.get(vTCName).get("portnumberinputAdd").toString());
		wellnameadd.RTUAddressinputAdd(alldata.get(vTCName).get("RTUAddressinputAdd").toString());
		wellnameadd.passwordinputAdd(alldata.get(vTCName).get("passwordinputAdd").toString());
		wellnameadd.IPAddressinputAdd(alldata.get(vTCName).get("IPAddressinputAdd").toString());


	}

	@Then("verify confirmation message well added successfully appears on the screen.")
	public void verify_confirmation_message_well_added_successfully_appears_on_the_screen() {
		WellsPage wells = new WellsPage(driver, logger);
		Assert.assertTrue("Pop up message is visible once well gets added", wells.isVisiblepopupMessageWellAdd());

		Assert.assertEquals("Popup message for Add well", "Well added successfully",
				wells.get_Textget_Text_PopupMessage());
	}
	@Then("Type blank space characters starting & ending in Well Name Text field in the Wells > Add screen.")
	public void type_blank_space_characters_starting_ending_in_well_name_text_field_in_the_wells_add_screen() throws InterruptedException {
	    WellNameEditPage wep = new WellNameEditPage(driver, logger);
	    wep.removalofEnteredTextForwellname();
	    wep.wellnameinputEdit(alldata.get(vTCName).get("wellnameinputEdit").toString());

	}
	@Then("Message appears that only alphabetic characters are allowed")
	public void message_appears_that_only_alphabetic_characters_are_allowed() throws InterruptedException {
		 WellNameEditPage wep = new WellNameEditPage(driver, logger);


		 Thread.sleep(2000);
		 Assert.assertEquals("Popup message for Add well", "Please Enter a valid Well Name !"
		, wep.verifyValidationMessageWellName());
	}



}
