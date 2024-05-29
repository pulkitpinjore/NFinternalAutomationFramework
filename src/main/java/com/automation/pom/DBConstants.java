package com.automation.pom;

import java.util.HashMap;
import java.util.Map;

public class DBConstants {

	private DBConstants() {}
	//Excel tabs name
	public static final String DB_TAB_USERS = "Users";
	public static final String DB_TAB_CASES = "Cases";
	public static final String DB_TAB_CASES_RECORDS = "CasesRecords";
	public static final String DB_TAB_CASE_INFORMATION_QA = "CaseInformationQA";
	public static final String DB_TAB_CASE_INFORMATION_STAGING = "CaseInformationStaging";
	public static final String DB_TAB_CONTACTS = "Contacts";
	public static final String DB_TAB_RECORDS = "Records";
	public static final String DB_TAB_VALUES = "Values";
	public static final String DB_TAB_SALESFORCE_QA_USERS = "SalesforceQAUsers";
	public static final String DB_TAB_SALESFORCE_STAGING_USERS = "SalesforceStagingUsers";
	public static final String DB_TAB_DATA_CASES = "DataCases";
	
	public static final  Map<String, Integer> USERS_FIELDS = new HashMap<String, Integer>() {{
	    put("Name", 0);
	    put("UserName", 1);
	    put("Password", 2);
	    put("Address", 3);
	    put("Email", 4);
	}};
	public static final Map<String, Integer> USERS_ROW = new HashMap<String, Integer>() {{
	    put("QA", 1);
	    put("Email User", 3);
	    put("Email TO",4);
	    put("Staging", 5);
	    put("QA2", 7);
	}};
	public static final  Map<String, Integer> SALESFORCE_QA_USERS_FIELDS = new HashMap<String, Integer>() {{
	    put("TestUserName", 0);
	    put("URL", 1);
	    put("Name", 2);
	    put("Username", 3);
	    put("Password", 4);
	    put("Profiles", 5);
	}};
	public static final Map<String, Integer> SALESFORCE_QA_USERS_ROW = new HashMap<String, Integer>() {{
		put("TestUser1", 1);
	    put("TestUser2", 2);
	    put("TestUser3", 3);
	    put("TestUser4", 4);
	    put("TestUser5", 5);
	    put("TestUser6", 6);
	    put("TestUser7", 7);
	    put("TestUser8", 8);
	    put("TestUser9", 9);
	    put("TestUser10", 10);
	    put("TestUser11", 11);
	    put("TestUser12", 12);
	    put("TestUser13", 13);
	    put("TestUser14", 14);
	    put("TestUser15", 15);
	    put("TestUser16", 16);
	    put("TestUser17", 17);
	    put("TestUser18", 18);
	    put("TestUser19", 19);
	    put("TestUser20", 20);
	    put("TestUser21", 21);
	    put("TestUser22", 22);
	    put("TestUser23", 23);
	    put("TestUser24", 24);
	    put("TestUser25", 25);
	    put("TestUser26", 26);
	    put("TestUser27", 27);
	    put("TestUser28", 28);
	    put("TestUser29", 29);
	}};
	public static final Map<String, Integer> SALESFORCE_STAGING_USERS_FIELDS = new HashMap<String, Integer>() {{
		put("TestUserName", 0);
	    put("URL", 1);
	    put("Name", 2);
	    put("Username", 3);
	    put("Password", 4);
	    put("Profiles", 5);
	}};
	public static final Map<String, Integer> SALESFORCE_STAGING_USERS_ROW = new HashMap<String, Integer>() {{
		put("TestUser1", 1);
	    put("TestUser2", 2);
	    put("TestUser3", 3);
	    put("TestUser4", 4);
	    put("TestUser5", 5);
	    put("TestUser6", 6);
	    put("TestUser7", 7);
	    put("TestUser8", 8);
	    put("TestUser9", 9);
	    put("TestUser10", 10);
	    put("TestUser11", 11);
	    put("TestUser12", 12);
	    put("TestUser13", 13);
	    put("TestUser14", 14);
	    put("TestUser15", 15);
	    put("TestUser16", 16);
	    put("TestUser17", 17);
	    put("TestUser18", 18);
	    put("TestUser19", 19);
	    put("TestUser20", 20);
	    put("TestUser21", 21);
	    put("TestUser22", 22);
	    put("TestUser23", 23);
	    put("TestUser24", 24);
	    put("TestUser25", 25);
	    put("TestUser26", 26);
	    put("TestUser27", 27);
	    put("TestUser28", 28);
	    put("TestUser29", 29);
	}};
	public static final Map<String, Integer> DATA_CASES_FIELDS = new HashMap<String, Integer>() {{
	    put("First Name", 0);
	    put("Last Name", 1);
	    put("Email", 2);
	    put("Phone", 3);
	    put("Address", 4);
	    put("Zip Code", 5);
	    put("City", 6);
	}};
	public static final Map<String, Integer> DATA_CASES_ROWS = new HashMap<String, Integer>() {{
	    put("Pedro Sanchez", 2);
	    put("Alexander Belltest", 3);
	    put("Carlos	Ramirez", 4);
	    put("Sofia Sanchez", 5);
	    put("Roberto Soto", 6);
	    put("Salazar Smit", 7);
	    put("Diego Armando", 8);

	}};
	
}
