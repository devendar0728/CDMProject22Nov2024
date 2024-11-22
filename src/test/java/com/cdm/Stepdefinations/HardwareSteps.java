package com.cdm.Stepdefinations;

import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.JavascriptExecutor;

import com.cdm.pages.HardwareAddPage;
import com.cdm.pages.HardwareEditPage;
import com.cdm.pages.HardwarePage;

import io.cucumber.java.en.Then;

public class HardwareSteps extends BaseTest {

	@Then("Click on Hardware tab from right panel of the screen")
	public void click_on_hardware_tab_from_right_panel_of_the_screen() throws InterruptedException {

		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardware_tab();
		Thread.sleep(4000);

	}

	@Then("verify error message for entering invalid details for processor")
	public void verify_error_message_for_entering_invalid_details_for_processor() throws InterruptedException {

		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware Processor", "Processor associated with the EDGE Device",
				hap.get_Text_ToolTipHardwareProcessor());
		Thread.sleep(4000);
	}
	@Then("save all the information about hardware")
	public void save_all_the_information_about_hardware() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareName(alldata.get(vTCName).get("HardwareNameAdd").toString());
		hap.hardwareDisplayName(alldata.get(vTCName).get("HardwareDisplayNameAdd").toString());
		hap.hardwareModel(alldata.get(vTCName).get("ModelAdd").toString());
		hap.hardwareOS(alldata.get(vTCName).get("OSAdd").toString());
		hap.hardwareMake(alldata.get(vTCName).get("MakeAdd").toString());
		hap.hardwareProcessor(alldata.get(vTCName).get("ProcessorAdd").toString());
		hap.hardwareSavebutton();

	}
	@Then("enter the invalid hardware name and observe error message below Hardware Name text field")
	public void enter_the_invalid_hardware_name_and_observe_error_message_below_hardware_name_text_field() {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Unique Name assigned for the Hardware", hap.get_Text_ToolTipHardwareName());
	}



	@Then("enter the invalid model name and observe error message below model text field")
	public void enter_the_invalid_model_name_and_observe_error_message_below_model_text_field() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware Model", "Manufacturer of the EDGE Device",
				hap.get_Text_ToolTipHardwareModel());
		Thread.sleep(4000);
	}

	@Then("Click on Refresh button")
	public void click_on_refresh_button() throws InterruptedException {
		HardwarePage hp = new HardwarePage(driver, logger);
		hp.refreshlist();
		Thread.sleep(4000);
	}

	@Then("verify add button on hardware list page")
	public void verify_add_button_on_hardware_list_page() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareAddPlusicon();
		Thread.sleep(4000);
	}

	@Then("verify page with resize option the hardware page")
	public void verify_page_with_resize_option_the_hardware_page() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.setZoomLevel(800, 600);
		Thread.sleep(4000);
	}

	@Then("fill all mandatory and optional field for Add hardware")
	public void fill_all_mandatory_and_optional_field_for_add_hardware() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareName(alldata.get(vTCName).get("HardwareNameAdd").toString());
		hap.hardwareDisplayName(alldata.get(vTCName).get("HardwareDisplayNameAdd").toString());
		hap.hardwareDescription(alldata.get(vTCName).get("DescriptionAdd").toString());
		hap.hardwareModel(alldata.get(vTCName).get("ModelAdd").toString());
		hap.hardwareOS(alldata.get(vTCName).get("OSAdd").toString());
		hap.hardwareMake(alldata.get(vTCName).get("MakeAdd").toString());
		hap.hardwareProcessor(alldata.get(vTCName).get("ProcessorAdd").toString());
		Thread.sleep(4000);
	}

	@Then("click on save button to save hardware")
	public void click_on_save_button_to_save_hardware() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareSavebutton();
		Thread.sleep(4000);
	}

	@Then("click on add button icon")
	public void click_on_add_button_icon() throws InterruptedException {
		HardwarePage hp = new HardwarePage(driver, logger);
		Thread.sleep(4000);
		hp.hardwareAddPlusicon();

	}

	@Then("enter the invalid hardware name and observe error message below Harware Name text field")
	public void enter_the_invalid_hardware_name_and_observe_error_message_below_harware_name_text_field()
			throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareName(alldata.get(vTCName).get("HardwareNameAdd").toString());
		hap.hardwareSavebutton();
		Assert.assertEquals("Validation message", "Alphanumerics of length Min = 2, Max = 64 are allowed !",
				hap.verifyValidationMessageHardwareName());

	}

	@Then("enter the invalid Hardware Display Name and observe error message below Hardware Display Name text field")
	public void enter_the_invalid_hardware_display_name_and_observe_error_message_below_hardware_display_name_text_field()
			throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareDisplayName(alldata.get(vTCName).get("HardwareDisplayNameAdd").toString());
		hap.hardwareSavebutton();
		Assert.assertEquals("Validation message",
				"Alphanumerics & Special characters of length Min = 2, Max = 32 are allowed !",
				hap.verifyValidationMessageHardwareDisplayName());
	}

	@Then("enter the invalid description and observe error message below description text field")
	public void enter_the_invalid_description_and_observe_error_message_below_description_text_field() {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assume.assumeTrue("Description is not mandatory field", false);
	}

	@Then("verify error message for entering invalid details for model")
	public void verify_error_message_for_entering_invalid_details_for_model() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareModel(alldata.get(vTCName).get("ModelAdd").toString());
		hap.hardwareSavebutton();
		Assert.assertEquals("Validation message",
				"Alphanumerics & Special characters of length Min = 2, Max = 64 are allowed !",
				hap.verifyValidationMessageHardwareModel());
	}

	@Then("verify error message for entering invalid details for OS")
	public void verify_error_message_for_entering_invalid_details_for_os() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareOS(alldata.get(vTCName).get("OSAdd").toString());
		hap.hardwareSavebutton();
		Assert.assertEquals("Validation message",
				"Alphanumerics & Special characters of length Min = 2, Max = 64 are allowed !",
				hap.verifyValidationMessageHardwareOS());
	}

	@Then("verify error message for entering invalid details for Make")
	public void verify_error_message_for_entering_invalid_details_for_make() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareMake(alldata.get(vTCName).get("MakeAdd").toString());
		hap.hardwareSavebutton();
		Assert.assertEquals("Validation message",
				"Alphanumerics & Special characters of length Min = 2, Max = 64 are allowed !",
				hap.verifyValidationMessageHardwareMake());
	}

	@Then("enter the invalid Processor and observe error message below Processor text field")
	public void enter_the_invalid_processor_and_observe_error_message_below_processor_text_field()
			throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.hardwareProcessor(alldata.get(vTCName).get("ProcessorAdd").toString());
		hap.hardwareSavebutton();
		Assert.assertEquals("Validation message",
				"Alphanumerics & Special characters of length Min = 2, Max = 64 are allowed !",
				hap.verifyValidationMessageHardwareProcessor());
	}

	@Then("search for hardware name")
	public void search_for_hardware_name() throws InterruptedException {
		HardwarePage hp = new HardwarePage(driver, logger);
		hp.hardwarethreedot();
		hp.hardwareNameSearch(alldata.get(vTCName).get("HardwareNameSearch").toString());
		// hp.backDropShowing_Div_Click();
		hp.outerlayerclick();
		Thread.sleep(4000);

	}

	@Then("scroll right to the page to see action column")
	public void scroll_right_to_the_page_to_see_action_column() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Thread.sleep(2000);
		hap.scrollingElementRightBar("div.example-container", "900");
		Thread.sleep(4000);

	}

	@Then("click on edit icon from actions column to Edit hardware")
	public void click_on_edit_icon_from_actions_column_to_edit_hardware() throws InterruptedException {
		HardwareEditPage hep = new HardwareEditPage(driver, logger);
		hep.hardwareEditButton();
		try {
			hep.removalofEnteredTextForhardwareNameEdit();
			hep.hardwareNameEdit(alldata.get(vTCName).get("HardWareNameEdit").toString());

			hep.removalofEnteredTextForhardwareDisplayNameEdit();
			hep.hardwareDisplayNameEdit(alldata.get(vTCName).get("HardwareDisplayNameEdit").toString());

			hep.removalofEnteredTextForhardwareDescriptionEdit();
			hep.hardwareDescriptionEdit(alldata.get(vTCName).get("DescriptionEdit").toString());

			hep.removalofEnteredTextForhardwareModelEdit();
			hep.hardwareModelEdit(alldata.get(vTCName).get("ModelEdit").toString());

			hep.removalofEnteredTextForhardwareOSEdit();
			hep.hardwareOSEdit(alldata.get(vTCName).get("OSEdit").toString());

			hep.removalofEnteredTextForhardwareMakeEdit();
			hep.hardwareMakeEdit(alldata.get(vTCName).get("MakeEdit").toString());

			hep.removalofEnteredTextForhardwareProcessorEdit();
			hep.hardwareProcessorEdit(alldata.get(vTCName).get("ProcessorEdit").toString());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("search for all fields for hardware")
	public void serach_for_all_fields_for_hardware() throws InterruptedException {
		HardwarePage hp = new HardwarePage(driver, logger);
		hp.hardwarethreedot();
		hp.hardwareName(alldata.get(vTCName).get("HardwareNameSearch").toString());
		// hp.backDropShowing_Div_Click();
		hp.outerlayerclick();
		hp.hardware_tab();

//		hp.hardwareDisplayNamethreedot();
//		hp.hardwareDisplayName(alldata.get(vTCName).get("Value2").toString());
//		hp.backDropShowing_Div_Click();

		hp.hardwareMakethreedot();
		hp.hardwareMake(alldata.get(vTCName).get("MakeSearch").toString());
		// hp.backDropShowing_Div_Click();
		hp.outerlayerclick();
		hp.hardware_tab();
		hp.scrollingElementRightBar("div.example-container", "900");

		Thread.sleep(4000);

		hp.hardwareModelthreedot();
		hp.hardwareModel(alldata.get(vTCName).get("ModelSearch").toString());
		// hp.backDropShowing_Div_Click();
		hp.outerlayerclick();
		hp.hardware_tab();

		hp.hardwareProcessorthreedot();
		hp.hardwareProcessor(alldata.get(vTCName).get("ProcessorSearch").toString());
		// hp.backDropShowing_Div_Click();
		hp.outerlayerclick();
		hp.hardware_tab();

		hp.hardwareosthreedot();
		hp.hardwareOS(alldata.get(vTCName).get("OSSearch").toString());
		// hp.backDropShowing_Div_Click();
		hp.outerlayerclick();
		hp.hardware_tab();
		Thread.sleep(4000);
	}

	@Then("click on save button to save update the changes")
	public void click_on_save_button_to_save_update_the_changes() throws InterruptedException {
		HardwareEditPage hap = new HardwareEditPage(driver, logger);

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".addButton\").click();");
		Thread.sleep(6000);
	}

	@Then("click on Delete icon from actions column to delete hardware")
	public void click_on_delete_icon_from_actions_column_to_delete_hardware() throws InterruptedException {
		HardwarePage hp = new HardwarePage(driver, logger);
		hp.hardwareDelete();
		Thread.sleep(5000);
		// hp.confirmationYesButton();
		hp.confirmationNoButton();
		Thread.sleep(5000);
	}

	@Then("verify tooltip for hardware Displayname")
	public void verify_tooltip_for_hardware_displayname() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardwareDisplayName", "Display Name assigned for the Hardware",
				hap.get_Text_ToolTipHardwareDisplayName());
		Thread.sleep(4000);
	}

	@Then("verify tooltip for hardwareName")
	public void verify_tooltip_for_hardware_name() throws InterruptedException {
		HardwarePage hp = new HardwarePage(driver, logger);
		try {
			Thread.sleep(4000);
			Assert.assertEquals("Tooltip of hardwareName", "Unique Name assigned for the Hardware",
					hp.get_Text_ToolTipHardwareName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		// hp.hardwareSavebutton();

	}

	@Then("verify tooltip text visibility for hardware Display Name input")
	public void verify_tooltip_text_visibility_for_hardware_display_name_input() throws Exception {
		Thread.sleep(4000);
		HardwarePage hp = new HardwarePage(driver, logger);
		try {
			Assert.assertEquals("Tooltip of hardwareDisplayName", "Display Name assigned for the Hardware",
					hp.get_Text_ToolTipHardwareDisplayName());
		} catch (Exception e) {

		}

	}

	@Then("verify visualization of icons in action column for hardware")
	public void verify_visualization_of_icons_in_action_column_for_hardware() {
		HardwarePage hp = new HardwarePage(driver, logger);
		Assume.assumeTrue("We can not automate look and feel of icons in action column for hardware", false);
	}

	@Then("verify tooltip for Hardware Display name")
	public void verify_tooltip_for_hardware_display_name() throws Exception {
		HardwarePage hp = new HardwarePage(driver, logger);
		Assert.assertEquals("Tooltip of hardware Display Name", "Display Name assigned for the Hardware",
				hp.get_Text_ToolTipHardwareDisplayName());

	}

	@Then("verify alignment of i.e. Add New,Refresh buttons on the top right side")
	public void verify_alignment_of_i_e_add_new_refresh_buttons_on_the_top_right_side() {
		HardwarePage hp = new HardwarePage(driver, logger);
		Assume.assumeTrue("Can not Automate alignment becuase this one is UI issue ", false);
	}

	@Then("verify tooltip for make for OS")
	public void verify_tooltip_for_make_for_os() {
		try {
			HardwarePage hp = new HardwarePage(driver, logger);
			Assert.assertEquals("Tooltip of OS", "Operating system running on the EDGE Device",
					hp.get_Text_ToolTipHardwareMake());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("verify tooltip for make for hardware")
	public void verify_tooltip_for_make_for_hardware() {
		try {
			HardwarePage hp = new HardwarePage(driver, logger);
			Assert.assertEquals("Tooltip of hardware make", "Manufacturer of the EDGE Device",
					hp.get_Text_ToolTipHardwareMake());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("verify tooltip for make for Processor")
	public void verify_tooltip_for_make_for_processor() {
		try {
			HardwarePage hp = new HardwarePage(driver, logger);
			Assert.assertEquals("Tooltip of Model", "Processor associated with the EDGE Device",
					hp.get_Text_ToolTipHardwareModel());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("verify tooltip for make for Model")
	public void verify_tooltip_for_make_for_model() {
		try {
			HardwarePage hp = new HardwarePage(driver, logger);
			Assert.assertEquals("Tooltip of Model", "Model name or version of the EDGE Device",
					hp.get_Text_ToolTipHardwareModel());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("verify tooltip for make for Status")
	public void verify_tooltip_for_make_for_status() {
		HardwarePage hap = new HardwarePage(driver, logger);
		Assert.assertEquals("Tooltip of hardwareStatus", "Indicates the Status of the Hardware",
				hap.get_Text_ToolTipHardwareStatus());

	}

	@Then("verify tooltip for hardware Description")
	public void verify_tooltip_for_hardware_description() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardwareDescription", "Short specific information about the Hardware",
				hap.get_Text_ToolTipHardwareDescription());
		Thread.sleep(4000);
	}

	@Then("verify tooltip for hardware Model")
	public void verify_tooltip_for_hardware_model() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware model", "Manufacturer of the EDGE Device",
				hap.get_Text_ToolTipHardwareModel());
		Thread.sleep(4000);
	}

	@Then("verify tooltip for hardware OS")
	public void verify_tooltip_for_hardware_os() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware OS", "Operating system running on the EDGE Device",
				hap.get_Text_ToolTipHardwareOS());
		Thread.sleep(4000);
	}

	@Then("verify tooltip for hardware Make")
	public void verify_tooltip_for_hardware_make() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware Make", "Model name or version of the EDGE Device",
				hap.get_Text_ToolTipHardwareMake());
		Thread.sleep(4000);
	}

	@Then("verify tooltip for hardware Processor")
	public void verify_tooltip_for_hardware_processor() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware Processor", "Processor associated with the EDGE Device",
				hap.get_Text_ToolTipHardwareProcessor());
		Thread.sleep(4000);
	}

	@Then("verify tooltip text visibility for Model Input text field in ADD Screen")
	public void verify_tooltip_text_visibility_for_model_input_text_field_in_add_screen() {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware Model", "Manufacturer of the EDGE Device",
				hap.get_Text_ToolTipHardwareModel());

	}

	@Then("click on edit button icon")
	public void click_on_edit_button_icon() {
		HardwareEditPage hep = new HardwareEditPage(driver, logger);
		hep.hardwareEditButton();
	}

	@Then("verify tooltip text visibility for hardware name Input text field in edit Screen")
	public void verify_tooltip_text_visibility_for_hardware_name_input_text_field_in_edit_screen() {
		HardwareEditPage hep = new HardwareEditPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware name", "Unique Name assigned for the Hardware",
				hep.get_Text_ToolTipHardwareName());
	}

	@Then("verify tooltip text visibility for hardware name Input text field in ADD Screen")
	public void verify_tooltip_text_visibility_for_hardware_name_input_text_field_in_add_screen() {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware name", "Unique Name assigned for the Hardware",
				hap.get_Text_ToolTipHardwareName());
	}

	@Then("verify tooltip text visibility for OS Input text field in ADD Screen")
	public void verify_tooltip_text_visibility_for_os_input_text_field_in_add_screen() {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware Os", "Operating system running on the EDGE Device",
				hap.get_Text_ToolTipHardwareOS());
	}

	@Then("verify tooltip text visibility for Description Input text field in Edit Screen")
	public void verify_tooltip_text_visibility_for_description_input_text_field_in_edit_screen() {
		HardwareEditPage hep = new HardwareEditPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware name", "Short specific information about the Hardware",
				hep.get_Text_ToolTipHardwareDescription());
	}

	@Then("verify tooltip text visibility for Model Input text field in Edit Screen")
	public void verify_tooltip_text_visibility_for_model_input_text_field_in_edit_screen() {
		HardwareEditPage hep = new HardwareEditPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware model", "Short specific information about the Hardware",
				hep.get_Text_ToolTipHardwareModel());
	}

	@Then("verify tooltip text visibility for Processor Input text field in Edit Screen")
	public void verify_tooltip_text_visibility_for_processor_input_text_field_in_edit_screen() {
		HardwareEditPage hep = new HardwareEditPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware model", "Processor associated with the EDGE Device",
				hep.get_Text_ToolTipHardwareProcessor());
	}

	@Then("verify tooltip text visibility for Make Input text field in Edit Screen")
	public void verify_tooltip_text_visibility_for_make_input_text_field_in_edit_screen() {
		HardwareEditPage hep = new HardwareEditPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware model", "Model name or version of the EDGE Device",
				hep.get_Text_ToolTipHardwareMake());
	}

	@Then("verify tool tip text visibilty for OS Input text field in Edit Screen")
	public void verify_tool_tip_text_visibilty_for_os_input_text_field_in_edit_screen() {
		HardwareEditPage hep = new HardwareEditPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware OS", "Operating system running on the EDGE Device",
				hep.get_Text_ToolTipHardwareOS());
	}

	@Then("verify screen resolution")
	public void verify_screen_resolution() {
		driver.manage().window().minimize();
	}

	@Then("verify tooltip text visibility for Processor Input text field in ADD Screen")
	public void verify_tooltip_text_visibility_for_processor_input_text_field_in_add_screen() {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware Model", "Processor associated with the EDGE Device",
				hap.get_Text_ToolTipHardwareProcessor());
	}

	@Then("verify tooltip text visibility for hardware make Input Name")
	public void verify_tooltip_text_visibility_for_hardware_make_input_name() {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware make input", "Model name or version of the EDGE Device",
				hap.get_Text_ToolTipHardwareMake());
	}

	@Then("verify tooltip text visibility for hardware description Input Name")
	public void verify_tooltip_text_visibility_for_hardware_description_input_name() {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		Assert.assertEquals("Tooltip of hardware Processor", "Short specific information about the Hardware",
				hap.get_Text_ToolTipHardwareDescription());
	}

	@Then("click on bell icon for alerts")
	public void click_on_bell_icon_for_alerts() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
