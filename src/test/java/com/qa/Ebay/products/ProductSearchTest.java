package com.qa.Ebay.products;

import org.testng.annotations.Test;

import ebay.qa.base.BaseClass;

public class ProductSearchTest extends BaseClass {
	@Test
	public void productSearchTest() {

		commonMethods.click(homePage.categoryButton);
		commonMethods.click(homePage.electronicsClick);
		commonMethods.writeText(electronicsPage.searchField, "iphone");
		commonMethods.click(electronicsPage.searchButton);
	}
}