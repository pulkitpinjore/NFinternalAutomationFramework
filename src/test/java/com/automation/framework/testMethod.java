package com.automation.framework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import com.automation.pom.ReadExcelFile;
import com.automation.pom.baseMethods;


public class testMethod extends baseRunner {

	baseMethods baseMethod = new baseMethods(driver);
	
	//google credentials
	String gEmail = "plktschdv@gmail.com";
	String gPass = "999661553Aa@";
	
	@Test
	public void testMethod() throws Exception {
		
		System.out.println("Test");
		System.out.println(baseMethod.testVariable);
		loginToSalesforce();
		//navigateToApp("Contacts");
		//navigateToRecord("test");
		//makeAMailOnGmail("plktschdv@gmail.com", "test subject", "test body");
		//getMailBySubject("Daily Email Digest");
		//googleVoiceCall("18336034146");
		//createCase("Phone", "Test Subject latest", "Test description");
		//createOpportunity("Test Opportunity", "1000", "05/23/2025", "Qualification", "Test description");
		//createLead("Pulkit","Sachdeva","NF","Web","Test Description");
		makeChatterPost("Test Post");
	}
	
	
	public void loginToGoogle(String app) throws Exception {
		
		String url = "";
		
		if(app.equalsIgnoreCase("voice")){
			url = "https://voice.google.com";
		}
		
		if(url!="") {
		driver.get(url);	
		if(WaitForElement("//a[text()='Sign in']", 5, driver)) {
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		}
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(gEmail);
		driver.findElement(By.xpath("//div//span[text()='Next']")).click();
		
		if(WaitForElement("//div[@id='password']//input", 10, driver)) {
		driver.findElement(By.xpath("//div[@id='password']//input")).sendKeys(gPass);
		}
		driver.findElement(By.xpath("//div//span[text()='Next']")).click();
		}
		else {
			System.out.println("no url for google login");
			salesforce.quit();
		}
	}

	public void googleVoiceCall(String number) throws Exception {
		EdgeOptions op=new EdgeOptions();
        op.addArguments("use-fake-device-for-media-stream");
        op.addArguments("use-fake-ui-for-media-stream");       
        WebDriver driver = new EdgeDriver(op);
		driver.manage().window().maximize();
		loginToGoogle("voice");
		if(WaitForElement("//button[@aria-label='Got it']", 100, driver)) {
		driver.findElement(By.xpath("//button[@aria-label='Got it']")).click();
		System.out.println("clicked got it");
		}
		else {
			System.out.println("didn't clicked got it");
		}
		driver.findElement(By.xpath("//input[@placeholder='Enter a name or number']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter a name or number']")).sendKeys(number);
		if(WaitForElement("//button[contains(@aria-label,'Call')]//mat-icon[@svgicon='call']", 10, driver)) {
			driver.findElement(By.xpath("//button[contains(@aria-label,'Call')]//mat-icon[@svgicon='call']")).click();
			System.out.println("clicked call");
			}
			else {
				System.out.println("didn't clicked call");
			}
		
		Thread.sleep(30000);
		driver.findElement(By.xpath("(//button[contains(@aria-label,'call')]//mat-icon[@svgicon='call_end'])[2]")).click();
		driver.close();
	}
	
	@Test
	public void makeAMailOnGmail(String recipients, String subject, String body) throws Exception {
		String url = "https://mail.google.com";
		driver.get(url);	
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(gEmail);
		driver.findElement(By.xpath("//div//span[text()='Next']")).click();
		
		if(WaitForElement("//div[@id='password']//input", 10, driver)) {
		driver.findElement(By.xpath("//div[@id='password']//input")).sendKeys(gPass);
		}
		driver.findElement(By.xpath("//div//span[text()='Next']")).click();
		
		salesforce.click(By.xpath("//div[text()='Compose']"));
		salesforce.type(recipients,By.xpath("//input[@aria-label='To recipients']"));
		driver.findElement(By.xpath("//input[@aria-label='To recipients']")).sendKeys(Keys.ENTER);
		salesforce.click(By.xpath("//input[@name='subjectbox']"));
		salesforce.type(subject, By.xpath("//input[@name='subjectbox']"));
		salesforce.type(body, By.xpath("//div[@aria-label='Message Body']"));
		salesforce.click(By.xpath("//div[@aria-label='Send']"));
		driver.close();
		
	}
	
	public void getMailBySubject(String subject) throws Exception {
		String url = "https://mail.google.com";
		driver.get(url);	
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(gEmail);
		driver.findElement(By.xpath("//div//span[text()='Next']")).click();
		
		if(WaitForElement("//div[@id='password']//input", 10, driver)) {
		driver.findElement(By.xpath("//div[@id='password']//input")).sendKeys(gPass);
		}
		driver.findElement(By.xpath("//div//span[text()='Next']")).click();
		List<WebElement> mails = salesforce.findElements(By.xpath("//span[text()='"+subject+"']//parent::div"));
		if(mails.size()>0) {
		String mailContent = salesforce.findElement(By.xpath("//span[text()='"+subject+"']//parent::div")).getText();
		System.out.println("mail body = "+mailContent);
		}
		else {
			System.out.println("Mail not found");
		}
	}
	
}
