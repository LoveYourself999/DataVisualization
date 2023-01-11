package Data_fetcher;

import Analysis.AnalysisContent;
import Analysis.AnalysisMethodFactory;
import Analysis.AnalysisStrategy;
import ViewerFactory.Chart;
import ViewerFactory.ChartFactory;


public class Data_Fetcher {
    private String CountryName;
    private int startYear;
    private int endYear;
    private AnalysisStrategy method;

    private static Data_Fetcher data_fetcher_instance;

    public static Data_Fetcher getInstance() {
        if (data_fetcher_instance == null) {
            data_fetcher_instance = new Data_Fetcher();
        }
        return data_fetcher_instance;
    }

    public Data_Fetcher() {
    }

    public Data_Fetcher(String countryName, int startYear, int endYear, String method, String viewer) {
        CountryName = countryName;
        this.startYear = startYear;
        this.endYear = endYear;
        AnalysisMethodFactory  analysisMethodFactory = new AnalysisMethodFactory();
        ChartFactory chartFactory = new ChartFactory();
        Chart chart = chartFactory.getChart(viewer);
        AnalysisStrategy strategy;
        AnalysisContent analysisContent = new AnalysisContent();
        this.method = analysisMethodFactory.getAnalysisStrategy(method ,chart,countryName,startYear,endYear);
        analysisContent.setStrategy(this.method);
        analysisContent.executeStrategy();
        //this.method = analysisMethodFactory.getAnalysisMethod(method , chart,countryName,startYear,endYear);
    }

    public void add_new_chart(String viewer)
    {
        ChartFactory chartFactory = new ChartFactory();
        Chart chart = chartFactory.getChart(viewer);
        this.method.add_to_chart(chart);
    }

    public void remove_chart(String viewer)
    {
        ChartFactory chartFactory = new ChartFactory();
        Chart chart = chartFactory.getChart(viewer);
        this.method.remove_Chart(chart);
    }



    StringBuilder emsg = new StringBuilder();



    public Data_Fetcher(String CountryName , int startYear,int endYear) {
        this.CountryName = CountryName;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public boolean year() {
        if (startYear > endYear) {
            emsg.append("Wrong Input");
            System.out.println(emsg.toString());
            return false;
        }
        else
            return true;
    }

    public AnalysisStrategy getMethod() {
        return method;
    }

    public String getCountryName() {
        return CountryName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

//    public static void main(String args[])
//    {
//        Data_Fetcher df = new Data_Fetcher("CAN",2001,2020,"Mortality_Method","report");
//        df.add_new_chart("Line Chart");
//    }
}
