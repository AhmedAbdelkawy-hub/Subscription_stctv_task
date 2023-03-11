package tests;

import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BahrainHomePage;
import pages.KSAHomePage;

import java.io.IOException;

public class BahrainTest extends TestPase {


    private BahrainHomePage BahrainHomePagObject;
    private SoftAssert softAssert = new SoftAssert();
    // Tests
    @Test
    public void userCanChangeTheCountryToKSA()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();



        BahrainHomePagObject = new BahrainHomePage(driver);
        BahrainHomePagObject.ClickOnCountryBtn();
        BahrainHomePagObject.ClickOnBahrain_CheckboxCountry();
        Assert.assertEquals( BahrainHomePagObject.GetCurrentCountryName(),jsonReader.CountryName_BA);

    }

    // the lite type
    @Test
    public void CheckSubscription_Packages_Types_Lite()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();



        BahrainHomePagObject = new BahrainHomePage(driver);
        BahrainHomePagObject.ClickOnCountryBtn();
        BahrainHomePagObject.ClickOnBahrain_CheckboxCountry();
        Assert.assertEquals( BahrainHomePagObject.GetSubscription_Type_LiteName(),jsonReader.LiteName);
        Assert.assertTrue( BahrainHomePagObject.IsSubscription_Type_LiteDisplay());

    }
    @Test
    public void CheckSubscription_Packages_PriceAndCurrency_Lite()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        BahrainHomePagObject = new BahrainHomePage(driver);
        BahrainHomePagObject.ClickOnCountryBtn();
        BahrainHomePagObject.ClickOnBahrain_CheckboxCountry();
        Assert.assertEquals( BahrainHomePagObject.GetSubscription_PriceAndCurrency_Lite(),jsonReader.LiteMonthlyPriceAndCurrency_BA);

    }

    // the Classic type
    @Test
    public void CheckSubscription_Packages_Types_Classic()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        BahrainHomePagObject = new BahrainHomePage(driver);
        BahrainHomePagObject.ClickOnCountryBtn();
        BahrainHomePagObject.ClickOnBahrain_CheckboxCountry();
        Assert.assertEquals( BahrainHomePagObject.GetSubscription_Type_ClassicName(),jsonReader.ClassicName);
        Assert.assertTrue( BahrainHomePagObject.IsSubscription_Type_ClassicDisplay());

    }
    @Test
    public void CheckSubscription_Packages_PriceAndCurrency_Classic()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        BahrainHomePagObject = new BahrainHomePage(driver);
        BahrainHomePagObject.ClickOnCountryBtn();
        BahrainHomePagObject.ClickOnBahrain_CheckboxCountry();
        Assert.assertEquals( BahrainHomePagObject.GetSubscription_PriceAndCurrency_Classic(),jsonReader.ClassicMonthlyPriceAndCurrency_BA);

    }
    // the Premium type
    @Test
    public void CheckSubscription_Packages_Types_Premium()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        BahrainHomePagObject = new BahrainHomePage(driver);
        BahrainHomePagObject.ClickOnCountryBtn();
        BahrainHomePagObject.ClickOnBahrain_CheckboxCountry();
        Assert.assertEquals( BahrainHomePagObject.GetSubscription_Type_PremiumName(),jsonReader.PremiumName);
        Assert.assertTrue( BahrainHomePagObject.IsSubscription_Type_PremiumDisplay());

    }
    @Test
    public void CheckSubscription_Packages_PriceAndCurrency_premium()throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        BahrainHomePagObject = new BahrainHomePage(driver);
        BahrainHomePagObject.ClickOnCountryBtn();
        BahrainHomePagObject.ClickOnBahrain_CheckboxCountry();
        Assert.assertEquals( BahrainHomePagObject.GetSubscription_PriceAndCurrency_Premium(),jsonReader.PremiumMonthlyPriceAndCurrency_BA);

    }




}



