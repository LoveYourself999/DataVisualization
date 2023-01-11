package ViewerFactory;

import Analysis.Analysis_Data;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Line_Chart implements Chart{

    private String type = "Line Chart";

    private ChartPanel return_chart;

    @Override
    public void draw(HashMap<String, ArrayList<Analysis_Data>> transferred_data, String analysisInfo, ArrayList<String> method_list){
        System.out.println("Line_Chart");
        ArrayList<XYSeries> series = new ArrayList<>();
        XYSeriesCollection dataset = new XYSeriesCollection();
        StringBuilder sb = new StringBuilder();
        sb.append(method_list.get(0));
        for (int i = 0;i<method_list.size();i++)
        {
            series.add(new XYSeries(method_list.get(i)));
            ArrayList<Analysis_Data> temp_date = transferred_data.get(method_list.get(i));
            if(i>0) {
                sb.append(" & " + method_list.get(i));
            }
            for(int j = 0;j<temp_date.size();j++)
            {
                series.get(i).add(temp_date.get(j).getYear(),temp_date.get(j).getValue());
            }
            dataset.addSeries(series.get(i));
        }
        JFreeChart chart = ChartFactory.createXYLineChart(sb.toString(), "Year", "", dataset,
                PlotOrientation.VERTICAL, true, true, false);

        XYPlot plot = chart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(
                new TextTitle(sb.toString(), new Font("Serif", java.awt.Font.BOLD, 18)));

        ChartPanel chartPanel = new ChartPanel(chart);
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
