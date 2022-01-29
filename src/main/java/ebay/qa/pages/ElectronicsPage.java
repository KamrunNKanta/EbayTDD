package ebay.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
	public WebElement searchField;
	@FindBy(xpath = "//input[@class='btn btn-prim gh-spr']")
	public WebElement searchButton;
}
