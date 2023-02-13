package ViewerFactory;

import Analysis.Analysis_Data;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Report implements Chart{

    private String type =  "Report";

    private JScrollPane return_chart;
    public Report() {
    }
//
//    @Override
//    public void draw(HashMap<String, ArrayList<Analysis_Data>> transferred_data, String analysisInfo, ArrayList<String> method_list) {
//
//        HashMap<String,ArrayList<Analysis_Data>> result = transferred_data;
//        StringBuilder sb = new StringBuilder();
//        sb.append( analysisInfo + "\n" + "==============================\n");
//        System.out.println(method_list.get(0));
//        int size = result.get(method_list.get(0)).size();
//
//        for(int i =0;i<size; i++)
//        {
//            sb.append("Year " + result.get(method_list.get(0)).get(i).getYear() + ": \n");
//            for(int j = 0 ; j< result.size();j++)
//            {
//                sb.append("\t\t\t" + result.get(method_list.get(j)).get(i).getDes() + " ==> \t");
//                sb.append(result.get(method_list.get(j)).get(i).getValue() + "\n");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        System.out.println("Report completed");
//    }

    @Override
    public void draw(HashMap<String, ArrayList<Analysis_Data>> transferred_data, String analysisInfo, ArrayList<String> method_list) {

        HashMap<String,ArrayList<Analysis_Data>> result = transferred_data;
        StringBuilder sb = new StringBuilder();
        sb.append( analysisInfo + "\n" + "==============================\n");
        int size = result.get(method_list.get(0)).size();

        for(int i =0;i<size; i++)
        {
            sb.append("Year " + result.get(method_list.get(0)).get(i).getYear() + ": \n");
            for(int j = 0 ; j< result.size();j++)
            {
                sb.append("\t" + result.get(method_list.get(j)).get(i).getDes() + " ==> \t");
                sb.append(result.get(method_list.get(j)).get(i).getValue() + "\n");
            }
            sb.append("\n");
        }
        JTextArea report = new JTextArea();
        report.setEditable(false);
        report.setPreferredSize(new Dimension(400, 300));
        report.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        report.setBackground(Color.white);
        String reportMessage;
        reportMessage = sb.toString();
        System.out.println(reportMessage);
        report.setText(reportMessage);
        JScrollPane outputScrollPane = new JScrollPane(report);
        return_chart = outputScrollPane;
        //System.out.println(sb);
        System.out.println("Report completed");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
