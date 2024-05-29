	package com.automation.pom;

import org.openqa.selenium.By;

public class AplicationConstants {
	
		private AplicationConstants() {
		}
	
	////DB////
		// Tab
		public static final String DB_TAB_DATA_CASES = "DataCases";
		//GENERAL STRING
		public static final String STR_GSSERIES2015 = "GS SERIES-2015";
		public static final String STR_DANIELLASOLIS = "Daniella Solis";
		public static final String STR_QA = "QA";
		public static final String STR_STAGING = "Staging";
	////Salesforce////
		public static final String LOG_OUT_AS_LINK = "//a[contains(text(),'Log out as')]";
		public static final String SALESFORCE_TAB_SET_HEADER= "//div[contains(@class,'tabsetHeader')]";
		public static final String SELECTED_LIST_ITEM = SALESFORCE_TAB_SET_HEADER + "//div[contains(@class,'selectedListItem ')]//a";
		public static final String XPATH_GLOBAL_ACTIONS_ICON = "//li[@class='slds-global-actions__item slds-dropdown-trigger slds-dropdown-trigger--click'][1]";

		//tabs
		public static final String TAB_LIST = SALESFORCE_TAB_SET_HEADER + "//div[contains(@class,'tabBar ')]";
		public static final String LAST_TAB = TAB_LIST + "//ul[contains(@class,'tabBarItems slds-grid')]//li[last()]//a";
		public static final String XPATH_VIEW_ALL_HYPERLINK = "//span[text()='View All']";
		//subtabs
		public static final String XPATH_SUBTAB_ONE="//div[contains(@aria-label, 'Subtabs')]//span[@title='Case']/parent::a";
		public static final String XPATH_SUBTAB_TWO="//div[contains(@aria-label, 'Subtabs')]//span[@title='Contact']/parent::a";
		// Navigation Menu
		public static final String NAV_MENU_HOME = "Home";
		public static final String NAV_MENU_CONTACT = "Contact";
		public static final String NAV_MENU_CASES = "Case";
	//////Flexible Page
		public static final String XPATH_FLEXIBLE_PAGE_TABSET = "//div[@data-component-id='flexipage_tabset']";
		// Nav Bar
		public static final String XPATH_NAV_BAR = "//ul[@class='tabs__nav']";
		public static final String XPATH_NAV_BAR_ITEMS = "//li[@data-aura-class='uiTabItem']";
		// Section expanded
		public static final String XPATH_SECTION_EXPANDED = "//section[@aria-expanded='true']";
		// TabContainer
		public static final String XPATH_TAB_CONTAINER = "//div[@class='tabBarContainer']";
		// xpath contacts menu view
		public static final String XPATH_SEARCH_LIST = "//input[@placeholder='Search this list...']";
		public static final String XPATH_RECORD_LINK = "//a[@data-refID='recordId']";
		//xpath cases menu view
		public static final String XPATH_LIST_VIEW_CONTOL="//button[@title='List View Controls']";
		public static final String XPATH_NEW_LIST_VIEW="//span[text()='New']/parent::a";
		public static final String XPATH_SELECT_FIELDS_TO_DISPLAY_LIST_VIEW="//span[text()='Select Fields to Display']/parent::a";
		public static final String XPATH_NEW_LIST_VIEW_NAME_INPUT="//label[text()='List Name']/following::input[1]";
		public static final String XPATH_SAVE_lIST_VIEWBUTTON ="//span[text()='Save']/parent::button[2]";
		//xpath table case view
		public static final String XPATH_CASE_VIEW_TABLE_CASE_NUMBER="//td[@class='slds-cell-edit cellContainer'][2]//a";
		// My open tasks fields
		public static final String XPATH_MY_OPEN_TASKS_HEADER_TASK_TITLE = XPATH_FLEXIBLE_PAGE_TABSET
				+ XPATH_SECTION_EXPANDED + "//th//span[text()='Task Title']";
		public static final String XPATH_MY_OPEN_TASKS_HEADER_CREATE_DATE = XPATH_FLEXIBLE_PAGE_TABSET
				+ XPATH_SECTION_EXPANDED + "//th//span[text()='Create Date']";
		public static final String XPATH_MY_OPEN_TASKS_HEADER_DUE_DATE = XPATH_FLEXIBLE_PAGE_TABSET + XPATH_SECTION_EXPANDED
				+ "//th//span[text()='Due Date']";
		public static final String XPATH_MY_OPEN_TASKS_HEADER_RELATED_TO = XPATH_FLEXIBLE_PAGE_TABSET
				+ XPATH_SECTION_EXPANDED + "//th//span[text()='Related To']";
		public static final String XPATH_MY_OPEN_TASKS_HEADER_RELATED_GUEST = XPATH_FLEXIBLE_PAGE_TABSET
				+ XPATH_SECTION_EXPANDED + "//th//span[text()='Related Guest']";
		public static final String XPATH_MY_OPEN_TASKS_HEADER_PRIORITY = XPATH_FLEXIBLE_PAGE_TABSET + XPATH_SECTION_EXPANDED
				+ "//th//span[text()='Priority']";
		public static final String XPATH_MY_OPEN_TASKS_HEADER_CALLER_TYPE = XPATH_FLEXIBLE_PAGE_TABSET
				+ XPATH_SECTION_EXPANDED + "//th//span[text()='Caller Type']";
		public static final String XPATH_MY_OPEN_TASKS_HEADER_OVER_DUE_INDICATOR = XPATH_FLEXIBLE_PAGE_TABSET
				+ XPATH_SECTION_EXPANDED + "//th//span[text()='Over Due Indicator']";
	
		// My open cases fields
		public static final String XPATH_MY_OPEN_CASES_HEADER_ALERT = XPATH_FLEXIBLE_PAGE_TABSET + XPATH_SECTION_EXPANDED
				+ "//th//span[text()='Alert']";
		public static final String XPATH_MY_OPEN_CASES_HEADER_CASE_NUMBER = XPATH_FLEXIBLE_PAGE_TABSET
				+ XPATH_SECTION_EXPANDED + "//th//span[text()='Case #']";
		public static final String XPATH_MY_OPEN_CASES_HEADER_LAST_MODIFIED_DATE = XPATH_FLEXIBLE_PAGE_TABSET
				+ XPATH_SECTION_EXPANDED + "//th//span[text()='Last Modified Date']";
		public static final String XPATH_MY_OPEN_CASES_HEADER_CUSTOMER_NAME = XPATH_FLEXIBLE_PAGE_TABSET
				+ XPATH_SECTION_EXPANDED + "//th//span[text()='Customer Name']";
		public static final String XPATH_MY_OPEN_CASES_HEADER_BRAND = XPATH_FLEXIBLE_PAGE_TABSET + XPATH_SECTION_EXPANDED
				+ "//th//span[text()='Brand']";
		public static final String XPATH_MY_OPEN_CASES_HEADER_STATUS = XPATH_FLEXIBLE_PAGE_TABSET + XPATH_SECTION_EXPANDED
				+ "//th//span[text()='Status']";
		public static final String XPATH_MY_OPEN_CASES_HEADER_SUB_TYPE = XPATH_FLEXIBLE_PAGE_TABSET + XPATH_SECTION_EXPANDED
				+ "//th//span[text()='Sub Type']";
		public static final String XPATH_MY_OPEN_CASES_HEADER_FIELD = XPATH_FLEXIBLE_PAGE_TABSET + XPATH_SECTION_EXPANDED
				+ "//th//span[text()='Field']";
		public static final String XPATH_MY_OPEN_CASES_HEADER_DEALER1 = XPATH_FLEXIBLE_PAGE_TABSET + XPATH_SECTION_EXPANDED
				+ "//th//span[text()='Dealer 1']";
		public static final String XPATH_MY_OPEN_CASES_HEADER_JIRA_STATUS = XPATH_FLEXIBLE_PAGE_TABSET
				+ XPATH_SECTION_EXPANDED + "//th//span[text()='Dealer 1']";
		//// JIRA Path
		public static final String XPATH_CREATE_JIRA_TICKET_BUTTON = "//button[text()='Create JIRA Ticket']";
		public static final String XPATH_UPDATE_JIRA_TICKET_BUTTON = "//button[text()='Update']";
		public static final String XPATH_START_JIRA_TICKET_BUTTON = "//strong[text()='Jira Ticket not created.']/following::button[text()='Start']"; //updated by Parth Mutreja on 07/25/2023
		
		//// case status

		public static final String XPATH_CASE_TAB_STATUS_PEDING_CODING = "//a[@data-tab-name='Pending - Coding']/parent::li";
		public static final String XPATH_MARK_AS_CURRENT_STATUS_BUTTON = "//span[text()='Mark as Current Status']/parent::button";
		//// records view
		public static final String XPATH_MORE_ACTIONS_BUTTON = "//span[text()='Show more actions']//parent::button";
		public static final String XPATH_EDIT_ACTION = "//span[text()='Edit']//parent::a";
		public static final String XPATH_FLEXIPAGE_MAIN = "//flexipage-record-home-scrollable-column[contains(@class, 'main-col')]";
		public static final String XPATH_EDIT_BUTTON = "//button[text()='Edit']";
		public static final String XPATH_EDIT_TAB = "//a[contains(@title,'Edit')]";
		
