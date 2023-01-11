package Analysis;

import Analysis_Observer.*;
import ExceptionList.ChartNotFoundException;
import ViewerFactory.Chart;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.List;

public class CO2_GDP_Method implements AnalysisStrategy {

    private String AnalysisInfo = "CO2_GDP_Method";

    private HashMap<String,ArrayList> transferred_data;
    private List stored_Data;
    private ArrayList<String> unitList = new ArrayList<>();
    private ArrayList<String> analysis_list;

    private ArrayList<String> des_List = new ArrayList<>();

    public void initialize_Des_List() {
        des_List.add("ratio of " + method_list.get(1) + " / " + method_list.get(0) );
        analysis_list = new ArrayList<>();
        analysis_list.add(AnalysisInfo);
        unitList.add(unit);
    }

    public ArrayList<String> getDes_List() {
        return des_List;
    }

    private String unit = "ratio";

    HashMap<String,ArrayList<Analysis_Data>> analsysis_data_list;
    private List<Chart> chartList = new ArrayList<Chart>();

    private HashMap<String,Chart> chartHashMap = new HashMap<>();
    private int startYear;

    private ArrayList<String> method_list;
    private int endYear;
    private String countryname;

    private List<String> allowedList = new ArrayList<>(Arrays.asList("Report","Scatter Chart","Bar Chart","Line Chart"));

    public CO2_GDP_Method(Chart chart, String countryName, int startYear, int endYear) {
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
            entry.getValue().draw(analsysis_data_list,AnalysisInfo,analysis_list);
        }
    }

    @Override
    public void returnPanel(JPanel west)
    {
        west.removeAll();
        west.setLayout(new GridLayout(2, 3));
        for (Map.Entry<String,Chart> entry:chartHashMap.entrySet())
        {
            entry.getValue().draw(analsysis_data_list,AnalysisInfo,analysis_list);
            west.add(entry.getValue().getReturn_chart());
        }
    }

    public void add_to_chart(Chart chart)
    {
        try {
            checkChart(chart);
            chartList.add(chart);
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

        new CO2_Observer(subject);
        new GDP_Observer(subject);
        StringBuilder sb = new StringBuilder();
        sb.append("CO2_GDP_Method \n" + "==============================\n");
        transferred_data = subject.setState(countryname,startYear,endYear);
        method_list = subject.getMethod_list();
        initialize_Des_List();
        analsysis_data_list = new HashMap<>();
        int size = transferred_data.get(method_list.get(0)).size();
        double return_rate;
        ArrayList<Api_Data> temp_data1 = transferred_data.get(method_list.get(0));
        ArrayList<Api_Data> temp_data2 = transferred_data.get(method_list.get(1));
        ArrayList<Analysis_Data> analysis_dataArrayList = new ArrayList<>();
        System.out.println("11111111111111");
        for(int i = 0; i< size ; i++)
        {
            if(temp_data1.get(i).getValue() != 0 && temp_data2.get(i).getValue() !=0)
            {
                double ratio = temp_data2.get(i).getValue()/temp_data1.get(i).getValue();
                BigDecimal transferred_value = new BigDecimal(ratio);
                return_rate = transferred_value.setScale(2,BigDecimal.ROUND_HALF_DOWN).doubleValue();
                Analysis_Data analysis_data = new Analysis_Data(temp_data1.get(i).getYear(),return_rate,AnalysisInfo
                        ,unitList.get(0),getDes_List().get(0));
                analysis_dataArrayList.add(analysis_data);

            }
            else
            {
                Analysis_Data analysis_data = new Analysis_Data(temp_data1.get(i).getYear(),0,AnalysisInfo
                        ,unitList.get(0),getDes_List().get(0));
                analysis_dataArrayList.add(analysis_data);
            }
            analsysis_data_list.put(AnalysisInfo,analysis_dataArrayList);
        }
    }


        public String returnAnalysisInfo()
    {
        return AnalysisInfo;
    }


    @Override
    public String return_name() {
        return "Mortality";
    }


//    public static void main(String args[])
//    {
//          Data_Fetcher df = new Data_Fetcher("CAN",2001,2010,"CO2 GDP Method","report");
//    }

}
