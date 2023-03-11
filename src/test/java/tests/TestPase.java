package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.Helper;

public class TestPase{

    public static WebDriver driver;

    @BeforeClass
    @Parameters({ "Browser" })
    public void setup( @Optional("Chrome") String BrowserName) {
        if (BrowserName.equalsIgnoreCase("Chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (BrowserName.equalsIgnoreCase("Firfox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (BrowserName.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }


        driver.manage().window().maximize();
        driver.get("https://subscribe.stctv.com/sa-en");

    }

    // Take screenshot after test case fail and add it in screenshot folder
    @AfterMethod
    public void screenshotonfailuer(ITestResult Result) {
        if (Result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed");
            System.out.println("Taking screenshot....");
            Helper.captureScreenshot(driver, Result.getName());
        }
    }

//	@BeforeMethod
//	public void beforeMethod() {
//		driver.get("https://www.facebook.com/");
//	}
//
//	@AfterMethod
//	public void afterMethod() {
//		driver.quit();
//	}
}