		public static final String XPATH_PRINT_BUTTON ="//a[@name='Print_Case']";
		public static final String XPATH_IFRAME_PDF = "//iframe[@title='accessibility title']";
		public static final String XPATH_DOCUMENT_FORMAT = "//embed[@type='application/pdf']";
		
	//////xpath contact record view
		public static final String XPATH_FORCE_HIGHLIGHTS_PANEL1 = "//flexipage-component2[@data-component-id='force_highlightsPanel1']";
		public static final String XPATH_FLEXIBLE_PAGE_LEFT = "//flexipage-record-home-scrollable-column[contains(@class,'left-col')]";
		public static final String XPATH_FLEXIBLE_PAGE_MAIN = "//flexipage-record-home-scrollable-column[contains(@class,'main-col')]";
		public static final String XPATH_FLEXIBLE_PAGE_RIGHT = "//flexipage-record-home-scrollable-column[contains(@class,'right-col')]";
		// left page
		// CONTACT DETAIL
		public static final String XPATH_LIGHTNING_TABSET_CONTACT_DETAIL = XPATH_FLEXIBLE_PAGE_LEFT
				+ "//flexipage-component2[@data-component-id='flexipage_tabset1']";
	
		public static final String XPATH_CONTACT_DETAIL_SECTION_HIGH = XPATH_LIGHTNING_TABSET_CONTACT_DETAIL
				+ "//records-record-layout-section[1]";
		// FIELDS
		public static final String XPATH_CONTACT_DETAIL_NAME = XPATH_CONTACT_DETAIL_SECTION_HIGH + "//span[text()='Name']";
		public static final String XPATH_CONTACT_DETAIL_CUSTOMER_ID = XPATH_CONTACT_DETAIL_SECTION_HIGH
				+ "//span[text()='Customer ID']";
		public static final String XPATH_CONTACT_DETAIL_PREFERRED_NAME = XPATH_CONTACT_DETAIL_SECTION_HIGH
				+ "//span[text()='Preferred Name']";
		public static final String XPATH_CONTACT_DETAIL_TGO = XPATH_CONTACT_DETAIL_SECTION_HIGH
				+ "//span[text()='Total Goodwill Offered']";
	
		public static final String XPATH_CONTACT_DETAIL_SECTION_COMUNICATION_INFO = XPATH_LIGHTNING_TABSET_CONTACT_DETAIL
				+ "//records-record-layout-section[2]";
		public static final String XPATH_RECORD_LAYOUT_ROW = "//records-record-layout-row";
		
		//
		public static final String XPATH_CUSTOMER_ID_CONTACT = XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[1]" + "//span[text()='Customer ID']";
		public static final String XPATH_TOTAL_GOODWILL_OFFERED_CONTACT = XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[1]"+ "//span[text()='Total Goodwill Offered']";
		public static final String XPATH_NAME_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[2]" + "//span[text()='Name']";
		public static final String XPATH__PREFERRED_NAME_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[2]" + "//span[text()='Preferred Name']";
		public static final String XPATH__LANGUAGE_PREFERENCE_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[3]" + "//span[text()='Language Preference']";
		public static final String XPATH__EMAIL_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[3]" + "//span[text()='Email']";
		public static final String XPATH__PRIMARY_PHONE_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[4]" + "//span[text()='Primary Phone']";
		public static final String XPATH_PRIMARY_PHONE_TYPE__CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[4]" + "//span[text()='Primary Phone Type']";
		public static final String XPATH__ALTERNATE_PHONE_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[5]" + "//span[text()='Alternate Phone']";
		public static final String XPATH__ALTERNATE_PHONE_TYPE_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[5]" + "//span[text()='Alternate Phone Type']";
		public static final String XPATH__ADDRES_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[6]" + "//span[text()='Address']";
		public static final String XPATH__CO_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[6]" + "//span[text()='C/O']";
		public static final String XPATH__CONTACT_ALERT_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[7]" + "//span[text()='Contact Alert']";
		public static final String XPATH__ACCOUNT_NAME_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[7]" + "//span[text()='Account Name']";
		public static final String XPATH__LAST_MODIFIED_BY_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[8]" + "//span[text()='Last Modified By']";
		public static final String XPATH__LAST_INTERACTION_DATE_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[8]" + "//span[text()='Last Interaction Date']";
		public static final String XPATH__PROFILE_TYPE_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[9]" + "//span[text()='Profile Type']";
		public static final String XPATH__ACTIVE_PORTAL_CONTACT =  XPATH_FLEXIBLE_PAGE_LEFT + XPATH_RECORD_LAYOUT_ROW + "[9]" + "//span[text()='Active Portal User']";
		
		
		public static final String XPATH_COMUNICATION_INFO_PRIMARY_PHONE_CONTACT = "//span[text()='Primary Phone']";
		public static final String XPATH_COMUNICATION_INFO_EMAIL_CONTACT = "//span[text()='Email']";
		public static final String XPATH_COMUNICATION_INFO_PP_TYPE_CONTACT = "//span[text()='Primary Phone Type']";
		public static final String XPATH_COMUNICATION_INFO_ALTERNATE_EMAIL_CONTACT = "//span[text()='Alternate Email']";
		public static final String XPATH_COMUNICATION_INFO_ALTERNATE_PHONE_CONTACT = "//span[text()='Alternate Phone']";
		public static final String XPATH_COMUNICATION_INFO_ADDRESS_CONTACT = "//span[text()='Address']";
		public static final String XPATH_COMUNICATION_INFO_AP_TYPE_CONTACT = "//span[text()='Alternate Phone Type']";
		public static final String XPATH_COMUNICATION_INFO_CO_CONTACT = "//span[text()='C/O']";
		public static final String XPATH_COMUNICATION_INFO_GOOGLE_MAPS_LINK_CONTACT = "//a[text()='Google Maps']";
		public static final String XPATH_COMUNICATION__INFO_GOOGLE_SEARCH_LINK_CONTACT = "//a[text()='Google Search']";
		// FIELDS
		public static final String XPATH_COMUNICATION_INFO_PRIMARY_PHONE = "//span[text()='Primary Phone']";
		public static final String XPATH_COMUNICATION_INFO_EMAIL = "//span[text()='Email']";
		public static final String XPATH_COMUNICATION_INFO_PP_TYPE = "//span[text()='Primary Phone Type']";
		public static final String XPATH_COMUNICATION_INFO_ALTERNATE_EMAIL = "//span[text()='Alternate Email']";
		public static final String XPATH_COMUNICATION_INFO_ALTERNATE_PHONE = "//span[text()='Alternate Phone']";
		public static final String XPATH_COMUNICATION_INFO_ADDRESS = "//span[text()='Address']";
		public static final String XPATH_COMUNICATION_INFO_AP_TYPE = "//span[text()='Alternate Phone Type']";
		public static final String XPATH_COMUNICATION_INFO_CO = "//span[text()='C/O']";
		public static final String XPATH_COMUNICATION_INFO_GOOGLE_MAPS_LINK = "//a[text()='Google Maps']";
		public static final String XPATH_COMUNICATION__INFO_GOOGLE_SEARCH_LINK = "//a[text()='Google Search']";
	
		//contact edit
		public static final String XPATH_COUNTRY_CONTACT_EDIT_BUTTON="//label[text()='Country']/following::button[1]";
		public static final String XPATH_CONTACT_DETAIL_SECTION_ADITIONAL_INFOMATION = XPATH_LIGHTNING_TABSET_CONTACT_DETAIL
				+ "//records-record-layout-section[3]";
		// FIELDS
		public static final String XPATH_ADITIONAL_INFORMATION_ACCOUNT_NAME = XPATH_CONTACT_DETAIL_SECTION_ADITIONAL_INFOMATION
				+ "//span[text()='Account Name']";
		public static final String XPATH_ADITIONAL_INFORMATION_LAST_MODIFIED_BY = XPATH_CONTACT_DETAIL_SECTION_ADITIONAL_INFOMATION
				+ "//span[text()='Last Modified By']";
		public static final String XPATH_ADITIONAL_INFORMATION_LANGUAGE_PREFENCE = XPATH_CONTACT_DETAIL_SECTION_ADITIONAL_INFOMATION
				+ "//span[text()='Language Preference']";
		public static final String XPATH_ADITIONAL_INFORMATION_LAST_INTERACTION_DATE = XPATH_CONTACT_DETAIL_SECTION_ADITIONAL_INFOMATION
				+ "//span[text()='Last Interaction Date']";
		public static final String XPATH_ADITIONAL_INFORMATION_CONTACT_TYPE = XPATH_CONTACT_DETAIL_SECTION_ADITIONAL_INFOMATION
				+ "//span[text()='Contact Type']";
		public static final String XPATH_ADITIONAL_INFORMATION_CONTACT_ALERT = XPATH_CONTACT_DETAIL_SECTION_ADITIONAL_INFOMATION
				+ "//span[text()='Contact Alert']";
	
		// audit history
		public static final String XPATH_LIGHTNING_TABSET_AUDIT_HISTORY = XPATH_FLEXIBLE_PAGE_LEFT
				+ "//flexipage-component2[@data-component-id='flexipage_tabset']";
		// fields
	
