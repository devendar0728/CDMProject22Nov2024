package com.cdm.pages.Latest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class RepositoriesAddPage extends CommonActions {

	public RepositoriesAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//*[@id=\"togBtn\"]")
	WebElement sliderOnCheckBox;

	@FindBy(xpath = "//*[@id=\"togBtn\"]/..")
	WebElement sliderOnCheckBoxLabel;

	@FindBy(xpath = "//mat-expansion-panel-header/span[2]")
	WebElement accordionexpandbutton;

	@FindBy(xpath = "//input[@formcontrolname='repositoryname']/../../../../../span[2]")
	WebElement validationMessageRepositoryName;

	@FindBy(xpath = "//input[@formcontrolname='repositoryname']/../../../../../span[1]")
	WebElement validationMessageRepositoryName1;

	@FindBy(xpath = "//input[@formcontrolname='url']/../../../../../span[1]")
	WebElement validationMessageURLWithout;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-repositorydetails[1]/div[1]/mat-nav-list[1]/mat-expansion-panel[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/span[1]")
	WebElement validationMessageDataStorageWithout;


	@FindBy(xpath = "//input[@formcontrolname='username']/../../../../../../div/span")
	WebElement validationMessageUserName;

	@FindBy(xpath = "//div[@class='slider round']")
	WebElement toggleElement;

	@FindBy(xpath = "//input[@formcontrolname='Password']/../../../../../../div/span")
	WebElement validationMessageUserPassword;

	@FindBy(xpath = "//input[@formcontrolname='url']/../../../../../span/span")
	WebElement validationMessageRepositoryURL;

	@FindBy(xpath = "//h3[@class='subTitle']")
	WebElement AddListpageVerification;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement savebuttonrepository;

	@FindBy(xpath = "//mat-select[@formcontrolname='datastorageindex']")
	WebElement datastorageindexAdd;

	@FindBy(xpath = "//input[@formcontrolname='repositoryname']")
	WebElement repositorynameAdd;

	@FindBy(xpath = "//input[@formcontrolname='url']")
	WebElement repositoryURLAdd;

	@FindBy(xpath = "//input[@formcontrolname='repositorypath']")
	WebElement repositorypathAdd;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement repositoryPasswordAdd;

	@FindBy(xpath = "//input[@formcontrolname='username']")
	WebElement repositoryUserNameAdd;

	public void repositorynameAdd(String value) {
		SetInputENterKey(repositorynameAdd,"");
		SetInput(repositorynameAdd, value, value);

//		repositorynameAdd.sendKeys(Keys.ENTER);
//		repositorynameAdd.sendKeys(value);
	}

	public void repositoryURLAdd(String value) {
		SetInputENterKey(repositoryURLAdd,"");
		SetInput(repositoryURLAdd, value, value);

//		repositoryURLAdd.sendKeys(Keys.ENTER);
//		repositoryURLAdd.sendKeys(value);
	}

	public void repositorypathAdd(String value) {
		SetInputENterKey(repositorypathAdd,"");
		SetInput(repositorypathAdd, value, value);

//		repositorypathAdd.sendKeys(Keys.ENTER);
//		repositorypathAdd.sendKeys(value);
	}

	public void repositoryUserNameAdd(String value) {
		SetInputENterKey(repositoryUserNameAdd,"");
		SetInput(repositoryUserNameAdd, value, value);
//
//		repositoryUserNameAdd.sendKeys(Keys.ENTER);
//		repositoryUserNameAdd.sendKeys(value);
	}

	public void repositoryPasswordAdd(String value) {
		SetInputENterKey(repositoryPasswordAdd,"");
		SetInput(repositoryPasswordAdd, value, value);

//		repositoryPasswordAdd.sendKeys(Keys.ENTER);
//		repositoryPasswordAdd.sendKeys(value);
	}

	public void datastorageindexAdd(String value) throws InterruptedException {

		SelectMatOption(datastorageindexAdd, value);
	}

	public void savebuttonrepository() {
		clickElement(savebuttonrepository, "");
		//savebuttonrepository.click();

	}

	public String verifyValidationMessageRepositoryName() {
		clickElement(AddListpageVerification, "");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageRepositoryName == null) {
			return "";
		}
		String message = validationMessageRepositoryName.getText();

		return message.trim();

	}

	public String verifyValidationMessageRepositoryName1() {
		clickElement(AddListpageVerification, "");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageRepositoryName1 == null) {
			return "";
		}
		String message = validationMessageRepositoryName1.getText();

		return message.trim();

	}

	public String verifyValidationMessageRepositoryURL() {
		AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageRepositoryURL == null) {
			return "";
		}
		String message = validationMessageRepositoryURL.getText();

		return message.trim();
	}

	public String verifyValidationMessageUsername() {

		clickElement(AddListpageVerification,"");
		//AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageUserName == null) {
			return "";
		}
		String message = validationMessageUserName.getText();

		return message.trim();
	}

	public void accordionexpandbutton() {

		accordionexpandbutton.click();
	}

	public String verifyValidationMessagepassword() {
		clickElement(AddListpageVerification,"");
		//AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageUserName == null) {
			return "";
		}
		String message = validationMessageUserName.getText();

		return message.trim();
	}


	public String verifyValidationMessagewithoutURL() {
		clickElement(AddListpageVerification,"");
		//AddListpageVerification.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		if (validationMessageURLWithout == null) {
			return "";
		}
		String message = validationMessageURLWithout.getText();

		return message.trim();
	}

	public String verifyValidationMessageDataStorageIndex() {


		if (validationMessageDataStorageWithout == null) {
			return "";
		}
		String message = validationMessageDataStorageWithout.getText();

		return message.trim();
	}



	public String toggleElementcolour() {

		String actualColor = toggleElement.getCssValue("background-color");
		return actualColor;
	}

	public void moveSliderCondition(String m) {
		moveSliderCondition(sliderOnCheckBox, sliderOnCheckBoxLabel, m);
	}


	public String removalofEnteredTextForRepositoryName() {

		return removalofEneredText(repositorynameAdd);

	}

	public String removalofEnteredTextForURL() {

		return removalofEneredText(repositoryURLAdd);

	}

	public String removalofEnteredTextForRepositoryPath() {

		return removalofEneredText(repositorypathAdd);

	}

	public String removalofEneredTextForUSername() {

		return removalofEneredText(repositoryUserNameAdd);

	}

	public String removalofEneredTextPassword() {

		return removalofEneredText(repositoryPasswordAdd);

	}

}
