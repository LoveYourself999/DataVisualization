package Analysis;

import Analysis_Observer.Api_Data;
import Analysis_Observer.Expenditure_Education_Percent_GDP_Observer;
import Analysis_Observer.Expenditure_Percent_Of_GDP_Observer;
import Analysis_Observer.Subject;
import ExceptionList.ChartNotFoundException;
import ViewerFactory.Chart;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.List;

public class Education_Percent_GDP_And_Health_Method implements AnalysisStrategy {

    private String AnalysisInfo = "Education_Percent_GDP_And_Health_Method";

    private HashMap<String,ArrayList> transferred_data;
    private List stored_Data;

    private ArrayList<String> analysis_list;

    private ArrayList<String> unitList = new ArrayList<>();
    private ArrayList<String> des_List = new ArrayList<>();

    public void initialize_Des_List() {
        for(int i=0;i<method_list.size();i++)
        {
            des_List.add("average rate of " + method_list.get(i));
        }
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

    private List<String> allowedList = new ArrayList<>(Arrays.asList("Report","Scatter Chart","Bar Chart","Line Chart"));

    public Education_Percent_GDP_And_Health_Method(Chart chart, String countryName, int startYear, int endYear) {
        super();
        this.startYear = startYear - 1;
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
        //       new Hospital_beds_Observer(subject);
        new Expenditure_Education_Percent_GDP_Observer(subject);
        new Expenditure_Percent_Of_GDP_Observer(subject);
        StringBuilder sb = new StringBuilder();
        sb.append("Education_Percent_GDP_And_Health_Method \n" + "==============================\n");
        transferred_data = subject.setState(countryname,startYear,endYear);
        method_list = subject.getMethod_list();
        initialize_Des_List();
        analsysis_data_list = new HashMap<>();
        int size = transferred_data.get(method_list.get(0)).size();
        double return_rate;
        for(int i =0;i<method_list.size(); i++)
        {
            ArrayList<Analysis_Data> analysis_dataArrayList = new ArrayList<>();
            ArrayList<Api_Data> temp_date = transferred_data.get(method_list.get(i));
            for (int j = 0; j< temp_date.size()-1;j++)
            {
                //System.out.println(temp_date.get(j).getYear() + "   " +temp_date.get(j).getValue());
                if(temp_date.get(j+1).getValue() != 0 && temp_date.get(j).getValue() !=0)
                {
                    double change_rate = temp_date.get(j+1).getValue()/temp_date.get(j).getValue();
                    BigDecimal transferred_value = new BigDecimal(change_rate);
                    return_rate = transferred_value.setScale(2,BigDecimal.ROUND_HALF_DOWN).doubleValue();
                    Analysis_Data analysis_data = new Analysis_Data(temp_date.get(j).getYear(),return_rate,method_list.get(i)
                            ,unitList.get(0),
                            getDes_List().get(i));
                    analysis_dataArrayList.add(analysis_data);}
                else
                {
                    Analysis_Data analysis_data = new Analysis_Data(temp_date.get(j).getYear(),0,method_list.get(i)
                            ,unitList.get(0),getDes_List().get(i));
                    analysis_dataArrayList.add(analysis_data);
                }

            }
            analsysis_data_list.put(method_list.get(i),analysis_dataArrayList);
        }
    }


        public String returnAnalysisInfo()
    {
        return AnalysisInfo;
    }


    @Override
    public String return_name() {
        return "Education_Percent_GDP_And_Health_Method";
    }


//    public static void main(String args[])
//    {
//          Data_Fetcher df = new Data_Fetcher("CAN",2001,2010,"Education Percent GDP And Health Method","report");
//
//    }

}
