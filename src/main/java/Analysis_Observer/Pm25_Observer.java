package Analysis_Observer;

import java.util.ArrayList;

public class Pm25_Observer extends Observer {

    private String methodCode = "EN.ATM.PM25.MC.M3";
    private String ObserverDes = "PM2.5 air pollution, mean annual exposure (micrograms per cubic meter)";

    public Pm25_Observer(Subject subject){
        this.setMethod(methodCode);
        this.setObserverDes(ObserverDes);
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public ArrayList update(String country,int startYear,int endYear) {

        String urlString = String.format(
                "http://api.worldbank.org/v2/country/%s/indicator/%s?date=%d:%d&format=json", country, this.methodCode,startYear,endYear);
        return GetData(country, urlString);

    }

}