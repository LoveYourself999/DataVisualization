package GetData;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class GetRejectedYearList {
    private static final String Year_List_address = "src/main/resources/RejectedYear.json";

    private static GetRejectedYearList Get_YearList_instance;

    private HashMap<String, ArrayList<String>> yearNames = new HashMap<>();


    public static GetRejectedYearList getInstance() {
        if (Get_YearList_instance == null)
            Get_YearList_instance = new GetRejectedYearList();
        return Get_YearList_instance;
    }

    GetRejectedYearList() {
        try {
            JsonArray jsonArray = new JsonParser().parse((new FileReader(Year_List_address))).getAsJsonArray();
            int size = jsonArray.size();
            for (int i = 0; i < size; i++) {
                String year = jsonArray.getAsJsonArray().get(i).getAsJsonObject().get("year").getAsString();
                String method = jsonArray.getAsJsonArray().get(i).getAsJsonObject().get("method").getAsString();

                if(yearNames.containsKey(method))
                {
                    yearNames.get(method).add(year);
                }
                else
                {
                    yearNames.put(method,new ArrayList<String>());
                    yearNames.get(method).add(year);
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean checkYearAndMethod(int startYear, int endYear, String methodname)
    {
        List rejectedyearList = (List) yearNames.get(methodname);
        if(rejectedyearList != null) {
            int size = rejectedyearList.size();
            for (int i = 0; i < size; i++) {
                int year = Integer.parseInt(rejectedyearList.get(i).toString());
                if (year <= endYear && year >= startYear) {
                    return false;
                }
            }
        }
        return true;
    }

    public HashMap getYearNames() {
        return yearNames;
    }

//    public static void main(String[] args){
//        GetRejectedYearList getYearList = GetRejectedYearList.getInstance();
//        List rejectedyear = (List) getYearList.getYearNames().get("Mortality");
//        if(getYearList.checkYearAndMethod(2010,2010,"Mortality"))
//            System.out.println("1111111111");
//    }
}

