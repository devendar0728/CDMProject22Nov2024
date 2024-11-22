package com.cdm.Stepdefinations;

import org.junit.Assert;
import org.junit.Assume;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.ConfigurationsPage;

import io.cucumber.java.en.Then;

public class ConfigurationSteps extends BaseTest {

	@Then("Click on Configurations module from side menu bar")
	public void click_on_deployments_module_from_side_menu_bar() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configTabmain();


	}

	@Then("Click on refresh button for configuration")
	public void click_on_refresh_button_for_configuration() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);

		cp.refreshbutton();
	}

	@Then("to check ascending order sorting functionality for the table list")
	public void to_check_ascending_order_sorting_functionality_for_the_table_list() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.edgeIDSortDecending();
	}

	@Then("to check descending order sorting functionality for the table list")
	public void to_check_descending_order_sorting_functionality_for_the_table_list() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.edgeIDSortDecending();
	}

	@Then("verify visibility duration to load page for configuration")
	public void verify_visibility_duration_to_load_page_for_configuration() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
	}

	@Then("verify tooltip for Response Status")
	public void verify_tooltip_for_response_status() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip for Response Status", "The status of the response (HTTP Response Code)",
				cp.get_Text_TooltipResponseStatus());
	}

	@Then("verify tooltip for Time Stamp")
	public void verify_tooltip_for_time_stamp() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip for timeStamp",
				"The date (MM-DD-YYYY) and time (HH:MM) (+/-HH:MM) the configuration was created",
				cp.get_Text_TooltipTimeStamp());
	}

	@Then("to check the text varbaige for all the tool tips")
	public void to_check_the_text_varbaige_for_all_the_tool_tips() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip for Response Status", "The status of the response (HTTP Response Code)",
				cp.get_Text_TooltipResponseStatus());
	}

	@Then("verify tooltip for download button")
	public void verify_tooltip_for_download_button() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip for download button", "Download (in .txt format)",
				cp.get_Text_TooltipDownloadButton());
	}

	@Then("click on view response body icon from actions column")
	public void click_on_view_response_body_icon_from_actions_column() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.viewResponseBodyIcon();
	}

	@Then("verify tooltip for close button")
	public void verify_tooltip_for_close_button() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip for Close button", "Close", cp.get_Text_TooltipCloseButton());
	}

	@Then("verify tooltip for Actions")
	public void verify_tooltip_for_actions() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip for Actions column", "The response sent by the EDGE Device",
				cp.get_Text_TooltipActions());
	}

	@Then("verify tooltip for send configuration button")
	public void verify_tooltip_for_send_configuration_button() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assume.assumeTrue("No send configuration buttn found", false);
	}

	@Then("verify page loading properly in slow network")
	public void verify_page_loading_properly_in_slow_network() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assume.assumeTrue(
				"can not automate this test case  becuase slow network depends on various factor like  bandwidth, speed",
				false);
	}

	@Then("verify page accessible by using mobile network")
	public void verify_page_accessible_by_using_mobile_network() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assume.assumeTrue("can not automate becuase mobile network dependency on bandwidth", false);
	}

	@Then("Scroll horizontal")
	public void scroll_horizontal() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.scrollingElementRightBar("div.example-container", "900");
	}

	@Then("verify tooltip for the Edge ID")
	public void verify_tooltip_for_the_edge_id() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip of edge id", "Name assigned for the EDGE Device", cp.get_Text_ToolTipEdgeID());
	}

	@Then("verify without login into browser, copy & paste the url")
	public void verify_without_login_into_browser_copy_paste_the_url() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
	}

	@Then("verify column width and size resolution")
	public void verify_column_width_and_size_resolution() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
	}

	@Then("maximise and minimize screen")
	public void maximise_and_minimize_screen() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.minimizewindow();
		cp.maximizewindow();
	}

	@Then("verify to check the alignment of Refresh & History View buttons on the top right side")
	public void verify_to_check_the_alignment_of_refresh_history_view_buttons_on_the_top_right_side() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
	}

	@Then("verify tooltip for the View Response body button")
	public void verify_tooltip_for_the_view_response_body_button() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip of response Body button", "View Response Body",
				cp.get_Text_ToolTipViewResponseBody());
	}

	@Then("Click on current view button for configuration")
	public void click_on_current_view_button_for_configuration() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.currentviewbuttonclick();
	}

	@Then("Click on Config Name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_config_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configNameThreeDot();
		cp.sendValueSearchinputBoxForConfigName(alldata.get(vTCName).get("ConfigNameSearch").toString());
	}

	@Then("Click on TimeStampThreeDotSearch icon and enter the value in datepickercolumn and clear the field")
	public void click_on_time_stamp_three_dot_search_icon_and_enter_the_value_in_datepickercolumn_and_clear_the_field()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.timeStampThreeDot();

		CalenderPage cal = new CalenderPage(driver, logger);
		cp.calenderIcon();
		String year = alldata.get(vTCName).get("ChooseYear").toString();
		String month = alldata.get(vTCName).get("ChooseMonth").toString();
		String day = alldata.get(vTCName).get("ChooseStartDate").toString();
		String day2 = alldata.get(vTCName).get("ChooseEndDate").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);


		cp.applybuttoncalender();

	}

	@Then("Click on LastUpdatedThreeDotSearch icon and enter the value in datepickercolumn")
	public void click_on_last_updated_three_dot_search_icon_and_enter_the_value_in_datepickercolumn() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.lastUpdatedThreeDot();

		CalenderPage cal = new CalenderPage(driver, logger);
		cp.calenderIcon();
		String year = alldata.get(vTCName).get("ChooseYear").toString();
		String month = alldata.get(vTCName).get("ChooseMonth").toString();
		String day = alldata.get(vTCName).get("ChooseStartDate").toString();
		String day2 = alldata.get(vTCName).get("ChooseEndDate").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		cp.applybuttoncalender();

	}

	@Then("Click on history view button for configuration")
	public void click_on_history_view_button_for_configuration() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		try {
			cp.historyviewbuttonclick();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("verify tooltip for the refresh button")
	public void verify_tooltip_for_the_refresh_button() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip of refresh button", "Refresh", cp.get_Text_ToolTipRefreshConfig());
	}

	@Then("search for Edge ID column with valid data")
	public void search_for_edge_id_column_with_valid_data() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.edgeIDThreeDotConfig();

		cp.sendValueSearchinputBoxForEdgeID(alldata.get(vTCName).get("EdgeIDSearch").toString());
	}

	@Then("search for Edge ID column with invalid data")
	public void search_for_edge_id_column_with_invalid_data() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.edgeIDThreeDotConfig();

		cp.sendValueSearchinputBoxForEdgeID(alldata.get(vTCName).get("EdgeIDSearch").toString());
	}

	@Then("Click on App Name search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_app_name_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.appNameConfigThreeDot();

		cp.sendValueSearchinputBoxForAppName(alldata.get(vTCName).get("AppNameSearch").toString());
	}

	@Then("Click on Config Name invalid search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_config_name_invalid_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configNameThreeDot();

		cp.sendValueSearchinputBoxForConfigName(alldata.get(vTCName).get("ConfigNameSearch").toString());
	}

	@Then("verify tooltip for the App Name")
	public void verify_tooltip_for_the_app_name() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip of App Name", "Unique Name assigned for the Application",
				cp.get_Text_ToolTipAppName());
	}

	@Then("verify tooltip for view response body")
	public void verify_tooltip_for_view_response_body() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip of response body ", "View Response Body", cp.get_Text_ToolTipViewResponseBody());
	}

	@Then("Click on Response Name valid search icon i.e. three dots & enter Valid inputs into search text field")
	public void click_on_response_name_invalid_search_icon_i_e_three_dots_enter_valid_inputs_into_search_text_field()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configNameThreeDot();

		cp.sendValueSearchinputBoxForConfigName(alldata.get(vTCName).get("ConfigNameSearch").toString());
	}

	@Then("verify tooltip for the Config Name")
	public void verify_tooltip_for_the_config_name() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		Assert.assertEquals("Tooltip for Config ", "The Name of the configuration", cp.get_Text_ToolTipConfig());
	}

	@Then("Enter valid inputs into search text field and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.edgeIDThreeDotConfig();

		cp.sendValueSearchinputBoxForEdgeID(alldata.get(vTCName).get("EdgeIDSearch").toString());
		cp.removalofEnteredTextForEdgeID();
	}

	@Then("Enter valid inputs into search text field of app name and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_app_name_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.appNameConfigThreeDot();

		cp.sendValueSearchinputBoxForAppName(alldata.get(vTCName).get("AppNameSearch").toString());
		cp.removalofEnteredTextForAppName();
	}

	@Then("Enter valid inputs into search text field of config name and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_config_name_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.configNameThreeDot();

		cp.sendValueSearchinputBoxForConfigName(alldata.get(vTCName).get("ConfigNameSearch").toString());
		cp.removalofEnteredTextForConfigName();
	}

	@Then("Click on History View Button")
	public void click_on_history_view_button() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.historyviewbuttonclick();

	}

	@Then("Click on view response body icon from Action Column")
	public void click_on_view_response_body_icon_from_action_column() {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.scrollingElementRightBar("div.example-container", "900");
		cp.viewResponseBodyIcon();
	}

	@Then("Scroll horizontal and Click on download button from Action column")
	public void click_on_download_button_from_action_column() throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.scrollingElementRightBar("div.example-container", "900");
		cp.downloadAction();
	}

	@Then("Enter valid inputs into search text field of response status name and enter backspace & click on enter")
	public void enter_valid_inputs_into_search_text_field_of_response_status_name_and_enter_backspace_click_on_enter()
			throws InterruptedException {
		ConfigurationsPage cp = new ConfigurationsPage(driver, logger);
		cp.responseStatusThreeDot();

	}

}
