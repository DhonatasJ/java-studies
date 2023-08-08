package vect.entities;

public class Prod {

    private String name;
    private double price;

    public Prod(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){return price;}

    public void setPrice(double price){
        this.price = price;
    }
}