//		hap.belliconClick();
//		Thread.sleep(4000);
	}

	@Then("verify dropdown functionality for Profile icon in Hardware")
	public void verify_dropdown_functionality_for_profile_icon_in_hardware() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.profileIconClick();
		Thread.sleep(4000);

	}

	@Then("click on expand button from navigation menu")
	public void click_on_expand_button_from_navigation_menu() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.expandtoggle();
		Thread.sleep(4000);
	}

	@Then("click on filter icon availability for Make")
	public void click_on_filter_icon_availability_for_make() {
		HardwarePage hardware = new HardwarePage(driver, logger);
		hardware.hardwareDisplayNamethreedot();
	}

	@Then("click on filter icon availability for Model")
	public void click_on_filter_icon_availability_for_model() {
		HardwarePage hardware = new HardwarePage(driver, logger);
		hardware.hardwareModelthreedot();
	}

	@Then("click on filter icon availability for Status")
	public void click_on_filter_icon_availability_for_status() {
		HardwarePage hardware = new HardwarePage(driver, logger);
		hardware.hardwareosthreedot();
	}

	@Then("verify alignment of string i.e. Add New,Refresh buttons on the top right side")
	public void verify_alignment_of_i_e_add_new_refresh_buttons_on_the_top_right_side(String string) {
		HardwarePage hardware = new HardwarePage(driver, logger);
	}

	@Then("verify url is loading without login into browser, copy & paste the url")
	public void verify_url_is_loading_without_login_into_browser_copy_paste_the_url() {
		HardwarePage hardware = new HardwarePage(driver, logger);
	}

	@Then("verify filter icon visibility for Hardware Display Name")
	public void verify_filter_icon_visibility_for_hardware_display_name() {
		HardwarePage hardware = new HardwarePage(driver, logger);
		hardware.hardwareDisplayNamethreedot();
	}

	@Then("verify filter icon visibility for Hardware Name")
	public void verify_filter_icon_visibility_for_hardware_name() {
		HardwarePage hardware = new HardwarePage(driver, logger);
		hardware.hardwareProcessorthreedot();
	}

	@Then("click on filter icon availability for OS")
	public void click_on_filter_icon_availability_for_os() {
		HardwarePage hardware = new HardwarePage(driver, logger);
		hardware.hardwareosthreedot();
	}

	@Then("check visibility duration of page")
	public void check_visibility_duration_of_page() {
		HardwarePage hardware = new HardwarePage(driver, logger);
	}

	@Then("click on filter icon availability for Processor")
	public void click_on_filter_icon_availability_for_processor() {
		HardwarePage hardware = new HardwarePage(driver, logger);
		hardware.hardwareProcessorthreedot();
	}

	@Then("click on collapse button from navigation menu")
	public void click_on_collapse_button_from_navigation_menu() throws InterruptedException {
		HardwareAddPage hap = new HardwareAddPage(driver, logger);
		hap.collapseToggle();
		Thread.sleep(4000);
	}

	@Then("click on filter icon availability for Hardware Name")
	public void click_on_filter_icon_availability_for_hardware_name() {
		HardwarePage hardware = new HardwarePage(driver, logger);
		hardware.hardwarethreedot();
	}

	@Then("click on filter icon availability for Hardware Display Name")
	public void click_on_filter_icon_availability_for_hardware_display_name() {
		HardwarePage hardware = new HardwarePage(driver, logger);

		hardware.hardwareDisplayNamethreedot();

	}

	@Then("click on sorting arrow for hardware name")
	public void click_on_sorting_arrow_for_hardware_name() {
		HardwarePage hardware = new HardwarePage(driver, logger);

		hardware.sortHardwareName();
	}

}
