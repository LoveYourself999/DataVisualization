package Analysis_Observer;

import java.util.ArrayList;

public class Expenditure_Education_Percent_GDP_Observer extends Observer {

    private String methodCode = "SE.XPD.TOTL.GD.ZS";
    private String ObserverDes = "Government expenditure on education, total (% of GDP)";

    public Expenditure_Education_Percent_GDP_Observer(Subject subject){
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