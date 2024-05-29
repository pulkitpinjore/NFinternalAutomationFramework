package com.automation.pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.HashSet;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections4.CollectionUtils;
//import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.interactions.Actions;

import com.automation.pom.AplicationConstants;
import com.automation.pom.DBConstants;

public class SalesfoceObjectPage extends baseMethods {

	public By userNameLogin = By.xpath("//input[@id=\"username\"]");
	public By passWord = By.xpath("//input[@id=\"password\"]");
	public By loginButton = By.xpath("//input[@id=\"Login\"]");
	public By iframeLogin = By.xpath("//div[@class='content iframe-parent']//iframe");
	public By iframeTableu = By.xpath(AplicationConstants.XPATH_IFRAME_TABLEU);
	public By loginButtonUserSFiframe = By.xpath("//td[@id='topButtonRow']//input[4]");
	public By logoutAsButton = By.xpath(AplicationConstants.LOG_OUT_AS_LINK);
	public By userForgeRock = By.xpath(AplicationConstants.XPATH_FORGE_ROCK_ACCESS_USER);
	public By passwordFogeRock = By.xpath(AplicationConstants.XPATH_FORGE_ROCK_ACCESS_PASSWORD);
	public By loginButtonFogeRock = By.xpath(AplicationConstants.XPATH_FORGE_ROCK_ACCESS_LOGIN_BUTTON);
	public By globalActions = By.xpath(AplicationConstants.XPATH_GLOBAL_ACTIONS_ICON);
	public By viewAllHyperlink = By.xpath(AplicationConstants.XPATH_VIEW_ALL_HYPERLINK);
	By globalsearch = By.xpath("//*[@id=\"oneHeader\"]/div[2]/div[2]/div/button");
	By globalSearchTxt = By.xpath("//*[@id=\"input-94\"]");

	// header tabs
	public By itemSelected = By.xpath(AplicationConstants.SELECTED_LIST_ITEM);
	public By lastTabOpen = By.xpath(AplicationConstants.LAST_TAB);
	public By closeTabIcon = By.xpath("//ul[contains(@class,'tabBarItems')]//button[contains(@title, 'Close')]");
	// SUBTABS
	public By subtab1 = By.xpath(AplicationConstants.XPATH_SUBTAB_ONE);
	public By subtab2 = By.xpath(AplicationConstants.XPATH_SUBTAB_TWO);

	By searchMenu = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div/div[1]/div[1]/div/div[3]/div/button");
	public By navigationMenu = By.xpath("//span[text()='Show Navigation Menu']//ancestor::button[1]");
	public By casesOpt = By.xpath(
			"//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity'][normalize-space()='Cases']");
	By optCase = By.xpath("//*[@id=\"navMenuList\"]/div/ul/li[4]/div/a");
	By lstViews = By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div");
	By lstViewsAdm = By.xpath(
			"//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/h1/span[2]");

	By searchLstCase = By.xpath("//input[@aria-owns='virtualAutocompleteListbox_39e6db73a1358']");
	public By searchlist1 = By.xpath(
			"//span[@class=\"triggerLinkText selectedListView slds-page-header__title slds-truncate slds-p-right--xx-small uiOutputText\"]");
	public By searchInput = By.xpath("//div[@class=\"panel-content scrollable\"]/descendant::input");
	By lstViewCase = By.linkText("All Cases Autotest");
	By lstViewCaseStaging = By.linkText("All Cases Automation");
	public By lstViewDigital = By.linkText("Digital Communication");
	public By lstViewFirstResult = By.xpath("//div[@class='listContent']//a[1]");
	// COMPONENTS LIST VIEW CASE TABLE
	public By caselink = By.xpath(AplicationConstants.XPATH_CASE_VIEW_TABLE_CASE_NUMBER);
	By lstViewDigitalwithoutParner = By.linkText("All Case without Parent");
	By searchCaseField = By.xpath("//input[@name='Case-search-input']");
	By caseId = By.xpath(
			"//*[@id=\"brandBand_1\"]/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/th/span");
	public By caseID1 = By.xpath("//a[@data-refid='recordId'][1]");
	By vinFieldSfdc = By.xpath(
			"//*[@id=\"sectionContent-293\"]/div/slot/force-record-layout-row[2]/slot/force-record-layout-item[2]/div/div/div[1]/span");
	By userGmail = By.id("identifierId");
	By userButtonNext = By.xpath("//*[@id='identifierNext']/div/button");
	By passwordGmail = By.xpath("//*[@id='password']/div[1]/div/div[1]/input");
	By passwordButtonNext = By.xpath("//*[@id='passwordNext']/div/button");
	By globalSearchGmail = By.xpath("//input[@aria-label='Buscar en el correo electrónico']");
	By resultGmail = By.xpath("//*[@id='gs_ars50_1']/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[1]/div");

	By subjectfield = By.xpath("//*[@id=\":95\"]");
	By subjecrFieldtoyota = By.xpath("//*[@id=\":2z\"]/img");
	By goAddessGmail = By
			.xpath("//*[@id=\":co\"]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/h3/span/span[2]");

	By resultglobalsearch = By.xpath("//*[@id=\"gs_atqs50_0\"]/table/tbody/tr[1]/td[2]/div");
	By toyotaModelYearNewButton = By.xpath("//*[contains(@title,'New')]");
	By idFieldDCListView = By.xpath(
			"//*[@id=\"brandBand_1\"]/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/thead/tr/th[3]/div/a");

	By editFieldCase = By.xpath("//button[@title='Edit Sub Type']");
	By subStatusField = By.xpath("//input[@role='combobox']//following::input[10]");
	By subStatusFieldQA = By.xpath("//button[@aria-haspopup='listbox']//following::button[10]");

	By editFieldCaseowner = By.xpath("//button[@title='Edit Status']");
	By statusField = By.xpath("//button[@aria-haspopup='listbox']//following::button[8]");
	By statusFieldQA = By.xpath("//label[text()='Status']//ancestor::lightning-combobox//button");
	By statusFieldStaging = By.xpath("//button[@type=\"button\"]//following::button[51]");
	By subTypeField = By.xpath("//input[@role='combobox']//following::input[5]");

	By caseWithoutParnert = By.xpath(
			"//*[@id=\"brandBand_1\"]/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[1]/th");
	By caseWithoutParner = By.xpath("//a[@data-refid='recordId']//following::a[4]");
	By editBtn = By.xpath("//button[@title='Edit Parent Case']");
	By parnerField = By.xpath("//label[text()='Parent Case']//ancestor::lightning-grouped-combobox//input");

	By parnerSelectionField = By
			.xpath("//a[@data-refid='recordId']//following::a[@data-aura-class='forceOutputLookup']");

	By typeField = By.xpath("//input[@role='combobox']//following::input[6]");
	By cancelBtn = By.xpath("//button[@type='button']//following::button[44]");
	By cancelBtnQA = By.xpath("//button[@name='CancelEdit']");

	By caseNumber = By.xpath("//span[@class='slds-grid slds-grid--align-spread']//following::a[1]");
	By caseNumberwithoutCase = By.xpath("//a[@data-aura-class='forceOutputLookup']//following::a[5]");
	By priorityField = By.xpath("//div[@class='slds-form-element__control']//following::span[3][contains(.,'High')]");

	By createDealerOpenButton = By.xpath("//button[@name='Case.Create_Dealer_Open1']");
	By createDealerOpenButtonQA = By.xpath("//button[@type='button']//following::button[.='Create Dealer Open']");
	By nextButtonPopup = By.xpath("//button[@type='button']//following::button[.='Next']");

	By comentMenuButton = By.xpath("//a[@role='button']//following::a[contains(.,'Case Comments')]");
	By newCommentButton = By.linkText("New");
	By bodyTextArea = By.xpath("//textarea[@class=' textarea']");
	public By saveCommentButton = By.xpath("//button[@title='Save']");

	By profileIcon = By.xpath("//span[@data-aura-class='forceSocialPhoto']");
	By logOutHiperLink = By.xpath("//a[@class='profile-link-label logout uiOutputURL']");
	By moreOptionMenue = By.xpath("//a[@role='button']//following::a[50]");
	By moreOptionMenuStaging = By.xpath("//tbody/tr[1]/td[5]/span[1]/div[1]/a[1]/span[1]/span[1]");
	By deleteCommentButton = By.xpath("//a[@title='Delete']");
	By deleteCommentButtonPopup = By.xpath("//button[@title='Delete']");

	By vehicleIdentificationField = By
			.xpath("//span[text()='Vehicle Identification #']//ancestor::div[2]//span//slot//lightning-formatted-text");
	By firstNameField = By.xpath("//span[text()='First Name']//ancestor::div[2]//span//slot//lightning-formatted-text");
	By lastNameField = By.xpath("//span[text()='Last Name']//ancestor::div[2]//span//slot//lightning-formatted-text");
	By emailField = By
			.xpath("//span[text()='Web Email']//ancestor::div[2]//span//slot//emailui-formatted-email-wrapper");// this
																												// is a
																												// previews
																												// fiel
																												// need
																												// verify
	By phoneField = By.xpath("//span[text()='Web Phone']//ancestor::div[2]//span//slot//lightning-formatted-text");

	By moreOptionManu = By.xpath("//span[text()='Show more actions']//ancestor::button");
	By editOpt = By.xpath("//button[text()='Edit']");

	By typeDCField = By.xpath("//a[text()='Digital Communication']");
	By CaseManagerOpt = By.xpath("//a[@title='Case Management']");

	By SubtypeW2C = By.xpath("//span[text()='Sub Type']//following::a[text()='--None--'][2]");
	By subTypeW2CB = By.xpath("//label[text()='Sub Type']//ancestor::lightning-combobox//button");
	By telematicOpt = By.xpath("//span[text()='Telematics Registration']//ancestor::lightning-base-combobox-item");

	By saveBtn = By.xpath("//button[@title='Save']");
	public By saveEditButton = By.xpath("//button[@name='SaveEdit']");

	By savecon = By.xpath("//button[@name='save']");

	By jiraStatusfield = By.xpath("//span[text()='Jira Status']//ancestor::div[2]//lightning-formatted-text");
	By dealershipField = By.xpath("//span[normalize-space()='Dealership']");
	By caseSourceField = By.xpath("//label[text()='Status']");
	By openJiraStatusField = By.xpath("//span[text()='Open']//ancestor::button[@aria-label='Jira Status, Open']");

	By inProgressJiraStatusField = By
			.xpath("//span[text()='In Progress']//ancestor::button[@aria-label='Jira Status, In Progress']");
	By inProgressOpt = By.xpath("//span[@title='In Progress']//ancestor::lightning-base-combobox-item");
	By openOpt = By.xpath("//span[@title='Open']//ancestor::lightning-base-combobox-item");

	By moreOptionMenu = By.xpath("//button[@title='More Tabs']/parent::lightning-button-menu");
	public By jiraTab = By.xpath("//div//ul//li[@title='JIRA']"); // Updated by Parth Mutreja
	public By createJiraTicketButton = By.xpath("//button[@title='Create JIRA Ticket']");

	By setupIcon = By.xpath("//a[contains(@class,'menuTriggerLink ')]");
	// updated xpath
	// By setup = By.id("all_setup_home");

	By searchSetup = By.xpath("//input[@title='Search Setup']");
	By loginButtonUser = By.xpath("//td[@id=\"topButtonRow\"]/descendant::input[@value=\" Login \"]");
	By globalCreateTrigger = By.xpath("//a[contains(@class,'globalCreateTrigger')]");
	By createCaseFromGlobalActions = By.xpath("//span[text()='Create Case']/parent::a");

	By editTypeButton = By.xpath("//slot[lightning-formatted-text='Digital Communication']//ancestor::div[1]//button");
	By editTenlematicTypeButton = By
			.xpath("//slot[lightning-formatted-text='Telematics Registration']//ancestor::div[1]//button");
	By tele = By.xpath("//button[@data-value=\"Telematics Registration\"]");
	By editiconSubtype = By.xpath("//button[@aria-label=\"Sub Type, --None--\"])");
	By editCaseManagementTypeButton = By
			.xpath("//slot[lightning-formatted-text='Case Management']//ancestor::div[1]//button");
	By casemanagementLabel = By.xpath("//lightning-formatted-text[text()='Case Management']");
	By digitalcommunicationField = By.xpath("//button[@aria-label='Type, Digital Communication']");
	By caseManagentOpt = By.xpath("//span[@title='Case Management']//ancestor::lightning-base-combobox-item");

	By phoneNumberField = By.xpath("//input[@name='Phone_Model__c']");
	By browserField = By.xpath("//input[@name='Web_Browser__c']");
	By toyotaWebField = By.xpath("//input[@name='Toyota_Website__c']");
	By softwareVertionField = By.xpath("//input[@name='phone_software_version__c']");
	By BrowserOtherField = By.xpath("//input[@name='Browser_Other__c']");
	By DealershipNameField = By.xpath("//input[@name='Dealership_Name__c']");
	By WebsiteURLField = By.xpath("//input[@name='Website_URL__c']");
	By DealershipStateField = By.xpath("//input[@name='Dealership_State__c']");
	By DealershipContactField = By.xpath("//input[@name='Dealership_Contact__c']");

	public By VinNumberField = By.xpath("//input[@name='VIN']");

	By remoteFunction = By
			.xpath("//label[text()='Remote Function']//ancestor::lightning-combobox//lightning-base-combobox//button");
	By remoteFunctionOpt = By.xpath("//span[text()='Remote Start/Stop']//ancestor::lightning-base-combobox-item");

	By vpCategoryField = By.xpath("//button[@aria-label='VP Category, --None--']");
	By vpCategoryOpt = By.xpath("//span[text()='SOS LED Red']//ancestor::lightning-base-combobox-item");

	By MobileOSVersionField = By.xpath("//input[@name='ccm_Mobile_OS_Version__c']");

	// Jira fields section
	By shortDescriptionTextArea = By.xpath("//label[text()='Short Description']//following::textarea[1]");
	By JiraDescription = By.xpath("//label[text()='Jira Description']//following::textarea[1]");
	By customerEmailCTP = By.xpath("//label[text()='Customer Email in CTP']//following::input[1]");
	By mobileVertion = By.xpath("//label[text()='Mobile App Version']//following::input[1]");
	By MobileOSPicklist = By.xpath("//button[@aria-label='Mobile OS, --None--']");
	By iOSOpt = By.xpath("//span[@title='iOS']//ancestor::lightning-base-combobox-item");
	public By jiraSourcePicklist = By.xpath("//select[@name=\"CCM_Jira_Source\"]");
	public By jiraSourceOpt = By.xpath("//option[text()='Phone']");
	public By jiraSourceEmailOpt = By.xpath("//option[text()='Email']");
	public By jiraSourceAppOpt = By.xpath("//option[text()='InApp Feedback']");
	public By createJiraButton = By.xpath(AplicationConstants.XPATH_CREATE_JIRA_TICKET_BUTTON);
	public By startJiraButton = By.xpath(AplicationConstants.XPATH_START_JIRA_TICKET_BUTTON);
	public By updateJiraButton = By.xpath(AplicationConstants.XPATH_UPDATE_JIRA_TICKET_BUTTON);
public By jiratextbox =By.xpath("//input[@name=\"CCM_Jira_Key__c\"]");
public By cretaejira =By.xpath("//button[@title=\"Create JIRA Ticket\"]");
	public By generationPicklist = By.xpath("//select[@name='CCM_Generation']");
	public By generationOpt = By.xpath("//option[text()='21MM/Gen 12']");
	public By generation17cyOpt = By.xpath("//option[text()='17CY+/Gen 11']");
	public By generation17cygen10Opt = By.xpath("//option[text()='17CY/Gen 10 and prior']");
	public By generationGR86Opt = By.xpath("//option[text()='GR86']");
	public By generationSupraOpt = By.xpath("//option[text()='Supra']");

	public By JiraRegionPicklist = By.xpath("//select[@name='CCM_Jira_Region']");
	public By mexicoOpt = By.xpath("//option[text()='Mexico']");
	public By canadaOpt = By.xpath("//option[text()='Canada']");
	public By usOpt = By.xpath("//option[text()='US']");
	public By hawaiiOpt = By.className("//option[@value='Jira_Region.Hawaii']");
	public By puertoRicoOpt = By.xpath("//option[text()='Puerto Rico']");

	By nativefunction = By.xpath("//button[@aria-label='Navi Function, --None--']");
	By traficOpt = By.xpath("//lightning-base-combobox-item[@data-value='Traffic']");

	By naviSource = By.xpath("//button[@aria-label='Navi Source, --None--']");
	By naviSourceheadUnit = By.xpath("//lightning-base-combobox-item[@data-value='Head Unit']");

	By firstQuestionField = By
			.xpath("//Label[text()='What can we help you with?']//ancestor::lightning-combobox//button");
	By firstQuestionAnswer = By
			.xpath("//span[text()='Remote Connect']//ancestor::lightning-combobox//lightning-base-combobox-item[3]");

	By questionJiraField = By.xpath("//select[@name='What_can_we_help_you_with']");
	By siriusXMAnswerJira = By.xpath("//option[text()='SiriusXM']");

	By accessAppFunction = By.xpath("//span[text()='Access']//ancestor::li");
	By moveSalectionIcon = By
			.xpath("//span[text()='Access']//ancestor::div[5]//div[4]//button[@title='Move selection to Chosen']");

	By mobileAppVestion = By.xpath("//label[text()='Mobile App Version']//ancestor::lightning-input//input");
	By correspndenceTypeLabel = By.xpath("//label[text()='Correspondence Type']");

	By environmentField = By.xpath("//label[text()='Environment']//following::button[1]");
	By productionoption = By.xpath("//span[text()='Production']");

	By AudioFeature = By
			.xpath("//label[text()='Audio Feature']//ancestor::lightning-combobox//lightning-base-combobox//button");
	By traditionalOpt = By.xpath("//span[text()='Traditional']");

	By jiraBrandField = By.xpath("//label[text()='Jira Brand']//ancestor::lightning-combobox//button");
	By toyotaBraandOpt = By.xpath(
			"//label[text()='Jira Brand']//ancestor::lightning-combobox//lightning-base-combobox-item//span[text()='Toyota']");

	By jiraStatusField = By.xpath("//label[text()='Jira Status']//ancestor::lightning-combobox//button");
	By jiraOpenStatusOpt = By.xpath(
			"//label[text()='Jira Status']//ancestor::lightning-combobox//lightning-base-combobox-item//span[text()='Open']");

	By siriusXMField = By.xpath("//label[text()='SiriusXM']//ancestor::lightning-combobox//button");
	By siriusXMGeneralInfoOpt = By.xpath(
			"//label[text()='SiriusXM']//ancestor::lightning-combobox//lightning-base-combobox-item//span[text()='General Info']");

	By addcodingButton = By.xpath("(//button[text()='Add Coding'])[2]");
	By addcodingSearch = By.xpath("//h1[text()=' Quick Code']//ancestor::div[1]//input");
	By addCodingTCRopt = By.xpath("//span[text()='TCR (Reimb Use Only)']//ancestor::li");
	By addCodingSaveButton = By.xpath("//button[@title='Save Records']");

	By showMoreResults = By.xpath("//span[contains(text(),'Show more results for')]");
	public By globalSearch = By.xpath("//button[text()='Search...']");
	public By globalSearchInput = By.xpath("(//input[contains(@placeholder,'Search')])[2]");
	public By globalSearchInput_Knowledge = By.xpath("//label[text()='Search...' or text()='Search Knowledge and more']//ancestor::lightning-input//input");

	public By globalSearchI = By.xpath("//input[@placeholder='Search...']");
	public By allobjectSearch = By.xpath(AplicationConstants.XPATH_ALL_OBJECT_SEARCH);
	By TypePicklist = By.xpath("//button[@data-value=\"Digital Communication\"]");
	By CaseManage = By.xpath("//span[@title='Case Management']");
	By testNumberCase = By.xpath("//a[@data-aura-class='forceOutputLookup']//following::a[4]");
	By Whatcanhelpfield = By.xpath("//select[@name='What_can_we_help_you_with']");
	By Generation = By.xpath("//select[@name='CCM_Generation']");
	By Jirabrand = By.xpath("//select[@name=\"CCM_Jira_Brand\"]");

