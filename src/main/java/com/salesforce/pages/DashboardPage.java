package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DashboardPage extends ProjectSpecificMethods {
	
	
	public void clickprofile() {
		
		click(locateElement(Locators.XPATH,"//img[@title='User']"));
		
	
		
	}


	
	
	

}
