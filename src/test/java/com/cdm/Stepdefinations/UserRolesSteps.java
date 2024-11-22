package com.cdm.Stepdefinations;

import org.junit.Assert;

import com.cdm.pages.UserGroupEditPage;
import com.cdm.pages.UserGroupsAddPage;
import com.cdm.pages.UserRoleAddPage;
import com.cdm.pages.UserRoleEditPage;
import com.cdm.pages.UserRolePage;
import com.cdm.pages.UserRolePermission;
import com.cdm.pages.UserSettingsAddPage;
import com.cdm.pages.UserSettingsEditPage;
import com.cdm.pages.UserSettingsPage;

import io.cucumber.java.en.Then;

public class UserRolesSteps extends BaseTest {

	@Then("Click on Users Roles Tab from right panel of the screen")
	public void click_on_users_roles_tab_from_right_panel_of_the_screen() {
		UserSettingsPage usp = new UserSettingsPage(driver, logger);
		usp.Users_Role();
	}

	@Then("apply filter on Role Name")
	public void apply_filter_on_role_name() throws InterruptedException {
		UserRolePage urp = new UserRolePage(driver, logger);
		urp.sendsearchRoleName(alldata.get(vTCName).get("RoleNameSearch"));
		urp.networkstatusclick();
	}

	@Then("click on add button to add role")
	public void click_on_add_button_to_add_role() throws Exception {

		UserRolePage urp = new UserRolePage(driver, logger);
		urp.addbuttonuserRole();

		UserRoleAddPage urap = new UserRoleAddPage(driver, logger);

		urap.inputaddrole(alldata.get(vTCName).get("RoleNameAdd").toString());
		
		urap.saveuserrole();
	}

	@Then("click on three dots for role name and search for role")
	public void click_on_three_dots_for_role_name_and_search_for_role() throws InterruptedException {
		UserRolePage urp = new UserRolePage(driver, logger);
		urp.searchRoleNameThreeDot();

		urp.sendsearchRoleName(alldata.get(vTCName).get("RoleNameSearch"));
		//urp.backDropShowing_Div_Click();
		urp.outerlayerclick();

	}

	@Then("update the value for role and click on save button")
	public void update_the_value_for_role_and_click_on_save_button() throws InterruptedException {
		UserRoleEditPage urep= new UserRoleEditPage(driver, logger);
		urep.removalofEnteredTextForUserRole();
		urep.roleNameinputEdit(alldata.get(vTCName).get("RoleNameUpdate"));
		urep.saveButtonAdd();
	}

	@Then("click on the icon of add permission")
	public void click_on_the_icon_of_add_permission() {
		UserRolePermission urps = new UserRolePermission(driver, logger);
		urps.addpermissionicon();
	}

	@Then("click on three dots for permission and enter the value for the permission")
	public void click_on_three_dots_for_permission_and_enter_the_value_for_the_permission() {
		UserRolePermission urps = new UserRolePermission(driver, logger);
		urps.addpermissioncolumn();

		urps.permissionInput(alldata.get(vTCName).get("PermissionSearch"));

		//urps.backDropShowing_Div_Click();
		urps.outerlayerclick();
		//urps.networkstatusclick();
		
		

	}

	@Then("click on Edit button to edit role")
	public void click_on_edit_button_to_edit_role() {
		UserRolePage urp = new UserRolePage(driver, logger);

		urp.editRoleButton();

	}

}
