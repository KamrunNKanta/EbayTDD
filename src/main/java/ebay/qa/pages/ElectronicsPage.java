package ebay.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ebay.qa.base.BaseClass;

public class ElectronicsPage {
	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
	public WebElement searchField;
	@FindBy(xpath = "//input[@class='btn btn-prim gh-spr']")
	public WebElement searchButton;

private void writeTextSearchField(String value) {
	BaseClass.commonMethods.writeText(searchField, value);
}
private void clickSearchButton() {
	BaseClass.commonMethods.click(searchButton);
}
public void electronicsPageSteps(String value) {
	writeTextSearchField(value);
	clickSearchButton();
}

}
