import fig.CalcularArea;
import fig.Circle;
import fig.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle(3.5);
        Quadrado quadrado = new Quadrado(4);
        CalcularArea calcularArea = new CalcularArea();

        System.out.println(calcularArea.somarCandQ(
            circle, quadrado));
        // double c = circle.calcularArea();
        // double q = quadrado.calcularArea();

       // System.out.format("Circle: %.2f \nQuadrado: %.2f", c, q);

    }
}
