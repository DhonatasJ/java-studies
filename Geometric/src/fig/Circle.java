package fig;

public class Circle implements FiguraGeo {
    private Double cValor;

    public Circle(Double cValor){
        this.cValor = cValor;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(cValor, 2);
    }

    public Double getcValor() {
        return cValor;
    }

    public void setcValor(Double cValor) {
        this.cValor = cValor;
    }

}