	By RemoteFunction = By.xpath("//select[@name=\"CCM_Remote_Function\"]");
	By remoteStartStopOpt = By.xpath("//option[text()='Remote Start/Stop']");
	By remoteLockUnlockOpt = By.xpath("//option[text()='Remote Lock/Unlock']");
	By remoteBothOpt = By.xpath("//option[text()='Both']");

	By Environment = By.xpath("//select[@name=\"CCM_Environment\"]");
	By Region = By.xpath("//select[@name=\"CCM_Jira_Region\"]");
	By ShortDescriptionxpath = By.xpath("//input[@name=\"Short_Description\"]");
	By JiraDescription1 = By.xpath("//textarea[@class=\"slds-textarea\"]");
	By CTP = By.xpath("//input[@placeholder=\"you@example.com\"]");
	By IMEIxpath = By.xpath("//input[@name=\"IMEI\"]");

	// Jira Options
	By audioOpt = By.xpath("//option[text()='Audio']");
	By navServiceOpt = By.xpath("//option[text()='Navigation Services']");
	By remoteConectOpt = By.xpath("//option[text()='Remote Connect']");
	By siriusXMOpt = By.xpath("//option[text()='SiriusXM']");
	By tyLxAppOpt = By.xpath("//option[text()='Toyota/Lexus app']");
	By vehichleOpt = By.xpath("//option[text()='Vehicle Platform']");
	By softwareDwOpt = By.xpath("//option[text()='Software Download Portal']");
	By rentalOpt = By.xpath("//option[text()='Rental']");

	By OmniChanelChat = By.xpath("//span[text()='Omni-Channel (Offline)']");
	public By statusChatMenu = By.xpath("//span[text()='Offline']//ancestor::div[1]//button");
	public By availableChatStatus = By.xpath("//span[text()='Available - Chat']//ancestor::li[1]");

	By helpDropdown = By.xpath("//span[text()='What can we help you with?']/following::select[1]");
	By jiraSourceDropdown = By.xpath("//span[text()='Jira Source']/following::select[1]");
	By generationDropdown = By.xpath("//span[text()='Generation']/following::select[1]");
	By jiraBrandDropdown = By.xpath("//span[text()='Jira Brand']/following::select[1]");
	By environmentDropdown = By.xpath("//span[text()='Environment']/following::select[1]");
	By jiraRegionDropdown = By.xpath("//span[text()='Jira Region']/following::select[1]");

	// CaseComment
	public By newComment = By
			.xpath("//div[@class='windowViewMode-maximized active lafPageHost']//button[text()='New Comment']");
	public By attachmentsTab = By
			.xpath("//div[@class='windowViewMode-maximized active lafPageHost']//a[text()='Attachments']");
	public By commentTextarea = By.xpath("//label[text()='Enter Comment']/parent::p/..//div[@role='textbox']");
	public By commentTextarea_formatted = By.xpath("//label[text()='Enter Comment']/parent::p/..//div[@role='textbox']/..//li");
	
	public By publicCommentCheckBox = By.xpath("//span[text()='Public']/preceding-sibling::span");
	By publicCommentCheckBoxQA = By.xpath("//span[text()='Public']");
	public By saveNewCommentButton = By.xpath("//span[text()='Public']/preceding-sibling::span/following::lightning-button/descendant::button[text()='Save']");//updated by Parth Mutreja

	By uploadFilesButton = By.xpath("//span[text()='Upload Files']");

	By userCommentFile = By.xpath("//lightning-base-formatted-text[text()='caseCommentTest']");
	public By agentAnswerFileArrow = By.xpath("//button[text()='Preview'][1]/following::button[1]");
	public By publicOptFileCommentDrop = By.xpath("//span[text()='Public']/parent::a[1]");
	public By privateOptFileCommentDrop = By.xpath(AplicationConstants.XPATH_PRIVATE_FILE_BUTTON);
	public By deleteOptFileCommentDrop = By.xpath(AplicationConstants.XPATH_DELETE_FILE_BUTTON);
	By viewMoreSpan = By.xpath("//span[text()='View More']");
	By caseNumberSearchInput = By.xpath("//span[text()='Case #']//parent::label/following-sibling::input");
	By searchCaseNumberButton = By.xpath("//span[text()='Case #']//parent::label/following::button[1]");
	public By navigationMenuButton = By.xpath("//button[@title='Show Navigation Menu']");
	public By homeAppOption = By.xpath("//span[text()='Home']");
	public By caseAppOpt = By.xpath(AplicationConstants.XPATH_CASE_OPT);
	public By contatsAppOpt = By.xpath(AplicationConstants.XPATH_CONTACTS_OPT);
	public By appLaunchMenu = By.xpath(AplicationConstants.XPATH_LAUNCH_MENU);
	public By searchLaunchInput = By.xpath(AplicationConstants.XPATH_INPUT_LAUNCH_FIELD);
	public By searchContactOpt = By.xpath(AplicationConstants.XPATH_SEARCH_CONTACT_OPT);

	// Search contact Page
	public By guestNameField = By.xpath(AplicationConstants.XPATH_GUEST_NAME_LABEL);
	public By vinField = By.xpath(AplicationConstants.XPATH_VIN_FIELD);

	// contacts list view elements
	public By contactName = By.xpath(AplicationConstants.XPATH_CONTACT_NAME_OPT);
	public By qContactName = By.xpath(AplicationConstants.XPATH_QqAA_CONTACT_NAME_OPT);

	// contact detail page Elements
	public By showMoreOptionsButton = By.xpath(AplicationConstants.XPATH_MORE_OPTIONS_BUTTON);
	public By salesLeadButton = By.xpath(AplicationConstants.XPATH_SALES_LEAD_BUTTON);
	public By colorField = By.xpath(AplicationConstants.XPATH_COLOR_FIELD);
	public By optionsAccField = By.xpath(AplicationConstants.XPATH_OPTIONS_ACC_FIELD);
	public By viewAllCasesButton = By.xpath(AplicationConstants.XPATH_VIEW_ALL_CASES_BUTTON);
	public By createCaseButton = By.xpath(AplicationConstants.XPATH_CREATE_CASE_BUTTON);
	public By brandPucklist = By.xpath(AplicationConstants.XPATH_BRAND_PICKLIST);
	public By toyotBrandOpt = By.xpath(AplicationConstants.XPATH_TOYOTA_BRAND_OPT);
	public By typePicklist = By.xpath(AplicationConstants.XPATH_TYPE_PICKLIST);
	public By cmTypeOpt = By.xpath(AplicationConstants.XPATH_CM_TYPE_OPT);
	public By modelField = By.xpath(AplicationConstants.XPATH_MODEL_FIELD);
	public By modelOpt = By.xpath(AplicationConstants.XPATH_MODEL_SERIE_2015_OPT);
	public By saveButton = By.xpath(AplicationConstants.XPATH_SAVE_CASE_BUTTON);
	public By cancelButton = By.xpath(AplicationConstants.XPATH_CANCEL_CASE_BUTTON);
	public By cancelEditContactButton = By.xpath(AplicationConstants.XPATH_CANCEL_BUTTON_EDIT_CONTACT);
	public By subTypePicklist = By.xpath(AplicationConstants.XPATH_SUBTYPE_PICKLIST);
	public By telematicsOpt = By.xpath(AplicationConstants.XPATH_TELEMATIC_OPT);
	public By viewAllVehicleButton = By.xpath(AplicationConstants.XPATH_VIEW_ALL_VEHICLES_BUTTON);
	public By vehicleAssociationsHyperlink = By.xpath(AplicationConstants.XPATH_VEHICLE_ASSOCIATIONS_LINK);

	// XPATH IN VEHICLE RELATED LIST FROM CONTACT
	public By vehicleAssociationsTitle = By.xpath(AplicationConstants.XPATH_VEHICLE_ASSOCIATIONS_TITLE);
	public By modelYearColumn = By.xpath(AplicationConstants.XPATH_MODEL_YEAR_COLUMN);
	public By makeColumn = By.xpath(AplicationConstants.XPATH_MAKE_COLUMN);
	public By modelColumn = By.xpath(AplicationConstants.XPATH_MODEL_COLUMN);

	// XPATH IN LIST VIEW OF CASES
	public By idCase = By.xpath(AplicationConstants.XPATH_ID_CASE);
	public By createFromCaseButton = By.xpath(AplicationConstants.XPATH_CREATE_FROM_CASES_BUTTON);
	public By caseNumberText = By.xpath(AplicationConstants.XPATH_CASE_NUMBER_TEXT);
	public By caseOwnerText = By.xpath(AplicationConstants.XPATH_CASE_OWNER_TEXT);
	public By codingTab = By.xpath(AplicationConstants.XPATH_CASE_CODING_TAB);
	public By detailsTab = By.xpath(AplicationConstants.XPATH_CASE_DETAILS_TAB);

	// XPAHT IN DETAILS PAGE FROM CASE
	public By newCommnetButton = By.xpath(AplicationConstants.XPATH_NEW_COMMENT_BUTTON);
	public By quickTextButton = By.xpath(AplicationConstants.XPATH_QUICK_TEXT_BUTTON);
	public By testQuickTextOpt = By.xpath(AplicationConstants.XPATH_TEST_QUICK_TEXT_OPTION);
	public By caseUpdateforGuest = By.xpath(AplicationConstants.XPATH_CASE_UPDATE_FOR_GUEST_OPTION);
	public By closeButton = By.xpath(AplicationConstants.XPATH_CLOSE_BUTTON);
	public By commentTextArea = By.xpath(AplicationConstants.XPATH_COMMENT_TEXTAREA);
	public By cmQuickTexts = By.xpath(AplicationConstants.XPATH_CM_QUICK_TEXTS);
	public By cmQuickTextsLink = By.xpath(AplicationConstants.XPATH_CM_QUICK_TEXTS_LINKS);
	public By quickTextFolderChatHotKeys = By.xpath(AplicationConstants.XPATH_CHAT_HOT_KEYS);
	public By quickTextCommentsMergeFields = By
			.xpath(AplicationConstants.XPATH_CHAT_HOT_KEYS_CASE_COMMENTS_MERGE_FIELDS);
	public By testQuickTextOpt_requiredDocuments = By.xpath(AplicationConstants.XPATH_TEST_QUICK_TEXT_OPTION1);
	public By testQuickTextOpt_MissingrequiredDocuments = By.xpath(AplicationConstants.XPATH_TEST_QUICK_TEXT_SubOPTION1);
	public By miraidocument =By.xpath(AplicationConstants.XPATH_TEST_QUICK_TEXT_OPTION2);
	//
	public By automationFolder = By.xpath(AplicationConstants.XPATH_AUTOMATIONTEST_FOLDER);
	public By caseMergeFieldsQuickText = By.xpath(AplicationConstants.XPATH_CASE_MERGE_FIELDS_TEXT);
	// CASE COMMENT COMPONENT
	public By lastCommentSave = By.xpath(AplicationConstants.XPATH_CASE_COMMENT_COMPONENT_COMMENT);

