package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class GeneralPage extends CommonActions {

	public GeneralPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}




	@FindBy(xpath = "//a[@id='nav-application-tab']")
	WebElement generalTabClick;

	@FindBy(xpath = "//div[@class='example-toolbar sticky']/div/div/div/p/img")
	WebElement expandtoggle;


	public void generalTab() {
		clickElement(generalTabClick, "");
	//generalTabClick.click();

	}

	public void expandtoggle() {
		clickElement(expandtoggle,"");
	}
	@FindBy(xpath = "//mat-select[@id='mat-select-0']")
	WebElement nonconstraint;

	@FindBy(xpath = "//mat-select[@placeholder='Dashboard']")
	WebElement dashboardDefault;

	public void dashboardDefault(String value) throws InterruptedException {

		SelectMatOption(dashboardDefault, value);
	}
	@FindBy(xpath = "//mat-select[@placeholder='Dashboard']")
	WebElement customDefault;
	public void customDefault(String value) throws InterruptedException {

		SelectMatOption(customDefault, value);
	}

	public void nonConstraint(String value) throws InterruptedException {

		SelectMatOption(nonconstraint, value);
	}

	@FindBy(xpath = "//input[@formcontrolname='HOST']")
	WebElement smtpInput;

	@FindBy(xpath = "/html/body/div[3]/div/div/mat-tooltip-component/div")
	WebElement smtpInputToolTip;

	@FindBy(xpath = "//input[@formcontrolname='HOST']")
	WebElement smtpInputPassword;

	@FindBy(xpath = "/html/body/div[3]/div/div/mat-tooltip-component/div")
	WebElement smtpInputPasswordToolTip;

	public String get_Text_ToolTipSMTP() {
		mouseHover(smtpInput);

		String smtpInputToolTipText = smtpInputToolTip.getText();

		smtpInputToolTipText.trim();

		return smtpInputToolTipText;
	}

	@FindBy(xpath = "//input[@formcontrolname='PASSWORD']")
	WebElement smtpPassword;

	@FindBy(xpath = "/html/body/div[3]/div/div/mat-tooltip-component/div")
	WebElement smtpPasswordToolTip;

	public String get_Text_ToolTipSMTPassword() {
		mouseHover(smtpPassword);

		String smtpPasswordToolTipText = smtpPasswordToolTip.getText();

		smtpPasswordToolTipText.trim();

		return smtpPasswordToolTipText;
	}

	@FindBy(xpath = "//input[@formcontrolname='EXPIRY']")
	WebElement smtpPasswordRefreshPolicy;

	@FindBy(xpath = "//div[@class='mat-tooltip mat-tooltip-show']")
	WebElement smtpPasswordRefreshPolicyToolTip;


	public String get_Text_ToolTipValidityRefreshPolicy() {
		mouseHover(smtpPasswordRefreshPolicy);

		String smtpPasswordRefreshPolicyToolTipText = smtpPasswordRefreshPolicyToolTip.getText();

		smtpPasswordRefreshPolicyToolTipText.trim();

		return smtpPasswordRefreshPolicyToolTipText;

	}

	@FindBy(xpath = "//input[@formcontrolname='USER']")
	WebElement smtpUser;

	@FindBy(xpath = "//div[@class='mat-tooltip mat-tooltip-show']")
	WebElement smtpUserToolTip;
	public String get_Text_ToolTipSMTUser() {
		mouseHover(smtpUser);
		String smtpUserToolTipText = smtpUserToolTip.getText();

		smtpUserToolTipText.trim();

		return smtpUserToolTipText;
	}
	@FindBy(xpath = "//input[@formcontrolname='REPOSITORY']")
	WebElement smtpRepository;

	@FindBy(xpath = "//div[@class='mat-tooltip mat-tooltip-show']")
	WebElement smtpRepositoryToolTip;
	public String get_Text_ToolTipSMTPRepository() {
		mouseHover(smtpRepository);
		String smtpRepositoryToolTipText = smtpRepositoryToolTip.getText();

		smtpRepositoryToolTipText.trim();

		return smtpRepositoryToolTipText;
	}
	@FindBy(xpath = "//input[@formcontrolname='PORT']")
	WebElement smtpPort;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-settingrefesh[1]/div[1]/div[2]/mat-nav-list[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement saveButton;


	@FindBy(xpath = "//div[@class='mat-tooltip mat-tooltip-show']")
	WebElement smtpPortToolTip;
	public String get_Text_ToolTipSMTPPort() {
		mouseHover(smtpPort);
		String smtpPortToolTipText = smtpPortToolTip.getText();

		smtpPortToolTipText.trim();

		return smtpPortToolTipText;
	}
	public void savebutton() {

		clickElement(saveButton, "");

	}
	@FindBy(xpath = "//input[@formcontrolname='USER']")
	WebElement userfield;



	@FindBy(xpath = "//div[@class='mat-tooltip mat-tooltip-show']")
	WebElement userToolTip;
	public String get_Text_ToolTipSMTPUserTextField() {
		mouseHover(userfield);
		String userToolTipText = userToolTip.getText();

		userToolTipText.trim();

		return userToolTipText;
	}
	@FindBy(xpath = "//input[@formcontrolname='HOST']")
	WebElement host;



	@FindBy(xpath = "//div[@class='mat-tooltip mat-tooltip-show']")
	WebElement hostToolTip;
	public String get_Text_ToolTiphost() {
		mouseHover(host);
		String userToolTipText = hostToolTip.getText();

		userToolTipText.trim();

		return userToolTipText;
	}



}
