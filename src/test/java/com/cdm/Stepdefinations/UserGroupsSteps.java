package com.cdm.Stepdefinations;

import com.cdm.pages.MappinguserListPage;
import com.cdm.pages.UserGroupEditPage;
import com.cdm.pages.UserGroupMappingPage;
import com.cdm.pages.UserGroupsAddPage;
import com.cdm.pages.UserGroupsPage;

import io.cucumber.java.en.Then;

public class UserGroupsSteps extends BaseTest {

	@Then("Click on Users Groups Tab from right panel of the screen")

	public void click_on_users_groups_tab_from_right_panel_of_the_screen() throws InterruptedException {
		UserGroupsAddPage uga = new UserGroupsAddPage(driver, logger);
		uga.UserGroupstab();


	}

	@Then("click on add button to add user group")
	public void click_on_add_button_to_add_user_group() throws InterruptedException {
		UserGroupsAddPage uga = new UserGroupsAddPage(driver, logger);
		uga.addbuttonicon();

		uga.inputUserGroup(alldata.get(vTCName).get("UserGroupNameAdd").toString());

		uga.saveusergroups();
	}

	@Then("click on Edit button to edit user group")
	public void click_on_edit_button_to_edit_user_group() throws Exception {
		UserGroupEditPage ugep = new UserGroupEditPage(driver, logger);
		ugep.usergroupEditicon();


	}
	@Then("click on three dots for user group and serach for user group")
	public void click_on_three_dots_for_user_group_and_serach_for_user_group() {
		UserGroupsAddPage uga = new UserGroupsAddPage(driver, logger);
		uga.usergroupThreeDot();
		uga.searchUserGroup(alldata.get(vTCName).get("UserGroupNameSearch").toString());

		//uga.backDropShowing_Div_Click();
		uga.outerlayerclick();
	}
	@Then("observe that a User Groups that is chosen for deleting and when Cancelled to do so, it does not get deleted and exists in the User Groups list")
	public void observe_that_a_user_groups_that_is_chosen_for_deleting_and_when_cancelled_to_do_so_it_does_not_get_deleted_and_exists_in_the_user_groups_list()
			throws InterruptedException {
		UserGroupsAddPage uga = new UserGroupsAddPage(driver, logger);
		uga.deletebuttonicon();

		uga.confirmationNoButton();

	}

	@Then("click on add users icon")
	public void click_on_add_users_icon() {
		UserGroupsPage ugp = new UserGroupsPage(driver, logger);
		ugp.addusericon();
	}

	@Then("Click on three dots of user group name and enter the value for user groups")
	public void click_on_three_dots_of_user_group_name_and_enter_the_value_for_user_groups()
			throws InterruptedException {
		UserGroupsPage ugp = new UserGroupsPage(driver, logger);
		ugp.usergroupThreeDot();

		ugp.searchUserGroup(alldata.get(vTCName).get("UserGroupNameSearch").toString());
       ugp.backDropShowing_Div_Click();

         ugp.outerlayerclick();

	}

	@Then("click on cancel button to return back of user group list page")
	public void click_on_cancel_button_to_return_back_of_user_group_list_page() throws InterruptedException {
		UserGroupEditPage ugep = new UserGroupEditPage(driver, logger);
		ugep.cancelbutton();

	}

	@Then("Select the Active users by choosing users depending on wish to map")
	public void select_the_active_users_by_choosing_users_depending_on_wish_to_map() throws InterruptedException {
		MappinguserListPage mulp = new MappinguserListPage(driver, logger);
		mulp.firstnameThreeDot();

		mulp.firstnameSearch(alldata.get(vTCName).get("FirstNameSearch").toString());
		mulp.backDropShowing_Div_Click();

		mulp.checkboxAddUsers();


	}

	@Then("select status inactive")
	public void select_status_inactive() throws InterruptedException {
		UserGroupsPage ugp = new UserGroupsPage(driver, logger);
		ugp.statusColumn();
		ugp.activeStatus();

		ugp.inactiveStatus();

		// ugp.headingtitle();

	}