	// Contact detail Section
	public By addCoddingQuickCode = By.xpath(AplicationConstants.XPATH_ADD_CODING_QUICK_CODE);
	public By addCoddingCodingType = By.xpath(AplicationConstants.XPATH_ADD_CODING_CODING_TYPE);
	public By addCoddingCategory = By.xpath(AplicationConstants.XPATH_ADD_CODING_CATEGORY);
	public By addCoddingProblemArea = By.xpath(AplicationConstants.XPATH_ADD_CODING_PROBLEM_AREA);
	public By addCoddingComponents = By.xpath(AplicationConstants.XPATH_ADD_CODING_COMPONENTS);
	public By addCoddingCondition = By.xpath(AplicationConstants.XPATH_ADD_CODING_CONDITION);
	public By addCoddingPrimary = By.xpath(AplicationConstants.XPATH_ADD_CODING_PRIMARY);
	public By addCoddingSave = By.xpath(AplicationConstants.XPATH_ADD_CODING_SAVE);
	// fields Add coding lists
	public By addingCodeQuickCodeLi = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_QUICK_CODE_LI);
	public By addingCodeCodingTypeLi = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_CODING_TYPE_LI);
	public By addingCodeCategoryLi = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_CATEGORY_LI);
	public By addingCodeProblemAreaLi = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_PROBLEM_AREA_LI);
	public By addingCodeComponentsLi = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_COMPONENTS_LI);
	public By addingCodeConditionLi = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_CONDITION_LI);
	// icons
	public By addingCodeQuickCodeIcon = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_QUICK_CODE_ICON);
	public By addingCodeCodingTypeIcon = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_CODING_TYPE_ICON);
	public By addingCodeCategoryIcon = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_CATEGORY_ICON);
	public By addingCodeProblemAreaIcon = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_PROBLEM_AREA_ICON);
	public By addingCodeComponentsIcon = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_COMPONENTS_ICON);
	public By addingCodeConditionIcon = By.xpath(AplicationConstants.XPATH_ADD_CODING_MODAL_CONDITION_ICON);

	// CR Cases
	public By createFromCaseButtonCR = By.xpath(AplicationConstants.XPATH_CREATE_FROM_A_CASE_BUTTON);
	public By createButton = By.xpath(AplicationConstants.XPATH_CREATE_BUTTON);
	public By addNewCodingCRButton = By.xpath(AplicationConstants.XPATH_ADD_NEW_CODING_CR_CASE_BUTTON);

	public By newCodingQuickCode = By.xpath(AplicationConstants.XPATH_ADD_NEW_CODING_QUICK_CODE);
	public By newCodingCodingType = By.xpath(AplicationConstants.XPATH_ADD_NEW_CODING_CODING_TYPE);
	public By newCodingCategory = By.xpath(AplicationConstants.XPATH_ADD_NEW_CODING_CATEGORY);
	public By newCodingProblemArea = By.xpath(AplicationConstants.XPATH_ADD_NEW_CODING_PROBLEM_AREA);
	public By newCodingComponents = By.xpath(AplicationConstants.XPATH_ADD_CODING_COMPONENTS);
	public By newCodingCondition = By.xpath(AplicationConstants.XPATH_ADD_NEW_CODING_CONDITION);

	public By newCodingModalLi = By.xpath(AplicationConstants.XPATH_NEW_CODING_MODAL_QUICK_CODE_LI);

	public By newCodingSaveButton = By.xpath(AplicationConstants.XPATH_NEW_CODING_SAVE_BUTTON);

	// Salesforce Case details
	public By showmoreactions_contact =By.xpath("//span[text()='Show Actions']/..");
	public By editdetails_contact =By.xpath("//a[@data-target-selection-name=\"sfdc:StandardButton.Contact.Edit\"]");
	public By languagepreference =By.xpath("//button[@name=\"Language_Preference__c\"]");
	public By languagepicklist =By.xpath("//button[@name=\"Language_Preference__c\"]/following::div[2]/lightning-base-combobox-item");
	public	By cancelButton_contact =By.xpath("//button[@title=\"Close\"]");
	By caseStatusButton = By.xpath("//label[text()='Status']/following::button[1]");
	By caseStatusEditButton = By.xpath("//span[text()='Status']/following::button[1]");
	public By addCoding = By.xpath(AplicationConstants.XPATH_ADD_CODING);
	// Create case component elements
	By brandCaseCommentField = By.xpath("//h2[@title='Create Case']/following::span[text()='Brand #']/following::a[1]");
	By typeCaseCommentField = By.xpath("//h2[@title='Create Case']/following::span[text()='Type']/following::a[1]");
	By subTypeCaseCommentField = By
			.xpath("//h2[@title='Create Case']/following::span[text()='Sub Type']/following::a[1]");
	By statusCaseCommentField = By.xpath("//h2[@title='Create Case']/following::span[text()='Status']/following::a[1]");
	By contactNameCaseCommentField = By
			.xpath("//h2[@title='Create Case']/following::span[text()='Contact Name']/following::input[1]");
	By customerNameCaseCommentField = By
			.xpath("//h2[@title='Create Case']/following::span[text()='Customer Name']/following::input[1]");
	By vinCaseCommentField = By
			.xpath("//h2[@title='Create Case']/following::span[text()='Vehicle']/following::input[1]");
	By dealer1CaseCommentField = By
			.xpath("//h2[@title='Create Case']/following::span[text()='Dealer 1']/following::input[1]");
	By saveCase = By.xpath("//h2[@title='Create Case']/following::span[text()='Save'][last()]/parent::button");
	By caseCreatedAlert = By.xpath("//span[text()='Case']//a");
	public By caseNumberTab = By.xpath(
			"//div[@class='windowViewMode-maximized active lafPageHost']//p[text()='Case #']/following-sibling::p//lightning-formatted-text");

	By changeOwnerCase = By.xpath(
			"//div[@class='windowViewMode-maximized active lafPageHost']//button[@title='Change Owner'][last()]");
	By searchUserInput = By.xpath("//input[@title='Search Users']");
	By resultSearchUserInput = By.xpath("//input[@title='Search Users']/following::a[1]");
	By changeOwnerButton = By.xpath("//button[text()='Change Owner']");
	By addCodingButton = By
			.xpath("//div[@class='windowViewMode-maximized active lafPageHost']//button[text()='Add Coding']");
	public By fuelTypeRecord = By.xpath(AplicationConstants.XPATH_FUEL_TYPE_RECORD);

	// Contact detail Section

	By emailContactField = By.xpath("//span[text()='Email']");
	By alternateEmailField = By.xpath("//span[text()='Alternate Email']");
	By primaryPhoneField = By.xpath("//span[text()='Primary Phone']");
	By primaryPhoneTypeField = By.xpath("//span[text()='Primary Phone Type']");
	By alternatePhoneField = By.xpath("//span[text()='Alternate Phone']");
	By alternatePhoneTypeField = By.xpath("//span[text()='Alternate Phone Type']");
	By addressField = By
			.xpath("//span[text()='Alternate Phone']//ancestor::records-record-layout-row//span[text()='Address']");

	// contact edit
	public By countryContactEditButton = By.xpath(AplicationConstants.XPATH_COUNTRY_CONTACT_EDIT_BUTTON);
	By coField = By.xpath("//span[text()='C/O']");
	public By searchDialogFirstResult = By.xpath("//search_dialog-instant-result-item[1]");
	//
	By searchResultContactName = By
			.xpath("//span[text()='Contact Name']/following::div[contains(@class,'searchButton')][last()]");
	By searchResultCustomerName = By
			.xpath("//span[text()='Customer Name']/following::div[contains(@class,'searchButton')][last()]");
	/////////////////
	By ContactOpt = By.xpath(
			"//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity'][normalize-space()='Contacts']");
	public By Searchcontact = By.xpath("//button[@title=\"Select a List View\"]");
	By MyContact = By
			.xpath("//div[@class=\"uiInput uiAutocomplete uiInput--default uiInput--picklist\"]/descendant::li[4]");
	By ContactSearch = By.xpath("//input[@name=\"Contact-search-input\"]");
	By Contactselect = By.xpath("//table[@aria-label=\"My Contacts\"]/descendant::a[@title=\"AUTOMATION TEST\"]");
	/////////////////
	By PrimaryPhoneType = By.xpath("//button[@name=\"Primary_Phone_Type__c\"]");
	By AlternatePhoneType = By.xpath("//button[@name=\"Alternate_Phone_Type__c\"]");
	By MobileType = By.xpath("//lightning-base-combobox-item[@data-value=\"MOBILE\"]");
	By LandlineType = By.xpath("//lightning-base-combobox-item[@data-value=\"LANDLINE\"]");
	By Unknown = By.xpath("//lightning-base-combobox-item[@data-value=\"UNKNOWN\"]");
	By AltMobileType = By.xpath(
			"//button[@name=\"Alternate_Phone_Type__c\"]/following::lightning-base-combobox-item[@data-value=\"MOBILE\"]");
	By AltLandlineType = By.xpath(
			"//button[@name=\"Alternate_Phone_Type__c\"]/following::lightning-base-combobox-item[@data-value=\"LANDLINE\"]");
	By AltUnknown = By.xpath(
			"//button[@name=\"Alternate_Phone_Type__c\"]/following::lightning-base-combobox-item[@data-value=\"UNKNOWN\"]");
	By Altemail = By.xpath(
			"//span[@title=\"Communication Info\"]/following::label[text()=\"Email\"]/following::label[text()=\"Alternate Email\"]/following::input[1]");
	By Goodwill = By.xpath("//span[text()=\"Total Goodwill Offered\"]");
	By Declined = By.xpath("//span[text()=\"Remove Declined EmailID\"]");
	By secondary = By.xpath("//span[text()=\"Declined secondary phone\"]");
	By Delete = By.xpath("//span[text()=\"Delete Right Executed\"]");
	By Loyalty = By.xpath("//span[text()=\"Loyalty Score\"]");
	By User = By.xpath("//span[text()=\"User of Toyota.com\"]");
	By Optout = By.xpath("//span[text()=\"Opt out Right Executed\"]");
	By Handle = By.xpath("//span[text()=\"Social Media Handle\"]");
	By Influencer = By.xpath("//span[text()=\"Social Media Influencer\"]");
	By Attorney = By.xpath("//span[text()=\"Attorney Involved\"]");
	// Cases DR
	public By finacialProfileTab = By.xpath(AplicationConstants.XPATH_CASE_DR_VIEW_FINANCIAL_PROFILE_TAB);
	public By mileageDeductionFormulaButton = By.xpath(AplicationConstants.XPATH_MILEAGE_DEDUCTION_FORMULA);
	public By attributableMiles = By.xpath(AplicationConstants.XPATH_ATTRIBUTABLE_MILES);
	public By fullIRSRate = By.xpath(AplicationConstants.XPATH_FULL_IRS_RATE);
	public By saveFlexiblePageShow = By.xpath(AplicationConstants.XPATH_SAVE_FLEXIBLE_PAGE_SHOW);
	public By firstAttschmentBeforeCloneCase = By.xpath(AplicationConstants.XPATH_FIRST_ATTACHMENT_BEFORE_CLONE);
	public By createButtonClone = By.xpath(AplicationConstants.XPATH_CREATE_BUTTON_TO_CLONE_CASE);
	//// Contact Record vehicle associations
	public By iconLastRefresh = By.xpath(AplicationConstants.XPATH_ICON_LAST_REFRESH);
	public By updateVehicleButton = By.xpath(AplicationConstants.XPATH_UPDATE_VEHICLE_BUTTON);
	public By searchList = By.xpath(AplicationConstants.XPATH_SEARCH_LIST);
	public By syncIconButton = By.xpath(AplicationConstants.XPATH_SYNC_ICON_BUTTON);
	public By vehicleAssociationTableHeaderModelYear = By.xpath(AplicationConstants.XPATH_TABLE_HEADER_MODEL_YEAR);
	public By vehicleAssociationTableHeaderModel = By.xpath(AplicationConstants.XPATH_TABLE_HEADER_MODEL);
	public By vehicleAssociationTableHeaderMake = By.xpath(AplicationConstants.XPATH_TABLE_HEADER_MAKE);
	public By flexiblePageMain = By.xpath(AplicationConstants.XPATH_FLEXIPAGE_MAIN);

	public By viewAllCasesFromContactButton = By.xpath(AplicationConstants.XPATH_VIEW_ALL_CASES_CONTACT_BUTTON);
	public By disputeResolutionCaseViewAll = By.xpath(AplicationConstants.XPATH_DISPUTE_RESOLUTION_CASE_VIEW_ALL);
	// Case status
	public By caseTabStatusPendingCoding = By.xpath(AplicationConstants.XPATH_CASE_TAB_STATUS_PEDING_CODING);
	public By markAsCurrentStatus = By.xpath(AplicationConstants.XPATH_MARK_AS_CURRENT_STATUS_BUTTON);
	//// Records
	public By moreActionsButton = By.xpath(AplicationConstants.XPATH_MORE_ACTIONS_BUTTON);
	public By editAction = By.xpath(AplicationConstants.XPATH_EDIT_ACTION);
	public By componentCasesDataCaseNumber = By.xpath(AplicationConstants.XPATH_COMPONENT_CASES_DATA_CASE_NUMBER);
	public By printButton = By.xpath(AplicationConstants.XPATH_PRINT_BUTTON);
	public By iframePDF = By.xpath(AplicationConstants.XPATH_IFRAME_PDF);
	public By documentFormat = By.xpath(AplicationConstants.XPATH_DOCUMENT_FORMAT);

	// Home flexible page items
	public By myOpenTask = By.xpath(AplicationConstants.XPATH_FLEXIBLE_PAGE_TABSET + AplicationConstants.XPATH_NAV_BAR
			+ AplicationConstants.XPATH_NAV_BAR_ITEMS + "//a[@title='My Open Tasks']");
	public By myOpenCases = By.xpath(AplicationConstants.XPATH_FLEXIBLE_PAGE_TABSET + AplicationConstants.XPATH_NAV_BAR
			+ AplicationConstants.XPATH_NAV_BAR_ITEMS + "//a[@title='My Open Cases']");
	public By recordLink = By.xpath(AplicationConstants.XPATH_RECORD_LINK);
	public By newButton = By.xpath(AplicationConstants.XPATH_NEW_BUTTON);

	// This Xpath is part of the homa page from Case manager user
	public By tableauDashboardsTab = By.xpath(AplicationConstants.XPATH_TABLEAU_DASBOARDS_TAB);
	public By tableauDashboardsTabSup = By.xpath(AplicationConstants.XPATH_TABLEAU_DASBOARDS_TAB_SUPERVISOR);

	// these xpath are inside Tableau Dasboards Tab in the home page from DR HQ user
	public By vehiclePendingRepairDashboard = By.xpath(AplicationConstants.XPATH_VEHICLE_PENDING_REPAIR_DASHBOARD_LINK);
	public By caseByVehicleMOdelDashboard = By.xpath(AplicationConstants.XPATH_CASES_BY_VEHICLE_MODEL_DASHBOARD_LINK);
	public By caseReportDashboard = By.xpath(AplicationConstants.XPATH_CASE_REPORT_DASHBOARD_LINK);
	public By fouryearBuybackDashboard = By.xpath(AplicationConstants.XPATH_4_YEAR_BUYBACK_DASHBOARD_LINK);
	public By buybackDashboard = By.xpath(AplicationConstants.XPATH_BUYBACK_DASHBOARD_LINK);
	public By ytdOverviewDashboard = By.xpath(AplicationConstants.XPATH_YTD_OVEWRVIEW_DASHBOARD_LINK);
	public By closeVeichlePendingButton = By.xpath(AplicationConstants.XPATH_CLOSE_VEHICLE_PENDING_DASHBOARD_BUTTON);
	public By closeCaseByVehicleModelButton = By
			.xpath(AplicationConstants.XPATH_CLOSE_CASES_BY_VEHICLE_DASHBOARD_BUTTON);
	public By closeCaseReportButton = By.xpath(AplicationConstants.XPATH_CLOSE_CASE_DASBOARD_BUTTON);
	public By close4YearBuybackButton = By.xpath(AplicationConstants.XPATH_CLOSE_4_YEAR_BUYBACK_DASHBOARD_BUTTON);
	public By closeBuyBackButton = By.xpath(AplicationConstants.XPATH_CLOSE_BUYBACK_DASHBOARD_BUTTON);
	public By closeYTDOverviewButton = By.xpath(AplicationConstants.XPATH_CLOSE_YTD_OVERVIEW_DASHBOARD_BUTTON);

	// these xpath are inside Tableau Dasboards Tab in the home page from Field user
	public By myOpenCasesTab = By.xpath(AplicationConstants.XPATH_MY_OPEN_CASES_TAB);
	public By myOpenTasksTab = By.xpath(AplicationConstants.XPATH_MY_OPEN_TASKS_TAB);
	public By itemsToApproveTab = By.xpath(AplicationConstants.XPATH_ITEMS_TO_APPROVE_TAB);
	public By logOutAsButton = By.xpath(AplicationConstants.LOG_OUT_AS_LINK);
	public By caseDashboardTab = By.xpath(AplicationConstants.XPATH_CASE_DASHBOARD_TAB);

	// these xpath are inside Tableau Dasboards Tab in the home page from SUPERVISOR
	// user
	public By uTOCurrentDateDashboardLink = By.xpath(AplicationConstants.XPATH_UTP_CURRENT_DATE_DASHBOARD_LINK);
	public By pTODaySupAgentViewDashboardLink = By
			.xpath(AplicationConstants.XPATH_PTO_DAY_SUP_AGENT_VIEW_DASHBOARD_LINK);
	public By pTODashboardLink = By.xpath(AplicationConstants.XPATH_PTO_DASHBOARD_LINK);
	public By openCaseDashboardLink = By.xpath(AplicationConstants.XPATH_OPEN_CASE_DASHBOARD_LINK);
	public By openCasesAvtivitiesLink = By.xpath(AplicationConstants.XPATH_OPEN_CASE_ACTIVITIES_LINK);

	public By closeUTOCurrentDateDashboardButton = By
			.xpath(AplicationConstants.XPATH_CLOSE_UTP_CURRENT_DATE_DASHBOARD_BUTTON);
	public By closePTODaySupAgentViewDashboardButton = By
			.xpath(AplicationConstants.XPATH_CLOSE_PTO_DAY_SUP_AGENT_VIEW_DASHBOARD_BUTTON);
	public By closePTODashboardButton = By.xpath(AplicationConstants.XPATH_CLOSE_PTO_DASHBOARD_BUTTON);
	public By closeOpenCaseDashboardButton = By.xpath(AplicationConstants.XPATH_CLOSE_OPEN_CASE_DASHBOARD_BUTTON);
	public By closeOpenCasesAvtivitiesButton = By.xpath(AplicationConstants.XPATH_CLOSE_OPEN_CASE_ACTIVITIES_BUTTON);

	// these xpath are inside Tableau Dasboards Tab in the home page from case
	// managment user
	public By scheduleAdherenceDasboardLink = By.xpath(AplicationConstants.XPATH_SCHEDULE_ABHERENCE_DASBOARD_LINK);
	public By qADetailViewDashboardLink = By.xpath(AplicationConstants.XPATH_QADETAILVIEW_DASHBOARD_LINK);
	public By pTOAllotmentDashboardLink = By.xpath(AplicationConstants.XPATH_PTO_ALLOTMANT_DASBOARD_LINK);
	public By guestAvailabilityDetailDashboarLink = By
			.xpath(AplicationConstants.XPATH_GUEST_AVAILABILITY_DETAILS_DASBOARD_LINK);
	public By performanceDashboardLink = By.xpath(AplicationConstants.XPATH_PERFORMANCE_DASBOARDS_LINK);
	public By loginLogoutDashboardLink = By.xpath(AplicationConstants.XPATH_lOGINLOGOUT_DASBOARD_LINK);

	public By closeScheduleDasboardButton = By.xpath(AplicationConstants.XPATH_CLOSE_SCHEDULE_DASBOARD_BUTTON);
	public By closeQADetailDasboardButton = By.xpath(AplicationConstants.XPATB_CLOSE_QA_DETAIL_VIEW_DASBOARD_BUTTON);
	public By closePTODasboardButton = By.xpath(AplicationConstants.XPATH_CLOSE_PTO_ALLOTMENT_DASBOARD_BUTTON);
	public By closeGuestDasboardButon = By
			.xpath(AplicationConstants.XPATH_CLOSE_GUEST_AVAILABILITY_DETAILS_DASBOARD_BUTTON);
	public By closePerformanceDasboardButton = By.xpath(AplicationConstants.XPATH_CLOSE_PERFORMANCE_DASBOARDS_BUTTON);
	public By closeLoginDasboardButton = By.xpath(AplicationConstants.XPATH_CLOSE_lOGINLOGOUT_DASBOARD_BUTTON);

	// highlights contact
	public By menuContactHighlight = By.xpath(AplicationConstants.XPATH_HIGHLIGHT_MENU_BUTTON);
	public By editButton = By.xpath(AplicationConstants.XPATH_EDIT_BUTTON);
	public By editContactTab = By.xpath(AplicationConstants.XPATH_EDIT_TAB);
	// cases component contact
	public By offersLi = By.xpath(AplicationConstants.XPATH_COMPONENT_LI_OFFERS);
	public By AttachmentsLi = By.xpath(AplicationConstants.XPATH_COMPONENT_LI_ATTACHMENTS);

	public By attachmentFirstRowFileName = By
			.xpath(AplicationConstants.XPATH_COMPONENT_ATTACHMENTS_TD1_FILE_NAME_FORMATED_TEXT);
	// New Task
	public By newTaskLink = By.xpath(AplicationConstants.XPATH_NEW_TASK_LINK);
	public By logAnActivity = By.xpath(AplicationConstants.XPATH_NEW_LOG_AN_ACTIVITY_LINK);

	// TABLEU COMPONENTS
	public By tableuSingInButton = By.xpath(AplicationConstants.XPATH_TABLEU_SING_IN_BUTTON);
	public By caseReport = By.xpath(AplicationConstants.XPATH_CASE_REPORT);
	public By tableuDashboardsTab = By.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_TAB);

	public By tableuScheduleAdherenceConformanceDetailsDashboardLink = By
			.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_SCHEDULE_ADHERENCE_CONFORMANCE_DETAILS);
	public By tableuQADetailViewDashboardLink = By.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_QA_DETAIL_VIEW);
	public By tableuPTOAllotmentDashboardLink = By.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_PTO_ALLOTMENT);
	public By tableuGuestAvailabilityDetailsDashboardLink = By
			.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_GUEST_AVAILABILITY_DETAILS);
	public By tableuPerformanceDashboardDashboardLink = By
			.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_PERFORMANCE_DASHBOARD);
	public By tableuLoginLogoutDashboardLink = By.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_LOGIN_LOGOUT);
	// supervisor
	public By tableauUtoCurrentDate = By.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_UTO__CURRENT_DATE);
	public By tableauPTODaysSupAgentView = By
			.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_PTO_DAYS_SUP_AGENT_VIEW);
	public By tableauPTODashboards = By.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_PTO_DASHBOARDS);
	public By tableauOpenCaseDashboard = By.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_OPEN_CASE_DASHBOARD);
	public By tableauOpenCasesActivities = By.xpath(AplicationConstants.XPATH_TABLEU_DASHBOARDS_OPEN_CASES_ACTIVITIES);

	// Edit contact fields
	public By editEmailContactInput = By.xpath(AplicationConstants.XPATH_CONTACT_EMAIL_INPUT);
	public By editPrimaryPhoneContactInput = By.xpath(AplicationConstants.XPATH_CONTACT_PRIMARY_PHONE_INPUT);
	public By editFaxNumberContactInput = By.xpath(AplicationConstants.XPATH_CONTACT_FAX_NUMBER_INPUT);
	public By alternateEmailInput = By.xpath(AplicationConstants.XPATH_ALTERNATE_EMAIL_INPUT);
	public By saveEditContactButton = By.xpath(AplicationConstants.XPATH_SAVE_BUTTON);
	// case record view
	public By caseRecordContactNameLink = By.xpath(AplicationConstants.XPATH_CASE_RECORD_HIGHLIGHT_CONTACT_NAME_LINK);
	public By caseRecordDealer1Link = By.xpath(AplicationConstants.XPATH_CASE_RECORD_HIGHLIGHT_CONTACT_NAME_LINK);
	// SPAN MESSAGE
	public By spanRefreshSuccessfullyMessage = By
			.xpath(AplicationConstants.XPATH_REFRESH_SUCCESSFULLY_PROMPTED_MESSAGE);
	// Error message
	public By errorMessageInvalidAddressEmailPhone = By
			.xpath(AplicationConstants.XPATH_ERROR_MESSAGE_INVALID_ADDRESS_EMAIL_PHONE);
	public By errorMessageInvalidAddressEmailPhoneQA = By
			.xpath(AplicationConstants.XPATH_ERROR_MESSAGE_INVALID_ADDRESS_EMAIL_PHONEQA);
	public By errorMessageInvalidLastName = By.xpath(AplicationConstants.XPATH_ERROR_MESSAGE_INVALID_LAST_NAME);
	public By errorMessageInvalidPhoneNumber = By.xpath(AplicationConstants.XPATH_ERROR_MESSAGE_PHONE_NUMBER);
	public By errorMessageInvalidEmail = By.xpath(AplicationConstants.XPATH_ERROR_MESSAGE_EMAIL);

	public By unableToLoadMessage = By.xpath(AplicationConstants.XPATH_UNABLE_TO_LOAD_MESSSAGE);
	public By errorMessageDeletePublicAttachments = By
			.xpath(AplicationConstants.XPATH_ERROR_MESSAGE_DELETE_PUBLIC_ATTACHMENTS);
	public By errorFiveDecimalsAlert = By.xpath(AplicationConstants.XPATH_ERROR_FIVE_DECIMALS_ALERT);
	public By lstviewReim = By.linkText("Reimbursement");
	public By lstViewPL = By.linkText("Product Liability");
	public By lstViewCaseMangemt = By.linkText("Toyota Case Manager");
	public By ShowmoreButton = By.xpath("//button[@class=\"slds-button slds-button_icon-border-filled\"]");
	public By CrtfrmCase = By.xpath("//runtime_platform_actions-action-renderer[@title=\"Create From Case\"]");

	// this secction is from PL Page layout Xpath
	public By inactiveAditionalQuestionStatus = By
			.xpath(AplicationConstants.XPATH_ADITIONAL_QUESTIONS_INACTIVE_PIPELINE);
	public By saveNextButton = By.xpath(AplicationConstants.XPATH_SAVE_NEXT_BUTTON);
	public By callerStatesField = By.xpath(AplicationConstants.XPATH_CALLER_STATES_FIELD);
	public By outcomeQuestionField = By.xpath(AplicationConstants.XPATH_OUTCOME_QUESTION_FIELD);
	public By exactLocationField = By.xpath(AplicationConstants.XPATH_EXACT_LOCATION_FIELD);
	public By partOfVehicleField = By.xpath(AplicationConstants.XPATH_PART_OF_VEHICLE_QUESTION_FIELD);
	public By damagesQuestionField = By.xpath(AplicationConstants.XPATH_DAMAGES_QUESTION_FIELD);
	public By injuriesQuestionField = By.xpath(AplicationConstants.XPATH_INJURIES_QUESTION_FIELD);
	public By locationOfDamageField = By.xpath(AplicationConstants.XPATH_LOCATION_OF_DAMAGE_FIELD);
	public By subTypePLPicklist = By.xpath(AplicationConstants.XPATH_SUB_TYPE_PICKLIST);
	public By legalClaimsCaseCodePicklist = By.xpath(AplicationConstants.XPATH_LEGAL_CLAIMS_CAS_CODE_PICKLIST);
	public By accidentRelatedOpt = By.xpath(AplicationConstants.XPATH_ACCIDENT_RELATED_OPT);
	public By initialQuestionButton = By.xpath(AplicationConstants.XPATH_INITIAL_QUESTION_BUTTON);
	public By incidentDataTimeField = By.xpath(AplicationConstants.XPATH_INCIDENT_DATA_TIME_FIELD);
	public By guestRespondinInjuriesField = By.xpath(AplicationConstants.XPATH_GUEST_REPORTING_INJURIES_QUESTION_FIELD);
	public By guestRespondingDamagesField = By.xpath(AplicationConstants.XPATH_GUEST_REPORTING_DAMAGES_QUESTION_FIELD);
	public By rolloverEventField = By.xpath(AplicationConstants.XPATH_ROLLOVER_EVENT_QUESTION_FIELD);
	public By guestAllegingIssusAirbagsField = By
			.xpath(AplicationConstants.XPATH_GUEST_ALLEGING_ISSUS_AIRBANS_QUESTION_FIELD);
	public By failedWorkPropertyTextArea = By.xpath(AplicationConstants.XPATH_FAILED_WORK_PROPERTY_TEXTAREA);
	public By additionalDetailTextArea = By.xpath(AplicationConstants.XPATH_ADITIONAL_DETAIL_TEXTAREA);
	public By alligationTestarea = By.xpath(AplicationConstants.XPATH_ALLIGATION_TEXTAREA);

	////// search contact
	public By searchContactGuestNameField = By.xpath(AplicationConstants.XPATH_SEARCH_CONTACT_GUEST_NAME_FIELD);
	public By searchContacBussinesNameField = By.xpath(AplicationConstants.XPATH_SEARCH_CONTACT_BUSSINESS_NAME_FIELD);
	public By searchContactPhoneField = By.xpath(AplicationConstants.XPATH_SEARCH_CONTACT_PHONE_FIELD);
	public By searchContactEmailField = By.xpath(AplicationConstants.XPATH_SEARCH_CONTACT_EMAIL_FIELD);
	public By searchContactVINField = By.xpath(AplicationConstants.XPATH_SEARCH_CONTACT_VIN_FIELD);
	public By searchContactCustomerIdField = By.xpath(AplicationConstants.XPATH_SEARCH_CONTACT_CUSTOMER_ID_FIELD);
	public By searchContactCaseNumberField = By.xpath(AplicationConstants.XPATH_SEARCH_CONTACT_CASE_NUMBER_FIELD);
	public By searchContactSearchButton = By.xpath(AplicationConstants.XPATH_SEARCH_CONTACT_SEARCH_BUTTON);
	public By searchContactCreateContactButton = By
			.xpath(AplicationConstants.XPATH_SEARCH_CONTACT_CREATE_CONTACT_BUTTON);

	public By createContactHeaer = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_HEADING);
	public By createContactProfileTypeField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_PROFILE_TYPE_FIELD);
	public By createContactFirstNameField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_FIRST_NAME_FIELD);
	public By createContactMiddleInitialField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_MIDDLE_INITIAL_FIELD);
	public By createContactLastNameField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_lAST_NAME_FIELD);
	public By createContactSuffixField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_SUFFIX_FIELD);
	public By createContactPreferredNameField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_PREFERRED_NAME_FIELD);
	public By createContactEmailField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_EMAIL_FIELD);
	public By createContactPrimaryPhoneField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_PRIMARY_PHONE_FIELD);
	public By createContactPrimaryPhoneTypeField = By
			.xpath(AplicationConstants.XPATH_CREATE_CONTACT_PRIMARY_PHONE_TYPE_FIELD);
	public By createContactAlternatePhoneField = By
			.xpath(AplicationConstants.XPATH_CREATE_CONTACT_ALTERNATE_PHONE_FIELD);
	public By createContactAlternatePhoneTypeField = By
			.xpath(AplicationConstants.XPATH_CREATE_CONTACT_ALTERNATE_PHONE_TYPE_FIELD);
	public By createContactCountryField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_COUNTRY_FIELD);
	public By createContactStreetField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_STREET_FIELD);
	public By createContactCityField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_CITY_FIELD);
	public By createContactStateField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_STATE_FIELD);
	public By createContactLanguagePreferenceField = By
			.xpath(AplicationConstants.XPATH_CREATE_CONTACT_LANGUAGE_PREFERENCE_FIELD);
	public By createContactZipField = By.xpath(AplicationConstants.XPATH_CREATE_CONTACT_ZIP_FIELD);

	public By editContactFirstNameField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_FIRST_NAME_FIELD);
	public By editContactMiddleNameField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_MIDDLE_NAME_FIELD);
	public By editContactLastNameField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_lAST_NAME_FIELD);
	public By editContactSuffixField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_SUFFIX_FIELD);
	public By editContactPrferredNameField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_PREFERRED_NAME_FIELD);
	public By editContactEmailField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_EMAIL_FIELD);
	public By editContactPrimaryPhoneField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_PRIMARY_PHONE_FIELD);
	public By editContactPrimaryPhoneTypeField = By
			.xpath(AplicationConstants.XPATH_EDIT_CONTACT_PRIMARY_PHONE_TYPE_FIELD);
	public By editContactAlternatePhoneField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_ALTERNATE_PHONE_FIELD);
	public By editContactAlternatePhoneTypeField = By
			.xpath(AplicationConstants.XPATH_EDIT_CONTACT_ALTERNATE_PHONE_TYPE_FIELD);
	public By editContactCountryField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_COUNTRY_FIELD);
	public By editContacStreetField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_STREET_FIELD);
	public By editContactCityField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_CITY_FIELD);
	public By editContactStateField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_STATE_FIELD);
	public By editContactZipField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_ZIP_FIELD);
	public By editContactCOField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_CO_FIELD);
	public By editContactContactAlertField = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_CONTACT_ALERT_FIELD);
	public By editContactLanguagePreferenceField = By
			.xpath(AplicationConstants.XPATH_EDIT_CONTACT_LANGUAGE_PREFERENCE_FIELD);
	public By editContactCancelButton = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_CANCEL_BUTTON);
	public By editContactSaveButton = By.xpath(AplicationConstants.XPATH_EDIT_CONTACT_CANCEL_BUTTON);
	public By casehistory_status =By.xpath("(//td[@data-col-key-value=\"NewValue-lstAnyType-5\"]//lightning-formatted-text[text()='Product'])[2]");
	
	
	public SalesfoceObjectPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void writeCellValue(String sheetName, int row, int cell, String value) throws IOException {
		writeExelFile.writeExcelValue(filepath, sheetName, row, cell, value);
	}

	public String getSomeValue(String tabName, int row, int column, boolean returnInt) throws IOException {
		readExcelFile = new ReadExcelFile();
		String value = "";
		if (returnInt) {

			value = String.valueOf(readExcelFile.getCellValue(filepath, tabName, row, column));

		} else {

			value = readExcelFile.getCellValue(filepath, tabName, row, column);

		}

		return value;
	}

	public void openCaseId(String caseNumber) throws InterruptedException {
		String xpathCase = "//span[text()='" + caseNumber + "']//ancestor::tbody//th//span//a";
		By idcase = By.xpath(xpathCase);
		click(idcase);
	}

	public void logSalesforceQA() throws IOException, InterruptedException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Users";

		String userName = readExcelFile.getCellValue(filepath, exceltab, 2, 1);
		String password = readExcelFile.getCellValue(filepath, exceltab, 2, 2);

		System.out.println(userName);
		System.out.println(password);
		type(userName, userNameLogin);
		type(password, passWord);
		click(loginButton);
	}

	public void logSalesforceQAStaging() throws IOException, InterruptedException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Users";

		String userName = readExcelFile.getCellValue(filepath, exceltab, 5, 1);
		String password = readExcelFile.getCellValue(filepath, exceltab, 5, 2);

		type(userName, userNameLogin);
		type(password, passWord);
		click(loginButton);
	}

	public String userName;
	public String password;

	public void logSalesforceQAAdmin() throws IOException, InterruptedException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Users";

		userName = readExcelFile.getCellValue(filepath, exceltab, 2, 1);
		password = readExcelFile.getCellValue(filepath, exceltab, 2, 2);

