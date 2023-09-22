package testes.entities;

public class Hirer {
    private int id;
    private String name;
    private double salary;
    private int idSelect;
    private double porcent;

    public Hirer(int id, String name, double salary, int idSelect, double porcent){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.idSelect = idSelect;
        this.porcent = porcent;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void addPorcentage(){
        if (this.idSelect == this.id){
            this.salary += (this.salary * this.porcent) / 100;
        }
    }

}
