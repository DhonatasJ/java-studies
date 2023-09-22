package Emp;

public class Pgto {
    private String name;
    private int hours;
    private double valuePerHour;
    private double addCharge;

    public Pgto() {
    }

    public Pgto(String name, int hours, double valuePerHour, double addCharge) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
        this.addCharge = addCharge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double getAddCharge() {
        return addCharge;
    }

    public void setAddCharge(double addCharge) {
        this.addCharge = addCharge;
    }

    public double payment() {
        if (addCharge > 0) {
            return hours * valuePerHour + addCharge;
        } else {
            return hours * valuePerHour;
        }
    }
}
