package ViewerFactory;

import Analysis.Analysis_Data;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Bar_Chart implements Chart{

    private String type =  "Bar Chart";

    private ChartPanel return_chart;

    @Override
    public void draw(HashMap<String, ArrayList<Analysis_Data>> transferred_data, String analysisInfo, ArrayList<String> method_list){
        System.out.println("Bar_Chart");
        HashMap<String,ArrayList<Analysis_Data>> result = transferred_data;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        HashMap<String,DefaultCategoryDataset> defaultCategoryDatasets = new HashMap<>();
        ArrayList<String> unitlist = new ArrayList<>();
        for(int i = 0 ; i< method_list.size();i++)
        {
            if(!defaultCategoryDatasets.containsKey(result.get(method_list.get(i)).get(0).getUnit()))
            {
                System.out.println(method_list.get(i));
                unitlist.add(result.get(method_list.get(i)).get(0).getUnit());
                defaultCategoryDatasets.put(result.get(method_list.get(i)).get(0).getUnit(),new DefaultCategoryDataset());
                for(int j = 0 ; j< transferred_data.get(method_list.get(0)).size();j++)
                {
                    defaultCategoryDatasets.get(result.get(method_list.get(i)).get(0).getUnit()).setValue(transferred_data.get(method_list.get(i)).get(j).getValue(),
                            method_list.get(i),""+transferred_data.get(method_list.get(0)).get(j).getYear());
                }
            }
            else
            {
                for(int j = 0 ; j< transferred_data.get(method_list.get(0)).size();j++)
                {
                    defaultCategoryDatasets.get(result.get(method_list.get(i)).get(0).getUnit()).setValue(transferred_data.get(method_list.get(i)).get(j).getValue(),
                            method_list.get(i),""+transferred_data.get(method_list.get(0)).get(j).getYear());
                }
            }
        }


        CategoryPlot plot = new CategoryPlot();
        BarRenderer barrenderer1 = new BarRenderer();
        BarRenderer barrenderer2 = new BarRenderer();
        ArrayList<BarRenderer> barRenderers = new ArrayList<>();
        for(int i = 0;i<unitlist.size();i++)
        {
            System.out.println(unitlist.get(i));
            barRenderers.add(new BarRenderer());
            plot.setDataset(i,defaultCategoryDatasets.get(unitlist.get(i)));
            plot.setRenderer(i,barRenderers.get(i));
            plot.setRangeAxis(i,new NumberAxis(unitlist.get(i)));
        }
//        plot.setDataset(0, dataset);
//        plot.setRenderer(0, barrenderer1);
        CategoryAxis domainAxis = new CategoryAxis("Year");
        plot.setDomainAxis(domainAxis);
//        plot.setRangeAxis(new NumberAxis(""));
//
//        plot.setDataset(1, dataset2);
//        plot.setRenderer(1, barrenderer2);
//        plot.setRangeAxis(1, new NumberAxis("US$"));

        plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
        plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis

        JFreeChart barChart = new JFreeChart(analysisInfo,
                new Font("Serif", java.awt.Font.BOLD, 18), plot, true);


        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(400, 300));
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        return_chart = chartPanel;
    }

    public ChartPanel getReturn_chart() {
        return return_chart;
    }

    @Override
    public String returnType() {
        return type;
    }
}
