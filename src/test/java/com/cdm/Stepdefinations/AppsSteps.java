package com.cdm.Stepdefinations;

import org.junit.Assert;
import org.junit.Assume;

import com.cdm.pages.AppsEditPage;
import com.cdm.pages.AppsPage;

import io.cucumber.java.en.Then;

public class AppsSteps extends BaseTest {

	@Then("Click on Apps tab from right panel of the screen")
	public void click_on_apps_tab_from_right_panel_of_the_screen() throws InterruptedException {
		AppsPage ap = new AppsPage(driver, logger);
		ap.Apps_tab();
	}

	@Then("verify page with resize option for App page")
	public void verify_page_with_resize_option_for_app_page() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.setZoomLevel(800, 600);
	}

	@Then("verify tooltip for License Type from update Screen")
	public void verify_tooltip_for_license_type_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of License Type", "Type of License supported by Application",
				aep.get_Text_ToolTiplicenseTypeToolTip());
	}

	@Then("check visibility duration to load the page")
	public void check_visibility_duration_to_load_the_page() {
		AppsPage app = new AppsPage(driver, logger);
		Assume.assumeTrue("page should be load in slow network", false);

	}

	@Then("verify accessibility the page by using mobile network")
	public void verify_accessibility_the_page_by_using_mobile_network() {
		AppsPage app = new AppsPage(driver, logger);
		Assume.assumeTrue("We can not automate mobile network because it is depends on various factor", false);

	}

	@Then("check verification of loading properly in slow network")
	public void check_verification_of_loading_properly_in_slow_network() {
		AppsPage app = new AppsPage(driver, logger);

		Assume.assumeTrue("page should be load in slow network", false);
	}

	@Then("check visualization of icons in action column")
	public void check_visualization_of_icons_in_action_column() {
		AppsPage app = new AppsPage(driver, logger);
	}

	@Then("serach for application name , architecture, Version")
	public void serach_for_application_name_architecture_version() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.applicationthreedot();
		ap.applicationName(alldata.get(vTCName).get("ApplicationSearch").toString());
		// ap.backDropShowing_Div_Click();
		ap.outerlayerclick();
		ap.architecturethreedot();
		ap.architecture(alldata.get(vTCName).get("ArchitectureSearch").toString());
		// ap.backDropShowing_Div_Click();
		ap.outerlayerclick();
		ap.versionThreeDot();
		ap.versionTag(alldata.get(vTCName).get("VersionSearch").toString());
		// ap.backDropShowing_Div_Click();
		ap.outerlayerclick();
	}

	@Then("click on View VolumeDetails icon from actions column")
	public void click_on_view_volume_details_icon_from_actions_column() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.viewVolumeDetails();
	}

	@Then("click on refresh button for apps")
	public void click_on_refresh_button_for_apps() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.refreshlist();
	}

	@Then("verify tooltip for Status")
	public void verify_tooltip_for_status() {
		AppsPage ap = new AppsPage(driver, logger);
		Assert.assertEquals("Tooltip of Status", "Search", ap.get_Text_ToolTipStatus());
	}

	@Then("cilck on Pencil icon i.e. EDIT button")
	public void click_on_edit_button() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.editButtonConfig();
	}

	@Then("verify tooltip for App Name from update Screen")
	public void verify_tooltip_for_app_name_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of AppName", "Unique Name assigned for the app", aep.get_Text_ToolTipAppName());
	}

	@Then("verify tooltip for App Display Name from update Screen")
	public void verify_tooltip_for_app_display_name_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of AppName", "Unique Name assigned for the app", aep.get_Text_ToolTipAppName());
	}

	@Then("verify tooltip for Repository Link from update Screen")
	public void verify_tooltip_for_repository_link_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of App Display Name", "Path of Repository: URL, IP Address",
				aep.get_Text_ToolTipRepositoryLink());
	}

	@Then("verify tooltip for root volume from update Screen")
	public void verify_tooltip_for_root_volume_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of root volume", "Name assigned for core Application Volume",
				aep.get_Text_ToolTipRootVolume());
	}

	@Then("verify tooltip for Architecture from update Screen")
	public void verify_tooltip_for_architecture_from_update_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of architecture", "Type of Architecture of the Application",
				aep.get_Text_ToolTiparchitecture());
	}

	@Then("verify tooltip for version from update Screen")
	public void verify_tooltip_for_version_from_update_screen() throws InterruptedException {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of version", "Version number of the Application", aep.get_Text_ToolTiptag());

	}

	@Then("verify tooltip for Config Master from update Screen")
	public void verify_tooltip_for_config_master_from_update_screen() throws InterruptedException {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of App config master",
				"List of configurations allowed by application for CDM EDGE configuration module (JSON format)",
				aep.get_Text_ToolTipconfigMaster());
	}

	@Then("click on three dots on application list and enter the value for search and click on Edit button")
	public void click_on_three_dots_on_application_list_and_enter_the_value_for_search_and_click_on_edit_button()
			throws InterruptedException {
		AppsPage ap = new AppsPage(driver, logger);
		ap.applicationthreedot();
		ap.applicationName(alldata.get(vTCName).get("ApplicationSearch").toString());
		Thread.sleep(3000);
		//ap.backDropShowing_Div_Click();
		ap.outerlayerClick();

		ap.editButtonConfig();

	}

	@Then("edit all the field listed on the update page")
	public void edit_all_the_field_listed_on_the_update_page() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		aep.removalofEnteredTextForappName();
		aep.applicationName(alldata.get(vTCName).get("AppNameEdit"));

		aep.removalofEnteredTextForappDisplayName();
		aep.applicationDisplayName(alldata.get(vTCName).get("AppDisplayNameEdit"));

		aep.removalofEnteredTextForrepositoryLink();
		aep.repositoryLink(alldata.get(vTCName).get("RepositoryLinkEdit"));

		aep.removalofEnteredTextForlicenseType();
		aep.licenseType(alldata.get(vTCName).get("LicenseTypeEdit"));

		aep.removalofEnteredTextForconfigmaster();
		aep.configMaster(alldata.get(vTCName).get("ConfigMasterEdit"));

		aep.removalofEnteredTextForversionTag();
		aep.version(alldata.get(vTCName).get("VersionEdit"));

		aep.removalofEnteredTextForarchitecture();
		aep.architecture(alldata.get(vTCName).get("ArchitectureEdit"));

		aep.removalofEnteredTextForRootVolume();
		aep.rootVolume(alldata.get(vTCName).get("RootVolumeEdit"));
	}
	@Then("verify to check look of the input text field format")
	public void verify_to_check_look_of_the_input_text_field_format() {
	   Assume.assumeTrue("Can not automate input text field format",false);
	}
	@Then("verify to check the alignment for all the input text fields in edit Screen")
	public void verify_to_check_the_alignment_for_all_the_input_text_fields_in_edit_screen() {
		Assume.assumeTrue("Can not automate input text field format",false);
	}


	@Then("verify alignment for all table list in Volume details Screen")
	public void verify_alignment_for_all_table_list_in_volume_details_screen() {
	    Assume.assumeTrue("Alignment not possible to automate", false);
	}
	@Then("click on save button to save app")
	public void click_on_save_button_to_save_app() throws InterruptedException {
		AppsEditPage aep = new AppsEditPage(driver, logger);

		aep.saveapp();
	}

	@Then("click on cancel button to Cancel updation")
	public void click_on_cancel_button_to_cancel_updation() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		aep.cancelapp();
	}

	@Then("click on ascending order sorting functionality for the table list")
	public void click_on_ascending_order_sorting_functionality_for_the_table_list() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.applicationNameFilter();

	}

	@Then("check the tool tip text visibilty for Repository Link  Input text field in Edit Screen")
	public void check_the_tool_tip_text_visibilty_for_repository_link_input_text_field_in_edit_screen() {
		AppsPage ap = new AppsPage(driver, logger);
		try {
			Assert.assertEquals("Tooltip for repository link", "Path of Repository: URL, IP Address",
					ap.get_Text_ToolTipRepositoryLink());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("check the tool tip text visibilty for License type Input text field in edit Screen")
	public void check_the_tool_tip_text_visibilty_for_license_type_input_text_field_in_edit_screen() {
		try {
			AppsPage ap = new AppsPage(driver, logger);
			Assume.assumeTrue("No dropdown associated with type", false);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("check the tool tip text visibilty for Type from drop down Input text field in edit Screen")
	public void check_the_tool_tip_text_visibilty_for_type_from_drop_down_input_text_field_in_edit_screen() {
		AppsPage ap = new AppsPage(driver, logger);
		Assume.assumeTrue("No dropdown associated for type", false);
	}

	@Then("check the tool tip text visibilty for Root Volume Input text field in Edit Screen")
	public void check_the_tool_tip_text_visibilty_for_root_volume_input_text_field_in_edit_screen() {
		AppsPage ap = new AppsPage(driver, logger);
		Assume.assumeTrue("No valid test case", false);
	}

	@Then("check the tool tip text visibilty for Architecture Input text field in Edit Screen")
	public void check_the_tool_tip_text_visibilty_for_architecture_input_text_field_in_edit_screen() {
		AppsPage ap = new AppsPage(driver, logger);
		Assert.assertEquals("Tooltip for architecture", "Type of Architecture of the Application",
				ap.get_Text_ToolTipArchitecture());
	}

	@Then("check the tool tip text visibilty for Config Master Input text field in Edit Screen")
	public void check_the_tool_tip_text_visibilty_for_config_master_input_text_field_in_edit_screen() {
		AppsPage ap = new AppsPage(driver, logger);
		Assert.assertEquals("Tooltip for config master",
				"List of configurations allowed by application for CDM EDGE configuration module (JSON format)",
				ap.get_Text_ToolTipConfigMaster());
	}

	@Then("check the tool tip text visibilty for Config Name in Enviroment Varioables tab")
	public void check_the_tool_tip_text_visibilty_for_config_name_in_enviroment_varioables_tab() {
		try {
			AppsPage ap = new AppsPage(driver, logger);
			Assert.assertEquals("Tooltip for config name", "The name of the configuration. No character limitations.",
					ap.get_Text_ToolTipConfigName());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("verify  of alignment Add New,Bulk Upload & Bulk Download buttons on the top right side")
	public void verify_of_alignment_add_new_bulk_upload_bulk_download_buttons_on_the_top_right_side() {
		AppsPage ap = new AppsPage(driver, logger);
		Assume.assumeTrue("Alignment we can not automate using selenium", false);
	}

	@Then("verify accessibility the filter icon for architecture")
	public void verify_accessibility_the_filter_icon_for_architecture() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.architecturethreedot();
	}

	@Then("verify alignment for maximise and minimise the screen")
	public void verify_alignment_for_maximise_and_minimise_the_screen() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.minimiseWindow();
		ap.maximiseWindow();
	}

	@Then("verify accessibility of filter icon for volume name")
	public void verify_accessibility_of_filter_icon_for_volume_name() {
		AppsEditPage aep = new AppsEditPage(driver, logger);

	}

	@Then("verify check filter icon visibility for Status")
	public void verify_check_filter_icon_visibility_for_status() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.statusThreeDot();
	}

	@Then("check visibilty the input field format of App")
	public void check_visibilty_the_input_field_format_of_app() {
		AppsPage ap = new AppsPage(driver, logger);
	}

	@Then("verify check filter icon visibility for Architecture")
	public void verify_check_filter_icon_visibility_for_architecture() {
try {
	AppsEditPage aep = new AppsEditPage(driver, logger);
	Assert.assertEquals("Tooltip of architecture", "Type of Architecture of the Application",
			aep.get_Text_ToolTiparchitecture());
} catch (Exception e) {
	// TODO: handle exception
}

	}

	@Then("verify tool tip text visibilty for status")
	public void verify_tool_tip_text_visibilty_for_status() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.statusThreeDot();
	}

	@Then("verify tool tip text visibilty for Inactive functionality button in Actions")
	public void verify_tool_tip_text_visibilty_for_inactive_functionality_button_in_actions() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.statusThreeDot();
	}

	@Then("verify check filter icon visibility for Version\\/Tag")
	public void verify_check_filter_icon_visibility_for_version_tag() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.versionThreeDot();
	}

	@Then("verify tool tip text visibilty for view volume details functionality button in Actions column")
	public void verify_tool_tip_text_visibilty_for_view_volume_details_functionality_button_in_actions_column() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		try {
			Assert.assertEquals("Tooltip for volume details", "View Volume Details",
					aep.get_Text_ToolTipviewVolumeDetails());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("verify tooltip text visibilty for Application Name")
	public void verify_tooltip_text_visibilty_for_application_name() {

	}

	@Then("verify tooltip text visibilty for Architecture")
	public void verify_tooltip_text_visibilty_for_architecture() {

	}

	@Then("verify accessibility the filter icon for Version\\/tag")
	public void verify_accessibility_the_filter_icon_for_version_tag() {

		AppsPage ap = new AppsPage(driver, logger);
		try {
			Assert.assertEquals("Tooltip for version", "Version number of the Application",
					ap.get_Text_ToolTipVersionApp());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("verify accessibility accessbility the filter icon for Status")
	public void verify_accessibility_accessbility_the_filter_icon_for_status() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.statusThreeDot();
	}

	@Then("verify check filter icon visibility for Application Name")
	public void verify_check_filter_icon_visibility_for_application_name() {
		AppsPage ap = new AppsPage(driver, logger);
	}

	@Then("check alignment of Refresh buttons on the top right side")
	public void check_alignment_of_refresh_buttons_on_the_top_right_side() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.refreshlist();
	}

	@Then("verify tool tip text visibilty for Version\\/Tag")
	public void verify_tool_tip_text_visibilty_for_version_tag() {
		AppsPage ap = new AppsPage(driver, logger);
	}

	@Then("verify visibility of input fields")
	public void verify_visibility_of_input_fields() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.minimiseWindow();
		ap.maximiseWindow();
	}

	@Then("verify tool tip text visibilty for Active functionality button in Actions column")
	public void verify_tool_tip_text_visibilty_for_active_functionality_button_in_actions_column() {
		AppsPage ap = new AppsPage(driver, logger);
	}

	@Then("verify visibilty for Edit functionality button in Actions column")
	public void verify_visibilty_for_edit_functionality_button_in_actions_column() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		aep.removalofEnteredTextForappName();
		aep.applicationName(alldata.get(vTCName).get("AppNameEdit"));

		aep.removalofEnteredTextForappDisplayName();
		aep.applicationDisplayName(alldata.get(vTCName).get("AppDisplayNameEdit"));

		aep.removalofEnteredTextForrepositoryLink();
		aep.repositoryLink(alldata.get(vTCName).get("RepositoryLinkEdit"));

		aep.removalofEnteredTextForlicenseType();
		aep.licenseType(alldata.get(vTCName).get("LicenseTypeEdit"));

		aep.removalofEnteredTextForconfigmaster();
		aep.configMaster(alldata.get(vTCName).get("ConfigMasterEdit"));

		aep.removalofEnteredTextForversionTag();
		aep.version(alldata.get(vTCName).get("VersionEdit"));

		aep.removalofEnteredTextForarchitecture();
		aep.architecture(alldata.get(vTCName).get("ArchitectureEdit"));

		aep.removalofEnteredTextForRootVolume();
		aep.rootVolume(alldata.get(vTCName).get("RootVolumeEdit"));
	}

	@Then("check the tool tip text visibilty for status in Enviroment Varioables tab")
	public void check_the_tool_tip_text_visibilty_for_status_sin_enviroment_varioables_tab() {
		AppsPage ap = new AppsPage(driver, logger);
		Assert.assertEquals("Tooltip for Status", "Search", ap.get_Text_ToolTipStatus());
	}

	@Then("check the tool tip text visibilty for Version\\/Tag Input text field Edit Screen")
	public void check_the_tool_tip_text_visibilty_for_version_tag_input_text_field_edit_screen() {
		AppsPage ap = new AppsPage(driver, logger);
		try {
			Assert.assertEquals("Tooltip for version", "Version number of the Application",
					ap.get_Text_ToolTipVersionApp());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("check the tool tip text visibilty for Repository Name from drop down Input text field in Edit Screen")
	public void check_the_tool_tip_text_visibilty_for_repository_name_from_drop_down_input_text_field_in_edit_screen() {
		AppsPage ap = new AppsPage(driver, logger);
	}

	@Then("check the tool tip text visibilty for Volume Name Input text field in ADD Screen")
	public void check_the_tool_tip_text_visibilty_for_volume_name_input_text_field_in_add_screen() {
		AppsPage ap = new AppsPage(driver, logger);
	}

	@Then("click on descending order sorting functionality for the table list")
	public void click_on_descending_order_sorting_functionality_for_the_table_list() {
		AppsPage ap = new AppsPage(driver, logger);
		ap.applicationNameFilter();
	}

	@Then("click on inactive button to deactivate application")
	public void click_on_inactive_button_to_deactivate_application() throws InterruptedException {
		AppsPage ap = new AppsPage(driver, logger);
		ap.inactivecrossbar();
		ap.confirmationYesButton();
	}

	@Then("verify tool tip text visibilty for Application Name Input text fields in Edit Screen")
	public void verify_tool_tip_text_visibilty_for_application_name_input_text_fields_in_edit_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of AppName", "Unique Name assigned for the app", aep.get_Text_ToolTipAppName());
	}

	@Then("verify tool tip text visibilty for Application Display Name Input text fields in Edit Screen")
	public void verify_tool_tip_text_visibilty_for_application_display_name_input_text_fields_in_edit_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of AppName", "Display Name assigned for the app",
				aep.get_Text_ToolTipAppDisplayName());
	}

	@Then("verify tool tip text visibilty for Repository Link  Input text field in Edit Screen")
	public void verify_tool_tip_text_visibilty_for_repository_link_input_text_field_in_edit_screen() {
		AppsEditPage aep = new AppsEditPage(driver, logger);
		Assert.assertEquals("Tooltip of AppName", "Path of Repository: URL, IP Address",
				aep.get_Text_ToolTipRepositoryLinkName());
	}

	@Then("verify tool tip text visibilty for Root volume Input text field in Edit Screen")
	public void verify_tool_tip_text_visibilty_for_root_volume_input_text_field_in_edit_screen() {
		Assume.assumeTrue("Test case not valid No Root volume input field found on edit screen", false);
	}

}