//		System.out.println(userName);
//		System.out.println(password);
		type(userName, userNameLogin);
		type(password, passWord);
		click(loginButton);
		Thread.sleep(2000);
	}

	public void logSalesforceQAAdminStaging() throws IOException, InterruptedException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Users";

		String userName = readExcelFile.getCellValue(filepath, exceltab, 5, 1);
		String password = readExcelFile.getCellValue(filepath, exceltab, 5, 2);

		type(userName, userNameLogin);
		type(password, passWord);
		click(loginButton);
		Thread.sleep(2000);
	}

	
	
	public void showCase(String strCase) throws InterruptedException {
		Thread.sleep(2000);
		click(searchMenu);
		Thread.sleep(3000);
		assertTrue(isDispleyed(optCase), "The option case is not displayed");
		click(optCase);
		Thread.sleep(1000);
		click(lstViewsAdm);
		Thread.sleep(2000);
		click(lstViewCase);
		Thread.sleep(2000);
		clear(searchCaseField);
		type(strCase, searchCaseField);
		enter(searchCaseField);
		Thread.sleep(2000);
		// assertTrue(isDispleyed(caseId), "The case is not displayed");
		click(caseId);

	}

	public void showCaseAdm(String strCase) throws InterruptedException {
		Thread.sleep(1000);
		click(searchMenu);
		Thread.sleep(1000);
		click(optCase);
		Thread.sleep(2000);
		click(lstViews);
		Thread.sleep(2000);
		if (isDispleyed(lstViewCase)) {
			click(lstViewCase);
		} else if (isDispleyed(lstViewCaseStaging)) {
			click(lstViewCaseStaging);
		}

		Thread.sleep(8000);
		clear(searchCaseField);
		Thread.sleep(2000);
		type(strCase, searchCaseField);
		enter(searchCaseField);
		clear(searchCaseField);
		type(strCase, searchCaseField);
		enter(searchCaseField);
		Thread.sleep(4000);
		assertTrue(isDispleyed(caseId), "The case is not displayed");
		click(caseId);

	}

	public void showCaseAdmGLobal(String strCase) throws InterruptedException {
		Thread.sleep(10000);
		//assertTrue(isDispleyed(globalSearch), "The global search is not available ");
		click(globalSearch);
		Thread.sleep(4000);

		type(strCase, globalSearchInput);
		Thread.sleep(10000);
		String path = "//mark[text()='" + strCase + "']//ancestor::div[1]";
		By locator = By.xpath(path);
		Thread.sleep(10000);
		if (isDispleyed(locator)) {
			assertTrue(isDispleyed(locator), "The Case was not showing in the search...");
			click(locator);

		} else {

			Thread.sleep(10000);
			enter(globalSearchInput);
			String cansenumberResult = "//em[text()='Recommended Result']//ancestor::div[2]//h2//a";
			By casenumberLoc = By.xpath(cansenumberResult);
			refreshPage();
			Thread.sleep(10000);
			if (isDispleyed(casenumberLoc)) {
				click(casenumberLoc);
			} else {
				type(strCase, globalSearchInput);
				Thread.sleep(8000);
				enter(globalSearchInput);
				Thread.sleep(10000);
				if (isDispleyed(casenumberLoc)) {
					click(casenumberLoc);
				} else {
					Thread.sleep(10000);
					refreshPage();
					Thread.sleep(10000);
					assertTrue(isDispleyed(casenumberLoc), "The case was not created");
					click(casenumberLoc);
				}

			}

		}

	}
	public void showCaseAdmGLobalInKnowledge(String strCase) throws InterruptedException {
		Thread.sleep(10000);
		//assertTrue(isDispleyed(globalSearch), "The global search is not available ");
		click(globalSearch);
		Thread.sleep(6000);

		type(strCase, globalSearchInput_Knowledge);
		Thread.sleep(10000);
		String path = "//mark[text()='" + strCase + "']//ancestor::div[1]";
		By locator = By.xpath(path);
		Thread.sleep(1000);
		if (isDispleyed(locator)) {
			assertTrue(isDispleyed(locator), "The Case was not showing in the search...");
			click(locator);

		} else {

			Thread.sleep(1000);
			enter(globalSearchInput_Knowledge);
			String cansenumberResult = "//em[text()='Recommended Result']//ancestor::div[2]//h2//a";
			By casenumberLoc = By.xpath(cansenumberResult);
			refreshPage();
			Thread.sleep(1000);
			if (isDispleyed(casenumberLoc)) {
				click(casenumberLoc);
			} else {
				JavascriptExecutor js = (JavascriptExecutor) driver;

    			js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//force-lookup[@class=\"itemTitle\"]//a")));

				}

			}

		}

	

	public void showContactGLobal(String firstName, String lastName, String email) throws InterruptedException {
		String fullName = firstName + " " + lastName;
		Thread.sleep(6000);
		assertTrue(isDispleyed(globalSearch), "The global search is not available ");
		click(globalSearch);
		type(fullName, globalSearchInput);
		Thread.sleep(6000);
		String path;
		if (firstName.contentEquals("Carlos") && lastName.contentEquals("Ramirez")) {
			path = "//span[@title='CARLOS H RAMIREZ']";
		} else {
			path = "//mark[text()='" + fullName + "']//ancestor::div[1]";
		}
		By locator = By.xpath(path);
		Thread.sleep(6000);
		if (isDispleyed(locator)) {
			assertTrue(isDispleyed(locator), "The Contact was not showing in the search...");
			click(locator);

		} else {

			Thread.sleep(8000);
			click(globalSearch);
			enter(globalSearchInput);
			String contactResult = "//a[contains(text(),'" + email + "')]//ancestor::tbody//th";
			By contactLoc = By.xpath(contactResult);
			refreshPage();
			Thread.sleep(8000);
			if (isDispleyed(contactLoc)) {
				click(contactLoc);
			} else {
				type(fullName, globalSearchInput);
				Thread.sleep(6000);
				enter(globalSearchInput);
				Thread.sleep(6000);
				if (isDispleyed(contactLoc)) {
					click(contactLoc);
				} else {
					Thread.sleep(10000);
					refreshPage();
					Thread.sleep(8000);
					assertTrue(isDispleyed(contactLoc), "The case was not created");
					click(contactLoc);
				}

			}

		}
	}

	public void openCaseTab(By locator) throws InterruptedException {
		click(searchMenu);
		Thread.sleep(1000);
		click(optCase);
		Thread.sleep(3000);
		click(lstViews);
		Thread.sleep(3000);
		click(locator);
	}

	public void validationVINfieldPopulate() {
		assertTrue(isDispleyed(vinFieldSfdc), "The VIN field is not populated");
	}

	public void validateEmail() throws InterruptedException, IOException {
		readExcelFile = new ReadExcelFile();
		String userGmailx = readExcelFile.getCellValue(filepath, "Users", 3, 4);
		String passwordGmailx = readExcelFile.getCellValue(filepath, "Users", 3, 2);

		Thread.sleep(1000);
		type(userGmailx, userGmail);
		click(userButtonNext);
		Thread.sleep(5000);
		type(passwordGmailx, passwordGmail);
		click(passwordButtonNext);

		Thread.sleep(10000);
		assertTrue(isDispleyed(globalSearchGmail), "The global search is not displayed");
		clear(globalSearchGmail);
		type("Toyota Brand Engagement Center", globalSearchGmail);
		Thread.sleep(1000);
		// click(resultGmail);
		// click(resultglobalsearch);

	}

	public void validationEmailAddess() throws InterruptedException {

		Thread.sleep(2000);
		// click(subjectfield);

		/*
		 * Thread.sleep(2000); assertTrue(isDispleyed(goAddessGmail),
		 * "The email addres is not displayed");
		 * System.out.println(getAttribute(goAddessGmail, "data-hovercard-id"));//
		 */
		// assertTrue(getAttribute(goAddessGmail, "data-hovercard-id") ==
		// "becdonotreply@toyota.com", "The email not match");
	}

	public void validateSubPicklisCloseCase() throws InterruptedException {
		click(subStatusField);

	}

	public String getSalesforcePicklistLink() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Values";
		String urlString = readExcelFile.getCellValue(filepath, exceltab, 14, 1);
		return urlString;
	}

	public String getSalesforcePicklistLinkStaging() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Values";
		String urlString = readExcelFile.getCellValue(filepath, exceltab, 20, 1);
		return urlString;
	}

	public String getSalesforceHomeLink() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Links";
		String urlString = readExcelFile.getCellValue(filepath, exceltab, 28, 3);
		System.out.println(urlString);
		return urlString;
	}

	public String getSalesforceHomeLinkStaging() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Links";
		String urlString = readExcelFile.getCellValue(filepath, exceltab,30, 3);
		System.out.println("URL : " + urlString);
		return urlString;
	}

	public String getCaseLink() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Cases";
		String urlString = readExcelFile.getCellValue(filepath, exceltab, 0, 1);
		return urlString;
	}

	public String getCaseLinkStaging() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Cases";
		String urlString = readExcelFile.getCellValue(filepath, exceltab, 3, 1);
		return urlString;
	}

	public String getCaseLinkColumns(int column, int row) throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Cases";
		String urlString = readExcelFile.getCellValue(filepath, exceltab, column, row);
		return urlString;
	}

	public String getBodyCommnet() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Values";
		String urlString = readExcelFile.getCellValue(filepath, exceltab, 12, 1);
		return urlString;

	}

	public String SwitchtoUser() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "Users";
		String urlString = readExcelFile.getCellValue(filepath, exceltab, 13, 1);
		return urlString;

	}

	public String help() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String Whathelp = readExcelFile.getCellValue(filepath, exceltab, 1, 1);
		return Whathelp;
	}
	public String help(String text) throws IOException {
				return text;
	}

	public String JiraSource() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String JiraSource = readExcelFile.getCellValue(filepath, exceltab, 2, 1);
		return JiraSource;
	}

	public String Generation() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String Generation = readExcelFile.getCellValue(filepath, exceltab, 3, 1);
		return Generation;
	}

	public String JiraBrand() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String JiraBrand = readExcelFile.getCellValue(filepath, exceltab, 4, 1);
		return JiraBrand;
	}

	public String VIN() throws IOException, InterruptedException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String VIN = readExcelFile.getCellValue(filepath, exceltab, 6, 1);

		System.out.println(VIN);
		type(VIN, VinNumberField);

		return VIN;
	}

	public String Remotefunction() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String Remotefunction = readExcelFile.getCellValue(filepath, exceltab, 5, 1);
		return Remotefunction;
	}

	public String ShortDescription() throws IOException, InterruptedException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String ShortDescription = readExcelFile.getCellValue(filepath, exceltab, 7, 1);

		System.out.println(ShortDescription);
		type(ShortDescription, ShortDescriptionxpath);

		return ShortDescription;

	}

	public String JiraDescription() throws IOException, InterruptedException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String JiraDescription = readExcelFile.getCellValue(filepath, exceltab, 8, 1);

		System.out.println(JiraDescription);
		type(JiraDescription, JiraDescription1);

		return JiraDescription;
	}

	public String CustomerEmailinCTP() throws IOException, InterruptedException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String CustomerEmailinCTP = readExcelFile.getCellValue(filepath, exceltab, 9, 1);
		System.out.println(CustomerEmailinCTP);
		type(CustomerEmailinCTP, CTP);

		return CustomerEmailinCTP;
	}

	public String Environment() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String Environment = readExcelFile.getCellValue(filepath, exceltab, 10, 1);
		return Environment;
	}

	public String IMEI() throws IOException, InterruptedException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String IMEI = readExcelFile.getCellValue(filepath, exceltab, 11, 1);
		System.out.println(IMEI);
		type(IMEI, IMEIxpath);
		return IMEI;
	}

	public String JiraRegion() throws IOException {
		readExcelFile = new ReadExcelFile();
		String exceltab = "JIRATICKET";
		String JiraRegion = readExcelFile.getCellValue(filepath, exceltab, 12, 1);
		return JiraRegion;
	}

	public void deleteComment(String url) throws IOException, InterruptedException {
		logSalesforceQAAdmin();
		Thread.sleep(4000);
		visit(url);
		Thread.sleep(5000);
		assertTrue(isDispleyed(moreOptionMenuStaging), "The menu in not displayed");
		click(moreOptionMenuStaging);
		Thread.sleep(2000);
		click(deleteCommentButton);
		Thread.sleep(2000);
		click(deleteCommentButtonPopup);
		Thread.sleep(2000);
	}

	public void deleteCommentStaging(String url) throws IOException, InterruptedException {
		logSalesforceQAAdminStaging();
		// Thread.sleep(7000);
		visit(url);
		Thread.sleep(7000);
		assertTrue(isDispleyed(moreOptionMenuStaging), "The menu in not displayed");
		click(moreOptionMenuStaging);
		Thread.sleep(3000);
		assertTrue(isDispleyed(deleteCommentButton), "The delete option was not found");
		click(deleteCommentButton);
		Thread.sleep(2000);
		assertTrue(isDispleyed(deleteCommentButtonPopup), "The delete button was not found");
		click(deleteCommentButtonPopup);
		Thread.sleep(2000);
	}

	public void select() throws IOException, InterruptedException {
		Select select;
		select = new Select(driver.findElement(jiraSourcePicklist));
		select.selectByVisibleText(JiraSource());
		Thread.sleep(5000);
	}

	public void select1() throws IOException, InterruptedException {
		Select select1;
		select1 = new Select(driver.findElement(Whatcanhelpfield));
		select1.selectByVisibleText(help());
		Thread.sleep(5000);
	}
	public void selectWhatcanhelpfield(String text) throws IOException, InterruptedException {
		Select select1;
		select1 = new Select(driver.findElement(Whatcanhelpfield));
		select1.selectByVisibleText(text);
		Thread.sleep(5000);
	}

	public void select2() throws IOException, InterruptedException {
		Select select2;
		select2 = new Select(driver.findElement(Generation));
		select2.selectByVisibleText(Generation());
		Thread.sleep(5000);

	}

	public void select3() throws IOException, InterruptedException {
		Select select3;
		select3 = new Select(driver.findElement(Jirabrand));
		select3.selectByVisibleText(JiraBrand());
		Thread.sleep(5000);

	}

	public void select4() throws IOException, InterruptedException {
		if(help()!=("Digital Key")) {
		Select select4;
		select4 = new Select(driver.findElement(RemoteFunction));
		select4.selectByVisibleText(Remotefunction());
		Thread.sleep(5000);}

	}

	public void select5() throws IOException, InterruptedException {
		Select select5;
		select5 = new Select(driver.findElement(Environment));
		select5.selectByVisibleText(Environment());
		Thread.sleep(5000);

	}

	public void select6() throws IOException, InterruptedException {
		Select select6;
		select6 = new Select(driver.findElement(Region));
		select6.selectByVisibleText(JiraRegion());
		Thread.sleep(5000);
	}

	public boolean getStatusPicklistValues(String value) {
		By locator = By.xpath("//lightning-base-combobox-item[@data-value='" + value + "']");
		return isDispleyed(locator);

	}

	public By getStatusPicklistOption(String value) {
		return By.xpath("//lightning-base-combobox-item[@data-value='" + value + "']");
	}

	public void verifyContactName(String name) {
		By contactNameField = By
				.xpath("//span[text()='Contact Name']//ancestor::div[2]//span[text()='" + name.toUpperCase() + "']");
		assertTrue(isDispleyed(contactNameField), "The contact name " + name + " was not found");
	}

	public void verifyGuestName(String name) {
		By contactNameField = By
				.xpath("//span[text()='Guest Name']//ancestor::div[2]//span[text()='" + name.toUpperCase() + "']");
		assertTrue(isDispleyed(contactNameField), "The contact name " + name + " was not found");
	}

	public void changeUser(String userName) throws InterruptedException, IOException {

		click(setupIcon);
		Thread.sleep(5000);
		click(setup);

		ArrayList arrayList = new ArrayList(driver.getWindowHandles());
		ArrayList tabs = arrayList;
		System.out.println(tabs.size());
		String tab1 = (String) tabs.get(1);

		driver.switchTo().window(tab1);

		Thread.sleep(5000);
		type(userName, searchSetup);
		Thread.sleep(5000);

		WebElement result = driver.findElement(By.xpath("//div[text()='" + userName + "']//ancestor::li[1]"));

		click(result);
		Thread.sleep(8000);

		WebElement iframe = driver
				.findElement(By.xpath("//*[@id=\"setupComponent\"]/div[2]/div/div/force-aloha-page/div/iframe"));

		driver.switchTo().frame(iframe);
		Thread.sleep(10000);
		click(loginButtonUser);
		driver.switchTo().parentFrame();
		Thread.sleep(10000);

	}

	public void changeUserChat(String userName) throws InterruptedException {
		click(setupIcon);
		Thread.sleep(7000);
		click(setup);

		WebElement iframe = driver
				.findElement(By.xpath("//*[@id=\"setupComponent\"]/div[2]/div/div/force-aloha-page/div/iframe"));

		driver.switchTo().frame(iframe);
		Thread.sleep(10000);
		click(loginButtonUser);
		driver.switchTo().parentFrame();
		Thread.sleep(10000);
	}

	public By getCaseIdElement(String caseNumber) {
		String xpathCase = "//span[text()='" + caseNumber + "']//ancestor::tr/th/span/a";
		return By.xpath(xpathCase);
	}

	public void changeUserFromAdmin(String userName) throws InterruptedException {
		Thread.sleep(5000);
		click(setupIcon);
		Thread.sleep(2000);
		click(setup);
		ArrayList tabs = new ArrayList(driver.getWindowHandles());
		String salesforceSetup = (String) tabs.get(tabs.size() - 1);
		driver.switchTo().window(salesforceSetup);
		Thread.sleep(1000);
		click(searchSetup);
		type(userName, searchSetup);
		Thread.sleep(4000);
		By result = By.xpath("//*[text()='" + userName + "']//ancestor::li[1]");
		click(result);
		Thread.sleep(20000);
		clickOnFrame(iframeLogin, loginButtonUserSFiframe);
	}

	public void goNavigationMenu(String item) throws InterruptedException {
		click(navigationMenuButton);
		click(By.xpath("//a[@data-itemid='" + item + "']"));
	}

	public By getElementComboBoxItem(String item) {
		return By.xpath("//lightning-base-combobox-item[@data-value='" + item + "']");
	}

	public void editStatusCase(String status) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)", "");
		click(caseStatusEditButton);
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,100)", "");
		click(caseStatusButton);
		Thread.sleep(2000);
		click(getElementComboBoxItem(status));
		click(saveEditButton);
	}

	public By getItemPopUP(String item) {
		return By.xpath("//div[contains(@class,'visible positioned')]//a[text()='" + item + "']");
	}

	public By getContactList(String field, String fieldName) {
		return By.xpath("//span[text()='" + field + "']/following::a[@title='" + fieldName.toUpperCase() + "']");
	}

	public By getDealerList(String field, String fieldName) {
		return By.xpath("//span[text()='" + field + "']/following::a[@title='" + fieldName + "']");
	}

	public void clickOnAlert() throws InterruptedException {
		int attemps = 0;
		do {
			System.out.println("Waitting for alert");
			Thread.sleep(1000);
			if (isDispleyed(caseCreatedAlert) || attemps > 20) {
				click(caseCreatedAlert);
				break;
			}
			attemps++;
		} while (true);
	}

	public void closeSalesforceTabs() throws InterruptedException {
		// Time to load
		Thread.sleep(8000);
		if (isDispleyed(cancelEditContactButton))
			click(cancelEditContactButton);
		do {
			Thread.sleep(4000);
			if (isDispleyed(closeTabIcon) && isEnable(closeTabIcon))
				click(closeTabIcon);
			else
				break;
		} while (isDispleyed(closeTabIcon) && isEnable(closeTabIcon));
	}

	public void createCase(String brand, String type, String subType, String status)
			throws InterruptedException, IOException {
		goNavigationMenu("Home");
		click(globalCreateTrigger);
		Thread.sleep(1000);
		click(createCaseFromGlobalActions);
		Thread.sleep(4000);
		click(brandCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(brand));
		click(typeCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(type));
		click(subTypeCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(subType));
		click(statusCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(status));
		String contact = getSomeValue("DataCases", 3, 0) + " " + getSomeValue("DataCases", 3, 1);
		type(contact, contactNameCaseCommentField);
		Thread.sleep(4000);
		click(searchResultContactName);
		// time to load
		Thread.sleep(2000);
		click(getContactList("Contact Name", contact.toString()));
		type(contact.toString(), customerNameCaseCommentField);
		click(customerNameCaseCommentField);
		Thread.sleep(2000);
		click(searchResultCustomerName);
		click(getContactList("Customer Name", contact.toString()));
		click(saveCase);
		clickOnAlert();
		Thread.sleep(4000);
	}

	public void createNewCase(String brand, String type, String subType, String status, String contact)
			throws InterruptedException, IOException {
		goNavigationMenu("Home");
		click(globalCreateTrigger);
		Thread.sleep(1000);
		click(createCaseFromGlobalActions);
		Thread.sleep(4000);
		click(brandCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(brand));
		click(typeCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(type));
		click(subTypeCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(subType));
		click(statusCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(status));
		type(contact, contactNameCaseCommentField);
		Thread.sleep(4000);
		click(searchResultContactName);
		// time to load
		Thread.sleep(2000);
		click(getContactList("Contact Name", contact));

		click(saveCase);
		clickOnAlert();
		Thread.sleep(4000);
	}

	public void createNewCase(String brand, String type, String subType, String status, String contact, String vin)
			throws InterruptedException, IOException {
		goNavigationMenu("Home");
		click(globalCreateTrigger);
		Thread.sleep(1000);
		click(createCaseFromGlobalActions);
		Thread.sleep(4000);
		click(brandCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(brand));
		click(typeCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(type));
		click(subTypeCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(subType));
		click(statusCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(status));
		type(contact, contactNameCaseCommentField);
		Thread.sleep(4000);
		click(searchResultContactName);
		// time to load
		Thread.sleep(2000);
		click(getContactList("Contact Name", contact));
		Thread.sleep(2000);
		type(vin, vinCaseCommentField);
		Thread.sleep(2000);
		enter(vinCaseCommentField);
		Thread.sleep(2000);
		click(getContactList("Vehicle", vin));
		click(saveCase);
		clickOnAlert();
		Thread.sleep(4000);
	}

	public void createNewCase(String brand, String type, String subType, String status, String contact, String vin,
			String dealer1) throws InterruptedException, IOException {
		goNavigationMenu("Home");
		click(globalCreateTrigger);
		Thread.sleep(1000);
		click(createCaseFromGlobalActions);
		Thread.sleep(4000);
		click(brandCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(brand));
		click(typeCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(type));
		click(subTypeCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(subType));
		click(statusCaseCommentField);
		Thread.sleep(4000);
		click(getItemPopUP(status));
		type(contact, contactNameCaseCommentField);
		Thread.sleep(4000);
		click(searchResultContactName);
		// time to load
		Thread.sleep(2000);
		click(getContactList("Contact Name", contact));
		Thread.sleep(2000);
		type(contact, customerNameCaseCommentField);
		Thread.sleep(4000);
		click(searchResultCustomerName);
		// time to load
		Thread.sleep(2000);
		click(getContactList("Customer Name", contact));
		Thread.sleep(2000);
		type(vin, vinCaseCommentField);
		Thread.sleep(2000);
		enter(vinCaseCommentField);
		Thread.sleep(2000);
		click(getContactList("Vehicle", vin));
		type(dealer1, dealer1CaseCommentField);
		Thread.sleep(2000);
		enter(dealer1CaseCommentField);
		Thread.sleep(2000);
		click(getDealerList("Dealer 1", dealer1));
		click(saveCase);
		clickOnAlert();
		Thread.sleep(4000);
	}

	public void loginAsAdmin(String orgTest) throws IOException, InterruptedException {
		if (orgTest.equals("QA")) {
			visit(getSalesforceHomeLink());
			if (isDispleyed(userNameLogin))
				logSalesforceQA();
		} else if (orgTest.equals("Staging")) {
			visit(getSalesforceHomeLinkStaging());
			if (isDispleyed(userNameLogin))
				logSalesforceQAStaging();
		}
	}

	public String agentComment() throws InterruptedException {
		click(newComment);
		LocalDateTime now = LocalDateTime.now();
		String comment = "answer from salesforce" + now;
		type(comment, commentTextarea);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		click(publicCommentCheckBox);
		click(saveNewCommentButton);
		Thread.sleep(10000);
		assertTrue(getText(By.xpath("//lightning-formatted-text[contains(text(),'answer from salesforce')][1]"))
				.equals(comment), "The comment is not found");
		return comment;
	}

	public void Contactsearch() throws IOException, InterruptedException {

		Thread.sleep(5000);
		readExcelFile = new ReadExcelFile();
		String exceltab = "Contacts";
		String ContactFirstName = readExcelFile.getCellValue(filepath, exceltab, 5, 0);
		String ContactLastName = readExcelFile.getCellValue(filepath, exceltab, 5, 1);

		String ContactName = ContactFirstName + " " + ContactLastName;
		System.out.println("ContactName:" + ContactName);

		type(ContactName, ContactSearch);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"Contact-search-input\"]")).sendKeys(Keys.ENTER);
	}

	public void Verifyphonetype() throws InterruptedException {
		WebElement Element = driver.findElement(By.xpath("//button[@name=\"Primary_Phone_Type__c\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(5000);
		click(PrimaryPhoneType);
		Thread.sleep(3000);
		click(MobileType);
		Thread.sleep(3000);
		click(PrimaryPhoneType);
		Thread.sleep(3000);
		click(LandlineType);
		Thread.sleep(3000);
		click(PrimaryPhoneType);
		Thread.sleep(3000);
		WebElement Element2 = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value=\"UNKNOWN\"]"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].scrollIntoView();", Element2);
		click(Unknown);

		Thread.sleep(5000);
		WebElement Element1 = driver.findElement(By.xpath("//button[@name=\"Alternate_Phone_Type__c\"]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(5000);
		click(AlternatePhoneType);
		Thread.sleep(3000);
		click(AltMobileType);
		Thread.sleep(3000);
		click(AlternatePhoneType);
		Thread.sleep(3000);
		click(AltLandlineType);
		Thread.sleep(3000);
		click(AlternatePhoneType);
		Thread.sleep(3000);
		WebElement Element3 = driver.findElement(By.xpath(
				"//button[@name=\"Alternate_Phone_Type__c\"]/following::lightning-base-combobox-item[@data-value=\"UNKNOWN\"]"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].scrollIntoView();", Element3);
		click(AltUnknown);
		Thread.sleep(4000);
	}

	public String verifyvalidemail() throws InterruptedException, IOException {

		moveTo(By.xpath(
				"//span[@title=\"Communication Info\"]/following::label[text()=\"Email\"]/following::label[text()=\"Alternate Email\"]"));
		Thread.sleep(5000);
		readExcelFile = new ReadExcelFile();
		String exceltab = "Contacts";
		String Email = readExcelFile.getCellValue(filepath, exceltab, 5, 2);
		return Email;
	}

	public By getRecordId(String title) {
		return By.xpath("//a[@title='" + title.toUpperCase() + "']");
	}

	public void selectEdit(String field, String value) throws Exception {
		// Time to load
//		Assert.assertTrue(isDispleyed(By.xpath("//label[text()='Status']/following::button[1]")));
//		click(By.xpath("//label[text()='Status']/following::button[1]"));
		Actions scroll;
	    scroll = new Actions(driver);
	    //WebElement fieldname= driver.findElement(By.xpath("//label[text()='\"+field+\"']/following::button[1]"));
	    //scroll.moveToElement(fieldname).click().perform();
	    ScrollToElement(driver.findElement(By.xpath("//label[text()='"+field+"']/following::button[1]")));
	    click(By.xpath("//label[text()='"+field+"']/following::button[1]"));
		WebElement dd = driver.findElement(
				By.xpath("//label[text()='"+field+"']/following::button[1]"));
		dd.sendKeys(value);
		dd.sendKeys(Keys.ENTER);
//		Thread.sleep(5000); 
//		Select select;
//		select = new Select(driver.findElement(By.xpath("//div[contains(@class,'isModal active')]//span[text()='"+field+"']//following::a[1]")));
//		select.selectByVisibleText(value);
	}

	public void loginInTableau() throws InterruptedException, IOException {
		scrollElementDown("split-left", 525);
		String winHandleBefore = driver.getWindowHandle();

		clickOnFrame(iframeTableu, tableuSingInButton);

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		type(getSomeValue("TableuUser", 1, 0), userForgeRock);
		type(getSomeValue("TableuUser", 1, 1), passwordFogeRock);
		click(loginButtonFogeRock);

		driver.switchTo().window(winHandleBefore);
		Thread.sleep(5000);
		refreshPage();
	}

	public void createCase(String type, String subType) throws InterruptedException, IOException {
		goNavigationMenu("Home");
		click(globalCreateTrigger);
		Thread.sleep(1000);
		click(createCaseFromGlobalActions);
		Thread.sleep(4000);
		click(brandCaseCommentField);
		Thread.sleep(2000);
		click(getItemPopUP("Toyota"));
		click(typeCaseCommentField);
		Thread.sleep(2000);
		click(getItemPopUP(type));
		click(subTypeCaseCommentField);
		Thread.sleep(2000);
		click(getItemPopUP(subType));
		click(statusCaseCommentField);
		Thread.sleep(2000);
		click(getItemPopUP("In Progress"));
		StringBuilder contact = new StringBuilder();
		String contactFirstName = getSomeValue(DBConstants.DB_TAB_DATA_CASES,
				DBConstants.DATA_CASES_ROWS.get("Alexander Belltest"), DBConstants.DATA_CASES_FIELDS.get("First Name"));
		String contactLastName = getSomeValue(DBConstants.DB_TAB_DATA_CASES,
				DBConstants.DATA_CASES_ROWS.get("Alexander Belltest"), DBConstants.DATA_CASES_FIELDS.get("Last Name"));
		contact.append(contactFirstName).append(" ").append(contactLastName);
		type(contact.toString(), contactNameCaseCommentField);
		// time to load
		Thread.sleep(2000);
		click(searchResultContactName);
		// time to load
		Thread.sleep(2000);
		click(getContactList("Contact Name", contact.toString()));
		type(contact.toString(), customerNameCaseCommentField);
		click(customerNameCaseCommentField);
		Thread.sleep(2000);
		click(searchResultCustomerName);
		click(getContactList("Customer Name", contact.toString()));
		click(saveCase);
		clickOnAlert();
		Thread.sleep(4000);
	}

	public void createCase(String type) throws InterruptedException, IOException {
		goNavigationMenu("Home");
		click(globalCreateTrigger);
		Thread.sleep(1000);
		click(createCaseFromGlobalActions);
		Thread.sleep(4000);
		click(brandCaseCommentField);
		Thread.sleep(2000);
		click(getItemPopUP("Toyota"));
		click(typeCaseCommentField);
		Thread.sleep(2000);
		click(getItemPopUP(type));
		click(statusCaseCommentField);
		Thread.sleep(2000);
		click(getItemPopUP("In Progress"));
		StringBuilder contact = new StringBuilder();
		String contactFirstName = getSomeValue(DBConstants.DB_TAB_DATA_CASES,
				DBConstants.DATA_CASES_ROWS.get("Alexander Belltest"), DBConstants.DATA_CASES_FIELDS.get("First Name"));
		String contactLastName = getSomeValue(DBConstants.DB_TAB_DATA_CASES,
				DBConstants.DATA_CASES_ROWS.get("Alexander Belltest"), DBConstants.DATA_CASES_FIELDS.get("Last Name"));
		contact.append(contactFirstName).append(" ").append(contactLastName);
		type(contact.toString(), contactNameCaseCommentField);
		// time to load
		Thread.sleep(2000);
		click(searchResultContactName);
		// time to load
		Thread.sleep(2000);
		click(getContactList("Contact Name", contact.toString()));
		type(contact.toString(), customerNameCaseCommentField);
		click(customerNameCaseCommentField);
		Thread.sleep(2000);
		click(searchResultCustomerName);
		click(getContactList("Customer Name", contact.toString()));
		click(saveCase);
		clickOnAlert();
		Thread.sleep(4000);
	}

	public void createCaseAgent(String type, String subType) throws InterruptedException, IOException {
		goNavigationMenu("Home");
		click(globalCreateTrigger);
		Thread.sleep(1000);
		click(createCaseFromGlobalActions);
		Thread.sleep(4000);
		click(brandCaseCommentField);
		Thread.sleep(2000);
		click(getItemPopUP("Toyota"));
		click(typeCaseCommentField);
		Thread.sleep(2000);
		click(getItemPopUP(type));
		click(subTypeCaseCommentField);
		Thread.sleep(2000);
		click(getItemPopUP(subType));
		click(statusCaseCommentField);
		Thread.sleep(2000);
		click(getItemPopUP("In Progress"));
		StringBuilder contact = new StringBuilder();
		String contactFirstName = getSomeValue(DBConstants.DB_TAB_DATA_CASES,
				DBConstants.DATA_CASES_ROWS.get("Alexander Belltest"), DBConstants.DATA_CASES_FIELDS.get("First Name"));
		String contactLastName = getSomeValue(DBConstants.DB_TAB_DATA_CASES,
				DBConstants.DATA_CASES_ROWS.get("Alexander Belltest"), DBConstants.DATA_CASES_FIELDS.get("Last Name"));
		contact.append(contactFirstName).append(" ").append(contactLastName);
		type(contact.toString(), contactNameCaseCommentField);
		// time to load
		Thread.sleep(2000);
		click(searchResultContactName);
		// time to load
		Thread.sleep(2000);
		click(getContactList("Contact Name", contact.toString()));
		type(contact.toString(), customerNameCaseCommentField);
		click(customerNameCaseCommentField);
		Thread.sleep(2000);
		click(searchResultCustomerName);
		click(getContactList("Customer Name", contact.toString()));
		click(saveCase);
		clickOnAlert();
		Thread.sleep(4000);
	}

	public void addCoding() throws InterruptedException {
		click(addCoding);
		click(addCoddingQuickCode);
		type("3G", addCoddingQuickCode);
		sendKey(addCoddingQuickCode, Keys.SPACE);
		Thread.sleep(4000);
		sendKey(addCoddingQuickCode, Keys.ARROW_DOWN);
		sendKey(addingCodeQuickCodeLi, Keys.ENTER);
		click(addCoddingCondition);
		sendKey(addCoddingCondition, Keys.DELETE);
		type("b", addCoddingCondition);
		Thread.sleep(1000);
		sendKey(addCoddingCondition, Keys.ARROW_DOWN);
		Thread.sleep(1000);
		sendKey(addCoddingCondition, Keys.ARROW_DOWN);
		sendKey(addingCodeConditionLi, Keys.ENTER);
		click(addCoddingSave);
	}

	public void addNewCoding() throws InterruptedException {
		click(addNewCodingCRButton);
		click(newCodingQuickCode);
		type("3G", newCodingQuickCode);
		sendKey(newCodingQuickCode, Keys.SPACE);
		Thread.sleep(4000);
		click(newCodingModalLi);
		// click(newCodingQuickCode);
		sendKey(addCoddingCondition, Keys.DELETE);
		type("b", addCoddingCondition);
		Thread.sleep(1000);
		sendKey(addCoddingCondition, Keys.ARROW_DOWN);
		Thread.sleep(1000);
		click(addingCodeConditionLi);
		click(newCodingSaveButton);
	}

	public void globalSearchContact(String search) throws InterruptedException {
		Thread.sleep(10000);
		assertTrue(isDispleyed(globalSearch), "The global search is not available ");
		click(globalSearch);
		type(search, globalSearchInput);
		Thread.sleep(10000);
		String path = "//div[contains(@class,'record-suggestion')]//span[contains(text(),'Contact')]/ancestor::search_dialog-instant-result-item";
		By locator = By.xpath(path);
		Thread.sleep(10000);
		if (isDispleyed(locator)) {
			assertTrue(isDispleyed(locator), "The search was not showing in the search...");
			click(locator);

		} else {

			Thread.sleep(10000);
			enter(globalSearchInput);
			String result = "//em[text()='Recommended Result']//ancestor::div[2]//h2//a";
			By resultLoc = By.xpath(result);
			refreshPage();
			Thread.sleep(10000);
			if (isDispleyed(resultLoc)) {
				click(resultLoc);
			} else {
				type(search, globalSearchInput);
				Thread.sleep(8000);
				enter(globalSearchInput);
				Thread.sleep(10000);
				if (isDispleyed(resultLoc)) {
					click(resultLoc);
				} else {
					Thread.sleep(10000);
					refreshPage();
					Thread.sleep(10000);
					assertTrue(isDispleyed(resultLoc), "The result was not created");
					click(resultLoc);
				}
			}
		}
	}

	public void globalSearch(String search, String strObject) throws InterruptedException {
		Thread.sleep(10000);
		assertTrue(isDispleyed(globalSearch), "The global search is not available ");
		click(globalSearch);
		click(allobjectSearch);
		By searchObject = By.xpath("//ul[@aria-label='Suggested For You']//span[@title='" + strObject
				+ "']//ancestor::lightning-base-combobox-item[1]");
		click(searchObject);

		type(search, globalSearchI);
		Thread.sleep(10000);
		String path = "//div[contains(@class,'record-suggestion')]//span[contains(text(),'"
				+ strObject.substring(0, strObject.length() - 1) + "')]/ancestor::search_dialog-instant-result-item";
		By locator = By.xpath(path);
		Thread.sleep(10000);
		if (isDispleyed(locator)) {
			click(locator);

		} else {

			Thread.sleep(10000);
			enter(globalSearchI);
			String result = "//em[text()='Recommended Result']//ancestor::div[2]//h2//a";
			By resultLoc = By.xpath(result);
			refreshPage();
			Thread.sleep(10000);
			if (isDispleyed(resultLoc)) {
				click(resultLoc);
			} else {
				type(search, globalSearchI);
				Thread.sleep(8000);
				enter(globalSearchI);
				Thread.sleep(10000);
				if (isDispleyed(resultLoc)) {
					click(resultLoc);
				} else {
					Thread.sleep(10000);
					refreshPage();
					Thread.sleep(10000);
					assertTrue(isDispleyed(resultLoc), "The result was not created");
					click(resultLoc);
				}
			}
		}
	}

	public void editCountryContact(String country) throws InterruptedException {
		click(countryContactEditButton);
		click(By.xpath("//span[text()='" + country + "']/ancestor::lightning-base-combobox-item"));
	}

	public List<String> getStateOptions(int row, int column) throws IOException {

		List<String> lstStatesOpt = new ArrayList<>();
		String data = getSomeValue("Texts", row, column);
		String[] arrayData = data.split(",");
		for (int i = 0; i < arrayData.length; i++) {
			lstStatesOpt.add(arrayData[i]);

		}
		System.out.println(lstStatesOpt);
		return lstStatesOpt;
	}

	public String generateXpathPLSubtype(String opt) {
		String xpathText = "//*[@data-value='" + opt + "']";
		return xpathText;
	}

	public void validatePLPicklistOptions(int row, int column) throws IOException, InterruptedException {
		List<String> lstOpt = getStateOptions(row, column);
		for (String opt : lstOpt) {
			By element = By.xpath(generateXpathPLSubtype(opt));
			assertTrue(isDispleyed(element), "The " + opt + " Option Was not found");
		}
	}
	

	public void createCaseFromContact(Map<String, String> mapCase) throws InterruptedException {
		click(By.xpath("//button[@name='Contact.Create_Case']"));
		for (String keyField : mapCase.keySet()) {
			String value = mapCase.get(keyField);
			System.out.println("Clave: " + keyField + ", valor: " + value);
			if (keyField.equals("Brand")) {
				click(By.xpath("//div[@class='quick-actions-panel']//span[text()='Brand #']/following::a[1]"));
				click(By.xpath("//div[contains(@class,'select-options') and contains(@class,'visible')]//a[@title='"
						+ value + "']"));
			} else if (keyField.equals("Type")) {
				click(By.xpath("//div[@class='quick-actions-panel']//span[text()='Type']/following::a[1]"));
				click(By.xpath(
						"//div[contains(@class,'select-options') and contains(@class,'')]//a[@title='" + value + "']"));
			} else if (keyField.equals("Sub Type")) {
				click(By.xpath("//div[@class='quick-actions-panel']//span[text()='Sub Type']/following::a[1]"));
				click(By.xpath(
						"//div[contains(@class,'select-options') and contains(@class,'')]//a[@title='" + value + "']"));
			} else if (keyField.equals("Vehicle")) {
				type(value,
						By.xpath("//div[@class='quick-actions-panel']//span[text()='Vehicle']/following::input[1]"));
				click(By.xpath("//div[@class='quick-actions-panel']//div[@class='listContent']//a"));
			}
		}
		click(By.xpath("//footer[@class='slds-modal__footer']//span[text()='Save']/parent::button"));
		click(By.xpath(
				"//span[contains(@class,'toastMessage slds-text-heading--small forceActionsText')]/descendant::div[@title]/parent::a"));
	}

	//public By save =By.xpath(")
	public By savebtn_on_Case = By.xpath(("//button[@name='SaveEdit']"));
	public By substatus_Error = By.xpath(("//header[@class='pageErrorHeader slds-popover__header']"));
	public By error_dismiss = By.xpath(("//button[@title='Close error dialog']//lightning-primitive-icon"));
	public By cancelbtn = By.xpath(("//button[normalize-space()='Cancel']"));
	// public By preferredCallback =
	// By.xpath(("//records-record-layout-item[@field-label='Preferred Callback Date
	// Time']"));
	public By preferredCallback = By
			.xpath(("//records-record-layout-item[@field-label='Preferred Callback Date Time']"));
	public By caseSummary = By.xpath(("//records-record-layout-item[@field-label='Case Summary']"));
	public By reimbursementPpwk_Tab = By.xpath((" //span[normalize-space()='Reimbursement Paperwork']"));

	public By closeCase = By.xpath(("//button[@class='slds-button slds-button_icon-border-filled']"));
	public By parent_editbox = By.xpath(("//input[@id='combobox-input-2935']"));
	public By scroll_toCase = By.xpath(("//*[contains(@title,'Edit Case Summary')]"));

	public By create_for_case = By.xpath(("//span[normalize-space()='Create From Case']"));
	public By task1 = By.xpath(("(//a[@title='Show 5 more actions'])[1]"));
	public By task2_clickEdit = By.cssSelector(("a[title='Edit']"));
	public By task3_clickBrand = By.xpath(("//a[@role='button'][normalize-space()='--None--']"));
	public By task4_clickToyota = By.cssSelector(("a[title='Toyota']"));
	public By task5_clickStatus = By.xpath(("//a[@role='button'][normalize-space()='Open']"));
	public By task6_clickCompleted = By.cssSelector(("a[title='Completed']"));
	public By task7_clickSave = By.xpath(("(//span[normalize-space()='Save'])[1]"));
	
	public By intiallabel =By.xpath("//span[text()='Initial Call']");
	public By casemanagername =By.xpath("//a[text()='Brian Alvarado']");
	public By contacttype= By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.Task.Caller_Type__c\"]//div//div[2]//span/span");
	public By dealertext =By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.Task.Dealer__c\"]//div[2]//span/span");
	public By datetext =By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.Task.ActivityDate\"]//div[2]//span");
	public By contacttype_case =By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.Case.Relationship__c\"]//slot//lightning-formatted-text");
	public By dealervalue_case =By.xpath("//flexipage-field[@data-field-id=\"RecordDealer_1_cField\"]//slot//slot//slot/slot/span");
	public By dealrship_Case =By.xpath("//flexipage-field[@data-field-id=\"RecordDealership_cField\"]//slot//slot//slot/slot/span");


	public void selectEdit2(String field, String value) throws Exception {
		// Time to load
		// click(By.xpath("//div/child::button[@aria-label='"+field+", "+value+"']"));
		String sub_type = "Sub Type";
		String goodwill = "Goodwill";
		click(By.xpath("(//div[@role='none'])[4]"));

		List<WebElement> type_picklist = driver.findElements(
				By.xpath("(//div[@role='listbox'])[4]/child::lightning-base-combobox-item[@role='option']"));
		System.out.println(type_picklist.size());
		// int count = 0;
		// iterate over list
		for (int i = 0; i < type_picklist.size(); i++) {
			// obtain text
			String s = type_picklist.get(i).getText();
			// System.out.println("Text is: " + s);
			if (s.contains(value)) {
				System.out.println(type_picklist.get(i).getText());
				// System.out.println();
				type_picklist.get(i).click();
				selectEdit(sub_type, goodwill);
				break;
			}

		}

		// click(By.xpath("//*[contains(@field-label,'"+field+"')]//*[contains(@aria-label,'"+field+"')]"));
//		WebElement dd = driver.findElement(By.xpath("//*[contains(@field-label,'"+field+"')]//*[contains(@aria-label,'"+field+"')]"));
//		dd.sendKeys(value);
//		dd.sendKeys(Keys.ENTER);
//		Thread.sleep(5000); 
//		Select select;
//		select = new Select(driver.findElement(By.xpath("//div[contains(@class,'isModal active')]//span[text()='"+field+"']//following::a[1]")));
//		select.selectByVisibleText(value);
	}

	// CMUD 9499
	SoftAssert a = new SoftAssert();

	public By substatus_Error1 = By
			.xpath("//div[normalize-space()='Please update the sub-status when status is closed.']");
	public By substatus_Error2 = By
			.xpath("//div[normalize-space()='Parent Case# is required when a duplicate Sub Status is selected.']");
	public By supporttopic_picklist1 = By
			.xpath("((//div[@role='listbox'])[6]/child::lightning-base-combobox-item[@role='option'])[2]");
	public By capture_case = By.xpath(
			"//div[@data-target-selection-name='sfdc:RecordField.Case.Case_Number__c']//div//div//lightning-formatted-text[@data-output-element-id='output-field']");
	public By capture_case1 = By.xpath(
			"//*[@title=\"Case #\"]/ancestor::records-highlights-details-item[@role=\"listitem\"]/child::div/child::p[2]");

	public By capture_email = By.xpath(" //a[@class='emailuiFormattedEmail']");
	public String closed = "Closed";
	public String pending = "Pending";
	public String open = "Open";
	public String parentid = "10456801";
	public String status = "Status";
	public String support_topic = "Support Topic";
	public String support_topic_type = "Cloud Navigation";
	public String sub_status1 = "Sub-Status";
	public String in_progress = "In Progress";
	public String close_case = "Close Case";
	public String duplicate = "Duplicate";
	public String string = "This is a sample text for testing.";
	By verificationCodeField = By.xpath("//label[text()='Verification Code']//ancestor::div[1]//input");
	By nextButton = By.xpath("//button[text()='Back']//ancestor::div[1]//button[text()='Next']");
	public By closeWindow = By.xpath("//button[@title='Close this window']");
	String case_id;

	public String capture_details() throws IOException, InterruptedException {

		if (isDispleyed(capture_case)) {
			case_id = getText(capture_case);
		} else {
			case_id = getText(capture_case1);
		}
		return case_id;
	}

	public String capture_details1() throws IOException, InterruptedException {

		String email_id = getText(capture_email);
		return email_id;
	}

	public void conditional_method1() throws IOException, InterruptedException {

		if (isDispleyed(error_dismiss)) {
			click(error_dismiss);
		}
		if (isDispleyed(substatus_Error1)) {

			System.out.println((getText(substatus_Error1)));
		} else {
			click(By.xpath("//*[contains(@title,'Edit Status')]"));
		}

	}

	public void conditional_method2() throws IOException, InterruptedException {
		if (isDispleyed(substatus_Error2))
			a.assertFalse(true, "Parent Case is required other than Duplicate Sub-status");
	}

	public void insertVerificationCode(String verificationCode) throws InterruptedException {
		type(verificationCode, verificationCodeField);
		click(nextButton);
	}

	public void addNewCodingInCase() throws InterruptedException {
		click(addCodingButton);
		// click(addCoddingQuickCode);
		type("Referral to Tier 2", addcodingSearch);
		Thread.sleep(4000);
		sendKey(addCoddingQuickCode, Keys.ARROW_DOWN);
		sendKey(addingCodeQuickCodeLi, Keys.ENTER);
		click(addCoddingSave);
	}

	public void condition3() throws InterruptedException {

		if (isDispleyed(closeWindow)) {

			System.out.println("I am in close method");
			driver.findElement(By.xpath("//button[@title='Close this window']")).click();
		}

	}

	public void position() throws InterruptedException {

		By elementUNDERtheTOP = new ByChained(preferredCallback, casesummary);
		System.out.println(getText(elementUNDERtheTOP));
	}

	// SalesAndService
	public void condition_remedy_cause() throws InterruptedException {
		WebElement condition = driver
				.findElement(By.xpath("//label[text()=\"Condition\"]/ancestor::lightning-textarea/child::div"));
		click(condition);
		condition.sendKeys("abc");
		WebElement cause = driver
				.findElement(By.xpath("//label[text()=\"Cause\"]/ancestor::lightning-textarea/child::div"));
		click(cause);
		cause.sendKeys("abc");
		WebElement remedy = driver
				.findElement(By.xpath("//label[text()=\"Remedy\"]/ancestor::lightning-textarea/child::div"));
		click(remedy);
		remedy.sendKeys("test");
	}

	// Switching Module
	By setup = By.id("related_setup_app_home");

	// Reimbursement
