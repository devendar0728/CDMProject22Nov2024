package com.cdm.pages.Latest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class CalenderPage extends CommonActions {

		public CalenderPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
		{
			super(driver, logger);

			PageFactory.initElements(driver, this);
		}
		
		public void SelectDirectDDDashMMDashYYYDay(String year,String Month,String day) {
			try {
			dayselection(day);
			}
			catch(Exception ex) {
				
			}
			
		}
		
		public void SelectDDDashMMDashYYYDay(String year,String Month,String day) {
			try {
			arrowforyearandmonth();
			Thread.sleep(2000);
			yearselection(year);
			Thread.sleep(500);
			String moValue=Month +" " + year;
			monthselection(moValue);
			Thread.sleep(2000);			 
			dayselection(day);
			}
			catch(Exception ex) {
				
			}
			
		}
		
		
		
		public void SelectDay(String year,String Month,String day) {
			try {
				year=year.trim();
				Month=Month.trim();
				day=day.trim();
			arrowforyearandmonth();
			Thread.sleep(3000);
			yearselection(year);
			Thread.sleep(3000);
			String moValue=  Month +" " + year;
			monthselection(moValue);
			Thread.sleep(2000);
			String dayValue=Month +" " +day +", "+ year;
			dayselection(dayValue);
			}
			catch(Exception ex) {
				
			}
			
		}
		
		
		
		@FindBy(xpath = "//button[@aria-label ='Choose month and year']")
	    public WebElement arrowforyearandmonth;
		
		
		
		
		public void arrowforyearandmonth() {
			
			arrowforyearandmonth.click();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}
		public void monthselection(String value) {

			String str="//button[@aria-label='"+value+"']";
			WebElement ele=driver.findElement(By.xpath(str));
			ele.click();
		}



		public void yearselection(String value) {
			String str="//button[@aria-label='"+value+"']";
			WebElement ele=driver.findElement(By.xpath(str));
			ele.click();
			 
			 
		}
		public void dayselection(String value) {
			String str="//button[starts-with(@aria-label,'"+value+"')]";
			WebElement ele=driver.findElement(By.xpath(str));
			ele.click();
		}

}
