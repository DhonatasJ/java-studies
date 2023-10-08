package RulesAndData;

public class Data {
    private String name;
    private double anualIncome;
    private double healthExpenditures;
    private int numberOfEmp;

    public Data() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public int getNumberOfEmp() {
        return numberOfEmp;
    }

    public void setNumberOfEmp(int numberOfEmp) {
        this.numberOfEmp = numberOfEmp;
    }
}