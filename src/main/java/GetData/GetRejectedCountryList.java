package GetData;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Vector;

public class GetRejectedCountryList {
    private static final String Country_List_address = "src/main/resources/RejectedCountries.json";

    private static GetRejectedCountryList Get_CountryList_instance;

    private Vector<String> countriesNames = new Vector<String>();


    public static GetRejectedCountryList getInstance() {
        if (Get_CountryList_instance == null)
            Get_CountryList_instance = new GetRejectedCountryList();
        return Get_CountryList_instance;
    }

    GetRejectedCountryList() {
        try {
            JsonArray jsonArray = new JsonParser().parse((new FileReader(Country_List_address))).getAsJsonArray();
            int size = jsonArray.size();
            for (int i = 0; i < size; i++) {
                String name = jsonArray.getAsJsonArray().get(i).getAsJsonObject().get("text").getAsString();
                countriesNames.add(name);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public Vector<String> getCountriesNames() {
        return countriesNames;
    }

//    public static void main(String[] args){
//        GetRejectedCountryList getCountryList = GetRejectedCountryList.getInstance();
//
//    }
}