		// Main page
		public static final String XPATH_LIGHTNING_TABSET_HIGHLIGHTS = XPATH_FLEXIBLE_PAGE_MAIN
				+ "//flexipage-component2[@data-component-id='force_highlightsPanel1']";
		public static final String XPATH_LIGHTNING_TABSET_VEHICLES = XPATH_FLEXIBLE_PAGE_MAIN
				+ "//flexipage-component2[@data-component-id='flexipage_tabset2']";
		public static final String XPATH_lIGHTNING_TABSET_CASES = XPATH_FLEXIBLE_PAGE_MAIN
				+ "//flexipage-component2[@data-component-id='flexipage_tabset3']";
	
		// HIGHLIGHT
		// fields
		public static final String XPATH_HIGHLIGHT_CONTACT_NAME = XPATH_LIGHTNING_TABSET_HIGHLIGHTS
				+ "//div[text()='Contact']";
		public static final String XPATH_HIGHLIGHT_FOLLOW = XPATH_LIGHTNING_TABSET_HIGHLIGHTS
				+ "//button//span[text()='Follow']";
		public static final String XPATH_HIGHLIGHT_CREATE_CASE = XPATH_LIGHTNING_TABSET_HIGHLIGHTS
				+ "//button[text()='Create Case']";
		public static final String XPATH_HIGHLIGHT_C360_CUSTOMER = XPATH_LIGHTNING_TABSET_HIGHLIGHTS
				+ "//button[text()='C360 Customer']";
		public static final String XPATH_HIGHLIGHT_EDIT = XPATH_LIGHTNING_TABSET_HIGHLIGHTS + "//button[text()='Edit']";
		public static final String XPATH_HIGHLIGHT_MENU_BUTTON = XPATH_LIGHTNING_TABSET_HIGHLIGHTS
				+ "//lightning-button-menu[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']//button";
		public static final String XPATH_HIGHLIGHT_SALES_LEAD = XPATH_LIGHTNING_TABSET_HIGHLIGHTS
				+ "//a//span[text()='Sales Lead']";
	
		// Vehicles
		public static final String XPATH_VEHICLES_VEHICLE_ASSOCIATIONS_HEADER = XPATH_LIGHTNING_TABSET_VEHICLES
				+ "//th[@aria-label='Vehicle Association: Vehicle Association Name']//span[text()='Vehicle Association: Vehicle Association Name']";
		public static final String XPATH_VEHICLES_DOFU_HEADER = XPATH_LIGHTNING_TABSET_VEHICLES
				+ "//th[@aria-label='DOFU']//span[text()='DOFU']";
		public static final String XPATH_VEHICLES_MODEL_YEAR_HEADER = XPATH_LIGHTNING_TABSET_VEHICLES
				+ "//th[@aria-label='Model Year']//span[text()='Model Year']";
		public static final String XPATH_VEHICLES_MAKE_HEADER = XPATH_LIGHTNING_TABSET_VEHICLES
				+ "//th[@aria-label='Make']//span[text()='Make']";
		public static final String XPATH_VEHICLES_MODEL_HEADER = XPATH_LIGHTNING_TABSET_VEHICLES
				+ "//th[@aria-label='Model']//span[text()='Model']";
		public static final String XPATH_VEHICLES_PURCHASE_DATE_HEADER = XPATH_LIGHTNING_TABSET_VEHICLES
				+ "//th[@aria-label='Purchase Date']//span[text()='Purchase Date']";
		public static final String XPATH_VEHICLES_SOLD_DATE_HEADER = XPATH_LIGHTNING_TABSET_VEHICLES
				+ "//th[@aria-label='Sold Date']//span[text()='Sold Date']";
	
		// XPATH COMPONENT CASES
		public static final String XPATH_COMPONENT_LI_CASES= XPATH_lIGHTNING_TABSET_CASES + "//a[text()='Cases']";
		public static final String XPATH_COMPONENT_LI_OFFERS= XPATH_lIGHTNING_TABSET_CASES + "//a[text()='Offers']";
		public static final String XPATH_COMPONENT_LI_ATTACHMENTS= XPATH_lIGHTNING_TABSET_CASES + "//a[text()='Attachments']";


		// HEADERS
		public static final String XPATH_COMPONENT_CASES_HEADER_CASE_NUMBER = XPATH_lIGHTNING_TABSET_CASES
				+ "//c-ccm-display-related-case-list//lightning-datatable//th[@aria-label='Case #']//span[text()='Case #']";
		public static final String XPATH_COMPONENT_CASES_HEADER_TYPE = XPATH_lIGHTNING_TABSET_CASES
				+ "//c-ccm-display-related-case-list//lightning-datatable//th[@aria-label='Type']//span[text()='Type']";
		public static final String XPATH_COMPONENT_CASES_HEADER_SUB_TYPE = XPATH_lIGHTNING_TABSET_CASES
				+ "//c-ccm-display-related-case-list//lightning-datatable//th[@aria-label='Sub Type']//span[text()='Sub Type']";
		public static final String XPATH_COMPONENT_CASES_HEADER_STATUS = XPATH_lIGHTNING_TABSET_CASES
				+ "//c-ccm-display-related-case-list//lightning-datatable//th[@aria-label='Status']//span[text()='Status']";
		public static final String XPATH_COMPONENT_CASES_HEADER_INITIAL_CHANNEL = XPATH_lIGHTNING_TABSET_CASES
				+ "//c-ccm-display-related-case-list//lightning-datatable//th[@aria-label='Initial Channel']//span[text()='Initial Channel']";
		public static final String XPATH_COMPONENT_CASES_HEADER_VIN_NUMBER = XPATH_lIGHTNING_TABSET_CASES
				+ "//c-ccm-display-related-case-list//lightning-datatable//th[@aria-label='VIN #']//span[text()='VIN #']";
		public static final String XPATH_COMPONENT_CASES_HEADER_PRIMARY_CODING = XPATH_lIGHTNING_TABSET_CASES
				+ "//c-ccm-display-related-case-list//lightning-datatable//th[@aria-label='Primary Coding']//span[text()='Primary Coding']";
		public static final String XPATH_COMPONENT_CASES_HEADER_OWNER = XPATH_lIGHTNING_TABSET_CASES
				+ "//c-ccm-display-related-case-list//lightning-datatable//th[@aria-label='Owner']//span[text()='Owner']";
		public static final String XPATH_COMPONENT_CASES_HEADER_DATE_TIME = XPATH_lIGHTNING_TABSET_CASES
				+ "//c-ccm-display-related-case-list//lightning-datatable//th[@aria-label='Date/Time Opened']//span[text()='Date/Time Opened']";
		public static final String XPATH_COMPONENT_CASES_HEADER_BRAND = XPATH_lIGHTNING_TABSET_CASES
				+ "//c-ccm-display-related-case-list//lightning-datatable//th[@aria-label='Brand']//span[text()='Brand']";
		public static final String XPATH_COMPONENT_CASES_HEADER_FIELD = XPATH_lIGHTNING_TABSET_CASES
				+ "//c-ccm-display-related-case-list//lightning-datatable//th[@aria-label='Field']//span[text()='Field']";
		// DATA
		public static final String XPATH_COMPONENT_CASES_DATA_CASE_NUMBER = "//c-ccm-display-related-case-list//lightning-datatable//table//tbody/child::tr[1]//a";
		public static final String XPATH_ADD_CODING = "//button[text()='Add Coding']";
		//Add Coding Modal input
		public static final String XPATH_ADD_CODING_QUICK_CODE="//h1[text()=' Quick Code']/following::input[1]";
		public static final String XPATH_ADD_CODING_CODING_TYPE="//label[text()='Coding Type']/following::input[1]";
		public static final String XPATH_ADD_CODING_CATEGORY="//label[text()='Category']/following::input[1]";
		public static final String XPATH_ADD_CODING_PROBLEM_AREA="//label[text()='Problem Area']/following::input[1]";
		public static final String XPATH_ADD_CODING_COMPONENTS="//label[text()='Components']/following::input[1]";
		public static final String XPATH_ADD_CODING_CONDITION="//label[text()='Condition']/following::input[1]";
		public static final String XPATH_ADD_CODING_PRIMARY="//span[text()='Primary']/following::input[1]";
		public static final String XPATH_ADD_CODING_SAVE="//div[@class='quick-actions-panel']//button[text()='Save']";
		
		//fields Add coding lists
		public static final String XPATH_ADD_CODING_MODAL_QUICK_CODE_LI ="//h1[text()=' Quick Code']/following::div[@role='listbox'][1]//li";
		public static final String XPATH_ADD_CODING_MODAL_CODING_TYPE_LI ="//label[text()='Coding Type']/following::div[@role='listbox'][1]//li";
		public static final String XPATH_ADD_CODING_MODAL_CATEGORY_LI ="//label[text()='Category']/following::div[@role='listbox'][1]//li";
		public static final String XPATH_ADD_CODING_MODAL_PROBLEM_AREA_LI ="//label[text()='Problem Area']/following::div[@role='listbox'][1]//li";
		public static final String XPATH_ADD_CODING_MODAL_COMPONENTS_LI ="//label[text()='Components']/following::div[@role='listbox'][1]//li";
		public static final String XPATH_ADD_CODING_MODAL_CONDITION_LI ="//label[text()='Condition']/following::div[@role='listbox'][1]//li";
		//Add coding icons
		public static final String XPATH_ADD_CODING_MODAL_QUICK_CODE_ICON ="//h1[text()=' Quick Code']/following::lightning-icon[contains(@class,'slds-combobox__input-entity-icon')]";
		public static final String XPATH_ADD_CODING_MODAL_CONDITION_ICON ="//label[text()='Condition']/following::lightning-icon[contains(@class,'slds-combobox__input-entity-icon')]";
		public static final String XPATH_ADD_CODING_MODAL_COMPONENTS_ICON ="//label[text()='Components']/following::lightning-icon[contains(@class,'slds-combobox__input-entity-icon')]";
		public static final String XPATH_ADD_CODING_MODAL_PROBLEM_AREA_ICON ="//label[text()='Problem Area']/following::lightning-icon[contains(@class,'slds-combobox__input-entity-icon')]";
		public static final String XPATH_ADD_CODING_MODAL_CATEGORY_ICON ="//label[text()='Category']/following::lightning-icon[contains(@class,'slds-combobox__input-entity-icon')]";
		public static final String XPATH_ADD_CODING_MODAL_CODING_TYPE_ICON ="//label[text()='Coding Type']/following::lightning-icon[contains(@class,'slds-combobox__input-entity-icon')]";

