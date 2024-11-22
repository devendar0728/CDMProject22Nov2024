package com.cdm.pages;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class RepositoriesPage extends CommonActions {

	public RepositoriesPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@id='toast-container']")
	WebElement toasterSuccess;

	public WebElement successMessage() {

		System.out.println("InnerHTML of the element (get_attribute): " + toasterSuccess.getAttribute("innerHTML"));
		System.out.println("Title on alert popup after download>" + toasterSuccess);
		return toasterSuccess;

	}

	@FindBy(xpath = "//input[@formcontrolname='repositoryname']/../../../../../span[2]")
	WebElement validationMessagerepositoryName;

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryEditToolTip;

	@FindBy(xpath = "//div[@class='slider round']")
	WebElement toggleElement;



	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryAddToolTip;

	@FindBy(xpath = "//button[@class='calButton mr-3']")
	WebElement cancelRepository;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement savebuttonrepository;


	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryDeleteToolTip;

	@FindBy(xpath= "//tbody/tr[1]/td[5]/img[1]")
	WebElement editbuttonRepository;

	@FindBy(xpath = "/html/body/app-root/app-root/app-home/mat-sidenav-container/mat-sidenav/div/mat-nav-list/ul/li[9]/a/span[contains(text(),'Settings')]")
	WebElement Setting_tab;

	@FindBy(xpath = "//a[contains(text(),'Repositories')]")
	WebElement repositories_tab;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-confirmationdelete[1]/div[1]/mat-dialog-actions[1]/button[1]")
	WebElement confirmationYesButton;

	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-confirmationdelete[1]/div[1]/mat-dialog-actions[1]/button[2]")
	WebElement confirmationNoButton;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[2]")
	WebElement deleteButton;

	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement repositoriesName;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement dataStorageIndex;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement username;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement status;

	@FindBy(xpath = "//div[@class='tableCard']/div/div/span/img[1]")
	WebElement addButtonRepository;

	@FindBy(xpath = "//input[@name= 'repositoryname']")
	WebElement repositoryNameInput;

	@FindBy(xpath = "//input[@name='datastoragetype']")
	WebElement datastoragetype;

	@FindBy(xpath = "//input[@name='username']")
	WebElement usernameInput;

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath ="//thead/tr[1]/th[1]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]")
	WebElement repositoryNameAsc;

	@FindBy(xpath = "//div[contains(text(),'Repository Name')]")
	WebElement repositoryNameLabel;


	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryNameToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement dataStorageIndexToolTip;


	@FindBy(css = ".cdk-overlay-container")
	WebElement statusToolTip;

	@FindBy(xpath = "//div[contains(text(),'Status')]")
	WebElement statusLabel;


	@FindBy(xpath = "//div[contains(text(),'Data Storage Index')]")
	WebElement dataStorageIndexLabel;


	@FindBy(css = ".cdk-overlay-container")
	WebElement userNameToolTip;


	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[1]")
	WebElement editLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement editToolTip;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[2]")
	WebElement deleteLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deleteToolTip;

	@FindBy(xpath = "//div[contains(text(),'Username')]")
	WebElement userNameLabel;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[1]")
	WebElement repositoryNameAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryNameAddToolTip;

	@FindBy(xpath = "//input[@formcontrolname='url']")
	WebElement repositoryURLAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryURLToolTip;


	@FindBy(xpath = "//input[@formcontrolname='repositorypath']")
	WebElement repositoryPathAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryPathAddToolTip;


	@FindBy(xpath = "//input[@formcontrolname='username']")
	WebElement repositoryUserNameAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryUserNameAddToolTip;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement repositoryPasswordAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryPasswordAddToolTip;


	@FindBy(xpath = "//span[contains(text(),'Data Storage Index')]")
	WebElement repositoryDataStorageAddLabel;

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryDataStorageAddToolTip;



	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void addButton() {
		wait(addButtonRepository,logger);
		clickElement(addButtonRepository, "");
		//addButtonRepository.click();

	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			clickElement(backDropShowing, "");
			//backDropShowing.click();
		}
	}

	public void repositories_tab() {
		wait(repositories_tab,logger);
		clickElement(repositories_tab, "");
		//repositories_tab.click();
	}

	public void repositoriesNameThreeDot() {
		//repositoriesName.click();
		clickElement(repositoriesName, "");
	}

	public void repositoryNameInput(String value) {
		SetInputENterKey(repositoryNameInput,"");
		SetInput(repositoryNameInput, value, value);

//		repositoryNameInput.sendKeys(Keys.ENTER);
//		repositoryNameInput.sendKeys(value);
	}

	public void dataStorageIndex(String value) {
		SetInputENterKey(datastoragetype,"");
		SetInput(datastoragetype, value, value);
//
//		datastoragetype.sendKeys(Keys.ENTER);
//		datastoragetype.sendKeys(value);
	}

	public void usernameInput(String value) {
		SetInputENterKey(usernameInput,"");
		SetInput(usernameInput, value, value);

//		usernameInput.sendKeys(Keys.ENTER);
//		usernameInput.sendKeys(value);

	}



	public void dataStorageIndexThreeDot() {
		clickElement(dataStorageIndex, "");
		//dataStorageIndex.click();
	}

	public void usernameThreeDot() {
		clickElement(username, "");
		//username.click();
	}

	public void deleteButton() {
		clickElement(deleteButton, "");
		//deleteButton.click();

	}

	public void confirmationYesButton() {
		clickElement(confirmationYesButton, "");
		//confirmationYesButton.click();

	}

	public void confirmationNoButton() {
		clickElement(confirmationNoButton, "");
		//confirmationNoButton.click();
	}

	public void editbuttonRepository() {
		clickElement(editbuttonRepository, "");

		//editbuttonRepository.click();
	}

	public String get_Text_ToolTipEditRepository() {

		mouseHover(editbuttonRepository);

		String repositoryEditButton = repositoryEditToolTip.getText();

		repositoryEditButton.trim();

		return repositoryEditButton;
	}

	public String get_Text_ToolTipDeleteRepository() {
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mouseHover(deleteButton);

		String repositoryDeleteButton = repositoryDeleteToolTip.getText();

		repositoryDeleteButton.trim();

		return repositoryDeleteButton;
	}

	public String get_Text_ToolTipAddButtonRepository() {

		mouseHover(addButtonRepository);

		String repositoryAddButton = repositoryAddToolTip.getText();

		repositoryAddButton.trim();

		return repositoryAddButton;
	}



	public String validationMessageGroupIdwithout() {


		if (validationMessagerepositoryName == null) {
			return "";
		}
		String message = validationMessagerepositoryName.getText();

		return message.trim();

	}



	public void savebuttonrepository() {
		savebuttonrepository.click();

	}

	public void cancelRepository() {

		clickElement(cancelRepository, "");
		//cancelRepository.click();
	}

	public void statusDot() {
		status.click();
	}

	public void minimizewindow() {

		driver.manage().window().minimize();
		driver.manage().window().maximize();

	}
	public void repositoryNameAsc() {
		clickElement(repositoryNameAsc, "");

	}


	public String get_Text_ToolTipRepositoryName() {



		mouseHover(repositoryNameLabel);


		String repositoryNameToolTipText = repositoryNameToolTip.getText();

		System.out.println("toolTipText-->" + repositoryNameToolTipText);

		return repositoryNameToolTipText;
	}

	public String get_Text_ToolTipDataStorageIndex() {
		mouseHover(dataStorageIndexLabel);


		String dataStorageIndexToolTipText = dataStorageIndexToolTip.getText();

		System.out.println("toolTipText-->" + dataStorageIndexToolTipText);

		return dataStorageIndexToolTipText;
	}

	public String get_Text_ToolTipUserName() {
		mouseHover(userNameLabel);


		String userNameToolTipText = userNameToolTip.getText();

		System.out.println("toolTipText-->" + userNameToolTipText);

		return userNameToolTipText;
	}

	public String get_Text_ToolTipStatus() {
		mouseHover(statusLabel);


		String statusToolTipText = statusToolTip.getText();

		System.out.println("toolTipText-->" + statusToolTipText);

		return statusToolTipText;
	}

	public String get_Text_ToolTipEdit() {
		mouseHover(editLabel);


		String editToolTipText = editToolTip.getText();

		System.out.println("toolTipText-->" + editToolTipText);

		return editToolTipText;
	}

	public String get_Text_ToolTipDelete() {
		mouseHover(deleteLabel);


		String deleteToolTipText = deleteToolTip.getText();

		System.out.println("toolTipText-->" + deleteToolTipText);

		return deleteToolTipText;
	}

	public String get_Text_ToolTipRepositoryNameAdd() {
		mouseHover(repositoryNameAddLabel);


		String repositoryNameAddText = repositoryNameAddToolTip.getText();

		System.out.println("toolTipText-->" + repositoryNameAddText);

		return repositoryNameAddText;
	}

	public String get_Text_ToolTipRepositoryURLAdd() {
		mouseHover(repositoryURLAddLabel);


		String repositoryURLAddText = repositoryURLToolTip.getText();

		System.out.println("toolTipText-->" + repositoryURLAddText);

		return repositoryURLAddText;
	}

	public String get_Text_ToolTipRepositoryPathAdd() {
		mouseHover(repositoryPathAddLabel);


		String repositoryPathAddText = repositoryPathAddToolTip.getText();

		System.out.println("toolTipText-->" + repositoryPathAddText);

		return repositoryPathAddText;
	}

	public String get_Text_ToolTipRepositoryUserNameAdd() {
		mouseHover(repositoryUserNameAddLabel);


		String repositoryUserNameAddText = repositoryUserNameAddToolTip.getText();

		System.out.println("toolTipText-->" + repositoryUserNameAddText);

		return repositoryUserNameAddText;
	}

	public String get_Text_ToolTipRepositoryPasswordAdd() {
		mouseHover(repositoryPasswordAddLabel);


		String repositoryPasswordAddText = repositoryPasswordAddToolTip.getText();

		System.out.println("toolTipText-->" + repositoryPasswordAddText);

		return repositoryPasswordAddText;
	}

	public String get_Text_ToolTipRepositoryDataStorageAdd() {
		mouseHover(repositoryDataStorageAddLabel);


		String repositoryDataStorageAddText = repositoryDataStorageAddToolTip.getText();

		System.out.println("toolTipText-->" + repositoryDataStorageAddText);

		return repositoryDataStorageAddText;
	}
	@FindBy(css= ".cdk-overlay-container")
	WebElement outerlayerclick;
	public void outerlayerclick() {
		clickElement(outerlayerclick, "");

	}
}
