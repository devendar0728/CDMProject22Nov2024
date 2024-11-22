package com.cdm.Stepdefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.junit.Assume;

import com.cdm.pages.AppGroupsEditPage;
import com.cdm.pages.AppGroupsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppGroupsSteps extends BaseTest {

	@Then("verify page with resize option with App groups page")
	public void verify_page_with_resize_option_with_app_groups_page() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.setZoomLevel(800, 600);

	}

	@Then("verify switching between input field using TAB")
	public void verify_switching_between_input_field_using_tab() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.switchingtab();

	}

	@Then("verify  alignment of ADD New,Refresh,bulk upload & bulk download buttons top right side")
	public void verify_alignment_of_add_new_refresh_bulk_upload_bulk_download_buttons_top_right_side() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assume.assumeTrue(
				"We can not automate alignment of ADD new Refresh bulk download and bulk download button, because alignment can be differ on differnt device",
				false);

	}

	@When("Click on App Groups tab")
	public void click_on_app_groups_tab() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.movetoAppGroup();
	}

	@Then("click on Add button")
	public void click_on_add_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.addButtonAppGroup();
	}

	@Then("verify max word limit in App Group Name Text Field in the edit screen")
	public void verify_max_word_limit_in_app_group_name_text_field_in_the_edit_screen() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);

	}

	@Then("verify application should load properly in slow network")
	public void verify_application_should_load_properly_in_slow_network() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assume.assumeTrue("slow network condifition can not be automate becuase it is depends on the bandwidth", false);
	}

	@Then("verify page is accessible by using wi-fi network")
	public void verify_page_is_accessible_by_using_wi_fi_network() {

		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assume.assumeTrue("slow network condifition can not be automate becuase it is depends on the bandwidth", false);
	}

	@Then("verify page without login into browser, copy & paste the url")
	public void verify_page_without_login_into_browser_copy_paste_the_url() {

	}

	@Then("check filter icon visibility for APP Group Name")
	public void check_filter_icon_visibility_for_app_group_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.appNameThreeDot();

	}

	@Then("check filter icon visibility for Status column")
	public void check_filter_icon_visibility_for_status_column() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.statusThreeDot();
	}

	@Then("verify page accessbility the filter icon for APP Group Display Name")
	public void verify_page_accessbility_the_filter_icon_for_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.appDisplayNameThreeDot();
	}

	@Then("verify pagination last page and first page")
	public void verify_pagination_last_page_and_first_page() {
		Assume.assumeTrue("Pagination not available", false);
	}

	@Then("verify pagination")
	public void verify_pagination() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assume.assumeTrue("Pagination not available", false);
	}

	@Then("verify labels of input text fields")
	public void verify_labels_of_input_text_fields() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.appNameThreeDot();
		agp.appNameSearch(alldata.get(vTCName).get("AppGroupName").toString());
		agp.backDropShowing_Div_Click();
	}

	@Then("check the column width & size resolution")
	public void check_the_column_width_size_resolution() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assume.assumeTrue("For every device size differ can not automate", false);

	}

	@Then("verify pagination with forward and backward arrow")
	public void verify_pagination_with_forward_and_backward_arrow() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assume.assumeTrue("Pagination not available", false);
	}

	@Then("verify to check the column width & size resolution")
	public void verify_to_check_the_column_width_size_resolution() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assume.assumeTrue("can not check column width and size resolution . For every device size differ", false);
	}

	@Then("check filter icon visibility for APP Group Display Name")
	public void check_filter_icon_visibility_for_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.appDisplayNameThreeDot();
	}

	@Then("click on cancel button")
	public void click_on_cancel_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.cancelButton();
	}

	@Then("Do not Fill all information on Add page and hit save button")
	public void do_not_fill_all_information_on_add_page_and_hit_save_button() throws InterruptedException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);

		agp.saveButton();

	}

	@When("Click on the three dots of App Group Name")
	public void click_on_the_three_dots_of_app_group_name() {

		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.movetoAppGroup();
	}

	@Then("enter text in the field of App Group Name")
	public void enter_text_in_the_field_of_app_group_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.appGroupNameInput(alldata.get(vTCName).get("AppGroupName").toString());
		agp.backDropShowing_Div_Click();
	}

	@When("Click on the three dots of App Group Display Name")
	public void click_on_the_three_dots_of_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.movetoAppGroup();
	}

	@Then("enter text in the field of App Group Display Name")
	public void enter_text_in_the_field_of_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);

		agp.appGroupDisplayNameInput(alldata.get(vTCName).get("AppGroupDisplayName").toString());
		agp.backDropShowing_Div_Click();
	}

	@When("Click on the Add icon at the right side of the page")
	public void click_on_the_add_icon_at_the_right_side_of_the_page() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.addButtonAppGroup();
	}

	@Then("Under Identity Section enter details for App Group Name and AppGroupDisplayName")
	public void under_identity_section_enter_details_for_app_group_name_and_app_group_display_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);

		agp.appGroupNameInput(alldata.get(vTCName).get("AppGroupNameAdd").toString());
		agp.appGroupDisplayNameEnterData(alldata.get(vTCName).get("AppGroupDisplayNameAdd").toString());
	}

	@Then("click on Save button.")
	public void click_on_save_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);

		agp.saveButton();
	}

	@When("Click on the Status Icon at the right side of the page")
	public void click_on_the_status_icon_at_the_right_side_of_the_page() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.statusThreeDot();
	}

	@Then("enter invalid details for App Group Name")
	public void enter_invalid_details_for_app_group_name() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.saveButton();
	}

	@Then("verify max word limit in App Group Display Name Text Field in the edit screen")
	public void verify_max_word_limit_in_app_group_display_name_text_field_in_the_edit_screen() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.saveButton();
	}

	@Then("user should search for App Group Name and App Group Display name")
	public void user_should_search_for_app_group_name_and_app_group_display_name() throws InterruptedException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.appNameThreeDot();
		agp.appNameSearch(alldata.get(vTCName).get("AppGroupName").toString());
		agp.backDropShowing_Div_Click();

		agp.appDisplayNameThreeDot();
		agp.appGroupNameSearch(alldata.get(vTCName).get("AppGroupDisplayName").toString());
	}

	@Then("click on bulk download button")
	public void click_on_bulk_download_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.bulkdownloadButton();
	}

	@Then("click on bulk upload functionality")
	public void click_on_bulk_upload_functionality() throws InterruptedException, AWTException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.bulkUploadButton();

		agp.uploadfile();

		StringSelection ss = new StringSelection(alldata.get(vTCName).get("FileUploadPath").toString());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// imitate mouse events like ENTER, CTRL+C, CTRL+V
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
		agp.uploadFileTask(alldata.get(vTCName).get("FileUploadPath").toString());

		agp.bulkUploadButtonSucess();

	}

	@Then("verify tooltip for Edit button")
	public void verify_tooltip_for_edit_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Edit Button", "Edit", agp.get_Text_ToolTipforEditButton());
	}

	@Then("verify tooltip for Delete button")
	public void verify_tooltip_for_delete_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Delete Button", "Delete", agp.get_Text_ToolTipforDeleteButton());
	}

	@Then("verify tooltip for Add Application button")
	public void verify_tooltip_for_add_application_button() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		Assert.assertEquals("Tooltip of Add application Button", "Add New", agp.get_Text_ToolTipforAddApplications());
	}

	@Then("click on three dots on App Group name and enter the value for AppName")
	public void click_on_three_dots_on_app_group_name_and_enter_the_value_for_app_name() throws InterruptedException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.appNameThreeDot();

		agp.appNameSearch(alldata.get(vTCName).get("AppGroupName").toString());
		agp.backDropShowing_Div_Click();
		Thread.sleep(7000);
	}

	@Then("remove the existing value for AppGroupName and change with new value")
	public void remove_the_existing_value_for_app_group_name_and_change_with_new_value() {
		AppGroupsEditPage agep = new AppGroupsEditPage(driver, logger);
		agep.removalofEnteredTextForappGroupName();
		agep.appGroupNameEdit(alldata.get(vTCName).get("AppGroupNameUpdate").toString());
	}

	@Then("remove the existing value for AppDisplayName and change with new value")
	public void remove_the_existing_value_for_app_display_name_and_change_with_new_value() {
		AppGroupsEditPage agep = new AppGroupsEditPage(driver, logger);
		agep.removalofEnteredTextForappGroupDisplayNameEdit();
		agep.appGroupDisplayNameEdit(alldata.get(vTCName).get("AppGroupDisplayName").toString());
	}

	@Then("click on save button to save App groups")
	public void click_on_save_button_to_save_app_groups() throws InterruptedException {
		AppGroupsEditPage agep = new AppGroupsEditPage(driver, logger);
		agep.saveButton();

	}

	@Then("Click on Edit button to edit app groups")
	public void click_on_edit_button_to_edit_app_groups() {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.editButton();
	}

	@Then("Click on Delete button to delete app groups")
	public void click_on_delete_button_to_delete_app_groups() throws InterruptedException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);
		agp.deleteButton();
		agp.confirmationYesDeleteButton();

	}

	@Then("Under Status column select Active checkbox from the List")
	public void under_status_column_select_active_checkbox_from_the_list() throws InterruptedException {
		AppGroupsPage agp = new AppGroupsPage(driver, logger);

		agp.statusinActiveCheckbox();

	}

}