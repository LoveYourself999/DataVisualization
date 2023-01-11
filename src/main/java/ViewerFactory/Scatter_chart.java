package ViewerFactory;

import Analysis.Analysis_Data;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Scatter_chart implements Chart{

    private String type =  "Scatter Chart";
    private ChartPanel return_panel;
    @Override
    public void draw(HashMap<String, ArrayList<Analysis_Data>> transferred_data, String analysisInfo, ArrayList<String> method_list) {
        HashMap<String,ArrayList<Analysis_Data>> result = transferred_data;
        StringBuilder sb = new StringBuilder();
        sb.append(method_list.get(0));
        ArrayList<TimeSeries> timeSeries = new ArrayList<>();
        HashMap<String,TimeSeriesCollection> timeSeriesCollections = new HashMap<>();
        ArrayList<String> unitList = new ArrayList<>();
        for(int i = 0; i< method_list.size();i++)
        {
            timeSeries.add(new TimeSeries(method_list.get(i)));
            for(int j = 0;j<result.get(method_list.get(i)).size();j++)
            {
                timeSeries.get(i).add(new Year(result.get(method_list.get(i)).get(j).getYear()),result.get(method_list.get(i)).get(j).getValue());
            }
        }

        for(int i = 0; i< method_list.size();i++)
        {
            if(!timeSeriesCollections.containsKey(result.get(method_list.get(i)).get(0).getUnit()))
            {
                timeSeriesCollections.put(result.get(method_list.get(i)).get(0).getUnit(),new TimeSeriesCollection());
                timeSeriesCollections.get(result.get(method_list.get(i)).get(0).getUnit()).addSeries(timeSeries.get(i));
                unitList.add(result.get(method_list.get(i)).get(0).getUnit());
            }
            else
                timeSeriesCollections.get(result.get(method_list.get(i)).get(0).getUnit()).addSeries(timeSeries.get(i));

        }

        XYPlot plot = new XYPlot();
        ArrayList<XYItemRenderer> itemRenderers = new ArrayList<>();
        itemRenderers.add( new XYLineAndShapeRenderer(false, true));
        itemRenderers.add( new XYLineAndShapeRenderer(false, true));

        DateAxis domainAxis = new DateAxis("Year");
        plot.setDomainAxis(domainAxis);

        for(int i = 0;i< timeSeriesCollections.size();i++)
        {
            plot.setDataset(i,timeSeriesCollections.get(unitList.get(i)));
            plot.setRangeAxis(new NumberAxis(unitList.get(i)));
            plot.setRenderer(i,itemRenderers.get(i));
        }

        plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
        plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis

        JFreeChart scatterChart = new JFreeChart(analysisInfo,
                new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

        ChartPanel chartPanel = new ChartPanel(scatterChart);
        chartPanel.setPreferredSize(new Dimension(400, 300));
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        return_panel = chartPanel;
    }

    public ChartPanel getReturn_chart() {
        return return_panel;
    }

    @Override
    public String returnType() {
        return type;
    }
}
