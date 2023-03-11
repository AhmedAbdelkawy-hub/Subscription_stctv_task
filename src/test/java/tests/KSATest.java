package tests;

import com.google.gson.stream.JsonReader;
import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.KSAHomePage;

import java.io.IOException;

public class KSATest extends TestPase {

    private KSAHomePage HomePageObjet;
    private SoftAssert softAssert = new SoftAssert();

	// Tests
@Test
    public void userCanChangeTheCountryToKSA() throws IOException, ParseException {
    JsonDataReader jsonReader = new JsonDataReader();
    jsonReader.JsonReader();

       HomePageObjet = new KSAHomePage(driver);
       HomePageObjet.ClickOnCountryBtn();
       HomePageObjet.ClickOnKSA_CheckboxCountry();

    Assert.assertEquals( HomePageObjet.GetCurrentCountryName(),jsonReader.CountryName_K);

}

    // the lite type
    @Test
    public void CheckSubscription_Packages_Types_Lite() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();

        HomePageObjet = new KSAHomePage(driver);
        HomePageObjet.ClickOnCountryBtn();
        HomePageObjet.ClickOnKSA_CheckboxCountry();
        Assert.assertEquals( HomePageObjet.GetSubscription_Type_LiteName(),jsonReader.LiteName);
        Assert.assertTrue( HomePageObjet.IsSubscription_Type_LiteDisplay());

    }
    @Test
    public void CheckSubscription_Packages_PriceAndCurrency_Lite() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();

        HomePageObjet = new KSAHomePage(driver);
        HomePageObjet.ClickOnCountryBtn();
        HomePageObjet.ClickOnKSA_CheckboxCountry();
        Assert.assertEquals( HomePageObjet.GetSubscription_PriceAndCurrency_Lite(),jsonReader.LiteMonthlyPriceAndCurrency_K);

    }

    // the Classic type
    @Test
    public void CheckSubscription_Packages_Types_Classic() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        HomePageObjet = new KSAHomePage(driver);
        HomePageObjet.ClickOnCountryBtn();
        HomePageObjet.ClickOnKSA_CheckboxCountry();
        Assert.assertEquals( HomePageObjet.GetSubscription_Type_ClassicName(),jsonReader.ClassicName);
        Assert.assertTrue( HomePageObjet.IsSubscription_Type_ClassicDisplay());

    }
    @Test
    public void CheckSubscription_Packages_PriceAndCurrency_Classic() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();

        HomePageObjet = new KSAHomePage(driver);
        HomePageObjet.ClickOnCountryBtn();
        HomePageObjet.ClickOnKSA_CheckboxCountry();
        Assert.assertEquals( HomePageObjet.GetSubscription_PriceAndCurrency_Classic(),jsonReader.ClassicMonthlyPriceAndCurrency_K);

    }
    // the Premium type
    @Test
    public void CheckSubscription_Packages_Types_Premium() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();


        HomePageObjet = new KSAHomePage(driver);
        HomePageObjet.ClickOnCountryBtn();
        HomePageObjet.ClickOnKSA_CheckboxCountry();
        Assert.assertEquals( HomePageObjet.GetSubscription_Type_PremiumName(),jsonReader.PremiumName);
        Assert.assertTrue( HomePageObjet.IsSubscription_Type_PremiumDisplay());

    }
    @Test
    public void CheckSubscription_Packages_PriceAndCurrency_premium() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();

        HomePageObjet = new KSAHomePage(driver);
        HomePageObjet.ClickOnCountryBtn();
        HomePageObjet.ClickOnKSA_CheckboxCountry();
        Assert.assertEquals( HomePageObjet.GetSubscription_PriceAndCurrency_Premium(),jsonReader.PremiumMonthlyPriceAndCurrency_K);

    }




}
