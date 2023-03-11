package tests;

import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.kuwaitHomePage;

import java.io.IOException;


public class KuwaitTest extends TestPase {


    private kuwaitHomePage kuwaitHomePageObject;
    private SoftAssert softAssert = new SoftAssert();

    // Tests
    @Test
    public void userCanChangeTheCountryToKuwait()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();

        kuwaitHomePageObject = new kuwaitHomePage(driver);
        kuwaitHomePageObject.ClickOnCountryBtn();
        kuwaitHomePageObject.ClickOnKuwait_CheckboxCountry();
        Assert.assertEquals( kuwaitHomePageObject.GetCurrentCountryName(),jsonReader.CountryName_KW);

    }

    // the lite type
    @Test
    public void CheckSubscription_Packages_Types_Lite()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        kuwaitHomePageObject = new kuwaitHomePage(driver);
        kuwaitHomePageObject.ClickOnCountryBtn();
        kuwaitHomePageObject.ClickOnKuwait_CheckboxCountry();
        Assert.assertEquals( kuwaitHomePageObject.GetSubscription_Type_LiteName(),jsonReader.LiteName);
        Assert.assertTrue( kuwaitHomePageObject.IsSubscription_Type_LiteDisplay());

    }
    @Test
    public void CheckSubscription_Packages_PriceAndCurrency_Lite()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        kuwaitHomePageObject = new kuwaitHomePage(driver);
        kuwaitHomePageObject.ClickOnCountryBtn();
        kuwaitHomePageObject.ClickOnKuwait_CheckboxCountry();
        Assert.assertEquals( kuwaitHomePageObject.GetSubscription_PriceAndCurrency_Lite(),jsonReader.LiteMonthlyPriceAndCurrency_KW);

    }

    // the Classic type
    @Test
    public void CheckSubscription_Packages_Types_Classic()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        kuwaitHomePageObject = new kuwaitHomePage(driver);
        kuwaitHomePageObject.ClickOnCountryBtn();
        kuwaitHomePageObject.ClickOnKuwait_CheckboxCountry();
        Assert.assertEquals( kuwaitHomePageObject.GetSubscription_Type_ClassicName(),jsonReader.ClassicName);
        Assert.assertTrue( kuwaitHomePageObject.IsSubscription_Type_ClassicDisplay());

    }
    @Test
    public void CheckSubscription_Packages_PriceAndCurrency_Classic()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        kuwaitHomePageObject = new kuwaitHomePage(driver);
        kuwaitHomePageObject.ClickOnCountryBtn();
        kuwaitHomePageObject.ClickOnKuwait_CheckboxCountry();
        Assert.assertEquals( kuwaitHomePageObject.GetSubscription_PriceAndCurrency_Classic(),jsonReader.ClassicMonthlyPriceAndCurrency_KW);

    }
    // the Premium type
    @Test
    public void CheckSubscription_Packages_Types_Premium()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        kuwaitHomePageObject = new kuwaitHomePage(driver);
        kuwaitHomePageObject.ClickOnCountryBtn();
        kuwaitHomePageObject.ClickOnKuwait_CheckboxCountry();
        Assert.assertEquals( kuwaitHomePageObject.GetSubscription_Type_PremiumName(),jsonReader.PremiumName);
        Assert.assertTrue( kuwaitHomePageObject.IsSubscription_Type_PremiumDisplay());

    }
    @Test
    public void CheckSubscription_Packages_PriceAndCurrency_premium()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        kuwaitHomePageObject = new kuwaitHomePage(driver);
        kuwaitHomePageObject.ClickOnCountryBtn();
        kuwaitHomePageObject.ClickOnKuwait_CheckboxCountry();
        Assert.assertEquals( kuwaitHomePageObject.GetSubscription_PriceAndCurrency_Premium(),jsonReader.PremiumMonthlyPriceAndCurrency_KW);

    }



}
