package Analysis;

import ViewerFactory.Chart;

import javax.swing.*;
import java.util.HashMap;

public interface AnalysisStrategy {
    void analyze();
    void add_to_chart(Chart chart);

    void remove_Chart(Chart chart);
    String return_name();
    String returnAnalysisInfo();
    void displayChart();
    void returnPanel(JPanel west);

    HashMap<String, Chart> getChartHashMap();

}
