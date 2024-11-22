package com.cdm.pages.Latest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class EdgeGroupAddPage extends CommonActions {
	public EdgeGroupAddPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement healthstatusToolTip;

	@FindBy(xpath = "//div/mat-tooltip-component/div[contains(text(),'Close')]")
	WebElement closeTooltip;




	@FindBy(xpath = "//app-console-terminal/div[1]/div[2]/i")
	WebElement closeIcon;

	@FindBy(xpath = "//mat-dialog-container[@id='mat-dialog-3']")
	WebElement iconwindow;

	@FindBy(css = ".cdk-overlay-container")
	WebElement groupIDToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement groupNamefieldToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement locationToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement descriptionsToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement appGroupToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverportToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverNodeToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement serverHostAddressToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement groupNameToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement editToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement statusToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement consoleToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deleteToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement stopToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deviceConnectedToolTip;

	@FindBy(css = ".cdk-overlay-container")
	WebElement deviceActiveToolTip;

	@FindBy(xpath = "//div[contains(text(),'Group Name')]")
	WebElement groupNameLabel;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[2]")
	WebElement groupNameDelete;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/img[4]")
	WebElement consoleIcon;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement healthstatus;

	@FindBy(xpath = "//body/app-root[1]/app-root[1]/app-home[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/div[1]/app-add-edit-edgegroup[1]/div[1]/div[1]/form[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]")
	WebElement appGroup;

	@FindBy(xpath = "//input[@formcontrolname='serverport']")
	WebElement serverport;

	@FindBy(xpath = "//input[@formcontrolname='maxservernode']")
	WebElement maxServernode;

	@FindBy(xpath = "//input[@formcontrolname='serverhostaddress']")
	WebElement serverHostAddress;





	@FindBy(xpath = "//input[@formcontrolname='location']")
	WebElement locationAdd;

	@FindBy(xpath = "//textarea[@formcontraolname='description']")
	WebElement descriptionAdd;



	//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]
	@FindBy(xpath = "//thead/tr[1]/th[1]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement GroupNameFilter;

	@FindBy(xpath = "//thead/tr[1]/th[2]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement DeviceConnectedFilter;

	@FindBy(xpath = "//thead/tr[1]/th[3]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement DeviceActive;

	@FindBy(xpath = "//thead/tr[1]/th[4]/div[1]/app-filter[1]/div[1]/a[1]/mat-icon[1]")
	WebElement DeviceStatus;

	@FindBy(xpath = "//div[@id='toast-container']")
	WebElement toasterSuccess;

	@FindBy(xpath = "//input[@formcontrolname='controllername']/../../../../../span[1]")
	WebElement validationMessageGroupIdwithout;

	@FindBy(xpath = "//input[@formcontrolname='displayname']/../../../../../span[1]")
	WebElement validationMessageGroupNamewithout;

	@FindBy(xpath = "//input[@formcontrolname='appgroupid']/../../../../../span[1]")
	WebElement validationMessageAppGroupwithout;

	@FindBy(xpath = "//input[@formcontrolname='serverhostaddress']/../../../../../span[1]")
	WebElement validationMessageServerHostIDwithout;

	@FindBy(xpath = "//input[@formcontrolname='serverport']/../../../../../span[1]")
	WebElement validationMessageServerPortwithout;

	@FindBy(xpath = "//input[@formcontrolname='displayname']")
	WebElement edgeGroupNameAdd;

	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../div/../../span[1])")
	WebElement validationMessageGroupName;

	@FindBy(xpath = "(//input[@formcontrolname='displayname']/../../../../div/../../span[2])")
	WebElement validationMessageGroupName1;

	@FindBy(xpath = "//input[@formcontrolname='controllername']")
	WebElement edgeGroupIdAdd;

	@FindBy(xpath = "//input[@formcontrolname='controllername']/../../../../../span[2]")
	WebElement validationMessageGroupId;

	@FindBy(xpath = "//h4/span")
	WebElement headingTitleAdd;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButtonUpload;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveButtonforEdgeGroup;

	public void edgeGroupNameAdd(String value) {

		SetInputENterKey(edgeGroupNameAdd,"");
		SetInput(edgeGroupNameAdd, value, value);


	}

	public void edgeGroupIdAdd(String value) {

		SetInputENterKey(edgeGroupIdAdd,"");
		SetInput(edgeGroupIdAdd, value, value);

//		edgeGroupIdAdd.sendKeys(Keys.ENTER);
//		edgeGroupIdAdd.sendKeys(value);
	}

	public void headingTitleAdd() {
		clickElement(headingTitleAdd, "");
		headingTitleAdd.click();
	}

	public String validationMessageAppGroupwithout() {


		if (validationMessageAppGroupwithout == null) {
			return "";
		}
		String message = validationMessageAppGroupwithout.getText();

		return message.trim();

	}

	public String validationMessageGroupIdwithout() {


		if (validationMessageGroupIdwithout == null) {
			return "";
		}
		String message = validationMessageGroupIdwithout.getText();

		return message.trim();

	}

	public String validationMessageGroupId() {



		if (validationMessageGroupId == null) {
			return "";
		}
		String message = validationMessageGroupId.getText();

		return message.trim();

	}

	public String validationMessageGroupNamewithout() {


		if (validationMessageGroupNamewithout == null) {
			return "";
		}
		String message = validationMessageGroupNamewithout.getText();

		return message.trim();

	}

	public String validationMessageServerHostIDwithout() {

		if (validationMessageServerHostIDwithout == null) {
			return "";
		}
		String message = validationMessageServerHostIDwithout.getText();

		return message.trim();

	}

	public String validationMessageServerPortwithout() {


		if (validationMessageServerPortwithout == null) {
			return "";
		}
		String message = validationMessageServerPortwithout.getText();

		return message.trim();

	}

	public String verifyValidationMessageGroupName1() {



		if (validationMessageGroupName1 == null) {
			return "";
		}
		String message = validationMessageGroupName1.getText();

		return message.trim();

	}

	public String verifyValidationMessageEdgeIDAdd() {


		if (validationMessageGroupId == null) {
			return "";
		}
		String message = validationMessageGroupId.getText();

		return message.trim();

	}

	public void saveButtonUpload() {
		clickElement(saveButtonUpload,"");
		//saveButtonUpload.click();
	}

	public String verifyValidationMessageGroupID() {



		if (validationMessageGroupId == null) {
			return "";
		}
		String message = validationMessageGroupId.getText();

		return message.trim();

	}

	public void saveButtonforEdgeGroup() {
		clickElement(saveButtonforEdgeGroup, "");
		//saveButtonforEdgeGroup.click();
	}

	public void scrollingverticalAdd() {

		scrollingvertical("div.pagefooter", "0", "500");
	}

	public String verifyValidationMessageGroupName() {

		if (validationMessageGroupName == null) {
			return "";
		}
		String message = validationMessageGroupName.getText();

		return message.trim();

	}

	public WebElement verifysuccessToasterMessage() {

		System.out.println("InnerHTML of the element (get_attribute): " + toasterSuccess.getAttribute("innerHTML"));
		System.out.println("Title on alert popup after download>" + toasterSuccess);
		return toasterSuccess;
	}

	public void GroupNameFilter() {
		if (GroupNameFilter.isDisplayed()) {
			System.out.println("Element is visible");
		} else {
			System.out.println("Element is not visible");
		}

	}

	public void DeviceConnectedFilter() {
		if (DeviceConnectedFilter.isDisplayed()) {
			System.out.println("Element is visible");
		} else {
			System.out.println("Element is not visible");
		}

	}

	public void DeviceActive() {
		clickElement(DeviceActive, "Clicking on device Active");
//		if (DeviceActive.isDisplayed()) {
//			System.out.println("Element is visible");
//		} else {
//			System.out.println("Element is not visible");
//		}

	}

	public void DeviceStatus() {
		if (DeviceActive.isDisplayed()) {
			System.out.println("Element is visible");
		} else {
			System.out.println("Element is not visible");
		}

	}

	public void switchToSecondInput() {

		edgeGroupNameAdd.sendKeys(Keys.TAB);
	}

	public String get_Text_ToolTipedgeGroupId() {
		mouseHover(edgeGroupIdAdd);

		String edgeGroupIdAddNameText = groupIDToolTip.getText();

		edgeGroupIdAddNameText.trim();

		return edgeGroupIdAddNameText;
	}

	public String get_Text_ToolTipedgeGroupName() {
		mouseHover(groupNameLabel);

		String GroupNameAddText = groupNameToolTip.getText();

		GroupNameAddText.trim();

		return GroupNameAddText;
	}



	public String get_Text_ToolTipHealthStatus() {
		mouseHover(healthstatus);

		String healthStatusText = healthstatusToolTip.getText();

		healthStatusText.trim();

		return healthStatusText;
	}

	public String get_Text_ToolTipAppGroup() {
		mouseHover(appGroup);

		String appGroupText = appGroupToolTip.getText();

		appGroupText.trim();

		return appGroupText;
	}

	public String get_Text_ToolTipserverport() {
		mouseHover(serverport);

		String serverportToolTipText = serverportToolTip.getText();

		serverportToolTipText.trim();

		return serverportToolTipText;
	}

	public String get_Text_ToolTipservernode() {
		mouseHover(maxServernode);

		String servernodeToolTipText = serverNodeToolTip.getText();

		servernodeToolTipText.trim();

		return servernodeToolTipText;
	}

	public String get_Text_ToolTipserverHostAddress() {
		mouseHover(serverHostAddress);

		String serverHostAddressToolTipText = serverHostAddressToolTip.getText();

		serverHostAddressToolTipText.trim();

		return serverHostAddressToolTipText;
	}

	public String get_Text_ToolTipGroupID() {
		mouseHover(edgeGroupIdAdd);

		String groupIDToolTipText = groupIDToolTip.getText();

		groupIDToolTipText.trim();

		return groupIDToolTipText;
	}

	public String get_Text_ToolTipGroupName() {
		mouseHover(edgeGroupNameAdd);

		String groupNameToolTipText = groupNameToolTip.getText();

		groupNameToolTipText.trim();

		return groupNameToolTipText;
	}

	public String get_Text_ToolTiplocation() {
		mouseHover(locationAdd);

		String locationToolTipText = locationToolTip.getText();

		locationToolTipText.trim();

		return locationToolTipText;
	}

	public String get_Text_ToolTipDescription() {
		mouseHover(descriptionAdd);

		String descriptionsToolTipText = descriptionsToolTip.getText();

		descriptionsToolTipText.trim();

		return descriptionsToolTipText;
	}

	public void maximisescreen() {

		driver.manage().window().maximize();

	}

	public void minimizeScreen() {
		driver.manage().window().minimize();

	}
}
