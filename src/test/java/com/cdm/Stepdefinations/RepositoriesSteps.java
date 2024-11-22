package com.cdm.Stepdefinations;

import org.junit.Assert;
import org.junit.Assume;

import com.cdm.pages.RepositoriesAddPage;
import com.cdm.pages.RepositoriesPage;

import io.cucumber.java.en.Then;

public class RepositoriesSteps extends BaseTest {

	@Then("Click on switching to Repositories tab")
	public void click_on_switching_to_repositories_tab() throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);

		rs.repositories_tab();

	}

	@Then("enter the details for repository name and url")
	public void enter_the_details_for_repository_name_and_url() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositorynameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());
		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());
	}

	@Then("verify validation message for URL without entering details")
	public void verify_validation_message_for_url_without_entering_details() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());
		Assert.assertEquals("Validation message for URL", "Mandatory field - required !",
				rap.verifyValidationMessageRepositoryURL());
	}

	@Then("verify validation message for repository Name")
	public void verify_validation_message_for_repository_name() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositorynameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());
		Assert.assertEquals("Validation message for Repository name", "Mandatory field - required !",
				rap.verifyValidationMessageRepositoryName1());
	}

	@Then("verify validation message for error message below URL text field")
	public void verify_validation_message_for_error_message_below_url_text_field() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());
		Assert.assertEquals("Validation message for URL", "Mandatory field - required !",
				rap.verifyValidationMessageRepositoryURL());
	}

	@Then("verify filter icon visibility for Repository Name")
	public void verify_filter_icon_visibility_for_repository_name() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.repositoriesNameThreeDot();
		rp.repositoryNameInput(alldata.get(vTCName).get("RepositoryNameSearch").toString());
	}

	@Then("verify filter icon visibility for UserName")
	public void verify_filter_icon_visibility_for_user_name() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.usernameThreeDot();
		rp.usernameInput(alldata.get(vTCName).get("UserNameSearch").toString());
	}

	@Then("verify filter icon visibility for Status")
	public void verify_filter_icon_visibility_for_status() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.statusDot();

	}

	@Then("verify to check the visualisation look of the table list")
	public void verify_to_check_the_visualisation_look_of_the_table_list() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
	}

	@Then("verify alignment for all the input text fields in ADD New Screen")
	public void verify_alignment_for_all_the_input_text_fields_in_add_new_screen() {

		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());
		Assert.assertEquals("Validation message for URL", "Mandatory field - required !",
				rap.verifyValidationMessageRepositoryURL());
	}

	@Then("verify to check the coloumn width uniformity")
	public void verify_to_check_the_coloumn_width_uniformity() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assume.assumeTrue("Can not automate column width uniformity", false);
	}

	@Then("verify standarize text format for error message below for all the text fields")
	public void verify_standarize_text_format_for_error_message_below_for_all_the_text_fields() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositorynameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());
		Assert.assertEquals("Validation message for repository Nae",
				"Alphanumerics & Special characters of length Min = 2, Max = 32 are allowed !",
				rap.verifyValidationMessageRepositoryName());
	}

	@Then("verify sorting functionality for the table list")
	public void verify_sorting_functionality_for_the_table_list() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.repositoryNameAsc();

	}

	@Then("verify accessible the page by using mobile network")
	public void verify_accessible_the_page_by_using_mobile_network() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assume.assumeTrue("Mobile network depends on various factors we can not automate ", false);
	}

	@Then("verify switching between inputs fields using TAB in the repository")
	public void verify_switching_between_inputs_fields_using_tab_in_the_repository() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
	}

	@Then("verify alignment of Add New,Refresh buttons on the top right side")
	public void verify_alignment_of_add_new_refresh_buttons_on_the_top_right_side() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
	}

	@Then("verify alignment for maximise and minimize the screen")
	public void verify_alignment_for_maximise_and_minimize_the_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.minimizewindow();
	}

	@Then("verify filter icon visibility for Data Storage Index")
	public void verify_filter_icon_visibility_for_data_storage_index() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.dataStorageIndexThreeDot();
		rp.dataStorageIndex(alldata.get(vTCName).get("DataStorageIndexSearch").toString());
	}

	@Then("verify validation message for Data Storage Index without entering details")
	public void verify_validation_message_for_data_storage_index_without_entering_details()
			throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.datastorageindexAdd(alldata.get(vTCName).get("RepositoryDataStorageIndexAdd").toString());
		rap.savebuttonrepository();
	}

	@Then("fill invalid details and click on save respository button")
	public void fill_invalid_details_and_click_on_save_respository_button() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositorynameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());
		Assert.assertEquals("Validation message for repository Nae",
				"Alphanumerics & Special characters of length Min = 2, Max = 32 are allowed !",
				rap.verifyValidationMessageRepositoryName());
	}

	@Then("Try increasing & decreasing the Zoom% \\(from {int}% to {int}%) from browsers.")
	public void try_increasing_decreasing_the_zoom_from_to_from_browsers(Integer int1, Integer int2) {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.setZoomLevel(800, 600);
	}

	@Then("Click on Add button icon on top right side of repositories")
	public void click_on_add_button_icon_on_top_right_side_of_repositories() throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);

		rs.addButton();

	}

	@Then("click on save button to save repository")
	public void click_on_save_button_to_save_repository() {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);

		rs.savebuttonrepository();
	}

	@Then("User Name optional Text field in the Repository > Add screen")
	public void user_name_optional_text_field_in_the_repository_add_screen() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryUserNameAdd(alldata.get(vTCName).get("RepositoryUserNameAdd").toString());
	}

	@Then("verify message for User Name optional Text field in the Repository > Add screen")
	public void verify_message_for_user_name_optional_text_field_in_the_repository_add_screen() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		Assert.assertEquals("repositories validation message for username",
				"Alphanumerics & Special characters of length Min = 2, Max = 32 are allowed !",
				rap.verifyValidationMessageUsername());

	}

	@Then("Password optional Text field in the Repository > Add screen")
	public void password_optional_text_field_in_the_repository_add_screen() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryPasswordAdd(alldata.get(vTCName).get("RepositoryPasswordAdd").toString());
	}

	@Then("enter the value for username")
	public void enter_the_value_for_username() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryUserNameAdd(alldata.get(vTCName).get("RepositoryUserNameAdd").toString());
	}

	@Then("On the top of the left side Click on accordion")
	public void on_the_top_of_the_left_side_click_on_accordion() throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.accordionexpandbutton();
		Thread.sleep(4000);
	}

	@Then("check collapsible accordion functionality")
	public void check_collapsible_accordion_functionality() throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.accordionexpandbutton();
		Thread.sleep(4000);
		rap.accordionexpandbutton();
	}

	@Then("fill the details under Repository path optional Text field in the Repository > Add screen")
	public void fill_the_details_under_repository_path_optional_text_field_in_the_repository_add_screen()
			throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositorypathAdd(alldata.get(vTCName).get("RepositoryPathAdd").toString());
		Thread.sleep(4000);
	}

	@Then("enter the User Name optional Text field in the Repository > Add screen.")
	public void enter_the_user_name_optional_text_field_in_the_repository_add_screen() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryUserNameAdd(alldata.get(vTCName).get("RepositoryUserNameAdd").toString());
	}

	@Then("click on Edit button to edit repositories")
	public void click_on_edit_button_to_edit_repositories() throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.editbuttonRepository();

		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.removalofEnteredTextForRepositoryName();

		rap.repositorynameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());

		rap.removalofEnteredTextForRepositoryPath();

		rap.repositorypathAdd(alldata.get(vTCName).get("RepositoryPathAdd").toString());

		rap.removalofEnteredTextForURL();

		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());

		rap.removalofEneredTextForUSername();

		rap.repositoryUserNameAdd(alldata.get(vTCName).get("RepositoryUserNameAdd").toString());

		rap.removalofEneredTextPassword();

		rap.repositoryPasswordAdd(alldata.get(vTCName).get("RepositoryPasswordAdd").toString());

		rap.datastorageindexAdd(alldata.get(vTCName).get("RepositoryDataStorageIndexAdd").toString());
		Thread.sleep(4000);

		rap.savebuttonrepository();

		Thread.sleep(4000);

	}

	@Then("observe search functionality")
	public void observe_search_functionality() {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);

		rs.repositoriesNameThreeDot();
		rs.repositoryNameInput(alldata.get(vTCName).get("RepositoryNameSearch").toString());
		// rs.backDropShowing_Div_Click();
		rs.outerlayerclick();

		rs.dataStorageIndexThreeDot();
		rs.dataStorageIndex(alldata.get(vTCName).get("DataStorageIndexSearch").toString());
		rs.outerlayerclick();

		rs.usernameThreeDot();
		rs.usernameInput(alldata.get(vTCName).get("UserNameSearch").toString());
		rs.outerlayerclick();
	}

	@Then("click on three dots of repositories name and enter the value for the repositories")
	public void click_on_three_dots_of_repositories_name_and_enter_the_value_for_the_repositories()
			throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.repositoriesNameThreeDot();
		Thread.sleep(4000);
		try {
			rs.repositoryNameInput(alldata.get(vTCName).get("RepositoryNameSearch").toString());
			rs.outerlayerclick();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Thread.sleep(4000);
	}

	@Then("click on Delete button")
	public void click_on_delete_button() throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.deleteButton();
		// rs.confirmationYesButton();
		Thread.sleep(4000);
		rs.confirmationNoButton();
	}

	@Then("verify tooltip for Edit button for repository")
	public void hover_the_mouse_on_edit_button_from_actions_columns() {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.get_Text_ToolTipEditRepository();
	}

	@Then("click on Edit button to edit repository")
	public void click_on_edit_button_to_edit_repository() {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.editbuttonRepository();
	}

	@Then("verify tooltip for Delete button for repository")
	public void verify_tooltip_for_delete_button_for_repository() {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.get_Text_ToolTipDeleteRepository();
	}

	@Then("using drop drown of data storage index in Data storage index Text field in the Repository > Add screen")
	public void using_drop_drown_of_data_storage_index_in_data_storage_index_text_field_in_the_repository_add_screen()
			throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.datastorageindexAdd(alldata.get(vTCName).get("RepositoryDataStorageIndexAdd").toString());
	}

	@Then("Hover the mouse on Add New button on the top right side")
	public void hover_the_mouse_on_add_new_button_on_the_top_right_side() {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.get_Text_ToolTipAddButtonRepository();
	}

	@Then("without entering any details click on save button")
	public void without_entering_any_details_click_on_save_button() throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.savebuttonrepository();
		Thread.sleep(4000);
	}

	@Then("click on cancel button from repositories details page to list screen")
	public void click_on_cancel_button_from_repositories_details_page_to_list_screen() throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.cancelRepository();
		Thread.sleep(4000);
	}

	@Then("Click on Settings module & switch to Repositories tab & Click on \"+' Icon i.e. ADD button")
	public void click_on_settings_module_switch_to_repositories_tab_click_on_icon_i_e_add_button()
			throws InterruptedException {
		RepositoriesPage rs = new RepositoriesPage(driver, logger);
		rs.addButton();
		Thread.sleep(5000);
	}

	@Then("fill all mandatory fields for respositories add section")
	public void fill_all_mandatory_fields_for_respositories_add_section() throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositorynameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());
		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());
		rap.datastorageindexAdd(alldata.get(vTCName).get("RepositoryDataStorageIndexAdd").toString());
	}

	@Then("hit on save button to save repositories")
	public void hit_on_save_button_to_save_repositories() throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.savebuttonrepository();
		Thread.sleep(3000);

	}

	@Then("check standarize text format for success message in toaster")
	public void check_standarize_text_format_for_success_message_in_toaster() throws InterruptedException {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.successMessage();
		Thread.sleep(2000);
	}


	@Then("Type alphanumeric with special characters in Repository URL Text field in the Repository > Add screen")
	public void type_alphanumeric_with_special_characters_in_repository_url_text_field_in_the_repository_add_screen()
			throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());
		Thread.sleep(4000);
	}

	@Then("Message appears that only valid URL are allowed i.e. minimum {int} & max No limit")
	public void message_appears_that_only_valid_url_are_allowed_i_e_minimum_max_no_limit(Integer int1) {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		Assert.assertEquals("repositories url validation message", "Please enter valid url !",
				rap.verifyValidationMessageRepositoryURL());
	}

	@Then("check standarize text format for error message in toaster")
	public void check_standarize_text_format_for_error_message_in_toaster() {
		Assume.assumeFalse("Same repository name you can add", false);

	}

	@Then("Type valid name of the application url in URL Text field in the Repository > Add screen")
	public void type_valid_name_of_the_application_url_in_url_text_field_in_the_repository_add_screen()
			throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositoryURLAdd(alldata.get(vTCName).get("RepositoryURLAdd").toString());
		Thread.sleep(4000);
	}

	@Then("Status Toggle button in the Repository > Add screen")
	public void status_toggle_button_in_the_repository_add_screen() throws InterruptedException {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.moveSliderCondition("unchecked");

		Thread.sleep(3000);
		rap.moveSliderCondition("checked");
		Thread.sleep(3000);
		rap.moveSliderCondition("unchecked");
		Thread.sleep(3000);
	}

	@Then("verify colour of the toggle")
	public void verify_colour_of_the_toggle() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		String expectedColor = alldata.get(vTCName).get("ExpectedColourToggle").toString();
		Assert.assertEquals(rap.toggleElementcolour(), expectedColor);
	}

	@Then("verify Message appears that only valid URL are allowed")
	public void verify_message_appears_that_only_valid_url_are_allowed() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		Assert.assertEquals("repositories url validation message", "Please enter valid url !",
				rap.verifyValidationMessageRepositoryURL());
	}

	@Then("Type alphabeitc characters in Repository Name Text field in the Repository > Add screen.")
	public void type_alphabeitc_characters_in_repository_name_text_field_in_the_repository_add_screen() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		rap.repositorynameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());

	}

	@Then("verify Message appears that only alphabetic characters are allowed")
	public void verify_message_appears_that_only_alphabetic_characters_are_allowed() {
		RepositoriesAddPage rap = new RepositoriesAddPage(driver, logger);
		Assert.assertEquals("repositories validation message",
				"Alphanumerics & Special characters of length Min = 2, Max = 32 are allowed !",
				rap.verifyValidationMessageRepositoryName());
	}

	@Then("verify tooltip for repository name")
	public void verify_tooltip_for_repository_name() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for repository name", "Unique Name assigned for the Repository",
				rp.get_Text_ToolTipRepositoryName());
	}

	@Then("verify tool tip text visibilty for Data Storage Index")
	public void verify_tool_tip_text_visibilty_for_data_storage_index() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for Data Storage Index",
				"The data storage type for the repository being configured", rp.get_Text_ToolTipDataStorageIndex());
	}

	@Then("verify tool tip text visibilty for User Name")
	public void verify_tool_tip_text_visibilty_for_user_name() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for username", "Valid Email ID for the repository", rp.get_Text_ToolTipUserName());
	}

	@Then("verify tool tip text visibilty for Status coloumn")
	public void verify_tool_tip_text_visibilty_for_status_coloumn() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for Status", "Indicates the status of the repository",
				rp.get_Text_ToolTipStatus());
	}

	@Then("verify tool tip text visibilty for EDIT button in Actions column for repositories")
	public void verify_tool_tip_text_visibilty_for_edit_button_in_actions_column_for_repositories() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for Edit button", "Edit", rp.get_Text_ToolTipEdit());
	}

	@Then("verify tool tip text visibilty for Delete functionality button in Actions column for repositories")
	public void verify_tool_tip_text_visibilty_for_delete_functionality_button_in_actions_column_for_repositories() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for Delete button", "Delete", rp.get_Text_ToolTipDelete());
	}

	@Then("verify tool tip text visibilty for Repository Name Input text field in ADD Screen")
	public void verify_tool_tip_text_visibilty_for_repository_name_input_text_field_in_add_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		try {
			Assert.assertEquals("Tooltip for repository name", "Unique Name assigned for the Repository",
					rp.get_Text_ToolTipRepositoryNameAdd());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("verify tool tip text visibilty for Repository Name Input text field Edit Screen")
	public void verify_tool_tip_text_visibilty_for_repository_name_input_text_field_edit_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.editbuttonRepository();
		Assert.assertEquals("Tooltip for repository name", "Unique Name assigned for the Repository",
				rp.get_Text_ToolTipRepositoryNameAdd());
	}

	@Then("verify tool tip text visibilty for Repository Name Input text field Edit Screen of repositories")
	public void verify_tool_tip_text_visibilty_for_repository_name_input_text_field_edit_screen_of_repositories() {
		try {
			RepositoriesPage rp = new RepositoriesPage(driver, logger);

			Assert.assertEquals("Tooltip for repository name", "Unique Name assigned for the Repository",
					rp.get_Text_ToolTipRepositoryNameAdd());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("verify tool tip text visibilty for User Name Input text field in Edit Screen")
	public void verify_tool_tip_text_visibilty_for_user_name_input_text_field_in_edit_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.editbuttonRepository();
		Assert.assertEquals("Tooltip for username", "Valid Email ID for the repository",
				rp.get_Text_ToolTipRepositoryUserNameAdd());
	}

	@Then("verify tool tip text visibilty for URL Input text field in ADD Screen")
	public void verify_tool_tip_text_visibilty_for_url_input_text_field_in_add_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for repository URL", "Path of Repository: URL, IP Address",
				rp.get_Text_ToolTipRepositoryURLAdd());
	}

	@Then("verify to check the tool tip text visibilty for URL Input text field in Edit Screen")
	public void verify_to_check_the_tool_tip_text_visibilty_for_url_input_text_field_in_edit_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.editbuttonRepository();
		Assert.assertEquals("Tooltip for repository URL", "Path of Repository: URL, IP Address",
				rp.get_Text_ToolTipRepositoryURLAdd());
	}

	@Then("verify tool tip text visibilty for Repository Path Input text field in ADD Screen")
	public void verify_tool_tip_text_visibilty_for_repository_path_input_text_field_in_add_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for repository Path",
				"The file path where the repository is located. Character limits: 0-256 characters permitted.",
				rp.get_Text_ToolTipRepositoryPathAdd());
	}

	@Then("verify to check the tool tip text visibilty for Repository Path Input text field in Edit Screen")
	public void verify_to_check_the_tool_tip_text_visibilty_for_repository_path_input_text_field_in_edit_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.editbuttonRepository();
		Assert.assertEquals("Tooltip for repository Path",
				"The file path where the repository is located. Character limits: 0-256 characters permitted.",
				rp.get_Text_ToolTipRepositoryPathAdd());

	}

	@Then("verify tool tip text visibilty for User Name Input text field in ADD Screen")
	public void verify_tool_tip_text_visibilty_for_user_name_input_text_field_in_add_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for username", "Valid Email ID for the repository",
				rp.get_Text_ToolTipRepositoryUserNameAdd());
	}

	@Then("verify tool tip text visibilty for Password Input text field in Edit Screen")
	public void verify_tool_tip_text_visibilty_for_password_input_text_field_in_edit_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.editbuttonRepository();
		Assert.assertEquals("Tooltip for Password", "Valid Password for access",
				rp.get_Text_ToolTipRepositoryPasswordAdd());
	}

	@Then("verify tool tip text visibilty for Data Storage Index dropdown Input text field in Edit Screen")
	public void verify_tool_tip_text_visibilty_for_data_storage_index_dropdown_input_text_field_in_edit_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		rp.editbuttonRepository();
		Assert.assertEquals("Tooltip for Data Storage Index",
				"The data storage type for the repository being configured",
				rp.get_Text_ToolTipRepositoryDataStorageAdd());

	}

	@Then("verify tool tip text visibilty for Password Input text field in ADD Screen")
	public void verify_tool_tip_text_visibilty_for_password_input_text_field_in_add_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for Password", "Valid Password for access",
				rp.get_Text_ToolTipRepositoryPasswordAdd());
	}

	@Then("verify tool tip text visibilty for Data Storage Index drop down Input text field in ADD Screen")
	public void verify_tool_tip_text_visibilty_for_data_storage_index_drop_down_input_text_field_in_add_screen() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for Data Storage Index",
				"The data storage type for the repository being configured",
				rp.get_Text_ToolTipRepositoryDataStorageAdd());
	}

	@Then("verify tool tip text visibilty for Data Storage Index drop down Input text field in ADD Screen of repositories")
	public void verify_tool_tip_text_visibilty_for_data_storage_index_drop_down_input_text_field_in_add_screen_of_repositories() {
		RepositoriesPage rp = new RepositoriesPage(driver, logger);
		Assert.assertEquals("Tooltip for Data Storage Index",
				"The data storage type for the repository being configured",
				rp.get_Text_ToolTipRepositoryDataStorageAdd());
	}

}