//	Reimbursement Paperwork
	public By reimbursement_Paperwork = By
			.xpath("//h3/child::button/child::span[contains(text(),'Reimbursement Paperwork')]");
//	Additional Documents List
	public By additional_documents_List = By.xpath("//span[text()='Additional Documents List']");
//	Additional Documents Required
	public By additional_documents_Required = By.xpath("//span[text()='Additional Documents Required']");
//	Correspondence Details
	public By correspondence_Details = By
			.xpath("//h3/child::button/child::span[contains(text(),'Correspondence Details')]");

	// Knowledge Management
	// By appLaunchMenu = By.xpath(AplicationConstants.XPATH_LAUNCH_MENU);
	// By searchLaunchInput =
	// By.xpath(AplicationConstants.XPATH_INPUT_LAUNCH_FIELD);

	/*
	 * public By KM_picklist = By.
	 * xpath("//div//one-app-launcher-menu-item//a[@data-label=\"Knowledge Management\"]/parent::*"
	 * ); //By navigationMenu =
	 * By.xpath("//span[text()='Show Navigation Menu']//ancestor::button[1]");
	 * public By Knowledge_picklist = By.xpath(
	 * "//div[@id=\"navMenuList\"]//div[@role=\"listbox\"]//div//a[@data-label=\"Knowledge\"]"
	 * ); public By new_btn = By.xpath(
	 * "//ul[starts-with(@class,'branding-actions')]//li//a/descendant::div[@title='New']"
	 * ); public By Next_btn
	 * =By.xpath("//button/descendant::span[text()=\"Next\"]"); public By title
	 * =By.xpath("//div[starts-with(@class,'uiInput')]/child::input[@type='text']");
	 * 
	 * public By Public_Faq_title =
	 * By.xpath("//article//h2[starts-with(@class,'inlineTitle')]"); public By
	 * Save_btn = By.xpath("//button[@title=\"Save\"]");
	 * 
	 * public String getArticleTitle() throws InterruptedException{ String[]
	 * Public_Faq =getText(Public_Faq_title).split(":") ; String trim_title =
	 * Public_Faq[1].trim(); return trim_title; } public By article_type =
	 * By.xpath("//div//span[starts-with(@class,'forceOutput')]"); public By
	 * Approvals_tab =
	 * By.xpath("//div[@class=\"uiTabBar\"]//ul//li//a[@title=\"Approvals\"]");
	 * public By SubmitApproval_btn =
	 * By.xpath("//div[@role=\"group\"]//ul//li//a[@title=\"Submit for Approval\"]"
	 * ); public By submittextbox =
	 * By.xpath("//div//div/child::textarea[@role='textbox']"); public By
	 * submit_approval =
	 * By.xpath("//div//div//button/descendant::span[text()=\"Submit\"]"); public By
	 * peer_review =
	 * By.xpath("//tr//th//span//div//a[text()=\"Peer Review Approval Request\"]");
	 * public By article_type_chck2 = By.xpath(
	 * "//div//div//span/descendant::span[starts-with(@class,'forceOutput')]");
	 */
	

	public void convert_case(String change_crtype, String change_cr_subtype) throws Exception {
		selectEdit_convertcase("Type", change_crtype);
		Thread.sleep(3000);
		selectEdit_convertcase("Sub Type", change_cr_subtype);
		click(savebtn_on_Case);
		//waitForInvisibilityOfElement(savebtn_on_Case);
		//refreshPage();
	}

	public void selectEdit_convertcase(String field, String value) throws Exception {
		// Time to load
		String type_picklistActual ="//button[starts-with(@aria-label,'"+field+"')]/parent::div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']/following-sibling::div/child::lightning-base-combobox-item[@role='option']";	
        ScrollToElement(driver.findElement(By.xpath("//label[text()='"+field+"']/following::button[1]")));
		click(By.xpath("//label[text()='"+field+"']/following::button[1]"));
		WebElement dd = driver.findElement(
				By.xpath("//label[text()='"+field+"']/following::button[1]"));
		List<WebElement> crTypes_picklistValues = driver.findElements(By.xpath(type_picklistActual));
		boolean flag = crTypes_picklistValues.stream().map(s -> s.getAttribute("innerText")).map(s -> s.trim())
				.anyMatch(s -> s.equals(value));
		System.out.println(flag);
		if(flag== true) {
		dd.sendKeys(value);
		dd.sendKeys(Keys.ENTER);
		}
		else {
			Assert.assertFalse(flag);
			System.out.println("Case not Convertable");
		}
	}

	// closeAlltabs
	public boolean CloseOpenTabsPostLogin() throws Exception {

		try {
		//	WaitForPageToLoad(60);
			String xpath = "(//button[contains(@title,'Close')])";
			String xp5 = "(//button[contains(@title,'Close')])[1]";
			if (isDispleyed(cancelEditContactButton))
				click(cancelEditContactButton);
			if (driver.findElements(By.xpath(xpath)).size() > 0) {
				List<WebElement> buttons = driver.findElements(By.xpath(xpath));
				for (WebElement wb : buttons) {
					if ((driver.findElement(By.xpath(xp5)).isDisplayed())) {
						driver.findElement(By.xpath(xp5)).click();
						Thread.sleep(1000L);
						// break;
					}
					// System.out.println("xp2 -->wb.isDisplayed():"+wb.isDisplayed());
					// System.out.println("xp2 --> wb.isEnabled():"+wb.isEnabled());
				}
			}
			if (isDispleyed(By.xpath("//button[@title='Dismiss notification']")))
				click(By.xpath("//button[@title='Dismiss notification']"));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Coding value should not be able to Edit");
			return false;

		}
		return false;
	}

	// close Subtab
	public void CloseSubTab(String TabWB) throws Exception {
		try {
			driver.findElement(By.xpath("//*[contains(@href,'" + TabWB
					+ "')]/parent::*/descendant::*/descendant::button[contains(@title,'Close')]")).click();
			Thread.sleep(2000L);
			System.out.println("Closing Subtab is successful");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Closing Subtab is unsuccessful");
		}
	}

	// US CMUD 10256
	public By Vehicle = By.xpath(
			"//records-record-layout-item[@field-label='Vehicle']//span[contains(@class,'test-id__field-value')]");
	public By JiraVIN = By.xpath("//span[text()='VIN #']/ancestor::p/following-sibling::p");
	public By questionnaire = By
			.xpath("//p//strong[contains(text(),'Questionnaire')]/following::button[text()='Start']");
	public By jiraticket_number = By.xpath("//slot/descendant::lightning-formatted-text[contains(text(),'CMSTEST')]");
	String vehicle = "Vehicle";
	public By Vehicle_edit = By.xpath("//label[text()='Vehicle']");
	public By Vehicle_input = By.xpath("//input[@placeholder='Search Vehicle Associations...']");
	public By createcontact_btn = By.xpath("//button[@name='Contact.Create_Case']");

	public By Vehicle_clearselection = By
			.xpath("//label[text()='Vehicle']/following::button[@title='Clear Selection']");

	public By vehicle_saveWait() throws Exception {
		By vehicle_save = By.xpath(
				"//records-record-layout-item[@field-label='Vehicle']//a[contains(@href,'Vehicle')]//span[text()='"
						+ getSomeValue("JIRATICKET", 13, 1) + "']");
		return vehicle_save;
	}
	
	public By vehicle_picklist() throws Exception {
		
		By vehicle_picklist = By.xpath("//span[contains(text(),'Show All Results for \""+ getSomeValue("JIRATICKET", 13, 1) + "\"')]");
		return vehicle_picklist;
	}
	public void vin() throws Exception {
		WebElement VinNumberField1 = driver.findElement(By.xpath("//div[@part=\"input-container\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(VinNumberField1).doubleClick().build().perform();
		driver.findElement(By.xpath("//div[@part=\"input-container\"]")).sendKeys(Keys.chord(Keys.CONTROL, "c"));
		driver.findElement(By.xpath("//div[@part='input-container']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));

	}
	
public  WebElement save_btn() throws Exception {
		
	WebElement savebtn_on_Case = driver.findElement(By.xpath(("//button[normalize-space()='Save']")));
		return savebtn_on_Case;
	}
	
public By TelematicsButton = By.xpath("//*[@data-label='Telematics'])[last()]");
public By connectedServicesQuuestionarie = By.xpath("//*[contains(text(),'Connected Services Questionnaires')]");
public By editpencil =By.xpath("//*[@title='Edit Executive Office']//span[1]");
public By casesummary =By.xpath("(//*[@field-label=\"Case Summary\"]//*[contains(text(),'Case Summary')])[9]");

 public void verifyText(String text) {
// String text1 =By.xpath("//*[contains(text(),'"+ text +"')]").ge;
 boolean text1 = driver.findElement(By.xpath("//*[contains(text(),'"+ text +"')]")).isDisplayed();
 assertTrue((text1),"Text is displayed");
	//return ;
}  
public boolean isTextPresent(String expectedText, By locator) {
     WebElement element = driver.findElement(locator);
     String actualText = element.getText().trim();
     return actualText.equals(expectedText);
 }
//common method to verify texts in caselayout -created by divya
public void VerifyTexts_Caselayout(String Section,String value,String Expectedvalue) {
	if(Section.equals("CaseDetails")) {
		String text =driver.findElement(By.xpath("//span[text()='"+value+"']/../../../dd//slot//lightning-formatted-text")).getAttribute("innerText");
        assertEquals(text,Expectedvalue);
	}

}

public void verifyTextNotDisplayed(String text) {
	try {
	 boolean text1 = driver.findElement(By.xpath("//*[contains(text(),'"+ text +"')]")).isDisplayed();
	}
	catch(NoSuchElementException e) {
		assert true;
		System.out.println("Element is not displayed");
		
	}
   
}
public void selectAdditionalDocuments(String value) throws IOException, InterruptedException {
click(By.xpath("//*[@title='"+value+"']"));
click(By.xpath("//*[@title='Move selection to Chosen']"));

}
//will click save in case page
public By savebutton =By.xpath("//button[@name='SaveEdit']");
public By value =By.xpath("//*[@data-value='--None--']");
public By closedstatus =By.xpath("//*[@data-value='Closed']");
public By caseclosebutton =By.xpath("//button[@class='slds-button slds-button_icon-border-filled]");
public By searchSetup1 =By.xpath("//input[@title='Search Setup']");
public By KM_picklist =  By.xpath("//div//one-app-launcher-menu-item//a[@data-label=\"Guest Engagement\"]/parent::*");
//public By additionaldocumentverification= By.xpath("//*[@field-label='Additional Documents Required']//*[contains(text(),'"+text+"')");
public void search(String strCase) throws InterruptedException {
 By  navigation = By.xpath("//*[@placeholder=\"Search apps and items...\"]");
// By value =By.xpath("//*[@data-label=\\\"Guest Engagement\\\"]")
   click(appLaunchMenu);
   click(searchLaunchInput);
   type("Guest Engagement",searchLaunchInput);
   click(KM_picklist);
   Thread.sleep(8000);
  /* click(By.xpath("//*[@class=\"slds-icon-waffle\"]"));
   click(By.xpath("//*[@placeholder=\"Search apps and items...\"]"));	   
   type("Guest",navigation);*/
   //sendKey(By.xpath(""));
   //Thread.sleep(7000);
   By result = By.xpath("//div[text()='" + strCase + "']//ancestor::li[1]");
	click(globalSearch);
	type(strCase, globalSearchInput);
	By search =By.xpath("//*[@class=\"data-match\" and contains(text(),'"+strCase+"')]");
click(search);
  // click(searchSetup1);
  // type(strCase, searchSetup1);
	
 Thread.sleep(20000);

}
public By searchvehicle = By.xpath("//*[@placeholder='Search Vehicle Associations...']");
public By vehicleaddociationname =By.xpath("//*[@data-target-selection-name=\"sfdc:RecordField.VehicleAssociation__c.Name\"]//input");
public By searchvechiles =By.xpath("//*[@placeholder=\"Search Vehicles...\"]");
public By searchcontacts =By.xpath("(//*[@placeholder=\"Search Contacts...\"])[last()]");
public By save =By.xpath("(//*[@title=\"Save\"])[last()]");
public By createnewvechileassociation =By.xpath("//*[@title=\"New Vehicle Association\"]");
public By vinbutton =By.xpath("//button[contains(text(),'Validate VIN')]");
public By vinnumber=By.xpath("//*[@data-my-id='vin-number']//input");
public By none =By.xpath("//*[@data-value=\"--None--\"]");
public By select =By.xpath("//*[@data-value=\"--None--\"]");

public String searchhvehicle = ("//*[@placeholder='Search Vehicle Associations...']");
public String randomStr =  "AutomationTest" + new Random().nextInt(10000);   

public String randomStr1 = "AutomationTest" + new Random().nextInt(1000);

public String randomStr2 = "AutomationTest" + new Random().nextInt(5000);

public By details_tab = By.xpath("//div[@class=\"uiTabBar\"]//ul//li//a[@title=\"Details\"]");

public void searchvalue (String strCase) throws InterruptedException {
Thread.sleep(4000);
//assertTrue(isDispleyed(globalSearch), "The global search is not available ");
click(globalSearch);
type(strCase, globalSearchInput);
click(By.xpath("//span[@title=\"RITA NAHHAS\"]//..//."));
//sendKey(globalSearchInput,Keys.ENTER);
Thread.sleep(1000);
}

public List<WebElement> get_DRArticlelabelfields(List<WebElement> list_DR) throws InterruptedException{

return list_DR;

}



public List<WebElement> get_InternalArticlelabelfields(List<WebElement> list_internal) throws InterruptedException{

return list_internal;

}
public By casenumbertext = By.xpath("//slot/records-highlights-details-item[1]/div/p[2]/slot/lightning-formatted-text");

public void java() {
JavascriptExecutor js = (JavascriptExecutor) driver;  

}
public By avaliablechat =By.xpath("//*[contains(text(),'Available - Chat')]");

public By edit_type = By.xpath("//*[contains(@title,'Edit Type')]");

public By omichannel=(By.xpath("//*[@data-aura-class=\"oneUtilityBarItem\"]//span[contains(text(),'Omni-Channel')]"));
public By navigation =(By.xpath("(//*[@class=\"slds-dropdown-trigger slds-dropdown-trigger_click\"]//*[@data-key=\"down\"])[last()]"));
public By Chat=(By.xpath("//*[contains(text(),'Available - Chat')]"));
public By recall =By.xpath("//*[contains(text(),'Recall')]//..//div");
public By articlelist =By.xpath("//*[@class=\" article-list \"]//li//a//h2");
public By message =By.xpath("//*[@class=\"message\"]");
public By showmoreactions=By.xpath("//button[@class='slds-button slds-button_icon-border-filled']");
public By vinclick =By.xpath("//*[@title='Validate VIN']");
public By voicecalllabel =By.xpath("(//button[(text()='Voice Call')])[last()]");
public By errorpartsmessage =By.xpath("//span[contains(text(),'Please convert the case to a Parts type before assigning it to the Parts queue')]");
public By labelMonroney =By.xpath("//p[@title=\"Case Owner\"]/..//p//span//span/slot");

public void selectfieldsCaseLayout(String field, String value) throws InterruptedException {
//Time to load
	click(By.xpath("//*[contains(@field-label,'"+field+"')]//*[starts-with(@aria-label,'"+field+"')]"));
	WebElement dd = driver.findElement(By.xpath("//*[contains(@field-label,'"+field+"')]//*[starts-with(@aria-label,'"+field+"')]"));
	dd.sendKeys(value);
	dd.sendKeys(Keys.ENTER);	
}
public void handleAlert() {
 Alert alert = driver.switchTo().alert();
// String alertText = alert.getText(); // Get the alert text
// System.out.println("Alert Text: " + alertText);
alert.accept();
}
public By clickmoreactions =By.xpath("(//button[@class='slds-button slds-button_icon-border-filled'])");
public By clickmoreactions_ =By.xpath("(//button[@class='slds-button slds-button_icon-border-filled'])[last()]");

public By cancel =By.xpath("//button[@name=\"CancelEdit\"]");
public void alertaccept() {

  try {}
	catch(UnhandledAlertException e)
	{
		Alert alert = driver.switchTo().alert();		
        alert.accept();
	}
}public void javascriptclick(WebElement e) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", e);
}
//j.executeScript("arguments[0].click();", l);
public String getCellValueInt(String filepath, String sheetName, int rowNumber, int cellNumber) throws IOException{
	
	File file = new File(filepath);
	FileInputStream inputStream = new FileInputStream(file);
	XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);
	
	XSSFSheet newSheet = newWorkBook.getSheet(sheetName);
	XSSFRow row = newSheet.getRow(rowNumber);
	
	XSSFCell cell = row.getCell(cellNumber);
	
	DataFormatter formatter = new DataFormatter();
	String val = formatter.formatCellValue(cell);
	newWorkBook.close();
	return val;
}

public By editexecutiveoffice =By.xpath("(//span[(text()=\"Edit Executive Office\")]/..)[last()]");
public By submit =By.xpath("//button[text()='SUBMIT']");
public By executiveofficelabel =By.xpath("//span[(text()=\"Edit Executive Office\")]/../..//span/..//..//div");
public By executivecheckbox =By.xpath("//input[@name='CCM_Executive_Office__c']");
public By associaterefferal =By.xpath("//*[@data-target-selection-name=\"sfdc:RecordField.Case.CCM_Associate_Referral__c\"]//span//input");
public By refferalcheckbox = By.xpath("//*[@data-target-selection-name=\"sfdc:RecordField.Case.CCM_Executive_Office__c\"]//span//input");
public By description_casePagelayoutfield =By.xpath("//span[text()='Description']");
public By caseDuration =By.xpath("//span[text()='Case Duration (Days)']");
public By relatedCases =By.xpath("//span[@title='Related Cases']");
public By autocloseDate =By.xpath("//span[text()='Auto-Close Date']");
public By region_casePagefield =By.xpath("//span[text()='Region']");
public By errormessage_markascomplete =By.xpath("//span[contains(text(),'Oops...you')]");

//US CMUD 10602

public String Succ_Coding = "Coding is saved successfully.";
public String Goodwill_Coding = "Goodwill created successfully.";
public String CodingSucc ="//div[(text()='Error' or text()='ERROR' or text()='Success' or text()='Warning')]/parent::div/descendant::span[contains(text(),'"
		+ Succ_Coding + "')]";
public String Offer_layout = "//h1//div[text()='Offer']";
public String WarrantySucc="//span[text()='Warranty Eligibility']/following::slot//lightning-formatted-text[text()='Yes']";
public By header_options = By.xpath("WebElement header_options = driver.findElement(By.xpath(\"(//div[contains(@class,'active') and contains(@class,'windowViewMode')]/descendant::li[contains(@class,'slds-button') and contains(@class,'dropdown')])[1]\"));");	

public WebElement headerbtn() {
	WebElement header_options = driver.findElement(By.xpath("(//div[contains(@class,'active') and contains(@class,'windowViewMode')]/descendant::li[contains(@class,'slds-button') and contains(@class,'dropdown')])[1]"));
return header_options;
}
public String GoodwillcreateSucc ="//div[(text()='Error' or text()='ERROR' or text()='Success' or text()='Warning')]/parent::div/descendant::span[contains(text(),'"
		+ Goodwill_Coding + "')]";

/**
* @Description Clicking on Details tab against the record in Classic.
* @throws Exception
*/
synchronized public void ClickONSubTab(String SubTabName) throws Exception {
	try {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Thread.sleep(1000L);
		String xp = "//*[local-name()='ul' or local-name()='div'][@role='tablist']/descendant::li/descendant-or-self::*[normalize-space(text())='"
				+ SubTabName.trim() + "'][1]";
		WaitForElement(xp, 30);
		System.out.println("xp:" + xp);
		Thread.sleep(1000L);
		ScrollToElement(driver.findElement(By.xpath(xp)));
//		driver.findElement(By.xpath(xp)).click();
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath(xp)));
		System.out.println("Clicked on Sub tab (" + SubTabName + ") against the record.");
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Unable to find the Sub Tab (" + SubTabName + ") for clicking.");

	}
}
//US 10612
public void ScrollToElement(WebElement element) throws Exception {
	try {
		int position = element.getLocation().y - 200;
		((JavascriptExecutor) driver).executeScript("window.scroll(0," + position + ")");
		// ((JavascriptExecutor)remoteDriver).executeScript("arguments[0].scrollIntoView();",
		// element);
		System.out.println("Successfully scrolled untill element on positio:" + position);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Unable to scroll until elemnt");
	}
}

