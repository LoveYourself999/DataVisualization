package GetData;

import java.util.Vector;

public class GetMethodList {
    private static Vector<String> MethodList = new Vector<String>();
    private static GetMethodList Get_MethodList_instance;

    public static GetMethodList getInstance() {
        if (Get_MethodList_instance == null) {
            Get_MethodList_instance = new GetMethodList();
            setMethodList();
        }
        return Get_MethodList_instance;
    }




    public static void setMethodList() {
        MethodList.add("CO2 Energy PM25 Method");
        MethodList.add("CO2 GDP Method");
        MethodList.add("Education Percent GDP And Health Method");
        MethodList.add("Education Percent GDP Method");
        MethodList.add("Forest Method");
        MethodList.add("Health Expenditure Hospital Bed Method");
        MethodList.add("PM25 Forest Method");
        MethodList.add("Problem Access Health Women Mortality Method");
    }

    public Vector<String> getMethodList() {
        return MethodList;
    }
}
