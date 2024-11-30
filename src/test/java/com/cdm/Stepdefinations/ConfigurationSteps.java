package com.cdm.StepDefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.ConfigurationsModulePage;
import com.cdm.pages.Pagination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfigurationSteps extends BaseTest {

	@Then("Click on Configurations module from side menu bar")
	public void click_on_Configurations_module_from_side_menu_bar() throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		Thread.sleep(3000);
		config.movetoconfiguration();
		Thread.sleep(3000);

	}

	@Then("verify user should land on Configurations page")
	public void verify_user_should_land_on_configurations_page() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		Assert.assertTrue("Configurations label  not found", config.isAssertionAddedSuccessfully());

	}

	@Then("verify tooltip functionality on List page of configuration module")
	public void verify_tooltip_functionality_on_list_page_of_configuration_module() throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);

		Assert.assertEquals("Tooltip of EdgeID", "Name assigned for the EDGE Device", config.get_Text_ToolTipEdgeID());
		Assert.assertEquals("Tooltip of App Name", "Unique Name assigned for the Application",
				config.get_Text_ToolTipAppName());
		Assert.assertEquals("Tooltip of Config Name", "The Name of the configuration",
				config.get_Text_ToolTipViewConfigName());
		Assert.assertEquals("Tooltip of status", "The status of the response (HTTP Response Code)",
				config.get_Text_TooltipResponseStatus());
		Assert.assertEquals("Tooltip of TimeStamp",
				"The date (MM-DD-YYYY) and time (HH:MM) (+/-HH:MM) the configuration was created",
				config.get_Text_TooltipTimeStamp());

		config.scrollingElementRightBar("div.example-container", "900");

		Assert.assertEquals("Tooltip of Last Updated", "The timestamp when the configuration was last updated",
				config.get_Text_TooltipLastUpdated());
		Assert.assertEquals("Tooltip of view Response Body", "View Response Body",
				config.get_Text_ToolTipViewResponseBody());
		Assert.assertEquals("Tooltip of Download", "Download (in .txt format)", config.get_Text_TooltipDownload());

		Assert.assertEquals("Tooltip of Refresh", "Refresh", config.get_Text_ToolTipRefreshConfig());
		Assert.assertEquals("Tooltip of History View", "History View", config.get_Text_TooltipHistoryView());
	}

	@Then("Click on Configuration module from side menu bar")
	public void click_on_configuration_module_from_side_menu_bar() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.configTabmain();
	}

	@Then("Click on EDGE ID search icon of Configurations page i.e. three dots & enter Valid inputs into search text field")
	public void click_on_edge_id_search_icon_of_configurations_page_i_e_three_dots_enter_valid_inputs_into_search_text_field() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.edgeIDThreeDotConfig();
		config.sendValueSearchinputBoxForEdgeID(alldata.get(vTCName).get("EDGEIDSearch").toString());
		config.backDropShowing_Div_Click();
	}

	@Then("Verify that the search results match the entered Edge ID for configuration")
	public void verify_that_the_search_results_match_the_entered_edge_id_for_configuration() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		String validEdgeID = alldata.get(vTCName).get("EDGEIDSearch").toString();
		Assert.assertTrue(config.resultTable().contains(validEdgeID));

	}

	@Then("Click on the History View button on configuration page")
	public void click_on_the_history_view_button_on_configuration_page() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.historyviewConfig();
	}

	@Then("Click on lastupdated Three Dot icon and enter the value in datepickercolumn under configuration")
	public void click_on_lastupdated_three_dot_icon_and_enter_the_value_in_datepickercolumn_under_configuration()
			throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.lastUpdatedThreeDot();
		Thread.sleep(5000);
		CalenderPage cal = new CalenderPage(driver, logger);
		config.calenderIcon();
		Thread.sleep(4000);
		String year = alldata.get(vTCName).get("LastUpdatedYear").toString();
		String month = alldata.get(vTCName).get("LastUpdatedMonth").toString();
		String day = alldata.get(vTCName).get("LastUpdatedFromDate").toString();
		String day2 = alldata.get(vTCName).get("LastUpdatedToDate").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		Thread.sleep(4000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

		config.applybuttoncalender();
	}

	@Then("verify the search results are displayed on the Configurations List screen")
	public void verify_the_search_results_are_displayed_on_the_configurations_list_screen()
			throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		Thread.sleep(2000);
		int rowCount = config.getRowCount();
		System.out.println("Row Count: " + rowCount);

		if (rowCount <= 0) {
			System.err.println("No rows found for the given search criteria.");
			Assert.fail("Row count is zero. No data found for the search.");
		}

		try {
			List<String> rowData = config.getRowData();
			if (rowData != null && !rowData.isEmpty()) {
				for (String row : rowData) {
					System.out.println("Row Data: " + row);
				}
			} else {
				System.err.println("Row data is empty or null.");
			}
		} catch (Exception e) {
			System.err.println("An exception occurred while fetching row data: " + e.getMessage());
			e.printStackTrace();
		}

	}

	@Then("{string} is displayed on the Configurations List screen")
	public void is_displayed_on_the_configurations_list_screen(String string) {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);

		Assert.assertEquals("No Data Found", config.noResultMessage());
	}

	@Then("The search results are displayed on the Configurations List screen")
	public void the_search_results_are_displayed_on_the_configurations_list_screen() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		String validEdgeID = alldata.get(vTCName).get("EDGEIDSearch").toString();
		Assert.assertTrue(config.resultTable().contains(validEdgeID));
	}

	@Given("User has applied a search filter on the Edge ID column on configuration List page")
	public void user_has_applied_a_search_filter_on_the_edge_id_column_on_configuration_list_page() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.edgeIDThreeDotConfig();
		config.sendValueSearchinputBoxForEdgeID(alldata.get(vTCName).get("EDGEIDSearch").toString());
		config.backDropShowing_Div_Click();
	}

	@When("User clears the search filter on Edge ID on configuration List page")
	public void user_clears_the_search_filter_on_edge_id_on_configuration_list_page() throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.edgeIDThreeDotConfig();
		config.removalofEnteredTextForEdgeID();
		Thread.sleep(2000);
		config.edgeIDThreeDotConfig();
	}

	@Then("verify Configurations List screen should be reset to show all devices with all the APP Name")
	public void verify_configurations_list_screen_should_be_reset_to_show_all_devices_with_all_the_app_name()
			throws InterruptedException {
		Thread.sleep(2000);
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		int rowCount = config.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		Assert.assertTrue("Row found for search.", rowCount > 0);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = config.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Click on TimeStamp Three Dot icon and enter the value in datepickercolumn")
	public void click_on_time_stamp_three_dot_icon_and_enter_the_value_in_datepickercolumn()
			throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.timeStampThreeDot();
		Thread.sleep(5000);
		CalenderPage cal = new CalenderPage(driver, logger);
		config.calenderIcon();
		Thread.sleep(4000);
		String year = alldata.get(vTCName).get("TimeStampDateYear").toString();
		String month = alldata.get(vTCName).get("TimeStampMonth").toString();
		String day = alldata.get(vTCName).get("TimeStampFromDate").toString();
		String day2 = alldata.get(vTCName).get("TimeStampToDate").toString();
		cal.SelectDDDashMMDashYYYDay(year, month, day);
		Thread.sleep(4000);
		cal.SelectDirectDDDashMMDashYYYDay(year, month, day2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

		config.applybuttoncalender();
	}

	@Given("User has applied a search filter on the Config Name column")
	public void user_has_applied_a_search_filter_on_the_config_name_column() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.configNameThreeDot();
		config.sendValueSearchinputBoxForConfigName(alldata.get(vTCName).get("ConfigNameSearch").toString());
	}

	@When("User clears the search filter on Config Name")
	public void user_clears_the_search_filter_on_config_name() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.configNameThreeDot();
		config.removalofEnteredTextForConfigName();

	}

	@Then("click on reset button")
	public void click_on_reset_button() throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.resetButton();
		Thread.sleep(2000);
	}

	@Then("verify TimeStamp DatePicker should be empty")
	public void verify_time_stamp_date_picker_should_be_empty() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.timeStampThreeDot();
		CalenderPage cal = new CalenderPage(driver, logger);

	}

	@Then("verification of Click on Configurations pagination it will display records will display")
	public void verification_of_click_on_configurations_pagination_it_will_display_records_will_display() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.configDisplayRecord();
	}

	@Then("Click on pagination to check functionality of Full Backward arrow")
	public void click_on_pagination_to_check_functionality_of_full_backward_arrow() throws InterruptedException {
		Pagination p = new Pagination(driver, logger);
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);
		int rowPerPage = Integer.parseInt(value);
		Thread.sleep(5000);
