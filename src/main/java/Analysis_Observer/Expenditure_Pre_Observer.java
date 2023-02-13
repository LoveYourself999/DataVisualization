package Analysis_Observer;

import java.util.ArrayList;

public class Expenditure_Pre_Observer extends Observer {

    private String methodCode = "SH.XPD.CHEX.PC.CD";
    private String ObserverDes = "Current health expenditure per capita (current US$) ";

    public Expenditure_Pre_Observer(Subject subject){
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