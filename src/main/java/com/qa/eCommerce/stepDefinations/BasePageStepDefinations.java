package com.qa.eCommerce.stepDefinations;



import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.eCommerce.BasePage.BasePage;
import com.qa.eCommerce.utils.Utils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BasePageStepDefinations  extends BasePage {

	
	@Given("^Login to NopEcommerce With Valid Login Details$")
	public void login_to_eCommerce() {
	    
		boolean flag = false;
			initialization();
			if(returnWebElementWithIDOrClass("Email").isDisplayed()){
			flag = true;
			Utils.Sleep(2);
			returnWebElementWithIDOrClass("Email").sendKeys(prop.getProperty("username"));
			returnWebElementWithIDOrClass("Password").sendKeys(prop.getProperty("password"));
			Utils.Sleep(2);
			returnWebElementXpath("//*[@value='Log in']").click();
			
			}
			else if(flag == false){
				System.out.println("Unable to login");
			}
	}
	
	@Then("^Verify Header \"([^\"]*)\" is Displayed Or Not$")
	public void verify_Header_is_Displayed_Or_Not(String header) throws Throwable {
	   
		boolean flag = false;
		String xpath = "//div[contains(@class,'content-header')]//h1[contains(text(),'"+header+"')]";
		WebElement ele = returnWebElementXpath(xpath);
		if(Utils.dynamicWait(ele, 5, driver) && ele.isDisplayed()){
			flag = true;
			if(header.equals(getWebElementText(ele))){
				System.out.println("Verified Header is Displayed");
			}
			else 
				System.out.println("Verified Header is Not Displayed");
			     Assert.assertFalse(flag);
		}
	}
	
	@Then("^Navigate to \"([^\"]*)\" from Homepage$")
	public void menuNavigation(String navigation) {
	   
		boolean flag = false;
		String tmpXpath = "//div[@class='main-sidebar']//ul//li ";
		String firstMenu_xpath = " ";
		String nav[] = navigation.split("~");
		for(String menu : nav){
			if(navigation.contains("~") && nav.length==2){
			String val = tmpXpath+"//span[text()='"+menu+"']";
			 WebElement menuCategory = returnWebElementXpath(val);
			 try{
				    if(menuCategory.isDisplayed()){
				    	 flag = true;
				    	 actionsClick(menuCategory);
				    	 Utils.Sleep(2);
				 	}
				    firstMenu_xpath = val +"//parent::a//following-sibling::ul//li//span[text()='"+nav[1]+"']";
			    	 WebElement treemenuCategory = returnWebElementXpath(firstMenu_xpath);
			    	 try{
			    	    if(treemenuCategory.isDisplayed())
			    	    	     flag = true;
			    	            actionsClick(treemenuCategory);
				    	        Utils.Sleep(2);
				    	       break;
					}catch(Exception e){
						flag =false;
						System.out.println("Unable to click on treeMenu");
					}
			 }catch(Exception e){
				 flag = false;
				 System.out.println("Unable to navigate");
			 }
	}
			else if(nav.length==1) {
				
			}
			
			else {
				System.out.println("Unable to Navigate to " +navigation);
			}
			
		}
	}
	@Then("^Verify Current Title of the Page is \"([^\"]*)\"")
	public void verifyTitleofAnyPage(String title) {
	    
		boolean flag = false;
		String actual_title = driver.getTitle().trim();
		if(!actual_title.isEmpty()){
			compareString("Verify Title", title+"of Current Page", title, actual_title);
			flag = true;
		}
		else if(flag == false)
			compareString("Verify Title", title+"of Current Page", title, actual_title);
	}
	
	
	@Then("^Close Browser$")
	public void tearDown() {
	    		driver.quit();
	}

}
