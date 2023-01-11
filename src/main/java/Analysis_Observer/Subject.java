package Analysis_Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private String state;

    private HashMap<String,ArrayList> stored_Data;

    private ArrayList<String> method_list;

    public String getState() {
        return state;
    }

    public HashMap<String, ArrayList> setState(String state, int startYear, int endYear) {
        this.state = state;
        return notifyAllObservers(state,startYear,endYear);
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

//    public List notifyAllObservers(String country,int startYear,int endYear){
//        List<List<Api_Data>> listOfLists = new ArrayList<List<Api_Data>>();
//        for (Observer observer : observers) {
//            stored_Data.put(observer.getMethod(),observer.update(country,startYear,endYear));
//            //listOfLists.add(observer.update(country,startYear,endYear));
//        }
//        int year =endYear;
//        List<Api_Data> return_string = new ArrayList<>();
//        for(int i =0;i<listOfLists.get(0).size() ; i++)
//        {
//            stored_Data.put(listOfLists.get(0).get(i));
//            for(int j = 0 ; j< listOfLists.size();j++)
//            {
//                return_string.add(listOfLists.get(j).get(i));
//            }
//        }
//        return listOfLists;
//    }

    public HashMap<String, ArrayList> notifyAllObservers(String country, int startYear, int endYear){
        List<List<Api_Data>> listOfLists = new ArrayList<List<Api_Data>>();
        method_list = new ArrayList<>();
        stored_Data = new HashMap<>();
        for (Observer observer : observers) {
            method_list.add(observer.getObserverDes());
            stored_Data.put(observer.getObserverDes(),observer.update(country,startYear,endYear));
            //listOfLists.add(observer.update(country,startYear,endYear));
        }

        return stored_Data;
    }

    public ArrayList<String> getMethod_list() {
        return method_list;
    }
}