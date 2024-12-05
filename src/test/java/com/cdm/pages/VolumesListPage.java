package com.cdm.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class VolumesListPage extends CommonActions {

	public VolumesListPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id= 'toast-container']")

	WebElement toastcontainer;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[1]")
	WebElement editbutton;

	@FindBy(xpath = "//ul[@class='nav']/li[7]")
	WebElement volume_tab;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[2]")
	WebElement convertToApplication;
	
	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-setting[1]/div[1]/div[1]/div[1]/div[1]/app-volume[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement refreshbutton;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement VolumeNameThreeDot;
	
	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement architectureThreeDot;

	@FindBy(xpath = "//input[@name = 'volumename']")
	WebElement inputvolumenameSearch;
	
	@FindBy(xpath = "//input[@name = 'architecture']")
	WebElement inputarchitectureSearch;
	
	
	public void convertToApplication() {
		clickElement(convertToApplication, "");
		//convertToApplication.click();
	}
	
	public void volume_tab() throws InterruptedException {
		clickElement(volume_tab, "");
		//volume_tab.click();
	}

	public void VolumeNameThreeDot() {
		clickElement(VolumeNameThreeDot, "");
		//VolumeNameThreeDot.click();
		
	}
	
	public WebElement  architectureNameThreeDot() {
		clickElement(architectureThreeDot, "");
		//VolumeNameThreeDot.click();
		architectureThreeDot.isDisplayed();
		return architectureThreeDot;
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			backDropShowing.click();
		}
	}

	public void inputvolumename(String value ) {

		SetInputENterKey(inputvolumenameSearch, value);
		SetInput(inputvolumenameSearch, value, value);
		
//		inputvolumenameSearch.sendKeys(Keys.ENTER);
//		inputvolumenameSearch.sendKeys(value);
	}

	public void inputarchitectureSearch(String value ) {

		SetInputENterKey(inputarchitectureSearch, value);
		SetInput(inputarchitectureSearch, value, value);
		
//		inputvolumenameSearch.sendKeys(Keys.ENTER);
//		inputvolumenameSearch.sendKeys(value);
	}
	
	
	public void refreshbutton() {
		clickElement(refreshbutton, "");
	//	refreshbutton.click();
	}
	
	public String toastcontainermessage() {

		wait(toastcontainer,logger);
		String toastcontaineralert = toastcontainer.getAttribute("innerHTML");

		System.out.println("InnerHTML of the element (get_attribute): " + toastcontainer.getAttribute("value"));
		System.out.println("Title on alert popup after converting app>" + toastcontaineralert);
		return toastcontaineralert;
		

	}
	
	public void editbutton() {
		clickElement(editbutton, "");
		//editbutton.click();
	}
	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/span[1]/div[1]/div[1]")
	WebElement architectureVolume;
	
	@FindBy(css = ".cdk-overlay-container")
	WebElement architectureToolTip;
	public String get_Text_ToolTiparchitecture() {
		mouseHover(architectureVolume);

		String architectureToolTipText = architectureToolTip.getText();

		architectureToolTipText.trim();

		return architectureToolTipText;
	}

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement tagThreedot;
	
	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement statusThreeDot;
	public void tagThreeDot() {
		
		clickElement(tagThreedot, "");
		
	}

	public void statusThreeDot() {
		// TODO Auto-generated method stub
		clickElement(statusThreeDot, "");
		
	}
	@FindBy(css = ".cdk-overlay-container")
	WebElement editbuttonToolTip;
	
	public String get_Text_ToolTipEditButton() {
		mouseHover(editbutton);

		String editbuttonToolTipText = editbuttonToolTip.getText();

		editbuttonToolTipText.trim();

		return editbuttonToolTipText;
	}

	
		@FindBy(css= ".cdk-overlay-container")
		WebElement outerlayerclick;
		public void outerlayerclick() {
			clickElement(outerlayerclick, "");
			
		}

		@FindBy(css = ".cdk-overlay-container")
		WebElement repositoryTooltip;
		
		@FindBy(xpath = "//*[@id='mat-select-value-1']")
		WebElement repositoryName;
		
		public String get_Text_ToolTipRepositoryName() {
			mouseHover(repositoryName);

			String repositoryNameToolTipText = repositoryTooltip.getText();

			repositoryNameToolTipText.trim();

			return repositoryNameToolTipText;
		}
		
	}

