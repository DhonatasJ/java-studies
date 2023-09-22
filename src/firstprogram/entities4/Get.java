package firstprogram.entities4;

public class Get {
    public double dollar;
    public double qtd;

    public double result;

    public void Liquid(){
        this.result = (this.dollar * this.qtd) + ((this.dollar * this.qtd / 100) * 6);
    }

    public String toString(){
        return "Voce tera que pagar $" + result;
    }
 }
