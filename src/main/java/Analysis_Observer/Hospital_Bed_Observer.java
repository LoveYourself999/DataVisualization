package Analysis_Observer;

import java.util.ArrayList;

public class Hospital_Bed_Observer extends Observer {

    private String methodCode = "SH.MED.BEDS.ZS";
    private String ObserverDes = "Hospital beds (per 1,000 people)";

    public Hospital_Bed_Observer(Subject subject){
        this.setMethod(methodCode);
        this.setObserverDes(ObserverDes);
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public ArrayList update(String country, int startYear, int endYear) {

        String urlString = String.format(
                "http://api.worldbank.org/v2/country/%s/indicator/%s?date=%d:%d&format=json", country, this.methodCode,startYear,endYear);
        return GetData(country, urlString);

    }

}