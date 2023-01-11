package Analysis_Observer;

import java.util.ArrayList;

public class Women_Access_Health_Observer extends Observer {

    private String methodCode = "SH.ACS.MONY.Q1.ZS";
    private String ObserverDes = "Problems in accessing health care (% of women): Q1 (lowest) ";

    public Women_Access_Health_Observer(Subject subject){
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