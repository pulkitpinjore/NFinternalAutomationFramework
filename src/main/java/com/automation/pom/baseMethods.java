package com.automation.pom;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.collections4.CollectionUtils;
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class baseMethods {

	public String testVariable = "testVariable";
	
	
	
	
	
	//import io.github.bonigarcia.wdm.WebDriverManager;

		ReadExcelFile readExcelFile;
		WriteExelFile writeExelFile = new WriteExelFile();
		protected String filepath = "./src/main/resources/externalDataBase/ToyotaAutomationTestQA-DB.xlsx";

		public WebDriver driver;
		

		
		public baseMethods(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}

		public void writeCellValue(String sheetName, int row, int cell, String value) throws IOException {
			writeExelFile.writeExcelValue(filepath, sheetName, row, cell, value);
		}

		public WebElement findElement(By locator) {
			return driver.findElement(locator);
		}

		public List<WebElement> findElements(By locator) {
			return driver.findElements(locator);
		}

		public String getText(WebElement element) {
			return element.getText();
		}

		public String getText(By locator) {
			return driver.findElement(locator).getText();
		}

		public String getTitle() {
			return driver.getTitle();
		}

		public String getAttribute(By locator, String attribute) {
			return driver.findElement(locator).getAttribute(attribute);
		}
		public String getCssValue(By locator, String attribute) {
			return driver.findElement(locator).getCssValue(attribute);
		}
		public void type(String inputText, By locator) throws InterruptedException {

			Thread.sleep(1000);
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20L))
					.pollingEvery(Duration.ofSeconds(1L)).ignoring(NoSuchElementException.class);

			WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(locator);
				}
			});
			webElement.sendKeys(inputText);

		}

		public void type(String inputText, WebElement locator) throws InterruptedException {

			Thread.sleep(1000);
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20L))
					.pollingEvery(Duration.ofSeconds(1L)).ignoring(NoSuchElementException.class);

			WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return locator;
				}
			});
			webElement.sendKeys(inputText);
		}

		public void type(List<String> inputText, By locator) {
			for (String text : inputText) {
				driver.findElement(locator).sendKeys(text);
			}
		}

		public void typeWhenBeDisplayed(String inputText, By locator) throws InterruptedException {
			driver.findElement(locator).sendKeys(inputText);
		}

		public void typeWhenBeDisplayed(String inputText, WebElement locator) throws InterruptedException {
			locator.sendKeys(inputText);
		}

		public void clickWhenBeDisplayed(By locator) throws InterruptedException {
			Thread.sleep(1000);
			driver.findElement(locator).click();
		}

		public void clickWhenBeDisplayed(WebElement locator) throws InterruptedException {
			locator.click();
		}

		public void click(WebElement locator) throws InterruptedException {
			Thread.sleep(1000);
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20L))
					.pollingEvery(Duration.ofSeconds(1L)).ignoring(NoSuchElementException.class);

			WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return locator;
				}
			});
			webElement.click();

		}

		public void click(By locator) throws InterruptedException {
			Thread.sleep(1000);
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50L))
					.pollingEvery(Duration.ofSeconds(1L)).ignoring(NoSuchElementException.class);

			WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(locator);
				}
			});
			webElement.click();
		}

		public void doubleClick(By locator) {
			Actions act = new Actions(driver);
			WebElement locatorElement = driver.findElement(locator);
			act.doubleClick(locatorElement).perform();
		}

		public Boolean isDispleyed(By locator) {
			try {
				return driver.findElement(locator).isDisplayed();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				return false;
			}
		}

		public Boolean isDispleyed(WebElement locator) {
			try {
				return locator.isDisplayed();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				return false;
			}
		}

		public Boolean isEnable(By locator) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20L))
					.pollingEvery(Duration.ofSeconds(1L)).ignoring(NoSuchElementException.class);
			try {
				WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						return driver.findElement(locator);
					}
				});
				return webElement.isEnabled();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("it is not enable");

				return false;
			}
		}

		public Boolean isEnable(WebElement locator) {
			try {
				return locator.isEnabled();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("it is not enable");

				return false;
			}
		}

		public void visit(String url) {
			driver.get(url);
		}

		public void clear(By locator) {
			driver.findElement(locator).clear();
		}

		public void submit(By locator) {
			driver.findElement(locator).submit();
		}

		public void enter(By locator) {
			driver.findElement(locator).sendKeys(Keys.ENTER);
		}

		public void close() {
			driver.close();
		}

		public void quit() {
			driver.quit();
		}

		public String getUrl() {
			return driver.getCurrentUrl();
		}

		public void maximize() {
			driver.manage().window().maximize();
		}

		public void refreshPage() {
			driver.navigate().refresh();
		}

		public void moveTo(By locator) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement locatorMove = driver.findElement(locator);
			js.executeScript("arguments[0].scrollIntoView(true);", locatorMove);
		}

		public void moveToElement(By xpath) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(xpath);
			js.executeScript("arguments[0].scrollIntoView();", element);
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(350,0)", "");
			 */
		}

		public void closeNewTab() throws InterruptedException {
			ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
			// switch to new tab
			driver.switchTo().window(newTab.get(newTab.size() - 1));
			System.out.println("Page title of new tab: " + driver.getTitle());
			Thread.sleep(3000);
			driver.close();
			// switch to parent window
			driver.switchTo().window(newTab.get(0));
			System.out.println("Page title of parent window: " + driver.getTitle());
		}

		public void clickOnFrame(By frame, By element) {
			WebElement searchElement = driver.findElement(frame);
			driver.switchTo().frame(searchElement).findElement(element).click();
		}

		public boolean isDisplayedOnFrame(By frame, By locator) {
			String actualFrame = driver.getWindowHandle();
			WebElement searchElement = driver.findElement(frame);
			try {
				boolean flag = driver.switchTo().frame(searchElement).findElement(locator).isDisplayed();
				driver.switchTo().window(actualFrame);
				return flag;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO: handle exception
				driver.switchTo().window(actualFrame);
				return false;
			}
		}

		public void writeCase(String description, int position, String caseNumber) throws IOException {
			writeCellValue("CasesRecords", position, 0, description);
			writeCellValue("CasesRecords", position, 1, caseNumber);
		}

		public void writeCaseOnTab(String Tab, int position, String caseNumber) throws IOException {

			writeCellValue(Tab, position, 1, caseNumber);
		}

		public void writeCase(String description, int position, int col, String caseNumber) throws IOException {
			writeCellValue("CasesRecords", position, col, description);
			writeCellValue("CasesRecords", position, col + 1, caseNumber);
		}

		public void openNewTab() {
			String a = "window.open('', '_blank');"; // replace link with your desired link
			((JavascriptExecutor) driver).executeScript(a);
		}

		public void switchNextTab(WebDriver driver) {
			focusNextTab();
		}

		public void switchPreviousTab(WebDriver driver) {
			focusPreviousTab();
		}

		public void focusNextTab() {
			ArrayList tabs = new ArrayList(driver.getWindowHandles());
			String tab1 = (String) tabs.get(currentTab() + 1);
			driver.switchTo().window(tab1);
		}

		public void focusPreviousTab() {
			ArrayList tabs = new ArrayList(driver.getWindowHandles());
			String tab1 = (String) tabs.get(currentTab() - 1);
			driver.switchTo().window(tab1);
		}

		public void focusCurrentTab() {
			ArrayList tabs = new ArrayList(driver.getWindowHandles());
			String tab1 = (String) tabs.get(currentTab());
			driver.switchTo().window(tab1);
		}
		public WebElement focusCurrentElement() {
			 return driver.switchTo().activeElement();
		}

		public String getTestOrg() throws IOException {
			readExcelFile = new ReadExcelFile();
			String strOrgTest = readExcelFile.getCellValue(filepath, "Values", 16, 1);
			return strOrgTest;
		}

		public String getSomeValue(String tabName, int row, int column) throws IOException {
			readExcelFile = new ReadExcelFile();
			String value = readExcelFile.getCellValue(filepath, tabName, row, column);
			return value;
		}

		public int currentTab() {
			String currentTab = driver.getWindowHandle();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			return tabs.indexOf(currentTab);
		}

		public void backPage() {
			driver.navigate().back();
		}

		public void forwardPage() {
			driver.navigate().forward();
		}

		public void focusTab(int tab) {
			ArrayList tabs = new ArrayList(driver.getWindowHandles());
			String tab1 = (String) tabs.get(tab);
			driver.switchTo().window(tab1);
		}

		public int sizeTab() {
			ArrayList tabs = new ArrayList(driver.getWindowHandles());
			return tabs.size();
		}

		public void closeLastTab() {
			ArrayList tabs = new ArrayList(driver.getWindowHandles());
			String tab1 = (String) tabs.get(tabs.size() - 1);
			driver.switchTo().window(tab1);
			driver.close();
		}

		public void scrollElementLeft(String elementClass, int x) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementsByClassName('" + elementClass + "')[0].scrollLeft += " + x + ";");
		}

		public void scrollElementDown(String elementClass, int y) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementsByClassName('" + elementClass + "')[0].scrollBy(0," + y + ");");
		}

		public void windowScroll(int y) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + y + ")");
		}

		public void sendKey(By locator, CharSequence... keysToSend) {
			driver.findElement(locator).sendKeys(keysToSend);
		}

		public void sendKeyTobody(CharSequence... keysToSend) {
			driver.findElement(By.xpath("//body")).sendKeys(keysToSend);
		}

		public String buildLinkQA(String id) throws IOException {
			String Link = getSomeValue("Links", 76, 3) + id+"/view";
			return Link;
		}

		public String buildLinkStaging(String id) throws IOException {
			String Link = getSomeValue("Links", 77, 3) + id+"/view";

			return Link;
		}
		public String buildKnowledgeLinkQA(String id) throws IOException {
			String Link = getSomeValue("Links", 78, 3) + id+"/view";
			return Link;
		}
		public String buildKnowledgeLinkStaging(String id) throws IOException {
			String Link = getSomeValue("Links", 79, 3) + id+"/view";

			return Link;
		}
		
		/*public static String getPdfContentLocal(String url) throws IOException {

			URL pdfURL = new URL(url);
			InputStream is = pdfURL.openStream();
		//	BufferedInputStream bis = new BufferedInputStream(is);
			PDDocument doc = PDDocument.load(bis);
			PDFTextStripper strip = new PDFTextStripper();
			String stripText = strip.getText(doc);
			System.out.println(stripText);
			doc.close();
			return stripText;
		}

		public static String readPdfContentURL(String url) throws IOException {

			URL pdfUrl = new URL(url);
			InputStream in = pdfUrl.openStream();
			//BufferedInputStream bf = new BufferedInputStream(in);
			PDDocument doc = PDDocument.load(bf);
			PDFTextStripper pdfStrip = new PDFTextStripper();
			pdfStrip.setStartPage(2);
			String content = pdfStrip.getText(doc);
			doc.close();

			return content;
		}*/

		/*public static int getPageCount(PDDocument doc) {
			// get the total number of pages in the pdf document
			int pageCount = doc.getNumberOfPages();
			return pageCount;

		}*/

		public String getIdRecord() {
			String idRecord = driver.getCurrentUrl().split("/")[6];
			System.out.println(idRecord);
			return idRecord;
		}

		public int foundCaseinCaseInformationQA(String file, String caseId) throws IOException {
			int position = 0;
			ReadExcelFile r = new ReadExcelFile();
			int lastRow = r.getLastRowNumber(file, "CaseInformationQA");
			for (int x = 0; x <= lastRow; x++) {
				if (r.getCellValueInt(file, "CaseInformationQA", x, 2).equals(caseId)) {
					position = x;
				}
			}
			return position;
		}

		public int foundCaseinCaseInformationStaging(String file, String caseId) throws IOException {
			int position = 0;
			ReadExcelFile r = new ReadExcelFile();
			int lastRow = r.getLastRowNumber(file, "CaseInformationStaging");
			for (int x = 0; x <= lastRow; x++) {
				if (r.getCellValueInt(file, "CaseInformationStaging", x, 2).equals(caseId)) {
					position = x;
				}
			}
			return position;
		}
		public String getSomeValue1(String tabName, int row, int column, boolean returnInt) throws IOException {
			readExcelFile = new ReadExcelFile();
			String value = "";
			if (returnInt) {

				value = String.valueOf(readExcelFile.getCellValueInt(filepath, tabName, row, column));

			} else {

				value = readExcelFile.getCellValue(filepath, tabName, row, column);

			}

			return value;
		}
				public void alertaccept() {
			try {
		        Alert alert = driver.switchTo().alert();		
		        alert.accept();	}
				catch(UnhandledAlertException e)
				{
					Alert alert = driver.switchTo().alert();		
			        alert.accept();
				}
		}
	public void ScrollToElement(WebElement element) throws Exception
	    {

	        try
	        {

	            WaitForElement(element, 30);

	            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
	            int position = element.getLocation().y - 200;
	    		((JavascriptExecutor) driver).executeScript("window.scroll(0," + position + ")");
	            //Coordinates coordinate = ((Locatable) element).getCoordinates();
	            //Point cord = element.getLocation();
	            //cord.getY();
	            //- 300;
	            //Locatable

	            //Point coordinates = element.getLocation();

	            //Robot 
	            //robot.mouseWheel(1);



	            //coordinate.onPage();
	            //coordinate.onScreen();
	            //coordinate.inViewPort();

	            System.out.println("Successfully scrolled untill element.");

	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	            System.out.println("Unable to scroll until elemnt");
	        }
	    }
	public boolean WaitForElement(WebElement elmnt, long waitingTimeinsec) throws Exception
	{
	     try {

	        driver.manage().timeouts().implicitlyWait(waitingTimeinsec,TimeUnit.SECONDS);

	         if (elmnt.isDisplayed())
	         {
	             System.out.println("WaitForElement:Success:"+elmnt.toString());
	             return true;
	         }
	         else
	         {
	             System.out.println("Unsuccess: WaitForElement: Failure:"+elmnt.toString());
	             return false;
	         } 
	    }
	     catch(NoSuchElementException e)
	     {
	    		String xpath = "";

	         e.printStackTrace();
	         System.out.println("Exception inside WaitForElement:"+ xpath);
	         return false;
	     }
	 }
		
	public Boolean isSelect(By locator) {
		try {
			return driver.findElement(locator).isSelected();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// TODO: handle exception
			return false;
		}
	}

	/*public void WaitForPageToLoad(int timeOutInSeconds) throws Exception {

		String command = "return document.readyState";

		try {
			for (int i = 0; i < timeOutInSeconds; i++) {
				try {
					Thread.sleep(1000L);
				} catch (InterruptedException e) {
					System.out.println("Unable to load the webpage");

				}

				if (driver.executeScript(command).toString().equals("complete")) {
					// System.out.println("Inside WaitForPageToLoad(Success)");
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	public void scrollTo(By e, String element) throws Exception {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", e);
			
		} catch (Exception exc) {
			
			throw new Exception(exc + "Exception on scroll to element" + element);

		}

	}
	public boolean WaitForElement(String xpath, long waitingTimeinsec) throws Exception {
		try {

			driver.manage().timeouts().implicitlyWait(waitingTimeinsec, TimeUnit.SECONDS);
			List<WebElement> myDynamicElement = driver.findElements(By.xpath(xpath));
			if (myDynamicElement.size() > 0) {
				System.out.println("Success: WaitForElement->Number of Element present is: " + myDynamicElement.size()
						+ "Xpath is:" + xpath);
				return true;
			} else {
				System.out.println("Unsuccess: WaitForElement->Number of Element present is: " + myDynamicElement.size()
						+ "Xpath is:" + xpath);
				return false;
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("Exception inside WaitForElement:" + xpath);
			return false;
		}
	}
	public void waitForInvisibilityOfElement(By xpath) throws Exception {

		try {
			
			
			WebDriverWait waitSelenium = new WebDriverWait(driver, Duration.ofSeconds(60));
			waitSelenium.until(ExpectedConditions.invisibilityOfElementLocated(xpath));
				
			}

		 catch (Exception exc) {
			exc.printStackTrace();
			throw new Exception(exc + "Exception on waiting for webelement");

		}
	}
	public ArrayList<String> getData(String sheetname, String section) throws IOException {
		ArrayList<String> a = new ArrayList<>();
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets(); // sheet will have all the rows

		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetname)) {

				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();

				int k = 0;
				int column = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase(section)) {
						// desired column
						column = k;
					}
					k++;
				}
				System.out.println(column);

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column) != null) {

						a.add(r.getCell(column).getStringCellValue());
						a.remove("");

					}

					else {
						break;
					}
				}

			}
		}
		return a;
	}
	public boolean ValidateTexts_Excel(By xpath,String sheetname,String SectionName) throws IOException, Exception {
		List<WebElement> substatusvalues = driver.findElements(xpath);
		List<String> Webelementsection_actuallist = substatusvalues.stream().map(s -> s.getText())
				.map(s -> s.trim()).collect(Collectors.toList());
		substatusvalues.stream().map(s -> s.getAttribute("innerText")).map(s -> s.trim())
		.forEach(s -> System.out.println(s));
		List<String> casedetails_section = getData(sheetname, SectionName);
		List<String> trimmedData = casedetails_section.stream()
		        .map(String::trim)
		        .collect(Collectors.toList());
		System.out.println(casedetails_section);

		boolean flag = Webelementsection_actuallist.equals((casedetails_section));
		System.out.println(flag);
		return flag;
		
	}
	public int URLresponsecode(String url) throws Exception {
		HttpsURLConnection conn=(HttpsURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode +"Response Code of URL");
		return respCode;
		
	}
	public void validatecolour(By xpath,String colourname,String htmlTag) {
		WebElement t = driver.findElement(xpath);
		String s=null;
	    //obtain color in rgba
		if(htmlTag.equals("textcolor")) {
	    s = t.getCssValue("color");
		}
		else if(htmlTag.equals("backgroundcolor")) {
		    s = t.getCssValue("background-color");
			}
	    // convert rgba to hex
	    String colour = Color.fromString(s).asHex();
	    System.out.println(colour);
	    Assert.assertTrue(colour.equals(colourname),"Colour is not displayed");

	    
	}

	
}
