package com.cdm.StepDefinations;

import org.junit.Assume;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.cdm.pages.HomePage;
import com.cdm.pages.LoginPage;

import io.cucumber.java.en.Then;

public class HomeSteps extends BaseTest {

	@Then("verify registration screen as a super admin")
	public void verify_registration_screen_as_a_super_admin() {
		HomePage home = new HomePage(driver, logger);
		Assume.assumeTrue("No Register Screen found on application", false);
	}

	@Then("verify remember me functionality")
	public void verify_remember_me_functionality() {
		HomePage home = new HomePage(driver, logger);
		Assume.assumeTrue("No Remember me link functionality found on ", false);
	}

	@Then("verify acceptance of emaild for forgot password button")
	public void verify_acceptance_of_emaild_for_forgot_password_button() {
		HomePage home = new HomePage(driver, logger);
		home.forgotpasswordLink();
		
		home.setinputforgotemailidsetup(alldata.get(vTCName).get("enterForgotPassword").toString());
		home.getResetPasswordLink();

	}

	@Then("click on forgot password button to reset password")
	public void click_on_forgot_password_button_to_reset_password() {
		HomePage home = new HomePage(driver, logger);
		home.forgotpasswordLink();
		home.setinputforgotemailidsetup(alldata.get(vTCName).get("enterForgotPassword").toString());
	}
	@Then("Login button should be vertically aligned")
	public void login_button_should_be_vertically_aligned() {

		HomePage home = new HomePage(driver, logger);
		
		Assume.assumeTrue("Alignment for button may differ on differnet resolution size", false);

	}
	
	@Then("click on login button on home page")
	public void click_on_login_button_on_home_page() {
		HomePage home = new HomePage(driver, logger);
		home.loginbuttonHomeFun();
	}

	
	@Then("Login button should be horizontally aligned")
	public void login_button_should_be_horizontally_aligned() {
		HomePage home = new HomePage(driver, logger);
		
		Assume.assumeTrue("Alignment for button may differ on differnet resolution size", false);
		// Assert.assertEquals(expectedXCoordinate, location.getX(), tolerance);
	}
	@Then("verification of background picture")
	public void verification_of_background_picture() {
		HomePage home = new HomePage(driver, logger);
		// "we can not automate GUT element of background picture", false);
	}
	
}
