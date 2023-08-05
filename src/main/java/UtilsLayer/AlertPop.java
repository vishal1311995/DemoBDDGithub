package UtilsLayer;

import BaseLayer.BaseClass;

public class AlertPop extends BaseClass{

	public void acceptAlert() {
		getDriver().switchTo().alert().accept();
	}
	
	public void rejectAlert() {
		getDriver().switchTo().alert().dismiss();
	}
	
	public void getTextAlert() {
		getDriver().switchTo().alert().getText();
	}
	
	public void sendKeysAlert(String keys) {
		getDriver().switchTo().alert().sendKeys(keys);
	}
	
}
