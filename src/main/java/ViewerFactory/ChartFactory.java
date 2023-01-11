package ViewerFactory;

public class ChartFactory {

//    public Chart getChart(String ChartType)
//    {
//        if(ChartType == null){
//            return null;
//        }
//        if(ChartType.equalsIgnoreCase("Report")){
//            return new Report();
//        } else if(ChartType.equalsIgnoreCase("Line_Chart")){
//            return null;
//        }
//        return null;
//    }

    public Chart getChart(String ChartType)
    {
        if(ChartType == null){
            return null;
        }
        if(ChartType.equalsIgnoreCase("Report")){
            return new Report();
        } else if(ChartType.equalsIgnoreCase("Line Chart")){
            return new Line_Chart();
        } else if (ChartType.equalsIgnoreCase("Scatter Chart")) {
            return new Scatter_chart();
        } else if (ChartType.equalsIgnoreCase("Pie Chart")) {
            return new Pie_Chart();
        } else if (ChartType.equalsIgnoreCase("Bar Chart")) {
            return new Bar_Chart();
        }
        return null;
    }


}
