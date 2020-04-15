package com.qa.eCommerce.MyRunner;

import java.util.LinkedHashMap;

import com.qa.eCommerce.BasePage.BasePage;
import com.qa.eCommerce.pagesObjects.productsPage;

public class checkTest {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> data = createNewProduct();
		System.out.println(data);

	}
	
	public static LinkedHashMap<String, String> getProductDetails(){
		LinkedHashMap<String, String> data = new LinkedHashMap<String,String>();
		data.put("Name", "MicroSoftOffice Home & Student");
		data.put("ShortDescription", "MS Office Original");
		data.put("Sku", "10");
	//	data.put("Category", BasePage.selectDropDownVal("Computers >> Software","//ul[@id='SelectedCategoryIds_listbox']"));
		
		return data;
	}
	
	public static LinkedHashMap<String, String> createNewProduct(){
		
		LinkedHashMap<String,String>	fillData = getProductDetails();
		return fillData;
		
	}

}
