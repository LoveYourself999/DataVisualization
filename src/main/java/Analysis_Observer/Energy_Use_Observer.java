package Analysis_Observer;

import java.util.ArrayList;

public class Energy_Use_Observer extends Observer {

    private String methodCode = "EG.USE.PCAP.KG.OE";
    private String ObserverDes = "Energy use (kg of oil equivalent per capita)";

    public Energy_Use_Observer(Subject subject){
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