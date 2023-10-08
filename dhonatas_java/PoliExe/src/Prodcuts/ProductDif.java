package Prodcuts;

import java.util.Date;

public class ProductDif extends Product {
    public double curstomsFee;
    public Date manufacture;
    public ProductDif() {
    }
    public double getCurstomsFee() {
        return curstomsFee;
    }
    public void setCurstomsFee(double curstomsFee) {
        this.curstomsFee = curstomsFee;
    }
    public Date getManufacture() {
        return manufacture;
    }
    public void setManufacture(Date manufacture) {
        this.manufacture = manufacture;
    }

    public double taxPrice(){
        return curstomsFee + getPrice();
    }

    @Override
    public String toString() {
        return "ProductDif [curstomsFee=" + curstomsFee + "]";
    }

    

}
