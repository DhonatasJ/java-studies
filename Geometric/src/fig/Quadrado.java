package fig;

public class Quadrado implements FiguraGeo {
    private int qValor;

    public Quadrado(int qValor){
        this.qValor = qValor;
    }

    public double calcularArea() {
        return qValor * qValor;

    }

    public int getqValor() {
        return qValor;
    }

    public void setqValor(int qValor) {
        this.qValor = qValor;
    }
}
