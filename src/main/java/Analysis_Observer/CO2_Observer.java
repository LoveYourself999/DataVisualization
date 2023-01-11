package Analysis_Observer;

import java.util.ArrayList;

public class CO2_Observer extends Observer {

    private String methodCode = "EN.ATM.CO2E.PC";
    private String ObserverDes = "CO2 emissions (metric tons per capita)";

    public CO2_Observer(Subject subject){
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