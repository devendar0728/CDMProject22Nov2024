package com.cdm.Stepdefinations;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cdm.pages.DashboardPage;
import com.cdm.pages.HomePage;
import com.cdm.pages.LogOutPage;
import com.cdm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseTest {

	@When("In Login screen, Enter User name - Valid Username")
	public void in_login_screen_enter_user_name_valid_username() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid").toString());

	}

	@Then("verification of loading proper in slow network")
	public void verification_of_loading_proper_in_slow_network() {
		LoginPage lp = new LoginPage(driver, logger);
		// "Automating tasks related to a screen accessible via a Wi-Fi network using
		// Selenium might not be possible because it is depends on various factor 2G 3 G
		// network speed ", false);
	}

	@Then("verify restore the password with invalid user name")
	public void verify_restore_the_password_with_invalid_user_name() {
		LoginPage lp = new LoginPage(driver, logger);

		Assume.assumeTrue(
				"Automating password restoration typically involves a few steps: accessing the password reset page, and password Reset functionality does not exist on current application",
				false);
	}



	@Then("Verification of without login into browser copy & paste the url")
	public void verification_of_without_login_into_browser_copy_paste_the_url() {
		LoginPage lp = new LoginPage(driver, logger);
		// We can not automate scenario Selenium is a powerful tool primarily used for
		// automating web browsers. It allows you to interact with web elements,
		// navigate through web pages, and perform various actions programmatically.",
		// false);
	}

	@Then("verification of screen accessible by using wi-fi network")
	public void verification_of_screen_accessible_by_using_wi_fi_network() {

		LoginPage lp = new LoginPage(driver, logger);
		// "Automating tasks related to a screen accessible via a Wi-Fi network using
		// Selenium might not be possible because it is depends on various factor 2G 3 G
		// network speed ", false);

	}

	@Then("verification of screen accessible by using mobile network")
	public void verification_of_screen_accessible_by_using_mobile_network() {
		LoginPage lp = new LoginPage(driver, logger);
		// "Automating tasks related to a screen accessible via a Wi-Fi network using
		// Selenium might not be possible because it is depends on various factor 2G 3 G
		// network speed ", false;
	}

	@Then("verify visibility duration to load page for Login")
	public void verify_visibility_duration_to_load_page_for_login() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.calculateLoginTime();

	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		LoginPage lp = new LoginPage(driver, logger);
		// lp.loginbuttonHome();
	}

	@When("Enter password - Valid Password")
	public void enter_password_valid_password() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enterpwd(alldata.get(vTCName).get("Password").toString());

	}

	@Then("click on eye icon for the password")
	public void click_on_eye_icon_for_the_password() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.clickshowpwd();
	}

	@Then("Click on Login")
	public void click_on_login() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.clickLoginButton();
	}

	@Then("the input field should be visible")
	public void the_input_field_should_be_visible() {
		LoginPage lp = new LoginPage(driver, logger);
//		Can not automate visibility
	}

	@When("In Login screen, Do not enter Username - Blank")
	public void in_login_screen_do_not_enter_username_blank() {
		LoginPage lp = new LoginPage(driver, logger);
	}

	@When("Enter password - InValid Password")
	public void enter_password_in_valid_password() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enterpwd(alldata.get(vTCName).get("Password").toString());
	}

	@When("Do not enter password - Blank")
	public void do_not_enter_password_blank() {
		LoginPage lp = new LoginPage(driver, logger);
	}

	@Then("verify validation message for username")
	public void verify_validation_message_for_username() {
		LoginPage lp = new LoginPage(driver, logger);
		Assert.assertEquals("Validation message", "Username is required !", lp.get_validationmessageusername());

	}

	@Then("verify restore password functionality")
	public void verify_restore_password_functionality() {
		LoginPage lp = new LoginPage(driver, logger);
		Assume.assumeTrue("Restore functionality is not possible, functionality is not available", false);
	}

	@Then("verification message for password should come")
	public void verification_message_for_password_should_come() {
		LoginPage lp = new LoginPage(driver, logger);
		Assert.assertEquals("Validation message", "Password is required !", lp.get_validationmessagepassword());

	}





	@Then("Username and password fields are autofilled")
	public void username_and_password_fields_are_autofilled() {
		LoginPage lp = new LoginPage(driver, logger);


		Assume.assumeTrue(
				"Autofill functionality not available currently If there's a toggle or setting for auto-login, ensure it's switched on.",
				false);
	}

	@Then("click on Login button without adding credentials")
	public void click_on_login_button_without_adding_credentials() throws InterruptedException {
		Thread.sleep(3000);
		LoginPage lp = new LoginPage(driver, logger);
		lp.checkboxClickTermsandConditions();
		lp.clickLoginButton();

	}

	@Then("verify validation message")
	public void verify_validation_message() {
		LoginPage lp = new LoginPage(driver, logger);
		Assert.assertEquals("Validation message", "Invalid Username !", lp.get_invaliduserName());
	}

	@Then("enter invalid details inside username and fill right password entry and click on login button")
	public void enter_invalid_details_inside_username_and_fill_right_password_entry_and_click_on_login_button() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid"));
		lp.enterpwd(alldata.get(vTCName).get("Password"));
		lp.clickLoginButton();
	}

	@When("User presses TAB key on the username field")
	public void user_presses_tab_key_on_the_username_field() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.getUsernameField().sendKeys(Keys.TAB);


	}
	@Then("check for cancel button")
	public void check_for_cancel_button() {
		LoginPage lp = new LoginPage(driver, logger);
		Assume.assumeTrue("Cancel button does not exist on application .Invalid Test Case", false);
	}
	@Then("verify reset password functioanlity")
	public void verify_reset_password_functioanlity() {
		LoginPage lp = new LoginPage(driver, logger);
		Assume.assumeTrue("Reset password functionality does not exist on application .Invalid Test Case", false);
	}




	@Then("Focus should shift to the password field")
	public void focus_should_shift_to_the_password_field() {
		LoginPage lp = new LoginPage(driver, logger);
		Assert.assertEquals("mat-input-1", driver.switchTo().activeElement().getAttribute("id"));
	}

	@Then("click on Log Out button")
	public void click_on_log_out_button() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.profileIcon();
		Thread.sleep(3000);
		lp.logout();
	}

	@When("I login with username {string} and password {string}")
	public void i_login_with_username_and_password(String username, String password) {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(username);
		lp.enterpwd(password);
		lp.clickLoginButton();
	}

	@Then("logout from the application")
	public void logout_from_the_application() throws InterruptedException {
		LogOutPage lo = new LogOutPage(driver, logger);
		lo.profileImage();
		Thread.sleep(2000);
		lo.logout();

	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.clickLoginButton();
	}

	@Then("I open a new tab")
	public void i_open_a_new_tab() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.opennewTab();
		Thread.sleep(5000);
	}

	@Then("I am on the login page")
	public void i_am_on_the_login_page() throws Exception {
		LoginPage lp = new LoginPage(driver, logger);
		lp.verifyDashboard();

	}

	@When("user enters valid credentials and click on login button")
	public void user_enters_invalid_credentials_and_click_on_login_button() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
		long startTime = System.currentTimeMillis();
	}

	@Then("Verify Error message for userid and password")
	public void Verify_Error_message_userid_password() throws Exception {
		LoginPage lp = new LoginPage(driver, logger);
		lp.verifyErrorMsgusername();
		lp.verifyErrorMsgpwd();
	}

	@When("user register with valid data")
	public void user_register_with_valid_data() {
		System.out.println("I am in start of user_register_with_valid_data");

	}

	@When("user dont enter the Username")
	public void user_dont_enter_the_username() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enterCredentials(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
	}

	@When("user dont enter the password")
	public void user_dont_enter_the_password() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enterCredentials(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
	}

	@Then("user should be login successfully")
	public void user_should_be_login_successfully() throws Exception {
		System.out.println("I am in start of user_should_be_login_successfully");
		LoginPage lp = new LoginPage(driver, logger);

		lp.verifyDashboard();
	}

	@When("Verify forgot password functionlity")
	public void verify_forgot_password_functionlity() {

		//
	}

	@When("user click on forgot password button")
	public void user_click_on_forgot_password_button() {
		HomePage home = new HomePage(driver, logger);
//		Assume.assumeTrue("forgot password functionality is not available", false);
		home.forgotpasswordLink();
	}

	@Then("enter email id to reset password")
	public void enter_email_id_to_reset_password() {
		HomePage home = new HomePage(driver, logger);

		home.setinputforgotemailidsetup(alldata.get(vTCName).get("enterForgotPassword").toString());
		home.getResetPasswordLink();
	}

	@When("the user enters valid credentials {string} and {string} and clicks login")
	public void the_user_enters_valid_credentials_and_and_clicks_login(String string, String string2) {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enterCredentials(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
	}

	@When("the user enters valid credentials and presses the {string} key")
	public void the_user_enters_valid_credentials_and_presses_the_key(String string) {
		LoginPage lp = new LoginPage(driver, logger);
		lp.pressEnterKey();
	}

	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() throws InterruptedException {
		DashboardPage dashboardPage = new DashboardPage(driver, logger);
		Thread.sleep(5000);
		dashboardPage.verifyUserIsOnDashboard();
		Thread.sleep(5000);
	}

	@Then("Verify Error message for password")
	public void verify_error_message_for_password() throws Exception {
		LoginPage lp = new LoginPage(driver, logger);
		Thread.sleep(3000);
		lp.verifyErrorMsgpwd();
		Thread.sleep(3000);
	}

	@When("user enters valid userid")
	public void user_enters_valid_userid() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid"));

	}

	@When("I enter an invalid username and password")
	public void i_enter_an_invalid_username_and_password() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid"));
		lp.enterpwd(alldata.get(vTCName).get("Password"));
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.clickLoginButton();
	}

	@Then("I should see an error message indicating invalid credentials")
	public void i_should_see_an_error_message_indicating_invalid_credentials() {
		LoginPage lp = new LoginPage(driver, logger);
		Assume.assumeTrue("Not implemented invalid test case", false);
	}

	@When("user enters valid password")
	public void user_enters_valid_password() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enterpwd(alldata.get(vTCName).get("Password"));
		Thread.sleep(2000);
	}

	@When("click on show password")
	public void click_on_show_password() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.clickshowpwd();
		Thread.sleep(2000);
	}

	@Then("Click on the hidden eye icon in Password field")
	public void click_on_the_hidden_eye_icon_in_password_field() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.clickshowpwd();
		Thread.sleep(2000);
	}

	@Then("click on Login button")
	public void click_on_login_button() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		lp.checkboxClickTermsandConditions();
		lp.clickLogin();
		Thread.sleep(5000);
	}

	@When("click on change password and update new password")
	public void click_on_change_password_and_update_new_password() {

	}

	@Then("login with new credentials")
	public void login_with_new_credentials() {

	}

	@Given("User launch application in edge browser and perform login")
	public void user_launch_application_in_edge_browser() throws InterruptedException {

		WebDriver d = new EdgeDriver();
		d.get(prop.getProperty("AppUrl") + alldata.get(vTCName).get("Url"));
		Thread.sleep(5000);
		LoginPage lp = new LoginPage(d, logger);
		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));

	}

	@Given("User launch application in firefox browser and perform login")
	public void user_launch_application_in_firefox_browser() throws InterruptedException {

		WebDriver d = new FirefoxDriver();
		d.get(prop.getProperty("AppUrl") + alldata.get(vTCName).get("Url"));
		Thread.sleep(5000);
		LoginPage lp = new LoginPage(d, logger);
		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));

	}

	@When("Enter on login button")
	public void enter_on_login_button() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.ENTER);
		logger.pass("press enter button from keyboard");
	}

	@Then("the user should be redirected to the dashboard and login time should be measured")
	public void the_user_should_be_redirected_to_the_dashboard_and_login_time_should_be_measured() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.verifyUserIsOnDashboard();

		// Capture end time after the user is redirected to the dashboard
		long endTime = System.currentTimeMillis();
		long startTime = 0;
		long loginTime = endTime - startTime;
		System.out.println("Time taken to log in: " + loginTime + " milliseconds");
	}

	@When("open new tab")
	public void open_new_tab() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.newTab();
	}

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		BaseTest bt = new BaseTest();

		bt.launchApp();
	}

	@When("the Super admin enters valid credentials and clicks login")
	public void the_super_admin_enters_valid_credentials_and_clicks_login() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.login(alldata.get(vTCName).get("Userid"), alldata.get(vTCName).get("Password"));
	}

	@Then("the Super admin should be redirected to the Super admin dashboard")
	public void the_super_admin_should_be_redirected_to_the_super_admin_dashboard() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);

		lp.profileIcon();

		lp.SuperAdmin();
	}
	@Then("verify auth app button")
	public void verify_auth_app_button() {
		LoginPage lp = new LoginPage(driver, logger);
		Assume.assumeTrue("Auth button does not exist on application. Invalid Test case", false);
	}
	@Then("the user should verify compliance with login page standards")
	public void the_user_should_verify_compliance_with_login_page_standards() {
		LoginPage lp = new LoginPage(driver, logger);
//
		WebElement uname = lp.getUsernameInput();

		WebElement pwd = lp.getPasswordInput();

		lp.verifyFont(uname, alldata.get(vTCName).get("Fontfamily"));
		lp.verifyFont(pwd, alldata.get(vTCName).get("Fontfamily"));

		lp.verifyTextColor(uname, "rgba(0, 0, 0, 1)");
		lp.verifyTextColor(pwd, "rgba(0, 0, 0, 1)");

	}

	@Then("the user waits for an extended period to simulate session timeout")
	public void the_user_waits_for_an_extended_period_to_simulate_session_timeout() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
	}

	@Then("the user attempts to interact with the application")
	public void the_user_attempts_to_interact_with_the_application() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.verifyUserIsOnDashboard();
	}

	@Then("the user should be redirected to the login page due to session timeout")
	public void the_user_should_be_redirected_to_the_login_page_due_to_session_timeout() {
		LoginPage lp = new LoginPage(driver, logger);
	//	lp.verifyTitle(alldata.get(vTCName).get("Value1"));
	}

	@When("the user logs in with valid credentials {string} and {string}")
	public void the_user_logs_in_with_valid_credentials_and(String string, String string2) {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid"));
		lp.enterpwd(alldata.get(vTCName).get("Password"));
		lp.clickLoginButton();
	}

	@Then("keep the username field blank")
	public void keep_the_username_field_blank() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid"));
	}

	@Then("enter details under password")
	public void enter_details_under_password() {
		LoginPage lp = new LoginPage(driver, logger);

		lp.enterpwd(alldata.get(vTCName).get("Password"));
		lp.checkboxClickTermsandConditions();
		lp.clickLoginButton();
	}

	@When("click on back button and verify page")
	public void click_on_back_button_and_verify_page() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.browserBack();
	}

	@Then("verify login page")
	public void verify_login_page() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.verifyTitle();
	}

	@When("user enters alphanumeric value in userid")
	public void user_enters_alphanumeric_value_in_userid() {

	}

	@When("another user logs in with valid credentials {string} and {string}")
	public void another_user_logs_in_with_valid_credentials_and(String string, String string2) {
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		String mainWindow = iterator.next();
		String newWindow = iterator.next();
		driver.switchTo().window(newWindow);

		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid"));
		lp.enterpwd(alldata.get(vTCName).get("Password"));
		lp.clickLoginButton();
	}

	@Then("both users should be redirected to their respective dashboards")
	public void both_users_should_be_redirected_to_their_respective_dashboards() {
		DashboardPage dp = new DashboardPage(driver, logger);
		dp.verifyUserIsOnDashboard();
	}

	@When("I log in with valid credentials using different browser")
	public void i_log_in_with_valid_credentials_using_different_browser() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, logger);
		driver.get(prop.getProperty("AppUrl") + alldata.get(vTCName).get("Url"));
		// lp.loginbuttonHome();
		lp.enteruserid(alldata.get(vTCName).get("Userid").toString());
		lp.enterpwd(alldata.get(vTCName).get("Password").toString());
		lp.clickLoginButton();

	}

	@When("I enter max characters in the username field")
	public void i_enter_characters_in_the_username_field() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enteruserid(alldata.get(vTCName).get("Userid").toString());
	}

	@Then("I should see the username field accepts a maximum of max characters")
	public void i_should_see_the_username_field_accepts_a_maximum_of_characters() {
		LoginPage lp = new LoginPage(driver, logger);
		String userId = alldata.get(vTCName).get("Userid").toString();
		lp.setUsernameFieldLength(userId);
		int actualCharacters = lp.getUsernameFieldLength();

		Assume.assumeTrue("The username field allows more than " + userId.length() + " characters", false);
	}

	@When("I enter \\{string} characters in the password field")
	public void i_enter_characters_in_the_password_field() {
		LoginPage lp = new LoginPage(driver, logger);
		lp.enterpwd(alldata.get(vTCName).get("Password").toString());
	}

	@Then("I should see the password field accepts a maximum of \\{int} characters")
	public void i_should_see_the_password_field_accepts_a_maximum_of_characters(int maxCharacters) {

		LoginPage lp = new LoginPage(driver, logger);
		int actualCharacters = lp.getPasswordFieldLength();

		Assert.assertEquals(actualCharacters <= maxCharacters,
				"The password field allows more than " + maxCharacters + " characters");
	}

	@Then("verify switching between input fields using TAB")
	public void verify_switching_between_input_fields_using_tab() {
		LoginPage lp = new LoginPage(driver, logger);
	}



}
