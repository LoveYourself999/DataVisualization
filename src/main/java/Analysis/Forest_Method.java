package Analysis;

import Analysis_Observer.Api_Data;
import Analysis_Observer.Forest_Observer;
import Analysis_Observer.Subject;
import ExceptionList.ChartNotFoundException;
import ViewerFactory.Chart;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.List;

public class Forest_Method implements AnalysisStrategy {

    private String AnalysisInfo = "Forest_Method";

    private HashMap<String,ArrayList> transferred_data;
    private List stored_Data;

    private ArrayList<String> unitList = new ArrayList<>();
    private ArrayList<String> des_List = new ArrayList<>();

    public void initialize_Des_List() {
            des_List.add("Average " + method_list.get(0));
            des_List.add("Rest ");
            unitList.add(unit);
    }
    public ArrayList<String> getDes_List() {
        return des_List;
    }

    private String unit = "percent";

    HashMap<String,ArrayList<Analysis_Data>> analsysis_data_list;
    private List<Chart> chartList = new ArrayList<Chart>();
    private int startYear;

    private HashMap<String,Chart> chartHashMap = new HashMap<>();
    private ArrayList<String> method_list;
    private int endYear;
    private String countryname;
    private List<String> allowedList = new ArrayList<>(Arrays.asList("Pie Chart"));

    public Forest_Method(Chart chart, String countryName, int startYear, int endYear) {
        super();
        this.startYear = startYear;
        this.countryname = countryName;
        this.endYear = endYear;
        this.analyze();
        add_to_chart(chart);
    }
    public HashMap<String, Chart> getChartHashMap() {
        return chartHashMap;
    }
    public void displayChart(){
        for (Map.Entry<String,Chart> entry:chartHashMap.entrySet())
        {
            entry.getValue().draw(analsysis_data_list,AnalysisInfo,method_list);
        }
    }

    @Override
    public void returnPanel(JPanel west)
    {
        west.removeAll();
        west.setLayout(new GridLayout(2, 3));
        for (Map.Entry<String,Chart> entry:chartHashMap.entrySet())
        {
            entry.getValue().draw(analsysis_data_list,AnalysisInfo,method_list);
            west.add(entry.getValue().getReturn_chart());
        }
    }

    public void add_to_chart(Chart chart)
    {
        try {
            checkChart(chart);
            chartHashMap.put(chart.returnType(),chart);
            //displayChart();
        } catch (ChartNotFoundException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "This chart is not available for this method");

        }
    }

    public void remove_Chart(Chart chart)
    {
        try {
            checkChart(chart);
            chartHashMap.remove(chart.returnType());
        }catch (ChartNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void checkChart(Chart chart) throws ChartNotFoundException {
        if(!allowedList.contains(chart.returnType()))
            throw new ChartNotFoundException(chart.returnType() + " not allowed!");
    }
    @Override
    public void analyze() {
        Subject subject = new Subject();
        new Forest_Observer(subject);
        StringBuilder sb = new StringBuilder();
        sb.append("PM2.5 Forest \n" + "==============================\n");
        transferred_data = subject.setState(countryname,startYear,endYear);
        method_list = subject.getMethod_list();
        initialize_Des_List();
        analsysis_data_list = new HashMap<>();
        int size = transferred_data.get(method_list.get(0)).size();
        double return_rate = 0;
        double change_rate = 0;
        ArrayList<Analysis_Data> analysis_dataArrayList = new ArrayList<>();
        ArrayList<Analysis_Data> analysis_dataArrayList1 = new ArrayList<>();
        ArrayList<Api_Data> temp_date = transferred_data.get(method_list.get(0));
        int count = 0;
        for(int i = 0; i< size; i++)
        {
            if(temp_date.get(i).getValue()>0) {
                change_rate += temp_date.get(i).getValue();
                count++;
            }
        }
        if(count>0)
            change_rate /= size;
        else
            change_rate = 0;
        BigDecimal transferred_value = new BigDecimal(change_rate);
        return_rate = transferred_value.setScale(2,BigDecimal.ROUND_HALF_DOWN).doubleValue();
        //
        Analysis_Data analysis_data = new Analysis_Data(endYear,return_rate,method_list.get(0)
                ,unitList.get(0),getDes_List().get(0));
        Analysis_Data analysis_data1 = new Analysis_Data(endYear,100 - return_rate,method_list.get(0)
                ,unitList.get(0),getDes_List().get(1));
        method_list.add("rest");
        analysis_dataArrayList.add(analysis_data);
        analysis_dataArrayList1.add(analysis_data1);
        analsysis_data_list.put(method_list.get(0),analysis_dataArrayList);
        analsysis_data_list.put(method_list.get(1),analysis_dataArrayList1);
    }


        public String returnAnalysisInfo()
    {
        return AnalysisInfo;
    }


    @Override
    public String return_name() {
        return "Forest_Method";
    }


//    public static void main(String args[])
//    {
//          Data_Fetcher df = new Data_Fetcher("CHN",1990,1990,"Forest Method","report");
//
//    }

}
