package ebay.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ebay.qa.base.BaseClass;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Shop by category')]")
	public WebElement categoryButton;
	@FindBy(xpath = "//a[@title='Your shopping destination for the best selection and value in electronics and accessories']")
	public WebElement electronicsClick;
private void clickCategoryBtn() {
	BaseClass.commonMethods.click(categoryButton);
}
private void clickElectronicsBtn() {
	BaseClass.commonMethods.click(electronicsClick);
}
public void HomePageSteps() {
	clickCategoryBtn();
	clickElectronicsBtn();
}


}