//US 10600

public By brand_name =By.xpath("(//p[@title='Brand']/following::slot/descendant::lightning-formatted-text)[1]");
	
//US 10858

public By contact_OfferTab =By.xpath("//li[@data-label='Offers']");
public By contact_viewAllOffers =By.xpath("//span[@title='Offer']");
public By contact_OfferHeading =By.xpath("//h1[text()='Offer']");
public By offer_newColumns =By.xpath("//span[@title='Total Payment' or @title ='Total Repair Auth' or @title='Goodwill Type']");
public By offer_Allcolumns =By.xpath("//span[contains(@class,'button-menu')]//a//span[@class='slds-truncate']");
//public By last_rowOffer =By.xpath("//span[@title='Offer']/following::span[contains(@class,'slds-row-number')][last()]");


//US 11871
public By contact_PaymentsTab =By.xpath("//li[@title='Contact Details']/following::li[@data-label='Payments' and@class='slds-tabs_default__item']");
public By contact_viewAllPayments =By.xpath("//span[@title='Payments']/following::a[@class='slds-card__footer']");
public By contact_PaymentsHeading =By.xpath("//h1[text()='Payments']");
public By payments_Allcolumns =By.xpath("//span[contains(@class,'button-menu')]//a//span[@class='slds-truncate']");


