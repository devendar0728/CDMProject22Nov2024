package com.cdm.StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cdm.pages.DashboardPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashboardSteps extends BaseTest {
	@Given("the user am on the dashboard page")
	public void the_user_am_on_the_dashboard_page() throws InterruptedException {
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
	@Then("verify total number of deployments that occurred in the last {int} hours")
	public void verify_total_number_of_deployments_that_occurred_in_the_last_hours(Integer int1) throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver, logger);
		
        Assert.assertNotNull("Deployments count is missing!", dp.deploymentsLast24HoursElement());
       
        Assert.assertFalse("Deployments count is empty!", dp.deploymentsLast24HoursCountElement());

        // Parse the count value (assuming it's a numeric string)
        int deploymentsCount = Integer.parseInt(dp.deploymentsLast24HoursElement());
        Assert.assertTrue("Deployments count should be non-negative!", deploymentsCount >= 0);

        // Log the count for visibility
        System.out.println("Total deployments in the last 24 hours: " + deploymentsCount);
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

}
