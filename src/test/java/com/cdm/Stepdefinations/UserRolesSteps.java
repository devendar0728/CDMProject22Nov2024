package com.cdm.StepDefinations;

import org.junit.Assert;

import com.cdm.pages.Edgegroupconfiguration;
import com.cdm.pages.UserGroupMappingPage;
import com.cdm.pages.UserRoleAddPage;
import com.cdm.pages.UserRoleEditPage;
import com.cdm.pages.UserRolePage;
import com.cdm.pages.UserRolePermission;
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
	@Then("user should see a {string} message on user Role page")
	public void user_should_see_a_message_on_user_role_page(String string) throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		Thread.sleep(3000);
				Object toasterMessageObj = alldata.get(vTCName).get("toastermessageForUserRoles");
				if (toasterMessageObj == null) {
				    throw new IllegalArgumentException("No toaster message found for test case: " + vTCName);
				}
				String expectedMessage = toasterMessageObj.toString().trim();
		 Thread.sleep(2000);
				
				// Get the actual message from the page
				String actualMessage = egc.getConfirmationMessage();

				// Validate the expected and actual messages
				Assert.assertEquals("Confirmation message did not match", expectedMessage, actualMessage);
	}

	@Then("user should see a {string} message on user Role page during edit")
	public void user_should_see_a_message_on_user_role_page_during_edit(String string) throws InterruptedException {
		Edgegroupconfiguration egc = new Edgegroupconfiguration(driver, logger);
		Thread.sleep(3000);
				Object toasterMessageObj = alldata.get(vTCName).get("toastermessageForUserRolesEdit");
				if (toasterMessageObj == null) {
				    throw new IllegalArgumentException("No toaster message found for test case: " + vTCName);
				}
				String expectedMessage = toasterMessageObj.toString().trim();
		 Thread.sleep(2000);
				
				// Get the actual message from the page
				String actualMessage = egc.getConfirmationMessage();

				// Validate the expected and actual messages
				Assert.assertEquals("Confirmation message did not match", expectedMessage, actualMessage);
	}

	@Then("user should see a {string} message on user Role page during permissions")
	public void user_should_see_a_message_on_user_role_page_during_permissions(String string) throws InterruptedException {
		UserRolePage urp = new UserRolePage(driver, logger);
		Thread.sleep(2000);			
		Object toasterMessageObj = alldata.get(vTCName).get("toastermessageForUserRolesPermissiononRoleBased");
				if (toasterMessageObj == null) {
				    throw new IllegalArgumentException("No toaster message found for test case: " + vTCName);
				}
				String expectedMessage = toasterMessageObj.toString().trim();
	
				
				// Get the actual message from the page
				String actualMessage = urp.getConfirmationMessage();

				// Validate the expected and actual messages
				Assert.assertEquals("Confirmation message did not match", expectedMessage, actualMessage);
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
	public void click_on_three_dots_for_permission_and_enter_the_value_for_the_permission() throws InterruptedException {
		UserRolePermission urps = new UserRolePermission(driver, logger);
		urps.addpermissioncolumn();

		urps.permissionInput(alldata.get(vTCName).get("PermissionSearch"));

		
		urps.outerlayerclick();
		
		
		Thread.sleep(2000);
		
		urps.savebutton();
		Thread.sleep(2000);
		
		

	}

	@Then("click on Edit button to edit role")
	public void click_on_edit_button_to_edit_role() {
		UserRolePage urp = new UserRolePage(driver, logger);

		urp.editRoleButton();

	}

}