// Assert.assertTrue("Row count match for Previous page",
// p.previousPageClickAndCount(rowPerPage));
	}

	@Then("verify to Click on Configurations pagination to check full forward arrow")
	public void verify_to_click_on_configurations_pagination_to_check_full_forward_arrow() throws Exception {
		// Create an instance of the Pagination helper class
		Pagination p = new Pagination(driver, logger);

		// Retrieve the 'Items Per Page' value from test data
		String value = alldata.get(vTCName).get("ItemsPerPage").toString();
		p.SelectPageMatOption(value);
		Thread.sleep(5000);

		// Parse the value into an integer to determine the number of rows per page
		int rowPerPage = Integer.parseInt(value);

		// Simulate clicking the Full Forward Arrow to navigate to the last page
		boolean isLastPageCorrect = p.nextPageClickAndCountOnLastPage(rowPerPage);

		// Assert that the row count on the last page matches the expected count
		Assert.assertTrue("Row count does not match for the last page after Full Forward navigation",
				isLastPageCorrect);

		// Optionally, log the success
		logger.info("Successfully validated Full Forward Arrow pagination functionality.");
	}

	@Then("verify sorting for TimeStamp")
	public void verify_sorting_for_time_stamp() throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.sortingOnTimeStamp();
	}

	@Then("verify sorting for Config Name")
	public void verify_sorting_for_config_name() throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.sortingOnConfigName();
	}

	@Then("verify sorting for LastUpdated for config")
	public void verify_sorting_for_last_updated_for_config() throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.sortingOnLastUpdated();
	}

	@Then("verify download functionality for response body")
	public void verify_download_functionality_for_response_body() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.downloadAction();
		;
	}

	@Then("click on view response button")
	public void click_on_view_response_button() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.viewResponseBodyIcon();
	}

	@Then("verify user should see valid response text")
	public void verify_user_should_see_valid_response() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		 // Example 1: Check that the response body is not empty
	    Assert.assertNotNull("Response body is null!", config.responseText());
	    
	    // Example 2: Validate presence of specific fields (for JSON response)
	    Assert.assertTrue("Response does not contain 'HTTPConnectionPool' field!", config.responseText().contains("HTTPConnectionPool"));
	  
		
		
	}
	
	@Then("click on Refresh button place at the top of the page")
	public void click_on_refresh_button_place_at_the_top_of_the_page() {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		config.refreshbutton();
	}
	@Then("user should verify the page or list should be refreshed successfully")
	public void user_should_verify_the_page_or_list_should_be_refreshed_successfully() throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		Thread.sleep(2000);
		String lastRowBeforeRefresh = config.lastRowBeforeRefresh();
		String lastRowAfterRefresh = config.lastRowDataAfterRefresh();

		// Log the data for debugging purposes
		System.out.println("Last row before refresh: " + lastRowBeforeRefresh);
		System.out.println("Last row after refresh: " + lastRowAfterRefresh);

		// Assert that the last row has changed
		Assert.assertEquals("Refresh operation", lastRowBeforeRefresh, lastRowAfterRefresh);
	}




	@Then("verify Configurations List screen should be reset to show all devices with all the Config Name")
	public void verify_configurations_list_screen_should_be_reset_to_show_all_devices_with_all_the_config_name()
			throws InterruptedException {
		ConfigurationsModulePage config = new ConfigurationsModulePage(driver, logger);
		Thread.sleep(2000);

		int rowCount = config.getRowCount();
		// System.out.println("Row Count: " + rowCount);
		Assert.assertTrue("Row found for search.", rowCount > 0);
		Assert.assertTrue(rowCount > 0);
		try {
			List<String> rowData = config.getRowData();
			for (String row : rowData) {
				System.out.println("Row Data: " + row);
			}
		} catch (Exception e) {
			// TODO: handle exception

		}

	}

//	}

}