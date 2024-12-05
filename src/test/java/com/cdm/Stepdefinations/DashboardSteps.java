package com.cdm.StepDefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cdm.pages.DashboardPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps extends BaseTest {
	@Given("the user on the dashboard page")
	public void the_user_on_the_dashboard_page() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);

		Thread.sleep(3000);
	}

	@Then("verify total number of EDGE groups in CDM on card widget")
	public void verify_total_number_of_edge_groups_in_cdm_on_card_widget() {
		DashboardPage dp = new DashboardPage(driver, logger);
	}

	@Then("verify total number of EDGE Devices in CDM on card widget")
	public void verify_total_number_of_edge_devices_in_cdm_on_card_widget() {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("EDGE Devices count is missing!", dp.edgeDeviceCount());
		Assert.assertEquals("Total EDGE Devices", dp.edgeDeviceCount());

	}

	@Then("verify user should be redirected to the Active App Groups List page with both Active and Inactive staus")
	public void verify_user_should_be_redirected_to_the_active_app_groups_list_page_with_both_active_and_inactive_staus()
			throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.activeAppGroupImage();
		Thread.sleep(2000);
		Assert.assertTrue("Active status is not displayed", dp.activeStatus());

	}

	@Then("verify total number of deployments that occurred in the last {int} hours")
	public void verify_total_number_of_deployments_that_occurred_in_the_last_hours(Integer int1)
			throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Deployments count is missing!", dp.deploymentsLast24HoursElement());

		Assert.assertFalse("Deployments count is empty!", dp.deploymentsLast24HoursCountElement());

		// Parse the count value (assuming it's a numeric string)
		int deploymentsCountTwentyFourHours = Integer.parseInt(dp.deploymentsLast24HoursElement());
		Assert.assertTrue("Deployments count should be non-negative!", deploymentsCountTwentyFourHours >= 0);

		// Log the count for visibility
		System.out.println("Total deployments in the last 24 hours: " + deploymentsCountTwentyFourHours);
	}

	@Then("verify total number of deployments that occurred in the last {int} days for deployment")
	public void verify_total_number_of_deployments_that_occurred_in_the_last_days_for_deployment(Integer int1)
			throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Deployments count is missing!", dp.deploymentsLastSevenDaysElement());

		Assert.assertFalse("Deployments count is empty!", dp.deploymentsLastSevenDaysCountElement());

		// Parse the count value (assuming it's a numeric string)
		int deploymentsCountfor7Days = Integer.parseInt(dp.deploymentsLastSevenDaysElement());
		Assert.assertTrue("Deployments count should be non-negative!", deploymentsCountfor7Days >= 0);

		// Log the count for visibility
		System.out.println("Total deployments in the last 7 days: " + deploymentsCountfor7Days);
	}

	@Then("verify total number of ongoing deployments that occurred in the last {int} days")
	public void verify_total_number_of_ongoing_deployments_that_occurred_in_the_last_days(Integer int1)
			throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Ongoing count for last 7 days is missing!", dp.OngoingLastSevenDaysElement());

		Assert.assertFalse("Ongoing count for last 7 days   is empty!", dp.OngoingLastSevenDaysCountElement());

		// Parse the count value (assuming it's a numeric string)
		int ongoingCountfor7Days = Integer.parseInt(dp.OngoingLastSevenDaysElement());
		Assert.assertTrue("Ongoing count should be non-negative!", ongoingCountfor7Days >= 0);

		// Log the count for visibility
		System.out.println("Ongoing deployments in the last 7 days: " + ongoingCountfor7Days);
	}

	@Then("verify total number of successful deployments that occurred in the last {int} hours")
	public void verify_total_number_of_successful_deployments_that_occurred_in_the_last_hours(Integer int1)
			throws NumberFormatException, InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("successful count for last 24 hours is missing!",
				dp.successfulLastTwentyFourHoursElement());

		Assert.assertFalse("successful count for last 24 hours  is empty!",
				dp.successfulLastTwentyFourHoursElementCount());

		int successfulCountforTwentyFourHours = Integer.parseInt(dp.successfulLastTwentyFourHoursElement());
		Assert.assertTrue("successful count should be non-negative!", successfulCountforTwentyFourHours >= 0);

		// Log the count for visibility
		System.out.println("successful deployments in the last 24 Hours: " + successfulCountforTwentyFourHours);
	}

	@Then("verify total number of failed deployments that occurred in the last {int} hours")
	public void verify_total_number_of_failed_deployments_that_occurred_in_the_last_hours(Integer int1)
			throws NumberFormatException, InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Failed count is missing!", dp.FailedLastTwentyFourHoursElement());

		Assert.assertFalse("Failed count is empty!", dp.FailedLastTwentyFourHoursElementCount());

		// Parse the count value (assuming it's a numeric string)
		int FailedCountforTwentyFourHours = Integer.parseInt(dp.FailedLastTwentyFourHoursElement());
		Assert.assertTrue("Failed count should be non-negative!", FailedCountforTwentyFourHours >= 0);

		// Log the count for visibility
		System.out.println("Failed deployments in the last 24 hours: " + FailedCountforTwentyFourHours);
	}

	@Then("verify total number of deleted deployments that occurred in the last {int} hours")
	public void verify_total_number_of_deleted_deployments_that_occurred_in_the_last_hours(Integer int1)
			throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Deleted count is missing!", dp.DeletedLastTwentyFourHoursElement());

		Assert.assertFalse("Failed count is empty!", dp.DeletedLastTwentyFourHoursElementCount());

		// Parse the count value (assuming it's a numeric string)
		int deletedCountforTwentyFourHours = Integer.parseInt(dp.DeletedLastTwentyFourHoursElement());
		Assert.assertTrue("Failed count should be non-negative!", deletedCountforTwentyFourHours >= 0);

		// Log the count for visibility
		System.out.println("Failed deployments in the last 24 Hours" + deletedCountforTwentyFourHours);
	}

	@Then("verify total number of deleted deployments that occurred in the last {int} days")
	public void verify_total_number_of_deleted_deployments_that_occurred_in_the_last_days(Integer int1)
			throws NumberFormatException, InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("deleted count for last 7 days is missing!", dp.deletedLastSevenDaysElement());

		Assert.assertFalse("deleted count for last 7 days   is empty!", dp.deletedLastsevenDaysElementCount());

		// Parse the count value (assuming it's a numeric string)
		int deletedCountfor7Days = Integer.parseInt(dp.deletedLastSevenDaysElement());
		Assert.assertTrue("deleted count should be non-negative!", deletedCountfor7Days >= 0);

		// Log the count for visibility
		System.out.println("deleted deployments in the last 7 days: " + deletedCountfor7Days);
	}

	@Then("verify total number of successful deployments that occurred in the last {int} days")
	public void verify_total_number_of_successful_deployments_that_occurred_in_the_last_days(Integer int1)
			throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("successful count for last 7 days are missing!", dp.successfulLastSevenDaysElement());

		Assert.assertFalse("successful count for last 7 days are empty!", dp.successfulLastSevenDaysCount());

		int successfulCountforLastSevenDays = Integer.parseInt(dp.successfulLastSevenDaysElement());
		Assert.assertTrue("successful count should be non-negative!", successfulCountforLastSevenDays >= 0);

		// Log the count for visibility
		System.out.println("successful deployments in the last 7 days: " + successfulCountforLastSevenDays);
	}

	@Then("verify total number of failed deployments that occurred in the last {int} days")
	public void verify_total_number_of_failed_deployments_that_occurred_in_the_last_days(Integer int1)
			throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("failed count for last 7 days is missing!", dp.failedLastSevenDaysElement());

		Assert.assertFalse("failed count for last 7 days   is empty!", dp.failedLastSevenDaysCountElement());

		// Parse the count value (assuming it's a numeric string)
		int failedCountfor7Days = Integer.parseInt(dp.failedLastSevenDaysElement());
		Assert.assertTrue("Ongoing count should be non-negative!", failedCountfor7Days >= 0);

		// Log the count for visibility
		System.out.println("Ongoing deployments in the last 7 days: " + failedCountfor7Days);
	}

	@Then("verify total number of ongoing total deployments that occurred in the last {int} hours")
	public void verify_total_number_of_ongoing_total_deployments_that_occurred_in_the_last_hours(Integer int1)
			throws NumberFormatException, InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Ongoing count is missing!", dp.OngoingLastTwentyFourHoursElement());

		Assert.assertFalse("Ongoing count is empty!", dp.OngoingLastTwentyFourHoursElementCount());

		// Parse the count value (assuming it's a numeric string)
		int ongoingCountforTwentyFourHours = Integer.parseInt(dp.OngoingLastTwentyFourHoursElement());
		Assert.assertTrue("Deployments count should be non-negative!", ongoingCountforTwentyFourHours >= 0);

		// Log the count for visibility
		System.out.println("Ongoing deployments in the last 7 days: " + ongoingCountforTwentyFourHours);
	}

	@Then("verify total number of Active App Groups in CDM on card widget")
	public void verify_total_number_of_active_app_groups_in_cdm_on_card_widget() {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Active App Groups count is missing!", dp.activeAppGroupsCount());
		Assert.assertEquals("Active App Groups", dp.activeAppGroupsCount());
	}

	@Then("verify total number of Active Repositories in CDM on card widget")
	public void verify_total_number_of_active_repositories_in_cdm_on_card_widget() {

		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Active Repositories Devices count is missing!", dp.activeRepositoriesCount());
		Assert.assertEquals("Active Repositories", dp.activeRepositoriesCount());
	}

	@Then("verify total number of Active Edge Groups in CDM on card widget")
	public void verify_total_number_of_active_edge_groups_in_cdm_on_card_widget() {

		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Active Edge Groups count is missing!", dp.activeEdgeGroupsCount());
		Assert.assertEquals("Active EDGE Groups", dp.activeEdgeGroupsCount());
	}

	@Then("verify total number of Active Edge Devices in CDM on card widget")
	public void verify_total_number_of_active_edge_devices_in_cdm_on_card_widget() {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Active Edge Devices count is missing!", dp.activeEdgeDevicesCount());
		Assert.assertEquals("Active EDGE Devices", dp.activeEdgeDevicesCount());
	}

	@Then("verify total number of Active Applications in CDM on card widget")
	public void verify_total_number_of_active_applications_in_cdm_on_card_widget() {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Active Applications count is missing!", dp.activeApplicationsCount());
		Assert.assertEquals("Active Applications", dp.activeApplicationsCount());
	}

	@Then("verify total number of Active Volumes in CDM on card widget")
	public void verify_total_number_of_active_volumes_in_cdm_on_card_widget() {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertNotNull("Active Volumes count is missing!", dp.activeVolumesCount());
		Assert.assertEquals("Active Volumes", dp.activeVolumesCount());
	}

	@When("the user clicks on the {string} image")
	public void the_user_clicks_on_the_image(String string) throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.EdgeGroupImageClick();
		Thread.sleep(2000);

	}

	@When("the user clicks on the Total EDGE Devices image")
	public void the_user_clicks_on_the_total_edge_devices_image() throws InterruptedException {

		DashboardPage dp = new DashboardPage(driver, logger);
		dp.EdgeDevicesImageClick();
		Thread.sleep(2000);

	}

	@Then("the user should be redirected to the Edge Group List page")
	public void the_user_should_be_redirected_to_the_edge_group_list_page() {
		DashboardPage dp = new DashboardPage(driver, logger);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("Not redirected to the Edge Group List page", currentUrl.contains("controller"));
	}

	@When("verify the page should display both Active and Inactive status on Edge Device")
	public void verify_the_page_should_display_both_active_and_inactive_status_on_edge_device()
			throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		Thread.sleep(2000);
		Assert.assertTrue("Active status is not displayed", dp.activeStatus());
		Thread.sleep(2000);

	}

	@When("the user clicks on the Total EDGE Groups image")
	public void the_user_clicks_on_the_total_edge_groups_image() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		Thread.sleep(2000);
		dp.totalEdgeGroups();
		Thread.sleep(2000);
	}

	@When("verify the page should only shows Active group")
	public void verify_the_page_should_only_shows_active_group() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		Thread.sleep(2000);
		Assert.assertTrue("Active status is not displayed", dp.activeStatus());
	}

	@Then("verify the page should display both Active and Inactive status")
	public void verify_the_page_should_display_both_active_and_inactive_status() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		Thread.sleep(2000);
		Assert.assertTrue("Active status is not displayed", dp.activeStatus());
		Thread.sleep(2000);
	}

	@Then("verify user should be redirected to the Active Repositories List page when user click on the image of Active Repositories groups")
	public void verify_user_should_be_redirected_to_the_active_repositories_list_page_when_user_click_on_the_image_of_active_repositories_groups() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.activeRepositoriesImage();
	}

	@Then("verify user should be redirected to the Active Application List page")
	public void verify_user_should_be_redirected_to_the_active_application_list_page() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.activeApplicationImage();
		Thread.sleep(2000);
		Assert.assertTrue("Active status is not displayed", dp.activeStatus());
	}

	@Then("verify user should be redirected to the Active Volumes List page")
	public void verify_user_should_be_redirected_to_the_active_volumes_list_page() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.activeVolumeImage();
		Thread.sleep(2000);
		Assert.assertTrue("Active status is not displayed", dp.activeStatus());
	}

	@Then("verify user should see the Active Edge Devices")
	public void verify_user_should_see_the_active_edge_devices() throws InterruptedException {
		Thread.sleep(2000);
		DashboardPage dp = new DashboardPage(driver, logger);
		boolean countMatchesOnActiveEdgeDevice = dp.getCountTextOnActiveEdgeDevices();
		Assert.assertTrue("Count does not match. Expected: true, but got: " + countMatchesOnActiveEdgeDevice,
				countMatchesOnActiveEdgeDevice);
	}

	@Then("verify user should see the Active Applications")
	public void verify_user_should_see_the_active_applications() throws InterruptedException {
		Thread.sleep(2000);
		DashboardPage dp = new DashboardPage(driver, logger);
		boolean countMatchesOnActiveEdgeApplications = dp.getCountTextOnActiveApplications();
		Assert.assertTrue("Count does not match. Expected: true, but got: " + countMatchesOnActiveEdgeApplications,
				countMatchesOnActiveEdgeApplications);
	}

	@Then("verify user should see the Active Active Volumes")
	public void verify_user_should_see_the_active_active_volumes() throws InterruptedException {
		Thread.sleep(2000);
		DashboardPage dp = new DashboardPage(driver, logger);
		boolean countMatchesOnActiveVolumes = dp.getCountTextOnActiveVolumes();
		Assert.assertTrue("Count does not match. Expected: true, but got: " + countMatchesOnActiveVolumes,
				countMatchesOnActiveVolumes);
	}

	@Then("verify the {string} column should have {string} color")
	public void verify_the_column_should_have_color(String columnName, String expectedColour)
			throws InterruptedException {
		// Instantiate the DashboardPage
		DashboardPage dp = new DashboardPage(driver, logger);
		Thread.sleep(2000);
		// Locate the column element based on its name
		WebElement columnElement = dp.getColumnByName(columnName);
		Thread.sleep(2000);

		if (columnElement == null) {
			Assert.fail("Column with name '" + columnName + "' not found.");
		}

		// Get the CSS color value for the column
		String actualColor = columnElement.getCssValue("color"); // Or "color" if appropriate

		// Convert the expected color name to its corresponding RGBA or HEX value
		String expectedColorCode = dp.getColorCode(expectedColour);
		Thread.sleep(2000);
		if (expectedColorCode == null) {
			Assert.fail("Expected color '" + expectedColour + "' is not recognized.");
		}

		// Assert that the actual color matches the expected color
		Assert.assertEquals("Color for column '" + columnName + "' does not match!", expectedColorCode, actualColor);
	}

	@Then("verify user should see the Active App Groups")
	public void verify_user_should_see_the_active_app_groups() throws InterruptedException {
		Thread.sleep(2000);
		DashboardPage dp = new DashboardPage(driver, logger);
		boolean countMatchesOnActiveAppGroups = dp.getCountTextOnActiveAppGroups();
		Assert.assertTrue("Count does not match. Expected: true, but got: " + countMatchesOnActiveAppGroups,
				countMatchesOnActiveAppGroups);
	}

	@Then("verify user should see the Active Repositories")
	public void verify_user_should_see_the_active_repositories() throws InterruptedException {
		Thread.sleep(2000);
		DashboardPage dp = new DashboardPage(driver, logger);
		boolean countMatchesOnActiveRepositories = dp.getCountTextOnActiveRepositories();
		Assert.assertTrue("Count does not match. Expected: true, but got: " + countMatchesOnActiveRepositories,
				countMatchesOnActiveRepositories);
	}

	@Then("verify user should see the Active Edge Groups")
	public void verify_user_should_see_the_active_edge_groups() throws InterruptedException {
		Thread.sleep(2000);
		DashboardPage dp = new DashboardPage(driver, logger);
		boolean countMatchesOnActiveEdgeGroups = dp.getCountTextOnActiveEdgeGroups();
		Assert.assertTrue("Count does not match. Expected: true, but got: " + countMatchesOnActiveEdgeGroups,
				countMatchesOnActiveEdgeGroups);
	}

	@Then("verify user should be redirected to the Active Edge groups")
	public void verify_user_should_be_redirected_to_the_active_edge_groups() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.activeEdgeGroupsImage();
		Thread.sleep(2000);
		Assert.assertTrue("Active status is not displayed", dp.activeStatus());
	}

	@Then("verify user should be redirected to the Active Edge Devices")
	public void verify_user_should_be_redirected_to_the_active_edge_devices() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.activeEdgeDevicesImage();

	}

	@Then("verify user should see the total EDGE Devices count")
	public void verify_user_should_see_the_total_edge_devices_count() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		Thread.sleep(2000);
		boolean countMatchesOnEdgeDevices = dp.getCountTextOnTotalEdgeDevices();
		Assert.assertTrue("Count does not match. Expected: true, but got: " + countMatchesOnEdgeDevices,
				countMatchesOnEdgeDevices);
	}

	@Then("verify user should see the total EDGE groups count")
	public void verify_user_should_see_the_total_edge_groups_count() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		Thread.sleep(2000);
		boolean countMatches = dp.getCountTextOnTotalEdgeGroups();
		Assert.assertTrue("Count does not match. Expected: true, but got: " + countMatches, countMatches);
	}

	@Then("verify Deployment Report table should be printed on the console")
	public void verify_deployment_report_table_should_be_printed_on_the_console() {
		// Locate the Deployment Report table

		DashboardPage dp = new DashboardPage(driver, logger);
		dp.getDeploymentTableData();
		Assert.assertFalse("Deployment Report table content was not printed successfully!",
				dp.getDeploymentTableData());
	}

	@Then("verify License Report table table should be printed on the console")
	public void verify_license_report_table_table_should_be_printed_on_the_console() {
		DashboardPage dp = new DashboardPage(driver, logger);

		Assert.assertFalse("License Report table content was not printed successfully!", dp.getLicenseTableData());
	}

}