		//CR cases
		public static final String XPATH_CREATE_FROM_A_CASE_BUTTON = "//button[text()='Create From Case']";
		public static final String XPATH_CREATE_BUTTON = "//button[text()='Create']";
		public static final String XPATH_ADD_NEW_CODING_CR_CASE_BUTTON = "//button[text()='Add New Coding']";
		
		// xpath vehicle association
		public static final String XPATH_ICON_LAST_REFRESH = "//i[contains(text(),'Last Refreshed')]";
		public static final String XPATH_SYNC_ICON_BUTTON = "//button[@title='Sync with CC']";
		public static final String XPATH_UPDATE_VEHICLE_BUTTON = "//button[text()='Update Vehicle']";
		public static final String XPATH_TABLE_HEADER_MODEL_YEAR = "//th[@aria-label='Model Year']//span[text()='Model Year']";
		public static final String XPATH_TABLE_HEADER_MAKE = "//th[@aria-label='Make']//span[text()='Make']";
		public static final String XPATH_TABLE_HEADER_MODEL = "//th[@aria-label='Model']//span[text()='Model']";
		public static final String XPATH_DIV_SCROLLABLE = "//div[@class='slds-table_header-fixed_container slds-scrollable_x']";
	
		// XPATH COMPONENT OFFERS
		// HEADERS
		public static final String XPATH_COMPONENT_OFFERS_HEADER_CASE_ID = XPATH_lIGHTNING_TABSET_CASES
				+ "//flexipage-tab2//th[@aria-label='Case ID']//span[text()='Case ID']";
		public static final String XPATH_COMPONENT_OFFERS_HEADER_OFFER_NUMBER = XPATH_lIGHTNING_TABSET_CASES
				+ "//flexipage-tab2//th[@aria-label='Offer Number']//span[text()='Offer Number']";
		public static final String XPATH_COMPONENT_OFFERS_HEADER_PROGRAM_NAME = XPATH_lIGHTNING_TABSET_CASES
				+ "//flexipage-tab2//th[@aria-label='Program Name']//span[text()='Program Name']";
		public static final String XPATH_COMPONENT_OFFERS_HEADER_OFFERED_AMOUNT = XPATH_lIGHTNING_TABSET_CASES
				+ "//flexipage-tab2//th[@aria-label='Offered Amount']//span[text()='Offered Amount']";
		public static final String XPATH_COMPONENT_OFFERS__HEADER_TOTAL_REMAINING = XPATH_lIGHTNING_TABSET_CASES
				+ "//flexipage-tab2//th[@aria-label='Total Remaining']//span[text()='Total Remaining']";
		public static final String XPATH_COMPONENT_OFFERS_HEADER_REQUEST_DATE = XPATH_lIGHTNING_TABSET_CASES
				+ "//flexipage-tab2//th[@aria-label='Request Date']//span[text()='Request Date']";
		public static final String XPATH_COMPONENT_OFFERS_HEADER_VOID = XPATH_lIGHTNING_TABSET_CASES
				+ "//flexipage-tab2//th[@aria-label='Void']//span[text()='Void']";
		public static final String XPATH_COMPONENT_OFFERS_STATUS = XPATH_lIGHTNING_TABSET_CASES
				+ "//flexipage-tab2//th[@aria-label='Status']//span[text()='Status']";
		public static final String XPATH_COMPONENT_OFFERS_CASE_NUMBER = XPATH_lIGHTNING_TABSET_CASES
				+ "//flexipage-tab2//th[@aria-label='Case #']//span[text()='Case #']";
		public static final String XPATH_COMPONENT_OFFERS_REASON = XPATH_lIGHTNING_TABSET_CASES
				+ "//flexipage-tab2//th[@aria-label='Reason']//span[text()='Reason']";
		// XPATH COMPONENT ATTACHMENTS
	
		public static final String XPATH_COMPONENT_ATACHMENTS_HEADER_CASE_NUMBER = XPATH_lIGHTNING_TABSET_CASES
				+ "//flexipage-tab2[3]//th[@aria-label='Case#']//span[text()='Case#']";
		public static final String XPATH_COMPONENT_ATACHMENTS_HEADER_FILE_NAME = XPATH_lIGHTNING_TABSET_CASES + "//flexipage-tab2[3]//th[@aria-label='File Name']//span[text()='File Name']";
		public static final String XPATH_COMPONENT_ATACHMENTS_HEADER_CREATED_DATE = XPATH_lIGHTNING_TABSET_CASES + "//flexipage-tab2[3]//th[@aria-label='Created Date']//span[text()='Created Date']";
		public static final String XPATH_COMPONENT_ATACHMENTS_HEADER_TYPE = XPATH_lIGHTNING_TABSET_CASES + "//flexipage-tab2[3]//th[@aria-label='Type']//span[text()='Type']";
		
		public static final String XPATH_COMPONENT_ATTACHMENTS_TD1_FILE_NAME_FORMATED_TEXT = "//tr[@data-row-key-value='row-0']//td[@data-label='File Name']//lightning-base-formatted-text";
		
