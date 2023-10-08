package fig;

public class CalcularArea {

    public double somarCandQ(FiguraGeo figuraA, FiguraGeo figuraB){
        double calc = figuraA.calcularArea() + figuraB.calcularArea();
        return calc;
    }
}
