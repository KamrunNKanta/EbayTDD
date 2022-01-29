package ebay.qa.common;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ebay.qa.base.BaseClass;
import ebay.qa.reporting.Java_Logger;

public class CommonMethods {
	public void click(WebElement element) {

		try {
			BaseClass.waits.waitUntilClickable(element);
			element.click();
			Java_Logger.getLog( element + "Click");
			

		} catch (NullPointerException e) {
			e.printStackTrace();
			Java_Logger.getLog(element +"Element not visible");
		Assert.fail();
		}
	}

	public String getText(WebElement element) {
		try {
			BaseClass.waits.waituntilVisible(element);
			return element.getText();
		} catch (NullPointerException e) {
			e.printStackTrace();
			Java_Logger.getLog(element+"Not found");
		}
		return element + ": Not found";

	}
	public void writeText(WebElement element,String value) {
		try {
			BaseClass.waits.waitUntilClickable(element);
			element.sendKeys(value);
			Java_Logger.getLog(element +"get Text" + element.getText());
		} catch (NullPointerException e) {
			e.printStackTrace();
		Java_Logger.getLog(element +"element not found");
		Assert.fail();
		}
	}

}
