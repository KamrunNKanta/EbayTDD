package com.qa.Ebay.products;

import org.testng.annotations.Test;

import ebay.qa.base.BaseClass;

public class ProductSearchTest extends BaseClass {
	@Test
	public void productSearchTest() {

		waits.waitUntilClickable(homePage.categoryButton);
		// homePage.categoryButton.click();
		commonMethods.click(homePage.categoryButton);
		waits.waituntilVisible(homePage.electronicsClick);
		commonMethods.click(homePage.electronicsClick);

	}

}
