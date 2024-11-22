package com.cdm.Stepdefinations;

import org.junit.Assume;

import com.cdm.pages.GeneralPage;

import io.cucumber.java.en.Then;

public class GeneralSteps extends BaseTest {

	@Then("Click on General tab from right panel of the screen")
	public void click_on_General_tab_from_right_panel_of_the_screen() {
		GeneralPage general = new GeneralPage(driver, logger);
		general.generalTab();
	}

	@Then("verify visiblity Default Dashboard in User settings by Super admin")
	public void verify_visiblity_default_dashboard_in_user_settings_by_super_admin() throws InterruptedException {
		GeneralPage general = new GeneralPage(driver, logger);
		// general.dashboardDefault(alldata.get(vTCName).get("dashboardselect").toString());
	}

	@Then("verify select Custom Dashboard in User settings drop down by Super admin")
	public void verify_select_custom_dashboard_in_user_settings_drop_down_by_super_admin() throws InterruptedException {
		GeneralPage general = new GeneralPage(driver, logger);
//		general.customDefault(alldata.get(vTCName).get("customselect").toString());

	}

	@Then("to check switching between inputs fields using TAB")
	public void to_check_switching_between_inputs_fields_using_tab() {
		GeneralPage general = new GeneralPage(driver, logger);

	}

	@Then("to check page without login into browser, copy & paste the url")
	public void to_check_page_without_login_into_browser_copy_paste_the_url() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assume.assumeTrue("In selenium we can not automate copy and paste url , manually this is possible", false);
	}

	@Then("to check visibilty duration to load the page")
	public void to_check_visibilty_duration_to_load_the_page() {
		GeneralPage general = new GeneralPage(driver, logger);

	}

	@Then("to check visibilty the input field format")
	public void to_check_visibilty_the_input_field_format() {
		GeneralPage general = new GeneralPage(driver, logger);

	}

	@Then("to check accessible the screen by using wi-fi network")
	public void to_check_accessible_the_screen_by_using_wi_fi_network() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assume.assumeTrue("To check accessible page by using wifi network depends on various factor", false);
	}

	@Then("to check accessible the page by using mobile network")
	public void to_check_accessible_the_page_by_using_mobile_network() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assume.assumeTrue("To check accessible page by using mobile network depends on various factor", false);
	}

	@Then("to check page is loading properly in slow network")
	public void to_check_page_is_loading_properly_in_slow_network() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assume.assumeTrue("To check accessible page by using mobile network depends on various factor like 3G or 4G",
//				false);
	}

	@Then("verify Tool tip functionality for user textfield in the SMTP Section General screen by Super admin")
	public void verify_tool_tip_functionality_for_user_textfield_in_the_smtp_section_general_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assert.assertEquals("Tooltip for password section in the SMTP screen", "Valid Email ID for the repository",
//				general.get_Text_ToolTipSMTPUserTextField());
	}

	@Then("After landing Switch to General tab, Click on Environment Dropdown & Select Non-Constraint Mode")
	public void after_landing_switch_to_general_tab_click_on_environment_dropdown_select_non_constraint_mode()
			throws InterruptedException {
		GeneralPage general = new GeneralPage(driver, logger);
//		general.nonConstraint(alldata.get(vTCName).get("constraintSelect").toString());
	}

	@Then("check refresh button functionality")
	public void check_refresh_button_functionality() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assume.assumeTrue("Refresh button is not available",false);
	}

	@Then("verify host textfield tool tip functionality")
	public void verify_host_textfield_tool_tip_functionality() {

		GeneralPage general = new GeneralPage(driver, logger);
//		Assert.assertEquals("Tooltip for host section in the SMTP screen", "Host of SMTP Mail Server",
//				general.get_Text_ToolTiphost());
	}

	@Then("verify error message verbaige for without entering details in Screen by Super Admin")
	public void verify_error_message_verbaige_for_without_entering_details_in_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
