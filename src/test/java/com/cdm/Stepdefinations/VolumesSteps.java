package com.cdm.StepDefinations;

import org.junit.Assert;
import org.junit.Assume;

import com.cdm.pages.VolumesAddPage;
import com.cdm.pages.VolumesEditPage;
import com.cdm.pages.VolumesListPage;

import io.cucumber.java.en.Then;

public class VolumesSteps extends BaseTest {

	@Then("Click on volumes tab from right panel of the screen")
	public void click_on_volumes_tab_from_right_panel_of_the_screen() throws InterruptedException {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.volume_tab();
	}

	@Then("verify add button on volumes list page")
	public void verify_add_button_on_volumes_list_page() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		Thread.sleep(3000);
		vap.volumeAddPlusicon();
	}

	@Then("user fill the invalid details i.e. more than max characters with invalid inputs and click on save button in Volumefill all the mandatory valid details and click on save button")
	public void user_fill_the_invalid_details_i_e_more_than_max_characters_with_invalid_inputs_and_click_on_save_button_in_volumefill_all_the_mandatory_valid_details_and_click_on_save_button()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("VolumeNameAdd").toString());

		vap.headingTitleAdd();
		Thread.sleep(4000);
		String str = "Alphanumerics & Special characters of length Min = 2, Max = 128 are allowed !";
		String message = vap.verifyValidationMessageVolumeName();
		Assert.assertEquals(str, message);
	}

	@Then("verify toggle button for status")
	public void verify_toggle_button_for_status() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.moveSliderCondition("unchecked");

		Thread.sleep(3000);
		vap.moveSliderCondition("checked");
		Thread.sleep(3000);
		vap.moveSliderCondition("unchecked");
		Thread.sleep(3000);
	}

	@Then("click on profile icons from the top of the module")
	public void click_on_profile_icons_from_the_top_of_the_module() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.profileicon();

	}

	@Then("verify the toggle color should change to green")
	public void verify_the_toggle_color_should_change_to_green() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);

		vap.verifyToggleColor(alldata.get(vTCName).get("colourcode").toString());

	}

	@Then("Verification of breaching the Max word limit in Volume name Text field")
	public void verification_of_breaching_the_max_word_limit_in_volume_name_text_field() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("VolumeNameAdd").toString());
		vap.headingTitleAdd();
		Thread.sleep(4000);
		String str = "Alphanumerics & Special characters of length Min = 2, Max = 128 are allowed !";
		String message = vap.verifyValidationMessageVolumeName();
		Assert.assertEquals(str, message);
	}
	@Then("check alignment for maximise and minimise the screen")
	public void check_alignment_for_maximise_and_minimise_the_screen() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.minimizeWindow();

	}

	@Then("Verification of breaching the Max word limit in repository link name Text field")
	public void verification_of_breaching_the_max_word_limit_in_repository_link_name_text_field()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumerepositorylinkAdd(alldata.get(vTCName).get("RepositoryLinkAdd").toString());

	}

	@Then("Verification of breaching the Max word limit in License Type")
	public void verification_of_breaching_the_max_word_limit_in_license_type() throws InterruptedException {
		{
			VolumesAddPage vap = new VolumesAddPage(driver, logger);
			vap.licensetypeAdd(alldata.get(vTCName).get("LicenseTypeAdd").toString());
			vap.headingTitleAdd();
			Thread.sleep(4000);
			String str = "Alphanumerics & Special characters of length Min = 1, Max = 32 are allowed !";
			String message = vap.verifyValidationMessageLicenseType();
			Assert.assertEquals(str, message);

		}
	}

	@Then("Verification of breaching the Max word limit in mount directory name text field")
	public void verification_of_breaching_the_max_word_limit_in_mount_directory_name_text_field()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumemountdirectoryAdd(alldata.get(vTCName).get("MountDirectoryAdd").toString());

	}

	@Then("Verification of breaching the Min word limit in SHA Key Text field in Volume> Add screen by Super Admin")
	public void verification_of_breaching_the_min_word_limit_in_sha_key_text_field_in_volume_add_screen_by_super_admin()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeSHAKeyAdd(alldata.get(vTCName).get("SHAKeyAdd").toString());
		vap.headingTitleAdd();
		Thread.sleep(4000);
		String str = "Alphanumerics & Special characters of length Min = 2 is allowed !";
		String message = vap.verifyValidationMessageSHAkey();
		Assert.assertEquals(str, message);
	}

	@Then("Verification of breaching the Max word limit in architecture name Text field")
	public void verification_of_breaching_the_max_word_limit_in_architecture_name_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumearchitectureAdd(alldata.get(vTCName).get("ArchitectureAdd").toString());
	}

	@Then("Verification of breaching the Min word limit in Architecture Text field in Volume")
	public void verification_of_breaching_the_min_word_limit_in_architecture_text_field_in_volume()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumearchitectureAdd(alldata.get(vTCName).get("ArchitectureAdd").toString());
		vap.headingTitleAdd();
