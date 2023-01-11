package Test;

import Data_fetcher.Data_Fetcher;
import org.junit.Test;

import static org.junit.Assert.*;

public class PM25_Forest_MethodTest{

    @Test
    public void initialize_Des_List_00() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"PM25 Forest Method","Report");
        assertTrue(df.getMethod().returnAnalysisInfo().equals("PM25_Forest_Method"));
        assertTrue(df.getMethod().getChartHashMap().containsKey("Report"));
    }


    @Test
    public void add_to_chart_00() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"PM25 Forest Method","Report");
        df.add_new_chart("Line Chart");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Line Chart"));
        assertTrue(df.getMethod().getChartHashMap().size() == 2);
    }

    @Test
    public void add_to_chart_01() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"PM25 Forest Method","Report");
        df.add_new_chart("Scatter Chart");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Scatter Chart"));
        assertTrue(df.getMethod().getChartHashMap().size() == 2);
    }

    @Test
    public void add_to_chart_02() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"PM25 Forest Method","Report");
        df.add_new_chart("Bar Chart");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Bar Chart"));
        assertTrue(df.getMethod().getChartHashMap().size() == 2);
    }

    @Test
    public void add_to_chart_03() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"PM25 Forest Method","Report");
        df.add_new_chart("Report");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Report"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1); // Duplicate chart is not added.
    }



    @Test
    public void remove_Chart_00() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"PM25 Forest Method","Report");
        df.remove_chart("Report");
        assertFalse(df.getMethod().getChartHashMap().containsKey("Report"));
        assertTrue(df.getMethod().getChartHashMap().isEmpty()); //After removing the chart, the map is empty
    }

    @Test
    public void remove_Chart_01() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"PM25 Forest Method","Report");
        df.add_new_chart("Line Chart");
        df.remove_chart("Report");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Line Chart"));
        assertFalse(df.getMethod().getChartHashMap().containsKey("Report"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1);
    }

    @Test
    public void remove_Chart_02() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"PM25 Forest Method","Report");
        df.add_new_chart("Bar Chart");
        df.remove_chart("Report");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Bar Chart"));
        assertFalse(df.getMethod().getChartHashMap().containsKey("Report"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1);
    }

    @Test
    public void remove_Chart_03() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"PM25 Forest Method","Report");
        df.add_new_chart("Scatter Chart");
        df.remove_chart("Report");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Scatter Chart"));
        assertFalse(df.getMethod().getChartHashMap().containsKey("Report"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1);
    }

    @Test
    public void remove_Chart_04() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"PM25 Forest Method","Report");
        df.add_new_chart("Report");
        df.remove_chart("Report");
        assertFalse(df.getMethod().getChartHashMap().containsKey("Report"));
        assertTrue(df.getMethod().getChartHashMap().size() == 0);
    }

    @Test
    public void remove_Chart_05() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"PM25 Forest Method","Report");
        df.add_new_chart("Scatter Chart");
        df.remove_chart("Scatter Chart");
        assertFalse(df.getMethod().getChartHashMap().containsKey("Scatter Chart"));
        assertTrue(df.getMethod().getChartHashMap().containsKey("Report"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1);
    }

}