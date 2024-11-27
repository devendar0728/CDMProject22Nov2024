package com.cdm.StepDefinations;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop;
	public static Map<String, Map<String, String>> alldata;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String vTCName;
	public static String tagName = "";

	public void initiationData() {

		if (prop == null) {
			prop = readproperties();

			alldata = readdata(System.getProperty("user.dir") + "/src/test/resources/TestData/DataAman.xlsx", tagName);

			createExtentReport();
		}
		launchApp();

	}

	public void launchApp() {
		String browserName = null;
		if (alldata.get(vTCName).get("BrowserName") != null) {
			browserName = alldata.get(vTCName).get("BrowserName").toString();
		}
		if (browserName == null || browserName.isEmpty()) {
			browserName = prop.getProperty("Browser");
		}
		browserName = browserName.toLowerCase().trim();
		for (int i = 0; i < 10; i++) {
			if (browserName.equals("chrome")) {
				// WebDriverManager.chromedriver().setup();
				String chromeDriverpath = prop.getProperty("BrowserPath");
				System.out.println("I am in launchApp" + chromeDriverpath);

				ChromeOptions options = new ChromeOptions();
//				options.addArguments("--window-size=1920,1080");
//				options.addArguments("--disable-extensions");
//				options.addArguments("--proxy-server='direct://'");
//				options.addArguments("--proxy-bypass-list=*");
//				options.addArguments("--start-maximized");
//
//				options.addArguments("--disable-dev-shm-usage");
//				options.addArguments("--no-sandbox");
//				options.addArguments("--ignore-certificate-errors");
//				options.addArguments("--remote-allow-origins=*");
//				// options.addArguments("--disable notifications");
				// options.addArguments("--headless");
				options.addArguments("--disable-gpu");
				options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
//				options.addArguments("start-maximized");
//				options.setExperimentalOption("credentials_enable_service", false);
//				options.setExperimentalOption("profile.password_manager_enabled", false);
				// options.addArguments("--incognito");

				System.setProperty("webdriver.chrome.drive", chromeDriverpath);
				try {
					driver = new ChromeDriver(options);
				} catch (Exception ex) {

					ex.printStackTrace();
					try {
						Thread.sleep(1000);
						continue;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();

					}
				}

			} else if (browserName.equals("firefox")) {

				driver = new FirefoxDriver();
			} else if (browserName.equals("edge")) {

				driver = new EdgeDriver();

			}

			driver.manage().window().maximize();
			// int time = Integer.parseInt(prop.getProperty("ImplicitWait"));
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
			return;
		}

		if (driver == null) {
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("headless");
			edgeOptions.addArguments("disable-gpu"); // Optional: Disable GPU for better performance

			driver = new EdgeDriver(edgeOptions);
			driver.manage().window().maximize();
			// int time = Integer.parseInt(prop.getProperty("ImplicitWait"));
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		}

	}

	public Properties readproperties() {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/config/settings.properties");
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop;
	}

	public Map<String, Map<String, String>> readdata(String file, String sheet) {
		Map<String, Map<String, String>> alldata = null;
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection(file);
			String strQuery = "Select * from " + sheet;
			Recordset recordset = connection.executeQuery(strQuery);
			List<String> clms = recordset.getFieldNames();
			alldata = new HashMap<String, Map<String, String>>();
			while (recordset.next()) {
				String TCName = recordset.getField("TCName");
				Map<String, String> rowdata = new HashMap<String, String>();

				for (int i = 0; i < clms.size(); i++) {
					String value = recordset.getField(clms.get(i));
					if (value != null && value.startsWith("'")) {
						if (value.length() > 1) {
							value = value.substring(1).trim();
						} else {
							value = "";
						}
					}
					rowdata.put(clms.get(i), value);
				}
				alldata.put(TCName, rowdata);
			}

			recordset.close();
			connection.close();
			return alldata;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return alldata;

	}

	public void createExtentReport() {
		Date d = new Date();
		DateFormat ft = new SimpleDateFormat("ddMMyyyyhhmmss");
		String fileName = ft.format(d);
		htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/src/test/java/com/cdm/reports/ExtentReport" + fileName + ".html");
		// Create an object of Extent Reports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "BirlaSoft");
		extent.setSystemInfo("Environment", "Test");
		extent.setSystemInfo("User Name", "Devendaram");
		htmlReporter.config().setDocumentTitle("Foresite Centeralized Device Management");
		// Name of the report
		htmlReporter.config().setReportName("Foresite Centeralized Device Management");
		// Dark Theme
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss a");

	}

	public void email() throws Exception {
		Date d = new Date();
		DateFormat ft = new SimpleDateFormat("ddMMyyyyhhmmss");
		String fileName = ft.format(d);
		EmailAttachment attachment = new EmailAttachment();

		attachment.setPath(
				System.getProperty("user.dir") + "/src/test/java/com/cdm/reports/ExtentReport" + fileName + ".html");

		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription(" Test Execution Report");
		attachment.setName("Report.html");

		// Create the email message
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setSSLOnConnect(true);
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("your email", "authentication_code"));
		email.addTo("toemail", "Test");
		email.setFrom("from email", "Me");
		email.setSubject("Automation Test Execution Report");
		email.setMsg("Automation Test Execution Report");
		email.attach(attachment);

		email.send();
	}

}