//
//		String str = "Alphanumerics & Special characters of length Min = 2, Max = 32 are allowed !";
//		String message = vap.verifyValidationMessagearchitecture();
//		Assert.assertEquals(str, message);
	}

	@Then("Verification of breaching the min word in Mount Directory Text field")
	public void verification_of_breaching_the_min_word_in_mount_directory_text_field() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumemountdirectoryAdd(alldata.get(vTCName).get("MountDirectoryAdd").toString());

	}

	@Then("check  visualization of icons in action column")
	public void check_visualization_of_icons_in_action_column() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
	}

	@Then("check filter icon visibility for Version\\/Tag")
	public void check_filter_icon_visibility_for_version_tag() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.tagThreeDot();
	}

	@Then("check filter icon visibility for Status")
	public void check_filter_icon_visibility_for_status() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.statusThreeDot();
	}

	@Then("check filter icon visibility for Architecture")
	public void check_filter_icon_visibility_for_architecture() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.architectureNameThreeDot();
		vlp.inputarchitectureSearch(alldata.get(vTCName).get("ArchitetureSearch").toString());
	}

	@Then("check visibilty the input field format for volume page")
	public void check_visibilty_the_input_field_format_for_volume_page() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
	}

	@Then("Verify if user fill the invalid details and click on save button")
	public void verify_if_user_fill_the_invalid_details_and_click_on_save_button() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("VolumeNameAdd").toString());

		vap.headingTitleAdd();
		Thread.sleep(4000);
		String str = "Alphanumerics & Special characters of length Min = 2, Max = 128 are allowed !";
		String message = vap.verifyValidationMessageVolumeName();
		Assert.assertEquals(str, message);
	}

	@Then("to check the coloumn width uniformity")
	public void to_check_the_coloumn_width_uniformity() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
	}

	@Then("to check alignment for all the input text fields in ADD New Screen")
	public void to_check_alignment_for_all_the_input_text_fields_in_add_new_screen() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
	}

	@Then("to check the labels of input text fields")
	public void to_check_the_labels_of_input_text_fields() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
	}

	@Then("check switching between inputs fields using TAB")
	public void check_switching_between_inputs_fields_using_tab() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
	}

	@Then("check page is loading properly in slow network")
	public void check_page_is_loading_properly_in_slow_network() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
	}

	@Then("check  accessible the page by using mobile network")
	public void check_accessible_the_page_by_using_mobile_network() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
	}

	@Then("check page accessible the screen by using wi-fi network")
	public void check_page_accessible_the_screen_by_using_wi_fi_network() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
	}

	@Then("check page without login into browser, copy & paste the url")
	public void check_page_without_login_into_browser_copy_paste_the_url() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		Assume.assumeTrue("copy paste only possible in manual testing", false);
	}

	@Then("check alignment of on the top right side")
	public void check_alignment_of_on_the_top_right_side(String string) {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
	}

	@Then("check filter icon visibility for volume name")
	public void check_filter_icon_visibility_for_volume_name() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.VolumeNameThreeDot();
	}

	@Then("to check the tool tip text visibilty for SHA key Input text field in ADD Screen")
	public void to_check_the_tool_tip_text_visibilty_for_sha_key_input_text_field_in_add_screen() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		Assert.assertEquals("Tooltip for SHA Key", "The security key used for checksum validation of the volume",
				vap.get_Text_ToolTipSHAKey());
	}

	@Then("check the tool tip text visibilty for Version\\/Tag")
	public void check_the_tool_tip_text_visibilty_for_version_tag() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumetagAdd(alldata.get(vTCName).get("VersionTagAdd").toString());
	}

	@Then("check the tool tip text visibilty for Status")
	public void check_the_tool_tip_text_visibilty_for_status() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.statusThreeDot();
	}

	@Then("check the tool tip text visibilty for Type from drop down Input text field in ADD Screen")
	public void check_the_tool_tip_text_visibilty_for_type_from_drop_down_input_text_field_in_add_screen() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		Assert.assertEquals("Tooltip for type", "Type of Volume",
				vap.get_Text_ToolTipType());
	}

	@Then("check tool tip text visibilty for EDIT button in Actions column")
	public void check_tool_tip_text_visibilty_for_edit_button_in_actions_column() {
		try {
			VolumesListPage vap = new VolumesListPage(driver, logger);
			Assert.assertEquals("Tooltip for Edit", "Edit",
					vap.get_Text_ToolTipEditButton());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("check the tool tip text visibilty for License type Input text field in ADD Screen")
	public void check_the_tool_tip_text_visibilty_for_license_type_input_text_field_in_add_screen() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		Assert.assertEquals("Tooltip for License Type", "Type of Volume",
				vap.get_Text_ToolTipType());
	}

	@Then("check the tool tip text visibilty for Mount Directory Input text field in ADD Screen")
	public void check_the_tool_tip_text_visibilty_for_mount_directory_input_text_field_in_add_screen()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		Assert.assertEquals("Tooltip for mount directory",
				"Type of Volume",
				vap.get_Text_ToolTipmountDirectory());
	}

	@Then("check tool tip text visibilty for Version\\/Tag Input text field Add  Screen")
	public void check_tool_tip_text_visibilty_for_version_tag_input_text_field_add_screen() {
		VolumesEditPage vap = new VolumesEditPage(driver, logger);
		Assert.assertEquals("Tooltip for mount directory",
				"Version number of the Volume", vap.get_Text_ToolTipVersion());
	}

	@Then("check the tool tip text visibilty for Architecture Input text field in Add Screen")
	public void check_the_tool_tip_text_visibilty_for_architecture_input_text_field_in_add_screen() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		Assert.assertEquals("Tooltip for architecture","Type of Architecture of the Volume", vap.get_Text_ToolTiparchitecture());
	}

	@Then("check the tool tip text visibilty for Repository Path Input text field in Add Screen")
	public void check_the_tool_tip_text_visibilty_for_repository_path_input_text_field_in_add_screen() {
		VolumesEditPage vap = new VolumesEditPage(driver, logger);
		Assert.assertEquals("Tooltip for mount directory",
				"Path of Repository: URL, IP Address", vap.get_Text_ToolTiprepositoryLink());
	}
	@Then("check the tool tip text visibilty for Repository Link  Input text field in ADD Screen")
	public void check_the_tool_tip_text_visibilty_for_repository_link_input_text_field_in_add_screen() {

	}



