package Test;

import Data_fetcher.Data_Fetcher;
import org.junit.Test;

import static org.junit.Assert.*;

public class Forest_MethodTest{

    @Test
    public void initialize_Des_List_00() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"Forest Method","Pie Chart");
        assertTrue(df.getMethod().returnAnalysisInfo().equals("Forest_Method"));
        assertTrue(df.getMethod().getChartHashMap().containsKey("Pie Chart"));
    }


    @Test
    public void add_to_chart_00() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"Forest Method","Pie Chart");
        df.add_new_chart("Pie Chart");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Pie Chart"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1);
    }

    @Test
    public void add_to_chart_01() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"Forest Method","Pie Chart");
        df.add_new_chart("Pie Chart");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Pie Chart"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1);
    }

    @Test
    public void add_to_chart_02() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"Forest Method","Pie Chart");
        df.add_new_chart("Pie Chart");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Pie Chart"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1);
    }

    @Test
    public void add_to_chart_03() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"Forest Method","Pie Chart");
        df.add_new_chart("Pie Chart");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Pie Chart"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1); // Duplicate chart is not added.
    }



    @Test
    public void remove_Chart_00() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"Forest Method","Pie Chart");
        df.remove_chart("Pie Chart");
        assertFalse(df.getMethod().getChartHashMap().containsKey("Pie Chart"));
        assertTrue(df.getMethod().getChartHashMap().isEmpty()); //After removing the chart, the map is empty
    }

    @Test
    public void remove_Chart_01() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"Forest Method","Pie Chart");
        df.add_new_chart("Pie Chart");
        df.remove_chart("Report");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Pie Chart"));
        assertFalse(df.getMethod().getChartHashMap().containsKey("Report"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1);
    }

    @Test
    public void remove_Chart_02() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"Forest Method","Pie Chart");
        df.add_new_chart("Pie Chart");
        df.remove_chart("Report");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Pie Chart"));
        assertFalse(df.getMethod().getChartHashMap().containsKey("Report"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1);
    }

    @Test
    public void remove_Chart_03() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"Forest Method","Pie Chart");
        df.add_new_chart("Pie Chart");
        df.remove_chart("Report");
        assertTrue(df.getMethod().getChartHashMap().containsKey("Pie Chart"));
        assertFalse(df.getMethod().getChartHashMap().containsKey("Report"));
        assertTrue(df.getMethod().getChartHashMap().size() == 1);
    }

    @Test
    public void remove_Chart_04() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"Forest Method","Pie Chart");
        df.add_new_chart("Pie Chart");
        df.remove_chart("Pie Chart");
        assertFalse(df.getMethod().getChartHashMap().containsKey("Pie Chart"));
        assertTrue(df.getMethod().getChartHashMap().size() == 0);
    }

    @Test
    public void remove_Chart_05() {
        Data_Fetcher df = new Data_Fetcher("CHN",2001,2020,"Forest Method","Pie Chart");
        df.add_new_chart("Pie Chart");
        df.remove_chart("Pie Chart");
        assertFalse(df.getMethod().getChartHashMap().containsKey("Pie Chart"));
        assertTrue(df.getMethod().getChartHashMap().size() == 0);
    }


}