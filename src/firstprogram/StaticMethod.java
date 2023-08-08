package firstprogram;

import firstprogram.utill.Calculator;
import java.util.Scanner;


public class StaticMethod {
    public static final double PI = 3.14159;
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circum: %.2f%n", c);
        System.out.printf("Vol: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculator.PI);

        scanner.close();
    }

}
