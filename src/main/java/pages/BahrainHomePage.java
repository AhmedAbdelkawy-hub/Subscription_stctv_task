package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BahrainHomePage {
	 WebDriver driver;


// create constructor
	public BahrainHomePage(WebDriver driver) {

		this.driver = driver;

	}
 //Variable
// Locator
    By CountryNameBtn = By.id("country");
            By Bahrain_CheckBox_Btn = By.id("bh");
            By Subscription_Type_Lite = By.id("name-lite");
            By Subscription_Type_Classic = By.id("name-classic");
            By Subscription_Type_Premium = By.id("name-premium");
            By StartYourTrail_Lite_Button= By.id("lite-selection");
            By StartYourTrail_Classic_Button= By.id("classic-selection");
            By StartYourTrail_Premium_Button= By.id("premium-selection");
            By Monthly_price_Lite_Lapel = By.id("currency-lite");
            By Monthly_price_Classic_Lapel = By.id("currency-classic");
            By Monthly_price_Premium_Lapel = By.id("currency-premium");




// keywords /action/ methods
// open counters check box
public void ClickOnCountryBtn() {
        driver.findElement(CountryNameBtn).click();
        }

// Select the KSA country
public void ClickOnBahrain_CheckboxCountry() {
        driver.findElement(Bahrain_CheckBox_Btn).click();
        }

// Get country Text
public String GetCurrentCountryName() {
        return driver.findElement(CountryNameBtn).getText();
        }

// Get Subscription_Type_Lite Name
public String GetSubscription_Type_LiteName() {
        return driver.findElement(Subscription_Type_Lite).getText();
        }

// check Subscription_Type_Lite is display
public boolean IsSubscription_Type_LiteDisplay() {
        return driver.findElement(Subscription_Type_Lite).isDisplayed();
        }


// Get Subscription_Type_Lite Price And currency
public String GetSubscription_PriceAndCurrency_Lite() {
        return driver.findElement(Monthly_price_Lite_Lapel).getText();
        }



// Get Subscription_Type_classic Name
public String GetSubscription_Type_ClassicName() {
        return driver.findElement(Subscription_Type_Classic).getText();
        }

// check Subscription_Type_classic is display
public boolean IsSubscription_Type_ClassicDisplay() {
        return driver.findElement(Subscription_Type_Classic).isDisplayed();
        }


// Get Subscription_Type_Classic Price And currency
public String GetSubscription_PriceAndCurrency_Classic() {
        return driver.findElement(Monthly_price_Classic_Lapel).getText();
        }

// Get Subscription_Type_Premium Name
public String GetSubscription_Type_PremiumName() {
        return driver.findElement(Subscription_Type_Premium).getText();
        }

// check Subscription_Type_Premium display
public boolean IsSubscription_Type_PremiumDisplay() {
        return driver.findElement(Subscription_Type_Premium).isDisplayed();
        }


// Get Subscription_Type_Premium Price And currency
public String GetSubscription_PriceAndCurrency_Premium() {
        return driver.findElement(Monthly_price_Premium_Lapel).getText();
        }



        }