	@Then("the checkbox should be disabled")
	public void the_checkbox_should_be_disabled() {
		MappinguserListPage mulp = new MappinguserListPage(driver, logger);
		mulp.verifycheckboxdisabled();

	}

	@Then("click on cancel button to cancel map")
	public void click_on_cancel_button_to_cancel_map() throws InterruptedException {
		MappinguserListPage mulp = new MappinguserListPage(driver, logger);
		mulp.cancelbuttonmap();

	}

	@Then("update the value for usergroup and click on save button")
	public void update_the_value_for_usergroup_and_click_on_save_button() throws InterruptedException {
		UserGroupEditPage ugep = new UserGroupEditPage(driver, logger);
		ugep.removalofEnteredTextForUserGroups();
		ugep.usergroupnameedit(alldata.get(vTCName).get("UserGroupNameEdit").toString());

		ugep.saveButtonAdd();
	}

	@Then("click on three dots for user group and search for user group")
	public void click_on_three_dots_for_user_group_and_search_for_user_group() throws InterruptedException {
		UserGroupsAddPage uga = new UserGroupsAddPage(driver, logger);
		uga.usergroupThreeDot();

		uga.searchUserGroup(alldata.get(vTCName).get("UserGroupNameSearch").toString());
		//uga.backDropShowing_Div_Click();
		uga.outerlayerclick();

		//uga.networkstatus();


	}

	@Then("click on Delete icon from actions column to delete user group name")
	public void click_on_delete_icon_from_actions_column_to_delete_user_group_name() throws InterruptedException {
		UserGroupsAddPage uga = new UserGroupsAddPage(driver, logger);
		uga.deletebuttonicon();

		//uga.confirmationYesButton();
	}

	@Then("Click on the Manage Mapping icon present against a User Group")
	public void click_on_the_manage_mapping_icon_present_against_a_user_group() {
		UserGroupsPage ugp = new UserGroupsPage(driver, logger);
		ugp.managemappingicon();

	}


	@Then("Select EDGE Devices to map with the User Group")
	public void select_edge_devices_to_map_with_the_user_group() {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.edgeDeviceTabforgroup();

	}

	@Then("Click on three dots of Edge name and enter the value for Edge Name")
	public void click_on_three_dots_of_edge_name_and_enter_the_value_for_edge_name() throws InterruptedException {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.edgenamethreedotgroup();

		ugmp.edgenamesearchmap(alldata.get(vTCName).get("EdgeNameSearch").toString());
		//ugmp.backDropShowing_Div_Click();
		ugmp.outerlayerclick();

		ugmp.headingclickElement();
	}

	@Then("select the Active Edge device by checking checkbox")
	public void select_the_active_edge_device_by_checking_checkbox() throws InterruptedException {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.checkboxManagemapping();

	}

	@Then("deselect the Active Edge device by checking checkbox")
	public void deselect_the_active_edge_device_by_checking_checkbox() {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.checkboxManagemapping();
	}

	@Then("Select EDGE Groups to map with the User Group")
	public void select_edge_groups_to_map_with_the_user_group() {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.edgeGroupsTabforgroup();
	}

	@Then("Click on three dots of Group Name and enter the value for Group Name")
	public void click_on_three_dots_of_group_name_and_enter_the_value_for_group_name() throws InterruptedException {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.UserGroupNameThreeDot();


		ugmp.groupnamesearchmap(alldata.get(vTCName).get("GroupNameSearch").toString());

	}

	@Then("select the Active Group Name by checking checkbox")
	public void select_the_active_group_name_by_checking_checkbox() {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.checkboxManagemapping();
	}

	@Then("deselect the Active Group Name by checking checkbox")
	public void deselect_the_active_group_name_by_checking_checkbox() throws InterruptedException {
		UserGroupMappingPage ugmp = new UserGroupMappingPage(driver, logger);
		ugmp.checkboxManagemapping();

	}

}
