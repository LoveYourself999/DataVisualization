package Analysis_Observer;

import java.util.ArrayList;

public class Mortality_Observer extends Observer {

    private String Mortalitymethod = "SP.DYN.IMRT.IN";
    private String ObserverDes = "Mortality/1000 births";


    public Mortality_Observer(Subject subject){
        this.setMethod(Mortalitymethod);
        this.setObserverDes(ObserverDes);
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public ArrayList update(String country,int startYear,int endYear) {

        String urlString = String.format(
                "http://api.worldbank.org/v2/country/%s/indicator/%s?date=%d:%d&format=json", country, this.Mortalitymethod,startYear,endYear);
        return GetData(country, urlString);

    }

}