		//xpath new task
		public static final String XPATH_NEW_TASK_LINK = XPATH_FLEXIBLE_PAGE_RIGHT + "//a[@title='New Task']";
		//fields
		public static final String XPATH_NEW_TASK_BRAND = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][1]//span[text()='Brand']/following-sibling::span[@title='required']";
		public static final String XPATH_NEW_TASK_RELATED_GUEST = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][1]//span[text()='Related Guest']";
		public static final String XPATH_NEW_TASK_NON_GUEEST_CALLER = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][1]//span[text()='Non Guest Caller']";
		public static final String XPATH_NEW_TASK_RELATED_TO = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][1]//span[text()='Related To']";
		public static final String XPATH_NEW_TASK_COMMENT= XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][1]//span[text()='Comment']";//
		public static final String XPATH_NEW_TASK_ASSIGNED_TO = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][1]//span[text()='Assigned To']/following-sibling::span[@title='required']";
		public static final String XPATH_NEW_TASK_TYPE = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][1]//span[text()='Type']/following-sibling::span[@title='required']";
		public static final String XPATH_NEW_TASK_SUB_TYPE = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][1]//span[text()='Subtype']";
		public static final String XPATH_NEW_TASK_CALLER_TYPE = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][1]//span[text()='Caller Type']/following-sibling::span[@title='required']";
		public static final String XPATH_NEW_TASK_DUE_DATE = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][1]//span[text()='Due Date']";
		
		public static final String XPATH_VIEW_ALL_CASES_CONTACT_BUTTON = "//button[text()='View All']";
		public static final String XPATH_DISPUTE_RESOLUTION_CASE_VIEW_ALL ="//lightning-base-formatted-text[text()='Dispute Resolution']";
		//xpath log an activity
		public static final String XPATH_NEW_LOG_AN_ACTIVITY_LINK = XPATH_FLEXIBLE_PAGE_RIGHT + "//a[@title='Log an Activity']";
		//fields
		public static final String XPATH_lOG_AN_ACTIVITY_BRAND = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][2]//span[text()='Brand']/following-sibling::span[@title='required']";
		public static final String XPATH_lOG_AN_ACTIVITY_RELATED_GUEST = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][2]//span[text()='Related Guest']";
		public static final String XPATH_lOG_AN_ACTIVITY_NON_GUEEST_CALLER = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][2]//span[text()='Non Guest Caller']";
		public static final String XPATH_lOG_AN_ACTIVITY_RELATED_TO = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][2]//span[text()='Related To']";
		public static final String XPATH_lOG_AN_ACTIVITY_COMMENT= XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][2]//span[text()='Comment']/following-sibling::span[@title='required']";//
		public static final String XPATH_lOG_AN_ACTIVITY_ASSIGNED_TO = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][2]//span[text()='Assigned To']/following-sibling::span[@title='required']";
		public static final String XPATH_lOG_AN_ACTIVITY_TYPE = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][2]//span[text()='Type']/following-sibling::span[@title='required']";
		public static final String XPATH_lOG_AN_ACTIVITY_SUB_TYPE = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][2]//span[text()='Subtype']";
		public static final String XPATH_lOG_AN_ACTIVITY_CALLER_TYPE = XPATH_FLEXIBLE_PAGE_RIGHT + "//section[@role='tabpanel'][2]//span[text()='Caller Type']/following-sibling::span[@title='required']";
		// xpath case record view
		public static final String XPATH_CASE_RECORD_HIGHLIGHT_CONTACT_NAME_LINK="//p[@title='Contact Name']/following-sibling::p//records-hoverable-link";
		//xpath case DR record view
		public static final String XPATH_CASE_DR_VIEW_FINANCIAL_PROFILE_TAB="//a[text()='Financial Profile']";
		public static final String XPATH_FIRST_ATTACHMENT_BEFORE_CLONE = "//span[text()='Select Item 1']//ancestor::td[1]";
		public static final String XPATH_CREATE_BUTTON_TO_CLONE_CASE = "//button[text()='Create']";
		//xpath financial profile fields
		
		public static final String XPATH_MANUAL_MILEAGE_DEDUCTION_FORMULA_INPUT="//p[text()='Manual Mileage Deduction Formula']/following::input[1]";
		public static final String XPATH_MILEAGE_DEDUCTION_FORMULA="//p[text()='Mileage Deduction Formula']/following::button[1]";
		public static final String XPATH_ATTRIBUTABLE_MILES="//span[text()='Attributable Miles * (0.5*Full IRS Rate)']/ancestor::lightning-base-combobox-item";
		public static final String XPATH_FULL_IRS_RATE="//p[text()='Full IRS Rate ($)']/following::input[1]";
		public static final String XPATH_SAVE_FLEXIBLE_PAGE_SHOW ="//flexipage-tab2[@class='slds-tabs_default__content slds-show']//button[text()='Save']";
		// xpath Edit case record view
	
		// xpath navigation Menu
		public static final String XPATH_CASE_OPT = "//span[text()='Cases']";
		public static final String XPATH_CONTACTS_OPT = "//span[text()='Contacts']//ancestor::a";
	
		// xpath in case list view
		public static final String XPATH_ID_CASE = "//span[text()='ID']//ancestor::thead//following::tbody//tr[1]//th[@class='slds-cell-edit cellContainer']";
		
		// xpath in case list view
		public static final String XPATH_CONTACT_NAME_OPT = "//span[text()='Name']//following::tbody//th//a[text()='PEDRO SANCHEZ']";
		//xpath contact from Field User
		public static final String XPATH_QqAA_CONTACT_NAME_OPT ="//span[text()='Name']//following::tbody//th//a[text()='Q q AA']";
	
		// xpath related with case detal page and related list
		public static final String XPATH_NEW_COMMENT_BUTTON = "//span[contains(text(),'Case Comments')]//ancestor::div[1]//following::div//button[text()='New Comment']";
		public static final String XPATH_QUICK_TEXT_BUTTON = "//button[@title='Insert Quick Text']";
		public static final String XPATH_TEST_QUICK_TEXT_OPTION = "//button[text()='Test Quick text']";
		public static final String XPATH_CASE_UPDATE_FOR_GUEST_OPTION = "//button[text()='Case Update for Guest']";
		public static final String XPATH_CLOSE_BUTTON = "//button[text()='Close']";
		public static final String XPATH_COMMENT_TEXTAREA = "//label[text()='Enter Comment']//following::textarea";
		public static final String XPATH_CM_QUICK_TEXTS = "//button[@data-flabel='CM Quick Texts']";
		public static final String XPATH_CM_QUICK_TEXTS_LINKS ="//button[text()='Link']";
		public static final String XPATH_CHAT_HOT_KEYS = "//button[@data-flabel='Chat Hot keys']";
		public static final String XPATH_CHAT_HOT_KEYS_CASE_COMMENTS_MERGE_FIELDS= "//button[text()='Case Comments Merge fields']";
		//folders and quickText 
		public static final String XPATH_AUTOMATIONTEST_FOLDER = "//button[@data-fname='Automationtest']";
		public static final String XPATH_CASE_MERGE_FIELDS_TEXT="//button[text()='Case Comments Merge fields']";
		public static final String XPATH_TEST_QUICK_TEXT_OPTION1 = "//button[text()='Required Documents']"; //added by Parth Mutreja on 06/29/2023
		public static final String XPATH_TEST_QUICK_TEXT_SubOPTION1 = "//button[text()='Missing Required Documents']"; //added by Parth Mutreja on 06/29/2023
		public static final String XPATH_TEST_QUICK_TEXT_OPTION2="//button[text()='Mirai']";//added by Divyasai on 02/11/2023
		
		//comments section
		public static final String XPATH_CASE_COMMENT_COMPONENT_COMMENT="//div[text()='Comment'][1]/following::div[1]//lightning-formatted-text";
		// Xpath related with contact record page
		public static final String XPATH_CREATE_CASE_BUTTON = "//button[text()='Create Case']";
		public static final String XPATH_MORE_OPTIONS_BUTTON = "//span[text()='Show more actions']//ancestor::button[1]";
		public static final String XPATH_SALES_LEAD_BUTTON ="//span[text()='Sales Lead']//ancestor::a[1]";
		public static final String XPATH_VIEW_ALL_CASES_BUTTON = "//button[text()='View All']";
		public static final String XPATH_VIEW_ALL_VEHICLES_BUTTON = "//span[text()='Vehicle Associations']//following::span[text()='View All']";
		public static final String XPATH_VEHICLE_ASSOCIATIONS_LINK = "//button[text()='Update Vehicle']//following::span[@title='Vehicle Associations'][1]";
		//Attachments
		public static final String XPATH_DELETE_FILE_BUTTON = "//span[text()='Delete']/parent::a[1]";
		public static final String XPATH_PRIVATE_FILE_BUTTON = "//span[text()='Private']/parent::a[1]";
		//Xpath in vehicles related list 
		public static final String XPATH_MODEL_YEAR_COLUMN = "//th[@title='Model Year']";
		public static final String XPATH_MAKE_COLUMN = "//th[@title='Make']";
		public static final String XPATH_MODEL_COLUMN = "//th[@title='Model']";
		public static final String XPATH_VEHICLE_ASSOCIATIONS_TITLE = "//h1[@title='Vehicle Associations']";
		
		// Xpath in case cration popup from Sales Lead record page 
		public static final String XPATH_COLOR_FIELD = "//span[text()='Color']//following::input[1]";
		public static final String XPATH_OPTIONS_ACC_FIELD = "//span[text()='Options/Acc']//following::input[1]";
		
		//Xpath in case cration popup from contact detail page 
		public static final String XPATH_MODEL_FIELD = "//input[@title='Search Products']";
		public static final String XPATH_MODEL_SERIE_2015_OPT = "//div[@title='LEXUS-GS SERIES-2015-GS Crafted Line']//ancestor::a";
		public static final String XPATH_BRAND_PICKLIST = "//span[text()='Brand #']//following::a[1]";
		public static final String XPATH_TOYOTA_BRAND_OPT = "//a[text()='Toyota']//ancestor::li[1]";
		public static final String XPATH_TYPE_PICKLIST = "//span[text()='Brand #']//following::span[text()='Type']//following::a[1]";
		public static final String XPATH_CM_TYPE_OPT = "//a[text()='Case Management']//ancestor::li[1]";
		public static final String XPATH_SUBTYPE_PICKLIST = "//span[text()='Brand #']//following::span[text()='Sub Type']//following::a[1]";
		public static final String XPATH_TELEMATIC_OPT = "//a[text()='Telematics Registration']//ancestor::li[1]";
		public static final String XPATH_SAVE_CASE_BUTTON = "//button[@name='SaveEdit']"; //added by Parth Mutreja
		public static final String XPATH_CANCEL_CASE_BUTTON = "//span[text()='Save']//ancestor::footer//button[1]";
		public static final String XPATH_CANCEL_BUTTON_EDIT_CONTACT = "//button[text()='Cancel']";
	
		// This Xpath is part of the homa page from Case manager user
		public static final String XPATH_TABLEAU_DASBOARDS_TAB = "//span[text()='Tableau Dashboards']//ancestor::a";
		public static final String XPATH_MY_OPEN_CASES_TAB = "//span[text()='My Open Cases']//ancestor::a";
		public static final String XPATH_MY_OPEN_TASKS_TAB = "//span[text()='My Open Tasks']//ancestor::a";
		public static final String XPATH_ITEMS_TO_APPROVE_TAB = "//a[@title='Items to Approve']";
		public static final String XPATH_CASE_DASHBOARD_TAB = "//span[text()='Case Dashboard']//ancestor::a";
		public static final String XPATH_CASE_REPORT = "//span[text()='Case Report']//ancestor::div[@class='dashboardSpacer tab-widget']";
	
		// these xpath are inside Tableau Dasboards Tab in the home page from case
		public static final String XPATH_NEW_BUTTON= "//div[text()='New']//ancestor::a";
		// managment user
		public static final String XPATH_SCHEDULE_ABHERENCE_DASBOARD_LINK = "//a[text()='Schedule Adherence & Conformance Details']//ancestor::lightning-formatted-url";
		public static final String XPATH_QADETAILVIEW_DASHBOARD_LINK = "//a[text()='QA Detail View']//ancestor::lightning-formatted-url";
		public static final String XPATH_PTO_ALLOTMANT_DASBOARD_LINK = "//a[text()='PTO Allotment']//ancestor::lightning-formatted-url";
		public static final String XPATH_GUEST_AVAILABILITY_DETAILS_DASBOARD_LINK = "//a[text()='Guest Availability Details']//ancestor::lightning-formatted-url";
		public static final String XPATH_PERFORMANCE_DASBOARDS_LINK = "//a[text()='Performance Dashboard']//ancestor::lightning-formatted-url";
		public static final String XPATH_lOGINLOGOUT_DASBOARD_LINK = "//a[text()='Login/Logout']//ancestor::lightning-formatted-url";
	
		public static final String XPATH_CLOSE_SCHEDULE_DASBOARD_BUTTON = "//button[@title='Close Schedule Adherence & Conformance Details']";
		public static final String XPATB_CLOSE_QA_DETAIL_VIEW_DASBOARD_BUTTON = "//button[@title='Close QA Detail View']";
		public static final String XPATH_CLOSE_PTO_ALLOTMENT_DASBOARD_BUTTON = "//button[@title='Close PTO Allotment']";
		public static final String XPATH_CLOSE_GUEST_AVAILABILITY_DETAILS_DASBOARD_BUTTON = "//button[@title='Close Guest Availability Details']";
		public static final String XPATH_CLOSE_PERFORMANCE_DASBOARDS_BUTTON = "//button[@title='Close Performance Dashboard | Tableau Dashboard']";
		public static final String XPATH_CLOSE_lOGINLOGOUT_DASBOARD_BUTTON = "//button[@title='Close Login/Logout | Tableau Dashboard']";
		//DR HQ User
		
		public static final String XPATH_VEHICLE_PENDING_REPAIR_DASHBOARD_LINK = "//a[text()='Vehicle Pending Repair/Disposition Report']//ancestor::lightning-formatted-url";
		public static final String XPATH_CLOSE_VEHICLE_PENDING_DASHBOARD_BUTTON = "//button[@title='Close Vehicle Pending Repair/Disposition Report']";
		public static final String XPATH_CASES_BY_VEHICLE_MODEL_DASHBOARD_LINK = "//a[text()='Cases by Vehicle Model Report']//ancestor::lightning-formatted-url";
		public static final String XPATH_CLOSE_CASES_BY_VEHICLE_DASHBOARD_BUTTON = "//button[@title='Close Cases by Vehicle Model Report']";
		public static final String XPATH_CASE_REPORT_DASHBOARD_LINK = "//a[text()='Case Report']//ancestor::lightning-formatted-url";
		public static final String XPATH_CLOSE_CASE_DASBOARD_BUTTON = "//button[@title='Close Case Report']";
		public static final String XPATH_4_YEAR_BUYBACK_DASHBOARD_LINK = "//a[text()='4 year Buyback Report']//ancestor::lightning-formatted-url";
		public static final String XPATH_CLOSE_4_YEAR_BUYBACK_DASHBOARD_BUTTON = "//button[@title='Close 4 year Buyback Report']";
		public static final String XPATH_BUYBACK_DASHBOARD_LINK = "//a[text()='Buyback Report']//ancestor::lightning-formatted-url";
		public static final String XPATH_CLOSE_BUYBACK_DASHBOARD_BUTTON = "//button[@title='Close Buyback Report']";
		public static final String XPATH_YTD_OVEWRVIEW_DASHBOARD_LINK = "//a[text()='YTD Overview Report']//ancestor::lightning-formatted-url";
		public static final String XPATH_CLOSE_YTD_OVERVIEW_DASHBOARD_BUTTON = "//button[@title='Close YTD Overview Report']";
		// Launch section
		public static final String XPATH_LAUNCH_MENU = "//span[text()='App Launcher']//ancestor::div[1]";
		public static final String XPATH_INPUT_LAUNCH_FIELD = "//label[text()='Search apps and items...']//following::div[1]//input";
		public static final String XPATH_QUICK_TEXT_OPT = "//b[text()='Quick Text']//ancestor::one-app-launcher-menu-item";
		public static final String XPATH_SEARCH_CONTACT_OPT = "//b[text()='Search Contact']";
		
		//Search contact page 
		public static final String XPATH_GUEST_NAME_LABEL = "//label[text()='Guest Name']";
		public static final String XPATH_VIN_FIELD = "//input[@name='VIN']";
		// This Xpath is part of the homa page from Super visor user
		public static final String XPATH_TABLEAU_DASBOARDS_TAB_SUPERVISOR = "//span[text()='Tableau Dashboards']";
	
		// these xpath are inside Tableau Dasboards Tab in the home page from Super
		// visor user
		public static final String XPATH_UTP_CURRENT_DATE_DASHBOARD_LINK = "//a[text()='UTO Current Date']//ancestor::lightning-formatted-url";
		public static final String XPATH_PTO_DAY_SUP_AGENT_VIEW_DASHBOARD_LINK = "//a[text()='PTO/Day/Sup/Agent View']//ancestor::lightning-formatted-url";
		public static final String XPATH_PTO_DASHBOARD_LINK = "//a[text()='PTO Dashboard']//ancestor::lightning-formatted-url";
		// public static final String XPATH_ = "" ;
		public static final String XPATH_OPEN_CASE_DASHBOARD_LINK = "//a[text()='Open Case Dashboard']//ancestor::lightning-formatted-url";
		public static final String XPATH_OPEN_CASE_ACTIVITIES_LINK = "//a[text()='Open Cases/Activities']//ancestor::lightning-formatted-url";
	
		public static final String XPATH_CLOSE_UTP_CURRENT_DATE_DASHBOARD_BUTTON = "//button[@title='Close UTO Current Date | Tableau Dashboard']";
		public static final String XPATH_CLOSE_PTO_DAY_SUP_AGENT_VIEW_DASHBOARD_BUTTON = "//button[@title=\"Close PTO/Day/Sup/Agent View | Tableau Dashboard\"]";
		public static final String XPATH_CLOSE_PTO_DASHBOARD_BUTTON = "//button[@title='Close PTO Dashboard | Tableau Dashboard']";
		// public static final String XPATH_ = "" ;
		public static final String XPATH_CLOSE_OPEN_CASE_DASHBOARD_BUTTON = "//button[@title='Close Open Case Dashboard | Tableau Dashboard']";
		public static final String XPATH_CLOSE_OPEN_CASE_ACTIVITIES_BUTTON = "//button[@title='Close Open Cases/Activities | Tableau Dashboard'] ";
	
	//////xpath tableu 
		public static final String XPATH_IFRAME_TABLEU = "//iframe[@title='data visualization']";
		public static final String XPATH_TABLEU_SING_IN_BUTTON = "//a[contains(text(),'Sign')]";
		public static final String XPATH_FORGE_ROCK_ACCESS_USER = "//*[@id=\"idToken1\"]";
		public static final String XPATH_FORGE_ROCK_ACCESS_PASSWORD = "//*[@id=\"idToken2\"]";
		public static final String XPATH_FORGE_ROCK_ACCESS_LOGIN_BUTTON = "//*[@id=\"loginButton_0\"]";
		
		public static final String XPATH_TABLEU_DASHBOARDS_TAB = "//div[@data-component-id='flexipage_tabset2']//a[@title='Tableau Dashboards']";
		public static final String XPATH_TABLEU_DASHBOARDS_SCHEDULE_ADHERENCE_CONFORMANCE_DETAILS = "//div[@data-component-id='flexipage_tabset2']//a[text()='Schedule Adherence & Conformance Details']/parent::lightning-formatted-url";
		public static final String XPATH_TABLEU_DASHBOARDS_QA_DETAIL_VIEW = "//div[@data-component-id='flexipage_tabset2']//a[text()='QA Detail View']/parent::lightning-formatted-url";
		public static final String XPATH_TABLEU_DASHBOARDS_PTO_ALLOTMENT = "//div[@data-component-id='flexipage_tabset2']//a[text()='PTO Allotment']/parent::lightning-formatted-url";
		public static final String XPATH_TABLEU_DASHBOARDS_GUEST_AVAILABILITY_DETAILS = "//div[@data-component-id='flexipage_tabset2']//a[text()='Guest Availability Details']/parent::lightning-formatted-url";
		public static final String XPATH_TABLEU_DASHBOARDS_PERFORMANCE_DASHBOARD = "//div[@data-component-id='flexipage_tabset2']//a[text()='Performance Dashboard']/parent::lightning-formatted-url";
		public static final String XPATH_TABLEU_DASHBOARDS_LOGIN_LOGOUT = "//div[@data-component-id='flexipage_tabset2']//a[text()='Login/Logout']/parent::lightning-formatted-url";
		//tableu dahboards supervisor
		public static final String XPATH_TABLEU_DASHBOARDS_UTO__CURRENT_DATE = "//div[@data-component-id='flexipage_tabset2']//a[text()='UTO Current Date']/parent::lightning-formatted-url";
		public static final String XPATH_TABLEU_DASHBOARDS_PTO_DAYS_SUP_AGENT_VIEW = "//div[@data-component-id='flexipage_tabset2']//a[text()='PTO/Day/Sup/Agent View']/parent::lightning-formatted-url";
		public static final String XPATH_TABLEU_DASHBOARDS_PTO_DASHBOARDS = "//div[@data-component-id='flexipage_tabset2']//a[text()='PTO Dashboard']/parent::lightning-formatted-url";
		public static final String XPATH_TABLEU_DASHBOARDS_OPEN_CASE_DASHBOARD = "//div[@data-component-id='flexipage_tabset2']//a[text()='Open Case Dashboard']/parent::lightning-formatted-url";
		public static final String XPATH_TABLEU_DASHBOARDS_OPEN_CASES_ACTIVITIES = "//div[@data-component-id='flexipage_tabset2']//a[text()='Open Cases/Activities']/parent::lightning-formatted-url";
		//Xpath edit contact
		public static final String XPATH_CONTACT_EMAIL_INPUT = "//label[text()='Email']/following::input[1]";
		public static final String XPATH_CONTACT_FAX_NUMBER_INPUT = "//label[text()='Fax Number']/following::input[1]";
		public static final String XPATH_CONTACT_PRIMARY_PHONE_INPUT = "//label[text()='Primary Phone']/following::input[1]";
		public static final String XPATH_SAVE_BUTTON = "//button[text()='Save']";
		public static final String XPATH_ALTERNATE_EMAIL_INPUT ="//label[text()='Alternate Email']/following::input[1]";
		
		//xpath validate add Coding order fields
		public static final String XPATH_VALIDATE_ADD_CODING_ORDER_FIELDS = "//c-ccm-dynamic-picklist-component-lwc[@data-id='QuickCode']/following::c-ccm-dynamic-picklist-component-lwc[@data-id='Coding Type']/following::c-ccm-dynamic-picklist-component-lwc[@data-id='Category']/following::c-ccm-dynamic-picklist-component-lwc[@data-id='ProblemArea']/following::c-ccm-dynamic-picklist-component-lwc[@data-id='Components']/following::c-ccm-dynamic-picklist-component-lwc['Condition']/following::lightning-input//span[text()='Primary']";
		//xpath span message
		public static final String XPATH_REFRESH_SUCCESSFULLY_PROMPTED_MESSAGE="//span[text()='Vehicle Association Updated Succesfully']";
		// xpath error message
		public static final String XPATH_ERROR_MESSAGE_INVALID_ADDRESS_EMAIL_PHONE = "//p[text()='Required Field Is Missing or Invalid. Please Provide Valid Address, Email or Phone.']";
		public static final String XPATH_ERROR_MESSAGE_INVALID_ADDRESS_EMAIL_PHONEQA = "//span[text()='Please provide Phone and Primary Phone Type OR Email OR Address including City,State,Zip and Country']";
		public static final String XPATH_ERROR_MESSAGE_INVALID_LAST_NAME= "//span[text()='Please provide First Name and Last Name AND Phone and Primary Phone Type OR Email OR Address including City,State,Zip and Country']";
		public static final String XPATH_ERROR_MESSAGE_PHONE_NUMBER= "//div[text()='Phone Number entered is invalid. Please re-enter Phone Number']";
		public static final String XPATH_ERROR_MESSAGE_EMAIL= "//div[text()='You have entered an invalid format']";
		public static final String XPATH_ERROR_MESSAGE_DELETE_PUBLIC_ATTACHMENTS="//span[text()='Public attachments cannot be deleted.']";
		public static final String XPATH_ERROR_FIVE_DECIMALS_ALERT = "//div[text()='Enter upto five decimal places only']";
		public static final String XPATH_UNABLE_TO_LOAD_MESSSAGE = "//p[contains(text(),'Looks like there')]";
		//XPATH Cases detail page 
		public static final String XPATH_CREATE_FROM_CASES_BUTTON = "//span[text()='Create From Case']//ancestor::a";
		public static final String XPATH_CASE_NUMBER_TEXT = "//p[text()='Case #']//following::lightning-formatted-text[1]";
		public static final String XPATH_CASE_OWNER_TEXT = "//p[text()='Case Owner']//following::p[1]//records-hoverable-link//span";
		public static final String XPATH_CASE_CODING_TAB = "//a[text()='Coding']";
		public static final String XPATH_CASE_DETAILS_TAB = "//a[text()='Details']";
		public static final String XPATH_ALL_OBJECT_SEARCH = "//input[@data-value='All']";
		public static final String XPATH_CONTACT_CASES_TAB = "//li[@data-label='Cases']";
		
		//xpath case ddetail fields
		public static final String XPATH_FUEL_TYPE_RECORD = "//span[text()='Fuel Type']/following::lightning-formatted-text[1]";
		
		//XPATH Poduct Lability (PL) Page details
		public static final String XPATH_SAVE_NEXT_BUTTON = "//button[text()='Save & Next']";
		public static final String XPATH_ADITIONAL_QUESTIONS_INACTIVE_PIPELINE = "//span[text()='Additional Questions']//ancestor::lightning-progress-step[@class='slds-path__item slds-is-incomplete']";
		public static final String XPATH_ADITIONAL_QUESTIONS_ACTIVE_PIPELINE = "//span[text()='Additional Questions']//ancestor::lightning-progress-step[@class='slds-path__item slds-is-current']";
		public static final String XPATH_SUB_TYPE_PICKLIST = "//label[text()='Sub Type']//following::button[1]";
		public static final String XPATH_ACCIDENT_RELATED_OPT = "//lightning-base-combobox-item[@data-value='Accident Related']";
		public static final String XPATH_LEGAL_CLAIMS_CAS_CODE_PICKLIST ="//label[text()='Legal Claims Case Code']//following::button[1]";
		public static final String XPATH_CALLER_STATES_FIELD = "//label[text()='Caller states']//following::textarea[1]";
		public static final String XPATH_OUTCOME_QUESTION_FIELD = "//label[text()='What outcome are you hoping for?']//following::textarea[1]";
		public static final String XPATH_EXACT_LOCATION_FIELD = "//label[text()='Exact location']//following::textarea[1]";
		public static final String XPATH_DAMAGES_QUESTION_FIELD = "//label[text()='What are the damages reported?']//following::textarea[1]";
		public static final String XPATH_INJURIES_QUESTION_FIELD = "//label[text()='What are the injuries reported?']//following::textarea[1]";
		public static final String XPATH_LOCATION_OF_DAMAGE_FIELD = "//label[text()='Location of damage on vehicle']//following::input[1]";
		public static final String XPATH_PART_OF_VEHICLE_QUESTION_FIELD = "//label[text()='What part of the vehicle does the customer claim failed/did not work properly?']//following::textArea[1]";
		public static final String XPATH_INITIAL_QUESTION_BUTTON = "//span[text()='Initial Questions']//ancestor::a";
		public static final String XPATH_INCIDENT_DATA_TIME_FIELD = "//legend[text()='Incident Date and Time']//following::input[1]";
		public static final String XPATH_GUEST_REPORTING_INJURIES_QUESTION_FIELD = "//label[text()='Is the guest reporting any injuries?']//following::span[1]";
		public static final String XPATH_GUEST_REPORTING_DAMAGES_QUESTION_FIELD ="//label[text()='Is the guest reporting any damages?']//following::span[1]";
		public static final String XPATH_ROLLOVER_EVENT_QUESTION_FIELD ="//label[text()='Was there a rollover event?']//following::span[1]";
		public static final String XPATH_GUEST_ALLEGING_ISSUS_AIRBANS_QUESTION_FIELD = "//label[text()='Is guest alleging an issue with airbags?']//following::span[2]";
		public static final String XPATH_FAILED_WORK_PROPERTY_TEXTAREA = "//label[text()='What part of the vehicle does the customer claim failed/did not work properly?']//following::textarea[1]";
		public static final String XPATH_ADITIONAL_DETAIL_TEXTAREA = "//label[text()='Additional details provided by guest']//following::textarea[1]";
		public static final String XPATH_ALLIGATION_TEXTAREA ="//label[text()='Please detail allegation and airbag location/s.']//following::textarea[1]";
		//New coding fields CR
		public static final String XPATH_ADD_NEW_CODING_QUICK_CODE = "//span[text()='Quick Code']/following::input[1]";
		public static final String XPATH_ADD_NEW_CODING_CODING_TYPE = "//label[text()='Coding Type']/following::input[1]";
		public static final String XPATH_ADD_NEW_CODING_CATEGORY = "//label[text()='Category']/following::input[1]";
		public static final String XPATH_ADD_NEW_CODING_PROBLEM_AREA = "//label[text()='Problem Area']/following::input[1]";
		public static final String XPATH_ADD_NEW_CODING_COMPONENTS = "//label[text()='Components']/following::input[1]";
		public static final String XPATH_ADD_NEW_CODING_CONDITION = "//label[text()='Condition']/following::input[1]";
		
		public static final String XPATH_NEW_CODING_MODAL_QUICK_CODE_LI ="//span[text()='Quick Code']/following::div[@role='listbox'][1]//li";
		public static final String XPATH_NEW_CODING_SAVE_BUTTON="//div[@class='slds-modal__container']//button[text()='Save']";
		
		//////////////////////////////////////////////////////// Search user Tab
		public static final String XPATH_SEARCH_CONTACT_GUEST_NAME_FIELD = "//input[@placeholder='Guest Name']";
		public static final String XPATH_SEARCH_CONTACT_BUSSINESS_NAME_FIELD = "//input[@placeholder='Business Name']";
		public static final String XPATH_SEARCH_CONTACT_PHONE_FIELD ="//input[@name='Phone']";
		public static final String XPATH_SEARCH_CONTACT_EMAIL_FIELD ="//input[@name='Email']";
		public static final String XPATH_SEARCH_CONTACT_VIN_FIELD ="//input[@name='VIN']";
		public static final String XPATH_SEARCH_CONTACT_CUSTOMER_ID_FIELD ="//input[@name='customerId']";
		public static final String XPATH_SEARCH_CONTACT_CASE_NUMBER_FIELD = "//input[@name='caseNumber']";
		public static final String XPATH_SEARCH_CONTACT_SEARCH_BUTTON = "//button[text()='Search']";
		public static final String XPATH_SEARCH_CONTACT_CREATE_CONTACT_BUTTON = "//button[text()='Create Contact']";
		//CREATE CONTACT
		public static final String XPATH_CREATE_CONTACT_HEADING = "//div[text()='Create Contact']";
		public static final String XPATH_CREATE_CONTACT_PROFILE_TYPE_FIELD = "//label[text()='Profile Type']/parent::div//button";
		public static final String XPATH_CREATE_CONTACT_FIRST_NAME_FIELD = "//label[text()='First Name']/parent::div//input";
		public static final String XPATH_CREATE_CONTACT_MIDDLE_INITIAL_FIELD = "//label[text()='Middle Initial']/parent::div//input";
		public static final String XPATH_CREATE_CONTACT_lAST_NAME_FIELD = "//div[text()='Last Name']/parent::label/parent::div//input";
		public static final String XPATH_CREATE_CONTACT_SUFFIX_FIELD = "//label[text()='Suffix']/parent::div//button";
		public static final String XPATH_CREATE_CONTACT_PREFERRED_NAME_FIELD = "//label[text()='Preferred Name']/parent::div//input";
		public static final String XPATH_CREATE_CONTACT_EMAIL_FIELD = "//label[text()='Email']/parent::div//input";
		public static final String XPATH_CREATE_CONTACT_PRIMARY_PHONE_FIELD = "//label[text()='Primary Phone']/parent::div//input";
		public static final String XPATH_CREATE_CONTACT_PRIMARY_PHONE_TYPE_FIELD = "//label[text()='Primary Phone Type']/parent::div//button";
		public static final String XPATH_CREATE_CONTACT_ALTERNATE_PHONE_FIELD = "//label[text()='Alternate Phone']/parent::div//input";
		public static final String XPATH_CREATE_CONTACT_ALTERNATE_PHONE_TYPE_FIELD = "//label[text()='Alternate Phone Type']/parent::div//button";
		public static final String XPATH_CREATE_CONTACT_COUNTRY_FIELD = "//label[text()='Country']/parent::div//button\n";
		public static final String XPATH_CREATE_CONTACT_STREET_FIELD = "//label[text()='Street']/parent::div//textarea";
		public static final String XPATH_CREATE_CONTACT_CITY_FIELD = "//label[text()='City']/parent::div//input";
		public static final String XPATH_CREATE_CONTACT_STATE_FIELD = "//label[text()='State']/parent::div//button";
		public static final String XPATH_CREATE_CONTACT_LANGUAGE_PREFERENCE_FIELD = "//label[text()='Language Preference']/parent::div//button";
		public static final String XPATH_CREATE_CONTACT_ZIP_FIELD = "//label[text()='Zip']/parent::div//input";
		//////////////////////////////////////////////////////// Edit Contact
		public static final String XPATH_EDIT_CONTACT_FIRST_NAME_FIELD = "//input[@name='FirstName']";
		public static final String XPATH_EDIT_CONTACT_MIDDLE_NAME_FIELD = "//input[@name='MiddleName']";//LastName
		public static final String XPATH_EDIT_CONTACT_lAST_NAME_FIELD = "//input[@name='LastName']";
		public static final String XPATH_EDIT_CONTACT_SUFFIX_FIELD = "//button[@name='Suffix']";
		public static final String XPATH_EDIT_CONTACT_PREFERRED_NAME_FIELD = "//input[@name='Preffered_Name__c']";
		public static final String XPATH_EDIT_CONTACT_EMAIL_FIELD = "//input[@name='Email']";
		public static final String XPATH_EDIT_CONTACT_PRIMARY_PHONE_FIELD = "//input[@name='HomePhone']";
		public static final String XPATH_EDIT_CONTACT_PRIMARY_PHONE_TYPE_FIELD = "//button[@name='Primary_Phone_Type__c']";
		public static final String XPATH_EDIT_CONTACT_ALTERNATE_PHONE_FIELD = "//input[@name='OtherPhone']";
		public static final String XPATH_EDIT_CONTACT_ALTERNATE_PHONE_TYPE_FIELD = "//button[@name='Alternate_Phone_Type__c']";
		public static final String XPATH_EDIT_CONTACT_COUNTRY_FIELD = "//button[@name='MailingCountryCode']";
		public static final String XPATH_EDIT_CONTACT_STREET_FIELD = "//textarea[@name='MailingStreet']";
		public static final String XPATH_EDIT_CONTACT_CITY_FIELD = "//input[@name='MailingCity']";
		public static final String XPATH_EDIT_CONTACT_STATE_FIELD = "//button[@name='MailingStateCode']";
		public static final String XPATH_EDIT_CONTACT_ZIP_FIELD = "//input[@name='MailingPostalCode']";
		public static final String XPATH_EDIT_CONTACT_CO_FIELD = "//input[@name='C_O__c']";
		public static final String XPATH_EDIT_CONTACT_CONTACT_ALERT_FIELD = "//input[@name='Contact_Alert__c']";
		public static final String XPATH_EDIT_CONTACT_LANGUAGE_PREFERENCE_FIELD = "//button[@name='Language_Preference__c']";
		public static final String XPATH_EDIT_CONTACT_CANCEL_BUTTON ="//button[@title='Cancel']";
		public static final String XPATH_EDIT_CONTACT_SAVE_BUTTON ="//button[@title='Save']";
		//////////////////////////////////////////////////////// Authenticated user community
		public static final String TOPPIC_DETAILS_SPAN ="//span[text()='Topic Details']";
		public static final String TOPIC_DETAILS_PARAGRAPH = "//p[text()='Please enter details regarding your inquiry in the form below']";
		public static final String HELP_QUICKLY_MESSAGE = "//span[text()='To help quickly address my issue, I direct Toyota to forward my email and contact information to my dealer if needed.']";
		public static final String BASED_ON_MESSAGE = "//div//p[text()='Based on your message, it may be necessary to share your experience with the dealership.']";
		public static final String PROVIDING_AUTHORIZATION_MESSAGE="//div//p[text()='Providing authorization allows us to ensure a timely resolution. Please update your response to the question, if appropiate.']";
		public static final String DEALERSHIP_CONTACT_INPUT = "//label[text()='Dealership Contact']/parent::div//input";
		public static final String MILEAGE_INPUT = "//label[text()='Mileage']/parent::div//input";
		public static final String DIV_NEW_AND_FUTURE_MODELS = "//p[text()='New and Future Models']/parent::div";
		
		public static final String XPATH_MY_REQUESTS_OPTION = "//*[text()='My Requests']//ancestor::a"; //updated by Parth Mutreja on 07/27/2023
		public static final String XPATH_PENDING_BUTTON = "//button[text()='Pending']";
		public static final String XPATH_CLOSED_BUTTON = "//button[text()='Closed']";
		public static final String XPATH_IN_PROGRESS_BUTTON ="//button[text()='In Progress']";
		public static final String XPATH_MENU_BUTTON = "//a[@data-id='menu']";
		
		public static final String XPATH_MENU_ICON_LEXUS ="//li[@class='user-data']//span";
		public static final String XPATH_SING_BUTTON_LEXUS ="//div[@class='box login-box']//button[text()='Sign In']";
		public static final String XPATH_USER_NAME_FIELD_LEXUS = "//input[@id='logonUsername']";
		public static final String XPATH_NEXT_STEP_BUTTON_LEXUS = "//button[text()='Next Step']";
		public static final String XPATH_PASSWORD_FIELD_LEXUS = "//input[@id='logonPassword']";
		public static final String XPATH_SING_IN_BUTTON_LEXUS = "//button[@data-testid='logonButton']";
		public static final String XPATH_MENU_OPTIONS_LEXUS = "//ul[@class='menu-items']";
		public static final String XPATH_NEW_REQUEST_OPT_LEXUS = "//a[text()='New Support Request']";
		public static final String XPATH_VEHICLE_FIELD ="//p[text()='Select Vehicle']";
		public static final String XPATH_CONTINUE_BUTTON ="//button[text()='Continue']";
		public static final String XPATH_MY_REQUEST_OPT = "//a[text()='My Requests']";
		public static final String XPATH_MY_SUPPORT_DASHBOARD_MENU = "//*[text()='My Support Dashboard']";
		public static final String XPATH_PENDING_OPT = "//button[@data-status='pending']";
		public static final String XPATH_IN_PROGRESS_OPT = "//button[@data-status='pending']";
		public static final String XPATH_FAQS_OPT = "//a[text()='FAQs']";
		public static final String XPATH_USER_MENU ="//li[@class='user-data']";
		public static final String XPATH_MANAGE_PERSONAL_INF_OPT = "//li[@class='user-data']//ul//a[text()='Manage Personal Info']";
		public static final String XPATH_MANAGE_GARAGE_OPT = "//li[@class='user-data']//ul//a[text()='Manage Garage']";
		public static final String XPATH_SIGN_OUT_OPT = "//li[@class='user-data']//ul//a[text()='Sign out']";
		
		
	
}
