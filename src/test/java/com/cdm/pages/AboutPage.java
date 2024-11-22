package com.cdm.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class AboutPage extends CommonActions {

	public AboutPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//a[contains(text(),'Terms and Conditions')]") // these all are locators
	WebElement termsandconditionsLink;

	@FindBy(xpath = "//*[@id= 'nav-repositories']/app-about/div[2]") // these all are locators
	WebElement versionText;

	@FindBy(tagName="title")
	WebElement titleElement;


	@FindBy(xpath ="//cr-icon-button[@id= 'print']")
	WebElement buttonclickprint;
	@FindBy(xpath = "//a[@id='nav-repositories-tab'][contains(text(),'About')]") // these all are locators
	WebElement AboutTab;

	@FindBy(xpath="//div[contains(text(),'ForeSite EDGE CDM Software Version')]")
	WebElement aboutTitle;

	public void aboutTab() {
		wait(AboutTab,logger);
		clickElement(AboutTab, "");
		//AboutTab.click();
	}

	public WebElement hasTitleElement() {
		// TODO Auto-generated method stub
		return aboutTitle;
	}
	public String verifyTitle() {
		if(aboutTitle==null) {
			return "";
		}

		//return aboutTitle.getText();

		return getText(aboutTitle);
	}

	public String versionText() {
	//	return versionText.getText();
		return getText(versionText);
	}

	public void verifyTitleColor(String expectedColor) {
        // Retrieve the stored color value from the context
        String actualColor = ScenarioContext.getContext("titleColor");

        assert actualColor.equalsIgnoreCase(expectedColor) :
                "Title color is not as expected. Actual: " + actualColor + ", Expected: " + expectedColor;
    }

	public void captureTitleColor() {
        // Capture the color of the title element

        String titleColor = titleElement.getCssValue("color");

        // Store the captured color value for later verification
        ScenarioContext.setContext("titleColor", titleColor);
    }

	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void termsandConditionClick() {
		termsandconditionsLink.click();
	}

	public void clickonprintbutton() {

		buttonclickprint.click();

	}

}