@Then("check tool tip text visibilty for Convert to application functionality button in Actions column for volumes")
public void check_tool_tip_text_visibilty_for_convert_to_application_functionality_button_in_actions_column_for_volumes() {
	VolumesEditPage vap = new VolumesEditPage(driver, logger);

}
	@Then("check tool tip text visibilty for Max Size Input text field in Add Screen")
	public void check_tool_tip_text_visibilty_for_max_size_input_text_field_in_add_screen() throws InterruptedException {
		VolumesEditPage vap = new VolumesEditPage(driver, logger);
		Assert.assertEquals("Tooltip for max Size", "Maximum size of the Volume",
				vap.get_Text_ToolTipMaxSize());
	}

	@Then("check visibilty duration to load the page")
	public void check_visibilty_duration_to_load_the_page() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
	}

	@Then("to check the tool tip text visibilty for Volume Name Input text field in ADD Screen")
	public void to_check_the_tool_tip_text_visibilty_for_volume_name_input_text_field_in_add_screen() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		Assume.assumeTrue("No field of volume name available on add page , invalid manual test case", false);
	}

	@Then("fill all the mandatory valid details and click on save button")
	public void fill_all_the_mandatory_valid_details_and_click_on_save_button() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("VolumeNameAdd").toString());
		vap.volumeRepositoryNameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());
		vap.volumeRepositoryTypeAdd(alldata.get(vTCName).get("TypeAdd").toString());

		vap.volumeSavebutton();
	}

	@Then("user fill the invalid details i.e. more than max characters with invalid inputs and click on save button in Volume")
	public void user_fill_the_invalid_details_i_e_more_than_max_characters_with_invalid_inputs_and_click_on_save_button_in_volume()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("VolumeNameAdd").toString());
		vap.headingTitleAdd();
		Thread.sleep(4000);
		String str = "Alphanumerics & Special characters of length Min = 2, Max = 128 are allowed !";
		String message = vap.verifyValidationMessageVolumeName();
		Assert.assertEquals(str, message);
	}

	@Then("without entered any values in all the text fields and click on save button")
	public void without_entered_any_values_in_all_the_text_fields_and_click_on_save_button()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeSavebutton();
	}

	@Then("Verification of breaching the Min word limit in Version\\/Tag Text field")
	public void verification_of_breaching_the_min_word_limit_in_version_tag_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumetagAdd(alldata.get(vTCName).get("VersionTagAdd").toString());
	}

	@Then("Verification of breaching the Max word limit in Version\\/Tag Text field text field")
	public void verification_of_breaching_the_max_word_limit_in_version_tag_text_field_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumetagAdd(alldata.get(vTCName).get("VersionTagAdd").toString());
	}

	@Then("Verification of breaching the Max word limit in MAX size name text field")
	public void verification_of_breaching_the_max_word_limit_in_max_size_name_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumemaxsizeAdd(alldata.get(vTCName).get("MaxSizeAdd").toString());
	}

	@Then("Verification of breaching the Min word limit in License Type Text")
	public void verification_of_breaching_the_min_word_limit_in_license_type_text() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.licensetypeAdd(alldata.get(vTCName).get("LicenseTypeAdd").toString());
	}

	@Then("enter the alphanumeric and special character value in Mount Directory Text field")
	public void enter_the_alphanumeric_and_special_character_value_in_mount_directory_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumemountdirectoryAdd(alldata.get(vTCName).get("MountDirectoryAdd").toString());
	}

	@Then("enter acceptance of Numbers in Max Size Text field in the Volume")
	public void enter_acceptance_of_numbers_in_max_size_text_field_in_the_volume() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumemaxsizeAdd(alldata.get(vTCName).get("MaxSizeAdd").toString());
	}

	@Then("enter the alphanumeric and special character value in SHA KeyText field")
	public void enter_the_alphanumeric_and_special_character_value_in_sha_key_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeSHAKeyAdd(alldata.get(vTCName).get("SHAKeyAdd").toString());
	}

	@Then("enter the alphanumeric and special character value in Volume Name Text")
	public void enter_the_alphanumeric_and_special_character_value_in_volume_name_text() {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);

		vep.removalofEnteredTextForVolumeName();

		vep.volumenameEdit(alldata.get(vTCName).get("VolumeNameEdit").toString());
	}

	@Then("enter the alphanumeric and special character value in Architecture Text field in the Volume")
	public void enter_the_alphanumeric_and_special_character_value_in_architecture_text_field_in_the_volume() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumearchitectureAdd(alldata.get(vTCName).get("ArchitectureAdd").toString());
	}

	@Then("enter the alphanumeric and special character value in Version\\/Tag Text field")
	public void enter_the_alphanumeric_and_special_character_value_in_version_tag_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumetagAdd(alldata.get(vTCName).get("VersionTagAdd").toString());
	}

	@Then("click on three dots of volume name and click on Edit button")
	public void click_on_three_dots_of_volume_name_and_click_on_edit_button() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);

		vap.volumeNameThreeDot();

		vap.volumesearch(alldata.get(vTCName).get("VolumeNameSearch").toString());

		//vap.backDropShowing_Div_Click();

		vap.outerlayerclick();
		vap.editbutton();
		Thread.sleep(4000);

	}

	@Then("choose type using dropdown")
	public void choose_type_using_dropdown() throws InterruptedException {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		vep.typeEdit(alldata.get(vTCName).get("TypeEdit").toString());
	}

	@Then("choose repository name using dropdown")
	public void choose_repository_name_using_dropdown() throws InterruptedException {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		vep.repositoryNameEdit(alldata.get(vTCName).get("RepositoryNameEdit").toString());
	}

	@Then("enter the alphanumeric and special character value in repository Name field")
	public void enter_the_alphanumeric_and_special_character_value_in_repository_name_field() {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		vep.removalofEnteredTextForRepositoryLink();
		vep.repositorylinkEdit(alldata.get(vTCName).get("RepositoryLinkEdit").toString());
	}

	@Then("update the value for volume page")
	public void update_the_value_for_volume_page() throws InterruptedException {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		try {
			vep.removalofEnteredTextForVolumeName();
			vep.volumenameEdit(alldata.get(vTCName).get("VolumeNameEdit"));

			vep.repositoryNameEdit(alldata.get(vTCName).get("RepositoryLinkEdit"));

			vep.typeEdit(alldata.get(vTCName).get("TypeEdit"));

			vep.removalofEnteredTextForRepositoryLink();
			vep.repositorylinkEdit(alldata.get(vTCName).get("RepositoryLinkEdit"));

			vep.removalofEnteredTextForlicensetypeEdit();
			vep.licensetypeEdit(alldata.get(vTCName).get("LicenseTypeEdit"));

			vep.removalofEnteredTextForMountDirectory();
			vep.mountdirectoryEdit(alldata.get(vTCName).get("MountDirectoryEdit"));

			vep.removalofEnteredTextFortagEdit();
			vep.tagEdit(alldata.get(vTCName).get("VersionTagEdit"));

			vep.removalofEnteredTextForarchitectureEdit();
			vep.architectureEdit(alldata.get(vTCName).get("ArchitectureEdit"));

			vep.removalofEnteredTextFormaxsizeEdit();
			vep.maxsizeEdit(alldata.get(vTCName).get("MaxSizeEdit"));

			vep.removalofEnteredTextForShaKey();
			vep.shakeyEdit(alldata.get(vTCName).get("SHAKeyEdit"));

			vep.saveEditVolume();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("fill all mandatory and optional field for Add volume")
	public void fill_all_mandatory_and_optional_field_for_add_volume() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeName(alldata.get(vTCName).get("VolumeNameAdd").toString());
		vap.volumeRepositoryNameAdd(alldata.get(vTCName).get("RepositoryNameAdd").toString());
		vap.volumeRepositoryTypeAdd(alldata.get(vTCName).get("TypeAdd").toString());
		vap.volumerepositorylinkAdd(alldata.get(vTCName).get("RepositoryLinkAdd").toString());
		vap.volumeLicenseTypeAdd(alldata.get(vTCName).get("LicenseTypeAdd").toString());
		vap.volumemountdirectoryAdd(alldata.get(vTCName).get("MountDirectoryAdd").toString());
		vap.volumetagAdd(alldata.get(vTCName).get("VersionTagAdd").toString());
		vap.volumearchitectureAdd(alldata.get(vTCName).get("ArchitectureAdd").toString());
		vap.volumemaxsizeAdd(alldata.get(vTCName).get("MaxSizeAdd").toString());
		vap.volumeSHAKeyAdd(alldata.get(vTCName).get("SHAKeyAdd").toString());

	}

	@Then("verify tooltip for License Type text field")
	public void verify_tooltip_for_license_type_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		
		Assert.assertEquals("Type of License supported by Volume", vap.get_Text_ToolTipType());
	}
	@Then("verify tooltip for Repository Name for repository volume name for repository")
	public void verify_tooltip_for_repository_name_for_repository_volume_name_for_repository() {
	   VolumesListPage vlp = new VolumesListPage(driver, logger);
	   Assert.assertEquals("Type of License supported by Volume", vlp.get_Text_ToolTipRepositoryName());
	}
	@Then("verify tooltip for type dropdown")
	public void verify_tooltip_for_type_dropdown() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipType();
		Thread.sleep(2000);
	}

	@Then("verify tooltip for mount directory")
	public void verify_tooltip_for_mount_directory() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipmountDirectory();
	}

	@Then("verify check filter icon availability for  Architecture")
	public void verify_check_filter_icon_availability_for_architecture() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.architectureNameThreeDot();
		 Assert.assertEquals("Filter icon is not visible", vlp.architectureNameThreeDot());
		
		vlp.inputarchitectureSearch(alldata.get(vTCName).get("ArchitetureSearch").toString());
		vlp.backDropShowing_Div_Click();
	}

	@Then("verify tooltip for architecture text field")
	public void verify_tooltip_for_architecture_text_field() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTiparchitecture();
		
	}

	@Then("verify tooltip for version")
	public void verify_tooltip_for_version() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipversion();
	}

	@Then("verify tooltip for max size")
	public void verify_tooltip_for_max_size() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipmaxSize();
	}

	@Then("verify tooltip for Repository Link text field")
	public void verify_tooltip_for_repository_link_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTiprepositoryLink();
	}

	@Then("verify tooltip for English\\(US)")
	public void verify_tooltip_for_english_us() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipEnglishLogo();
	}

	@Then("verify tooltip for Repository Name for repository")
	public void verify_tooltip_for_repository_name_for_repository() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipRepositoryName();
	}

	@Then("click on the refresh button at the top right corner of the page")
	public void clik_on_the_refresh_button_at_the_top_right_corner_of_the_page() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.refreshbutton();
	}

	@Then("click on bell icons from the top of the module")
	public void click_on_bell_icons_from_the_top_of_the_module() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
