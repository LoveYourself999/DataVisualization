package ViewerFactory;

import Analysis.Analysis_Data;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public interface Chart {
    void draw(HashMap<String, ArrayList<Analysis_Data>> transferred_data, String analysisInfo, ArrayList<String> method_list);
    String returnType();

    Component getReturn_chart();
}