//		general.savebutton();
	}

	@Then("verify text varbaige for all the input labels text field")
	public void verify_text_varbaige_for_all_the_input_labels_text_field() {
		GeneralPage general = new GeneralPage(driver, logger);
//		general.savebutton();
	}

	@Then("to check visibility the ambre color when license is about to expire")
	public void to_check_visibility_the_ambre_color_when_license_is_about_to_expire() {
		GeneralPage general = new GeneralPage(driver, logger);
		Assume.assumeTrue(
				" If the license expiry information comes from a backend service or API, wecan use mock data to simulate the license expiry state. This can be done using tools like MockServer, WireMock, or through stubs in your application for testing.  not possible with selenium BDD",
				false);
	}

	@Then("to check Availablity Active icon of CDM License in general Screen")
	public void to_check_availablity_active_icon_of_cdm_license_in_general_screen() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue("Button freeze", false);
	}

	@Then("to check visibility the red color when license get expired")
	public void to_check_visibility_the_red_color_when_license_get_expired() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue(" If the license expiry information comes from a backend
		// service or API, wecan use mock data to simulate the license expiry state.
		// This can be done using tools like MockServer, WireMock, or through stubs in
		// your application for testing. not possible with selenium BDD",false);
	}

	@Then("to Select the Check box for update the version as per required Auth app in CDM Version Update Screen by Super admin")
	public void to_select_the_check_box_for_update_the_version_as_per_required_auth_app_in_cdm_version_update_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue("Functionality does not exist", false);
	}

	@Then("to Select the Check box for update the version as per required CDM_Main app in CDM Version Update Screen by Super admin")
	public void to_select_the_check_box_for_update_the_version_as_per_required_cdm_main_app_in_cdm_version_update_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue("Functionality does not exist", false);
	}

	@Then("to Select the Check box for update the version as per required edge_Cygnet _Gateway app in CDM Version Update Screen by Super admin")
	public void to_select_the_check_box_for_update_the_version_as_per_required_edge_cygnet__gateway_app_in_cdm_version_update_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue("Functionality does not exist", false);
	}

	@Then("to Select the Check box for update the version as per required edge_Mosquito app in CDM Version Update Screen by Super admin")
	public void to_select_the_check_box_for_update_the_version_as_per_required_edge_mosquito_app_in_cdm_version_update_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue("Functionality does not exist", false);
	}

	@Then("to Select the Check box for update the version as per required edge_ Logsync app in CDM Version Update Screen by Super admin")
	public void to_select_the_check_box_for_update_the_version_as_per_required_edge_logsync_app_in_cdm_version_update_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue("Functionality does not exist", false);
	}

	@Then("verify Tool tip functionality in the SMTP Section General screen by Super admin")
	public void verify_tool_tip_functionality_in_the_smtp_section_general_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assert.assertEquals("Tooltip for SMTP section general screen", "Host of SMTP Mail Server",
//				general.get_Text_ToolTipSMTP());
	}

	@Then("verify Password Validity \\(Days)Textfield functionality in the Password Refresh Policy Section by Super admin")
	public void verify_password_validity_days_textfield_functionality_in_the_password_refresh_policy_section_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assert.assertEquals("Tooltip for SMTP section general screen", "",
//				general.get_Text_ToolTipValidityRefreshPolicy());
	}

	@Then("verify URL Textfield Tool tip functionality in the CDM Update Section General screen by Super admin")
	public void verify_url_textfield_tool_tip_functionality_in_the_cdm_update_section_general_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assume.assumeTrue("Tooltip not available for validity", false);
	}

	@Then("verify Password Textfield Tool tip functionality in the SMTP Section General screen by Super admin")
	public void verify_password_textfield_tool_tip_functionality_in_the_smtp_section_general_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assert.assertEquals("Tooltip for password section in the SMTP screen", "Valid Password for access",
//				general.get_Text_ToolTipSMTPassword());
	}

	@Then("verify Password Validity Textfield functionality in the Password Refresh Policy Section by Super admin")
	public void verify_password_validity_textfield_functionality_in_the_password_refresh_policy_section_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assume.assumeTrue("No tooltip available for validity", false);
	}

	@Then("verify Tool tip functionality for port in the SMTP Section General screen by Super admin")
	public void verify_tool_tip_functionality_for_port_in_the_smtp_section_general_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assert.assertEquals("Tooltip for port section in the SMTP screen", "Port Used",
//				general.get_Text_ToolTipSMTPPort());
	}

	@Then("verify Repository Textfield Tool tip functionality in the CDM Update Section General screen by Super admin")
	public void verify_repository_textfield_tool_tip_functionality_in_the_cdm_update_section_general_screen_by_super_admin() {

		GeneralPage general = new GeneralPage(driver, logger);
//		Assert.assertEquals("Tooltip for password section in the SMTP screen",
//				"Repository in which the CDM Update is available", general.get_Text_ToolTipSMTPRepository());
	}

	@Then("verify  User Textfield Tool tip functionality in the CDM Update Section General screen by Super admin")
	public void verify_user_textfield_tool_tip_functionality_in_the_cdm_update_section_general_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assert.assertEquals("Tooltip for password section in the SMTP screen", "Valid Email ID for the repository",
//				general.get_Text_ToolTipSMTUser());
	}

	@Then("verify of Next button in CDM Version Update Screen by Super admin")
	public void verify_of_next_button_in_cdm_version_update_screen_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue("Functionality does not exist", false);
	}

	@Then("to Click the Check for Updates button in CDM Update Section by Super admin")
	public void to_click_the_check_for_updates_button_in_cdm_update_section_by_super_admin() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue("Functionality does not exist", false);
	}

	@Then("to check Visiblity of Upload button CDM License")
	public void to_check_visiblity_of_upload_button_cdm_license() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue("Upload Button freeze", false);
	}

	@Then("to check visibility to activate of the Upload button")
	public void to_check_visibility_to_activate_of_the_upload_button() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue("Upload Button freeze", false);
	}

	@Then("to check visibility the no color when license is active")
	public void to_check_visibility_the_no_color_when_license_is_active() {
		GeneralPage general = new GeneralPage(driver, logger);
//		Assume.assumeTrue(
//				" If the license expiry information comes from a backend service or API, wecan use mock data to simulate the license expiry state. This can be done using tools like MockServer, WireMock, or through stubs in your application for testing.  not possible with selenium BDD",
//				false);
	}

	@Then("After landing Switch to General tab, Click on Four lines on the top of Left side")
	public void after_landing_switch_to_general_tab_click_on_four_lines_on_the_top_of_left_side() {
		GeneralPage general = new GeneralPage(driver, logger);
		general.expandtoggle();
	}

	@Then("to check SMTP after providing wrong data inputs\\(Host,user,From,password &port)")
	public void to_check_smtp_after_providing_wrong_data_inputs_host_user_from_password_port() {
		GeneralPage general = new GeneralPage(driver, logger);
		// Assume.assumeTrue("Email notification can not automate", false);
	}

}