public By editparts =By.xpath("//*[@title=\"Edit Pending repair due to part delay?\"]/span");
public By option =By.xpath("//button[@aria-label=\"Pending repair due to part delay?, --None--\"]");
public By Nooption =By.xpath("//span[text()='No']/../..");
public By yesoption =By.xpath("//span[text()='Yes']/../..");
public By yesoptions =By.xpath("//*[@aria-label=\"Pending repair due to part delay?, Yes\"]");
public By noneoption =By.xpath("//span[text()='--None--']/../..");

public By savebutton_parts =By.xpath("//button[text()='Save']");
public By errormessage =By.xpath("//*[contains(text(),'This is not a Parts Delay Case. Do not assign to Parts queue.')]");

public By rental=By.xpath("//*[@aria-label='Rental Status, --None--']");
public By rentalprovidername =By.xpath("//label[text()='Rental Provider Name']");
public By rentalproviderinput =By.xpath("//label[text()='Rental Provider Name']/..//input");
public By statusvalue =By.xpath("//*[@data-field-id=\"RecordStatusField\"]//span[text()='Status']//following::lightning-formatted-text[text()='Open']");
public By substatusvalue =By.xpath("//*[@field-label=\"Sub-Status\"]//span[text()='Sub-Status']/following::lightning-formatted-text[text()='Open']");
public By errortextsubstatus =By.xpath("//*[text()='Please select Reopen Sub Status.']");
public By errorstatustext =By.xpath("//*[(text()='You encountered some errors when trying to save this record')]");
public By editSubstatusdependencies =By.xpath("//button[contains(@aria-label,'Sub-Status')]");
public String generaterandomdate() {
DayOfWeek desiredWeekday = DayOfWeek.SATURDAY; // Specify the desired weekday
LocalDate currentDate = LocalDate.now();
LocalDate saturday = currentDate.with(TemporalAdjusters.nextOrSame(desiredWeekday));
System.out.println("Selected Date: " + saturday);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
String saturdaydate = saturday.format(formatter);
return saturdaydate;
}

