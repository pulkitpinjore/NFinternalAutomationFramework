package com.automation.framework;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.http.Method;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.pom.ReadExcelFile;
import com.automation.pom.SalesfoceObjectPage;
import com.automation.pom.baseMethods;

import java.io.File;
import java.lang.reflect.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class baseRunner {
	
	ReadExcelFile readExcelFile = new ReadExcelFile();
	String filepath = "./src/main/resources/NFautomationDB.xlsx";
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
	static String screenshotpath = "./test-screenshots/";
	
	ChromeOptions options = new ChromeOptions();
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new EdgeDriver();
	
	SalesfoceObjectPage salesforce = new SalesfoceObjectPage(driver);
	Actions a = new Actions(driver);
	public void loginToSalesforce() throws Exception {
		String testEnv = (readExcelFile.getCellValue(filepath,"Login", 1, 0));
		String username = (readExcelFile.getCellValue(filepath,"Login", 1, 1));
		String pass = "999661553Aa@"/*(readExcelFile.getCellValue(filepath,"Login", 1, 2))*/;
		System.out.println("Launching browser");
		driver.get(testEnv);
		salesforce.findElement(salesforce.userNameLogin).sendKeys(username);
		salesforce.type(pass, salesforce.passWord);
		salesforce.click(salesforce.loginButton);
		
	}
	
	
	public void openCaseId(String caseNumber) throws InterruptedException {
		String xpathCase = "//span[text()='" + caseNumber + "']//ancestor::tbody//th//span//a";
		By idcase = By.xpath(xpathCase);
		salesforce.click(idcase);
	}
	
	@BeforeClass
	public void startUp() throws Exception {
		screenRecorder.startRecord("main");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	
	public void createCase(String caseOrigin, String subject, String description) throws Exception {
		navigateToApp("Cases");
		closeOpenRecords();
		salesforce.click(By.xpath("//a[@title='Cases']"));
		salesforce.click(By.xpath("//div[@title='New']"));
		salesforce.click(By.xpath("//button[contains(@aria-label,'Case Origin')]"));
		WebElement cO = driver.findElement(By.xpath("//span[text()='"+caseOrigin+"']"));
		a.click(cO).build().perform();
		//salesforce.click(By.xpath("//span[text()='"+caseOrigin+"']"));
		salesforce.type(subject, By.xpath("//records-record-layout-item[@field-label='Subject']//input"));
		salesforce.type(description, By.xpath("//records-record-layout-item[@field-label='Description']//textarea"));
		salesforce.click(By.xpath("//button[@name='SaveEdit']"));
		//String caseNo = salesforce.findElement(By.xpath("//span[text()='Case Number']//ancestor::li//span[@class='cuf-rsFieldValue']")).getText();
		//System.out.println("Case created "+caseNo);
		System.out.println("Created Case");
	}
	
	public void createOpportunity(String name, String amount, String date, String stage, String description) throws InterruptedException {
		navigateToApp("Opportunities");
		closeOpenRecords();
		//salesforce.click(By.xpath("//a[@title='Opportunities']"));
		salesforce.click(By.xpath("//div[@title='New']//parent::*"));
		salesforce.type(amount, By.xpath("//input[@name='Amount']"));
		salesforce.type(name, By.xpath("//input[@name='Name']"));
		salesforce.type(date, By.xpath("//input[@name='CloseDate']"));
		salesforce.click(By.xpath("//button[contains(@aria-label,'Stage')]"));
		WebElement s = driver.findElement(By.xpath("//span[text()='"+stage+"']"));
		a.click(s).build().perform();
		salesforce.type(description, By.xpath("//textarea"));
		salesforce.click(By.xpath("//button[@name='SaveEdit']"));
		System.out.println("Created Opportunity");
	}
	
	
	public void createLead(String fname, String lname, String company, String leadSource, String description) throws InterruptedException {
		
		navigateToApp("Leads");
		closeOpenRecords();
		salesforce.click(By.xpath("//div[@title='New']//parent::*"));
		salesforce.type(fname, By.xpath("//input[@name='firstName'])"));
		salesforce.type(lname, By.xpath("//input[@name='lastName']"));
		salesforce.type(company, By.xpath("//input[@name='Company'])"));
		
		salesforce.click(By.xpath("//button[contains(@aria-label,'Lead Source')]"));
		WebElement l = driver.findElement(By.xpath("//span[text()='"+leadSource+"']"));
		a.click(l).build().perform();
		salesforce.type(description, By.xpath("//textarea"));
		salesforce.click(By.xpath("//button[@name='SaveEdit']"));
		System.out.println("Created Lead");
	
		
		
		
	}
	
	public boolean WaitForElement(String xpath, long waitingTimeinsec, WebDriver driver) throws Exception {
		try {

			driver.manage().timeouts().implicitlyWait(waitingTimeinsec, TimeUnit.SECONDS);
			List<WebElement> myDynamicElement = driver.findElements(By.xpath(xpath));
			if (myDynamicElement.size() > 0) {
				//System.out.println("Success: WaitForElement->Number of Element present is: " + myDynamicElement.size()
					//	+ "Xpath is:" + xpath);
				return true;
			} else {
				//System.out.println("Unsuccess: WaitForElement->Number of Element present is: " + myDynamicElement.size()
					//	+ "Xpath is:" + xpath);
				return false;
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("Exception inside WaitForElement:" + xpath);
			return false;
		}
	}

	
	/*@BeforeClass
	public void makeATeamsCall() throws InterruptedException {
		Actions a = new Actions(driver);
		driver.manage().window().maximize();
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.addArguments("use-fake-device-for-media-stream");
		 browserOptions.addArguments("use-fake-ui-for-media-stream");
	     HashMap<String, Object> prefs = new HashMap<String, Object>();
	     prefs.put("profile.default_content_setting_values.media_stream_mic", 2);
	     prefs.put("profile.default_content_setting_values.media_stream_camera", 2);
	     prefs.put("profile.default_content_setting_values.geolocation", 2);
	     prefs.put("profile.default_content_setting_values.notifications", 2);
	     browserOptions.setExperimentalOption("prefs", prefs);
		
		salesforce.visit("https://teams.microsoft.com");
		salesforce.type("pulkit.sachdeva@toyota.com", By.xpath("//input[@type='email']"));
		salesforce.click(By.xpath("//input[@type='submit']"));
		Thread.sleep(5000);
		
		WebElement p = driver.findElement(By.xpath("//input[@name='passwd']/parent::*"));
		a.moveToElement(p).click();
		a.sendKeys(p, "[Wm2w8}7AHk").build().perform();
		salesforce.click(By.xpath("//input[@type='submit']"));
		Thread.sleep(30000);
		WebElement switchBtn = salesforce.findElement(By.xpath("//button//span[text()='Switch now']"));
		a.click(switchBtn).build().perform();
		salesforce.click(By.xpath("//div[@aria-label='Calls']"));
		salesforce.type("8336033889", By.xpath("//input[@placeholder='Type a name or number']"));
		Thread.sleep(2000);
		salesforce.click(By.xpath("//button[@data-tid='call-button']"));
		Thread.sleep(30000);
		salesforce.click(By.xpath("//div[@id='hangup-button-wrapper']"));
	}
	*/
	@BeforeMethod
	public void testName() {
		System.out.println(Method.GET);
	}
	
	
	public void navigateToApp(String appName) throws InterruptedException {
		System.out.println("Navigating to App: " + appName);
		
		salesforce.click(salesforce.appLaunchMenu);		
		salesforce.click(salesforce.searchLaunchInput);	    
		salesforce.type(appName, salesforce.searchLaunchInput);
	    
	    salesforce.click(By.xpath("//div//one-app-launcher-menu-item//a[@data-label=\"" + appName + "\"]/parent::*"));
	}
	
	public void navigateToRecord(String recordId) throws Exception {
		System.out.println("Navigating to Record: " + recordId);
		
		salesforce.click(salesforce.globalSearch);		
		salesforce.click(salesforce.globalSearchInput);	    
		salesforce.type(recordId, salesforce.globalSearchInput);
		//driver.findElement(salesforce.globalSearchInput).sendKeys(recordId);
		//salesforce.click(By.xpath("//span[contains(@title,'"+recordId+"')]"));
		driver.findElement(salesforce.globalSearchInput).sendKeys(Keys.ENTER);
		if(WaitForElement("//h2//a[contains(@title,'"+recordId+"')]", 3, driver)) {
			salesforce.click(By.xpath("//h2//a[contains(@title,'"+recordId+"')]"));
		}
		else {
			System.out.println(recordId+" Record not found");
		}
	}
	
	public void closeOpenRecords() throws InterruptedException {
		//This method closed open records if any
		Actions a = new Actions(driver);
		List<WebElement> openRecords = driver.findElements(By.xpath("//button[contains(@title,'Close')]"));
		System.out.println("Open records found - "+openRecords.size());
		for(int i=0; i<openRecords.size()-1; i++) {
			System.out.println(openRecords.get(i).getText());
			a.click(openRecords.get(i)).build().perform();
			//salesforce.click(openRecords.get(i));
		}
	}
	
	public void zoomOut() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50%'");
	    Thread.sleep(2000);
	    
	}
	
	public String getCurrentApp() {
		String appName = driver.findElement(By.xpath("//*[contains(@class,'appName')]//span")).getText();
		System.out.println("Current App found "+appName);
		return appName;
	}
	
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		takeSnapShot(driver);
		screenRecorder.stopRecord();
		System.out.println("Quiting browser");
		salesforce.quit();
	}
	
	public static void takeSnapShot(WebDriver webdriver) throws Exception{
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 LocalDateTime now = LocalDateTime.now();  

		//Convert web driver object to TakeScreenshot
		TakesScreenshot screenshot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		FileUtils.copyFile(source, new File(screenshotpath+now+".png"));
		}
		
	public void makeChatterPost(String post) throws InterruptedException {
		navigateToApp("Chatter");
	}
	
}
