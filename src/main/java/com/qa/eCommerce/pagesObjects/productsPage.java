package com.qa.eCommerce.pagesObjects;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.eCommerce.BasePage.BasePage;
import com.qa.eCommerce.utils.Utils;

public class productsPage  extends BasePage {
	

	public LinkedHashMap<String, String> getProductDetails(){
		LinkedHashMap<String, String> data = new LinkedHashMap<String,String>();
		data.put("Name", "MicroSoftOffice Home & Student");
		data.put("ShortDescription", "MS Office Original");
		data.put("Sku", "10");
		data.put("Category", selectDropDownVal("Computers >> Software","//ul[@id='SelectedCategoryIds_listbox']"));
		
		return data;
	}
	
	public LinkedHashMap<String, String> createNewProduct(){
		
		LinkedHashMap<String,String>	fillData = getProductDetails();
		for(String str: fillData.keySet()){
			if(!data.get(str).isEmpty()){
				try{
				returnWebElementWithIDOrClass(str).click();
				Utils.Sleep(1);
				returnWebElementWithIDOrClass(str).sendKeys(data.get(str));
				}catch(Exception e){
					System.out.println("key is Empty");
				}
			}
	
		}
		return fillData;
		
	
}
}
