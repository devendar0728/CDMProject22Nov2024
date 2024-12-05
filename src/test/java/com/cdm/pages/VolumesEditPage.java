package com.cdm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class VolumesEditPage extends CommonActions {

	public VolumesEditPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cdk-overlay-backdrop-showing")
	WebElement backDropShowing;

	@FindBy(xpath = "//button[@class='addButton']")
	WebElement saveEditVolume;

	@FindBy(xpath = "//input[@formcontrolname= 'volumename']")
	WebElement volumenameEdit;

	@FindBy(xpath = "//input[@formcontrolname='repositorylink']")
	WebElement repositorylinkEdit;

	@FindBy(xpath = "//input[@formcontrolname='licensetype']")
	WebElement licensetypeEdit;

	@FindBy(xpath = "//input[@formcontrolname='shakey']")
	WebElement shakeyEdit;

	@FindBy(xpath = "//input[@id='mat-input-49']")
	WebElement mountdirectoryEdit;

	@FindBy(xpath = "//input[@formcontrolname='tag']")
	WebElement tagEdit;

	@FindBy(xpath = "//input[@formcontrolname='architecture']")
	WebElement architectureEdit;

	@FindBy(xpath = "//input[@formcontrolname='maxsize']")
	WebElement maxsize;

	@FindBy(xpath = "//input[@name='hardwarename']")
	WebElement hardwarenamesearch;

	@FindBy(xpath = "//mat-select[@formcontrolname='repositoryid']")
	WebElement repositoryNameEdit;

	@FindBy(xpath = "//mat-select[@formcontrolname='type']")
	WebElement typeEdit;

	public void repositoryNameEdit(String value) throws InterruptedException {
		SelectMatOption(repositoryNameEdit, value);
	}

	public void backDropShowing_Div_Click() {
		if (backDropShowing != null) {
			clickElement(backDropShowing, "");
			backDropShowing.click();
		}
	}

	public void typeEdit(String value) throws InterruptedException {
		SelectMatOption(typeEdit, value);
	}

	public void volumenameEdit(String value) {
		SetInputENterKey(volumenameEdit, "");
		SetInput(volumenameEdit, value, value);
//		volumenameEdit.sendKeys(Keys.ENTER);
//		volumenameEdit.sendKeys(value);
	}

	public void architectureEdit(String value) {
		SetInputENterKey(architectureEdit, "");
		SetInput(architectureEdit, value, value);

//		architectureEdit.sendKeys(Keys.ENTER);
//		architectureEdit.sendKeys(value);
	}

	public void licensetypeEdit(String value) {
		SetInputENterKey(licensetypeEdit, "");
		SetInput(licensetypeEdit, value, value);

//		licensetypeEdit.sendKeys(Keys.ENTER);
//		licensetypeEdit.sendKeys(value);
	}

	public void repositorylinkEdit(String value) {
		SetInputENterKey(repositorylinkEdit, "");
		SetInput(repositorylinkEdit, value, value);

//		repositorylinkEdit.sendKeys(Keys.ENTER);
//		repositorylinkEdit.sendKeys(value);
	}

	public void tagEdit(String value) {
		SetInputENterKey(tagEdit, "");
		SetInput(tagEdit, value, value);
//
//		tagEdit.sendKeys(Keys.ENTER);
//		tagEdit.sendKeys(value);
	}

	public void mountdirectoryEdit(String value) {
		SetInputENterKey(mountdirectoryEdit, "");
		SetInput(mountdirectoryEdit, value, value);
//
//		mountdirectoryEdit.sendKeys(Keys.ENTER);
//		mountdirectoryEdit.sendKeys(value);
	}

	public void maxsizeEdit(String value) {
		SetInputENterKey(maxsize, "");
		SetInput(maxsize, value, value);

//		maxsize.sendKeys(Keys.ENTER);
//		maxsize.sendKeys(value);
	}

	public void shakeyEdit(String value) {
		SetInputENterKey(shakeyEdit, "");
		SetInput(shakeyEdit, value, value);
//
//		shakeyEdit.sendKeys(Keys.ENTER);
//		shakeyEdit.sendKeys(value);
	}

	public String removalofEnteredTextForVolumeName() {

		return removalofEneredText(volumenameEdit);

	}

	public String removalofEnteredTextForMountDirectory() {

		return removalofEneredText(mountdirectoryEdit);

	}

	public String removalofEnteredTextForRepositoryLink() {

		return removalofEneredText(repositorylinkEdit);

	}

	public String removalofEnteredTextForlicensetypeEdit() {

		return removalofEneredText(licensetypeEdit);

	}

	public String removalofEnteredTextFortagEdit() {

		return removalofEneredText(tagEdit);

	}

	public String removalofEnteredTextForarchitectureEdit() {

		return removalofEneredText(architectureEdit);

	}

	public String removalofEnteredTextFormaxsizeEdit() {

		return removalofEneredText(maxsize);

	}

	public String removalofEnteredTextForShaKey() {

		return removalofEneredText(shakeyEdit);

	}

	public void saveEditVolume() throws InterruptedException {
		wait(saveEditVolume, logger);
		clickElement(saveEditVolume, "");
		// saveEditVolume.click();
		Thread.sleep(4000);
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement maxsizeToolTip;

	public String get_Text_ToolTipMaxSize() throws InterruptedException {
		Thread.sleep(2000);
		mouseHover(maxsize);

		String maxsizeToolTipText = maxsizeToolTip.getText();

		maxsizeToolTipText.trim();

		return maxsizeToolTipText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement architectureEditTooltip;

	public String get_Text_ToolTipArchitecureEdit() {
		mouseHover(architectureEdit);

		String architectureEditTooltipText = architectureEditTooltip.getText();

		architectureEditTooltipText.trim();

		return architectureEditTooltipText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement versionTooltip;

	@FindBy(xpath = "//input[@formcontrolname='tag']")
	WebElement versionInput;

	public String get_Text_ToolTipVersion() {
		mouseHover(versionInput);

		String versionTooltipText = versionTooltip.getText();

		versionTooltipText.trim();

		return versionTooltipText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement mountdirectoryEditTooltip;

	public String get_Text_ToolTipMountDirectoryEdit() throws InterruptedException {
		Thread.sleep(4000);
		mouseHover(mountdirectoryEdit);

		String mountdirectoryEditTooltipText = mountdirectoryEditTooltip.getText();

		mountdirectoryEditTooltipText.trim();

		return mountdirectoryEditTooltipText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement licensetypeEditTooltip;

	public String get_Text_ToolTipLicenseTypeEdit() {

		mouseHover(licensetypeEdit);

		String licensetypeEditTooltipText = licensetypeEditTooltip.getText();

		licensetypeEditTooltipText.trim();

		return licensetypeEditTooltipText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement typeEditTooltip;

	public String get_Text_ToolTipTypeEdit() {

		mouseHover(typeEdit);

		String typeEditTooltipText = typeEditTooltip.getText();

		typeEditTooltipText.trim();

		return typeEditTooltipText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositorylinkEditTooltip;

	public String get_Text_ToolTiprepositoryLink() {

		mouseHover(repositorylinkEdit);

		String repositorylinkEditTooltipText = repositorylinkEditTooltip.getText();

		repositorylinkEditTooltipText.trim();

		return repositorylinkEditTooltipText;
	}

	@FindBy(css = ".cdk-overlay-container")
	WebElement repositoryNameEditTooltip;

	public String get_Text_ToolTipRepositoryNameEdit() {
		mouseHover(repositoryNameEdit);

		String repositoryNameEditTooltipText = repositoryNameEditTooltip.getText();

		repositoryNameEditTooltipText.trim();

		return repositoryNameEditTooltipText;
	}

}
