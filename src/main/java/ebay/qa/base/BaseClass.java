package ebay.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ebay.qa.common.CommonMethods;
import ebay.qa.common.CommonWaits;
import ebay.qa.pages.ElectronicsPage;
import ebay.qa.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static CommonWaits waits;
	public HomePage homePage;
	public ElectronicsPage electronicsPage;
	public static CommonMethods commonMethods;

	@BeforeMethod
	public void setUp() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\aer15\\eclipse-workspace\\com.qa.Ebay\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		initElement();

	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

	public void initElement() {
		homePage = new HomePage(driver);
		electronicsPage = new ElectronicsPage(driver);
		waits = new CommonWaits();
		commonMethods = new CommonMethods();

	}
}
