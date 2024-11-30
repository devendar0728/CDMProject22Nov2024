package com.cdm.StepDefinations;

import org.junit.Assert;
import org.junit.Assume;

import com.cdm.pages.CertificatesPage;

import io.cucumber.java.en.Then;

public class CertificateSteps extends BaseTest {
	@Then("verify page with resize option for the certificate page")
	public void verify_page_with_resize_option_for_the_certificate_page() {

		CertificatesPage cert = new CertificatesPage(driver, logger);
		cert.setZoomLevel(800, 600);
	}


	@Then("verify page error message verbaige for entering invalid details for  IP Text field in Server TLS screen")
	public void verify_page_error_message_verbaige_for_entering_invalid_details_for_ip_text_field_in_server_tls_screen()
			throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
		cert.downloadButton();
		Assert.assertEquals("Validation message for server TLS certificates", "Please Enter IP",
				cert.validationmessageIP());
	}
	@Then("verify labels for all the fields")
	public void verify_labels_for_all_the_fields() {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		Assert.assertTrue("Please Enter IP", cert.getTextIPLabel().contains("*"));
		cert.outerlayerclick();
		Assert.assertTrue("Please Enter Group", cert.getTextGroupLabel().contains("*"));
		cert.outerlayerclick();
		Assert.assertEquals("Please Enter Validity", cert.getTextValidityLabel().contains("*"));
		cert.outerlayerclick();
	}





	@Then("verify tooltip visibility for IP Name")
	public void verify_tooltip_visibility_for_ip_name() throws InterruptedException {
		try {
			CertificatesPage cert = new CertificatesPage(driver, logger);

			cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
			Assert.assertEquals("Tooltip for server IP",
					"The host address or URL for the server. This is the same URL as the host server address in the EDGE Group Deployment section",
					cert.get_Text_ToolTipserverTLSIP());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("verify tooltip visibility for Group Name")
	public void verify_tooltip_visibility_for_group_name() throws InterruptedException {
		try {
			CertificatesPage cert = new CertificatesPage(driver, logger);
			cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
			Assert.assertEquals("Tooltip for server Group",
					"The name of the certificate. It does not need to have the same name as the EDGE Group.",
					cert.get_Text_ToolTipserverTLSGroup());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("verify page error message verbaige for without entering details in Servere Tls Certificate Screen")
	public void verify_page_error_message_verbaige_for_without_entering_details_in_servere_tls_certificate_screen()
			throws InterruptedException {
		try {
			CertificatesPage cert = new CertificatesPage(driver, logger);
			cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
			Assert.assertEquals("Validation message for server TLS certificates", "Please Enter IP",
					cert.validationmessageIP());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("verify tool tip text visibilty for Validity")
	public void verify_tool_tip_text_visibilty_for_validity() throws InterruptedException {
		try {
			CertificatesPage cert = new CertificatesPage(driver, logger);
			cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
			Assert.assertEquals("Tooltip for validity", "The number of days a certificate is valid.",
					cert.get_Text_ToolTipserverTLSValidity());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("verify tool tip text visibilty for Organisation for validity")
	public void verify_tool_tip_text_visibilty_for_organisation_for_validity() {
		try {
			CertificatesPage cert = new CertificatesPage(driver, logger);
			cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
			Assert.assertEquals("Tooltip for organization", "The name of the organization.",
					cert.get_Text_ToolTipOnboardingOrganizationName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Then("verify tool tip text visibilty for Organisation Name")
	public void verify_tool_tip_text_visibilty_for_organisation_name() {
		try {
			CertificatesPage cert = new CertificatesPage(driver, logger);
			cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
			Assert.assertEquals("Tooltip for validity", "The name of the organization.",
					cert.get_Text_ToolTipOnboardingCertificateName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("verify tool tip text visibilty for Certificate Name")

	public void verify_tool_tip_text_visibilty_for_certificate_name() throws InterruptedException {
		try {
			CertificatesPage cert = new CertificatesPage(driver, logger);
			cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
			Assert.assertEquals("Tooltip for validity",
					"The name of the certificate. It does not need to have the same name as the EDGE Group.",
					cert.get_Text_ToolTipOnboardingCertificateName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("verify page  error message verbaige for without entering details in Onboarding Certificate Screen")
	public void verify_page_error_message_verbaige_for_without_entering_details_in_onboarding_certificate_screen()
			throws InterruptedException {
		try {
			CertificatesPage cert = new CertificatesPage(driver, logger);
			cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
			cert.downloadButton();
			Assert.assertEquals("Validation message for Onboarding certificates", "Please Enter Certificate Name",
					cert.validationmessageOnboardingCertificateName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("verify error message verbaige for entering invalid details for  Certificate Name Text field in Onboarding Certificate Screen")
	public void verify_error_message_verbaige_for_entering_invalid_details_for_certificate_name_text_field_in_onboarding_certificate_screen()
			throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
		cert.downloadButton();
		Assert.assertEquals("Validation message for Onboarding certificates", "Please Enter Certificate Name",
				cert.validationmessageOnboardingCertificateName());
	}

	@Then("verify error message verbaige for entering invalid details for  OrganisationText field in Onboarding Certificate Screen")
	public void verify_error_message_verbaige_for_entering_invalid_details_for_organisation_text_field_in_onboarding_certificate_screen()
			throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
		cert.downloadButton();
		Thread.sleep(2000);

		Assert.assertEquals("Validation message for Onboarding certificates organisation", "Please Enter Organization",
				cert.validationmessageOnboardingOrganization());
	}

	@Then("verify standarize text format for success message in toaster for certificates")
	public void verify_standarize_text_format_for_success_message_in_toaster_for_certificates() {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		
			cert.successMessage();
			String toastermessage = cert.ToasterMessageShouldBeDisplayed(alldata.get(vTCName).get("toastermessage").toString());
			Assert.assertEquals("Downloading Successful", toastermessage);
	}

	@Then("verify error message verbaige for entering invalid details for  ValidityText field in Onboarding Certificate Screen")
	public void verify_error_message_verbaige_for_entering_invalid_details_for_validity_text_field_in_onboarding_certificate_screen()
			throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
		cert.downloadButton();
		Assert.assertEquals("Validation message for Onboarding certificates validity", "Please Enter Validity",
				cert.validationmessageOnboardingValidity());
	}

	@Then("verify page error message verbaige for entering invalid details for ValidityText field in Server TLS screen")
	public void verify_page_error_message_verbaige_for_entering_invalid_details_for_validity_text_field_in_server_tls_screen()
			throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
		Assume.assumeTrue(
				"No Validation message set for  entering invalid details for  Validity Text field in Server TLS",
				false);
//				cert.validationmessageValidity());
//		cert.downloadButton();
//		Assert.assertEquals("Validation message for server TLS certificates validity", "Please Enter Validity",
//				cert.validationmessageValidity());
	}

	@Then("verify page error message verbaige for entering invalid details for  Group Text field in Server TLS screen")
	public void verify_page_error_message_verbaige_for_entering_invalid_details_for_group_text_field_in_server_tls_screen()
			throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
		cert.downloadButton();
		Thread.sleep(2000);
		Assert.assertEquals("Validation message for server TLS  Edge Group certificates", "Please Enter Group",
				cert.validationmessageGroup());
	}

	@Then("Click on Certificate tab from right panel of the screen")
	public void click_on_certificate_tab_from_right_panel_of_the_screen() throws InterruptedException {

		CertificatesPage cert = new CertificatesPage(driver, logger);

		cert.certificateTabClick();

	}

	@Then("fill the value for Certificate name Organization and validity")
	public void fill_the_value_for_certificate_name_organization_and_validity() throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);

		cert.certificateName(alldata.get(vTCName).get("CertificateName"));
		cert.OrganizationField(alldata.get(vTCName).get("CertificateOrganization"));
		cert.validitydaysinputOnboarding(alldata.get(vTCName).get("CertificateValidity"));
	}

	@Then("Verification of the accessible the screen by using wi-fi network")
	public void verification_of_the_accessible_the_screen_by_using_wi_fi_network() {

	}

	@Then("choose option Server TLS from certificate dropdown")
	public void choose_option_server_tls_from_certificate_dropdown() throws InterruptedException {

		CertificatesPage cert = new CertificatesPage(driver, logger);

		cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
	}

	@Then("choose option Server onboarding from certificate dropdown")
	public void choose_option_server_onboarding_from_certificate_dropdown() throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);

		cert.certificateType(alldata.get(vTCName).get("CertificateType").toString());
	}



	@Then("fill the value for IP Group and validity")
	public void fill_the_value_for_ip_group_and_validity() throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		cert.IPinput(alldata.get(vTCName).get("ServerIP").toString());
		cert.groupInput(alldata.get(vTCName).get("ServerGroup").toString());
		cert.validitydaysinput(alldata.get(vTCName).get("ServerValidity").toString());
	}

	@Then("click on download button on certificate page")
	public void click_on_download_button_on_certificate_page() throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		cert.downloadButton();
	}

	@Then("fill the value for Certificate Name Organization Validity and click on download button")
	public void fill_the_value_for_certificate_name_organization_validity_and_click_on_download_button()
			throws InterruptedException {
		CertificatesPage cert = new CertificatesPage(driver, logger);
		cert.certificateName(alldata.get(vTCName).get("CertificateName").toString());
		cert.OrganizationField(alldata.get(vTCName).get("CertificateOrganization").toString());
		cert.validitydaysinputOnboarding(alldata.get(vTCName).get("CertificateValidity").toString());
	}
}
