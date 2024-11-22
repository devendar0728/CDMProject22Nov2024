package com.cdm.Stepdefinations;

import org.junit.Assume;

import com.cdm.pages.NotificationsPage;

import com.cdm.pages.UserGroupMappingPage;

import io.cucumber.java.en.Then;

public class NotificationsSteps extends BaseTest {

	@Then("verify page with resize option page for notifications")
	public void verify_page_with_resize_option_page_for_notifications() throws InterruptedException {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		notify.setZoomLevel(800, 600);

	}

	@Then("check visibility of License Expiry")
	public void check_visibility_of_license_expiry() {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		notify.licenseExpiryVisibility();

	}

	@Then("Verify that the emails are not triggered to the User group when the CDM App is in Constraint environment")
	public void verify_that_the_emails_are_not_triggered_to_the_user_group_when_the_cdm_app_is_in_constraint_environment() {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		Assume.assumeTrue(
				"If you want to check whether an email is triggered in Selenium, you typically won't be interacting with the actual email service itself (e.g., Gmail, Outlook. Or anyother email provider because Selenium is primarily designed for browser automation.Selenium is not designed to interact with external services like email servers directly. Instead, it allows you to automate interactions with your web application's user interface. If you want to test email functionality then we need Email Grant permission from IT Team and this will cause Security Threaten issue",
				false);
	}

	@Then("observed that emails are not trigger to the User group which is not added to the App Deployment Notification Group")
	public void observed_that_emails_are_not_trigger_to_the_user_group_which_is_not_added_to_the_app_deployment_notification_group() {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		Assume.assumeTrue(
				"If you want to check whether an email is triggered in Selenium, you typically won't be interacting with the actual email service itself (e.g., Gmail, Outlook. Or anyother email provider because Selenium is primarily designed for browser automation.Selenium is not designed to interact with external services like email servers directly. Instead, it allows you to automate interactions with your web application's user interface. If you want to test email functionality then we need Email Grant permission from IT Team and this will cause Security Threaten issue",
				false);
	}

	@Then("Verify that the emails are not triggered to the User group which is not added to the License Expiry notification")
	public void verify_that_the_emails_are_not_triggered_to_the_user_group_which_is_not_added_to_the_license_expiry_notification() {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		Assume.assumeTrue(
				"If you want to check whether an email is triggered in Selenium, you typically won't be interacting with the actual email service itself (e.g., Gmail, Outlook. Or anyother email provider because Selenium is primarily designed for browser automation.Selenium is not designed to interact with external services like email servers directly. Instead, it allows you to automate interactions with your web application's user interface. If you want to test email functionality then we need Email Grant permission from IT Team and this will cause Security Threaten issue",
				false);
	}

	@Then("observer that emails are triggered")
	public void observer_that_emails_are_triggered() {
		NotificationsPage notify = new NotificationsPage(driver, logger);
		Assume.assumeTrue(
				"If you want to check whether an email is triggered in Selenium, you typically won't be interacting with the actual email service itself (e.g., Gmail, Outlook. Or anyother email provider because Selenium is primarily designed for browser automation.Selenium is not designed to interact with external services like email servers directly. Instead, it allows you to automate interactions with your web application's user interface. If you want to test email functionality then we need Email Grant permission from IT Team and this will cause Security Threaten issue",
				false);
	}

	@Then("Click on notifications tab from right panel of the screen")
	public void click_on_notifications_tab_from_right_panel_of_the_screen() throws InterruptedException {

		NotificationsPage notify = new NotificationsPage(driver, logger);
		notify.Notification_tab();

	}
	
	@Then("Verify that the License Expiry Notification functionality and observe that emails are triggered to all the roles in the selected user group of License Expiry")
	public void verify_that_the_license_expiry_notification_functionality_and_observe_that_emails_are_triggered_to_all_the_roles_in_the_selected_user_group_of_license_expiry() {
		Assume.assumeTrue(
				"If you want to check whether an email is triggered in Selenium, you typically won't be interacting with the actual email service itself (e.g., Gmail, Outlook. Or anyother email provider because Selenium is primarily designed for browser automation.Selenium is not designed to interact with external services like email servers directly. Instead, it allows you to automate interactions with your web application's user interface. If you want to test email functionality then we need Email Grant permission from IT Team and this will cause Security Threaten issue",
				false);
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

	

}