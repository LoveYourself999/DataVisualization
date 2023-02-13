package Analysis_Observer;

public class Api_Data {
    private int year;
    private double value;
    private String method;


    public Api_Data(int year, double value ,String method) {
        this.method = method;
        this.year = year;
        this.value = value;
    }


    public int getYear() {
        return year;
    }

    public double getValue() {
        return value;
    }

    public String getMethod() {
        return method;
    }
}