public String dateconversion(String date) throws Exception {
	//SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
	//Date dates;
	   // dates = parser.parse(date);
		String trimmedText = date.replaceAll("^0+","");


	return trimmedText;
	}
	
public By casenumber =By.xpath("//*[@data-target-selection-name=\"sfdc:RecordField.Case.Case_Number__c\"]//span[text()='Case #']/../..//div[2]");
public By mark_completeBtn =By.xpath("//button[contains(@class,'mark-complete')]");
public By editCase_btn =By.xpath("//a[contains(@class,'rowActionsPlaceHolder ')]");
public By editoption_btn =By.xpath("//div[@role='menu']//ul//li//a[@title='Edit']");
public By explainedfuelreceiptlabel=By.xpath("//span[text()='Explained Fuel Receipts Policy']");
public By explainedfuelreceiptcheckbox =By.xpath("//span[text()='Explained Fuel Receipts Policy']/../..//div//span/input");
public By totalnumberofextensionslabel =By.xpath("//*[text()='Total Number of Extensions']");
public By totalnumberofextensioninput =By.xpath("//*[text()='Total Number of Extensions']/..//div/input");
public By totalnumberofextensionvalue =By.xpath("//*[@data-target-selection-name=\"sfdc:RecordField.Case.CCM_No_of_Extensions__c\"]//div[2]//lightning-formatted-number");
public By estimatedlengthofrental =By.xpath("//*[text()='Estimated Length of Rental']/..//div/input");
public By edittotalnumberofextension =By.xpath("//button[@title=\"Edit Total Number of Extensions\"]");
public By errortextstatus =By.xpath("//*[contains(text(),\"You do not have permissions to open this case.\")]");
public By canceleditdependencies =By.xpath("//button[text()='Cancel']");
public By parentcaselabel =By.xpath("//*[text()='Parent Case']");
public By parentcaseinput =By.xpath("//input[@placeholder=\"Search Cases...\"]");
public By inprogressbutton = (By.xpath("//one-record-home-flexipage2//li[@data-name=\"In Progress\"]"));
public By nextButton_Dr =By.xpath("//button[text()='Next']");
public By errorcasemanager =By.xpath("//li[contains(text(),'Oops...you don')]");


public String generateDate() {
    Date date = new Date();  

	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
    String strDate = formatter.format(date);

    return strDate;
}

public void navigation(String value) throws Exception {
	Actions scroll;
    scroll = new Actions(driver);
	By navigationMenu = By.xpath("//span[text()='Show Navigation Menu']//ancestor::button[1]");
click(navigationMenu);
	WebElement menu =driver.findElement(By.xpath("//span[text()='"+value+"']/../../../.."));
	ScrollToElement(menu);
    scroll.moveToElement(menu).click().perform();

	

}
public void inlineEdit(String value) throws Exception {
	Actions scroll;
	JavascriptExecutor js = (JavascriptExecutor) driver;
    scroll = new Actions(driver);
	try {
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,3000)", "");
		WebElement editvalue =driver.findElement(By.xpath("//*[contains(@title,'"+value+"')]"));
	    ScrollToElement(editvalue);
		js.executeScript("arguments[0].click();", editvalue);

     } catch(StaleElementReferenceException e) {
    	 refreshPage();
    	 Thread.sleep(4000);
    	 WebElement editvalue =driver.findElement(By.xpath("//*[contains(@title,'"+value+"')]"));
 	    scroll.moveToElement(editvalue).click().perform();     }	
}

public void editDependencies(String value) throws InterruptedException {
	click(editSubstatusdependencies);
	click(By.xpath("//*[@title='"+value+"']/../.."));
}

public void editDependenciesStatus(String value) throws InterruptedException {
	Actions scroll;
    scroll = new Actions(driver);
	click(By.xpath("//button[contains(@aria-label,'Status')]"));
	Thread.sleep(4000);
	WebElement editvalue =driver.findElement(By.xpath("//*[@data-value='"+value+"']"));
    scroll.moveToElement(editvalue).click().perform();
}

public void validateText(String Text)
{
	assertTrue(isDispleyed(By.xpath("//*[text()='"+Text+"']")));
	System.out.println("Validated the presence of text" +Text);
	
	}
public void verifycasecomment() {
	String text =driver.findElement(By.xpath("//span[text()='Comment Status']/../..//div[2]/span")).getAttribute("innerText");
	//assertEquals("",text);
	if(text.isEmpty()) {
		System.out.println("Text is not displayed");

		assert true;
		
	}else {
		System.out.println("Text is  displayed" +text);

		assert false;

	}
}
public String generatetomorrowsdate() {
    LocalDate today = LocalDate.now();
    LocalDate tomorrow = today.plusDays(1);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/d/yyyy");
    String tomorrowDateStr = tomorrow.format(formatter);
    return tomorrowDateStr;
}


public void assert_values(String[] subtypes_picklistValues,String value) {
	String subtype_picklistActual ="//label[text()='"+value+"']/following-sibling::div//lightning-base-combobox//div/following-sibling::div//lightning-base-combobox-item[@role='option']";

	List<WebElement> Subtype_picklist = driver.findElements(By.xpath(subtype_picklistActual));
	for(WebElement items:Subtype_picklist) {
		System.out.println(items.getAttribute("innerText"));
		System.out.println("Verified texts from ui");

	}		
	Stream<String> subStatus_actuallist = Subtype_picklist.stream().map(s -> s.getAttribute("innerText")).map(s -> s.trim());	
	List<String> newFilter = Stream.of(subtypes_picklistValues).map(s -> s.trim()).collect(Collectors.toList());
	System.out.println(newFilter);
	boolean flag = subStatus_actuallist.anyMatch(new HashSet<>(newFilter)::contains);
	Assert.assertFalse(flag, "Expected Columns not removed");



}

//US CMUD 10852

public By checkArticle_scheduledflow =By.xpath("//span[text()='Check Article status after2 days']/following::div[@class=\"connector-badge slds-align_absolute-center slds-badge\"]/span[1]");
public By task =By.xpath("//a[contains(text(),'Initial Call')]");
public By casemangername =By.xpath("//a[contains(text(),'Briann Alvarado')]");
public By tommorow =By.xpath("//div[contains(text(),'Tomorrow')]");
public By casemanager_label =By.xpath("(//span[text()='Case Manager'])[2]");
public By casemanager_caseowner =By.xpath("//div[@class=\"ownerName\"]//span[text()='Case Manager']");
public By closetask =By.xpath("//button[contains(@title,\"Close Initial Call\")]");
public By casemanager_caseowner2 =By.xpath("//div[@class=\"ownerName\"]//a[text()='Andrew Davitt']");
public By Case_number = By.xpath("(//div[@data-target-selection-name=\"sfdc:RecordField.Case.Case_Number__c\"]//lightning-formatted-text[contains(text(),*) and @slot=\"output\" ])");
public By closecase_lastone =By.xpath("(//button[contains(@title,\"| Case\")])[last()]");
public By closecase_one =By.xpath("(//button[contains(@title,\"Close 11\")])[1]");
public By otherlabel =By.xpath("//label[text()='Other']");
public By otherinput =By.xpath("//label[text()='Other']/..//div//textarea");
public By rentalprovideroptions =By.xpath("//label[text()='Rental Provider Name']/../..//div//button//span");

public By totdaldayslabel =By.xpath("//label[text()='Total Days']");
public By totaldaysinput =By.xpath("//label[text()='Total Days']/../div/input");
public By rentaldeniedstatus =By.xpath("//label[text()='Declined Rental Reason']/../div//textarea");
public By rentaldeniedstatuslabel =By.xpath("//label[text()='Declined Rental Reason']");
	public By substatus_status =By.xpath("//button[@title='Edit Sub-Status']/../..//slot/lightning-formatted-text");
public By done_button =By.xpath("//button[@type=\"submit\"]");

//US CMUD 11239
public void assert_DelayedPartsfieldsmatch() throws Exception {
	By ETA_Sectionfields = By.xpath("//span[text()='ETA for Guest Communications']/following::div[contains(@data-target-selection-name,'CCM')]//div[@part='combobox' or @class='test-id__field-label-container slds-form-element__label']/descendant::*[@class='slds-form-element__label' or @class='test-id__field-label']");
	List<WebElement> ETA_GuestCommfields_actual = driver.findElements(ETA_Sectionfields);
	System.out.println(ETA_GuestCommfields_actual.size());
	ETA_GuestCommfields_actual.stream().map(s -> s.getText()).map(s -> s.trim()).forEach(s -> System.out.println(s));
	List<String> eta_formfields_actuallist = ETA_GuestCommfields_actual.stream().map(s -> s.getText())
			.map(s -> s.trim()).collect(Collectors.toList());
	List<String> newFilter = Stream
			.of("Pending","Part Shipped","--None--")
			.map(s -> s.trim()).collect(Collectors.toList());

	a.assertTrue(CollectionUtils.isEqualCollection(eta_formfields_actuallist, newFilter),
			"ETA for Guest Communications Fields not match with actual");
}

//Conditional Method to check the time frame

public String check_timeFrame(int parts_date) throws Exception {
	String time_frame="";
	if(parts_date < 1) {
		System.out.println("Invalid Date");
		time_frame ="Invalid Date";
	}
	else if(parts_date >1 && parts_date <=10) {
		System.out.println("Early");
		time_frame ="Early";
	}
	else if(parts_date >10 && parts_date <=20) {
		System.out.println("Early");
		time_frame ="Mid";
	}
	else if(parts_date >20 && parts_date <= 31) {
		System.out.println("Late");
		time_frame ="Late";
	}
	return time_frame;
}

public void selectEdit_pkFields(String field, String value) throws Exception {
	// Time to load
//	Assert.assertTrue(isDispleyed(By.xpath("//label[text()='Status']/following::button[1]")));
//	click(By.xpath("//label[text()='Status']/following::button[1]"));
	Actions scroll;
    scroll = new Actions(driver);
    By PKform_casefield =By.xpath("//h2[.='New PK Chat Form']/..//..//span[text()='Case #']");
    //WebElement fieldname= driver.findElement(By.xpath("//label[text()='\"+field+\"']/following::button[1]"));
    //scroll.moveToElement(fieldname).click().perform();
    ScrollToElement(driver.findElement(By.xpath("//span[text()='"+field+"']/..//..//a")));
	click(By.xpath("//span[text()='"+field+"']/..//..//a"));
//	By dd = By.xpath("//span[text()='"+field+"']/..//..//a");
//	dd.sendKeys(value);
//	sendKey(dd, value);
	click(By.xpath("//div//ul//li//a[@title='"+value+"']"));
	click(PKform_casefield);
//	dd.sendKeys(Keys.ENTER);
//	Thread.sleep(5000); 
//	Select select;
//	select = new Select(driver.findElement(By.xpath("//div[contains(@class,'isModal active')]//span[text()='"+field+"']//following::a[1]")));
//	select.selectByVisibleText(value);
}

//Attaching/Deattaching article on the case-created by divya
public void selectArticle(String type,int Articlenumber) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions scroll = new Actions(driver);
	By attacharticles= By.xpath(("(//button[@title=\"Attach Article\"]//span)["+Articlenumber+"]"));
	if(type.equals("Attach")) {
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", driver.findElement(attacharticles));
	}
	if(type.equals("Deattach")) {
        scroll.moveToElement(driver.findElement(showmoreactions_article)).perform();
		js.executeScript("arguments[0].click();", driver.findElement(showmoreactions_article));
		Thread.sleep(5000);
		By deattach_articles=By.xpath("(//a[@title=\"Detach Article\"])["+Articlenumber+"]");

		js.executeScript("arguments[0].click();", driver.findElement(deattach_articles));

	}
	
}

//Voicecall 
public By contacttype_label= By.xpath("//label[text()='Contact Type']");
public By contacttypedropdown =By.xpath("//button[contains(@aria-label,\"Contact Type\")]");
public By contacttypedorpdownlist =By.xpath("//button[contains(@aria-label,\"Contact Type\")]/../..//div[2]/lightning-base-combobox-item");
public By contactname_clear =By.xpath("//button[@title=\"Clear Selection\"]");
public By description_textbox =By.xpath("//lightning-textarea//div//textarea");
public By next_button =By.xpath("//button[text()='Next']");
public By firstcase =By.xpath("//table/tbody/tr[1]/th//lightning-primitive-cell-factory");
public By contacttypelabel =By.xpath("//span[text()='Contact Type']");
public By contacttypedata =By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.Case.Relationship__c\"]//div[2]//slot//lightning-formatted-text");
public By contact_voicecalls =By.xpath("//label[text()='Contact']/following::input");
public By searchvoicecalls =By.xpath("//button[@aria-label=\"Search\"]");
public By searchvoicecallsglobal =By.xpath("//input[@placeholder=\"Search Voice Calls and more...\"]");

//GEP Ideas CMUD-11588
public By newbutton =By.xpath("//div[@title=\"New\"]");
public By title_input =By.xpath("//input[@name=\"Name\"]");
public By desription =By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.GEP_Idea__c.Description__c\"]//div/textarea");
public By category =By.xpath("//button[@type=\"button\"]//span[text()='--None--']");
public By save_btn =By.xpath("//button[@name=\"SaveEdit\" or @title=\"Save\"]");
public By type_data = By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.Task.Type\"]//div/..//div[2]/span/span");
public By assignedto_data =By.xpath("//div[@class=\"ownerName\"]//a[@data-refid=\"recordId\"]");
public By comment_data =By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.Task.Description\"]//div[2]//span/span");
public By tasktitle =By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.Task.Subject\"]//div[2]//span/span");
public By potentialtextbox =By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.GEP_Idea__c.Potential_Benefit__c\"]//div/textarea");
public By releasedate =By.xpath("//input[@name=\"Release_Date__c\"]");
public By additionalnotes =By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.GEP_Idea__c.Additional_Notes__c\"]//div/textarea");

// US 11929 Parth Mutreja on 11/21/2023
public void VerifysortOrder(String value) throws Exception {
	String xpath = "//*[starts-with(text(),'"+value+"')]/following::div[@class='select-options']//ul//li//a[not(contains(text(),'--None--'))]";
	List<WebElement> picklistOptions = driver.findElements(By.xpath(xpath));
    List<String> optionTexts = new ArrayList<>();
    for (WebElement option : picklistOptions) {
        optionTexts.add(option.getAttribute("title"));
    }
    System.out.println(optionTexts);
    List<String> sortedOptionTexts = new ArrayList<>(optionTexts);	         
    boolean areFirstCharactersInOrder = true;
	for (int i = 0; i < optionTexts.size() - 1; i++) {
        String currentString = optionTexts.get(i);
        String nextString = optionTexts.get(i + 1);
        if (currentString.charAt(0) > nextString.charAt(0)) {
            areFirstCharactersInOrder = false;
            break;
        }
    }

    if (areFirstCharactersInOrder) {
        System.out.println("The first characters are in alphabetical order.");
        for (String str : optionTexts) {
            System.out.println(str);
            }
        
    } else {
        System.out.println("The first characters are not in alphabetical order.");	            
       assert false;
    }

}
public By myWorkTab = By.xpath("//span[contains(text(),'My work ')]//ancestor::a[1]/..");
public By newtab =By.xpath("//span[contains(text(),'New ')]//ancestor::a[1]/..");
public By minimiseomnichat =By.xpath("(//button[@title=\"Minimize\"])[2]");
public By acceptchat =By.xpath("//div[@class=\"actionBlock\"]//button");


//common method to fetch a case number-created by divya
	public String getcasenumber() {
		String casenumbers =driver.findElement(Case_number).getAttribute("innerText");
		return casenumbers;
	}
//common method to validate colour - created by divya
public void validatecolour(By xpath,String colourname) {
	WebElement t = driver.findElement(xpath);
    String s = t.getCssValue("color");
    String colour = Color.fromString(s).asHex();
    System.out.println(colour);
    Assert.assertTrue(colour.equals(colourname),"Colour is not displayed");

    
}
//common method to select listview -created by divya

public void selectlistview(String field,String dropdownvalue) throws InterruptedException {
	
	click(By.xpath("//button[@title='Select a List View: "+field+"']"));
	click(By.xpath("//span[text()='"+dropdownvalue+"']/../.."));

}


public By attacharticles =By.xpath("//button[@title=\"Attach Article\"]//span");
public By ariclenumber =By.xpath("//span[text()='(2)']");
public By articlename =By.xpath("//article[@aria-label=\"Articles\"]//article");
public By secondarticlename =By.xpath("(//article[@aria-label=\"Articles\"]//article)[2]");
public By casemnumber_articles =By.xpath("//td[@data-col-key-value=\"CaseNumber-lstOutputLookup-1\"]");
public By casecount =By.xpath("(//span[@title='(0)'])[2]");
public By showmoreactions_article =By.xpath("(//article[@aria-label=\"Articles\"]//span[text()='Show Actions']/..)[2]");
public By deattach_article =By.xpath("//a[@title=\"Detach Article\"]");
public By case_number =By.xpath("//a[contains(@title,'| Case')]//span[2]");
public By contactscroll =By.xpath("//div[@class=\"slds-modal__content slds-p-around_medium\"]");
public By spanishtext =By.xpath("//lightning-formatted-text[text()='SPANISH']");
public By contact_search =By.xpath("//input[@name=\"Contact-search-input\"]");
public By insufficient_text=By.xpath("//*[contains(text(),'insufficient access rights on cross-reference id. ')]");
public By closewindow =By.xpath("//button[@title=\"Close this window\"]");
public By thirdarticlename =By.xpath("(//article[@aria-label=\"Articles\"]//article)[3]");
public By voicecall_alerttext =By.xpath("(//flowruntime-screen-field//lightning-formatted-rich-text//strong)[2]");
public By editcontact =By.xpath("//button[@title=\"Edit Contact\"]");
public By contact_delete =By.xpath("(//span[@class=\"deleteIcon\"])[2]");
public By contact_input =By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.VoiceCall.NF_Contact__c\"]//input");

//CMUD
public By recentopencases =By.xpath("//th[@data-label=\"Report Name\"]//a[@title=\"Team's Open Cases\"]/..");
public By headernames =By.xpath("(//div[@class=\"data-grid-table-ctr\"]//tbody)[2]//tr//th//div//div//span[@class=\"wave-table-cell-measure-header-text\"]//span[@class=\"lightning-table-cell-measure-header-value\"]");
public By label =By.xpath("//div[@class=\"slds-page-header__name-title\"]//h1//span[2]");
public By casenumbers =By.xpath("((//div[@class=\"dashboard-widget css-13udsys\"]//tbody)[2]//tr)[2]//td//div//span");
public By casenumbers2 =By.xpath("((//div[@class=\"dashboard-widget css-13udsys\"]//tbody)[2]//tr)[4]//td//div//span");
public By casenumbertexts =By.xpath("((//div[@class=\"dashboard-widget css-13udsys\"]//tbody)[2]//tr)[4]//td//div//span//a");
public By casenumbertexts1 =By.xpath("((//div[@class=\"dashboard-widget css-13udsys\"]//tbody)[2]//tr)[2]//td//div//span//a");


public void validateBrokenlinks(String url) throws Exception {
	int respCode =URLresponsecode(url);
	if(respCode>400) {
		System.out.println("URL is broken with Response Code "+respCode+"");
		Assert.assertFalse(false);
	}
	else
	{
		System.out.println("URL is working with Response Code"+respCode+"");
		Assert.assertTrue(true);
	}
}
public double GeneratedSumvalue(By xpath) throws Exception {
	double sumTotal = 0.0;
	List<WebElement> cost = driver.findElements(xpath);
	for(int i=0;i<cost.size();i++) {
	System.out.println(Double.parseDouble(cost.get(i).getAttribute("innerText")));
	sumTotal= sumTotal + Double.parseDouble(cost.get(i).getAttribute("innerText"));
	}
	double roundOff = Math.round(sumTotal * 100.0) / 100.0;
	System.out.println("Sum Total is "+sumTotal+" it is rounded of to" +roundOff);
	return roundOff;
}
}