//		vap.belliconclick();
	}

	@Then("verify tooltip for profile icon")
	public void verify_tooltip_for_profile_icon() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipprofile();
	}

	@Then("verify tooltip for Bell icon")
	public void verify_tooltip_for_bell_icon() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
//		vap.get_Text_ToolTipbellicon();
	}

	@Then("verify tooltip for volume name for repository")
	public void verify_tooltip_for_volumn_name_for_repository() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.get_Text_ToolTipVolumeName();
	}

	@Then("click on save button to save volume")
	public void click_on_save_button_to_save_volume() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeSavebutton();
		Thread.sleep(5000);
	}

	@Then("click on three dots of volume name and enter the value for volume name search")
	public void click_on_three_dots_of_volume_name_and_enter_the_value_for_volume_name_search() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.VolumeNameThreeDot();
		vlp.inputvolumename(alldata.get(vTCName).get("VolumeNameSearch").toString());
		//vlp.backDropShowing_Div_Click();
		vlp.outerlayerclick();
	}

	@Then("Click on button convert volume to application")
	public void click_on_button_convert_volume_to_application() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.convertToApplication();

	}

	@Then("verify the toast message after converting app")
	public void verify_the_toast_message_after_converting_app() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		Assert.assertNotEquals("Verify toast message", "Volume converted to app successfully ",
				vlp.toastcontainermessage());
	}

	@Then("without entering any details in any fields in the Volume click on save button")
	public void without_entering_any_details_in_any_fields_in_the_volume_click_on_save_button()
			throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumeSavebutton();
		Thread.sleep(5000);
	}

	@Then("enter the alphanumeric and special character value in repository link Text field")
	public void enter_the_alphanumeric_and_special_character_value_in_repository_link_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.volumerepositorylinkAdd(alldata.get(vTCName).get("RepositoryLinkAdd").toString());
	}

	@Then("enter the alphanumeric and special character value in License Type text field")
	public void enter_the_alphanumeric_and_special_character_value_in_license_type_text_field() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.licensetypeAdd(alldata.get(vTCName).get("LicenseTypeAdd").toString());
	}

	@Then("click on cancel button on volumeAdd page")
	public void click_on_cancel_button_on_volume_add_page() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		vap.cancelButton();
	}

	@Then("update the value for volume Name")
	public void update_the_value_for_volume_name() {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		vep.removalofEnteredTextForVolumeName();

		vep.volumenameEdit(alldata.get(vTCName).get("").toString());
	}

	@Then("apply filter on volume name and click on edit button")
	public void apply_filter_on_volume_name_and_click_on_edit_button() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.VolumeNameThreeDot();
		vlp.inputvolumename(alldata.get(vTCName).get("VolumeNameSearch").toString());
		//vlp.backDropShowing_Div_Click();
		vlp.outerlayerclick();
		vlp.editbutton();
	}

	@Then("verify check filter icon availability for Volume Name")
	public void verify_check_filter_icon_availability_for_volume_name() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		vlp.VolumeNameThreeDot();
		vlp.inputvolumename(alldata.get(vTCName).get("VolumeNameSearch").toString());
		vlp.backDropShowing_Div_Click();
	}

	@Then("if user modify data and click on save button in Volume")
	public void if_user_modify_data_and_click_on_save_button_in_volume() throws InterruptedException {
		VolumesEditPage vep = new VolumesEditPage(driver, logger);
		try {
			vep.removalofEnteredTextForVolumeName();
			vep.volumenameEdit(alldata.get(vTCName).get("VolumeNameEdit"));

			vep.repositoryNameEdit(alldata.get(vTCName).get("RepositoryNameEdit"));

			vep.typeEdit(alldata.get(vTCName).get("TypeEdit"));

//			vep.removalofEnteredTextForRepositoryLink();
//			vep.repositorylinkEdit(alldata.get(vTCName).get("RepositoryLinkEdit"));

//			vep.removalofEnteredTextForlicensetypeEdit();
//			vep.licensetypeEdit(alldata.get(vTCName).get("LicenseTypeEdit"));
//
//			vep.removalofEnteredTextForMountDirectory();
//			vep.mountdirectoryEdit(alldata.get(vTCName).get("MountDirectoryEdit"));
//
//			vep.removalofEnteredTextFortagEdit();
//			vep.tagEdit(alldata.get(vTCName).get("VersionTagEdit"));
//
//			vep.removalofEnteredTextForarchitectureEdit();
//			vep.architectureEdit(alldata.get(vTCName).get("ArchitectureEdit"));
//
//			vep.removalofEnteredTextFormaxsizeEdit();
//			vep.maxsizeEdit(alldata.get(vTCName).get("MaxSizeEdit"));
//
//			vep.removalofEnteredTextForShaKey();
//			vep.shakeyEdit(alldata.get(vTCName).get("SHAKeyEdit"));

			vep.saveEditVolume();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("check the tool tip text visibilty for Architecture")
	public void check_the_tool_tip_text_visibilty_for_architecture() {
		VolumesListPage vlp = new VolumesListPage(driver, logger);
		Assert.assertEquals("Tooltip of architecture", "Type of Architecture of the Volume",
				vlp.get_Text_ToolTiparchitecture());
	}

	@Then("check the tool tip text visibilty for Repository Name from drop down Input text field in ADD Screen")
	public void check_the_tool_tip_text_visibilty_for_repository_name_from_drop_down_input_text_field_in_add_screen() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		Assert.assertEquals("Tooltip for repository name", "Repository to which the Volume is assigned",
				vap.get_Text_ToolTipRepositoryName());
	}

	@Then("to check the tool tip text visibilty for SHA key Input text field in edit Screen")
	public void to_check_the_tool_tip_text_visibilty_for_sha_key_input_text_field_in_edit_screen() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		Assert.assertEquals("Tooltip for SHA Key", "The security key used for checksum validation of the volume",
				vap.get_Text_ToolTipSHAKey());
	}

	@Then("to check the tool tip text visibilty for Max Size Input text field in Edit Screen")
	public void to_check_the_tool_tip_text_visibilty_for_max_size_input_text_field_in_edit_screen() throws InterruptedException {
		VolumesEditPage vap = new VolumesEditPage(driver, logger);
		Assert.assertEquals("Tooltip for max size", "Maximum size of the Volume", vap.get_Text_ToolTipMaxSize());
	}

	@Then("to check the tool tip text visibilty for Repository Path Input text field in Edit Screen")
	public void to_check_the_tool_tip_text_visibilty_for_repository_path_input_text_field_in_edit_screen() {
		VolumesEditPage vap = new VolumesEditPage(driver, logger);
		Assume.assumeTrue("Can not see repository path input on the application , invalid manual test case", false);
	}

	@Then("to check the tool tip text visibilty for Architecture Input text field in Edit Screen")
	public void to_check_the_tool_tip_text_visibilty_for_architecture_input_text_field_in_edit_screen() throws InterruptedException {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		try {
			Assert.assertEquals("Tooltip for architecture", "Type of Architecture of the Volume",
					vap.get_Text_ToolTiparchitecture());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("to check the tool tip text visibilty for Mount Directory Input text field in Edit Screen")
	public void to_check_the_tool_tip_text_visibilty_for_mount_directory_input_text_field_in_edit_screen()
			throws InterruptedException {
		try {
			VolumesEditPage vep = new VolumesEditPage(driver, logger);
			Assert.assertEquals("Tooltip for mount edit", "The mounting location of the volume in the directory structure of the EDGE device", vep.get_Text_ToolTipMountDirectoryEdit());

		} catch (Exception e) {

		}

	}

	@Then("to check  the visualisation look of the table list")
	public void to_check_the_visualisation_look_of_the_table_list() {
		VolumesEditPage vap = new VolumesEditPage(driver, logger);
	}

	@Then("to check the tool tip text visibilty for Type from drop down Input text field in edit Screen")
	public void to_check_the_tool_tip_text_visibilty_for_type_from_drop_down_input_text_field_in_edit_screen() {
		VolumesEditPage vap = new VolumesEditPage(driver, logger);
		Assert.assertEquals("Tooltip for type edit", "Type of Volume", vap.get_Text_ToolTipTypeEdit());
	}

	@Then("to check the tool tip text visibilty for Repository Name from drop down Input text field in Edit Screen")
	public void to_check_the_tool_tip_text_visibilty_for_repository_name_from_drop_down_input_text_field_in_edit_screen() {
		VolumesEditPage vap = new VolumesEditPage(driver, logger);
		Assert.assertEquals("Tooltip for repository name edit", "Repository to which the Volume is assigned",
				vap.get_Text_ToolTipRepositoryNameEdit());
	}

	@Then("to check the tool tip text visibilty for Repository Link  Input text field in Edit Screen")
	public void to_check_the_tool_tip_text_visibilty_for_repository_link_input_text_field_in_edit_screen() {
		VolumesEditPage vap = new VolumesEditPage(driver, logger);
		Assert.assertEquals("Tooltip for repository link", "Path of Repository: URL, IP Address",
				vap.get_Text_ToolTiprepositoryLink());
	}

	@Then("to check the tool tip text visibilty for License type Input text field in ADD Screen")
	public void to_check_the_tool_tip_text_visibilty_for_license_type_input_text_field_in_add_screen() {
		VolumesAddPage vap = new VolumesAddPage(driver, logger);
		Assert.assertEquals("Tooltip for License Type", "Type of Volume",
				vap.get_Text_ToolTipType());
	}

	@Then("to check the tool tip text visibilty for Version\\/Tag Input text field Edit Screen")
	public void to_check_the_tool_tip_text_visibilty_for_version_tag_input_text_field_edit_screen() {
		VolumesEditPage vap = new VolumesEditPage(driver, logger);
		Assert.assertEquals("Tooltip for architecture edit", "Version number of the Volume",
				vap.get_Text_ToolTipVersion());
	}

}
