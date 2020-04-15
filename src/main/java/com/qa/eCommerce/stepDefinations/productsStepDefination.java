package com.qa.eCommerce.stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.eCommerce.BasePage.BasePage;
import com.qa.eCommerce.utils.Utils;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.runtime.table.TableConverter;

public class productsStepDefination extends BasePage {

	
	@Then("^Click On \"([^\"]*)\" Button from the ProductsPage$")
	public void clickBtn(String btnName) throws Throwable {
		

		String xpath = "//a[contains(@href,'<REPLACE>')]";
		if(btnName.isEmpty()){
			btnName = " ";
			System.out.println("UI Button is Not Displayed");
		}		
		   try{
			   xpath = xpath.replace("<REPLACE>", btnName);
			   WebElement createBtn = driver.findElement(By.xpath(xpath));
                   if(createBtn.isDisplayed()){
                	   Utils.Sleep(1);
                	   actionsClick(createBtn);
                   }
		   }catch(Exception e){
			   System.out.println("Unable to click on button");
		   }
	}
	
	@Then("^Search Value With And Verify Whether it is Displayed in the Grid Or Not$")
	public void searchValue( DataTable data) throws Throwable {
	         List<List<String>> list = data.raw();
	 		driver.findElement(By.id("SearchProductName")).sendKeys(list.get(0).get(0));

	}
	
	@And("^Enter Values in Product Page$")
	public void enter_Values_in_Product_Page(DataTable data) {
	    
		List<List<String>> list = data.raw();
		driver.findElement(By.id("SearchProductName")).sendKeys(list.get(0).get(0));
		TableConverter table = data.getTableConverter();
		System.out.println(table.toTable(list, "productSearch"));
	}
}
