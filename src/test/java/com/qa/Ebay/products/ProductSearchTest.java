package com.qa.Ebay.products;

import java.time.Duration;




import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ebay.qa.base.BaseClass;
import ebay.qa.pages.ProductPage;

public class ProductSearchTest extends BaseClass{
	@Test
	public void productSearchTest() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	ProductPage ppage=new ProductPage(driver);
		ppage.categoryButton.click();
	wait.until(ExpectedConditions.elementToBeClickable(ppage.categoryButton));
	ppage.electronicsClick.click();
	wait.until(ExpectedConditions.visibilityOf(ppage.electronicsClick));
	
	
	}

}
