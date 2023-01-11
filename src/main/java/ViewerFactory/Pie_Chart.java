package ViewerFactory;

import Analysis.Analysis_Data;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Pie_Chart implements Chart{

    private String type =  "Pie Chart";

    private ChartPanel return_chart;

    @Override
    public void draw(HashMap<String, ArrayList<Analysis_Data>> transferred_data, String analysisInfo, ArrayList<String> method_list) {
        System.out.println("Pie_Chart");

        HashMap<String,ArrayList<Analysis_Data>> result = transferred_data;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 0;i<method_list.size();i++)
        {
            dataset.addValue(transferred_data.get(method_list.get(i)).get(0).getValue(),method_list.get(i),analysisInfo);
        }
        JFreeChart pieChart = ChartFactory.createMultiplePieChart(analysisInfo, dataset,
                TableOrder.BY_COLUMN, true, true, false);
        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new Dimension(400, 300));
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        return_chart = chartPanel;
    }

    @Override
    public String returnType() {
        return type;
    }

    @Override
    public Component getReturn_chart() {
        return return_chart;
    }
}
