package com.qa.eCommerce.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.eCommerce.BasePage.BasePage;

public class Utils extends BasePage{

	
	public  static void Sleep(double timeUnit){
		
		long  unit = (long) (10 * timeUnit);
		try {
			Thread.sleep(unit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
}
	
	public static boolean dynamicWait(WebElement ele,int timeUnit,WebDriver driver){
		
		boolean isDisplayed = false;
		for(int i=1;i<=timeUnit;i++){
			try{
				     ele.isDisplayed();
			}catch(Exception e){}			
			if(isDisplayed)
				break;			
			else {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {}
			}
		}
		return isDisplayed;
	}
		
	}
	

