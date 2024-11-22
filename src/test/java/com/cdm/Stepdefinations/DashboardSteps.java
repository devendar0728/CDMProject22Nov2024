package com.cdm.Stepdefinations;

import org.junit.Assume;

import com.cdm.pages.DashboardPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps extends BaseTest {

	@When("click on the expand button")
	public void click_on_the_expand_button() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.expandtoggle();
	}

	@Then("Click on US Icon on the top of the Right side")
	public void click_on_us_icon_on_the_top_of_the_right_side() {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assume.assumeTrue("US icon removed from the application", false);
	}

	@Then("verify cancel button functionality")
	public void verify_cancel_button_functionality() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("No Cancel module removed", false);
	}

	@Then("verify Alphanumeric with special characters in the Create Dashboard")
	public void verify_alphanumeric_with_special_characters_in_the_create_dashboard() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Functionality is not available", false);
	}

	@Then("verify save button functionality")
	public void verify_save_button_functionality() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Functionality is not available", false);
	}

	@Then("verify remove button functionality")
	public void verify_remove_button_functionality() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Functionality is not available", false);
	}

	@Then("verify inactive device functionality")
	public void verify_inactive_device_functionality() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Functionality is not available", false);
	}

	@Then("verify error message verbaige for reports")
	public void verify_error_message_verbaige_for_reports() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Functionality is not available", false);
	}
	@Then("verify delete icon button functionality")
	public void verify_delete_icon_button_functionality() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Functionality is not available", false);
	}


	@Then("verify success message verbaige in toaster")
	public void verify_success_message_verbaige_in_toaster() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Functionality is not available", false);
	}

	@Then("verify error message below text field")
	public void verify_error_message_below_text_field() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Functionality is not available", false);
	}

	@Then("verify error message verbaige in toaster")
	public void verify_error_message_verbaige_in_toaster() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Functionality is not available", false);
	}

	@Then("verify mandatory text field in the create dashboard screen")
	public void verify_mandatory_text_field_in_the_create_dashboard_screen() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Functionality is not available", false);
	}

	@Then("verify Edit button functionality")
	public void verify_edit_button_functionality() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("No Edit module removed", false);
	}

	@Then("verify add button functionality")
	public void verify_add_button_functionality() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("No Add module removed", false);
	}

	@Then("Click on Bell icon on the top of the Right side")
	public void click_on_bell_icon_on_the_top_of_the_right_side() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Alert module removed", false); //
	}

	@Then("verify error message verbaige for cards")
	public void verify_error_message_verbaige_for_cards() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("no error message for cards", false);

	}

	@Then("Click on Profile icon on the top of the Right side.& click on password from drop down")
	public void click_on_profile_icon_on_the_top_of_the_right_side_click_on_password_from_drop_down() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.profileIcon();
		dp.changePassword();
		dp.selectedOldPassword(alldata.get(vTCName).get("selectedOldPassword").toString());
		dp.selectedNewPassword(alldata.get(vTCName).get("selectedNewPassword").toString());

		dp.update();

	}

	@Then("After landing on Dashboard screen, Click on Refresh button \\(top right side)")
	public void after_landing_on_dashboard_screen_click_on_refresh_button_top_right_side() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Refresh button is not available", false);
	}

	@Then("Click on Human icon on the top of the Right side")
	public void click_on_human_icon_on_the_top_of_the_right_side() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		Thread.sleep(5000);
		dp.profileIcon();
		dp.updateProfile();
		dp.removalofEneredTextForFirstName();
		dp.updateselectedFirstName(alldata.get(vTCName).get("updateFirstName").toString());

		dp.removalofEneredTextForLastName();

		dp.updateselecteLastName(alldata.get(vTCName).get("updateLastName").toString());

		dp.removalofEneredTextForEmailField();
		dp.updateselectedEmailId(alldata.get(vTCName).get("selectedEmail").toString());

		dp.removalofEneredTextForPhoneNumber();
		dp.updatecontactfield(alldata.get(vTCName).get("selectcontact").toString());
		dp.update();

	}

	@Then("to check Verification of the accessible by using mobile network")
	public void to_check_verification_of_the_accessible_by_using_mobile_network() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Can not automate by using mobile network", false);

		// Can not automate by using mobile network
	}

	@Then("to check page is accessible by using wi-fi network")
	public void to_check_page_is_accessible_by_using_wi_fi_network() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Can not automate by using wi-fi network", false);

	}

	@Then("to check visualization of background picture")
	public void to_check_visualization_of_background_picture() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Can not automate by using background picture", false);
		//
	}

	@Then("verify login into browser copy & paste the url")
	public void verify_login_into_browser_copy_paste_the_url() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue(" functionality does not exist", false);
		// can not automate
	}

	@Then("Click on Profile icon on the top of the Right side.& click on Log out from drop down")
	public void click_on_profile_icon_on_the_top_of_the_right_side_click_on_log_out_from_drop_down() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.profileIcon();
		dp.logout();
	}

	@Then("Click on Zoom from browser")
	public void click_on_zoom_from_browser() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.zoomlevel();
	}

	@Then("Click oncard board boxes in dashboard")
	public void click_oncard_board_boxes_in_dashboard() {
		DashboardPage dp = new DashboardPage(driver, logger);

		dp.oncardboardboxes();

	}

	@Then("Click on Help icon on the top of the right side")
	public void click_on_help_icon_on_the_top_of_the_right_side() {
		DashboardPage dp = new DashboardPage(driver, logger);

	}

	@Then("to verify error message verbaige for reports")
	public void to_verify_error_message_verbaige_for_reports() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeFalse(" functionality does not exist", false);
	}

	@Then("to verify standarize text format for error message in toaster")
	public void to_verify_standarize_text_format_for_error_message_in_toaster() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeFalse(" functionality does not exist", false);

		//
	}

	@Then("to verify standarize text format for success message in toaster")
	public void to_verify_standarize_text_format_for_success_message_in_toaster() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("functionality does not exist no add update delete", false);

	}

	@Then("Click on Profile icon on the top of the Right side.& click on Update Password from drop down")
	public void click_on_profile_icon_on_the_top_of_the_right_side_click_on_update_password_from_drop_down() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.profileIcon();
		dp.changePassword();
		dp.selectedOldPassword(alldata.get(vTCName).get("selectedOldPassword").toString());
		dp.selectedNewPassword(alldata.get(vTCName).get("selectedNewPassword").toString());

		dp.update();

	}

	@Then("to check page is loading in slow network")
	public void to_check_page_is_loading_in_slow_network() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Can not automate by using mobile network", false);

	}

	@Then("to verify standarize text format for error message below text field")
	public void to_verify_standarize_text_format_for_error_message_below_text_field() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Can not automate standarize text format for error message below text field", false);
		//
	}

	@Then("to verify switching between inputs fields using TAB")
	public void to_verify_switching_between_inputs_fields_using_tab() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Can not automate", false);
	}

	@Then("to verify visibilty duration to load the application")
	public void to_verify_visibilty_duration_to_load_the_application() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("Can not automate", false);
		// Can not automate
	}

	@Then("to verify visibilty the input field format")
	public void to_verify_visibilty_the_input_field_format() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("functionality does not exist no add update delete", false);
		//

	}

	@Then("to check alignment show icon into the text field")
	public void to_check_alignment_show_icon_into_the_text_field() {
		DashboardPage dp = new DashboardPage(driver, logger);
		Assume.assumeTrue("no show icon", false); // no show icon
	}

}
