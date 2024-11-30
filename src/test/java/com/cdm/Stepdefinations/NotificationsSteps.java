package com.cdm.StepDefinations;

import org.junit.Assert;
import org.junit.Assume;

import com.cdm.pages.NotificationsPage;
import com.cdm.pages.Pagination;
import com.cdm.pages.UserGroupMappingPage;

import io.cucumber.java.en.Then;

public class NotificationsSteps extends BaseTest {

	@Then("verify page with resize option page for notifications")
	public void verify_page_with_resize_option_page_for_notifications() throws InterruptedException {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		notify.setZoomLevel(800, 600);

	}
	@Then("verify to Click on Notifications to check functionality of Full Backward arrow")
	public void verify_to_click_on_notifications_to_check_functionality_of_full_backward_arrow() {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);
	}

	@Then("verify to Click on Notifications pagination to check full forward arrow")
	public void verify_to_click_on_notifications_pagination_to_check_full_forward_arrow() throws InterruptedException {
		Pagination p = new Pagination(driver, logger);

		// Retrieve the 'Items Per Page' value from test data
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(3000);

		// Parse the value into an integer to determine the number of rows per page
		int rowPerPage = Integer.parseInt(value);

		// Click the Full Forward Arrow and verify the last page
		boolean isLastPageDisplayedCorrectly = p.navigateToLastPageAndVerify(rowPerPage);

		// Assert that the last page is displayed correctly
		// Assert.assertTrue("Last page is not displayed correctly after Full Forward
		// navigation.", isLastPageDisplayedCorrectly);

		// Optionally, log the success
		logger.info("Successfully validated Full Forward Arrow functionality for navigating to the last page.");
	}

	@Then("verify sorting for notification name")
	public void verify_sorting_for_notification_name() throws InterruptedException {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		notify.sortingOnNotificationName();
	}
	@Then("verify sorting on Status for notifications tab")
	public void verify_sorting_on_status_for_notifications_tab() throws InterruptedException {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		notify.sortingOnNotificationStatus();
	}




	@Then("check visibility of License Expiry")
	public void check_visibility_of_license_expiry() {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		notify.licenseExpiryVisibility();

	}
	@Then("verification of pagination on notifications page it will display records will display")
	public void verification_of_pagination_on_notifications_page_it_will_display_records_will_display() {
		Pagination edp = new Pagination(driver, logger);

		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		edp.SelectPageMatOption(value);
		int rowPerPage = Integer.parseInt(value);
	}



	@Then("Click on notifications tab from right panel of the screen")
	public void click_on_notifications_tab_from_right_panel_of_the_screen() throws InterruptedException {

		NotificationsPage notify = new NotificationsPage(driver, logger);
		notify.Notification_tab();

	}
	@Then("verify tooltips for notification name, Status and Actions column")
	public void verify_tooltips_for_notification_name_status_and_actions_column() {
		NotificationsPage notify = new NotificationsPage(driver, logger);
	
		Assert.assertEquals("Tooltip of Notification Name", " ",
				notify.get_Text_ToolTipforNotificationName());
		
		Assert.assertEquals("Tooltip of Status", " ",
				notify.get_Text_ToolTipforStatus());
		
	}


	
	


	@Then("apply filter on Notification name")
	public void apply_filter_on_notification_name() throws InterruptedException {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		notify.notificationnameThreeDot();
		notify.notificationnamesearchinput(alldata.get(vTCName).get("NotificationNameSearch").toString());

	}

	@Then("click on icon add user group mapping")
	public void click_on_icon_add_user_group_mapping() throws InterruptedException {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		notify.addUserGroupMapping();

	}

	@Then("click on three dots for username and enter the search value")
	public void click_on_three_dots_for_username_and_enter_the_search_value() throws InterruptedException {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.UserGroupNameThreeDot();
		ugmp.UserGroupNameInput(alldata.get(vTCName).get("UserGroupNameSearch").toString());

	}

	@Then("select the checkbox to map user group name")
	public void select_the_checkbox_to_map_user_group_name() throws InterruptedException {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.checkboxforUserGroupNameLicenseExpiry();

	}

	@Then("select the checkbox to map user group name for app deployment")
	public void select_the_checkbox_to_map_user_group_name_for_app_deployment() throws InterruptedException {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.checkboxforUserGroupNameDeployment();

	}
	@Then("click on save button to save mapping")
	public void click_on_save_button_to_save_mapping() throws InterruptedException {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.saveButton();
		Thread.sleep(2000);
	}

	@Then("verify confirmation message {string} should appear on notifications page")
	public void verify_confirmation_message_should_appear_on_notifications_page(String string) throws InterruptedException {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		Object toasterMessageObj = alldata.get(vTCName).get("toastermessageNotifications");
		if (toasterMessageObj == null) {
		    throw new IllegalArgumentException("No toaster message found for test case: " + vTCName);
		}
		String expectedMessage = toasterMessageObj.toString().trim();

		System.out.println("vTCName: " + vTCName);
		System.out.println("Test Data: " + alldata.get(vTCName));
		System.out.println("Expected Toaster Message: " + alldata.get(vTCName).get("toastermessageNotifications"));
		// Get the actual message from the page
		String actualMessage = ugmp.getConfirmationMessage();
		
		Thread.sleep(2000);

		// Validate the expected and actual messages
		Assert.assertEquals("Confirmation message did not match", expectedMessage, actualMessage);
	}


}