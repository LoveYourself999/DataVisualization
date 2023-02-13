package Test;

import GetData.GetCountryList;
import GetData.GetMethodList;
import GetData.GetRejectedCountryList;
import GetData.GetRejectedYearList;
import org.junit.Test;

import java.util.Vector;

public class getDataTest {

    @Test
    public void getData_00(){
        GetCountryList getCountryList = GetCountryList.getInstance();
        String name = getCountryList.findCountryCode("Canada");
    }

    @Test
    public void getData_01(){
        GetMethodList getMethodList = GetMethodList.getInstance();
    }

    @Test
    public void getData_02(){
        GetRejectedCountryList getRejectedCountryList = GetRejectedCountryList.getInstance();
        Vector<String> name = getRejectedCountryList.getCountriesNames();
    }

    @Test
    public void getData_03(){
        GetRejectedYearList getRejectedYearList = GetRejectedYearList.getInstance();
        Boolean a = getRejectedYearList.checkYearAndMethod(2001, 2002, "Forest MethodTest");
    }
}