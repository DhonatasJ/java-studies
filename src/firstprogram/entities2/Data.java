package firstprogram.entities2;

public class Data {
    public String name;
    public Double salary;
    public Double tax;
    public Double percentage;

    public double calculateTax(){
        return salary - tax;
    }

    public void addPercentage(){
        this.salary = salary + (salary * percentage / 100);
    }

    public String toString(){
        return "Name: " + name + "\nSalary " + String.format("%.2f", calculateTax());
    }
}
