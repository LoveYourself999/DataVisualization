package Analysis;

public class Analysis_Data {

    private int year;
    private double value;
    private String method;
    private String unit;

    private String des;


    public Analysis_Data(int year, double value, String method, String unit, String des) {
        this.year = year;
        this.value = value;
        this.method = method;
        this.unit = unit;
        this.des = des;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
