package ebay.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ebay.qa.pages.ProductPage;

public class BaseClass {
	public static WebDriver driver;
	public static ProductPage productPage;
	@BeforeMethod
public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aer15\\eclipse-workspace\\com.qa.Amazon\\Drivers\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 initElement() ;
	

}

@AfterMethod
public void tearUp() {
	driver.quit();
}
public void initElement() {
	productPage=new ProductPage(driver);
	
	
}
}
