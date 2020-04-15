package com.qa.eCommerce.BasePage;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public static WebDriver driver = null;
	public static Properties prop;
	public static Map<String,String> data = new HashMap<String,String>();
	
	
	public BasePage() {
		String filePath  = System.getProperty("user.dir");
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(new File(filePath+"//Resources//application.properties"));
			prop.load(fis);
		}catch(Exception e) {
			e.getMessage();
		}
	}

   
	public static void initialization() {
		
		String browserName = prop.getProperty("driver.name");
		if(browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+prop.getProperty("chrome_path"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));
		}
	}
	
	public  static WebElement returnWebElementWithIDOrClass(String val) {
		
		String xpath = "//*[@id='"+val+"' or @class='"+val+"' or @name='"+val+"']";
		WebElement ele = driver.findElement(By.xpath(xpath));
		return ele;
	}
	
	public static WebElement returnXpath(String val) {
	 
		 String Xpath = "//*[text()='<REPLACE>']";
		 Xpath = Xpath.replace("<REPLACE>", val);
		 WebElement ele = driver.findElement(By.xpath(Xpath));
		 return ele;
		 
	}
	
	public WebElement returnWebElementXpath(String xpath){
		
		WebElement ele = driver.findElement(By.xpath(xpath));
		return ele;
	}
	
public static String getWebElementText(WebElement ele) {
		
		String read = "";
		boolean stale = true;
		if(stale==ele.isDisplayed()) {		
			try {read = ele.getText();}catch(Exception e) { read = "";stale = false;}
			if(read.isEmpty()||read==null) {
				try {read = ele.getAttribute("innerText");}catch(Exception e) {read = ""; stale = false;}
			}
				if(read.isEmpty() || read ==null) {
					try { read = ele.getAttribute("textContent");} catch(Exception e) {read = ""; stale = false;}
				}
				if(read.isEmpty() || read ==null) {
					try { read = ele.getAttribute("text");} catch(Exception e) {read = ""; stale = false;}
				}
				if(read.isEmpty() || read ==null) {
					try { read = ele.getAttribute("value");} catch(Exception e) {read = ""; stale = false;}
				}
			}
		else {
}
		return read;
}
	
public static List<String> returnStringList(List<WebElement> list) {
		
		List<String> strList = new ArrayList<String>();
		if(!list.isEmpty()) {
			for(WebElement l : list) {
				strList.add(getWebElementText(l));
			}
		}
		
		return strList;
	}

public static void compareString(String desc,String field,String expected,String actual){
		
	desc = desc + "<b>" +" Field :"+"</b>"+"<b>"+"Expected:"+"</b>"+"<b>"+ "Actual:"+" </b>";
	if(expected.equals(actual)){
		System.out.println(desc);
	}
}

public static void actionsClick(WebElement ele){
	
	Actions action = new Actions(driver);
	try{
	action.moveToElement(ele).click().build().perform();
	}catch(Exception e){
		System.out.println("Unable to Click");
	}
}

public static String selectDropDownVal(String option,String ele){
	
	WebElement drpdwnList = driver.findElement(By.xpath(ele+"//li[text()='"+option+"')]"));	
	Select select = new Select(drpdwnList);
	try{
	 actionsClick(drpdwnList);
	 select.selectByValue(option);
	}catch(Exception e){
		System.out.println("Unable to select "+option+" from the dropdown");
	}
	return option;
}
}
