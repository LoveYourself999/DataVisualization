package Analysis_Observer;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Observer {
    protected Subject subject;
    public abstract ArrayList update(String country,int startYear,int endYear);

    protected String method;
    protected String ObserverDes;

    public void setMethod(String method) {
        this.method = method;
    }

    public void setObserverDes(String observerDes) {
        ObserverDes = observerDes;
    }

    public String getMethod() {
        return method;
    }

    public String getObserverDes() {
        return ObserverDes;
    }

//    public ArrayList update(String country,int startYear,int endYear) {
//
//        String urlString = String.format(
//                "http://api.worldbank.org/v2/country/%s/indicator/%s?date=%d:%d&format=json", country, this.Mortalitymethod,startYear,endYear);
//        return GetData(country, urlString);
//
//    }

    public ArrayList GetData(String aCountry, String urlString) {
        ArrayList<Api_Data> return_String = new ArrayList<>();
        double required_value = 0.0;
        int error_count = 0;
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            if (responsecode == 200) {
                String inline = "";
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    inline += sc.nextLine();
                }
                sc.close();
                JsonArray jsonArray = new JsonParser().parse(inline).getAsJsonArray();
                int size = jsonArray.size();
                int sizeOfResults = jsonArray.get(1).getAsJsonArray().size();
                int year;
                for (int i = 0; i < sizeOfResults; i++) {
                    year = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
                    if (jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
                        required_value = 0.0;
                    else {
                         jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value");
                         required_value = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value")
                                .getAsDouble();
//                        BigDecimal transferred_value = new BigDecimal(temp_value);
//                        required_value = transferred_value.setScale(2,BigDecimal.ROUND_HALF_DOWN).doubleValue();
//                        if(required_value==0)
//                            error_count++;
                    }
//                    if(error_count==0)
                        return_String.add(new Api_Data(year,required_value,this.getObserverDes()));
//                    else
//                        throw new NoSuchElementException("values are null");
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block e.printStackTrace();
        }
        return return_String;
    }

}