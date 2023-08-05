package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{
	
	public static void sendkeys(WebElement wb , String Texy) 
	{
		if(wb.isDisplayed()&&wb.isEnabled()) 
		{
			wb.sendKeys(Texy);
		}
		
	}

}
