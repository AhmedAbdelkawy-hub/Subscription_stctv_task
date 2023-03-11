package data;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataReader {
	
	public String CountryName_K,CountryName_KW,CountryName_BA,LiteName,ClassicName,PremiumName,LiteMonthlyPriceAndCurrency_K,ClassicMonthlyPriceAndCurrency_K,PremiumMonthlyPriceAndCurrency_K
			,LiteMonthlyPriceAndCurrency_KW,ClassicMonthlyPriceAndCurrency_KW,PremiumMonthlyPriceAndCurrency_KW,LiteMonthlyPriceAndCurrency_BA,ClassicMonthlyPriceAndCurrency_BA,PremiumMonthlyPriceAndCurrency_BA;
	
	public void JsonReader() throws JsonIOException, JsonSyntaxException, IOException, ParseException {
		
		String FilePath = System.getProperty("user.dir")+"/src/test/java/data/UserData.json";
		File srcFile = new File(FilePath);
		JSONParser parser = new JSONParser();
		JSONArray Jarray =  (JSONArray) parser.parse(new FileReader(srcFile));
		
		for(Object jsonobj : Jarray) 
		{
			JSONObject person =  (JSONObject)jsonobj;
			CountryName_K = (String) person.get("CountryName_K");
			CountryName_KW = (String) person.get("CountryName_KW");
			CountryName_BA = (String) person.get("CountryName_BA");
			LiteName = (String) person.get("LiteName");
			ClassicName = (String) person.get("ClassicName");
			PremiumName = (String) person.get("PremiumName");
			LiteMonthlyPriceAndCurrency_K = (String) person.get("LiteMonthlyPriceAndCurrency_K");
			ClassicMonthlyPriceAndCurrency_K = (String) person.get("ClassicMonthlyPriceAndCurrency_K");
			PremiumMonthlyPriceAndCurrency_K = (String) person.get("PremiumMonthlyPriceAndCurrency_K");
			LiteMonthlyPriceAndCurrency_KW = (String) person.get("LiteMonthlyPriceAndCurrency_KW");
			ClassicMonthlyPriceAndCurrency_KW = (String) person.get("ClassicMonthlyPriceAndCurrency_KW");
			PremiumMonthlyPriceAndCurrency_KW = (String) person.get("PremiumMonthlyPriceAndCurrency_KW");
			LiteMonthlyPriceAndCurrency_BA = (String) person.get("LiteMonthlyPriceAndCurrency_BA");
			ClassicMonthlyPriceAndCurrency_BA = (String) person.get("ClassicMonthlyPriceAndCurrency_BA");
			PremiumMonthlyPriceAndCurrency_BA = (String) person.get("PremiumMonthlyPriceAndCurrency_BA");
		}
	}

}
