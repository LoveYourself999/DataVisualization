package GetData;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Vector;

public class GetCountryList {
    private static final String Country_List_address = "src/main/resources/reporterAreas.json";

    private static GetCountryList Get_CountryList_instance;

    private Vector<String> countriesNames = new Vector<String>();

    private HashMap<String,String> countryname_code = new HashMap<>();

    public static GetCountryList getInstance() {
        if (Get_CountryList_instance == null)
            Get_CountryList_instance = new GetCountryList();
        return Get_CountryList_instance;
    }

    GetCountryList() {
        try {
            JsonArray jsonArray = new JsonParser().parse((new FileReader(Country_List_address))).getAsJsonArray();
            int size = jsonArray.size();
            for (int i = 0; i < size; i++) {
                String name = jsonArray.getAsJsonArray().get(i).getAsJsonObject().get("text").getAsString();
                countriesNames.add(name);
                String code = jsonArray.getAsJsonArray().get(i).getAsJsonObject().get("code").getAsString();
                countryname_code.put(name,code);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Vector<String> getCountriesNames() {
        return countriesNames;
    }

    public String findCountryCode(String country_name)
    {
        return countryname_code.get(country_name);
    }

//    public static void main(String[] args){
//        GetCountryList getCountryList = GetCountryList.getInstance();
//        String name = getCountryList.findCountryCode("Canada");
//        System.out.println(name);
//    }
}

