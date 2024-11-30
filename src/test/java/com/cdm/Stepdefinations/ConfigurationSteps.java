package com.cdm.StepDefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cdm.pages.CalenderPage;
import com.cdm.pages.ConfigurationsModulePage;
import com.cdm.pages.DeploymentsmodulePage;

import io.cucumber.java.en.Then;

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
	public void click_on_lastupdated_three_dot_icon_and_enter_the_value_in_datepickercolumn_under_configuration() throws InterruptedException {
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

//	}

}